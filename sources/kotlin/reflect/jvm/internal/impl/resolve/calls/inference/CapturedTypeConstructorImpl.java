package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;

/* loaded from: classes7.dex */
public final class CapturedTypeConstructorImpl implements CapturedTypeConstructor {

    /* renamed from: a, reason: collision with root package name */
    public final TypeProjection f24537a;
    public NewCapturedTypeConstructor b;

    public CapturedTypeConstructorImpl(TypeProjection projection) {
        Intrinsics.h(projection, "projection");
        this.f24537a = projection;
        projection.b();
        Variance variance = Variance.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final Collection a() {
        TypeProjection typeProjection = this.f24537a;
        KotlinType type = typeProjection.b() == Variance.h ? typeProjection.getType() : p().p();
        Intrinsics.e(type);
        return CollectionsKt.Q(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final /* bridge */ /* synthetic */ ClassifierDescriptor c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean d() {
        return false;
    }

    public final NewCapturedTypeConstructor e() {
        return this.b;
    }

    public final void f(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.b = newCapturedTypeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    public final TypeProjection getProjection() {
        return this.f24537a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final KotlinBuiltIns p() {
        KotlinBuiltIns kotlinBuiltInsP = this.f24537a.getType().J0().p();
        Intrinsics.g(kotlinBuiltInsP, "getBuiltIns(...)");
        return kotlinBuiltInsP;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f24537a + ')';
    }
}
