package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* loaded from: classes7.dex */
class ErasedOverridabilityCondition$$Lambda$0 implements Function1 {
    public static final ErasedOverridabilityCondition$$Lambda$0 d = new ErasedOverridabilityCondition$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ValueParameterDescriptor) obj).getType();
    }
}
