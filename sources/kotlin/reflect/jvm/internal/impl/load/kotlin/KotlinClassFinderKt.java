package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes.dex */
public final class KotlinClassFinderKt {
    public static final KotlinJvmBinaryClass a(KotlinClassFinder kotlinClassFinder, ClassId classId, MetadataVersion metadataVersion) {
        Intrinsics.h(kotlinClassFinder, "<this>");
        Intrinsics.h(classId, "classId");
        Intrinsics.h(metadataVersion, "metadataVersion");
        KotlinClassFinder.Result.KotlinClass kotlinClassA = kotlinClassFinder.a(classId, metadataVersion);
        if (kotlinClassA != null) {
            return kotlinClassA.f24473a;
        }
        return null;
    }
}
