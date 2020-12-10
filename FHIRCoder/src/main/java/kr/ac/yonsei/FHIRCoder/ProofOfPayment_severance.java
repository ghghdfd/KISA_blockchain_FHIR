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
 * 진료비 납입증명서(연말정산용)
 * Authored by Jaehoon Lee
 * 2020-07-01
 * 
 * 항목:
 * 환자성명: Composition.subject.Patient
 * 주민등록번호: Composition.subject.Patient.id
 * 발행번호: Composition.id
 * 수납일자: Composition.date
 * 외래/입원: Composition.subject.Encounter
 * 진료비 총액: Composition.extension.paidtotal
 * 급여: Composition.extension.paidbyplan
 * 비급여: Composition.extension.paidbypatient
 * 신용카드소득공제: Composition.extension.paidbycreditcard
 */
@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class ProofOfPayment_severance extends Composition {
	
   private static final long serialVersionUID = 1L;

   /**
    * Each extension is defined in a field. Any valid HAPI Data Type
    * can be used for the field type. Note that the [name=""] attribute
    * in the @Child annotation needs to match the name for the bean accessor
    * and mutator methods.
    */

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

	@Child(name = "paidbyplan")   
	@Extension(url = "http://yonsei.ac.kr/paidbyplan", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Amount paid by plan")
	private org.hl7.fhir.r4.model.Extension paidbyplan;
	
	public org.hl7.fhir.r4.model.Extension getPaidbyplan() {
	    if (paidbyplan == null) 
	    	paidbyplan = new org.hl7.fhir.r4.model.Extension();
		return paidbyplan;
	}
	
	public void setPaidbyplan(org.hl7.fhir.r4.model.Extension paidbyplan) {
		this.paidbyplan = paidbyplan;
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
		return super.isEmpty() && ElementUtil.isEmpty(paidbypatient, paidbyplan, paidtotal, paidbycreditcard);
	}
}