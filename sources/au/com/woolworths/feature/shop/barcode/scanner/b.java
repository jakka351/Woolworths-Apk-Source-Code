package au.com.woolworths.feature.shop.barcode.scanner;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ BarcodeScannerActivity e;

    public /* synthetic */ b(BarcodeScannerActivity barcodeScannerActivity, int i) {
        this.d = i;
        this.e = barcodeScannerActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        BarcodeScannerActivity barcodeScannerActivity = this.e;
        switch (i) {
            case 0:
                OnBackPressedCallback addCallback = (OnBackPressedCallback) obj;
                int i2 = BarcodeScannerActivity.G;
                Intrinsics.h(addCallback, "$this$addCallback");
                barcodeScannerActivity.finish();
                break;
            default:
                int i3 = BarcodeScannerActivity.G;
                BarcodeScannerContract.ErrorState errorState = ((BarcodeScannerContract.ViewState) obj).c;
                if (errorState != null) {
                    new AlertDialog.Builder(barcodeScannerActivity).setTitle(errorState.d).setMessage(errorState.e).setPositiveButton(com.woolworths.R.string.ok, new au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.a(barcodeScannerActivity, errorState, 2)).setCancelable(false).create().show();
                    break;
                }
                break;
        }
        return unit;
    }
}
