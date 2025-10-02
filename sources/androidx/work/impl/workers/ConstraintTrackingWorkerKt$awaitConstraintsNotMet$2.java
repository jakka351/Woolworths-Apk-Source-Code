package androidx.work.impl.workers;

import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Landroidx/work/impl/constraints/ConstraintsState;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2", f = "ConstraintTrackingWorker.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2 extends SuspendLambda implements Function2<ConstraintsState, Continuation<? super Unit>, Object> {
    public final /* synthetic */ WorkSpec p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2(WorkSpec workSpec, Continuation continuation) {
        super(2, continuation);
        this.p = workSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2 constraintTrackingWorkerKt$awaitConstraintsNotMet$2 = (ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2) create((ConstraintsState) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        constraintTrackingWorkerKt$awaitConstraintsNotMet$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        String str = ConstraintTrackingWorkerKt.f4015a;
        Logger.e().a(str, "Constraints changed for " + this.p);
        return Unit.f24250a;
    }
}
