package com.woolworths.scanlibrary.ui.payment.addfirstcard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.compose.a;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import au.com.woolworths.android.onesite.extensions.ActivityExtKt;
import au.com.woolworths.foundation.google.pay.GooglePayManager;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.hooks.Retryable;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.interfaces.PayResultCallback;
import au.com.woolworths.pay.sdk.models.merchantprofile.MerchantProfile;
import com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.f;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.BackButtonExitHandler;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeature;
import com.woolworths.scanlibrary.databinding.ActivityOnboardingAddCardBinding;
import com.woolworths.scanlibrary.databinding.LayoutDarkToolbarBinding;
import com.woolworths.scanlibrary.databinding.ViewAddcardErrorBinding;
import com.woolworths.scanlibrary.di.user.UserScopedActivity;
import com.woolworths.scanlibrary.domain.payment.b;
import com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentContract;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import com.woolworths.scanlibrary.util.widget.AddCreditCardView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/addfirstcard/AddPaymentActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseActivity;", "Lcom/woolworths/scanlibrary/ui/payment/addfirstcard/AddPaymentContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/payment/addfirstcard/AddPaymentContract$View;", "Lcom/woolworths/scanlibrary/di/user/UserScopedActivity;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AddPaymentActivity extends DaggerBaseActivity<AddPaymentContract.Presenter> implements AddPaymentContract.View, UserScopedActivity {
    public static final /* synthetic */ int M = 0;
    public ViewAddcardErrorBinding G;
    public Bundle H;
    public boolean I;
    public ActivityOnboardingAddCardBinding J;
    public GooglePayManager K;
    public final ActivityResultLauncher L = registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), new a(this, 20));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/addfirstcard/AddPaymentActivity$Companion;", "", "", "EXTRA_IS_PAYMENT_INSTRUMENT_AVAILABLE", "Ljava/lang/String;", "EXTRA_IS_ENABLED_BACK_NAVIGATION", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(Activity activity, boolean z) {
            Pair[] pairArr = {new Pair("extra_payment_instrument_available", Boolean.valueOf(z))};
            Intent intent = new Intent(activity, (Class<?>) AddPaymentActivity.class);
            intent.addFlags(0);
            intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 1)));
            activity.startActivityForResult(intent, 4001);
        }
    }

    @Override // com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentContract.View
    public final void C4() {
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AddPaymentActivity$showGooglePayCardScanView$1(this, null), 3);
    }

    @Override // com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentContract.View
    public final void N1() {
        runOnUiThread(new f(this, 9));
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final OnBackPressedCallback P4() {
        return new BackButtonExitHandler() { // from class: com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentActivity$backButtonHandler$1
            {
                super(this.e);
            }

            @Override // com.woolworths.scanlibrary.base.dagger.BackButtonExitHandler
            public final boolean j() {
                int i = AddPaymentActivity.M;
                return this.e.H == null;
            }

            @Override // com.woolworths.scanlibrary.base.dagger.BackButtonExitHandler
            public final void k() {
                Intent intent = new Intent();
                AddPaymentActivity addPaymentActivity = this.e;
                Bundle bundle = addPaymentActivity.H;
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                addPaymentActivity.setResult(0, intent);
                addPaymentActivity.finish();
            }

            @Override // com.woolworths.scanlibrary.base.dagger.BackButtonExitHandler
            public final void l() {
                this.e.finish();
            }
        };
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_onboarding_add_card;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() throws Throwable {
        this.J = (ActivityOnboardingAddCardBinding) DataBindingUtil.d(this, R.layout.activity_onboarding_add_card);
        this.H = getIntent().getExtras();
        this.I = getIntent().getBooleanExtra("extra_payment_instrument_available", false);
        ActivityOnboardingAddCardBinding activityOnboardingAddCardBinding = this.J;
        if (activityOnboardingAddCardBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        LayoutDarkToolbarBinding layoutDarkToolbarBinding = activityOnboardingAddCardBinding.C;
        Toolbar toolbar = layoutDarkToolbarBinding.y;
        layoutDarkToolbarBinding.z.setText(getString(R.string.sng_title_activity_onboarding_add_card));
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.u();
        supportActionBar.t();
        supportActionBar.s(true);
        ActivityOnboardingAddCardBinding activityOnboardingAddCardBinding2 = this.J;
        if (activityOnboardingAddCardBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        final AddCreditCardView addCreditCardView = activityOnboardingAddCardBinding2.y;
        addCreditCardView.setDelegateFormError(true);
        PayClient payClient = this.z;
        if (payClient == null) {
            Intrinsics.p("payClient");
            throw null;
        }
        AddPaymentPresenter addPaymentPresenterN0 = ((AddPaymentContract.Presenter) S4()).N0();
        boolean zC = Q4().c(ScanAndGoFeature.g);
        addCreditCardView.d = payClient;
        addCreditCardView.e = addPaymentPresenterN0;
        AddCreditCardView.ViewModel viewModel = addCreditCardView.h;
        if (viewModel == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel.p.i(zC);
        PayClient payClient2 = addCreditCardView.d;
        if (payClient2 == null) {
            Intrinsics.p("payClient");
            throw null;
        }
        payClient2.f9189a.c(new PayResultCallback<MerchantProfile>() { // from class: com.woolworths.scanlibrary.util.widget.AddCreditCardView$initSupportedCardSchemes$1
            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void A(Retryable retryable) {
                Intrinsics.h(retryable, "retryable");
                AddCreditCardView.AddCardListener addCardListener = addCreditCardView.e;
                if (addCardListener != null) {
                    addCardListener.H(retryable);
                } else {
                    Intrinsics.p("addCardListener");
                    throw null;
                }
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void k0(Object obj) throws Throwable {
                MerchantProfile merchantProfile = (MerchantProfile) obj;
                Intrinsics.h(merchantProfile, "merchantProfile");
                addCreditCardView.setSupportedCardSchemes(merchantProfile);
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void v(PayError payError) {
                Intrinsics.h(payError, "payError");
            }
        });
        addCreditCardView.f();
        ActivityOnboardingAddCardBinding activityOnboardingAddCardBinding3 = this.J;
        if (activityOnboardingAddCardBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityOnboardingAddCardBinding3.A.setVisibility(!this.I ? 0 : 8);
        ActivityOnboardingAddCardBinding activityOnboardingAddCardBinding4 = this.J;
        if (activityOnboardingAddCardBinding4 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityOnboardingAddCardBinding4.z.setVisibility(this.I ? 0 : 8);
        ActivityOnboardingAddCardBinding activityOnboardingAddCardBinding5 = this.J;
        if (activityOnboardingAddCardBinding5 != null) {
            this.G = activityOnboardingAddCardBinding5.B;
        } else {
            Intrinsics.p("viewBinding");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final boolean X4() {
        return false;
    }

    @Override // com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentContract.View
    public final void b(String str) {
        ViewAddcardErrorBinding viewAddcardErrorBinding = this.G;
        if (viewAddcardErrorBinding != null) {
            viewAddcardErrorBinding.L(str);
        }
        ViewAddcardErrorBinding viewAddcardErrorBinding2 = this.G;
        if (viewAddcardErrorBinding2 != null) {
            viewAddcardErrorBinding2.M(Boolean.TRUE);
        }
    }

    @Override // com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentContract.View
    public final void j1() {
        ViewAddcardErrorBinding viewAddcardErrorBinding = this.G;
        if (viewAddcardErrorBinding != null) {
            viewAddcardErrorBinding.M(Boolean.FALSE);
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        getWindow().setFlags(8192, 8192);
        super.onCreate(bundle);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((AddPaymentContract.Presenter) S4()).W0();
    }

    @Override // com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentContract.View
    public final void q4() {
        if (this.H == null) {
            b5();
        } else {
            Intent intent = new Intent();
            Bundle bundle = this.H;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            setResult(-1, intent);
        }
        finish();
    }

    @Override // com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentContract.View
    public final void v() {
        ActivityExtKt.a(this);
    }

    @Override // com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentContract.View
    public final void y3(String details) {
        Intrinsics.h(details, "details");
        String string = getString(R.string.sng_error_add_card_failure);
        Intrinsics.g(string, "getString(...)");
        String string2 = getString(R.string.sng_label_ok);
        Intrinsics.g(string2, "getString(...)");
        int i = 3;
        AppCompatActivityExtKt.g(this, string, details, string2, new b(i), new b(i));
    }
}
