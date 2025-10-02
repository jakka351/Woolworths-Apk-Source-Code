package io.grpc.stub;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.stub.AbstractAsyncStub;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.ClientCalls;
import javax.annotation.CheckReturnValue;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@CheckReturnValue
/* loaded from: classes7.dex */
public abstract class AbstractAsyncStub<S extends AbstractAsyncStub<S>> extends AbstractStub<S> {
    public static AbstractStub a(AbstractStub.StubFactory stubFactory, Channel channel) {
        return stubFactory.a(channel, CallOptions.i.i(ClientCalls.b, ClientCalls.StubType.d));
    }
}
