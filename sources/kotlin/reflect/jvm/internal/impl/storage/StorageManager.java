package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface StorageManager {
    NotNullLazyValue a(Function0 function0, Function1 function1, Function1 function12);

    MemoizedFunctionToNullable b(Function1 function1);

    CacheWithNotNullValues c();

    NotNullLazyValue d(Function0 function0);

    NullableLazyValue e(Function0 function0);

    NotNullLazyValue f(Function0 function0);

    MemoizedFunctionToNotNull g(Function1 function1);
}
