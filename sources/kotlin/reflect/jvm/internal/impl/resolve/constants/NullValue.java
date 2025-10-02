package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes7.dex */
public final class NullValue extends ConstantValue<Void> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final KotlinType a(ModuleDescriptor module) {
        Intrinsics.h(module, "module");
        SimpleType simpleTypeN0 = module.p().o().N0(true);
        if (simpleTypeN0 != null) {
            return simpleTypeN0;
        }
        KotlinBuiltIns.a(50);
        throw null;
    }
}
