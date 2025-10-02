package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class BufferedChannel$bindCancellationFunResult$1 extends FunctionReferenceImpl implements Function3<Throwable, ChannelResult<Object>, CoroutineContext, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4 = ((ChannelResult) obj2).f24699a;
        ((BufferedChannel) this.receiver).getClass();
        Intrinsics.e(null);
        Object objB = ChannelResult.b(obj4);
        Intrinsics.e(objB);
        OnUndeliveredElementKt.a(null, objB, (CoroutineContext) obj3);
        return Unit.f24250a;
    }
}
