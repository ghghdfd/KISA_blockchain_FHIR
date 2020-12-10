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
 * 진료비 납입증명서
 * Authored by Jaehoon Lee
 * 2020-07-20
 * 
 * 항목:
 * 환자성명: Composition.subject.Patient
 * 주민등록번호: Composition.subject.Patient.id
 * 발행번호: Composition.id
 * 발행일자: Composition.date
 * 수납일자: Composition.extension.dateofcashreceive
 * 진료과 : Composition.extension.Department
 * 진료비 총액: Composition.extension.paidtotal
 * 조합부담액: Composition.extension.paidbyplan
 * 급여 중 본인부담: Composition.extension.paidbypatientinplan
 * 비급여: Composition.extension.paidbypatient
 * 신용카드소득공제: Composition.extension.paidbycreditcard
 * 선택진료료: Composition.extension.optionalexpenses
 * 영수액 : Composition.extension.receipt
 **/
@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class ProofOfPayment_notax_severance extends Composition {
	
   private static final long serialVersionUID = 1L;

   /**
    * Each extension is defined in a field. Any valid HAPI Data Type
    * can be used for the field type. Note that the [name=""] attribute
    * in the @Child annotation needs to match the name for the bean accessor
    * and mutator methods.
    */

   
	@Child(name = "dateofcashreceive")   
	@Extension(url = "http://yonsei.ac.kr/dateofcashreceive", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Date of cash received")
	private org.hl7.fhir.r4.model.Extension dateofcashreceive;
	
	public org.hl7.fhir.r4.model.Extension getdateofcashreceive() {
		return dateofcashreceive;
	}

	public void setdateofcashreceive(org.hl7.fhir.r4.model.Extension dateofcashreceive) {
		this.dateofcashreceive = dateofcashreceive;
	}	
	
	@Child(name = "Department")   
	@Extension(url = "http://yonsei.ac.kr/Department", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Department of provider")
	private org.hl7.fhir.r4.model.Extension Department;
	
	public org.hl7.fhir.r4.model.Extension getProvider() {
		return Department;
	}
	public void setdepartment(org.hl7.fhir.r4.model.Extension Department) {
		this.Department = Department;
	
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

	@Child(name = "paidbypatientinplan")   
	@Extension(url = "http://yonsei.ac.kr/paidbyplaninplan", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Amount paid by patient in plan")
	private org.hl7.fhir.r4.model.Extension paidbypatientinplan;
	
	public org.hl7.fhir.r4.model.Extension getpaidbypatientinplan() {
	    if (paidbypatientinplan == null) 
	    	paidbypatientinplan = new org.hl7.fhir.r4.model.Extension();
		return paidbypatientinplan;
	}
	
	public void setpaidbypatientinplan(org.hl7.fhir.r4.model.Extension paidbypatientinplan) {
		this.paidbypatientinplan = paidbypatientinplan;
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


	@Child(name = "Optionalexpenses")   
	@Extension(url = "http://yonsei.ac.kr/Optionalexpenses", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "expenses of optional medical")
	private org.hl7.fhir.r4.model.Extension Optionalexpenses;
	
	public org.hl7.fhir.r4.model.Extension getOptionalexpenses() {
		return Optionalexpenses;
	}

	public void setOptionalexpenses(org.hl7.fhir.r4.model.Extension Optionalexpenses) {
		this.Optionalexpenses = Optionalexpenses;
	}
	
	@Child(name = "receipt")   
	@Extension(url = "http://yonsei.ac.kr/receipt", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "expenses of receipt")
	private org.hl7.fhir.r4.model.Extension receipt;
	
	public org.hl7.fhir.r4.model.Extension getreceipt() {
		return receipt;
	}

	public void setreceipt(org.hl7.fhir.r4.model.Extension receipt) {
		this.receipt = receipt;
	}
	@Override
	public boolean isEmpty() {
		return super.isEmpty() && ElementUtil.isEmpty(dateofcashreceive,Department,paidbypatient, paidbyplan, 
				paidbypatientinplan, paidtotal,Optionalexpenses,receipt);
	}
}