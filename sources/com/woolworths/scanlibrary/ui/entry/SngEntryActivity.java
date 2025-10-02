package com.woolworths.scanlibrary.ui.entry;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.f;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity;
import com.woolworths.scanlibrary.configuration.OnSngAppCloseHandler;
import com.woolworths.scanlibrary.databinding.ActivitySngLandingEntryBinding;
import com.woolworths.scanlibrary.ui.entry.SngEntryActivity;
import com.woolworths.scanlibrary.ui.entry.SngEntryContract;
import com.woolworths.scanlibrary.ui.entry.analytics.SngWelcomeTracking;
import com.woolworths.scanlibrary.ui.entry.content.ContentItem;
import com.woolworths.scanlibrary.ui.entry.content.ContentTitle;
import com.woolworths.scanlibrary.ui.entry.content.LandingContentAction;
import com.woolworths.scanlibrary.ui.entry.content.LandingContentActionListener;
import com.woolworths.scanlibrary.ui.entry.content.LandingContentProvider;
import com.woolworths.scanlibrary.ui.entry.content.TopLogo;
import com.woolworths.scanlibrary.ui.entry.controller.LandingContentController;
import com.woolworths.scanlibrary.ui.entry.launcher.ScanAndGoLauncherState;
import com.woolworths.scanlibrary.ui.entry.launcher.SngLauncherImpl;
import com.woolworths.scanlibrary.ui.entry.launcher.errors.FetchSngErrorState;
import com.woolworths.scanlibrary.util.widget.LoadingViewDelegate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/SngEntryActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseMvvmActivity;", "Lcom/woolworths/scanlibrary/ui/entry/content/LandingContentActionListener;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SngEntryActivity extends DaggerBaseMvvmActivity implements LandingContentActionListener {
    public static final int I = Color.parseColor("#072b1a");
    public SngLauncherImpl E;
    public OnSngAppCloseHandler F;
    public LandingContentProvider G;
    public final ViewModelLazy H = new ViewModelLazy(Reflection.f24268a.b(SngEntryViewModel.class), new Function0<ViewModelStore>() { // from class: com.woolworths.scanlibrary.ui.entry.SngEntryActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new c(this, 12), new Function0<CreationExtras>() { // from class: com.woolworths.scanlibrary.ui.entry.SngEntryActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/SngEntryActivity$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21244a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[FetchSngErrorState.values().length];
            try {
                FetchSngErrorState fetchSngErrorState = FetchSngErrorState.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FetchSngErrorState fetchSngErrorState2 = FetchSngErrorState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21244a = iArr;
            int[] iArr2 = new int[LandingContentAction.values().length];
            try {
                LandingContentAction landingContentAction = LandingContentAction.d;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr2;
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final int O4() {
        return R.layout.activity_sng_landing_entry;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final void R4() {
        View decorView;
        View decorView2;
        ActivitySngLandingEntryBinding activitySngLandingEntryBinding = (ActivitySngLandingEntryBinding) DataBindingUtil.d(this, R.layout.activity_sng_landing_entry);
        if (activitySngLandingEntryBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activitySngLandingEntryBinding.L(V4());
        activitySngLandingEntryBinding.D(this);
        Button btnNearestStore = activitySngLandingEntryBinding.z;
        Intrinsics.g(btnNearestStore, "btnNearestStore");
        final String string = getString(R.string.sng_welcome_stores);
        Intrinsics.g(string, "getString(...)");
        ViewCompat.A(btnNearestStore, new AccessibilityDelegateCompat() { // from class: com.woolworths.scanlibrary.ui.entry.SngEntryActivity$overrideAccessibilityVoiceOver$1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View host, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                Intrinsics.h(host, "host");
                this.f2466a.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfoCompat.f2508a);
                accessibilityNodeInfoCompat.s(string);
            }
        });
        Button btnSetupSng = activitySngLandingEntryBinding.A;
        Intrinsics.g(btnSetupSng, "btnSetupSng");
        final String string2 = getString(R.string.sng_welcome_setup);
        Intrinsics.g(string2, "getString(...)");
        ViewCompat.A(btnSetupSng, new AccessibilityDelegateCompat() { // from class: com.woolworths.scanlibrary.ui.entry.SngEntryActivity$overrideAccessibilityVoiceOver$1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View host, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                Intrinsics.h(host, "host");
                this.f2466a.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfoCompat.f2508a);
                accessibilityNodeInfoCompat.s(string2);
            }
        });
        LandingContentController landingContentController = new LandingContentController(this);
        activitySngLandingEntryBinding.B.setController(landingContentController);
        LandingContentProvider landingContentProvider = this.G;
        if (landingContentProvider == null) {
            Intrinsics.p("landingContentProvider");
            throw null;
        }
        landingContentController.setData(CollectionsKt.R(new TopLogo(), new ContentTitle(landingContentProvider.a(R.string.sng_label_welcome_to_sng), landingContentProvider.a(R.string.sng_label_welcome_info_title)), new ContentItem(R.drawable.sng_landing_ic_scan, landingContentProvider.a(R.string.sng_landing_bag_as_you_go_title), landingContentProvider.a(R.string.sng_landing_bag_as_you_go_body), landingContentProvider.a(R.string.sng_button_how_it_works), LandingContentAction.d), new ContentItem(R.drawable.sng_landing_ic_track, landingContentProvider.a(R.string.sng_landing_track_your_spend_title), landingContentProvider.a(R.string.sng_landing_track_your_spend_body), null, null), new ContentItem(R.drawable.sng_landing_ic_checkout, landingContentProvider.a(R.string.sng_landing_checkout_faster_title), landingContentProvider.c ? landingContentProvider.a(R.string.sng_landing_checkout_faster_body) : landingContentProvider.a(R.string.sng_landing_checkout_faster_dedicated_lane_body), null, null)));
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            int systemUiVisibility = decorView.getSystemUiVisibility();
            Window window2 = getWindow();
            if (window2 != null && (decorView2 = window2.getDecorView()) != null) {
                decorView2.setSystemUiVisibility(systemUiVisibility & (-8193));
            }
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setStatusBarColor(I);
        }
    }

    public final SngEntryViewModel V4() {
        return (SngEntryViewModel) this.H.getD();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0 && V4().i.a()) {
            finish();
            return;
        }
        if (i == 1004) {
            SngLauncherImpl sngLauncherImpl = this.E;
            if (sngLauncherImpl == null) {
                Intrinsics.p("sngLauncher");
                throw null;
            }
            sngLauncherImpl.j = this;
            if (i == 1004 && i2 == -1) {
                sngLauncherImpl.b();
            }
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Activities.MainActivity.Tab tab;
        N4();
        super.onCreate(bundle);
        Activities.MainActivity.ExtraTargetTabWithMessage extraTargetTabWithMessage = (Activities.MainActivity.ExtraTargetTabWithMessage) getIntent().getParcelableExtra("EXTRA_RETURN_TAB");
        if (extraTargetTabWithMessage != null && (tab = extraTargetTabWithMessage.d) != null) {
            OnSngAppCloseHandler onSngAppCloseHandler = this.F;
            if (onSngAppCloseHandler == null) {
                Intrinsics.p("closeHandler");
                throw null;
            }
            onSngAppCloseHandler.b(tab);
        }
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new SngEntryActivity$subscribeActions$1(this, null), 3);
        final int i = 0;
        V4().o.f(this, new SngEntryActivity$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: com.woolworths.scanlibrary.ui.entry.a
            public final /* synthetic */ SngEntryActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                Unit unit = Unit.f24250a;
                SngEntryActivity sngEntryActivity = this.e;
                switch (i2) {
                    case 0:
                        int i3 = SngEntryActivity.I;
                        if (((SngEntryContract.ViewState) obj).f21250a) {
                            LoadingViewDelegate loadingViewDelegate = sngEntryActivity.v;
                            if (loadingViewDelegate != null) {
                                loadingViewDelegate.b.setVisibility(0);
                                loadingViewDelegate.c();
                            }
                        } else {
                            LoadingViewDelegate loadingViewDelegate2 = sngEntryActivity.v;
                            if (loadingViewDelegate2 != null) {
                                loadingViewDelegate2.b();
                            }
                        }
                        return unit;
                    default:
                        ScanAndGoLauncherState scanAndGoLauncherState = (ScanAndGoLauncherState) obj;
                        int i4 = SngEntryActivity.I;
                        FetchSngErrorState fetchSngErrorState = scanAndGoLauncherState.b;
                        int i5 = fetchSngErrorState == null ? -1 : SngEntryActivity.WhenMappings.f21244a[fetchSngErrorState.ordinal()];
                        if (i5 != -1) {
                            if (i5 != 1 && i5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            SngEntryViewModel.s6(sngEntryActivity.V4(), false, false, scanAndGoLauncherState.b, 3);
                        }
                        return unit;
                }
            }
        }));
        SngLauncherImpl sngLauncherImpl = this.E;
        if (sngLauncherImpl == null) {
            Intrinsics.p("sngLauncher");
            throw null;
        }
        final int i2 = 1;
        sngLauncherImpl.k.f(this, new SngEntryActivity$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: com.woolworths.scanlibrary.ui.entry.a
            public final /* synthetic */ SngEntryActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                Unit unit = Unit.f24250a;
                SngEntryActivity sngEntryActivity = this.e;
                switch (i22) {
                    case 0:
                        int i3 = SngEntryActivity.I;
                        if (((SngEntryContract.ViewState) obj).f21250a) {
                            LoadingViewDelegate loadingViewDelegate = sngEntryActivity.v;
                            if (loadingViewDelegate != null) {
                                loadingViewDelegate.b.setVisibility(0);
                                loadingViewDelegate.c();
                            }
                        } else {
                            LoadingViewDelegate loadingViewDelegate2 = sngEntryActivity.v;
                            if (loadingViewDelegate2 != null) {
                                loadingViewDelegate2.b();
                            }
                        }
                        return unit;
                    default:
                        ScanAndGoLauncherState scanAndGoLauncherState = (ScanAndGoLauncherState) obj;
                        int i4 = SngEntryActivity.I;
                        FetchSngErrorState fetchSngErrorState = scanAndGoLauncherState.b;
                        int i5 = fetchSngErrorState == null ? -1 : SngEntryActivity.WhenMappings.f21244a[fetchSngErrorState.ordinal()];
                        if (i5 != -1) {
                            if (i5 != 1 && i5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            SngEntryViewModel.s6(sngEntryActivity.V4(), false, false, scanAndGoLauncherState.b, 3);
                        }
                        return unit;
                }
            }
        }));
        new Handler(Looper.getMainLooper()).post(new f(this, 8));
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        SngLauncherImpl sngLauncherImpl = this.E;
        if (sngLauncherImpl != null) {
            sngLauncherImpl.a();
        } else {
            Intrinsics.p("sngLauncher");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (V4().i.a()) {
            return;
        }
        V4().j.a(Screens.q);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        LoadingViewDelegate loadingViewDelegate = this.v;
        if (loadingViewDelegate != null) {
            loadingViewDelegate.b();
        }
    }

    @Override // com.woolworths.scanlibrary.ui.entry.content.LandingContentActionListener
    public final void x3(LandingContentAction action) {
        Intrinsics.h(action, "action");
        if (WhenMappings.b[action.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        SngEntryViewModel sngEntryViewModelV4 = V4();
        sngEntryViewModelV4.j.c(SngWelcomeTracking.g);
        sngEntryViewModelV4.m.f(SngEntryContract.Actions.ShowTutorial.f21249a);
    }
}
