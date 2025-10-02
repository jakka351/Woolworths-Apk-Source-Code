package com.scandit.datacapture.barcode.internal.module.count.ui.toolbar;

import android.widget.ScrollView;
import androidx.lifecycle.MutableLiveData;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickView;
import com.scandit.datacapture.core.C0993e3;
import com.scandit.datacapture.core.I1;
import com.scandit.datacapture.core.N;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2Impl;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay;
import com.woolworths.R;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import com.woolworths.scanlibrary.ui.entry.SngEntryActivity;
import com.woolworths.scanlibrary.ui.entry.SngEntryContract;
import com.woolworths.scanlibrary.ui.entry.SngEntryViewModel;
import com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentActivity;
import com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardActivity;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.sensorsManager.O;

/* loaded from: classes6.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                BarcodeCountToolbarViewHolder.f((BarcodeCountToolbarViewHolder) obj);
                break;
            case 1:
                BarcodePickView.a((BarcodePickView) obj);
                break;
            case 2:
                I1.b((I1) obj);
                break;
            case 3:
                N.m((N) obj);
                break;
            case 4:
                DataCaptureContext.a((DataCaptureContext) obj);
                break;
            case 5:
                C0993e3.b((C0993e3) obj);
                break;
            case 6:
                HintHolderV2Impl.a((HintHolderV2Impl) obj);
                break;
            case 7:
                TrackedObjectAdvancedOverlay.a((TrackedObjectAdvancedOverlay) obj);
                break;
            case 8:
                int i2 = SngEntryActivity.I;
                SngEntryViewModel sngEntryViewModelV4 = ((SngEntryActivity) obj).V4();
                MutableLiveData mutableLiveData = sngEntryViewModelV4.o;
                UserConfigurations userConfigurations = sngEntryViewModelV4.i;
                mutableLiveData.m(new SngEntryContract.ViewState(false, !userConfigurations.a(), null));
                if (!sngEntryViewModelV4.p) {
                    sngEntryViewModelV4.p = true;
                    if (userConfigurations.a()) {
                        sngEntryViewModelV4.r6();
                        break;
                    }
                }
                break;
            case 9:
                AddPaymentActivity addPaymentActivity = (AddPaymentActivity) obj;
                int i3 = AddPaymentActivity.M;
                String string = addPaymentActivity.getString(R.string.sng_error_add_card_failure);
                Intrinsics.g(string, "getString(...)");
                String string2 = addPaymentActivity.getString(R.string.sng_label_ok);
                Intrinsics.g(string2, "getString(...)");
                AppCompatActivityExtKt.d(addPaymentActivity, string, string2, new com.woolworths.scanlibrary.domain.payment.b(3));
                break;
            case 10:
                int i4 = UpdateCreditCardActivity.L;
                ((ScrollView) obj).fullScroll(130);
                break;
            default:
                ((O) obj).a();
                break;
        }
    }
}
