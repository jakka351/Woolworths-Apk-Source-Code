package com.woolworths.scanlibrary.ui.checkout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragmentActivity;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.databinding.ActivityCheckOutSngBinding;
import com.woolworths.scanlibrary.di.session.CartSessionScopedActivity;
import com.woolworths.scanlibrary.ui.checkout.CheckOutActivity;
import com.woolworths.scanlibrary.ui.checkout.CheckOutContract;
import com.woolworths.scanlibrary.ui.checkout.pay.PayFragment;
import com.woolworths.scanlibrary.ui.exit.ExitDTO;
import com.woolworths.scanlibrary.ui.exit.ExitScanCodeActivity;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\b\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/CheckOutActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseFragmentActivity;", "Lcom/woolworths/scanlibrary/ui/checkout/CheckOutContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayFragment$PaymentListener;", "Lcom/woolworths/scanlibrary/ui/checkout/CheckOutContract$View;", "Lcom/woolworths/scanlibrary/di/session/CartSessionScopedActivity;", "<init>", "()V", "CheckOutStep", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CheckOutActivity extends DaggerBaseFragmentActivity<CheckOutContract.Presenter> implements PayFragment.PaymentListener, CheckOutContract.View, CartSessionScopedActivity {
    public static final /* synthetic */ int L = 0;
    public Cart I;
    public final CheckOutActivity$backButtonHandler$1 J = new OnBackPressedCallback() { // from class: com.woolworths.scanlibrary.ui.checkout.CheckOutActivity$backButtonHandler$1
        {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void e() {
            CheckOutActivity checkOutActivity = this.d;
            if (checkOutActivity.K != CheckOutActivity.CheckOutStep.e) {
                i(false);
                checkOutActivity.finish();
            }
        }
    };
    public final CheckOutStep K = CheckOutStep.d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/CheckOutActivity$CheckOutStep;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckOutStep {
        public static final CheckOutStep d;
        public static final CheckOutStep e;
        public static final /* synthetic */ CheckOutStep[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            CheckOutStep checkOutStep = new CheckOutStep("PAY", 0);
            d = checkOutStep;
            CheckOutStep checkOutStep2 = new CheckOutStep("TAPOFF", 1);
            e = checkOutStep2;
            CheckOutStep[] checkOutStepArr = {checkOutStep, checkOutStep2};
            f = checkOutStepArr;
            g = EnumEntriesKt.a(checkOutStepArr);
        }

        public static CheckOutStep valueOf(String str) {
            return (CheckOutStep) Enum.valueOf(CheckOutStep.class, str);
        }

        public static CheckOutStep[] values() {
            return (CheckOutStep[]) f.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/CheckOutActivity$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(Activity activity) {
            Pair[] pairArr = {new Pair("show_tap_off", Boolean.TRUE)};
            Intent intent = new Intent(activity, (Class<?>) CheckOutActivity.class);
            intent.addFlags(0);
            intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 1)));
            activity.startActivity(intent);
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final OnBackPressedCallback P4() {
        return this.J;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_check_out_sng;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() {
        ActivityCheckOutSngBinding activityCheckOutSngBinding = (ActivityCheckOutSngBinding) DataBindingUtil.d(this, R.layout.activity_check_out_sng);
        if (activityCheckOutSngBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        LinearLayout container = activityCheckOutSngBinding.y;
        Intrinsics.g(container, "container");
        ViewExtKt.b(container, new b(10));
        getWindow().addFlags(128);
        Bundle extras = getIntent().getExtras();
        if (!(extras != null ? extras.getBoolean("show_tap_off") : false)) {
            DaggerBaseFragmentActivity.c5(this, new PayFragment(), R.id.contentHome, null, 28);
            return;
        }
        Cart cart = this.I;
        if (cart == null) {
            Intrinsics.p("shoppingCart");
            throw null;
        }
        if (StringsKt.D(cart.getC())) {
            throw new IllegalStateException("Empty cart id is not allowed");
        }
        Cart cart2 = this.I;
        if (cart2 == null) {
            Intrinsics.p("shoppingCart");
            throw null;
        }
        String c = cart2.getC();
        Cart cart3 = this.I;
        if (cart3 != null) {
            ExitScanCodeActivity.Companion.a(this, new ExitDTO(c, false, cart3.getD(), null, null, 24));
        } else {
            Intrinsics.p("shoppingCart");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final boolean X4() {
        return false;
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayFragment.PaymentListener
    public final void u1(ExitDTO exitDTO) {
        ExitScanCodeActivity.Companion.a(this, exitDTO);
    }
}
