package com.wa.calculations.service;

import com.wa.calculations.request.CalculationsRequest;
import com.wa.calculations.response.CalculationsResponse;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/calculations")
public class CalculationsServiceImpl implements CalculationService{

    //TODO: Introduce logger

    @Override
    @POST
    @Path("/searchFile")
    public Response getSearchResults(@QueryParam ("request") CalculationsRequest calculationsRequest) {
        //TODO: log start of method
        CalculationsResponse response = new CalculationsResponse();

        response.setFound("String found");

        return Response.status(200).entity(response).build();

        //TODO: log end of method
    }
}
