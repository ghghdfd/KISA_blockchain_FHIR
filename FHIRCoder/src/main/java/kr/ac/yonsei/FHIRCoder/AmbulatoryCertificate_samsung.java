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
//   * 주소 : Composition.subject.Patient.Adress
//	 * 발행번호: Composition.id
//	 * 발행일: Composition.date
//	 * 진단의 확실성: Composition.extension.Certainty
//	 * 진료과: Composition.extension.Department
//	 * 진료일자: Composition.extension.Treatmentdate
//   * 면허번호: Composition.extension.Certification
//   * 의사성명: Composition.extension.Providername
//	 */


@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class AmbulatoryCertificate_samsung extends Composition {
	
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

	@Child(name = "Treatmentdate")   
	@Extension(url = "http://yonsei.ac.kr/Treatmentdate", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "date of treatment")
	private org.hl7.fhir.r4.model.Extension Treatmentdate;
	
	public org.hl7.fhir.r4.model.Extension getTreatmentdate() {
		return Treatmentdate;
	}

	public void setTreatmentdate(org.hl7.fhir.r4.model.Extension Treatmentdate) {
		this.Treatmentdate = Treatmentdate;
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
		return super.isEmpty() && ElementUtil.isEmpty(Department,Treatmentdate,KCD,Providername,Certification);
	}

	public void setStatus(Condition con) {
		// TODO Auto-generated method stub
		
	}
}