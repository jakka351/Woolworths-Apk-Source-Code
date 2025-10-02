package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* loaded from: classes7.dex */
class DefaultBuiltIns$$Lambda$0 implements Function0 {
    public static final DefaultBuiltIns$$Lambda$0 d = new DefaultBuiltIns$$Lambda$0();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DefaultBuiltIns defaultBuiltIns = new DefaultBuiltIns(new LockBasedStorageManager("DefaultBuiltIns"));
        defaultBuiltIns.c(false);
        return defaultBuiltIns;
    }
}
