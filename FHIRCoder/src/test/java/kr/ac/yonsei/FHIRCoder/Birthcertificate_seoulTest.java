package kr.ac.yonsei.FHIRCoder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Narrative;
import org.hl7.fhir.r4.model.Organization;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.StringType;
import org.hl7.fhir.r4.model.codesystems.ContactPointSystem;
import org.hl7.fhir.instance.model.api.IBaseDatatype;
import org.hl7.fhir.r4.model.Address;
import ca.uhn.fhir.context.FhirContext;

public class Birthcertificate_seoulTest {
	public static void main(String[] args) {
		Birthcertificate_seoul pop = new Birthcertificate_seoul();
		
		pop.setId("2020-0000");

		
		Narrative value = new Narrative();
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 출생증명서(서울대); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		Encounter enc = new Encounter();
		Organization org = new Organization();
		org.setName("서울대학교병원");
		
		pop.setEncounter(new Reference(org));
		

		Calendar cal = Calendar.getInstance();
		cal.set(2020, Calendar.FEBRUARY , 11);
		Date dat = new Date(cal.getTimeInMillis());
		pop.setDate(dat);
		
		
		StringType Fathername = new StringType();
		Fathername.fromStringValue("부 성명");
		pop.setFathername(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Fathername", (IBaseDatatype) Fathername));
		
		StringType Fatherage = new StringType();
		Fatherage.fromStringValue("만 00세 0000년 00월 00일생");
		pop.setFatherage(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/date of Fatherage", (IBaseDatatype) Fatherage));
		
		StringType Fatherjob = new StringType();
		Fatherjob.fromStringValue("부 직업");
		pop.setFatherjob(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/date of Fatherage KCD code", (IBaseDatatype) Fatherjob));
		
		
		StringType Mothername = new StringType();
		Mothername.fromStringValue("모 성명" );
		pop.setMothername(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Mothername", (IBaseDatatype) Mothername));
		
		StringType Motherage = new StringType();
		Motherage.fromStringValue("만 00세 0000년 00월 00일생");
		pop.setMotherage(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Motherage", (IBaseDatatype) Motherage));
		
		StringType Motherjob = new StringType();
		Motherjob.fromStringValue("모 직업");
		pop.setMotherjob(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Motherjob", (IBaseDatatype) Motherjob));
		
		StringType Motheraddress = new StringType();
		Motheraddress.fromStringValue("산모 주소");
		pop.setMotheraddress(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Motheraddress", (IBaseDatatype) Motheraddress));
		
		
		StringType PlaceOfBirth = new StringType();
		PlaceOfBirth.fromStringValue("서울특별시 종로구 대학로 101 서울대학교병원");
		pop.setPlaceOfBirth(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/PlaceOfBirth", (IBaseDatatype) PlaceOfBirth));
		
		StringType DateOfBirth = new StringType();
		DateOfBirth.fromStringValue("0000년 00월 00일 00시 00분");
		pop.setDateOfBirth(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Content of DateOfBirth", (IBaseDatatype) DateOfBirth));		
		
		StringType Babygender = new StringType();
		Babygender.fromStringValue("남");
		pop.setBabygender(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Babygender", (IBaseDatatype) Babygender));		
		
		StringType Babyname = new StringType();
		Babyname.fromStringValue("출생아 성명");
		pop.setBabyname(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Babyname", (IBaseDatatype) Babyname));		

		StringType Babyweight = new StringType();
		Babyweight.fromStringValue("0.0kg");
		pop.setBabyweight(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Babyweight", (IBaseDatatype) Babyweight));		

		StringType Babyheight = new StringType();
		Babyheight.fromStringValue("0.0cm");
		pop.setBabyheight(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Babyheight", (IBaseDatatype) Babyheight));		

		StringType PregnancyPeriod = new StringType();
		PregnancyPeriod.fromStringValue("00주");
		pop.setPregnancyPeriod(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/PregnancyPeriod", (IBaseDatatype) PregnancyPeriod));		

		StringType Multiple = new StringType();
		Multiple.fromStringValue("0 태");
		pop.setMultiple(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Multiple", (IBaseDatatype) Multiple));	
		
		StringType Birthorderamongmultiple = new StringType();
		Birthorderamongmultiple.fromStringValue("제 2아");
		pop.setBirthorderamongmultiple(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Birthorderamongmultiple", (IBaseDatatype) Birthorderamongmultiple));	
		
		StringType Babycondition = new StringType();
		Babycondition.fromStringValue("출생 2명 (남 1명, 여 1명)");
		pop.setBabycondition(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Babycondition", (IBaseDatatype) Babycondition));	
		
		StringType Babyphysicalcondition = new StringType();
		Babyphysicalcondition.fromStringValue("추후 소아청소년과 검진 요망");
		pop.setBabyphysicalcondition(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Babyphysicalcondition", (IBaseDatatype) Babyphysicalcondition));	
		
		StringType Babyhealthcondition = new StringType();
		Babyhealthcondition.fromStringValue("추후 소아청소년과 검진 요망");
		pop.setBabyhealthcondition(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Babyhealthcondition", (IBaseDatatype) Babyhealthcondition));	
	
		StringType Content = new StringType();
		Content.fromStringValue("[의료법] 제 17조 및 같은 법 시행규칙 제 11조에 따라 위와 같이 증명합니다.");
		pop.setContent(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Content", (IBaseDatatype) Content));		
		
		StringType Providername = new StringType();
		Providername.fromStringValue("홍길동");
		pop.setProvidername(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Name of provider", (IBaseDatatype) Providername));
		
		StringType Certification = new StringType();
		Certification.fromStringValue("12345");
		pop.setCertification(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Number of certification", (IBaseDatatype) Certification));		
		
		FhirContext ctx = FhirContext.forR4();
		String string = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pop);
		System.out.println(string);
	}


}
