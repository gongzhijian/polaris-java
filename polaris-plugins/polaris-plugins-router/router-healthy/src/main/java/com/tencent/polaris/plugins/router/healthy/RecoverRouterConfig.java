package com.tencent.polaris.plugins.router.healthy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tencent.polaris.api.config.verify.Verifier;

/**
 * 过滤不健康的路由插件配置
 *
 * @author lepdou 2022-04-24
 */
public class RecoverRouterConfig implements Verifier {

    @JsonProperty
    private boolean excludeCircuitBreakInstances;

    @Override
    public void verify() {

    }

    @Override
    public void setDefault(Object defaultConfig) {
        if (defaultConfig != null) {
            RecoverRouterConfig recoverRouterConfig = (RecoverRouterConfig) defaultConfig;
            setExcludeCircuitBreakInstances(recoverRouterConfig.isExcludeCircuitBreakInstances());
        }
    }

    public boolean isExcludeCircuitBreakInstances() {
        return excludeCircuitBreakInstances;
    }

    public void setExcludeCircuitBreakInstances(boolean excludeCircuitBreakInstances) {
        this.excludeCircuitBreakInstances = excludeCircuitBreakInstances;
    }
}
