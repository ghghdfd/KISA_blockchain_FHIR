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
//   * 등록번호: Composition.subject.Patient.id
//	 * 주민등록번호: Composition.subject.Patient.Identifier
//	 * 발행일: Composition.date
//	 * 질병분류기호: Composition.extension.KCD
//	 * 처방의 성명: Composition.extension.Providername
//   * 진료과: Composition.extension.Department
//   * 면허종별: Composition.extension.CertificationType 
//   * 면허번호: Composition.extension.Certification 
//	 * 약품명: Composition.extension.medicine
//   * 표준코드: Composition.extension.medicinecode
//   * 본인부담률구분코드: Composition.extension.Paidbypatientcode
//	 * 1회투여량: Composition.extension.dailydose
//   * 1일 투여횟수: Composition.extension.dailydosecount
//   * 총 투약 일수 : Composition.extension.days
//   * 총량 : Composition.extension.totaldose
//   * 용법 및 참고사항 : Composition.extension.Remark
//	 */


@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class Prescription_seoul extends Composition {
	
   private static final long serialVersionUID = 1L;

   /**
    * Each extension is defined in a field. Any valid HAPI Data Type
    * can be used for the field type. Note that the [name=""] attribute
    * in the @Child annotation needs to match the name for the bean accessor
    * and mutator methods.
    */
 	
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
	
	@Child(name = "Department")   
	@Extension(url = "http://yonsei.ac.kr/Department", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Name of Department")
	private org.hl7.fhir.r4.model.Extension Department;
	
	public org.hl7.fhir.r4.model.Extension getDepartment() {
		return Department;
	}
	public void setDepartment(org.hl7.fhir.r4.model.Extension Department) {
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
	
	@Child(name = "CertificationType")   
	@Extension(url = "http://yonsei.ac.kr/CertificationType", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Type of certification")
	private org.hl7.fhir.r4.model.Extension CertificationType;
	
	public org.hl7.fhir.r4.model.Extension getCertificationType() {
		return CertificationType;
	}

	public void setCertificationType(org.hl7.fhir.r4.model.Extension CertificationType) {
		this.CertificationType = CertificationType;
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
	
	@Child(name = "medicinecode")   
	@Extension(url = "http://yonsei.ac.kr/medicinecode", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Code of medicine")
	private org.hl7.fhir.r4.model.Extension medicinecode;
	
	public org.hl7.fhir.r4.model.Extension getmedicinecode() {
		return medicinecode;
	}

	public void setmedicinecode(org.hl7.fhir.r4.model.Extension medicinecode) {
		this.medicinecode = medicinecode;
	}

	@Child(name = "medicine")   
	@Extension(url = "http://yonsei.ac.kr/medicine", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Name of medicine")
	private org.hl7.fhir.r4.model.Extension medicine;
	
	public org.hl7.fhir.r4.model.Extension getmedicine() {
		return medicine;
	}

	public void setmedicine(org.hl7.fhir.r4.model.Extension medicine) {
		this.medicine = medicine;
	}

	@Child(name = "Paidbypatientcode")   
	@Extension(url = "http://yonsei.ac.kr/Paidbypatientcode", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Code of paidbypatient")
	private org.hl7.fhir.r4.model.Extension Paidbypatientcode;
	
	public org.hl7.fhir.r4.model.Extension getPaidbypatientcode() {
		return Paidbypatientcode;
	}

	public void setPaidbypatientcode(org.hl7.fhir.r4.model.Extension Paidbypatientcode) {
		this.Paidbypatientcode = Paidbypatientcode;
	}

	
	@Child(name = "dose")   
	@Extension(url = "http://yonsei.ac.kr/dose", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Amount of 1 dose")
	private org.hl7.fhir.r4.model.Extension dose;
	
	public org.hl7.fhir.r4.model.Extension getdose() {
		return dose;
	}

	public void setdose(org.hl7.fhir.r4.model.Extension dose) {
		this.dose = dose;
	}
	
	@Child(name = "dailydosecount")   
	@Extension(url = "http://yonsei.ac.kr/dailydosecount", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "count of daily dose")
	private org.hl7.fhir.r4.model.Extension dailydosecount;
	
	public org.hl7.fhir.r4.model.Extension getdailydosecount() {
		return dailydosecount;
	}

	public void setdailydosecount(org.hl7.fhir.r4.model.Extension dailydosecount) {
		this.dailydosecount = dailydosecount;
	}	


	@Child(name = "medicationday")   
	@Extension(url = "http://yonsei.ac.kr/medicationday", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "day of medication")
	private org.hl7.fhir.r4.model.Extension medicationday;
	
	public org.hl7.fhir.r4.model.Extension getmedicationday() {
		return medicationday;
	}

	public void setmedicationday(org.hl7.fhir.r4.model.Extension medicationday) {
		this.medicationday = medicationday;
	}
	
	@Child(name = "totaldose")   
	@Extension(url = "http://yonsei.ac.kr/totaldose", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "total amount of medication")
	private org.hl7.fhir.r4.model.Extension totaldose;
	
	public org.hl7.fhir.r4.model.Extension gettotaldose() {
		return totaldose;
	}

	public void settotaldose(org.hl7.fhir.r4.model.Extension totaldose) {
		this.totaldose = totaldose;
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
	
	@Override
	public boolean isEmpty() {
		return super.isEmpty() && ElementUtil.isEmpty(KCD,Department,Providername, CertificationType,Certification,
				medicinecode,medicine,Paidbypatientcode,dose,medicationday, dailydosecount, 
				totaldose,Remark);
	}

}