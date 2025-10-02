package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.text.Regex;

/* loaded from: classes7.dex */
class KDeclarationContainerImpl$$Lambda$0 implements Function2 {
    public static final KDeclarationContainerImpl$$Lambda$0 d = new KDeclarationContainerImpl$$Lambda$0();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Regex regex = KDeclarationContainerImpl.d;
        Integer numB = DescriptorVisibilities.b((DescriptorVisibility) obj, (DescriptorVisibility) obj2);
        return Integer.valueOf(numB != null ? numB.intValue() : 0);
    }
}
