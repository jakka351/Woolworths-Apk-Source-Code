package au.com.woolworths.android.onesite.modules.checkout.ui;

import au.com.woolworths.android.onesite.modules.checkout.common.CheckoutNotifyUser;
import au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutContract;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/android/onesite/modules/checkout/common/CheckoutNotifyUser;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$legacyError$2$1", f = "CheckoutViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CheckoutViewModel$legacyError$2$1 extends SuspendLambda implements Function2<CheckoutNotifyUser, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ CheckoutViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutViewModel$legacyError$2$1(CheckoutViewModel checkoutViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = checkoutViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CheckoutViewModel$legacyError$2$1 checkoutViewModel$legacyError$2$1 = new CheckoutViewModel$legacyError$2$1(this.q, continuation);
        checkoutViewModel$legacyError$2$1.p = obj;
        return checkoutViewModel$legacyError$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CheckoutViewModel$legacyError$2$1 checkoutViewModel$legacyError$2$1 = (CheckoutViewModel$legacyError$2$1) create((CheckoutNotifyUser) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        checkoutViewModel$legacyError$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        CheckoutNotifyUser checkoutNotifyUser = (CheckoutNotifyUser) this.p;
        Intrinsics.e(checkoutNotifyUser);
        if (checkoutNotifyUser instanceof CheckoutNotifyUser.InvalidWindowError) {
            this.q.l.f(new CheckoutContract.Action.ShowInvalidWindowError(((CheckoutNotifyUser.InvalidWindowError) checkoutNotifyUser).f4274a ? R.string.checkout_invalid_delivery_window_title : R.string.checkout_invalid_pick_up_window_title));
        }
        return Unit.f24250a;
    }
}
