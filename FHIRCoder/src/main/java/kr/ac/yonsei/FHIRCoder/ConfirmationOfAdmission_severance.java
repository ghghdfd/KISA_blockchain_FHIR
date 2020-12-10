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
//   * 환자등록번호 Composition.Patient.id
//	 * 발행번호: Composition.id
//	 * 발행일: Composition.date
//	 * 진료과: Composition.extension.Department
//   * 입원기간: Composition.extension.Periodofaddmision
//	 */


@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class ConfirmationOfAdmission_severance extends Composition {
	
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
	
	public org.hl7.fhir.r4.model.Extension getProvider() {
		return Department;
	}

	public void setProvider(org.hl7.fhir.r4.model.Extension Department) {
		this.Department = Department;
	}
	
	@Child(name = "Periodofaddmision")   
	@Extension(url = "http://yonsei.ac.kr/Periodofaddmision", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Period of admission")
	private org.hl7.fhir.r4.model.Extension Periodofaddmision;
	
	public org.hl7.fhir.r4.model.Extension getPeriodofaddmision() {
		return Periodofaddmision;
	}

	public void setPeriodofadmission(org.hl7.fhir.r4.model.Extension Periodofaddmision) {
		this.Periodofaddmision = Periodofaddmision;
	}	

		
	@Override
	public boolean isEmpty() {
		return super.isEmpty() && ElementUtil.isEmpty(Department,Periodofaddmision);
	}

	public void setStatus(Condition con) {
		// TODO Auto-generated method stub
		
	}
}