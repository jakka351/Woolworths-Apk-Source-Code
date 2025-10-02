package com.woolworths.scanlibrary.ui.onboarding;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity;
import com.woolworths.scanlibrary.databinding.ActivityOnBoardingBinding;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingContract;
import com.woolworths.scanlibrary.ui.onboarding.analytics.OnboardingAnalyticsData;
import com.woolworths.scanlibrary.util.widget.DotIndicatorView;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseActivity;", "Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingContract$View;", "Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingClickListener;", "<init>", "()V", "ZoomOutPageTransformer", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OnBoardingActivity extends DaggerBaseActivity<OnBoardingContract.Presenter> implements OnBoardingContract.View, OnBoardingClickListener {
    public static final /* synthetic */ int K = 0;
    public ActivityOnBoardingBinding G;
    public final OnBoardingActivity$backButtonHandler$1 H = new OnBackPressedCallback() { // from class: com.woolworths.scanlibrary.ui.onboarding.OnBoardingActivity$backButtonHandler$1
        {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void e() {
            i(false);
            this.d.finish();
        }
    };
    public final Lazy I = LazyKt.b(new c(this, 15));
    public List J;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingActivity$Companion;", "", "", "MIN_SCALE", "F", "MIN_ALPHA", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingActivity$ZoomOutPageTransformer;", "Landroidx/viewpager2/widget/ViewPager2$PageTransformer;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ZoomOutPageTransformer implements ViewPager2.PageTransformer {
        @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
        public final void a(View view, float f) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (f < -1.0f) {
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
                return;
            }
            if (f > 1.0f) {
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
                return;
            }
            float f2 = 1;
            float fMax = Math.max(0.85f, f2 - Math.abs(f));
            float f3 = f2 - fMax;
            float f4 = 2;
            float f5 = (height * f3) / f4;
            float f6 = (width * f3) / f4;
            view.setTranslationX(f < BitmapDescriptorFactory.HUE_RED ? f6 - (f5 / f4) : f6 + (f5 / f4));
            view.setScaleX(fMax);
            view.setScaleY(fMax);
            view.setAlpha((((fMax - 0.85f) / 0.14999998f) * 0.5f) + 0.5f);
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final OnBackPressedCallback P4() {
        return this.H;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_on_boarding;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() {
        this.G = (ActivityOnBoardingBinding) DataBindingUtil.d(this, R.layout.activity_on_boarding);
        this.J = ((OnBoardingContract.Presenter) S4()).b1();
        ActivityOnBoardingBinding activityOnBoardingBinding = this.G;
        if (activityOnBoardingBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        ConstraintLayout onBoardingContainer = activityOnBoardingBinding.A;
        Intrinsics.g(onBoardingContainer, "onBoardingContainer");
        ViewExtKt.b(onBoardingContainer, new b(15));
        ActivityOnBoardingBinding activityOnBoardingBinding2 = this.G;
        if (activityOnBoardingBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        ViewPager2 viewPager2 = activityOnBoardingBinding2.B;
        Lazy lazy = this.I;
        viewPager2.setAdapter((OnBoardingPagerAdapter) lazy.getD());
        viewPager2.c(new ViewPager2.OnPageChangeCallback() { // from class: com.woolworths.scanlibrary.ui.onboarding.OnBoardingActivity$initViews$2$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void c(int i) {
                OnBoardingActivity onBoardingActivity = this.f21279a;
                ActivityOnBoardingBinding activityOnBoardingBinding3 = onBoardingActivity.G;
                if (activityOnBoardingBinding3 == null) {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
                activityOnBoardingBinding3.z.setCurrentPosition(i);
                OnBoardingContract.Presenter presenter = (OnBoardingContract.Presenter) onBoardingActivity.S4();
                OnboardingAnalyticsData onboardingAnalyticsData = OnboardingAnalyticsData.e;
                List list = onBoardingActivity.J;
                if (list == null) {
                    Intrinsics.p("onBoardingList");
                    throw null;
                }
                String string = onBoardingActivity.getString(((OnBoardingPageTemplateData) list.get(i)).e);
                Intrinsics.g(string, "getString(...)");
                presenter.x0(i, onboardingAnalyticsData, string);
            }
        });
        OnBoardingPagerAdapter onBoardingPagerAdapter = (OnBoardingPagerAdapter) lazy.getD();
        List list = this.J;
        if (list == null) {
            Intrinsics.p("onBoardingList");
            throw null;
        }
        onBoardingPagerAdapter.getClass();
        onBoardingPagerAdapter.h = list;
        onBoardingPagerAdapter.l();
        ActivityOnBoardingBinding activityOnBoardingBinding3 = this.G;
        if (activityOnBoardingBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        DotIndicatorView dotIndicatorView = activityOnBoardingBinding3.z;
        List list2 = this.J;
        if (list2 == null) {
            Intrinsics.p("onBoardingList");
            throw null;
        }
        dotIndicatorView.setTotalCount(list2.size());
        ActivityOnBoardingBinding activityOnBoardingBinding4 = this.G;
        if (activityOnBoardingBinding4 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityOnBoardingBinding4.z.setCurrentPosition(0);
        ActivityOnBoardingBinding activityOnBoardingBinding5 = this.G;
        if (activityOnBoardingBinding5 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityOnBoardingBinding5.z.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.woolworths.scanlibrary.ui.onboarding.OnBoardingActivity$initViews$3$1
            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                Intrinsics.h(host, "host");
                Intrinsics.h(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                OnBoardingActivity onBoardingActivity = this.f21280a;
                ActivityOnBoardingBinding activityOnBoardingBinding6 = onBoardingActivity.G;
                if (activityOnBoardingBinding6 == null) {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
                int currentItem = activityOnBoardingBinding6.B.getCurrentItem() + 1;
                String string = currentItem == 1 ? onBoardingActivity.getString(R.string.sng_onboarding_accessibility_page_indicator_action_desc) : "";
                Intrinsics.e(string);
                Integer numValueOf = Integer.valueOf(currentItem);
                List list3 = onBoardingActivity.J;
                if (list3 == null) {
                    Intrinsics.p("onBoardingList");
                    throw null;
                }
                String string2 = onBoardingActivity.getString(R.string.sng_onboarding_accessibility_page_indicator, numValueOf, Integer.valueOf(list3.size()), string);
                Intrinsics.g(string2, "getString(...)");
                info.setText(string2);
            }
        });
        ActivityOnBoardingBinding activityOnBoardingBinding6 = this.G;
        if (activityOnBoardingBinding6 != null) {
            activityOnBoardingBinding6.y.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 29));
        } else {
            Intrinsics.p("viewBinding");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final boolean X4() {
        return false;
    }

    public final void c5(OnboardingAnalyticsData onboardingAnalyticsData, int i) {
        OnBoardingContract.Presenter presenter = (OnBoardingContract.Presenter) S4();
        List list = this.J;
        if (list == null) {
            Intrinsics.p("onBoardingList");
            throw null;
        }
        String string = getString(((OnBoardingPageTemplateData) list.get(i)).e);
        Intrinsics.g(string, "getString(...)");
        presenter.x0(i, onboardingAnalyticsData, string);
    }

    @Override // com.woolworths.scanlibrary.ui.onboarding.OnBoardingClickListener
    public final void j4() {
        setResult(0);
        finish();
        OnboardingAnalyticsData onboardingAnalyticsData = OnboardingAnalyticsData.g;
        ActivityOnBoardingBinding activityOnBoardingBinding = this.G;
        if (activityOnBoardingBinding != null) {
            c5(onboardingAnalyticsData, activityOnBoardingBinding.B.getCurrentItem());
        } else {
            Intrinsics.p("viewBinding");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((OnBoardingContract.Presenter) S4()).W0();
    }
}
