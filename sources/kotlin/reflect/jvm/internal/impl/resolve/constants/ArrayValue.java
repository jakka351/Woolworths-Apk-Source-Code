package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes7.dex */
public class ArrayValue extends ConstantValue<List<? extends ConstantValue<?>>> {
    public final Function1 b;

    public ArrayValue(List list, Function1 function1) {
        super(list);
        this.b = function1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final KotlinType a(ModuleDescriptor module) {
        Intrinsics.h(module, "module");
        KotlinType kotlinType = (KotlinType) this.b.invoke(module);
        if (!KotlinBuiltIns.z(kotlinType) && !KotlinBuiltIns.G(kotlinType) && !KotlinBuiltIns.C(kotlinType, StandardNames.FqNames.W.f24500a) && !KotlinBuiltIns.C(kotlinType, StandardNames.FqNames.X.f24500a) && !KotlinBuiltIns.C(kotlinType, StandardNames.FqNames.Y.f24500a)) {
            KotlinBuiltIns.C(kotlinType, StandardNames.FqNames.Z.f24500a);
        }
        return kotlinType;
    }
}
