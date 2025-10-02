package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: classes7.dex */
public final class CompanionObjectMappingUtilsKt {
    public static final boolean a(ClassDescriptor classDescriptor) {
        LinkedHashSet linkedHashSet = CompanionObjectMapping.f24309a;
        if (!DescriptorUtils.l(classDescriptor)) {
            return false;
        }
        LinkedHashSet linkedHashSet2 = CompanionObjectMapping.f24309a;
        ClassId classIdF = DescriptorUtilsKt.f(classDescriptor);
        return CollectionsKt.t(linkedHashSet2, classIdF != null ? classIdF.e() : null);
    }
}
