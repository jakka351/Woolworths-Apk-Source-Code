package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.ui.layout.Remeasurement;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LazyGridState$scrollToItem$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ LazyGridState p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridState$scrollToItem$2(LazyGridState lazyGridState, int i, Continuation continuation) {
        super(2, continuation);
        this.p = lazyGridState;
        this.q = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyGridState$scrollToItem$2(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        LazyGridState$scrollToItem$2 lazyGridState$scrollToItem$2 = (LazyGridState$scrollToItem$2) create((ScrollScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        lazyGridState$scrollToItem$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        LazyGridState lazyGridState = this.p;
        LazyGridScrollPosition lazyGridScrollPosition = lazyGridState.d;
        int iD = ((SnapshotMutableIntStateImpl) lazyGridScrollPosition.f1019a).d();
        int i = this.q;
        if (iD != i || ((SnapshotMutableIntStateImpl) lazyGridScrollPosition.b).d() != 0) {
            LazyLayoutItemAnimator lazyLayoutItemAnimator = lazyGridState.m;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.b = null;
            lazyLayoutItemAnimator.c = -1;
        }
        lazyGridScrollPosition.a(i, 0);
        lazyGridScrollPosition.d = null;
        Remeasurement remeasurement = lazyGridState.j;
        if (remeasurement != null) {
            remeasurement.d();
        }
        return Unit.f24250a;
    }
}
