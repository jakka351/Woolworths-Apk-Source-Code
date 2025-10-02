package kotlin.reflect.jvm.internal.calls;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;

/* loaded from: classes7.dex */
class ValueClassAwareCaller$$Lambda$0 implements Function1 {
    public static final ValueClassAwareCaller$$Lambda$0 d = new ValueClassAwareCaller$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClassDescriptor makeKotlinParameterTypes = (ClassDescriptor) obj;
        Intrinsics.h(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
        return Boolean.valueOf(InlineClassesUtilsKt.f(makeKotlinParameterTypes));
    }
}
