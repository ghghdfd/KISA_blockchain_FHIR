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
import org.hl7.fhir.instance.model.api.IBaseDatatype;
import ca.uhn.fhir.context.FhirContext;

public class MedicalConfirmation_seoulTest {
	public static void main(String[] args) {
		MedicalConfirmation_seoul pop = new MedicalConfirmation_seoul();
		
		pop.setId("제 1082685호");
		Patient pt = new Patient();		
		
		
		List<HumanName> ptname = new ArrayList<HumanName>();
		HumanName lname = new HumanName();
		lname.setText("**");
		ptname.add(lname);
		HumanName fname = new HumanName();
		fname.setText("Hwang");
		ptname.add(fname);
		pt.setName(ptname);

		List<Identifier> num = new ArrayList<Identifier>();
		Identifier numm = new Identifier();
		numm.setValue("950713-*******");
		num.add(numm);
		pt.setIdentifier(num);
		pop.setSubject(new Reference(pt));
		
		Narrative value = new Narrative();
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 진료사실확인서(서울대); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		Encounter enc = new Encounter();
		Organization org = new Organization();
		org.setName("서울대학교병원");
		org.setId("764332");
		enc.setServiceProviderTarget(org);
		enc.setId("70374685");
		pop.setEncounter(new Reference(enc));
		
		Calendar cal = Calendar.getInstance();
		cal.set(2020, Calendar.JUNE , 16);
		Date dat = new Date(cal.getTimeInMillis());
		pop.setDate(dat);
		
		StringType RecordNumber = new StringType();
		RecordNumber.fromStringValue("H2200O40661516120700");
		pop.setRecordNumber(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/RecordNumber", (IBaseDatatype) RecordNumber));
		
		
		StringType Department = new StringType();
		Department.fromStringValue("감염내과");
		pop.setDepartment(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Department", (IBaseDatatype) Department));
		
		StringType Treatmentdate = new StringType();
		Treatmentdate.fromStringValue("2019-10-30, 2019-10-30(주사일자)");
		pop.setTreatmentdate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Date of treatment", (IBaseDatatype) Treatmentdate));
		
		StringType Content = new StringType();
		Content.fromStringValue("위의 사실을 증명합니다.");
		pop.setContent(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Content", (IBaseDatatype) Content));		

		FhirContext ctx = FhirContext.forR4();
		String string = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pop);
		System.out.println(string);
	}


}
