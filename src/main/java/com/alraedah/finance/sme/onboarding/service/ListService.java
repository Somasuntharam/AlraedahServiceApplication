package com.alraedah.finance.sme.onboarding.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alraedah.finance.sme.onboarding.common.AppUtils;



@Service
public class ListService {
	
	private static  Logger logger= LoggerFactory.getLogger(ListService.class);
	
	public Map<String, Boolean> validateCycle(LinkedHashMap<String, List<Integer>> inputMap)
	{
		logger.info("inside validateCycle()");
		Map<String, Boolean> responseMap = new LinkedHashMap<String, Boolean>();
		if (inputMap != null) {
			Set<String> keys = inputMap.keySet();
			for (String str : keys) {
				responseMap.put(str, AppUtils.checkCycleExists(inputMap.get(str)));
			}
		}
		logger.info("exit validateCycle()");

		return responseMap;

	}

}
