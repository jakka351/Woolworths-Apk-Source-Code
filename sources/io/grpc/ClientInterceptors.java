package io.grpc;

import com.google.common.base.Preconditions;
import com.google.protobuf.GeneratedMessageLite;
import io.grpc.ClientCall;
import io.grpc.MethodDescriptor;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class ClientInterceptors {

    /* renamed from: a, reason: collision with root package name */
    public static final ClientCall f23922a = new AnonymousClass2();

    /* renamed from: io.grpc.ClientInterceptors$1, reason: invalid class name */
    class AnonymousClass1 implements ClientInterceptor {

        /* renamed from: io.grpc.ClientInterceptors$1$1, reason: invalid class name and collision with other inner class name */
        class C04011 extends PartialForwardingClientCall<Object, Object> {

            /* renamed from: io.grpc.ClientInterceptors$1$1$1, reason: invalid class name and collision with other inner class name */
            class C04021 extends PartialForwardingClientCallListener<Object> {
                @Override // io.grpc.ClientCall.Listener
                public final void c(Object obj) {
                    throw null;
                }

                @Override // io.grpc.PartialForwardingClientCallListener
                public final ClientCall.Listener e() {
                    return null;
                }
            }

            @Override // io.grpc.ClientCall
            public final void d(GeneratedMessageLite generatedMessageLite) {
                throw null;
            }

            @Override // io.grpc.ClientCall
            public final void e(ClientCall.Listener listener, Metadata metadata) {
                throw null;
            }

            @Override // io.grpc.PartialForwardingClientCall
            public final ClientCall f() {
                throw null;
            }
        }

        @Override // io.grpc.ClientInterceptor
        public final ClientCall a(MethodDescriptor methodDescriptor, CallOptions callOptions, Channel channel) {
            methodDescriptor.getClass();
            MethodDescriptor.Builder builderB = MethodDescriptor.b();
            builderB.f23963a = null;
            builderB.b = null;
            builderB.c = methodDescriptor.f23962a;
            builderB.d = methodDescriptor.b;
            builderB.e = methodDescriptor.f;
            builderB.f = methodDescriptor.g;
            builderB.a();
            throw null;
        }
    }

    /* renamed from: io.grpc.ClientInterceptors$2, reason: invalid class name */
    public class AnonymousClass2 extends ClientCall<Object, Object> {
        @Override // io.grpc.ClientCall
        public final void a(String str, Throwable th) {
        }

        @Override // io.grpc.ClientCall
        public final void b() {
        }

        @Override // io.grpc.ClientCall
        public final void c() {
        }

        @Override // io.grpc.ClientCall
        public final void d(GeneratedMessageLite generatedMessageLite) {
        }

        @Override // io.grpc.ClientCall
        public final void e(ClientCall.Listener listener, Metadata metadata) {
        }
    }

    public static abstract class CheckedForwardingClientCall<ReqT, RespT> extends ForwardingClientCall<ReqT, RespT> {
        @Override // io.grpc.ForwardingClientCall, io.grpc.ClientCall
        public final void e(ClientCall.Listener listener, Metadata metadata) {
            try {
                g();
            } catch (Exception e) {
                Metadata metadataG = Status.g(e);
                Status statusE = Status.e(e);
                if (metadataG == null) {
                    metadataG = new Metadata();
                }
                listener.a(statusE, metadataG);
            }
        }

        @Override // io.grpc.PartialForwardingClientCall
        public final ClientCall f() {
            return ClientInterceptors.f23922a;
        }

        public abstract void g();
    }

    public static class InterceptorChannel extends Channel {

        /* renamed from: a, reason: collision with root package name */
        public final Channel f23923a;
        public final ClientInterceptor b;

        public InterceptorChannel(Channel channel, ClientInterceptor clientInterceptor) {
            this.f23923a = channel;
            Preconditions.j(clientInterceptor, "interceptor");
            this.b = clientInterceptor;
        }

        @Override // io.grpc.Channel
        public final String a() {
            return this.f23923a.a();
        }

        @Override // io.grpc.Channel
        public final ClientCall h(MethodDescriptor methodDescriptor, CallOptions callOptions) {
            return this.b.a(methodDescriptor, callOptions, this.f23923a);
        }
    }

    public static Channel a(Channel channel, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            channel = new InterceptorChannel(channel, (ClientInterceptor) it.next());
        }
        return channel;
    }
}
