package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.InternalCoroutinesApi;

@InternalCoroutinesApi
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/selects/SelectInstance;", "R", "", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SelectInstance<R> {
    void c(Object obj);

    void d(DisposableHandle disposableHandle);

    boolean e(Object obj, Object obj2);
}
