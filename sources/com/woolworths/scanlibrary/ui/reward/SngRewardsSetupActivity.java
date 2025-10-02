package com.woolworths.scanlibrary.ui.reward;

import android.content.Intent;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity;
import com.woolworths.scanlibrary.databinding.ActivitySngRewardsSetupBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/reward/SngRewardsSetupActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseMvvmActivity;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SngRewardsSetupActivity extends DaggerBaseMvvmActivity {
    public static final /* synthetic */ int G = 0;
    public final ViewModelLazy E = new ViewModelLazy(Reflection.f24268a.b(SngRewardSetupViewModel.class), new Function0<ViewModelStore>() { // from class: com.woolworths.scanlibrary.ui.reward.SngRewardsSetupActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new c(this, 20), new Function0<CreationExtras>() { // from class: com.woolworths.scanlibrary.ui.reward.SngRewardsSetupActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public ActivitySngRewardsSetupBinding F;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/reward/SngRewardsSetupActivity$Companion;", "", "", "REWARDS_AUTH_REQUEST_CODE", "I", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final int O4() {
        return R.layout.activity_sng_rewards_setup;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final void R4() {
        ActivitySngRewardsSetupBinding activitySngRewardsSetupBinding = (ActivitySngRewardsSetupBinding) DataBindingUtil.d(this, R.layout.activity_sng_rewards_setup);
        this.F = activitySngRewardsSetupBinding;
        if (activitySngRewardsSetupBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activitySngRewardsSetupBinding.D(this);
        ActivitySngRewardsSetupBinding activitySngRewardsSetupBinding2 = this.F;
        if (activitySngRewardsSetupBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activitySngRewardsSetupBinding2.L((SngRewardSetupViewModel) this.E.getD());
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new SngRewardsSetupActivity$subscribeActions$1(this, null), 3);
        FeatureToggleManager featureToggleManager = this.w;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (featureToggleManager.c(BaseShopAppFeature.R)) {
            ActivitySngRewardsSetupBinding activitySngRewardsSetupBinding3 = this.F;
            if (activitySngRewardsSetupBinding3 == null) {
                Intrinsics.p("viewBinding");
                throw null;
            }
            activitySngRewardsSetupBinding3.C.setVisibility(4);
            startActivityForResult(Activities.RewardsSetupMoreActivity.f4522a.b(Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint.e, true), 10005);
            return;
        }
        ActivitySngRewardsSetupBinding activitySngRewardsSetupBinding4 = this.F;
        if (activitySngRewardsSetupBinding4 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        setSupportActionBar(activitySngRewardsSetupBinding4.D);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u();
            supportActionBar.t();
            supportActionBar.s(true);
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final boolean S4() {
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if ((i == 5 || i == 10005) && i2 == -1) {
            ((SngRewardSetupViewModel) this.E.getD()).r6();
            return;
        }
        FeatureToggleManager featureToggleManager = this.w;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (featureToggleManager.c(BaseShopAppFeature.R)) {
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((SngRewardSetupViewModel) this.E.getD()).m.a(Screens.i);
    }
}
