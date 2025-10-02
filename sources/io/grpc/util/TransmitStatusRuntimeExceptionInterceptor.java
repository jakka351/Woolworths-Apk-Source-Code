package io.grpc.util;

import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Attributes;
import io.grpc.ExperimentalApi;
import io.grpc.ForwardingServerCall;
import io.grpc.ForwardingServerCallListener;
import io.grpc.Metadata;
import io.grpc.ServerInterceptor;
import io.grpc.Status;

@ExperimentalApi
/* loaded from: classes7.dex */
public final class TransmitStatusRuntimeExceptionInterceptor implements ServerInterceptor {

    /* renamed from: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor$1, reason: invalid class name */
    class AnonymousClass1 extends ForwardingServerCallListener.SimpleForwardingServerCallListener<Object> {
    }

    public static class SerializingServerCall<ReqT, RespT> extends ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f24184a;

        /* renamed from: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor$SerializingServerCall$7, reason: invalid class name */
        class AnonymousClass7 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor$SerializingServerCall$8, reason: invalid class name */
        class AnonymousClass8 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        public final void a(final Status status, final Metadata metadata) {
            new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.4
                @Override // java.lang.Runnable
                public final void run() {
                    SerializingServerCall serializingServerCall = SerializingServerCall.this;
                    if (serializingServerCall.f24184a) {
                        return;
                    }
                    serializingServerCall.f24184a = true;
                    SerializingServerCall.super.a(status, metadata);
                }
            };
            throw null;
        }

        @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        public final Attributes b() {
            final SettableFuture settableFuture = new SettableFuture();
            new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.9
                @Override // java.lang.Runnable
                public final void run() {
                    settableFuture.m(SerializingServerCall.super.b());
                }
            };
            throw null;
        }

        @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        public final String c() {
            final SettableFuture settableFuture = new SettableFuture();
            new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.10
                @Override // java.lang.Runnable
                public final void run() {
                    settableFuture.m(SerializingServerCall.super.c());
                }
            };
            throw null;
        }

        @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        public final boolean d() {
            final SettableFuture settableFuture = new SettableFuture();
            new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.6
                @Override // java.lang.Runnable
                public final void run() {
                    settableFuture.m(Boolean.valueOf(SerializingServerCall.super.d()));
                }
            };
            throw null;
        }

        @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        public final boolean e() {
            final SettableFuture settableFuture = new SettableFuture();
            new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.5
                @Override // java.lang.Runnable
                public final void run() {
                    settableFuture.m(Boolean.valueOf(SerializingServerCall.super.e()));
                }
            };
            throw null;
        }

        @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        public final void f(final int i) {
            new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.2
                @Override // java.lang.Runnable
                public final void run() {
                    SerializingServerCall.super.f(i);
                }
            };
            throw null;
        }

        @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        public final void g(final Metadata metadata) {
            new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.3
                @Override // java.lang.Runnable
                public final void run() {
                    SerializingServerCall.super.g(metadata);
                }
            };
            throw null;
        }

        @Override // io.grpc.ForwardingServerCall, io.grpc.ServerCall
        public final void h(final Object obj) {
            new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.1
                @Override // java.lang.Runnable
                public final void run() {
                    SerializingServerCall.super.h(obj);
                }
            };
            throw null;
        }
    }
}
