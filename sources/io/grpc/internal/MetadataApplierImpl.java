package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.CallCredentials;
import io.grpc.CallOptions;
import io.grpc.ClientStreamTracer;
import io.grpc.Context;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.DelayedStream;

/* loaded from: classes7.dex */
final class MetadataApplierImpl extends CallCredentials.MetadataApplier {

    /* renamed from: a, reason: collision with root package name */
    public final ClientTransport f24059a;
    public final MethodDescriptor b;
    public final Metadata c;
    public final CallOptions d;
    public final MetadataApplierListener f;
    public final ClientStreamTracer[] g;
    public ClientStream i;
    public boolean j;
    public DelayedStream k;
    public final Object h = new Object();
    public final Context e = Context.d();

    public interface MetadataApplierListener {
        void onComplete();
    }

    public MetadataApplierImpl(ClientTransport clientTransport, MethodDescriptor methodDescriptor, Metadata metadata, CallOptions callOptions, MetadataApplierListener metadataApplierListener, ClientStreamTracer[] clientStreamTracerArr) {
        this.f24059a = clientTransport;
        this.b = methodDescriptor;
        this.c = metadata;
        this.d = callOptions;
        this.f = metadataApplierListener;
        this.g = clientStreamTracerArr;
    }

    @Override // io.grpc.CallCredentials.MetadataApplier
    public final void a(Metadata metadata) {
        Preconditions.q("apply() or fail() already called", !this.j);
        Metadata metadata2 = this.c;
        metadata2.d(metadata);
        Context context = this.e;
        Context contextB = context.b();
        try {
            ClientStream clientStreamD = this.f24059a.d(this.b, metadata2, this.d, this.g);
            context.e(contextB);
            c(clientStreamD);
        } catch (Throwable th) {
            context.e(contextB);
            throw th;
        }
    }

    @Override // io.grpc.CallCredentials.MetadataApplier
    public final void b(Status status) {
        Preconditions.f("Cannot fail with OK status", !status.f());
        Preconditions.q("apply() or fail() already called", !this.j);
        c(new FailingClientStream(GrpcUtil.h(status), ClientStreamListener.RpcProgress.d, this.g));
    }

    public final void c(ClientStream clientStream) {
        boolean z;
        Preconditions.q("already finalized", !this.j);
        this.j = true;
        synchronized (this.h) {
            try {
                if (this.i == null) {
                    this.i = clientStream;
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.f.onComplete();
            return;
        }
        Preconditions.q("delayedStream is null", this.k != null);
        Runnable runnableS = this.k.s(clientStream);
        if (runnableS != null) {
            ((DelayedStream.AnonymousClass4) runnableS).run();
        }
        this.f.onComplete();
    }
}
