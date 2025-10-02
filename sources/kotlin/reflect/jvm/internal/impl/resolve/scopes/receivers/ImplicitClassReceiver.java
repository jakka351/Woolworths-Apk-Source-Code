package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes7.dex */
public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final ClassDescriptor f24560a;
    public final ClassDescriptor b;

    public ImplicitClassReceiver(ClassDescriptor classDescriptor) {
        this.f24560a = classDescriptor;
        this.b = classDescriptor;
    }

    public final boolean equals(Object obj) {
        ImplicitClassReceiver implicitClassReceiver = obj instanceof ImplicitClassReceiver ? (ImplicitClassReceiver) obj : null;
        return Intrinsics.c(this.f24560a, implicitClassReceiver != null ? implicitClassReceiver.f24560a : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public final KotlinType getType() {
        SimpleType simpleTypeT = this.f24560a.t();
        Intrinsics.g(simpleTypeT, "getDefaultType(...)");
        return simpleTypeT;
    }

    public final int hashCode() {
        return this.f24560a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    public final ClassDescriptor l() {
        return this.f24560a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        SimpleType simpleTypeT = this.f24560a.t();
        Intrinsics.g(simpleTypeT, "getDefaultType(...)");
        sb.append(simpleTypeT);
        sb.append('}');
        return sb.toString();
    }
}
