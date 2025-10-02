package io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import io.grpc.Attributes;
import io.grpc.CallOptions;
import io.grpc.ClientCall;
import io.grpc.ConnectivityState;
import io.grpc.Context;
import io.grpc.InternalChannelz;
import io.grpc.InternalInstrumented;
import io.grpc.InternalLogId;
import io.grpc.LoadBalancer;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.ClientCallImpl;
import io.grpc.internal.ManagedClientTransport;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes7.dex */
final class OobChannel extends ManagedChannel implements InternalInstrumented<InternalChannelz.ChannelStats> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24061a = 0;

    /* renamed from: io.grpc.internal.OobChannel$1, reason: invalid class name */
    public class AnonymousClass1 implements ClientCallImpl.ClientStreamProvider {
        @Override // io.grpc.internal.ClientCallImpl.ClientStreamProvider
        public final ClientStream a(MethodDescriptor methodDescriptor, CallOptions callOptions, Metadata metadata, Context context) {
            GrpcUtil.c(callOptions, metadata, 0, false);
            Context contextB = context.b();
            try {
                int i = OobChannel.f24061a;
                throw null;
            } catch (Throwable th) {
                context.e(contextB);
                throw th;
            }
        }
    }

    /* renamed from: io.grpc.internal.OobChannel$1OobErrorPicker, reason: invalid class name */
    final class C1OobErrorPicker extends LoadBalancer.SubchannelPicker {
        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public final LoadBalancer.PickResult a(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
            return null;
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper(C1OobErrorPicker.class.getSimpleName());
            toStringHelper.c(null, "errorResult");
            return toStringHelper.toString();
        }
    }

    /* renamed from: io.grpc.internal.OobChannel$1OobSubchannelPicker, reason: invalid class name */
    final class C1OobSubchannelPicker extends LoadBalancer.SubchannelPicker {
        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public final LoadBalancer.PickResult a(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
            return null;
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper(C1OobSubchannelPicker.class.getSimpleName());
            toStringHelper.c(null, lqlqqlq.m006Dm006Dm006Dm);
            return toStringHelper.toString();
        }
    }

    /* renamed from: io.grpc.internal.OobChannel$2, reason: invalid class name */
    class AnonymousClass2 implements ManagedClientTransport.Listener {
        @Override // io.grpc.internal.ManagedClientTransport.Listener
        public final void a(Status status) {
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        public final void b() {
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        public final void c() {
            int i = OobChannel.f24061a;
            throw null;
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        public final void d(boolean z) {
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        public final Attributes e(Attributes attributes) {
            return attributes;
        }
    }

    /* renamed from: io.grpc.internal.OobChannel$3, reason: invalid class name */
    class AnonymousClass3 extends AbstractSubchannel {
        @Override // io.grpc.LoadBalancer.Subchannel
        public final List b() {
            throw null;
        }

        @Override // io.grpc.LoadBalancer.Subchannel
        public final Attributes c() {
            return Attributes.b;
        }

        @Override // io.grpc.LoadBalancer.Subchannel
        public final Object e() {
            return null;
        }

        @Override // io.grpc.LoadBalancer.Subchannel
        public final void f() {
            throw null;
        }

        @Override // io.grpc.LoadBalancer.Subchannel
        public final void g() {
            Status.n.i("OobChannel is shutdown");
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.OobChannel$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24062a;

        static {
            int[] iArr = new int[ConnectivityState.values().length];
            f24062a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24062a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24062a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        Logger.getLogger(OobChannel.class.getName());
    }

    @Override // io.grpc.Channel
    public final String a() {
        return null;
    }

    @Override // io.grpc.InternalWithLogId
    public final InternalLogId b() {
        return null;
    }

    @Override // io.grpc.Channel
    public final ClientCall h(MethodDescriptor methodDescriptor, CallOptions callOptions) {
        Executor executor = callOptions.b;
        if (executor == null) {
            executor = null;
        }
        return new ClientCallImpl(methodDescriptor, executor, callOptions, null, null, null);
    }

    @Override // io.grpc.ManagedChannel
    public final ConnectivityState j() {
        return ConnectivityState.g;
    }

    @Override // io.grpc.ManagedChannel
    public final ManagedChannel l() {
        Status.n.i("OobChannel.shutdownNow() called");
        throw null;
    }

    public final String toString() {
        MoreObjects.b(this);
        throw null;
    }
}
