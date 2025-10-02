package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.util.NullableArrayMapAccessor;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AnnotationsTypeAttributeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f24602a;
    public static final NullableArrayMapAccessor b;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AnnotationsTypeAttributeKt.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        f24602a = new KProperty[]{reflectionFactory.h(propertyReference1Impl)};
        TypeAttributes.Companion companion = TypeAttributes.e;
        KClass kClassB = reflectionFactory.b(AnnotationsTypeAttribute.class);
        companion.getClass();
        b = new NullableArrayMapAccessor(companion.b(kClassB));
    }

    public static final Annotations a(TypeAttributes typeAttributes) {
        Annotations annotations;
        Intrinsics.h(typeAttributes, "<this>");
        AnnotationsTypeAttribute annotationsTypeAttribute = (AnnotationsTypeAttribute) b.getValue(typeAttributes, f24602a[0]);
        return (annotationsTypeAttribute == null || (annotations = annotationsTypeAttribute.f24601a) == null) ? Annotations.Companion.f24350a : annotations;
    }
}
