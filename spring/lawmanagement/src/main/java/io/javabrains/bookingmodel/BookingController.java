package demo.bookingmodel;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
	@RequestMapping
		public void addBooking(BookingModel data){
			System.out.print(data.bookingId);	
		}
	
}
