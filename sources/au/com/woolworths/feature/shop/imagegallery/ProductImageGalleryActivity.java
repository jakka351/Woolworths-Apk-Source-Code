package au.com.woolworths.feature.shop.imagegallery;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.ActionBar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.IntentCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.shop.imagegallery.analytics.ProductImageGalleryActions;
import au.com.woolworths.feature.shop.imagegallery.analytics.ProductImageGalleryScreenState;
import au.com.woolworths.feature.shop.imagegallery.databinding.ActivityProductImageGalleryBinding;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/imagegallery/ProductImageGalleryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "image-gallery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductImageGalleryActivity extends Hilt_ProductImageGalleryActivity {
    public static final /* synthetic */ int B = 0;
    public LegacyShopAnalyticsManager x;
    public ActivityProductImageGalleryBinding z;
    public final Lazy y = LazyKt.b(new Function0<Activities.ImageGallery.Extras>() { // from class: au.com.woolworths.feature.shop.imagegallery.ProductImageGalleryActivity$special$$inlined$extraOrThrow$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Parcelable parcelable = (Parcelable) IntentCompat.a(this.d.getIntent(), "EXTRA_IMAGE_GALLERY_DATA", Activities.ImageGallery.Extras.class);
            if (parcelable != null) {
                return parcelable;
            }
            throw new IllegalArgumentException("Value for EXTRA_IMAGE_GALLERY_DATA must be provided and not null.");
        }
    });
    public final ViewModelLazy A = new ViewModelLazy(Reflection.f24268a.b(ProductImageGalleryViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.imagegallery.ProductImageGalleryActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.imagegallery.ProductImageGalleryActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.imagegallery.ProductImageGalleryActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    public final void O4() {
        ProductImageGalleryViewModel productImageGalleryViewModel = (ProductImageGalleryViewModel) this.A.getD();
        if (((Activities.ImageGallery.Extras) productImageGalleryViewModel.g.e) != null) {
            productImageGalleryViewModel.f.c(ProductImageGalleryActions.e);
        }
        Intent intent = new Intent();
        ActivityProductImageGalleryBinding activityProductImageGalleryBinding = this.z;
        if (activityProductImageGalleryBinding == null) {
            Intrinsics.p("dataBinding");
            throw null;
        }
        intent.putExtra("EXTRA_IMAGE_INDEX", activityProductImageGalleryBinding.z.getCurrentItem());
        setResult(-1, intent);
        ActivityCompat.h(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.h(new ReportOwner(ReportOwner.Squad.q), e, "Product image gallery touch event clash", 24);
            return true;
        }
    }

    @Override // au.com.woolworths.feature.shop.imagegallery.Hilt_ProductImageGalleryActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        this.z = (ActivityProductImageGalleryBinding) DataBindingUtil.d(this, com.woolworths.R.layout.activity_product_image_gallery);
        Lazy lazy = this.y;
        ImageCarouselPagerAdapter imageCarouselPagerAdapter = new ImageCarouselPagerAdapter(this, ((Activities.ImageGallery.Extras) lazy.getD()).e);
        ActivityProductImageGalleryBinding activityProductImageGalleryBinding = this.z;
        if (activityProductImageGalleryBinding == null) {
            Intrinsics.p("dataBinding");
            throw null;
        }
        activityProductImageGalleryBinding.z.setAdapter(imageCarouselPagerAdapter);
        ActivityProductImageGalleryBinding activityProductImageGalleryBinding2 = this.z;
        if (activityProductImageGalleryBinding2 == null) {
            Intrinsics.p("dataBinding");
            throw null;
        }
        ViewModelLazy viewModelLazy = this.A;
        activityProductImageGalleryBinding2.L((ProductImageGalleryViewModel) viewModelLazy.getD());
        ((ProductImageGalleryViewModel) viewModelLazy.getD()).g.i((Activities.ImageGallery.Extras) lazy.getD());
        ActivityProductImageGalleryBinding activityProductImageGalleryBinding3 = this.z;
        if (activityProductImageGalleryBinding3 == null) {
            Intrinsics.p("dataBinding");
            throw null;
        }
        setSupportActionBar(activityProductImageGalleryBinding3.y);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t();
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.s(true);
        }
        OnBackPressedDispatcherKt.a(getOnBackPressedDispatcher(), this, new l(this, 28), 2);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        LegacyShopAnalyticsManager legacyShopAnalyticsManager = this.x;
        if (legacyShopAnalyticsManager != null) {
            legacyShopAnalyticsManager.a(new ProductImageGalleryScreenState(((Activities.ImageGallery.Extras) this.y.getD()).d));
        } else {
            Intrinsics.p("analyticsManager");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public final boolean onSupportNavigateUp() {
        O4();
        return true;
    }
}
