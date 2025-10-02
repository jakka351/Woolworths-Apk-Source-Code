package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes7.dex */
public abstract class TypeSubstitution {

    /* renamed from: a, reason: collision with root package name */
    public static final TypeSubstitution$Companion$EMPTY$1 f24618a = new TypeSubstitution$Companion$EMPTY$1();

    public static final class Companion {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final TypeSubstitutor c() {
        return new TypeSubstitutor(this);
    }

    public Annotations d(Annotations annotations) {
        Intrinsics.h(annotations, "annotations");
        return annotations;
    }

    public abstract TypeProjection e(KotlinType kotlinType);

    public boolean f() {
        return this instanceof TypeSubstitution$Companion$EMPTY$1;
    }

    public KotlinType g(KotlinType topLevelType, Variance position) {
        Intrinsics.h(topLevelType, "topLevelType");
        Intrinsics.h(position, "position");
        return topLevelType;
    }
}
