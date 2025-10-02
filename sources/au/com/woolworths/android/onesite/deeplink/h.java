package au.com.woolworths.android.onesite.deeplink;

import android.content.Intent;
import android.graphics.Paint;
import au.com.woolworths.android.onesite.modules.customviews.loadingdialog.FullPageLoadingDialogFragment;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsSummaryData;
import au.com.woolworths.base.wallet.digipay.framesview.ActionType;
import au.com.woolworths.base.wallet.digipay.framesview.ActionType$CaptureCard$$serializer;
import au.com.woolworths.base.wallet.digipay.framesview.ActionType$StepUp$$serializer;
import au.com.woolworths.base.wallet.digipay.framesview.ActionType$UpdateCard$$serializer;
import au.com.woolworths.base.wallet.digipay.framesview.ActionType$ValidateCard$$serializer;
import au.com.woolworths.base.wallet.digipay.framesview.ActionType$ValidatePayment$$serializer;
import au.com.woolworths.base.wallet.digipay.framesview.CardCaptureResponse;
import au.com.woolworths.base.wallet.digipay.framesview.CardUpdateResponse;
import au.com.woolworths.base.wallet.digipay.framesview.EnrollmentResponse;
import au.com.woolworths.base.wallet.digipay.framesview.EnrollmentResponseStatus;
import au.com.woolworths.base.wallet.digipay.framesview.FramesSDKConfig;
import au.com.woolworths.base.wallet.digipay.framesview.LogLevel;
import au.com.woolworths.base.wallet.digipay.framesview.PaymentErrorResponse;
import au.com.woolworths.base.wallet.digipay.framesview.ThreeDSError;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertPreviewProvider;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerPreviewProvider;
import au.com.woolworths.feature.rewards.account.closeaccount.model.DeleteAccount;
import au.com.woolworths.feature.rewards.account.closeaccount.ui.ConsentPageUiKt;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.EnumsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function0 {
    public final /* synthetic */ int d;

    public /* synthetic */ h(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                Activities.ManageFullDeliveryAddressesActivity.Extras extras = new Activities.ManageFullDeliveryAddressesActivity.Extras(0, false, false);
                Intent intentA = ActivityNavigatorKt.a(Activities.ManageFullDeliveryAddressesActivity.f4488a, ApplicationType.e);
                intentA.putExtra("EXTRA_DATA", extras);
                return intentA;
            case 1:
                return ActivityNavigatorKt.a(Activities.NotificationOptInActivity.f4492a, ApplicationType.e);
            case 2:
                return ActivityNavigatorKt.a(Activities.MarketplaceActivity.f4489a, ApplicationType.e);
            case 3:
                return ActivityNavigatorKt.a(Activities.FreshMagHome.f4475a, ApplicationType.e);
            case 4:
                return ActivityNavigatorKt.a(Activities.ScanAndGoEntryActivity.f4525a, ApplicationType.e);
            case 5:
                return Activities.MainActivity.f4487a.c(Activities.MainActivity.Tab.g, null);
            case 6:
                return Activities.DeliveryAddressSearchActivity.f4466a.b(new Activities.DeliveryAddressSearchActivity.Extras(false, true, false, false));
            case 7:
                return ActivityNavigatorKt.a(Activities.Authentication.f4448a, ApplicationType.e);
            case 8:
                return ActivityNavigatorKt.a(Activities.Inbox.f4480a, ApplicationType.e);
            case 9:
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                paint.setAntiAlias(true);
                return paint;
            case 10:
                return RewardsRedemptionSettingsSummaryData._childSerializers$_anonymous_();
            case 11:
                ActionType.Companion companion = ActionType.INSTANCE;
                ReflectionFactory reflectionFactory = Reflection.f24268a;
                return new SealedClassSerializer("au.com.woolworths.base.wallet.digipay.framesview.ActionType", reflectionFactory.b(ActionType.class), new KClass[]{reflectionFactory.b(ActionType.CaptureCard.class), reflectionFactory.b(ActionType.StepUp.class), reflectionFactory.b(ActionType.UpdateCard.class), reflectionFactory.b(ActionType.ValidateCard.class), reflectionFactory.b(ActionType.ValidatePayment.class)}, new KSerializer[]{ActionType$CaptureCard$$serializer.f4638a, ActionType$StepUp$$serializer.f4640a, ActionType$UpdateCard$$serializer.f4642a, ActionType$ValidateCard$$serializer.f4643a, ActionType$ValidatePayment$$serializer.f4644a}, new Annotation[0]);
            case 12:
                return EnumsKt.b(ActionType.AcsWindowSize.values(), "au.com.woolworths.base.wallet.digipay.framesview.ActionType.AcsWindowSize");
            case 13:
                CardCaptureResponse.Companion companion2 = CardCaptureResponse.INSTANCE;
                return ThreeDSError.INSTANCE.serializer();
            case 14:
                CardUpdateResponse.Companion companion3 = CardUpdateResponse.Companion;
                return ThreeDSError.INSTANCE.serializer();
            case 15:
                EnrollmentResponse.Companion companion4 = EnrollmentResponse.INSTANCE;
                return EnumsKt.b(EnrollmentResponseStatus.values(), "au.com.woolworths.base.wallet.digipay.framesview.EnrollmentResponseStatus");
            case 16:
                FramesSDKConfig.Companion companion5 = FramesSDKConfig.INSTANCE;
                return EnumsKt.b(LogLevel.values(), "au.com.woolworths.base.wallet.digipay.framesview.LogLevel");
            case 17:
                PaymentErrorResponse.Companion companion6 = PaymentErrorResponse.Companion;
                return ThreeDSError.INSTANCE.serializer();
            case 18:
                return EnumsKt.a("au.com.woolworths.base.wallet.digipay.framesview.ThreeDSError", ThreeDSError.values(), new String[]{"3DS_001", "3DS_002", "3DS_003", "3DS_004", "3DS_005", "3DS_006", "3DS_007", "3DS_100", "3DS_500"}, new Annotation[][]{null, null, null, null, null, null, null, null, null});
            case 19:
            case 20:
                return unit;
            case 21:
                return Float.valueOf(0.75f);
            case 22:
                return Float.valueOf(0.5f);
            case 24:
                AlertPreviewProvider.TestCase[] testCaseArr = AlertPreviewProvider.TestCase.d;
            case 23:
                return unit;
            case 25:
                int i2 = BroadcastBannerPreviewProvider.f4746a;
                return unit;
            case 26:
                DeleteAccount deleteAccount = ConsentPageUiKt.f5695a;
                return unit;
            case 27:
                KProperty[] kPropertyArr = AccountSettingsFragmentOld.r;
                return new FullPageLoadingDialogFragment();
            case 28:
                return new Gson();
            default:
                Bark.Companion companion7 = Bark.f8483a;
                Bark.Barker.i(new ReportOwner(ReportOwner.Squad.e), "Could not create Digipay token", null, 12);
                return unit;
        }
    }
}
