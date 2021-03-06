package me.stevenkin.minerpc.rpc;

import me.stevenkin.minerpc.common.URL;

public interface Invoker {
    Result invoke(Invocation invocation);

    URL getUrl();

    void destroy();
}
