package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.Check;

@SourceDebugExtension
/* loaded from: classes7.dex */
final class NoDefaultAndVarargsCheck implements Check {

    /* renamed from: a, reason: collision with root package name */
    public static final NoDefaultAndVarargsCheck f24644a = new NoDefaultAndVarargsCheck();

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
        List listH = javaMethodDescriptor.h();
        Intrinsics.g(listH, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = listH;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (ValueParameterDescriptor valueParameterDescriptor : list) {
            Intrinsics.e(valueParameterDescriptor);
            if (DescriptorUtilsKt.a(valueParameterDescriptor) || valueParameterDescriptor.y0() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String b(JavaMethodDescriptor javaMethodDescriptor) {
        return Check.DefaultImpls.a(this, javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String getDescription() {
        return "should not have varargs or parameters with default values";
    }
}
