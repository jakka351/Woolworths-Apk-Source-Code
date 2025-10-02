package coil3.compose;

import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/unit/Constraints;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.compose.ConstraintsSizeResolver$size$2", f = "ConstraintsSizeResolver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ConstraintsSizeResolver$size$2 extends SuspendLambda implements Function2<Constraints, Continuation<? super Boolean>, Object> {
    public /* synthetic */ long p;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ConstraintsSizeResolver$size$2 constraintsSizeResolver$size$2 = new ConstraintsSizeResolver$size$2(2, continuation);
        constraintsSizeResolver$size$2.p = ((Constraints) obj).f2197a;
        return constraintsSizeResolver$size$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConstraintsSizeResolver$size$2) create(new Constraints(((Constraints) obj).f2197a), (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return Boolean.valueOf(!Constraints.k(this.p));
    }
}
