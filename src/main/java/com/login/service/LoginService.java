package com.login.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.login.model.GetGeoDetails;
import com.login.model.Login;
import com.login.model.User;

@Service
public class LoginService {

	public List<Login> name() {

		return Stream.of(new Login("mani", "abc123"), new Login("sai", "sssdsd"), new Login("pavan", "addfdfd"))
				.collect(Collectors.toList());

	}

	public List<GetGeoDetails> callAPI() {
		RestTemplate restTemplate = new RestTemplate();
		User[] response = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", User[].class);
		List<User> asList = Arrays.asList(response);
		List<GetGeoDetails> geoDetails = new ArrayList<GetGeoDetails>();
		GetGeoDetails details = null;
		
		for (User user : asList) {
			details = new GetGeoDetails(user.getId(), user.getAddress().getGeo().getLat(),
					user.getAddress().getGeo().getLng(), user.getCompany().getName());
			geoDetails.add(details);
			/*
			 * details.setLat(user.getAddress().getGeo().getLat());
			 * details.setLng(user.getAddress().getGeo().getLng()); geoDetails.add(details);
			 */
		}

		
		/*
		 * JSONArray array = new JSONArray(response); ModelAndView modelAndView = new
		 * ModelAndView(); for (int i = 0; i < array.length(); i++) { JSONObject
		 * jsonObject =
		 * array.getJSONObject(i).getJSONObject("address").getJSONObject("geo"); String
		 * lat = jsonObject.get("lat").toString(); String lng =
		 * jsonObject.get("lng").toString();
		 * 
		 * modelAndView.addObject("lat", lat); modelAndView.addObject("lng", lng);
		 * modelAndView.setViewName("geo");
		 * 
		 * }
		 */ return geoDetails;
	}

}
