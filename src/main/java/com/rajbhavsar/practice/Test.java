package com.rajbhavsar.practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test
{
	public static void main(String[] args) throws ParseException
	{
		List<String> emails = new ArrayList<>();
		emails.add("ccyclone@allegosample.com");
		emails.add("jdoe@allegosample.com");
		emails.add("somestring");
		String str = "(" + emails.stream().map(email -> "'" + email + "'").collect(Collectors.joining(",")) + ")";
		System.out.println(str);

		emails.remove("jdoe@allegosample.com");
		System.out.println(emails);

		String crmCreatedDate = "2015-08-13T16:14:38.000+0000";
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		System.out.println(sdf.parse(crmCreatedDate));
	}
}
