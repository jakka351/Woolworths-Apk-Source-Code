package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.runtime.MutableState;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarResult;
import au.com.woolworths.feature.shop.bundles.BundlesUiEvent;
import au.com.woolworths.feature.shop.bundles.BundlesUiState;
import au.com.woolworths.feature.shop.bundles.BundlesViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.ui.BundlesScreenKt$BundlesScreen$7$1", f = "BundlesScreen.kt", l = {216}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BundlesScreenKt$BundlesScreen$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SnackbarHostState q;
    public final /* synthetic */ String r;
    public final /* synthetic */ BundlesViewModel s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ MutableState u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundlesScreenKt$BundlesScreen$7$1(SnackbarHostState snackbarHostState, String str, BundlesViewModel bundlesViewModel, Function1 function1, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = snackbarHostState;
        this.r = str;
        this.s = bundlesViewModel;
        this.t = function1;
        this.u = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BundlesScreenKt$BundlesScreen$7$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BundlesScreenKt$BundlesScreen$7$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        String str = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            if (((BundlesUiState) this.u.getD()).h != null) {
                this.p = 1;
                objC = SnackbarHostState.c(this.q, str, null, null, this, 14);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        objC = obj;
        if (((SnackbarResult) objC) == SnackbarResult.d) {
            MutableStateFlow mutableStateFlow = this.s.m;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, BundlesUiState.a((BundlesUiState) value, null, false, null, false, null, null, null, null, null, 383)));
        }
        this.t.invoke(new BundlesUiEvent.TrackSnackbarImpression(str));
        return Unit.f24250a;
    }
}
