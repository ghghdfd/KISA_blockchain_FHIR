package kr.ac.yonsei.FHIRCoder;

import org.hl7.fhir.r4.model.Composition;
import org.hl7.fhir.r4.model.Condition;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Extension;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.util.ElementUtil;

//* 항목:
//* 병록번호: ??
//* 발행번호 : Composition.id
//* 환자성명: Composition.subject.Patient
//* 주민등록번호: Composition.subject.Patient.Identifier
//* 주소 : Composition.subject.Patient.Adress
//* 연락처 : Composition.subject.Patient.telecom.phone
//* 발행일: Composition.date
//* 진단의 확실성: Composition.extension.Certainty
//* 주상병: Composition.extension.MainDiagnosis
//* 주상병코드: Composition.extension.MainDiagnosisKCD
//* 부상병: Composition.extension.SubDiagnosis
//* 부상병코드: Composition.extension.SubDiagnosisKCD
//* 진단일: Composition.extension.diagnosisdate
//* 발병년월일: Composition.extension.onsetdate
//* 진단일: Composition.extension.diagnosisdate
//* 치료내용 및 향후 치료에 대한 소견: Composition.extension.TreatmentContentAndNote
//* 수술 / 시술일자: Composition.extension.ProcedureAndDate
//* 입퇴원내역: Composition.extension.AdmissionAndDischarge
//* 비고: Composition.extension.Remark
//* 용도: Composition.extension.Perpose
//* 내용: Composition.extension.Content
//* 의사성명: Composition.extension.Providername
//* 면허번호: Composition.extension.Certification
//*/

