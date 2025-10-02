package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.compose.runtime.MutableState;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarData;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderScreenKt$WPayForOrderScreen$1$1", f = "WPayForOrderScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class WPayForOrderScreenKt$WPayForOrderScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ SnackbarHostState p;
    public final /* synthetic */ MutableState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WPayForOrderScreenKt$WPayForOrderScreen$1$1(SnackbarHostState snackbarHostState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.p = snackbarHostState;
        this.q = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WPayForOrderScreenKt$WPayForOrderScreen$1$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        WPayForOrderScreenKt$WPayForOrderScreen$1$1 wPayForOrderScreenKt$WPayForOrderScreen$1$1 = (WPayForOrderScreenKt$WPayForOrderScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        wPayForOrderScreenKt$WPayForOrderScreen$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SnackbarData snackbarDataA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        if (((WPayForOrderContract.ViewState) this.q.getD()).f8389a != LoadingState.d && (snackbarDataA = this.p.a()) != null) {
            snackbarDataA.dismiss();
        }
        return Unit.f24250a;
    }
}
