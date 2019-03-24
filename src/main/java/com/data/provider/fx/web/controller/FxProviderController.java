package com.data.provider.fx.web.controller;

import com.data.provider.fx.web.model.FxHistoricalResponse;
import com.data.provider.fx.web.model.FxLiveResponse;
import com.data.provider.fx.web.model.Quote;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;


@RestController
public class FxProviderController {

    /**
     * USD as the base currency, fetch the historical FX of pairs
     * <p>
     * By passing in the appropriate options, you can search for available inventory in the system
     */
    @RequestMapping(value = "/fx/historical", method = RequestMethod.GET)
    @ApiOperation(value = "USD as the base currency, fetch the historical FX of pairs", tags = {"fxProvider",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "bad input parameter")})
    public FxHistoricalResponse fxHistorical(@RequestParam("date") @NotNull String date, @RequestParam("currencies") @NotNull String currencies) {
        Quote quote = new Quote();
        quote.put("USDUSD", 1.0);
        quote.put("USDAUD", 1.34567);

        FxHistoricalResponse resp = new FxHistoricalResponse();
        resp.setSource("USD");
        resp.setDate("2019-03-24");
        resp.setTimestamp(new Date().getTime());
        resp.getQuotes().add(quote);

        return resp;
    }

    /**
     * USD as the base currency, fetch the live FX of pairs
     * <p>
     * By passing in the appropriate options, you can search for available inventory in the system
     */

    @RequestMapping(value = "/fx/live", method = RequestMethod.GET)
    @ApiOperation(value = "USD as the base currency, fetch the live FX of pairs", tags = {"fxProvider"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "bad input parameter")})
    public FxLiveResponse fxLive(@RequestParam("currencies") @NotNull String currencies) {

        Quote quote = new Quote();
        quote.put("USDUSD", 1.0);
        quote.put("USDAUD", 1.34567);

        FxLiveResponse resp = new FxLiveResponse();
        resp.setSource("USD");
        resp.setTimestamp(new Date().getTime());
        resp.getQuotes().add(quote);

        return resp;
    }
}

