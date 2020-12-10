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
//   * 발행번호: Composition.id
//   * 증명서 발급기관 상호: Composition.subject.Organization.Name
//   * 사업자등록번호: Composition.subject.Organization.Identifier
//   * 소재지: Composition.subject.Organization.Adress
//	 * 소득자성명: Composition.extension.Requestername
//   * 주민등록번호 : Composition.extension.Requesteridentifier
//   * 주소 : Composition.extension.Requesteraddress
//   * 장애인성명 : Composition.extension.Disabilityperson
//   * 주민등록번호: Composition.extension.Disabilitypersonidentifier
//   * 소득자와의 관계 : Composition.extension.RelationshipWithRequester
//	 * 작성일: Composition.date
//	 * 장애예상기간: Composition.extension.PeriodOfDisability
//   * 장애내용: Composition.extension.ContentOfDisability
//   * 용도: Composition.extension.Perpose
//   * 내용: Composition.extension.Content
//   * 진료자: Composition.extension.Providername
//   * 발행일: Composition.date
//	 */


@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class CertificateOfDisability_samsung extends Composition {

   private static final long serialVersionUID = 1L;

   /**
    * Each extension is defined in a field. Any valid HAPI Data Type
    * can be used for the field type. Note that the [name=""] attribute
    * in the @Child annotation needs to match the name for the bean accessor
    * and mutator methods.
    */
 
	@Child(name = "Requestername")   
	@Extension(url = "http://yonsei.ac.kr/Requestername", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Name of Requester")
	private org.hl7.fhir.r4.model.Extension Requestername;
	
	public org.hl7.fhir.r4.model.Extension getRequestername() {
		return Requestername;
	}

	public void setRequestername(org.hl7.fhir.r4.model.Extension Requestername) {
		this.Requestername = Requestername;
	}
	
	
	@Child(name = "Requesteridentifier")   
	@Extension(url = "http://yonsei.ac.kr/Requesteridentifier", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Requester identifier")
	private org.hl7.fhir.r4.model.Extension Requesteridentifier;
	
	public org.hl7.fhir.r4.model.Extension getRequesteridentifier() {
		return Requesteridentifier;
	}

	public void setRequesteridentifier(org.hl7.fhir.r4.model.Extension Requesteridentifier) {
		this.Requesteridentifier = Requesteridentifier;
	}
	
	@Child(name = "Requesteraddress")   
	@Extension(url = "http://yonsei.ac.kr/Requesteraddress", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Requester adress")
	private org.hl7.fhir.r4.model.Extension Requesteraddress;
	
	public org.hl7.fhir.r4.model.Extension getRequesteraddress() {
		return Requesteraddress;
	}

	public void setRequesteraddress(org.hl7.fhir.r4.model.Extension Requesteraddress) {
		this.Requesteraddress = Requesteraddress;
	}
	
	@Child(name = "Disabilityperson")   
	@Extension(url = "http://yonsei.ac.kr/Disabilityperson", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Name of Disabilityperson")
	private org.hl7.fhir.r4.model.Extension Disabilityperson;
	
	public org.hl7.fhir.r4.model.Extension getDisabilityperson() {
		return Disabilityperson;
	}

	public void setDisabilityperson(org.hl7.fhir.r4.model.Extension Disabilityperson) {
		this.Disabilityperson = Disabilityperson;
	}
	
	@Child(name = "Disabilitypersonidentifier")   
	@Extension(url = "http://yonsei.ac.kr/Disabilitypersonidentifier", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Identifier of Disabilityperson")
	private org.hl7.fhir.r4.model.Extension Disabilitypersonidentifier;
	
	public org.hl7.fhir.r4.model.Extension getDisabilitypersonidentifier() {
		return Disabilitypersonidentifier;
	}

	public void setDisabilitypersonidentifier(org.hl7.fhir.r4.model.Extension Disabilitypersonidentifier) {
		this.Disabilitypersonidentifier = Disabilitypersonidentifier;
	}
	
	@Child(name = "RelationshipWithRequester")   
	@Extension(url = "http://yonsei.ac.kr/RelationshipWithRequester", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Relationship with requester")
	private org.hl7.fhir.r4.model.Extension RelationshipWithRequester;
	
	public org.hl7.fhir.r4.model.Extension getRelationshipWithRequester() {
		return RelationshipWithRequester;
	}

	public void setRelationshipWithRequester(org.hl7.fhir.r4.model.Extension RelationshipWithRequester) {
		this.RelationshipWithRequester = RelationshipWithRequester;
	}
	
	
	@Child(name = "PeriodOfDisability")   
	@Extension(url = "http://yonsei.ac.kr/PeriodOfDisability", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "predicted period of disability")
	private org.hl7.fhir.r4.model.Extension PeriodOfDisability;
	
	public org.hl7.fhir.r4.model.Extension getPeriodOfDisability() {
		return PeriodOfDisability;
	}

	public void setPeriodOfDisability(org.hl7.fhir.r4.model.Extension PeriodOfDisability) {
		this.PeriodOfDisability = PeriodOfDisability;
	}
	
	@Child(name = "ContentOfDisability")   
	@Extension(url = "http://yonsei.ac.kr/ContentOfDisability", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Content of disability")
	private org.hl7.fhir.r4.model.Extension ContentOfDisability;
	
	public org.hl7.fhir.r4.model.Extension getContentOfDisability() {
		return ContentOfDisability;
	}

	public void setContentOfDisability(org.hl7.fhir.r4.model.Extension ContentOfDisability) {
		this.ContentOfDisability = ContentOfDisability;
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
		return Perpose;
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
	
	@Override
	public boolean isEmpty() {
		return super.isEmpty() && ElementUtil.isEmpty(Requestername,Requesteridentifier,Requesteraddress,
				Disabilityperson,Disabilitypersonidentifier,RelationshipWithRequester,PeriodOfDisability,
				ContentOfDisability,Perpose,Content,Providername);
		
	}
}