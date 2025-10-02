package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: classes7.dex */
class OperatorChecks$$Lambda$0 implements Function1 {
    public static final OperatorChecks$$Lambda$0 d = new OperatorChecks$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FunctionDescriptor Checks = (FunctionDescriptor) obj;
        List list = OperatorChecks.f24645a;
        Intrinsics.h(Checks, "$this$Checks");
        List listH = Checks.h();
        Intrinsics.g(listH, "getValueParameters(...)");
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.P(listH);
        if (valueParameterDescriptor == null || DescriptorUtilsKt.a(valueParameterDescriptor) || valueParameterDescriptor.y0() != null) {
            return "last parameter should not have a default value or be a vararg";
        }
        return null;
    }
}
