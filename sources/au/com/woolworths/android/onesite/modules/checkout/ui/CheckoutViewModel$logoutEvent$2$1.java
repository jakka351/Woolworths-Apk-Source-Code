package au.com.woolworths.android.onesite.modules.checkout.ui;

import au.com.woolworths.android.onesite.events.ForcedLogoutEvent;
import au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/android/onesite/events/ForcedLogoutEvent;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$logoutEvent$2$1", f = "CheckoutViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CheckoutViewModel$logoutEvent$2$1 extends SuspendLambda implements Function2<ForcedLogoutEvent, Continuation<? super Unit>, Object> {
    public final /* synthetic */ CheckoutViewModel p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutViewModel$logoutEvent$2$1(CheckoutViewModel checkoutViewModel, Continuation continuation) {
        super(2, continuation);
        this.p = checkoutViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutViewModel$logoutEvent$2$1(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CheckoutViewModel$logoutEvent$2$1 checkoutViewModel$logoutEvent$2$1 = (CheckoutViewModel$logoutEvent$2$1) create((ForcedLogoutEvent) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        checkoutViewModel$logoutEvent$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.p.l.f(CheckoutContract.Action.ShowLoginPrompt.f4310a);
        return Unit.f24250a;
    }
}
