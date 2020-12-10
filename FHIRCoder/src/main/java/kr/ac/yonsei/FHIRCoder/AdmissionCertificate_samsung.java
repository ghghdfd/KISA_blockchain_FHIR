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
//	 * 생년월일: Composition.subject.Patient.Birthdate
//   * 등록번호: Composition.subject.Patient.id
//   * 성별 : Composition.subject.Patient.gender
//   * 연령 : ???
//   * 성별 : Composition.subject.Patient.address
//	 * 발행번호: Composition.id
//	 * 발행일: Composition.date
//	 * 진료과: Composition.extension.Department
//   * 진단명: Composition.extension.Diagnosis
//   * 한국질병분류기호: Composition.extension.KCD
//	 * 입원기간: Composition.extension.AdmissionPeriod
//   * 일수: Composition.extension.AdmissionDay
//   * 상태: Composition.extension.State
//   * 일수: Composition.extension.AdmissionPeriod
//   * 비고: Composition.extension.Remark
//   * 용도: Composition.extension.Perpose
//   * 내용: Composition.extension.Content
//   * 의사성명: Composition.extension.Providername
//   * 면허번호: Composition.extension.Certification
//	 */


@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class AdmissionCertificate_samsung extends Composition {
	
   private static final long serialVersionUID = 1L;

   /**
    * Each extension is defined in a field. Any valid HAPI Data Type
    * can be used for the field type. Note that the [name=""] attribute
    * in the @Child annotation needs to match the name for the bean accessor
    * and mutator methods.
    */
 
	@Child(name = "Department")   
	@Extension(url = "http://yonsei.ac.kr/Department", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Department")
	private org.hl7.fhir.r4.model.Extension Department;
	
	public org.hl7.fhir.r4.model.Extension getDepartment() {
		return Department;
	}

	public void setDepartment(org.hl7.fhir.r4.model.Extension Department) {
		this.Department = Department;
	}

	@Child(name = "Diagnosis")   
	@Extension(url = "http://yonsei.ac.kr/Diagnosis", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Name of Diagnosis")
	private org.hl7.fhir.r4.model.Extension Diagnosis;
	
	public org.hl7.fhir.r4.model.Extension getDiagnosis() {
		return Diagnosis;
	}

	public void setDiagnosis(org.hl7.fhir.r4.model.Extension Diagnosis) {
		this.Diagnosis = Diagnosis;
	}


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
	
	@Child(name = "AdmissionDay")   
	@Extension(url = "http://yonsei.ac.kr/AdmissionDay", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Days of admission")
	private org.hl7.fhir.r4.model.Extension AdmissionDay;
	
	public org.hl7.fhir.r4.model.Extension getAdmissionDay() {
		return AdmissionDay;
	}

	public void setAdmissionDay(org.hl7.fhir.r4.model.Extension AdmissionDay) {
		this.AdmissionDay = AdmissionDay;
	}
	
	@Child(name = "State")   
	@Extension(url = "http://yonsei.ac.kr/State", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "State")
	private org.hl7.fhir.r4.model.Extension State;
	
	public org.hl7.fhir.r4.model.Extension getState() {
		return State;
	}

	public void setState(org.hl7.fhir.r4.model.Extension State) {
		this.State = State;
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
		return super.isEmpty() && ElementUtil.isEmpty(Diagnosis,KCD,Department,AdmissionPeriod,AdmissionDay,
				State,Remark,Providername,Certification);
	}
}