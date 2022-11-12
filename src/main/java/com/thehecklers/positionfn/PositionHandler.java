package com.thehecklers.positionfn;

import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import org.springframework.cloud.function.adapter.azure.FunctionInvoker;

import java.util.Optional;

public class PositionHandler extends FunctionInvoker<Position, String> {
    @FunctionName("pos")
    public HttpResponseMessage execute(
            @HttpTrigger(name = "request",
                    methods = {HttpMethod.GET, HttpMethod.POST},
                    authLevel = AuthorizationLevel.ANONYMOUS)
                    HttpRequestMessage<Optional<Position>> request,
            ExecutionContext context) {
        Position position = request.getBody()
                .orElseGet(() -> new Position("000000", "1200", "AZ123",
        36000, 53, 400));
        context.getLogger().info(">> Current position: " + position.toString());
        return request
                .createResponseBuilder(HttpStatus.OK)
                .body(handleRequest(position, context))
                .header("Content-Type", "application/json")
                .build();
    }
}
