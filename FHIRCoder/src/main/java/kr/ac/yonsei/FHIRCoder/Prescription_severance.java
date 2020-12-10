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
//   * 주소 : Composition.subject.Patient.Adress
//   * 전화 : Composition.subject.Patient.Phone
//   * 연령 : Composition.subject.Patient.Age
//	 * 발행일: Composition.date
//	 * 약 처방 기간: Composition.extension.prescriptionperiod
//	 * 처방일: Composition.extension.prescriptiondate
//	 * 약품명: Composition.extension.medicine
//	 * 1회투여량: Composition.extension.dailydose
//   * 1일 투여횟수: Composition.extension.dailydosecount
//   * 일수 : Composition.extension.days
//   * 총량 : Composition.extension.totaldose
//	 */


@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class Prescription_severance extends Composition {
	
   private static final long serialVersionUID = 1L;

   /**
    * Each extension is defined in a field. Any valid HAPI Data Type
    * can be used for the field type. Note that the [name=""] attribute
    * in the @Child annotation needs to match the name for the bean accessor
    * and mutator methods.
    */
 

	@Child(name = "prescriptionperiod")   
	@Extension(url = "http://yonsei.ac.kr/Period of prescription", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "period of prescription")
	private org.hl7.fhir.r4.model.Extension prescriptionperiod;
	
	public org.hl7.fhir.r4.model.Extension getprescriptionperiod() {
		return prescriptionperiod;
	}

	public void setprescriptionperiod(org.hl7.fhir.r4.model.Extension prescriptionperiod) {
		this.prescriptionperiod = prescriptionperiod;
	}
	
	
	@Child(name = "prescriptiondate")   
	@Extension(url = "http://yonsei.ac.kr/prescriptiondate", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "date of prescription")
	private org.hl7.fhir.r4.model.Extension prescriptiondate;
	
	public org.hl7.fhir.r4.model.Extension getprescriptiondate() {
	    if (prescriptiondate == null) 
	    	prescriptiondate = new org.hl7.fhir.r4.model.Extension();
		return prescriptiondate;
	}
	
	public void setprescriptiondate(org.hl7.fhir.r4.model.Extension prescriptiondate) {
		this.prescriptiondate = prescriptiondate;
	}
//



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
	
	@Override
	public boolean isEmpty() {
		return super.isEmpty() && ElementUtil.isEmpty(totaldose, medicationday, dailydosecount, 
				dose, medicine,prescriptiondate,prescriptionperiod);
	}

	public void setStatus(Condition con) {
		// TODO Auto-generated method stub
		
	}
}