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
//	 * 환자성명: Composition.subject.Patient.Name
//   * 환자등록번호 : Composition.subject.Patient.Id
//   * 생년월일 : Composition.subject.Patient.Birthdate
//   * 성별: Composition.Patient.Gender
//   * 연령: ???
//	 * 발행번호: Composition.id
//	 * 작성일: Composition.date
//	 * 진료과: Composition.extension.Department
//   * 면허번호: Composition.extension.Certification
//   * 의사성명: Composition.extension.Providername
//   * 입원일자: Composition.extension.admissiondate
//	 */


@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class ConfirmationOfAdmissionandDischarge_samsung extends Composition {

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
	
	@Child(name = "admissiondate")   
	@Extension(url = "http://yonsei.ac.kr/admissiondate", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "date of admission")
	private org.hl7.fhir.r4.model.Extension admissiondate;
	
	public org.hl7.fhir.r4.model.Extension getadmissiondate() {
		return admissiondate;
	}

	public void setadmissiondate(org.hl7.fhir.r4.model.Extension admissiondate) {
		this.admissiondate = admissiondate;
	}
	
	@Override
	public boolean isEmpty() {
		return super.isEmpty() && ElementUtil.isEmpty(Department,admissiondate);
		
	}
}