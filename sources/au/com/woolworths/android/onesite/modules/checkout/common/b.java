package au.com.woolworths.android.onesite.modules.checkout.common;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.pay.sdk.models.merchantprofile.MerchantProfile;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ PaymentServicesInteractorImpl e;

    public /* synthetic */ b(PaymentServicesInteractorImpl paymentServicesInteractorImpl, int i) {
        this.d = i;
        this.e = paymentServicesInteractorImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PaymentServicesStatus paymentServicesStatus;
        switch (this.d) {
            case 0:
                Result result = (Result) obj;
                boolean zA = result.a();
                Throwable th = result.b;
                PaymentServicesInteractorImpl paymentServicesInteractorImpl = this.e;
                if (zA) {
                    Timber.f27013a.p(th);
                    paymentServicesInteractorImpl.e.getClass();
                    paymentServicesStatus = th instanceof NoConnectivityException ? PaymentServicesStatus.f : PaymentServicesStatus.g;
                } else {
                    paymentServicesStatus = PaymentServicesStatus.d;
                }
                paymentServicesInteractorImpl.h.onNext(paymentServicesStatus);
                return Unit.f24250a;
            default:
                MerchantProfile merchantProfile = (MerchantProfile) obj;
                Intrinsics.h(merchantProfile, "merchantProfile");
                this.e.g = merchantProfile;
                return Result.Companion.b(merchantProfile);
        }
    }
}
