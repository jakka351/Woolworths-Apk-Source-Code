package kotlinx.coroutines.rx2;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.rx2.RxSchedulerKt", f = "RxScheduler.kt", l = {122}, m = "scheduleTask$task")
/* loaded from: classes7.dex */
final class RxSchedulerKt$scheduleTask$task$1 extends ContinuationImpl {
    public CoroutineContext p;
    public /* synthetic */ Object q;
    public int r;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.r |= Integer.MIN_VALUE;
        return RxSchedulerKt.a(null, null, null, this);
    }
}
