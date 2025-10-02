package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.runtime.MutableState;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiContract;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt$InstoreWifiScreen$11$1", f = "InstoreWifiScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreWifiScreenKt$InstoreWifiScreen$11$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ InstoreWifiContract.ViewState q;
    public final /* synthetic */ Function1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreWifiScreenKt$InstoreWifiScreen$11$1(MutableState mutableState, InstoreWifiContract.ViewState viewState, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.p = mutableState;
        this.q = viewState;
        this.r = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreWifiScreenKt$InstoreWifiScreen$11$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InstoreWifiScreenKt$InstoreWifiScreen$11$1 instoreWifiScreenKt$InstoreWifiScreen$11$1 = (InstoreWifiScreenKt$InstoreWifiScreen$11$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        instoreWifiScreenKt$InstoreWifiScreen$11$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        MutableState mutableState = this.p;
        if (mutableState.getD() == null) {
            InstoreWifiContract.ViewState viewState = this.q;
            mutableState.setValue(viewState.c);
            Boolean bool = viewState.c;
            if (bool != null) {
                this.r.invoke(bool);
            }
        }
        return Unit.f24250a;
    }
}
