package com.woolworths.scanlibrary.ui.payment.updatecard;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.BaseObservable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import au.com.woolworths.android.onesite.extensions.ActivityExtKt;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import au.com.woolworths.pay.sdk.web.FormFocusState;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.f;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity;
import com.woolworths.scanlibrary.databinding.ActivityUpdateCreditCardBinding;
import com.woolworths.scanlibrary.databinding.LayoutDarkToolbarBinding;
import com.woolworths.scanlibrary.di.user.UserScopedActivity;
import com.woolworths.scanlibrary.domain.payment.b;
import com.woolworths.scanlibrary.ui.payment.addcard.MerchantImage;
import com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardContract;
import com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardPresenter;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import com.woolworths.scanlibrary.util.widget.UpdateCreditCardExpirationView;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/updatecard/UpdateCreditCardActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseActivity;", "Lcom/woolworths/scanlibrary/ui/payment/updatecard/UpdateCreditCardContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/payment/updatecard/UpdateCreditCardContract$View;", "Lcom/woolworths/scanlibrary/di/user/UserScopedActivity;", "<init>", "()V", "ViewModel", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateCreditCardActivity extends DaggerBaseActivity<UpdateCreditCardContract.Presenter> implements UpdateCreditCardContract.View, UserScopedActivity {
    public static final /* synthetic */ int L = 0;
    public CreditCardInstrument G;
    public ViewModel H;
    public ActivityUpdateCreditCardBinding I;
    public boolean J;
    public final UpdateCreditCardActivity$backButtonHandler$1 K = new OnBackPressedCallback() { // from class: com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardActivity$backButtonHandler$1
        {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void e() {
            int i = UpdateCreditCardActivity.L;
            Intent intent = new Intent();
            UpdateCreditCardActivity updateCreditCardActivity = this.d;
            CreditCardInstrument creditCardInstrument = updateCreditCardActivity.G;
            if (creditCardInstrument == null) {
                Intrinsics.p("instrument");
                throw null;
            }
            updateCreditCardActivity.setResult(0, intent.putExtra("key_instrument", creditCardInstrument));
            updateCreditCardActivity.finish();
        }
    };

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/updatecard/UpdateCreditCardActivity$Companion;", "", "", "SCROLL_DELAY_MSEC", "J", "", "KEY_INSTRUMENT", "Ljava/lang/String;", "KEY_TOTAL_AMOUNT", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/updatecard/UpdateCreditCardActivity$ViewModel;", "Landroidx/databinding/BaseObservable;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ViewModel extends BaseObservable {
        public final ObservableBoolean e = new ObservableBoolean(false);
        public final ObservableField f = new ObservableField();
        public final ObservableField g = new ObservableField();
        public final ObservableField h = new ObservableField();
    }

    @Override // com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardContract.View
    public final void H2() {
        Intent intent = new Intent();
        CreditCardInstrument creditCardInstrument = this.G;
        if (creditCardInstrument == null) {
            Intrinsics.p("instrument");
            throw null;
        }
        setResult(-1, intent.putExtra("key_instrument", creditCardInstrument));
        finish();
    }

    @Override // com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardContract.View
    public final void K() {
        a5(new b(5));
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final OnBackPressedCallback P4() {
        return this.K;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_update_credit_card;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() throws Throwable {
        ActivityUpdateCreditCardBinding activityUpdateCreditCardBinding = (ActivityUpdateCreditCardBinding) DataBindingUtil.d(this, R.layout.activity_update_credit_card);
        this.I = activityUpdateCreditCardBinding;
        if (activityUpdateCreditCardBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        LayoutDarkToolbarBinding layoutDarkToolbarBinding = activityUpdateCreditCardBinding.D;
        Toolbar toolbar = layoutDarkToolbarBinding.y;
        layoutDarkToolbarBinding.z.setText(getString(R.string.sng_title_activity_payment));
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.u();
        ActionBar supportActionBar2 = getSupportActionBar();
        Intrinsics.e(supportActionBar2);
        supportActionBar2.t();
        ActionBar supportActionBar3 = getSupportActionBar();
        Intrinsics.e(supportActionBar3);
        supportActionBar3.s(true);
        ViewModel viewModel = new ViewModel();
        this.H = viewModel;
        viewModel.f.i(getString(R.string.sng_error_update_expired_card));
        ViewModel viewModel2 = this.H;
        if (viewModel2 == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel2.e.i(true);
        ViewModel viewModel3 = this.H;
        if (viewModel3 == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        ObservableField observableField = viewModel3.g;
        String string = getString(R.string.sng_label_masked_pan);
        Intrinsics.g(string, "getString(...)");
        CreditCardInstrument creditCardInstrument = this.G;
        if (creditCardInstrument == null) {
            Intrinsics.p("instrument");
            throw null;
        }
        observableField.i(String.format(string, Arrays.copyOf(new Object[]{creditCardInstrument.getCardSuffix()}, 1)));
        ViewModel viewModel4 = this.H;
        if (viewModel4 == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        ObservableField observableField2 = viewModel4.h;
        String string2 = getString(R.string.sng_label_expiration);
        Intrinsics.g(string2, "getString(...)");
        CreditCardInstrument creditCardInstrument2 = this.G;
        if (creditCardInstrument2 == null) {
            Intrinsics.p("instrument");
            throw null;
        }
        String expiryMonth = creditCardInstrument2.getExpiryMonth();
        CreditCardInstrument creditCardInstrument3 = this.G;
        if (creditCardInstrument3 == null) {
            Intrinsics.p("instrument");
            throw null;
        }
        observableField2.i(String.format(string2, Arrays.copyOf(new Object[]{expiryMonth, creditCardInstrument3.getExpiryYear()}, 2)));
        ActivityUpdateCreditCardBinding activityUpdateCreditCardBinding2 = this.I;
        if (activityUpdateCreditCardBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        ViewModel viewModel5 = this.H;
        if (viewModel5 != null) {
            activityUpdateCreditCardBinding2.L(viewModel5);
        } else {
            Intrinsics.p("viewModel");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final boolean X4() {
        return false;
    }

    @Override // com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardContract.View
    public final void b(String str) throws Throwable {
        if (str.length() == 0) {
            ViewModel viewModel = this.H;
            if (viewModel != null) {
                viewModel.e.i(false);
                return;
            } else {
                Intrinsics.p("viewModel");
                throw null;
            }
        }
        ViewModel viewModel2 = this.H;
        if (viewModel2 == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel2.f.i(str);
        ViewModel viewModel3 = this.H;
        if (viewModel3 != null) {
            viewModel3.e.i(true);
        } else {
            Intrinsics.p("viewModel");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardContract.View
    public final void g(FormFocusState formFocusState) {
        if (this.J) {
            return;
        }
        this.J = true;
        ActivityUpdateCreditCardBinding activityUpdateCreditCardBinding = this.I;
        if (activityUpdateCreditCardBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        ScrollView scrollView = activityUpdateCreditCardBinding.B;
        scrollView.postDelayed(new f(scrollView, 10), 500L);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        Serializable serializableExtra = getIntent().getSerializableExtra("key_instrument");
        Intrinsics.f(serializableExtra, "null cannot be cast to non-null type au.com.woolworths.pay.sdk.models.CreditCardInstrument");
        this.G = (CreditCardInstrument) serializableExtra;
        super.onCreate(bundle);
        ActivityUpdateCreditCardBinding activityUpdateCreditCardBinding = this.I;
        if (activityUpdateCreditCardBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        UpdateCreditCardExpirationView updateCreditCardExpirationView = activityUpdateCreditCardBinding.G;
        PayClient payClient = this.z;
        if (payClient == null) {
            Intrinsics.p("payClient");
            throw null;
        }
        UpdateCreditCardPresenter.UpdateCardCallback d = ((UpdateCreditCardContract.Presenter) S4()).getD();
        CreditCardInstrument creditCardInstrument = this.G;
        if (creditCardInstrument == null) {
            Intrinsics.p("instrument");
            throw null;
        }
        updateCreditCardExpirationView.b(payClient, d, creditCardInstrument);
        ActivityUpdateCreditCardBinding activityUpdateCreditCardBinding2 = this.I;
        if (activityUpdateCreditCardBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        ImageView imageView = activityUpdateCreditCardBinding2.z;
        Context applicationContext = getApplicationContext();
        Intrinsics.e(applicationContext);
        MerchantImage.Companion companion = MerchantImage.f;
        CreditCardInstrument creditCardInstrument2 = this.G;
        if (creditCardInstrument2 == null) {
            Intrinsics.p("instrument");
            throw null;
        }
        String scheme = creditCardInstrument2.getScheme();
        Intrinsics.g(scheme, "getScheme(...)");
        companion.getClass();
        Drawable drawable = applicationContext.getDrawable(MerchantImage.Companion.a(scheme).e);
        Intrinsics.e(drawable);
        imageView.setImageDrawable(drawable);
    }

    @Override // com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardContract.View
    public final void q0() {
        String string = getString(R.string.sng_label_ok);
        Intrinsics.g(string, "getString(...)");
        AppCompatActivityExtKt.c(this, "", "Update card failed. Please try later.", string, new c(this, 18), true);
    }

    @Override // com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardContract.View
    public final void v() {
        ActivityExtKt.a(this);
    }
}
