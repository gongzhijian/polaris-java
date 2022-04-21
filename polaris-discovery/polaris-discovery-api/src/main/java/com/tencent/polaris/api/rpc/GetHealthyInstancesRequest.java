package com.tencent.polaris.api.rpc;

/**
 * @author lepdou 2022-04-21
 */
public class GetHealthyInstancesRequest extends GetAllInstancesRequest {

    /**
     * 是否返回熔断实例，默认否
     */
    private boolean includeCircuitBreak;

    public boolean isIncludeCircuitBreak() {
        return includeCircuitBreak;
    }

    public void setIncludeCircuitBreak(boolean includeCircuitBreak) {
        this.includeCircuitBreak = includeCircuitBreak;
    }

    @Override
    public String toString() {
        return "GetHealthyInstancesRequest{" +
                "includeCircuitBreak=" + includeCircuitBreak +
                '}';
    }
}
