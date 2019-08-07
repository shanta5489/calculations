package com.wa.calculations.service;

import com.wa.calculations.request.CalculationsRequest;
import com.wa.calculations.response.CalculationsResponse;

import javax.ws.rs.core.Response;

public interface CalculationService {

public Response getSearchResults(CalculationsRequest calculationsRequest);

}
