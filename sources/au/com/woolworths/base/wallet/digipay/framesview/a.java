package au.com.woolworths.base.wallet.digipay.framesview;

import android.R;
import android.content.DialogInterface;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.wallet.ocr.CameraPermissionRationaleDialogFragment;
import au.com.woolworths.base.wallet.ocr.CameraPermissionRationaleDialogHandler;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceBottomSheetViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.FinalGlanceBottomSheetActivity;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetActivity;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsFragment;
import au.com.woolworths.feature.rewards.redemptionsettings.analytics.RewardsRedemptionSettingsActionData;
import au.com.woolworths.feature.shared.web.file.uploader.WebChromeFileUploadHelper;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity;
import au.com.woolworths.geolocation.location.DeviceLocationServiceCallback;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListContract;
import au.com.woolworths.shop.product.details.ProductDetailsActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                ((CardCaptureErrorDialogInvalidForm) obj).dismiss();
                break;
            case 1:
                CameraPermissionRationaleDialogHandler cameraPermissionRationaleDialogHandler = ((CameraPermissionRationaleDialogFragment) obj).d;
                if (cameraPermissionRationaleDialogHandler != null) {
                    cameraPermissionRationaleDialogHandler.s4();
                    break;
                }
                break;
            case 2:
                FinalGlanceBottomSheetActivity finalGlanceBottomSheetActivity = (FinalGlanceBottomSheetActivity) obj;
                int i3 = FinalGlanceBottomSheetActivity.z;
                EverydayExtraFinalGlanceBottomSheetViewModel everydayExtraFinalGlanceBottomSheetViewModelO4 = finalGlanceBottomSheetActivity.O4();
                String string = finalGlanceBottomSheetActivity.getString(R.string.ok);
                Intrinsics.g(string, "getString(...)");
                everydayExtraFinalGlanceBottomSheetViewModelO4.u6(string, null, null);
                finalGlanceBottomSheetActivity.O4().t6();
                break;
            case 3:
                int i4 = RewardsRedemptionSettingsBottomSheetActivity.B;
                ((RewardsRedemptionSettingsBottomSheetActivity) obj).O4().g.c(RewardsRedemptionSettingsActionData.h);
                break;
            case 4:
                ((RewardsRedemptionSettingsFragment) obj).I1().g.c(RewardsRedemptionSettingsActionData.h);
                break;
            case 5:
                ((WebChromeFileUploadHelper) obj).d();
                break;
            case 6:
                int i5 = CatalogueProductListActivity.F;
                Activities.LogIn.c((CatalogueProductListActivity) obj);
                break;
            case 7:
                ((DeviceLocationServiceCallback) obj).i2();
                break;
            case 8:
                int i6 = CreateUpdateShoppingListActivity.A;
                ((CreateUpdateShoppingListActivity) obj).O4().i.f(new CreateUpdateShoppingListContract.Actions.FinishActivity(false, null, null));
                break;
            default:
                int i7 = ProductDetailsActivity.C;
                Activities.LogIn.c((ProductDetailsActivity) obj);
                break;
        }
    }
}
