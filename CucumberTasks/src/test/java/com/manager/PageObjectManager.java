package com.manager;

import com.pom.BookHotelPage;
import com.pom.BookingConfirmationPage;
import com.pom.CancelBookingPage;
import com.pom.LoginPage;
import com.pom.SearchHotelPage;
import com.pom.SelectHotelPage;

public class PageObjectManager {
	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConfirmationPage bookingConfirmationPage;
	private CancelBookingPage cancelBookingPage;
	
	public LoginPage getLoginPage() {
		return (loginPage==null)? loginPage = new LoginPage():loginPage ;
	}
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage==null)? searchHotelPage = new SearchHotelPage(): searchHotelPage;
	}
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)? selectHotelPage = new SelectHotelPage():selectHotelPage;
	}
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)? bookHotelPage = new BookHotelPage():bookHotelPage;
	}
	public BookingConfirmationPage getBookingConformationPage() {
		return (bookingConfirmationPage==null)? bookingConfirmationPage = new BookingConfirmationPage():bookingConfirmationPage;
	}
	public CancelBookingPage getCancelBookingPage() {
		return (cancelBookingPage==null)? cancelBookingPage = new CancelBookingPage():cancelBookingPage;
	}


}
