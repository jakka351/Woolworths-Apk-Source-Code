package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes7.dex */
public final class DefaultBuiltIns extends KotlinBuiltIns {
    public static final Lazy g = LazyKt.b(DefaultBuiltIns$$Lambda$0.d);

    public static final class Companion {
        public static DefaultBuiltIns a() {
            return (DefaultBuiltIns) DefaultBuiltIns.g.getD();
        }
    }
}
