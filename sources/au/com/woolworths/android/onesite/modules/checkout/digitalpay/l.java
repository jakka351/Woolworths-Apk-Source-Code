package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ DigitalPayForOrderPresenter e;

    public /* synthetic */ l(DigitalPayForOrderPresenter digitalPayForOrderPresenter, int i) {
        this.d = i;
        this.e = digitalPayForOrderPresenter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.e;
                if (digitalPayForOrderPresenter.i()) {
                    Object obj = digitalPayForOrderPresenter.f4374a;
                    Intrinsics.e(obj);
                    DigitalPayForOrderContract.View view = (DigitalPayForOrderContract.View) obj;
                    Object obj2 = digitalPayForOrderPresenter.f4374a;
                    Intrinsics.e(obj2);
                    view.e2(((DigitalPayForOrderContract.View) obj2).G(), digitalPayForOrderPresenter.Q() || digitalPayForOrderPresenter.K());
                    break;
                }
                break;
            default:
                DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = this.e;
                if (digitalPayForOrderPresenter2.i()) {
                    digitalPayForOrderPresenter2.p(true);
                    break;
                }
                break;
        }
    }
}
