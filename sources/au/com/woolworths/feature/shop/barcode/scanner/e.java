package au.com.woolworths.feature.shop.barcode.scanner;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ BarcodeScannerLegacyActivity e;

    public /* synthetic */ e(BarcodeScannerLegacyActivity barcodeScannerLegacyActivity, int i) {
        this.d = i;
        this.e = barcodeScannerLegacyActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        BarcodeScannerLegacyActivity barcodeScannerLegacyActivity = this.e;
        switch (i) {
            case 0:
                OnBackPressedCallback addCallback = (OnBackPressedCallback) obj;
                int i2 = BarcodeScannerLegacyActivity.E;
                Intrinsics.h(addCallback, "$this$addCallback");
                barcodeScannerLegacyActivity.finish();
                break;
            default:
                int i3 = BarcodeScannerLegacyActivity.E;
                BarcodeScannerContract.ErrorState errorState = ((BarcodeScannerContract.ViewState) obj).c;
                if (errorState != null) {
                    new AlertDialog.Builder(barcodeScannerLegacyActivity).setTitle(errorState.d).setMessage(errorState.e).setPositiveButton(com.woolworths.R.string.ok, new au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.a(barcodeScannerLegacyActivity, errorState, 3)).setCancelable(false).create().show();
                    break;
                }
                break;
        }
        return unit;
    }
}
