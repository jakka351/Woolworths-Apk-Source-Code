package com.google.firestore.v1;

import io.grpc.BindableService;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.MethodDescriptor;
import io.grpc.stub.AbstractAsyncStub;
import io.grpc.stub.AbstractBlockingStub;
import io.grpc.stub.AbstractFutureStub;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.ServerCalls;
import io.grpc.stub.annotations.GrpcGenerated;

@GrpcGenerated
/* loaded from: classes6.dex */
public final class FirestoreGrpc {

    /* renamed from: a, reason: collision with root package name */
    public static volatile MethodDescriptor f15878a;
    public static volatile MethodDescriptor b;

    /* renamed from: com.google.firestore.v1.FirestoreGrpc$1, reason: invalid class name */
    class AnonymousClass1 implements AbstractStub.StubFactory<FirestoreStub> {
        @Override // io.grpc.stub.AbstractStub.StubFactory
        public final AbstractStub a(Channel channel, CallOptions callOptions) {
            return new FirestoreStub(channel, callOptions);
        }
    }

    /* renamed from: com.google.firestore.v1.FirestoreGrpc$2, reason: invalid class name */
    class AnonymousClass2 implements AbstractStub.StubFactory<FirestoreBlockingStub> {
        @Override // io.grpc.stub.AbstractStub.StubFactory
        public final AbstractStub a(Channel channel, CallOptions callOptions) {
            return new FirestoreBlockingStub(channel, callOptions);
        }
    }

    /* renamed from: com.google.firestore.v1.FirestoreGrpc$3, reason: invalid class name */
    class AnonymousClass3 implements AbstractStub.StubFactory<FirestoreFutureStub> {
        @Override // io.grpc.stub.AbstractStub.StubFactory
        public final AbstractStub a(Channel channel, CallOptions callOptions) {
            return new FirestoreFutureStub(channel, callOptions);
        }
    }

    public interface AsyncService {
    }

    public static final class FirestoreBlockingStub extends AbstractBlockingStub<FirestoreBlockingStub> {
    }

    public static final class FirestoreFutureStub extends AbstractFutureStub<FirestoreFutureStub> {
    }

    public static abstract class FirestoreImplBase implements BindableService, AsyncService {
    }

    public static final class FirestoreStub extends AbstractAsyncStub<FirestoreStub> {
    }

    public static final class MethodHandlers<Req, Resp> implements ServerCalls.UnaryMethod<Req, Resp>, ServerCalls.ServerStreamingMethod<Req, Resp>, ServerCalls.ClientStreamingMethod<Req, Resp>, ServerCalls.BidiStreamingMethod<Req, Resp> {
    }

    public static FirestoreStub a(Channel channel) {
        return (FirestoreStub) AbstractAsyncStub.a(new AnonymousClass1(), channel);
    }
}
