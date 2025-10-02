package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;

/* loaded from: classes.dex */
public final class JavaClassDataFinder implements ClassDataFinder {

    /* renamed from: a, reason: collision with root package name */
    public final ReflectKotlinClassFinder f24469a;
    public final DeserializedDescriptorResolver b;

    public JavaClassDataFinder(ReflectKotlinClassFinder reflectKotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver) {
        this.f24469a = reflectKotlinClassFinder;
        this.b = deserializedDescriptorResolver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public final ClassData a(ClassId classId) {
        Intrinsics.h(classId, "classId");
        DeserializedDescriptorResolver deserializedDescriptorResolver = this.b;
        deserializedDescriptorResolver.c().c.getClass();
        KotlinJvmBinaryClass kotlinJvmBinaryClassA = KotlinClassFinderKt.a(this.f24469a, classId, MetadataVersion.g);
        if (kotlinJvmBinaryClassA == null) {
            return null;
        }
        ReflectClassUtilKt.a(((ReflectKotlinClass) kotlinJvmBinaryClassA).f24366a).equals(classId);
        return deserializedDescriptorResolver.f(kotlinJvmBinaryClassA);
    }
}
