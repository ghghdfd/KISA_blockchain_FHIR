package kr.ac.yonsei.FHIRCoder;

import org.hl7.fhir.r4.model.Composition;
import org.hl7.fhir.r4.model.Condition;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Extension;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.util.ElementUtil;

//* 항목:
//* 발행번호 : Composition.id
//* 환자성명: Composition.subject.Patient
//* 주민등록번호: Composition.subject.Patient.Identifier
//* 주소 : Composition.subject.Patient.Adress
//* 연락처 : Composition.subject.Patient.telecom.phone
//* 발행일: Composition.date
//* 진단의 확실성: Composition.extension.Certainty
//* 주상병: Composition.extension.MainDiagnosis
//* 주상병코드: Composition.extension.MainDiagnosisKCD
//* 부상병: Composition.extension.SubDiagnosis
//* 부상병코드: Composition.extension.SubDiagnosisKCD
//* 발병년월일: Composition.extension.onsetdate
//* 진단년월일: Composition.extension.diagnosisdate
//* 치료내용 및 향후 치료에 대한 소견: Composition.extension.TreatmentContentAndNote
//* 입원일: Composition.extension.AdmissionDate
//* 퇴원일: Composition.extension.DischargeDate
//* 진료과: Composition.extension.Department
//* 입원일자: Composition.extension.admissiondate
//* 퇴원일자: Composition.extension.dischargedate
//* 비고: Composition.extension.Remark
//* 용도: Composition.extension.Perpose
//* 내용: Composition.extension.Content
//* 의사성명: Composition.extension.Providername
//* 면허번호: Composition.extension.Certification
//*/

@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class CertificationOfAdmission_seoul extends Composition {
	
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
	@Description(shortDefinition = "Name of Diagnosis")
	private org.hl7.fhir.r4.model.Extension Diagnosis;
	
	public org.hl7.fhir.r4.model.Extension getDiagnosis() {
	    if (Diagnosis == null) 
	    	Diagnosis = new org.hl7.fhir.r4.model.Extension();
		return Diagnosis;
	}
	
	public void setDiagnosis(org.hl7.fhir.r4.model.Extension Diagnosis) {
		this.Diagnosis = Diagnosis;
	}
//

	@Child(name = "ICD")   
	@Extension(url = "http://yonsei.ac.kr/ICD", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Code of ICD")
	private org.hl7.fhir.r4.model.Extension ICD;
	
	public org.hl7.fhir.r4.model.Extension getICD() {
	    if (ICD == null) 
	    	ICD = new org.hl7.fhir.r4.model.Extension();
		return ICD;
	}
	
	public void setICD(org.hl7.fhir.r4.model.Extension ICD) {
		this.ICD = ICD;
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
	
	
	@Child(name = "Admissiondepartment")   
	@Extension(url = "http://yonsei.ac.kr/Admissiondepartment", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "department of admission")
	private org.hl7.fhir.r4.model.Extension Admissiondepartment;
	
	public org.hl7.fhir.r4.model.Extension getAdmissiondepartment() {
		return Admissiondepartment;
	}
	public void setAdmissiondepartment(org.hl7.fhir.r4.model.Extension Admissiondepartment) {
		this.Admissiondepartment = Admissiondepartment;
	}
	
	
	@Child(name = "Dischargedepartment")   
	@Extension(url = "http://yonsei.ac.kr/Dischargedepartment", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "department of admission")
	private org.hl7.fhir.r4.model.Extension Dischargedepartment;
	
	public org.hl7.fhir.r4.model.Extension getDischargedepartment() {
		return Dischargedepartment;
	}
	public void setDischargedepartment(org.hl7.fhir.r4.model.Extension Dischargedepartment) {
		this.Dischargedepartment = Dischargedepartment;
	}
	
	@Child(name = "AdmissionPeriod")   
	@Extension(url = "http://yonsei.ac.kr/AdmissionPeriod", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Period of admission")
	private org.hl7.fhir.r4.model.Extension AdmissionPeriod;
	
	public org.hl7.fhir.r4.model.Extension getAdmissionPeriod() {
		return AdmissionPeriod;
	}

	public void setAdmissionPeriod(org.hl7.fhir.r4.model.Extension AdmissionPeriod) {
		this.AdmissionPeriod = AdmissionPeriod;
	}

	@Child(name = "Admissiondays")   
	@Extension(url = "http://yonsei.ac.kr/Admissiondays", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "day of admission")
	private org.hl7.fhir.r4.model.Extension Admissiondays;
	
	public org.hl7.fhir.r4.model.Extension getAdmissiondays() {
		return Admissiondays;
	}

	public void setAdmissiondays(org.hl7.fhir.r4.model.Extension Admissiondays) {
		this.Admissiondays = Admissiondays;
	}


	@Override
	public boolean isEmpty() {
		return super.isEmpty() && ElementUtil.isEmpty(Certainty,Diagnosis,AdmissionPeriod,
				Admissiondepartment,Dischargedepartment,Admissiondays,Perpose,Certification,Providername);
	}

	public void setStatus(Condition con) {
		// TODO Auto-generated method stub
		
	}
}