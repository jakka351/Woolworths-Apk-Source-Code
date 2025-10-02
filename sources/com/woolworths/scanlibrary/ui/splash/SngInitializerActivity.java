package com.woolworths.scanlibrary.ui.splash;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeatureConfig;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.models.notification.Notification;
import com.woolworths.scanlibrary.models.profile.PaymentMethodVerification;
import com.woolworths.scanlibrary.models.profile.ProfileResponse;
import com.woolworths.scanlibrary.ui.exit.ExitDTO;
import com.woolworths.scanlibrary.ui.exit.ExitScanCodeActivity;
import com.woolworths.scanlibrary.ui.payment.setup.AddPaymentSetupActivity;
import com.woolworths.scanlibrary.ui.splash.SplashContract;
import com.woolworths.scanlibrary.ui.tandc.TermsConditionsActivity;
import com.woolworths.scanlibrary.ui.tap.TapActivity;
import com.woolworths.scanlibrary.ui.tap.tapon.PaymentMethodWarning;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/woolworths/scanlibrary/ui/splash/SngInitializerActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseActivity;", "Lcom/woolworths/scanlibrary/ui/splash/SplashContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/splash/SplashContract$View;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SngInitializerActivity extends DaggerBaseActivity<SplashContract.Presenter> implements SplashContract.View {
    public static final /* synthetic */ int G = 0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/splash/SngInitializerActivity$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(ComponentActivity componentActivity, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("afterSignOut", z);
            Pair[] pairArr = {new Pair("activityExtraBundle", bundle)};
            Intent intent = new Intent(componentActivity, (Class<?>) SngInitializerActivity.class);
            intent.addFlags(872448000);
            intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 1)));
            componentActivity.startActivity(intent);
        }
    }

    @Override // com.woolworths.scanlibrary.ui.splash.SplashContract.View
    public final void G2() {
        throw new IllegalStateException("Register Rewards is not correct state with integrated app");
    }

    @Override // com.woolworths.scanlibrary.ui.splash.SplashContract.View
    public final void N(int i, ProfileResponse profileResponse) {
        Integer numValueOf = Integer.valueOf(i);
        PaymentMethodWarning paymentMethodWarning = null;
        if (profileResponse != null) {
            PaymentMethodVerification paymentMethodVerification = profileResponse.getPaymentMethodVerification();
            if (paymentMethodVerification != null ? Intrinsics.c(paymentMethodVerification.isPaymentMethodVerified(), Boolean.FALSE) : false) {
                String notificationTitle = profileResponse.getPaymentMethodVerification().getNotificationTitle();
                if (notificationTitle == null) {
                    notificationTitle = "";
                }
                String notificationMessage = profileResponse.getPaymentMethodVerification().getNotificationMessage();
                String str = notificationMessage != null ? notificationMessage : "";
                String positiveAction = profileResponse.getPaymentMethodVerification().getPositiveAction();
                if (positiveAction == null) {
                    positiveAction = getString(R.string.sng_label_open_account_settings);
                    Intrinsics.g(positiveAction, "getString(...)");
                }
                String negativeAction = profileResponse.getPaymentMethodVerification().getNegativeAction();
                if (negativeAction == null) {
                    negativeAction = getString(R.string.sng_label_not_now);
                    Intrinsics.g(negativeAction, "getString(...)");
                }
                paymentMethodWarning = new PaymentMethodWarning(notificationTitle, str, positiveAction, negativeAction);
            }
        }
        TapActivity.Companion.a(this, numValueOf, paymentMethodWarning, 2);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return -1;
    }

    @Override // com.woolworths.scanlibrary.ui.splash.SplashContract.View
    public final void S() {
        Intent intent = new Intent(this, (Class<?>) TermsConditionsActivity.class);
        intent.addFlags(0);
        startActivity(intent);
        finish();
    }

    @Override // com.woolworths.scanlibrary.ui.splash.SplashContract.View
    public final void S0(Notification notification, ScanAndGoFeatureConfig sngFeatureConfig) {
        Intrinsics.h(notification, "notification");
        Intrinsics.h(sngFeatureConfig, "sngFeatureConfig");
        String notificationType = notification.getNotificationType();
        if (!Intrinsics.c(notificationType, "upgrade_sng")) {
            if (Intrinsics.c(notificationType, "UnplannedOutage_sng")) {
                AppCompatActivityExtKt.c(this, notification.getTitle(), notification.getContent(), getText(R.string.sng_label_ok).toString(), new a(this, 0), false);
                return;
            } else {
                AppCompatActivityExtKt.c(this, notification.getTitle(), notification.getContent(), getText(R.string.sng_label_ok).toString(), new a(this, 1), false);
                return;
            }
        }
        String title = notification.getTitle();
        String content = notification.getContent();
        String string = getString(R.string.sng_label_update);
        Intrinsics.g(string, "getString(...)");
        AppCompatActivityExtKt.c(this, title, content, string, new coil3.gif.a(7, this, notification), false);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() {
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void W4() {
        Bundle bundleExtra;
        Object systemService = getSystemService("notification");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancelAll();
        Intent intent = getIntent();
        if (intent == null || (bundleExtra = intent.getBundleExtra("activityExtraBundle")) == null) {
            return;
        }
        ((SplashContract.Presenter) S4()).f0(bundleExtra.getBoolean("afterSignOut"));
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void a5(Function0 function0) {
        super.a5(new a(this, 3));
    }

    @Override // com.woolworths.scanlibrary.ui.splash.SplashContract.View
    public final void l1(ExitDTO exitDTO) {
        ExitScanCodeActivity.Companion.a(this, exitDTO);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, com.woolworths.scanlibrary.base.mvp.MvpView
    public final void n(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
        super.n(i, i2, apigeeErrorResponse, new a(this, 2));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101) {
            ((SplashContract.Presenter) S4()).D(3);
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((SplashContract.Presenter) S4()).W0();
    }

    @Override // com.woolworths.scanlibrary.ui.splash.SplashContract.View
    public final void t() {
        Intent intent = new Intent(this, (Class<?>) AddPaymentSetupActivity.class);
        intent.addFlags(0);
        startActivity(intent);
        finish();
    }
}
