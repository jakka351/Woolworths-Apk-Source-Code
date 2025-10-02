package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BuiltinMethodsWithSpecialGenericSignature extends SpecialGenericSignatures {
    public static final /* synthetic */ int l = 0;

    public static final FunctionDescriptor a(FunctionDescriptor functionDescriptor) {
        Intrinsics.h(functionDescriptor, "functionDescriptor");
        Name name = functionDescriptor.getName();
        Intrinsics.g(name, "getName(...)");
        if (b(name)) {
            return (FunctionDescriptor) DescriptorUtilsKt.b(functionDescriptor, BuiltinMethodsWithSpecialGenericSignature$$Lambda$0.d);
        }
        return null;
    }

    public static boolean b(Name name) {
        Intrinsics.h(name, "<this>");
        return SpecialGenericSignatures.e.contains(name);
    }
}
