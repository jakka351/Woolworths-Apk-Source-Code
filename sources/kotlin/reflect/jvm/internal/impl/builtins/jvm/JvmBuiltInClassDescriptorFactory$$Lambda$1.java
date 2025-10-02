package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* loaded from: classes.dex */
class JvmBuiltInClassDescriptorFactory$$Lambda$1 implements Function1 {
    public static final JvmBuiltInClassDescriptorFactory$$Lambda$1 d = new JvmBuiltInClassDescriptorFactory$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ModuleDescriptor module = (ModuleDescriptor) obj;
        JvmBuiltInClassDescriptorFactory.Companion companion = JvmBuiltInClassDescriptorFactory.d;
        Intrinsics.h(module, "module");
        List listK = module.L(JvmBuiltInClassDescriptorFactory.f).K();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listK) {
            if (obj2 instanceof BuiltInsPackageFragment) {
                arrayList.add(obj2);
            }
        }
        return (BuiltInsPackageFragment) CollectionsKt.D(arrayList);
    }
}
