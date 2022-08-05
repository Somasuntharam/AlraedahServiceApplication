package com.alraedah.finance.sme.onboarding.common;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppUtils {
	private static Logger logger = LoggerFactory.getLogger(AppUtils.class);

	public static boolean checkCycleExists(List<Integer> list) {
		logger.info("inside checkCycleExists()");
		logger.info("inside checkCycleExists() list:" + list);
		boolean result = AppConstants.FALSE;
		int j = AppConstants.INT_CONSTANT_ZERO;
		int runningIndex = AppConstants.INT_CONSTANT_ZERO;
		int startValue = AppConstants.INT_CONSTANT_ZERO;
		while (j != list.size()) {
			if (j == AppConstants.INT_CONSTANT_ZERO) {
				startValue = list.get(j);
				runningIndex = startValue;
				if (runningIndex == AppConstants.INT_CONSTANT_ZERO && list.get(j) == AppConstants.INT_CONSTANT_ZERO) {
					logger.info("NO CYCLE IN LIST:" + result);

					return result;
				}
			} else {
				runningIndex = list.get(runningIndex);
			}

			j++;
		}

		try {
			if (j == list.size() && startValue == list.get(runningIndex)) {
				logger.info("CYCLE IN LIST");
				result = AppConstants.TRUE;
			} else {
				logger.info("NO CYCLE IN LIST");
				return result;
			}

		} catch (Exception ex) {
			logger.error("exception:" + ex.getMessage());
			return AppConstants.FALSE;

		}
		logger.info("exit checkCycleExists() result:" + result);
		logger.info("exit checkCycleExists()");
		return result;
	}

}
