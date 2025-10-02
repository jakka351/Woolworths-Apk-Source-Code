package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;

/* loaded from: classes7.dex */
class BuiltInsLoader$Companion$$Lambda$0 implements Function0 {
    public static final BuiltInsLoader$Companion$$Lambda$0 d = new BuiltInsLoader$Companion$$Lambda$0();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BuiltInsLoader.Companion companion = BuiltInsLoader.Companion.f24308a;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
        Intrinsics.e(serviceLoaderLoad);
        BuiltInsLoader builtInsLoader = (BuiltInsLoader) CollectionsKt.E(serviceLoaderLoad);
        if (builtInsLoader != null) {
            return builtInsLoader;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
