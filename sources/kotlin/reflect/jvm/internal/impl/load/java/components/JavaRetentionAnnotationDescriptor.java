package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class JavaRetentionAnnotationDescriptor extends JavaAnnotationDescriptor {
    public static final /* synthetic */ KProperty[] h = {Reflection.f24268a.h(new PropertyReference1Impl(JavaRetentionAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};
    public final NotNullLazyValue g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor(JavaAnnotation annotation, LazyJavaResolverContext c) {
        super(c, annotation, StandardNames.FqNames.w);
        Intrinsics.h(annotation, "annotation");
        Intrinsics.h(c, "c");
        this.g = c.f24425a.f24422a.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor$$Lambda$0
            public final JavaRetentionAnnotationDescriptor d;

            {
                this.d = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KotlinRetention kotlinRetention;
                KProperty[] kPropertyArr = JavaRetentionAnnotationDescriptor.h;
                Object obj = JavaAnnotationTargetMapper.f24417a;
                JavaAnnotationArgument javaAnnotationArgument = this.d.d;
                JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument ? (JavaEnumValueAnnotationArgument) javaAnnotationArgument : null;
                EnumValue enumValue = (javaEnumValueAnnotationArgument == null || (kotlinRetention = (KotlinRetention) JavaAnnotationTargetMapper.b.get(javaEnumValueAnnotationArgument.d().b())) == null) ? null : new EnumValue(ClassId.Companion.b(StandardNames.FqNames.v), Name.e(kotlinRetention.name()));
                Map mapI = enumValue != null ? MapsKt.i(new Pair(JavaAnnotationMapper.c, enumValue)) : null;
                return mapI == null ? EmptyMap.d : mapI;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final Map b() {
        return (Map) StorageKt.a(this.g, h[0]);
    }
}
