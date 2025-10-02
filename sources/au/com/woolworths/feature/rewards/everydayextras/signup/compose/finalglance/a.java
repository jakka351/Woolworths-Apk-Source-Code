package au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.AlertDialogAnalytics;
import au.com.woolworths.feature.shop.ask.olive.analytics.AskOliveActions;
import au.com.woolworths.feature.shop.ask.olive.ui.AskOliveActivity;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerActivity;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerContract;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerLegacyActivity;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsActivity;
import au.com.woolworths.feature.shop.foryou.settings.analytics.RewardsSettingsActionData;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ FragmentActivity e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(FragmentActivity fragmentActivity, Object obj, int i) {
        this.d = i;
        this.e = fragmentActivity;
        this.f = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.d;
        Object obj = this.f;
        FragmentActivity fragmentActivity = this.e;
        switch (i2) {
            case 0:
                FinalGlanceBottomSheetActivity finalGlanceBottomSheetActivity = (FinalGlanceBottomSheetActivity) fragmentActivity;
                int i3 = FinalGlanceBottomSheetActivity.z;
                EverydayExtraFinalGlanceBottomSheetViewModel everydayExtraFinalGlanceBottomSheetViewModelO4 = finalGlanceBottomSheetActivity.O4();
                EverydayExtraFinalGlanceContract.Actions.ShowAlertDialog showAlertDialog = (EverydayExtraFinalGlanceContract.Actions.ShowAlertDialog) ((EverydayExtraFinalGlanceContract.Actions) obj);
                String label = showAlertDialog.f6083a.f.getLabel();
                AlertDialogAnalytics alertDialogAnalytics = showAlertDialog.f6083a.h;
                everydayExtraFinalGlanceBottomSheetViewModelO4.u6(label, alertDialogAnalytics != null ? alertDialogAnalytics.e : null, alertDialogAnalytics != null ? alertDialogAnalytics.d : null);
                finalGlanceBottomSheetActivity.O4().t6();
                break;
            case 1:
                int i4 = AskOliveActivity.I;
                ((AskOliveActivity) fragmentActivity).O4().c(AskOliveActions.h);
                ((Function0) obj).invoke();
                break;
            case 2:
                int i5 = BarcodeScannerActivity.G;
                ((BarcodeScannerActivity) fragmentActivity).P4().q6((BarcodeScannerContract.ErrorState) obj);
                break;
            case 3:
                int i6 = BarcodeScannerLegacyActivity.E;
                ((BarcodeScannerLegacyActivity) fragmentActivity).P4().q6((BarcodeScannerContract.ErrorState) obj);
                break;
            default:
                int i7 = RewardsSettingsActivity.C;
                ((RewardsSettingsActivity) fragmentActivity).O4().c((RewardsSettingsActionData) obj);
                break;
        }
    }
}