@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class Diagnosis_samsung extends Composition {
	
   private static final long serialVersionUID = 1L;

   /**
    * Each extension is defined in a field. Any valid HAPI Data Type
    * can be used for the field type. Note that the [name=""] attribute
    * in the @Child annotation needs to match the name for the bean accessor
    * and mutator methods.
    */
 

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
	
	
	@Child(name = "MainDiagnosis")   
	@Extension(url = "http://yonsei.ac.kr/MainDiagnosis", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Name of maindiagnosis")
	private org.hl7.fhir.r4.model.Extension MainDiagnosis;
	
	public org.hl7.fhir.r4.model.Extension getMainDiagnosis() {
	    if (MainDiagnosis == null) 
	    	MainDiagnosis = new org.hl7.fhir.r4.model.Extension();
		return MainDiagnosis;
	}
	
	public void setMainDiagnosis(org.hl7.fhir.r4.model.Extension MainDiagnosis) {
		this.MainDiagnosis = MainDiagnosis;
	}
//
	@Child(name = "SubDiagnosis")   
	@Extension(url = "http://yonsei.ac.kr/SubDiagnosis", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Name of subdiagnosis")
	private org.hl7.fhir.r4.model.Extension SubDiagnosis;
	
	public org.hl7.fhir.r4.model.Extension getSubDiagnosis() {
	    if (SubDiagnosis == null) 
	    	SubDiagnosis = new org.hl7.fhir.r4.model.Extension();
		return SubDiagnosis;
	}
	
	public void setSubDiagnosis(org.hl7.fhir.r4.model.Extension SubDiagnosis) {
		this.SubDiagnosis = SubDiagnosis;
	}

	@Child(name = "MainDiagnosisKCD")   
	@Extension(url = "http://yonsei.ac.kr/MainDiagnosisKCD", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Code of maindiagnosis")
	private org.hl7.fhir.r4.model.Extension MainDiagnosisKCD;
	
	public org.hl7.fhir.r4.model.Extension getMainDiagnosisKCD() {
	    if (MainDiagnosisKCD == null) 
	    	MainDiagnosisKCD = new org.hl7.fhir.r4.model.Extension();
		return MainDiagnosisKCD;
	}
	
	public void setMainDiagnosisKCD(org.hl7.fhir.r4.model.Extension MainDiagnosisKCD) {
		this.MainDiagnosisKCD = MainDiagnosisKCD;
	}

	@Child(name = "SubDiagnosisKCD")   
	@Extension(url = "http://yonsei.ac.kr/SubDiagnosisKCD", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Code of subdiagnosis")
	private org.hl7.fhir.r4.model.Extension SubDiagnosisKCD;
	
	public org.hl7.fhir.r4.model.Extension getSubDiagnosisKCD() {
	    if (SubDiagnosisKCD == null) 
	    	SubDiagnosisKCD = new org.hl7.fhir.r4.model.Extension();
		return SubDiagnosisKCD;
	}
	
	public void setSubDiagnosisKCD(org.hl7.fhir.r4.model.Extension SubDiagnosisKCD) {
		this.SubDiagnosisKCD = SubDiagnosisKCD;
	}
	
	@Child(name = "onsetdate")   
	@Extension(url = "http://yonsei.ac.kr/onsetdate", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "date of onset")
	private org.hl7.fhir.r4.model.Extension onsetdate;
	
	public org.hl7.fhir.r4.model.Extension getonsetdate() {
		return onsetdate;
	}

	public void setonsetdate(org.hl7.fhir.r4.model.Extension onsetdate) {
		this.onsetdate = onsetdate;
	}
	
	@Child(name = "diagnosisdate")   
	@Extension(url = "http://yonsei.ac.kr/diagnosisdate", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "date of diagnosis")
	private org.hl7.fhir.r4.model.Extension diagnosisdate;
	
	public org.hl7.fhir.r4.model.Extension getdiagnosisdate() {
		return diagnosisdate;
	}

	public void setdiagnosisdate(org.hl7.fhir.r4.model.Extension diagnosisdate) {
		this.diagnosisdate = diagnosisdate;
	}
	
	@Child(name = "TreatmentContentAndNote")   
	@Extension(url = "http://yonsei.ac.kr/TreatmentContentAndNote", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Treatment content and notes")
	private org.hl7.fhir.r4.model.Extension TreatmentContentAndNote;
	
	public org.hl7.fhir.r4.model.Extension getTreatmentContentAndNote() {
		return TreatmentContentAndNote;
	}

	public void setTreatmentContentAndNote(org.hl7.fhir.r4.model.Extension TreatmentContentAndNote) {
		this.TreatmentContentAndNote = TreatmentContentAndNote;
	}
	
	@Child(name = "ProcedureAndDate")   
	@Extension(url = "http://yonsei.ac.kr/ProcedureAndDate", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Name of procedure and procedure date")
	private org.hl7.fhir.r4.model.Extension ProcedureAndDate;
	
	public org.hl7.fhir.r4.model.Extension getProcedureAndDate() {
		return ProcedureAndDate;
	}

	public void setProcedureAndDate(org.hl7.fhir.r4.model.Extension ProcedureAndDate) {
		this.ProcedureAndDate = ProcedureAndDate;
	}

	@Child(name = "AdmissionAndDischarge")   
	@Extension(url = "http://yonsei.ac.kr/AdmissionAndDischarge", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Record of Admission and Discharge")
	private org.hl7.fhir.r4.model.Extension AdmissionAndDischarge;
	
	public org.hl7.fhir.r4.model.Extension getAdmissionAndDischarge() {
		return AdmissionAndDischarge;
	}

	public void setAdmissionAndDischarge(org.hl7.fhir.r4.model.Extension AdmissionAndDischarge) {
		this.AdmissionAndDischarge = AdmissionAndDischarge;
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
	
	@Child(name = "Perpose")   
	@Extension(url = "http://yonsei.ac.kr/Perpose", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Perpose of certificate")
	private org.hl7.fhir.r4.model.Extension Perpose;
	
	public org.hl7.fhir.r4.model.Extension getPerpose() {
		return Perpose;
	}

	public void setPerpose(org.hl7.fhir.r4.model.Extension Perpose) {
		this.Perpose = Perpose;
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
		return super.isEmpty() && ElementUtil.isEmpty(Certainty,MainDiagnosis,MainDiagnosisKCD,SubDiagnosis,SubDiagnosisKCD,
				onsetdate,diagnosisdate,TreatmentContentAndNote,ProcedureAndDate,AdmissionAndDischarge,
				Remark,Perpose,Content,Certification,Providername);
	}

	public void setStatus(Condition con) {
		// TODO Auto-generated method stub
		
	}
}