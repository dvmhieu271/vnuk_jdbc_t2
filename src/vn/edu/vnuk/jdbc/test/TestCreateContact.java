package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import java.util.Calendar;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestCreateContact {

	public static void main(String[] args) throws SQLException {
		Contact contact = new Contact();
		
		contact.setName("Hieu");
		contact.setEmail("hieu.duong160204@vnuk.edu.vn");
		contact.setAddress("Da Nang");
		contact.setDateOfRegister(Calendar.getInstance());
		
		new ContactDao().create(contact);
	}
}
