package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class FindClassInModuleKt {
    public static final ClassDescriptor a(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.h(moduleDescriptor, "<this>");
        Intrinsics.h(classId, "classId");
        ClassifierDescriptor classifierDescriptorB = b(moduleDescriptor, classId);
        if (classifierDescriptorB instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorB;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor b(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r7, kotlin.reflect.jvm.internal.impl.name.ClassId r8) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.b(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, kotlin.reflect.jvm.internal.impl.name.ClassId):kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor");
    }

    public static final ClassDescriptor c(ModuleDescriptor moduleDescriptor, ClassId classId, NotFoundClasses notFoundClasses) {
        Intrinsics.h(moduleDescriptor, "<this>");
        Intrinsics.h(classId, "classId");
        Intrinsics.h(notFoundClasses, "notFoundClasses");
        ClassDescriptor classDescriptorA = a(moduleDescriptor, classId);
        return classDescriptorA != null ? classDescriptorA : notFoundClasses.a(classId, SequencesKt.x(SequencesKt.r(SequencesKt.m(classId, FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1.d), FindClassInModuleKt$$Lambda$0.d)));
    }
}
