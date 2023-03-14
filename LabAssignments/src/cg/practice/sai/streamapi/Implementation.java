package cg.practice.sai.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Implementation {
	public static Map<String, Long> getCount(List<Candidate> list) {
		Map<String, Long> countGender = list.stream()
				.collect(Collectors.groupingBy(Candidate::getGender, Collectors.counting()));
		return countGender;
	}

	

}
