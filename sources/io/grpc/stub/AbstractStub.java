package io.grpc.stub;

import com.google.common.base.Preconditions;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.stub.AbstractStub;
import javax.annotation.CheckReturnValue;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@CheckReturnValue
/* loaded from: classes7.dex */
public abstract class AbstractStub<S extends AbstractStub<S>> {

    /* renamed from: a, reason: collision with root package name */
    public final Channel f24158a;
    public final CallOptions b;

    public interface StubFactory<T extends AbstractStub<T>> {
        AbstractStub a(Channel channel, CallOptions callOptions);
    }

    public AbstractStub(Channel channel, CallOptions callOptions) {
        Preconditions.j(channel, "channel");
        this.f24158a = channel;
        Preconditions.j(callOptions, "callOptions");
        this.b = callOptions;
    }
}
