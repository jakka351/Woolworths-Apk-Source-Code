package io.grpc;

import io.grpc.MethodDescriptor;
import io.grpc.ServerCall;
import java.io.BufferedInputStream;
import java.io.InputStream;

/* loaded from: classes7.dex */
public final class ServerInterceptors {

    /* renamed from: io.grpc.ServerInterceptors$1, reason: invalid class name */
    class AnonymousClass1 implements MethodDescriptor.Marshaller<InputStream> {
        @Override // io.grpc.MethodDescriptor.Marshaller
        public final InputStream a(Object obj) {
            return (InputStream) obj;
        }

        @Override // io.grpc.MethodDescriptor.Marshaller
        public final Object b(InputStream inputStream) {
            return inputStream.markSupported() ? inputStream : inputStream instanceof KnownLength ? new KnownLengthBufferedInputStream(inputStream) : new BufferedInputStream(inputStream);
        }
    }

    /* renamed from: io.grpc.ServerInterceptors$2, reason: invalid class name */
    class AnonymousClass2 implements ServerCallHandler<Object, Object> {

        /* renamed from: io.grpc.ServerInterceptors$2$1, reason: invalid class name */
        class AnonymousClass1 extends PartialForwardingServerCall<Object, Object> {
            @Override // io.grpc.ServerCall
            public final void h(Object obj) {
                throw null;
            }

            @Override // io.grpc.PartialForwardingServerCall
            public final ServerCall i() {
                throw null;
            }
        }

        /* renamed from: io.grpc.ServerInterceptors$2$2, reason: invalid class name and collision with other inner class name */
        class C04032 extends PartialForwardingServerCallListener<Object> {
            @Override // io.grpc.PartialForwardingServerCallListener
            public final ServerCall.Listener a() {
                throw null;
            }
        }
    }

    public static final class InterceptCallHandler<ReqT, RespT> implements ServerCallHandler<ReqT, RespT> {
    }

    public static final class KnownLengthBufferedInputStream extends BufferedInputStream implements KnownLength {
    }
}
