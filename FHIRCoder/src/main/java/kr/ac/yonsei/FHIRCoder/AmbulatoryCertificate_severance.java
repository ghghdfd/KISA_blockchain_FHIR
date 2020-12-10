package kr.ac.yonsei.FHIRCoder;

import org.hl7.fhir.r4.model.Composition;
import org.hl7.fhir.r4.model.Condition;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Extension;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.util.ElementUtil;

//
//* 항목:
//	 * 환자성명: Composition.subject.Patient
//	 * 주민등록번호: Composition.subject.Patient.Identifier
//   * 주소 : Composition.subject.Patient.Adress
//	 * 발행번호: Composition.id
//	 * 발행일: Composition.date
//	 * 외래/입원: Composition.subject.Encounter
//	 * 진단의 확실성: Composition.extension.Certainty
//	 * 진단명: Composition.extension.Diagnosis
//	 * 수술명: Composition.extension.Procedure
//	 * 진료과: Composition.extension.Department
//   * 면허번호: Composition.extension.Certification
//   * 의사성명: Composition.extension.Providername
//	 */


@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class AmbulatoryCertificate_severance extends Composition {
	
   private static final long serialVersionUID = 1L;

   /**
    * Each extension is defined in a field. Any valid HAPI Data Type
    * can be used for the field type. Note that the [name=""] attribute
    * in the @Child annotation needs to match the name for the bean accessor
    * and mutator methods.
    */
 

	@Child(name = "Certainty")   
	@Extension(url = "http://yonsei.ac.kr/Certainty of diagnosis", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Certainty of diagnosis")
	private org.hl7.fhir.r4.model.Extension Certainty;
	
	public org.hl7.fhir.r4.model.Extension getCertainty() {
		return Certainty;
	}

	public void setCertainty(org.hl7.fhir.r4.model.Extension Certainty) {
		this.Certainty = Certainty;
	}
	
	
	@Child(name = "Diagnosis")   
	@Extension(url = "http://yonsei.ac.kr/Diagnosis", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Name of diagnosis")
	private org.hl7.fhir.r4.model.Extension Diagnosis;
	
	public org.hl7.fhir.r4.model.Extension getcondition() {
	    if (Diagnosis == null) 
	    	Diagnosis = new org.hl7.fhir.r4.model.Extension();
		return Diagnosis;
	}
	
	public void setcondition(org.hl7.fhir.r4.model.Extension Diagnosis) {
		this.Diagnosis = Diagnosis;
	}
//



	@Child(name = "Procedure")   
	@Extension(url = "http://yonsei.ac.kr/Procedure", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Name of procedure")
	private org.hl7.fhir.r4.model.Extension Procedure;
	
	public org.hl7.fhir.r4.model.Extension getProcedure() {
		return Procedure;
	}

	public void setProcedure(org.hl7.fhir.r4.model.Extension Procedure) {
		this.Procedure = Procedure;
	}

	@Child(name = "Department")   
	@Extension(url = "http://yonsei.ac.kr/Department", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Department of provider")
	private org.hl7.fhir.r4.model.Extension Department;
	
	public org.hl7.fhir.r4.model.Extension getProvider() {
		return Department;
	}

	public void setProvider(org.hl7.fhir.r4.model.Extension Department) {
		this.Department = Department;
	}
	
	@Child(name = "Providername")   
	@Extension(url = "http://yonsei.ac.kr/Providername", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Name of provider")
	private org.hl7.fhir.r4.model.Extension Providername;
	
	public org.hl7.fhir.r4.model.Extension getProvidername() {
		return Providername;
	}

	public void setProvidername(org.hl7.fhir.r4.model.Extension Providername) {
		this.Providername = Providername;
	}	


	@Child(name = "Certification")   
	@Extension(url = "http://yonsei.ac.kr/Certification", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Number of certification")
	private org.hl7.fhir.r4.model.Extension Certification;
	
	public org.hl7.fhir.r4.model.Extension getCertification() {
		return Certification;
	}

	public void setCertification(org.hl7.fhir.r4.model.Extension Certification) {
		this.Certification = Certification;
	}
		
	@Override
	public boolean isEmpty() {
		return super.isEmpty() && ElementUtil.isEmpty(Diagnosis,Certainty,Procedure,Department,Certification,Providername);
	}

	public void setStatus(Condition con) {
		// TODO Auto-generated method stub
		
	}
}