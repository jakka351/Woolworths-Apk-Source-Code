package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$cancellableShow$1", f = "BasicTooltip.kt", l = {391}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class BasicTooltipStateImpl$show$cancellableShow$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public Object p;
    public int q;
    public final /* synthetic */ BasicTooltipStateImpl r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipStateImpl$show$cancellableShow$1(BasicTooltipStateImpl basicTooltipStateImpl, Continuation continuation) {
        super(1, continuation);
        this.r = basicTooltipStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new BasicTooltipStateImpl$show$cancellableShow$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BasicTooltipStateImpl$show$cancellableShow$1 basicTooltipStateImpl$show$cancellableShow$1 = (BasicTooltipStateImpl$show$cancellableShow$1) create((Continuation) obj);
        Unit unit = Unit.f24250a;
        basicTooltipStateImpl$show$cancellableShow$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Unit.f24250a;
        }
        ResultKt.b(obj);
        this.p = this.r;
        this.q = 1;
        new CancellableContinuationImpl(1, IntrinsicsKt.b(this)).o();
        throw null;
    }
}
