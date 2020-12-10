package kr.ac.yonsei.FHIRCoder;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Extension;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.util.ElementUtil;

import org.hl7.fhir.instance.model.api.IBaseDatatype;
import org.hl7.fhir.r4.formats.IParser;
import org.hl7.fhir.r4.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * KISA 2020 BlockChain project
 * FHIR profiling
 * 진료비계산서.영수증
 * Authored by Jaehoon Lee
 * 2020-07-24
 * 
 * 항목:
// 환자 등록번호	ExplanationOfBenefit	patient.identifier
// 환자 성명	Patient	name
// 환자구분	ExplanationOfBenefit	insurance
// 진료과목	ExplanationOfBenefit	serviceProvider.Organization
// 질병군 번호	PaymentNotice	extension
// 야간진료	PaymentNotice	extension
// 병실	ExplanationOfBenefit	facility
// 진료기간	ExplanationOfBenefit	supportingInfo
// 영수증번호	PaymentNotice	identifier
// 요양기관종류	PaymentNotice	provider
// 사업자등록번호	Organization	identifier
// 사업장 소재지	Organization	address
// 전화번호	Organization	telecom
// 카드번호	PaymentReconciliation	detail.type
// 카드종류	PaymentReconciliation	detail.type
// 유효기간	PaymentReconciliation	detail.type
// 할부	PaymentReconciliation	detail.type
// 가맹점번호	PaymentReconciliation	detail.type
// 승인번호	PaymentReconciliation	detail.type
// 결제금액	PaymentReconciliation	paymentAmount
// 수납일자	PaymentReconciliation	paymentDate

// 진찰료		item.productOrService
// 입원료 1인실	item.productOrService
// 입원료 2인실	item.productOrService
// 입원료 3인실	item.productOrService
// 식대		item.productOrService
// 투약 및 조제료	행위료	item.productOrService
// 약품비	item.productOrService
// 주사료	행위료	item.productOrService
// 약품비	item.productOrService
// 마취료		item.productOrService
// 처치 및 수술료		item.productOrService
// 검사료		item.productOrService
// 영상진단료		item.productOrService
// 방사선 치료료		item.productOrService
// 치료재료대		item.productOrService
// 재활 및 물리치료료		item.productOrService
// 정신요법료		item.productOrService
// 전혈 및 혈액성분제제료		item.productOrService
// CT 진단료		item.productOrService
// MRI 진단료		item.productOrService
// PET 진단료		item.productOrService
// 초음파 진단료		item.productOrService
// 보철, 교정료		item.productOrService
// 진단서 및 제증명료		item.productOrService
// 보조기		item.productOrService
// 건강검진료		item.productOrService
// 의료질평가지원금		item.productOrService
// 기타		item.productOrService
 */

@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class ProofOfPaymentDSCH_samsung extends Composition {
	
   private static final long serialVersionUID = 1L;

   /**
    * Each extension is defined in a field. Any valid HAPI Data Type
    * can be used for the field type. Note that the [name=""] attribute
    * in the @Child annotation needs to match the name for the bean accessor
    * and mutator methods.
    */

   @Child(name = "eob")   
	@Extension(url = "http://yonsei.ac.kr/eob", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Explanation of Benefit")
	private org.hl7.fhir.r4.model.Extension eob;
	
	public org.hl7.fhir.r4.model.Extension getEob() {
	    if (eob == null) 
	    	eob = new org.hl7.fhir.r4.model.Extension();
		return eob;
	}
	
	public void setEob(org.hl7.fhir.r4.model.Extension eob) {
		this.eob = eob;
	}


	@Child(name = "paidbypatient")   
	@Extension(url = "http://yonsei.ac.kr/paidbypatient", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Amount paid by patient")
	private org.hl7.fhir.r4.model.Extension paidbypatient;
	
	public org.hl7.fhir.r4.model.Extension getPaidbypatient() {
	    if (paidbypatient == null) 
	    	paidbypatient = new org.hl7.fhir.r4.model.Extension();
		return paidbypatient;
	}
	
	public void setPaidbypatient(org.hl7.fhir.r4.model.Extension paidbypatient) {
		this.paidbypatient = paidbypatient;
	}

	@Child(name = "paidtotal")   
	@Extension(url = "http://yonsei.ac.kr/paidtotal", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Amount paid total")
	private org.hl7.fhir.r4.model.Extension paidtotal;
	
	public org.hl7.fhir.r4.model.Extension getPaidtotal() {
		return paidtotal;
	}

	public void setPaidtotal(org.hl7.fhir.r4.model.Extension paidtotal) {
		this.paidtotal = paidtotal;
	}


	@Child(name = "paidbycreditcard")   
	@Extension(url = "http://yonsei.ac.kr/paidbycreditcard", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Amount paid by credit card")
	private org.hl7.fhir.r4.model.Extension paidbycreditcard;
	
	public org.hl7.fhir.r4.model.Extension getPaidbycreditcard() {
		return paidbycreditcard;
	}

	public void setPaidbycreditcard(org.hl7.fhir.r4.model.Extension paidbycreditcard) {
		this.paidbycreditcard = paidbycreditcard;
	}

	@Override
	public boolean isEmpty() {
		return super.isEmpty() && ElementUtil.isEmpty(paidbypatient, eob, paidtotal, paidbycreditcard);
	}
}