package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import com.google.gson.JsonObject;
import io.reactivex.observers.DisposableSingleObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/android/onesite/modules/checkout/digitalpay/DigitalPayForOrderPresenter$createPayForOrderObserver$1", "Lio/reactivex/observers/DisposableSingleObserver;", "Lcom/google/gson/JsonObject;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DigitalPayForOrderPresenter$createPayForOrderObserver$1 extends DisposableSingleObserver<JsonObject> {
    public final /* synthetic */ DigitalPayForOrderPresenter e;

    public DigitalPayForOrderPresenter$createPayForOrderObserver$1(DigitalPayForOrderPresenter digitalPayForOrderPresenter) {
        this.e = digitalPayForOrderPresenter;
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable throwable) {
        Intrinsics.h(throwable, "throwable");
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.e;
        digitalPayForOrderPresenter.I(throwable);
        digitalPayForOrderPresenter.b0 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:117:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0182  */
    @Override // io.reactivex.SingleObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSuccess(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$createPayForOrderObserver$1.onSuccess(java.lang.Object):void");
    }
}
