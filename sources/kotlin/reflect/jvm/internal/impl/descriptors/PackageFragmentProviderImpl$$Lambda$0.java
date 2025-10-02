package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
class PackageFragmentProviderImpl$$Lambda$0 implements Function1 {
    public static final PackageFragmentProviderImpl$$Lambda$0 d = new PackageFragmentProviderImpl$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PackageFragmentDescriptor it = (PackageFragmentDescriptor) obj;
        Intrinsics.h(it, "it");
        return it.d();
    }
}
