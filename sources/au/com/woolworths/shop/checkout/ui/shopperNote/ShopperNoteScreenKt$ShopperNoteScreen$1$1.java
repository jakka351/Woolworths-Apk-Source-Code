package au.com.woolworths.shop.checkout.ui.shopperNote;

import androidx.compose.runtime.MutableState;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarDuration;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteScreenKt$ShopperNoteScreen$1$1", f = "ShopperNoteScreen.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShopperNoteScreenKt$ShopperNoteScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ Flow q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ SnackbarHostState t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopperNoteScreenKt$ShopperNoteScreen$1$1(Flow flow, MutableState mutableState, Function0 function0, SnackbarHostState snackbarHostState, String str, Continuation continuation) {
        super(2, continuation);
        this.q = flow;
        this.r = mutableState;
        this.s = function0;
        this.t = snackbarHostState;
        this.u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShopperNoteScreenKt$ShopperNoteScreen$1$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShopperNoteScreenKt$ShopperNoteScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final SnackbarHostState snackbarHostState = this.t;
            final String str = this.u;
            final MutableState mutableState = this.r;
            final Function0 function0 = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteScreenKt$ShopperNoteScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    CheckoutContentContract.Actions actions = (CheckoutContentContract.Actions) obj2;
                    boolean z = actions instanceof CheckoutContentContract.Actions.LeaveShopperNoteScreen;
                    Unit unit = Unit.f24250a;
                    MutableState mutableState2 = mutableState;
                    if (z) {
                        mutableState2.setValue(Boolean.FALSE);
                        function0.invoke();
                        return unit;
                    }
                    if (actions instanceof CheckoutContentContract.Actions.LaunchSnackBar) {
                        mutableState2.setValue(Boolean.FALSE);
                        Object objC = SnackbarHostState.c(snackbarHostState, str, null, SnackbarDuration.d, continuation, 6);
                        if (objC == CoroutineSingletons.d) {
                            return objC;
                        }
                    }
                    return unit;
                }
            };
            this.p = 1;
            if (this.q.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
