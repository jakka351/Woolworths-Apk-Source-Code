package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;

/* loaded from: classes.dex */
public final class DefaultTypeAttributeTranslator implements TypeAttributeTranslator {

    /* renamed from: a, reason: collision with root package name */
    public static final DefaultTypeAttributeTranslator f24604a = new DefaultTypeAttributeTranslator();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator
    public final TypeAttributes a(Annotations annotations) {
        Intrinsics.h(annotations, "annotations");
        if (annotations.isEmpty()) {
            TypeAttributes.e.getClass();
            return TypeAttributes.f;
        }
        TypeAttributes.Companion companion = TypeAttributes.e;
        List listQ = CollectionsKt.Q(new AnnotationsTypeAttribute(annotations));
        companion.getClass();
        return TypeAttributes.Companion.c(listQ);
    }
}
