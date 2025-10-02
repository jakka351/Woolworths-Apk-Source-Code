package androidx.work.impl.constraints;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/work/impl/constraints/ConstraintsState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NetworkRequestConstraintController$track$1$onConstraintState$1 extends Lambda implements Function1<ConstraintsState, Unit> {
    public final /* synthetic */ Job h;
    public final /* synthetic */ ProducerScope i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestConstraintController$track$1$onConstraintState$1(Job job, ProducerScope producerScope) {
        super(1);
        this.h = job;
        this.i = producerScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConstraintsState it = (ConstraintsState) obj;
        Intrinsics.h(it, "it");
        ((JobSupport) this.h).cancel((CancellationException) null);
        this.i.k(it);
        return Unit.f24250a;
    }
}
