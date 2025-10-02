package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import io.grpc.CallOptions;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@ThreadSafe
/* loaded from: classes7.dex */
public abstract class ClientStreamTracer extends StreamTracer {

    /* renamed from: a, reason: collision with root package name */
    public static final CallOptions.Key f23924a = new CallOptions.Key("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED");

    public static abstract class Factory {
        public ClientStreamTracer a(StreamInfo streamInfo, Metadata metadata) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    @ExperimentalApi
    public static final class StreamInfo {

        /* renamed from: a, reason: collision with root package name */
        public final CallOptions f23925a;
        public final int b;
        public final boolean c;

        public static final class Builder {
        }

        public StreamInfo(CallOptions callOptions, int i, boolean z) {
            Preconditions.j(callOptions, "callOptions");
            this.f23925a = callOptions;
            this.b = i;
            this.c = z;
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
            toStringHelperB.c(this.f23925a, "callOptions");
            toStringHelperB.a(this.b, "previousAttempts");
            toStringHelperB.d("isTransparentRetry", this.c);
            return toStringHelperB.toString();
        }
    }

    public void j() {
    }

    public void k() {
    }

    public void l(Metadata metadata) {
    }

    public void m() {
    }

    public void n(Attributes attributes, Metadata metadata) {
    }
}
