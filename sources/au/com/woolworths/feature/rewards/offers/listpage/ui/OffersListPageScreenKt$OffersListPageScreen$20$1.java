package au.com.woolworths.feature.rewards.offers.listpage.ui;

import android.content.Context;
import androidx.compose.material.SnackbarDuration;
import androidx.compose.material.SnackbarHostState;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.feature.rewards.offers.listpage.OffersListPageContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.listpage.ui.OffersListPageScreenKt$OffersListPageScreen$20$1", f = "OffersListPageScreen.kt", l = {292}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class OffersListPageScreenKt$OffersListPageScreen$20$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Function0 p;
    public int q;
    public final /* synthetic */ OffersListPageContract.ViewState r;
    public final /* synthetic */ Context s;
    public final /* synthetic */ SnackbarHostState t;
    public final /* synthetic */ Function0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersListPageScreenKt$OffersListPageScreen$20$1(OffersListPageContract.ViewState viewState, Context context, SnackbarHostState snackbarHostState, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.r = viewState;
        this.s = context;
        this.t = snackbarHostState;
        this.u = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OffersListPageScreenKt$OffersListPageScreen$20$1(this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OffersListPageScreenKt$OffersListPageScreen$20$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CharSequence text;
        String string;
        Function0 function0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            Text text2 = this.r.j;
            if (text2 != null && (text = text2.getText(this.s)) != null && (string = text.toString()) != null) {
                SnackbarDuration snackbarDuration = SnackbarDuration.d;
                Function0 function02 = this.u;
                this.p = function02;
                this.q = 1;
                if (SnackbarHostState.b(this.t, string, null, snackbarDuration, this, 2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                function0 = function02;
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        function0 = this.p;
        ResultKt.b(obj);
        function0.invoke();
        return Unit.f24250a;
    }
}
