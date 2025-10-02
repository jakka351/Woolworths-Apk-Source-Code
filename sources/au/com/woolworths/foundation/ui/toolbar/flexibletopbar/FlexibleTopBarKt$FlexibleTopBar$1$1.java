package au.com.woolworths.foundation.ui.toolbar.flexibletopbar;

import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.ui.toolbar.flexibletopbar.FlexibleTopBarKt$FlexibleTopBar$1$1", f = "FlexibleTopBar.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FlexibleTopBarKt$FlexibleTopBar$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ TopAppBarScrollBehavior p;
    public final /* synthetic */ MutableFloatState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTopBarKt$FlexibleTopBar$1$1(TopAppBarScrollBehavior topAppBarScrollBehavior, MutableFloatState mutableFloatState, Continuation continuation) {
        super(2, continuation);
        this.p = topAppBarScrollBehavior;
        this.q = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FlexibleTopBarKt$FlexibleTopBar$1$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        FlexibleTopBarKt$FlexibleTopBar$1$1 flexibleTopBarKt$FlexibleTopBar$1$1 = (FlexibleTopBarKt$FlexibleTopBar$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        flexibleTopBarKt$FlexibleTopBar$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TopAppBarState f1443a;
        TopAppBarState f1443a2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.p;
        Float f = (topAppBarScrollBehavior == null || (f1443a2 = topAppBarScrollBehavior.getF1443a()) == null) ? null : new Float(((SnapshotMutableFloatStateImpl) f1443a2.f1527a).a());
        MutableFloatState mutableFloatState = this.q;
        if (!Intrinsics.b(f, mutableFloatState.a()) && topAppBarScrollBehavior != null && (f1443a = topAppBarScrollBehavior.getF1443a()) != null) {
            ((SnapshotMutableFloatStateImpl) f1443a.f1527a).p(mutableFloatState.a());
        }
        return Unit.f24250a;
    }
}
