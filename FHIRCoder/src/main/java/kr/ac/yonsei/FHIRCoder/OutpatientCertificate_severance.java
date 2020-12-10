package kr.ac.yonsei.FHIRCoder;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Extension;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.util.ElementUtil;

import org.hl7.fhir.instance.model.api.IBaseDatatype;

import org.hl7.fhir.r4.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


//* 항목:
//	 * 환자성명: Composition.subject.Patient
//	 * 주민등록번호: Composition.subject.Patient.Identifier
//   * 환자등록번호 : Composition.subject.Patient.id
//	 * 발행번호: Composition.id
//	 * 발행일: Composition.date
//	 * 외래통원: Composition.subject.Outpatient
//	 * 일일입원: Composition.extension.Dailyhospitalization
//	 */

@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class OutpatientCertificate_severance extends Composition {
	
   private static final long serialVersionUID = 1L;

   /**
    * Each extension is defined in a field. Any valid HAPI Data Type
    * can be used for the field type. Note that the [name=""] attribute
    * in the @Child annotation needs to match the name for the bean accessor
    * and mutator methods.
    */


	@Child(name = "Outpatient")   
	@Extension(url = "http://yonsei.ac.kr/Outpatient", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Outpatient")
	private org.hl7.fhir.r4.model.Extension Outpatient;
	
	public org.hl7.fhir.r4.model.Extension getOutpatient() {
		return Outpatient;
	}

	public void setOutpatient(org.hl7.fhir.r4.model.Extension Outpatient) {
		this.Outpatient = Outpatient;
	}


	@Child(name = "Dailyhospitalization")   
	@Extension(url = "http://yonsei.ac.kr/Dailyhospitalization", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Dailyhospitalization")
	private org.hl7.fhir.r4.model.Extension Dailyhospitalization;
	
	public org.hl7.fhir.r4.model.Extension getDailyhospitalization() {
		return Dailyhospitalization;
	}

	public void setDailyhospitalization(org.hl7.fhir.r4.model.Extension Dailyhospitalization) {
		this.Dailyhospitalization = Dailyhospitalization;
	}

	@Override
	public boolean isEmpty() {
		return super.isEmpty() && ElementUtil.isEmpty(Outpatient,Dailyhospitalization);
	}
}