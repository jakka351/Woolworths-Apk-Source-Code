package io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.firebase.firestore.remote.h;
import io.grpc.CallOptions;
import io.grpc.ClientCall;
import io.grpc.ConnectivityState;
import io.grpc.ManagedChannel;
import io.grpc.MethodDescriptor;

/* loaded from: classes7.dex */
abstract class ForwardingManagedChannel extends ManagedChannel {

    /* renamed from: a, reason: collision with root package name */
    public final ManagedChannel f24012a;

    public ForwardingManagedChannel(ManagedChannel managedChannel) {
        this.f24012a = managedChannel;
    }

    @Override // io.grpc.Channel
    public final String a() {
        return this.f24012a.a();
    }

    @Override // io.grpc.Channel
    public final ClientCall h(MethodDescriptor methodDescriptor, CallOptions callOptions) {
        return this.f24012a.h(methodDescriptor, callOptions);
    }

    @Override // io.grpc.ManagedChannel
    public final void i() {
        this.f24012a.i();
    }

    @Override // io.grpc.ManagedChannel
    public final ConnectivityState j() {
        return this.f24012a.j();
    }

    @Override // io.grpc.ManagedChannel
    public final void k(ConnectivityState connectivityState, h hVar) {
        this.f24012a.k(connectivityState, hVar);
    }

    @Override // io.grpc.ManagedChannel
    public ManagedChannel l() {
        return this.f24012a.l();
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f24012a, "delegate");
        return toStringHelperB.toString();
    }
}
