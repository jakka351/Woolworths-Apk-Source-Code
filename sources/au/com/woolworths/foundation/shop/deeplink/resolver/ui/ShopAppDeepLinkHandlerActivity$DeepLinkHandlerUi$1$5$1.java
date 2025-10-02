package au.com.woolworths.foundation.shop.deeplink.resolver.ui;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarDuration;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarResult;
import au.com.woolworths.foundation.shop.deeplink.resolver.ShopAppDeepLinkContract;
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
@DebugMetadata(c = "au.com.woolworths.foundation.shop.deeplink.resolver.ui.ShopAppDeepLinkHandlerActivity$DeepLinkHandlerUi$1$5$1", f = "ShopAppDeepLinkHandlerActivity.kt", l = {259}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShopAppDeepLinkHandlerActivity$DeepLinkHandlerUi$1$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Context p;
    public ShopAppDeepLinkHandlerActivity q;
    public ShopAppDeepLinkContract.Snackbar r;
    public int s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ SnackbarHostState u;
    public final /* synthetic */ Context v;
    public final /* synthetic */ ShopAppDeepLinkHandlerActivity w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopAppDeepLinkHandlerActivity$DeepLinkHandlerUi$1$5$1(MutableState mutableState, SnackbarHostState snackbarHostState, Context context, ShopAppDeepLinkHandlerActivity shopAppDeepLinkHandlerActivity, Continuation continuation) {
        super(2, continuation);
        this.t = mutableState;
        this.u = snackbarHostState;
        this.v = context;
        this.w = shopAppDeepLinkHandlerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShopAppDeepLinkHandlerActivity$DeepLinkHandlerUi$1$5$1(this.t, this.u, this.v, this.w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShopAppDeepLinkHandlerActivity$DeepLinkHandlerUi$1$5$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ShopAppDeepLinkHandlerActivity shopAppDeepLinkHandlerActivity;
        ShopAppDeepLinkContract.Snackbar snackbar;
        Context context;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.s;
        if (i == 0) {
            ResultKt.b(obj);
            ShopAppDeepLinkContract.Snackbar snackbar2 = ((ShopAppDeepLinkContract.ViewState) this.t.getD()).c;
            if (snackbar2 != null) {
                ResText resText = snackbar2.f8710a;
                Context context2 = this.v;
                String string = resText.getText(context2).toString();
                SnackbarDuration snackbarDuration = SnackbarDuration.d;
                this.p = context2;
                shopAppDeepLinkHandlerActivity = this.w;
                this.q = shopAppDeepLinkHandlerActivity;
                this.r = snackbar2;
                this.s = 1;
                Object objC = SnackbarHostState.c(this.u, string, null, snackbarDuration, this, 4);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                snackbar = snackbar2;
                obj = objC;
                context = context2;
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        snackbar = this.r;
        shopAppDeepLinkHandlerActivity = this.q;
        context = this.p;
        ResultKt.b(obj);
        SnackbarResult snackbarResult = (SnackbarResult) obj;
        snackbar.c.invoke(snackbar.f8710a.getText(context).toString());
        if (snackbarResult == SnackbarResult.e) {
            snackbar.b.invoke();
        }
        if (snackbarResult == SnackbarResult.d) {
            shopAppDeepLinkHandlerActivity.finish();
        }
        return Unit.f24250a;
    }
}
