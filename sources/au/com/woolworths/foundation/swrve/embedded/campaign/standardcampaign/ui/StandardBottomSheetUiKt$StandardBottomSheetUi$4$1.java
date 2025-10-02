package au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.StandardBottomSheetUiKt$StandardBottomSheetUi$4$1", f = "StandardBottomSheetUi.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class StandardBottomSheetUiKt$StandardBottomSheetUi$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ModalBottomSheetState p;
    public final /* synthetic */ Function0 q;
    public final /* synthetic */ MutableState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardBottomSheetUiKt$StandardBottomSheetUi$4$1(ModalBottomSheetState modalBottomSheetState, Function0 function0, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.p = modalBottomSheetState;
        this.q = function0;
        this.r = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StandardBottomSheetUiKt$StandardBottomSheetUi$4$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        StandardBottomSheetUiKt$StandardBottomSheetUi$4$1 standardBottomSheetUiKt$StandardBottomSheetUi$4$1 = (StandardBottomSheetUiKt$StandardBottomSheetUi$4$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        standardBottomSheetUiKt$StandardBottomSheetUi$4$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        if (!this.p.d() && !((Boolean) this.r.getD()).booleanValue()) {
            this.q.invoke();
        }
        return Unit.f24250a;
    }
}
