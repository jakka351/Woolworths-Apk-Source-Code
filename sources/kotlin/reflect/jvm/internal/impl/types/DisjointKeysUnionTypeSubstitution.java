package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes7.dex */
public final class DisjointKeysUnionTypeSubstitution extends TypeSubstitution {
    public final TypeSubstitution b;
    public final TypeSubstitution c;

    public static final class Companion {
    }

    public DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        this.b = typeSubstitution;
        this.c = typeSubstitution2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean a() {
        return this.b.a() || this.c.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean b() {
        return this.b.b() || this.c.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final Annotations d(Annotations annotations) {
        Intrinsics.h(annotations, "annotations");
        return this.c.d(this.b.d(annotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final TypeProjection e(KotlinType kotlinType) {
        TypeProjection typeProjectionE = this.b.e(kotlinType);
        return typeProjectionE == null ? this.c.e(kotlinType) : typeProjectionE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final KotlinType g(KotlinType topLevelType, Variance position) {
        Intrinsics.h(topLevelType, "topLevelType");
        Intrinsics.h(position, "position");
        return this.c.g(this.b.g(topLevelType, position), position);
    }
}
