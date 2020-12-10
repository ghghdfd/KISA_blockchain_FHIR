package kr.ac.yonsei.FHIRCoder;

import org.hl7.fhir.r4.model.Composition;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Extension;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.util.ElementUtil;

//* 항목:
//* CHART NO: Composition.extension.Chartnumber
//* SERIAL NO : Composition.id
//* NAME: Composition.subject.Patient.name
//* DATE OF BIRTH: Composition.subject.Patient.birth
//* HOME ADDRESS : Composition.subject.Patient.Adress
//* SEX : Composition.subject.Patient.gender
//* DATE OF ISSUE: Composition.date
//* CERTAINTY OF DIAGNOSIS: Composition.extension.Certainty
//* DIAGNOSIS: Composition.extension.Diagnosis
//* I.C.D: Composition.extension.ICD
//* TREATMENT: Composition.extension.Treatment
//* DURATION OF TREATMENT: Composition.extension.DurationOfTreatment
//* WRITTEN BY : Composition.extension.WrittenBy
//*

@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class MedicalCertificate_samsung extends Composition {
	
   private static final long serialVersionUID = 1L;

   /**
    * Each extension is defined in a field. Any valid HAPI Data Type
    * can be used for the field type. Note that the [name=""] attribute
    * in the @Child annotation needs to match the name for the bean accessor
    * and mutator methods.
    */

	@Child(name = "ChartNumber")   
	@Extension(url = "http://yonsei.ac.kr/ChartNumber", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "ChartNumber")
	private org.hl7.fhir.r4.model.Extension ChartNumber;
	
	public org.hl7.fhir.r4.model.Extension getChartNumber() {
		return ChartNumber;
	}

	public void setChartNumber(org.hl7.fhir.r4.model.Extension ChartNumber) {
		this.ChartNumber = ChartNumber;
	}
	

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
	@Description(shortDefinition = "Name of diagnosis")
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
	@Description(shortDefinition = "Code of diagnosis")
	private org.hl7.fhir.r4.model.Extension ICD;
	
	public org.hl7.fhir.r4.model.Extension getICD() {
	    if (ICD == null) 
	    	ICD = new org.hl7.fhir.r4.model.Extension();
		return ICD;
	}
	
	public void setICD(org.hl7.fhir.r4.model.Extension ICD) {
		this.ICD = ICD;
	}



	@Child(name = "Treatment")   
	@Extension(url = "http://yonsei.ac.kr/Treatment", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Treatment content")
	private org.hl7.fhir.r4.model.Extension Treatment;
	
	public org.hl7.fhir.r4.model.Extension getTreatment() {
		return Treatment;
	}

	public void setTreatment(org.hl7.fhir.r4.model.Extension Treatment) {
		this.Treatment = Treatment;
	}
	
	@Child(name = "DurationOfTreatment")   
	@Extension(url = "http://yonsei.ac.kr/DurationOfTreatment", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Duration of treatment")
	private org.hl7.fhir.r4.model.Extension DurationOfTreatment;
	
	public org.hl7.fhir.r4.model.Extension getDurationOfTreatment() {
		return DurationOfTreatment;
	}

	public void setDurationOfTreatment(org.hl7.fhir.r4.model.Extension DurationOfTreatment) {
		this.DurationOfTreatment = DurationOfTreatment;
	}

	
	@Child(name = "WrittenBy")   
	@Extension(url = "http://yonsei.ac.kr/WrittenBy", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Issue writer")
	private org.hl7.fhir.r4.model.Extension WrittenBy;
	
	public org.hl7.fhir.r4.model.Extension getWrittenBy() {
		return WrittenBy;
	}

	public void setWrittenBy(org.hl7.fhir.r4.model.Extension WrittenBy) {
		this.WrittenBy = WrittenBy;
	}
	
	@Override
	public boolean isEmpty() {
		return super.isEmpty() && ElementUtil.isEmpty(ChartNumber,Certainty,Diagnosis,ICD,Treatment,DurationOfTreatment,WrittenBy);
	}

}