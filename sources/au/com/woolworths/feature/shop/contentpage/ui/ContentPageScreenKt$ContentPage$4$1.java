package au.com.woolworths.feature.shop.contentpage.ui;

import android.content.Context;
import androidx.compose.material.SnackbarDuration;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.SnackbarResult;
import androidx.compose.runtime.State;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.feature.shop.contentpage.ContentPageContract;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.contentpage.ui.ContentPageScreenKt$ContentPage$4$1", f = "ContentPageScreen.kt", l = {540}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ContentPageScreenKt$ContentPage$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Context p;
    public ContentPageContract.Snackbar q;
    public int r;
    public final /* synthetic */ State s;
    public final /* synthetic */ SnackbarHostState t;
    public final /* synthetic */ Context u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentPageScreenKt$ContentPage$4$1(State state, SnackbarHostState snackbarHostState, Context context, Continuation continuation) {
        super(2, continuation);
        this.s = state;
        this.t = snackbarHostState;
        this.u = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContentPageScreenKt$ContentPage$4$1(this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ContentPageScreenKt$ContentPage$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ContentPageContract.Snackbar snackbar;
        Context context;
        CharSequence text;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            ContentPageContract.Snackbar snackbar2 = ((ContentPageContract.ViewState) this.s.getD()).n;
            if (snackbar2 != null) {
                ResText resText = snackbar2.f6980a;
                Context context2 = this.u;
                String string = resText.getText(context2).toString();
                Text text2 = snackbar2.b;
                String string2 = (text2 == null || (text = text2.getText(context2)) == null) ? null : text.toString();
                SnackbarDuration snackbarDuration = SnackbarDuration.d;
                this.p = context2;
                this.q = snackbar2;
                this.r = 1;
                Object objA = this.t.a(string, string2, snackbarDuration, this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                snackbar = snackbar2;
                obj = objA;
                context = context2;
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        snackbar = this.q;
        context = this.p;
        ResultKt.b(obj);
        SnackbarResult snackbarResult = (SnackbarResult) obj;
        snackbar.d.invoke(snackbar.f6980a.getText(context).toString());
        if (snackbarResult == SnackbarResult.e) {
            snackbar.c.invoke();
        }
        return Unit.f24250a;
    }
}
