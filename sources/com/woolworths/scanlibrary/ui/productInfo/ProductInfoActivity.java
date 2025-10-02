package com.woolworths.scanlibrary.ui.productInfo;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragmentActivity;
import com.woolworths.scanlibrary.databinding.ActivityProductInfoBinding;
import com.woolworths.scanlibrary.di.session.CartSessionScopedActivity;
import com.woolworths.scanlibrary.ui.home.HomeActivity;
import com.woolworths.scanlibrary.ui.navigation.ScreenNavigator;
import com.woolworths.scanlibrary.ui.parking.a;
import com.woolworths.scanlibrary.ui.productInfo.ProductInfoActivityContract;
import com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/ProductInfoActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseFragmentActivity;", "Lcom/woolworths/scanlibrary/ui/productInfo/ProductInfoActivityContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoFragment$ProductInfoListener;", "Lcom/woolworths/scanlibrary/di/session/CartSessionScopedActivity;", "Lcom/woolworths/scanlibrary/ui/productInfo/ProductInfoActivityContract$View;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductInfoActivity extends DaggerBaseFragmentActivity<ProductInfoActivityContract.Presenter> implements ProductInfoFragment.ProductInfoListener, CartSessionScopedActivity, ProductInfoActivityContract.View {
    public static final /* synthetic */ int K = 0;
    public ScreenNavigator I;
    public ActivityProductInfoBinding J;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/ProductInfoActivity$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoFragment.ProductInfoListener
    public final void L0(String lineNo) {
        Intrinsics.h(lineNo, "lineNo");
        d5(lineNo);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_product_info;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() {
        String string;
        ActivityProductInfoBinding activityProductInfoBinding = (ActivityProductInfoBinding) DataBindingUtil.d(this, R.layout.activity_product_info);
        this.J = activityProductInfoBinding;
        if (activityProductInfoBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        CoordinatorLayout container = activityProductInfoBinding.z;
        Intrinsics.g(container, "container");
        ViewExtKt.b(container, new b(16));
        getWindow().addFlags(128);
        ActivityProductInfoBinding activityProductInfoBinding2 = this.J;
        if (activityProductInfoBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        setSupportActionBar(activityProductInfoBinding2.B.y);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.u();
        ActionBar supportActionBar2 = getSupportActionBar();
        Intrinsics.e(supportActionBar2);
        supportActionBar2.t();
        ActionBar supportActionBar3 = getSupportActionBar();
        Intrinsics.e(supportActionBar3);
        supportActionBar3.s(true);
        ActivityProductInfoBinding activityProductInfoBinding3 = this.J;
        if (activityProductInfoBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityProductInfoBinding3.B.z.setText(getString(R.string.sng_title_product_information));
        supportPostponeEnterTransition();
        Bundle extras = getIntent().getExtras();
        String str = "-1";
        if (extras != null && (string = extras.getString("cartItemLineNo", "-1")) != null) {
            str = string;
        }
        d5(str);
        ActivityProductInfoBinding activityProductInfoBinding4 = this.J;
        if (activityProductInfoBinding4 != null) {
            activityProductInfoBinding4.y.setOnClickListener(new a(this, 3));
        } else {
            Intrinsics.p("viewBinding");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final boolean X4() {
        return false;
    }

    public final void d5(String lineNo) {
        Intrinsics.h(lineNo, "lineNo");
        ProductInfoFragment productInfoFragment = new ProductInfoFragment();
        Bundle bundle = new Bundle();
        bundle.putString("cartItemLineNo", lineNo);
        productInfoFragment.setArguments(bundle);
        DaggerBaseFragmentActivity.c5(this, productInfoFragment, R.id.contentHome, null, 28);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        super.onActivityResult(i, i2, intent);
        if (i == 1000 && i2 == -1) {
            if (((intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("cartItemLineNo")) != null) {
                HomeActivity.Companion.a(this, (6 & 2) != 0, null);
            }
        }
    }
}
