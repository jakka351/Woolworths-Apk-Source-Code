package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
class OperatorChecks$$Lambda$2 implements Function1 {
    public static final OperatorChecks$$Lambda$2 d = new OperatorChecks$$Lambda$2();

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r7 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r7
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.f24645a
            java.lang.String r0 = "$this$Checks"
            kotlin.jvm.internal.Intrinsics.h(r7, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r0 = r7.c0()
            if (r0 != 0) goto L13
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r0 = r7.e0()
        L13:
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L73
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r7.getReturnType()
            if (r3 == 0) goto L2b
            kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = r0.getType()
            java.lang.String r5 = "getType(...)"
            kotlin.jvm.internal.Intrinsics.g(r4, r5)
            boolean r3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.l(r3, r4)
            goto L2c
        L2b:
            r3 = r2
        L2c:
            if (r3 != 0) goto L72
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue r0 = r0.getValue()
            java.lang.String r3 = "getValue(...)"
            kotlin.jvm.internal.Intrinsics.g(r0, r3)
            boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver
            if (r3 != 0) goto L3d
        L3b:
            r7 = r2
            goto L70
        L3d:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver r0 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver) r0
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r0 = r0.f24560a
            boolean r3 = r0.p0()
            if (r3 != 0) goto L48
            goto L3b
        L48:
            kotlin.reflect.jvm.internal.impl.name.ClassId r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.f(r0)
            if (r3 != 0) goto L4f
            goto L3b
        L4f:
            kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.j(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r0 = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.b(r0, r3)
            boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
            if (r3 == 0) goto L5e
            kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) r0
            goto L5f
        L5e:
            r0 = r1
        L5f:
            if (r0 != 0) goto L62
            goto L3b
        L62:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r7 = r7.getReturnType()
            if (r7 == 0) goto L3b
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r0.Z()
            boolean r7 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.l(r7, r0)
        L70:
            if (r7 == 0) goto L73
        L72:
            r2 = 1
        L73:
            if (r2 != 0) goto L78
            java.lang.String r7 = "receiver must be a supertype of the return type"
            return r7
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$$Lambda$2.invoke(java.lang.Object):java.lang.Object");
    }
}
