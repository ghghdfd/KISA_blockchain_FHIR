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
//   * 연번호 : Composition.id
//	 * 환자성명: Composition.subject.Patient
//   * 등록번호: Composition.subject.Encounter.id
//	 * 주민등록번호: Composition.subject.Patient.Identifier
//   * 생년월일: Composition.subject.Patient.Birthdate
//   * 주소 : Composition.subject.Patient.Adress
//	 * 발행일: Composition.date
//	 * 진단의 확실성: Composition.extension.Certainty
//   * 진단일: Composition.extension.diagnosisdate
//   * 발병일: Composition.extension.onsetdate
//	 * 진단명: Composition.extension.Diagnosis
//   * 한국표준질병분류기호: Composition.extension.KCD
//	 * 향후 치료의견: Composition.extension.TreatmentContentAndNote
//	 * 비고 : Composition.extension.Remark
//   * 용도 : Composition.extension.Perpose
//   * 면허번호: Composition.extension.Certification
//   * 의사성명: Composition.extension.Providername
//	 */


@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class DoctorNote_samsung extends Composition {
	
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
	
	@Child(name = "KCD")   
	@Extension(url = "http://yonsei.ac.kr/KCD", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "KCD")
	private org.hl7.fhir.r4.model.Extension KCD;
	
	public org.hl7.fhir.r4.model.Extension getKCD() {
		return KCD;
	}

	public void setKCD(org.hl7.fhir.r4.model.Extension KCD) {
		this.KCD = KCD;
	}

	@Child(name = "diagnosisdate")   
	@Extension(url = "http://yonsei.ac.kr/diagnosisdate", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "date of diagnosis")
	private org.hl7.fhir.r4.model.Extension diagnosisdate;
	
	public org.hl7.fhir.r4.model.Extension getdiagnosisdate() {
		return diagnosisdate;
	}

	public void setdiagnosisdate(org.hl7.fhir.r4.model.Extension diagnosisdate) {
		this.diagnosisdate = diagnosisdate;
	}
	
	@Child(name = "onsetdate")   
	@Extension(url = "http://yonsei.ac.kr/onsetdate", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "date of onset")
	private org.hl7.fhir.r4.model.Extension onsetdate;
	
	public org.hl7.fhir.r4.model.Extension getonsetdate() {
		return onsetdate;
	}

	public void setonsetdate(org.hl7.fhir.r4.model.Extension onsetdate) {
		this.onsetdate = onsetdate;
	}

	@Child(name = "TreatmentContentAndNote")   
	@Extension(url = "http://yonsei.ac.kr/TreatmentContentAndNote", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Treatment content and notes")
	private org.hl7.fhir.r4.model.Extension TreatmentContentAndNote;
	
	public org.hl7.fhir.r4.model.Extension getTreatmentContentAndNote() {
		return TreatmentContentAndNote;
	}

	public void setTreatmentContentAndNote(org.hl7.fhir.r4.model.Extension TreatmentContentAndNote) {
		this.TreatmentContentAndNote = TreatmentContentAndNote;
	}
	
	@Child(name = "Remark")   
	@Extension(url = "http://yonsei.ac.kr/Remark", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Content of remark")
	private org.hl7.fhir.r4.model.Extension Remark;
	
	public org.hl7.fhir.r4.model.Extension getRemark() {
		return Remark;
	}

	public void setRemark(org.hl7.fhir.r4.model.Extension Remark) {
		this.Remark = Remark;
	}
	
	@Child(name = "Perpose")   
	@Extension(url = "http://yonsei.ac.kr/Perpose", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Perpose of certificate")
	private org.hl7.fhir.r4.model.Extension Perpose;
	
	public org.hl7.fhir.r4.model.Extension getPerpose() {
		return Perpose;
	}

	public void setPerpose(org.hl7.fhir.r4.model.Extension Perpose) {
		this.Perpose = Perpose;
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
		return super.isEmpty() && ElementUtil.isEmpty(Certainty,Diagnosis,KCD,diagnosisdate,onsetdate,
				TreatmentContentAndNote,Remark,Perpose,Providername,Certification);
	}
	
}