package com.g3;

import io.grpc.Channel;
import io.grpc.ClientInterceptor;

import java.util.List;

/**
 * @author : yesheng
 * @Description :
 * @Date : 2018/6/5
 */
public interface GrpcChannelFactory {

    Channel createChannel(String name, List<ClientInterceptor> interceptors);
}
