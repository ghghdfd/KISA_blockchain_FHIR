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
//   * 믄서번호: Composition.extension.RecordNumber
//   * 발행번호: Composition.id
//	 * 환자성명: Composition.subject.Patient.Name
//   * 환자등록번호 : Composition.subject.Patient.Id
//   * 주민등록번호 : Composition.subject.Patient.Identifier
//	 * 발행일: Composition.date
//	 * 진료과: Composition.extension.Department
//   * 진료일자: Composition.extension.Treatmentdate
//   * 내용: Composition.extension.Content
//	 */


@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class MedicalConfirmation_seoul extends Composition {

   private static final long serialVersionUID = 1L;

   /**
    * Each extension is defined in a field. Any valid HAPI Data Type
    * can be used for the field type. Note that the [name=""] attribute
    * in the @Child annotation needs to match the name for the bean accessor
    * and mutator methods.
    */

	
	@Child(name = "RecordNumber")   
	@Extension(url = "http://yonsei.ac.kr/RecordNumber", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "RecordNumber")
	private org.hl7.fhir.r4.model.Extension RecordNumber;
	
	public org.hl7.fhir.r4.model.Extension getRecordNumber() {
		return RecordNumber;
	}

	public void setRecordNumber(org.hl7.fhir.r4.model.Extension RecordNumber) {
		this.RecordNumber = RecordNumber;
	}
	
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
	@Description(shortDefinition = "Treatmentdate")
	private org.hl7.fhir.r4.model.Extension Treatmentdate;
	
	public org.hl7.fhir.r4.model.Extension getTreatmentdate() {
		return Treatmentdate;
	}

	public void setTreatmentdate(org.hl7.fhir.r4.model.Extension Treatmentdate) {
		this.Treatmentdate = Treatmentdate;
	}
	
	@Child(name = "Content")   
	@Extension(url = "http://yonsei.ac.kr/Content", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Content of certificate")
	private org.hl7.fhir.r4.model.Extension Content;
	
	public org.hl7.fhir.r4.model.Extension getContent() {
		return Content;
	}

	public void setContent(org.hl7.fhir.r4.model.Extension Content) {
		this.Content = Content;
	}
	
	@Override
	public boolean isEmpty() {
		return super.isEmpty() && ElementUtil.isEmpty(RecordNumber,Department,Treatmentdate,Content);
		
	}
}