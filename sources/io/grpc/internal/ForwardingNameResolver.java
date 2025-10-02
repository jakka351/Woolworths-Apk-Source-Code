package io.grpc.internal;

import com.google.common.base.MoreObjects;
import io.grpc.NameResolver;

/* loaded from: classes7.dex */
abstract class ForwardingNameResolver extends NameResolver {

    /* renamed from: a, reason: collision with root package name */
    public final NameResolver f24013a;

    public ForwardingNameResolver(NameResolver nameResolver) {
        this.f24013a = nameResolver;
    }

    @Override // io.grpc.NameResolver
    public String a() {
        return this.f24013a.a();
    }

    @Override // io.grpc.NameResolver
    public final void b() {
        this.f24013a.b();
    }

    @Override // io.grpc.NameResolver
    public void c() {
        this.f24013a.c();
    }

    @Override // io.grpc.NameResolver
    public final void d(NameResolver.Listener2 listener2) {
        this.f24013a.d(listener2);
    }

    @Override // io.grpc.NameResolver
    public void e(NameResolver.Listener2 listener2) {
        this.f24013a.e(listener2);
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f24013a, "delegate");
        return toStringHelperB.toString();
    }
}
