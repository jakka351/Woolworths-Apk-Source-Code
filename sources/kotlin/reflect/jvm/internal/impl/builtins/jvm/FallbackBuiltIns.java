package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* loaded from: classes7.dex */
final class FallbackBuiltIns extends KotlinBuiltIns {
    public static final KotlinBuiltIns g;

    public static final class Companion {
        public static KotlinBuiltIns a() {
            return FallbackBuiltIns.g;
        }
    }

    static {
        FallbackBuiltIns fallbackBuiltIns = new FallbackBuiltIns(new LockBasedStorageManager("FallbackBuiltIns"));
        fallbackBuiltIns.c(true);
        g = fallbackBuiltIns;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public final /* bridge */ /* synthetic */ PlatformDependentDeclarationFilter q() {
        return PlatformDependentDeclarationFilter.All.f24353a;
    }
}
