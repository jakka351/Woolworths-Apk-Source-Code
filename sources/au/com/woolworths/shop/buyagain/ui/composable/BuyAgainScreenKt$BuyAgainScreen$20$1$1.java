package au.com.woolworths.shop.buyagain.ui.composable;

import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarDuration;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarResult;
import au.com.woolworths.shop.buyagain.ui.BuyAgainContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.composable.BuyAgainScreenKt$BuyAgainScreen$20$1$1", f = "BuyAgainScreen.kt", l = {225}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BuyAgainScreenKt$BuyAgainScreen$20$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ Function2 q;
    public final /* synthetic */ String r;
    public final /* synthetic */ BuyAgainContract.Snackbar s;
    public final /* synthetic */ SnackbarHostState t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyAgainScreenKt$BuyAgainScreen$20$1$1(Function2 function2, String str, BuyAgainContract.Snackbar snackbar, SnackbarHostState snackbarHostState, String str2, Continuation continuation) {
        super(2, continuation);
        this.q = function2;
        this.r = str;
        this.s = snackbar;
        this.t = snackbarHostState;
        this.u = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BuyAgainScreenKt$BuyAgainScreen$20$1$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BuyAgainScreenKt$BuyAgainScreen$20$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        BuyAgainContract.Snackbar snackbar = this.s;
        if (i == 0) {
            ResultKt.b(obj);
            this.q.invoke(this.r, snackbar.d);
            SnackbarDuration snackbarDuration = SnackbarDuration.d;
            this.p = 1;
            obj = SnackbarHostState.c(this.t, this.r, this.u, snackbarDuration, this, 4);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        if (((SnackbarResult) obj) == SnackbarResult.e) {
            snackbar.c.invoke();
        }
        return Unit.f24250a;
    }
}
