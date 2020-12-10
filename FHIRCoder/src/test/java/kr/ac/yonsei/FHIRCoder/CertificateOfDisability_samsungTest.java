package kr.ac.yonsei.FHIRCoder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;


import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Narrative;
import org.hl7.fhir.r4.model.Organization;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.StringType;
import org.hl7.fhir.instance.model.api.IBaseDatatype;
import org.hl7.fhir.r4.model.Address;
import ca.uhn.fhir.context.FhirContext;

public class CertificateOfDisability_samsungTest {
	public static void main(String[] args) {
		CertificateOfDisability_samsung pop = new CertificateOfDisability_samsung();

		Narrative value = new Narrative();
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 장애인증명서(삼성서울); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		Organization org = new Organization();
		org.setName("삼성서울병원");
		
		List<Identifier> num = new ArrayList<Identifier>();
		Identifier numm = new Identifier();
		numm.setValue("213-32-05096");
		num.add(numm);
		org.setIdentifier(num);
		
		List<Address> address = new ArrayList<Address>();
		Address adresss = new Address();
		
		adresss.setCity("서울특별시");
		adresss.setDistrict("강남구 일원로 31");
		address.add(adresss);
		org.setAddress(address);
		
		pop.setSubject(new Reference(org));

		Calendar cal = Calendar.getInstance();
		cal.set(2019,Calendar.FEBRUARY, 25);
		Date dat = new Date(cal.getTimeInMillis());
		pop.setDate(dat);
		
		StringType Requestername = new StringType();
		Requestername.fromStringValue("황**");
		pop.setRequestername(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Name of Requester", (IBaseDatatype) Requestername));		
		
		StringType Requesteridentifier = new StringType();
		Requesteridentifier.fromStringValue("950713-*******");
		pop.setRequesteridentifier(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Period of admission", (IBaseDatatype) Requesteridentifier));		
		
		StringType Requesteraddress = new StringType();
		Requesteraddress.fromStringValue("**도 **시 **로");
		pop.setRequesteraddress(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Requester address", (IBaseDatatype) Requesteraddress));		
		
		StringType Disabilityperson = new StringType();
		Disabilityperson.fromStringValue("황**");
		pop.setDisabilityperson(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Name of Disabilityperson", (IBaseDatatype) Disabilityperson));		
		
		StringType Disabilitypersonidentifier = new StringType();
		Disabilitypersonidentifier.fromStringValue("950713-*******");
		pop.setDisabilitypersonidentifier(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Disabilityperson identifier", (IBaseDatatype) Disabilitypersonidentifier));		
		
		StringType RelationshipWithRequester = new StringType();
		RelationshipWithRequester.fromStringValue("황**의 자");
		pop.setRelationshipWithRequester(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Relationship With Requester", (IBaseDatatype) RelationshipWithRequester));		
		
		StringType PeriodOfDisability = new StringType();
		PeriodOfDisability.fromStringValue("비영구 0000-00-00 ~ 0000-00-00");
		pop.setPeriodOfDisability(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Predictperiod of disability", (IBaseDatatype) PeriodOfDisability));		

		StringType ContentOfDisability = new StringType();
		ContentOfDisability.fromStringValue("제 3호");
		pop.setContentOfDisability(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Content of disability", (IBaseDatatype) ContentOfDisability));		
		
		StringType Perpose = new StringType();
		Perpose.fromStringValue("소득공제 신청용");
		pop.setPerpose(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Perpose of certification", (IBaseDatatype) Perpose));		
		
		StringType Content = new StringType();
		Content.fromStringValue("위 사람은 소득세법 제 51조 제1항 제2호 및 같은 법 시행령 제 107조 제1항에 따른 장애인에 해당함(또는 소득공제 받고자 하는 과세기간 중에 장애인이었으나 치유가 되었음)을 증명합니다.");
		pop.setContent(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Content of certification", (IBaseDatatype) Content));		
		
		StringType Providername = new StringType();
		Providername.fromStringValue("홍길동");
		pop.setProvidername(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Providername", (IBaseDatatype) Providername));		


		FhirContext ctx = FhirContext.forR4();
		String string = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pop);
		System.out.println(string);
	}


}
