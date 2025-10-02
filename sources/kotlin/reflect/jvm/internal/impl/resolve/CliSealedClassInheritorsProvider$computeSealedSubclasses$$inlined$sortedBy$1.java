package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CliSealedClassInheritorsProvider$computeSealedSubclasses$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a(DescriptorUtilsKt.g((ClassDescriptor) obj).f24500a.f24501a, DescriptorUtilsKt.g((ClassDescriptor) obj2).f24500a.f24501a);
    }
}
