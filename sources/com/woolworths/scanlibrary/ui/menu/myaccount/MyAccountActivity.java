package com.woolworths.scanlibrary.ui.menu.myaccount;

import android.content.Intent;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.ClickedAddCardInMyAccountTracking;
import com.woolworths.scanlibrary.analytics.ClickedDeleteCardInMyAccountTracking;
import com.woolworths.scanlibrary.analytics.ClickedUpdateCardInMyAccountTracking;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragmentActivity;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeature;
import com.woolworths.scanlibrary.databinding.ActivityMyAccountBinding;
import com.woolworths.scanlibrary.di.user.UserScopedActivity;
import com.woolworths.scanlibrary.ui.menu.myaccount.MyAccountsContract;
import com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentActivity;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListFragment;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface;
import com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardActivity;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/menu/myaccount/MyAccountActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseFragmentActivity;", "Lcom/woolworths/scanlibrary/ui/menu/myaccount/MyAccountsContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/menu/myaccount/MyAccountsContract$View;", "Lcom/woolworths/scanlibrary/di/user/UserScopedActivity;", "Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListInterface$InstrumentListCallback;", "<init>", "()V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MyAccountActivity extends DaggerBaseFragmentActivity<MyAccountsContract.Presenter> implements MyAccountsContract.View, UserScopedActivity, InstrumentListInterface.InstrumentListCallback {
    public static final /* synthetic */ int J = 0;
    public ActivityMyAccountBinding I;

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final void A4(PaymentInstrument instrument) {
        Intrinsics.h(instrument, "instrument");
        Pair[] pairArr = {new Pair("key_instrument", (CreditCardInstrument) instrument), new Pair("key_total_amount", null)};
        Intent intent = new Intent(this, (Class<?>) UpdateCreditCardActivity.class);
        intent.addFlags(0);
        intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 2)));
        startActivityForResult(intent, 4003);
        N4().b(new ClickedUpdateCardInMyAccountTracking("Update Card - My Account"));
    }

    @Override // com.woolworths.scanlibrary.ui.menu.myaccount.MyAccountsContract.View
    public final void C1(String userName, String userEmailId) {
        Intrinsics.h(userName, "userName");
        Intrinsics.h(userEmailId, "userEmailId");
        ActivityMyAccountBinding activityMyAccountBinding = this.I;
        if (activityMyAccountBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityMyAccountBinding.F.setText(userName);
        ActivityMyAccountBinding activityMyAccountBinding2 = this.I;
        if (activityMyAccountBinding2 != null) {
            activityMyAccountBinding2.E.setText(userEmailId);
        } else {
            Intrinsics.p("viewBinding");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.ui.menu.myaccount.MyAccountsContract.View
    public final void C2(String rewardNumber) {
        Intrinsics.h(rewardNumber, "rewardNumber");
        ActivityMyAccountBinding activityMyAccountBinding = this.I;
        if (activityMyAccountBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityMyAccountBinding.G.setText(rewardNumber);
        ActivityMyAccountBinding activityMyAccountBinding2 = this.I;
        if (activityMyAccountBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityMyAccountBinding2.G.setVisibility(0);
        ActivityMyAccountBinding activityMyAccountBinding3 = this.I;
        if (activityMyAccountBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityMyAccountBinding3.z.setVisibility(8);
        ActivityMyAccountBinding activityMyAccountBinding4 = this.I;
        if (activityMyAccountBinding4 != null) {
            activityMyAccountBinding4.A.setVisibility(0);
        } else {
            Intrinsics.p("viewBinding");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final void F4(boolean z) {
        AddPaymentActivity.Companion.a(this, z);
        N4().b(new ClickedAddCardInMyAccountTracking("Add Card - My Account"));
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final void G4(PaymentInstrument instrument) {
        Intrinsics.h(instrument, "instrument");
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final String L3() {
        String string = getString(R.string.sng_msg_instrument_unavailable);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final boolean P1(List paymentInstruments) {
        Intrinsics.h(paymentInstruments, "paymentInstruments");
        return ((long) paymentInstruments.size()) < ((MyAccountsContract.Presenter) S4()).k();
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_my_account;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() {
        ActivityMyAccountBinding activityMyAccountBinding = (ActivityMyAccountBinding) DataBindingUtil.d(this, R.layout.activity_my_account);
        this.I = activityMyAccountBinding;
        if (activityMyAccountBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        Toolbar toolbar = activityMyAccountBinding.y.y;
        Intrinsics.g(toolbar, "toolbar");
        ViewExtKt.b(toolbar, new b(12));
        ActivityMyAccountBinding activityMyAccountBinding2 = this.I;
        if (activityMyAccountBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        setSupportActionBar(activityMyAccountBinding2.y.y);
        ActivityMyAccountBinding activityMyAccountBinding3 = this.I;
        if (activityMyAccountBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityMyAccountBinding3.y.z.setText(getResources().getString(R.string.sng_title_my_account));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u();
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        Intrinsics.e(supportActionBar2);
        supportActionBar2.t();
        ActionBar supportActionBar3 = getSupportActionBar();
        Intrinsics.e(supportActionBar3);
        supportActionBar3.s(true);
        if (Q4().c(ScanAndGoFeature.e)) {
            return;
        }
        ActivityMyAccountBinding activityMyAccountBinding4 = this.I;
        if (activityMyAccountBinding4 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityMyAccountBinding4.D.setVisibility(0);
        DaggerBaseFragmentActivity.c5(this, InstrumentListFragment.Companion.a(false, true, true, false), R.id.paymentInstrumentFragmentHolder, null, 28);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final boolean X4() {
        return false;
    }

    @Override // com.woolworths.scanlibrary.ui.menu.myaccount.MyAccountsContract.View
    public final void k3() {
        ActivityMyAccountBinding activityMyAccountBinding = this.I;
        if (activityMyAccountBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityMyAccountBinding.G.setVisibility(8);
        ActivityMyAccountBinding activityMyAccountBinding2 = this.I;
        if (activityMyAccountBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityMyAccountBinding2.z.setVisibility(0);
        ActivityMyAccountBinding activityMyAccountBinding3 = this.I;
        if (activityMyAccountBinding3 != null) {
            activityMyAccountBinding3.A.setVisibility(8);
        } else {
            Intrinsics.p("viewBinding");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 4001) {
            if (i == 4003) {
                ActivityResultCaller activityResultCallerF = getSupportFragmentManager().F(R.id.paymentInstrumentFragmentHolder);
                Intrinsics.f(activityResultCallerF, "null cannot be cast to non-null type com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListContainer");
                ((InstrumentListInterface.InstrumentListContainer) activityResultCallerF).q();
            }
        } else if (i2 == -1) {
            ActivityResultCaller activityResultCallerF2 = getSupportFragmentManager().F(R.id.paymentInstrumentFragmentHolder);
            Intrinsics.f(activityResultCallerF2, "null cannot be cast to non-null type com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListContainer");
            ((InstrumentListInterface.InstrumentListContainer) activityResultCallerF2).q();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final void q1() {
        N4().b(new ClickedDeleteCardInMyAccountTracking("Delete Card - My Account"));
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final boolean r1() {
        return false;
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final void w() {
        ActivityResultCaller activityResultCallerF = getSupportFragmentManager().F(R.id.paymentInstrumentFragmentHolder);
        Intrinsics.f(activityResultCallerF, "null cannot be cast to non-null type com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListContainer");
        ((InstrumentListInterface.InstrumentListContainer) activityResultCallerF).f0(false);
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final void x(List paymentInstruments) {
        Intrinsics.h(paymentInstruments, "paymentInstruments");
    }
}
