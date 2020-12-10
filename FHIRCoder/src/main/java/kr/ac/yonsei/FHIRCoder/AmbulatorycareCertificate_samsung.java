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
public class AmbulatorycareCertificate_samsung extends Composition {
	
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

	@Child(name = "Dignosisdate")   
	@Extension(url = "http://yonsei.ac.kr/Dignosisdate", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Dignosisdate")
	private org.hl7.fhir.r4.model.Extension Dignosisdate;
	
	public org.hl7.fhir.r4.model.Extension getDignosisdate() {
		return Dignosisdate;
	}

	public void setDignosisdate(org.hl7.fhir.r4.model.Extension Dignosisdate) {
		this.Dignosisdate = Dignosisdate;
	}


	@Child(name = "Testdate")   
	@Extension(url = "http://yonsei.ac.kr/Testdate", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Testdate")
	private org.hl7.fhir.r4.model.Extension Testdate;
	
	public org.hl7.fhir.r4.model.Extension getTestdate() {
		return Testdate;
	}

	public void setTestdate(org.hl7.fhir.r4.model.Extension Testdate) {
		this.Testdate = Testdate;
	}
	
	
	
	@Override
	public boolean isEmpty() {
		return super.isEmpty() && ElementUtil.isEmpty(Department,Dignosisdate,Testdate);
	}

	public void setStatus(Condition con) {
		// TODO Auto-generated method stub
		
	}
}