package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.ClientStreamTracer;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;

/* loaded from: classes7.dex */
public final class FailingClientStream extends NoopClientStream {
    public boolean b;
    public final Status c;
    public final ClientStreamListener.RpcProgress d;
    public final ClientStreamTracer[] e;

    public FailingClientStream(Status status, ClientStreamListener.RpcProgress rpcProgress, ClientStreamTracer[] clientStreamTracerArr) {
        Preconditions.f("error must not be OK", !status.f());
        this.c = status;
        this.d = rpcProgress;
        this.e = clientStreamTracerArr;
    }

    @Override // io.grpc.internal.NoopClientStream, io.grpc.internal.ClientStream
    public final void l(InsightBuilder insightBuilder) {
        insightBuilder.a(this.c, "error");
        insightBuilder.a(this.d, "progress");
    }

    @Override // io.grpc.internal.NoopClientStream, io.grpc.internal.ClientStream
    public final void n(ClientStreamListener clientStreamListener) {
        Preconditions.q("already started", !this.b);
        this.b = true;
        ClientStreamTracer[] clientStreamTracerArr = this.e;
        int length = clientStreamTracerArr.length;
        int i = 0;
        while (true) {
            Status status = this.c;
            if (i >= length) {
                clientStreamListener.c(status, this.d, new Metadata());
                return;
            } else {
                clientStreamTracerArr[i].i(status);
                i++;
            }
        }
    }

    public FailingClientStream(Status status, ClientStreamTracer[] clientStreamTracerArr) {
        this(status, ClientStreamListener.RpcProgress.d, clientStreamTracerArr);
    }
}
