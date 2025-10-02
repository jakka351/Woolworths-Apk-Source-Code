package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.checkout.models.PayPalTokenResponse;
import io.reactivex.internal.operators.single.SingleDefer;
import io.reactivex.subjects.PublishSubject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                ((Runnable) this.e).run();
                return Unit.f24250a;
            case 1:
                ((Runnable) this.e).run();
                return Unit.f24250a;
            default:
                f fVar = (f) this.e;
                PayPalTokenResponse payPalTokenResponse = (PayPalTokenResponse) obj;
                Intrinsics.h(payPalTokenResponse, "payPalTokenResponse");
                String clientToken = payPalTokenResponse.getClientToken();
                DigitalPayForOrderFragment digitalPayForOrderFragment = (DigitalPayForOrderFragment) fVar.e;
                ActivityResultLauncher launcher = digitalPayForOrderFragment.D;
                PublishSubject activityResult = digitalPayForOrderFragment.C;
                FragmentActivity fragmentActivityRequireActivity = digitalPayForOrderFragment.requireActivity();
                Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                SchedulersProvider schedulersProviderH2 = digitalPayForOrderFragment.h2();
                Intrinsics.h(launcher, "launcher");
                Intrinsics.h(activityResult, "activityResult");
                return new SingleDefer(new au.com.woolworths.android.onesite.modules.checkout.paypal.b(clientToken, launcher, fragmentActivityRequireActivity, activityResult)).h(schedulersProviderH2.b()).f(schedulersProviderH2.d());
        }
    }
}
