package kotlinx.coroutines.rx2;

import io.reactivex.internal.operators.single.SingleCreate;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-rx2"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RxSingleKt {
    public static SingleCreate a(Function2 function2) {
        return new SingleCreate(new e(EmptyCoroutineContext.d, function2, 1));
    }
}
