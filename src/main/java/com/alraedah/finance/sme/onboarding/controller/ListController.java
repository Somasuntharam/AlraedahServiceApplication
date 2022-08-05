package com.alraedah.finance.sme.onboarding.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.alraedah.finance.sme.onboarding.common.AppConstants;
import com.alraedah.finance.sme.onboarding.common.ResourceUrls;
import com.alraedah.finance.sme.onboarding.dtos.APIResponse;
import com.alraedah.finance.sme.onboarding.service.ListService;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(ResourceUrls.LIST_ROOT)
public class ListController {

	private static Logger logger = LoggerFactory.getLogger(ListController.class);

	@Autowired
	ListService listService;

	@Autowired
	ObjectMapper objectMapper;

	@ApiResponses(value = {
			@ApiResponse(code = 400, message = AppConstants.INVALID_REQUEST, response = APIResponse.class),
			@ApiResponse(code = 408, message = AppConstants.REQUEST_TIME_OUT, response = APIResponse.class),
			@ApiResponse(code = 500, message = AppConstants.INTERNAL_SERVER_ERROR, response = APIResponse.class),
			@ApiResponse(code = 200, message = AppConstants.SUCCESS, response = ApiResponse.class) })
	@PostMapping(ResourceUrls.LIST_CYCLE_CHECK)
	@ResponseStatus(code = HttpStatus.OK)
	private LinkedHashMap<String, Boolean> checkCycle(@RequestBody LinkedHashMap<String, List<Integer>> inputMap)

	{
		Map<String, Boolean> responseMap = null;
		logger.info("inside checkCycle()");
		logger.info("inside checkCycle() request inputMap" + inputMap);
		try {
			responseMap = listService.validateCycle(inputMap);
		} catch (Exception ex) {
			logger.error("Exception:" + ex.getMessage());

		}
		logger.info("checkCycle() responseMap:" + responseMap);
		logger.info("exit checkCycle()");
		return (LinkedHashMap<String, Boolean>) responseMap;
	}

}
