package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes7.dex */
public class DelegatedTypeSubstitution extends TypeSubstitution {
    public final TypeSubstitution b;

    public DelegatedTypeSubstitution(TypeSubstitution typeSubstitution) {
        this.b = typeSubstitution;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean a() {
        return this.b.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean b() {
        return this.b.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final Annotations d(Annotations annotations) {
        Intrinsics.h(annotations, "annotations");
        return this.b.d(annotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public TypeProjection e(KotlinType kotlinType) {
        return this.b.e(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean f() {
        return this.b.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final KotlinType g(KotlinType topLevelType, Variance position) {
        Intrinsics.h(topLevelType, "topLevelType");
        Intrinsics.h(position, "position");
        return this.b.g(topLevelType, position);
    }
}
