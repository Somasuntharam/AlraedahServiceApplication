package com.alraedah.finance.sme.onboarding;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.alraedah.finance.sme.onboarding.controller.ListController;
import com.alraedah.finance.sme.onboarding.service.ListService;

@SpringBootTest
class AlraedahServiceApplicationTests {

	@InjectMocks
	ListService listService;

	@InjectMocks
	ListController listController;

	@Test
	void check_cycleExistsOrNot() {
		Map<String, List<Integer>> inputMap = new LinkedHashMap<>();
		Integer[] list1 = { 1, 2, 3 };
		Integer[] list2 = { 0, 2, 5 };
		Integer[] list3 = { 3, 0, 1, 2 };

		inputMap.put("list1", Arrays.asList(list1));
		inputMap.put("list2", Arrays.asList(list2));
		inputMap.put("list3", Arrays.asList(list3));

	}

}
