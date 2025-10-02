package kotlinx.coroutines.rx2;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class RxFlowableKt$RX_HANDLER$1 extends FunctionReferenceImpl implements Function2<Throwable, CoroutineContext, Unit> {
    public static final /* synthetic */ int d = 0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RxCancellableKt.a((Throwable) obj, (CoroutineContext) obj2);
        return Unit.f24250a;
    }
}
