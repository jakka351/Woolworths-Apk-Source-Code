package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class JavaToKotlinClassMapper {
    public static ClassDescriptor a(ClassDescriptor classDescriptor) {
        FqNameUnsafe fqNameUnsafeG = DescriptorUtils.g(classDescriptor);
        String str = JavaToKotlinClassMap.f24321a;
        FqName fqName = (FqName) JavaToKotlinClassMap.k.get(fqNameUnsafeG);
        if (fqName != null) {
            return DescriptorUtilsKt.e(classDescriptor).j(fqName);
        }
        throw new IllegalArgumentException("Given class " + classDescriptor + " is not a read-only collection");
    }

    public static ClassDescriptor b(FqName fqName, KotlinBuiltIns builtIns) {
        Intrinsics.h(builtIns, "builtIns");
        String str = JavaToKotlinClassMap.f24321a;
        ClassId classId = (ClassId) JavaToKotlinClassMap.h.get(fqName.f24500a);
        if (classId != null) {
            return builtIns.j(classId.a());
        }
        return null;
    }
}
