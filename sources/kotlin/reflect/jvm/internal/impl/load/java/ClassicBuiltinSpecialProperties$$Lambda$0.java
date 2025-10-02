package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes7.dex */
class ClassicBuiltinSpecialProperties$$Lambda$0 implements Function1 {
    public static final ClassicBuiltinSpecialProperties$$Lambda$0 d = new ClassicBuiltinSpecialProperties$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
        Intrinsics.h(it, "it");
        return Boolean.valueOf(ClassicBuiltinSpecialProperties.b(it));
    }
}
