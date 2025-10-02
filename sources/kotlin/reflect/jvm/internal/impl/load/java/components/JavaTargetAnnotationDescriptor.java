package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class JavaTargetAnnotationDescriptor extends JavaAnnotationDescriptor {
    public static final /* synthetic */ KProperty[] h = {Reflection.f24268a.h(new PropertyReference1Impl(JavaTargetAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};
    public final NotNullLazyValue g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor(JavaAnnotation annotation, LazyJavaResolverContext c) {
        super(c, annotation, StandardNames.FqNames.t);
        Intrinsics.h(annotation, "annotation");
        Intrinsics.h(c, "c");
        this.g = c.f24425a.f24422a.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor$$Lambda$0
            public final JavaTargetAnnotationDescriptor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ArrayValue arrayValueA;
                KProperty[] kPropertyArr = JavaTargetAnnotationDescriptor.h;
                JavaAnnotationArgument javaAnnotationArgument = this.d.d;
                if (javaAnnotationArgument instanceof JavaArrayAnnotationArgument) {
                    Object obj = JavaAnnotationTargetMapper.f24417a;
                    arrayValueA = JavaAnnotationTargetMapper.a(((JavaArrayAnnotationArgument) javaAnnotationArgument).getElements());
                } else if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
                    Object obj2 = JavaAnnotationTargetMapper.f24417a;
                    arrayValueA = JavaAnnotationTargetMapper.a(CollectionsKt.Q(javaAnnotationArgument));
                } else {
                    arrayValueA = null;
                }
                Map mapI = arrayValueA != null ? MapsKt.i(new Pair(JavaAnnotationMapper.b, arrayValueA)) : null;
                return mapI == null ? EmptyMap.d : mapI;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final Map b() {
        return (Map) StorageKt.a(this.g, h[0]);
    }
}
