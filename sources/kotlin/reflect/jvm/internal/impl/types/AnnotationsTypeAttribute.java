package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;

/* loaded from: classes7.dex */
public final class AnnotationsTypeAttribute extends TypeAttribute<AnnotationsTypeAttribute> {

    /* renamed from: a, reason: collision with root package name */
    public final Annotations f24601a;

    public AnnotationsTypeAttribute(Annotations annotations) {
        Intrinsics.h(annotations, "annotations");
        this.f24601a = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public final AnnotationsTypeAttribute a(TypeAttribute typeAttribute) {
        AnnotationsTypeAttribute annotationsTypeAttribute = (AnnotationsTypeAttribute) typeAttribute;
        return annotationsTypeAttribute == null ? this : new AnnotationsTypeAttribute(AnnotationsKt.a(this.f24601a, annotationsTypeAttribute.f24601a));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public final KClass b() {
        return Reflection.f24268a.b(AnnotationsTypeAttribute.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public final AnnotationsTypeAttribute c(TypeAttribute typeAttribute) {
        if (Intrinsics.c((AnnotationsTypeAttribute) typeAttribute, this)) {
            return this;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnnotationsTypeAttribute) {
            return Intrinsics.c(((AnnotationsTypeAttribute) obj).f24601a, this.f24601a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24601a.hashCode();
    }
}
