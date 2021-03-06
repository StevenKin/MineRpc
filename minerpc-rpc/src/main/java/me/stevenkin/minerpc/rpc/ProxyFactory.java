package me.stevenkin.minerpc.rpc;

import me.stevenkin.minerpc.common.URL;
import me.stevenkin.minerpc.spi.Adaptive;
import me.stevenkin.minerpc.spi.Spi;

@Spi("jdk")
public interface ProxyFactory {
    @Adaptive("proxy")
    <T> T getProxy(Invoker invoker, Class<T> service);

    @Adaptive("proxy")
    <T> Invoker toInvoker(T proxy, Class<T> service, URL url);
}
