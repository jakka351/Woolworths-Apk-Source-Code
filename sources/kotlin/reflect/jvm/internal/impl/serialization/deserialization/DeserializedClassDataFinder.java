package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class DeserializedClassDataFinder implements ClassDataFinder {

    /* renamed from: a, reason: collision with root package name */
    public final PackageFragmentProviderOptimized f24573a;

    public DeserializedClassDataFinder(PackageFragmentProviderOptimized packageFragmentProviderOptimized) {
        this.f24573a = packageFragmentProviderOptimized;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public final ClassData a(ClassId classId) {
        ClassData classDataA;
        Intrinsics.h(classId, "classId");
        Iterator it = PackageFragmentProviderKt.c(this.f24573a, classId.f24499a).iterator();
        while (it.hasNext()) {
            PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) it.next();
            if ((packageFragmentDescriptor instanceof DeserializedPackageFragment) && (classDataA = ((DeserializedPackageFragment) packageFragmentDescriptor).H0().a(classId)) != null) {
                return classDataA;
            }
        }
        return null;
    }
}
