package com.woolworths.scanlibrary.ui.scanner.additem;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import au.com.woolworths.feature.shop.homepage.presentation.f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.CouponBarcodeScanned;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity;
import com.woolworths.scanlibrary.databinding.ActivityManualAddItemProcessBinding;
import com.woolworths.scanlibrary.di.session.CartSessionScopedActivity;
import com.woolworths.scanlibrary.models.cart.Coupon;
import com.woolworths.scanlibrary.models.cart.CouponStatus;
import com.woolworths.scanlibrary.models.cart.CouponType;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.scanner.additem.AddItemContract;
import com.woolworths.scanlibrary.ui.weighted.WeightedArticleSelectionActivity;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseActivity;", "Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$Presenter;", "Lcom/woolworths/scanlibrary/di/session/CartSessionScopedActivity;", "Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$View;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AddItemActivity extends DaggerBaseActivity<AddItemContract.Presenter> implements CartSessionScopedActivity, AddItemContract.View {
    public static final /* synthetic */ int I = 0;
    public ActivityManualAddItemProcessBinding G;
    public AddItemContract.ViewState H = AddItemContract.ViewState.MANUAL_BAR_CODE_ENTRY_VIEW.f21328a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemActivity$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21325a;

        static {
            int[] iArr = new int[CouponStatus.values().length];
            try {
                iArr[CouponStatus.REDEEMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CouponStatus.UNUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CouponStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21325a = iArr;
        }
    }

    @Override // com.woolworths.scanlibrary.ui.scanner.additem.AddItemContract.View
    public final void L2(AddItemContract.ViewState viewState) throws Resources.NotFoundException {
        if (viewState.equals(AddItemContract.ViewState.SHELF_LABEL_SCANNED_BLOCKED_VIEW.f21330a)) {
            View viewInflate = getLayoutInflater().inflate(R.layout.shelf_label_scan_block_bottom_sheet, (ViewGroup) null);
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
            bottomSheetDialog.setContentView(viewInflate);
            bottomSheetDialog.show();
            bottomSheetDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.woolworths.scanlibrary.ui.scanner.additem.a
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    int i = AddItemActivity.I;
                    this.d.c5();
                }
            });
        } else if (viewState instanceof AddItemContract.ViewState.CouponItem) {
            AddItemContract.ViewState.CouponItem couponItem = (AddItemContract.ViewState.CouponItem) viewState;
            Coupon coupon = couponItem.c;
            boolean z = couponItem.f21326a;
            if (!z) {
                e5(coupon, new b(this, 0));
            } else {
                if (!z) {
                    throw new NoWhenBranchMatchedException();
                }
                e5(coupon, new coil3.gif.a(6, viewState, this));
            }
        } else if (viewState instanceof AddItemContract.ViewState.ScannedItemBlocked) {
            AddItemContract.ViewState.ScannedItemBlocked scannedItemBlocked = (AddItemContract.ViewState.ScannedItemBlocked) viewState;
            d5().E.B.setText(scannedItemBlocked.b);
            d5().E.A.setText(scannedItemBlocked.c);
            d5().E.y.setImageResource(scannedItemBlocked.f21331a);
            d5().E.z.setOnClickListener(new com.woolworths.scanlibrary.ui.parking.a(this, 12));
        }
        this.H = viewState;
        d5().L(this);
    }

    @Override // com.woolworths.scanlibrary.ui.scanner.additem.AddItemContract.View
    public final void N2() {
        c5();
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_manual_add_item_process;
    }

    @Override // com.woolworths.scanlibrary.ui.scanner.additem.AddItemContract.View
    public final void T0(String weightedBarCode) {
        Intrinsics.h(weightedBarCode, "weightedBarCode");
        Pair[] pairArr = {new Pair("itemWeightBarCode", weightedBarCode), new Pair("eanItemWeightRequired", getIntent().getStringExtra("eanItemWeightRequired"))};
        Intent intent = new Intent(this, (Class<?>) WeightedArticleSelectionActivity.class);
        intent.addFlags(0);
        intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 2)));
        startActivityForResult(intent, 3500);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() {
        Bundle extras;
        Bundle extras2;
        ActivityManualAddItemProcessBinding activityManualAddItemProcessBinding = (ActivityManualAddItemProcessBinding) DataBindingUtil.d(this, R.layout.activity_manual_add_item_process);
        Intrinsics.h(activityManualAddItemProcessBinding, "<set-?>");
        this.G = activityManualAddItemProcessBinding;
        d5().L(this);
        Intent intent = getIntent();
        String string = null;
        String string2 = (intent == null || (extras2 = intent.getExtras()) == null) ? null : extras2.getString("barcodeType");
        Intent intent2 = getIntent();
        if (intent2 != null && (extras = intent2.getExtras()) != null) {
            string = extras.getString("barcode");
        }
        if (string == null || string.length() <= 0 || string2 == null || string2.length() <= 0) {
            return;
        }
        ((AddItemContract.Presenter) S4()).K0(string, string2, false);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final boolean X4() {
        return false;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void Z4(Function0 function0) {
        super.Z4(new b(this, 2));
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void a5(Function0 function0) {
        super.a5(new b(this, 3));
    }

    public final void c5() {
        setResult(0);
        finish();
    }

    public final ActivityManualAddItemProcessBinding d5() {
        ActivityManualAddItemProcessBinding activityManualAddItemProcessBinding = this.G;
        if (activityManualAddItemProcessBinding != null) {
            return activityManualAddItemProcessBinding;
        }
        Intrinsics.p("binding");
        throw null;
    }

    public final void e5(Coupon coupon, Function0 function0) throws Resources.NotFoundException {
        d5().E.B.setText(coupon.getTitle());
        d5().E.A.setText(coupon.getMessage());
        d5().E.z.setOnClickListener(new f(3, function0));
        AnalyticsProvider analyticsProviderN4 = N4();
        String type = coupon.getType().toString();
        String status = coupon.getStatus().toString();
        Intrinsics.h(type, "type");
        Intrinsics.h(status, "status");
        CouponBarcodeScanned couponBarcodeScanned = new CouponBarcodeScanned("Coupon Barcode Scanned");
        couponBarcodeScanned.a("coupon.type", type);
        couponBarcodeScanned.a("coupon.status", status);
        analyticsProviderN4.b(couponBarcodeScanned);
        if (coupon.getType() != CouponType.COFFEE_CUP) {
            d5().E.y.setImageResource(R.drawable.sng_ic_exclamation);
            return;
        }
        int i = WhenMappings.f21325a[coupon.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                d5().E.y.setImageResource(R.drawable.sng_ic_coffee_cup_large_small);
                return;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        d5().E.y.setImageResource(R.drawable.sng_ic_large_coffee_cup);
        ImageView imageView = d5().E.y;
        Intrinsics.g(imageView, "imageView");
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.shake_animation);
        Intrinsics.g(animationLoadAnimation, "loadAnimation(...)");
        imageView.setAnimation(animationLoadAnimation);
    }

    @Override // com.woolworths.scanlibrary.ui.scanner.additem.AddItemContract.View
    public final void h4(Item cartItem) {
        Intrinsics.h(cartItem, "cartItem");
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("cartItemLineNo", cartItem.getLinenumber());
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, com.woolworths.scanlibrary.base.mvp.MvpView
    public final void n(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
        super.n(i, i2, apigeeErrorResponse, new b(this, 1));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 3500) {
            if (i2 != -1) {
                if (i2 != 0) {
                    return;
                }
                c5();
                return;
            }
            setResult(-1);
            if (intent != null) {
                float floatExtra = intent.getFloatExtra("productWeight", BitmapDescriptorFactory.HUE_RED);
                String stringExtra = intent.getStringExtra("cartItemLineNo");
                if (stringExtra == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ((AddItemContract.Presenter) S4()).h0(floatExtra, stringExtra);
            }
        }
    }
}
