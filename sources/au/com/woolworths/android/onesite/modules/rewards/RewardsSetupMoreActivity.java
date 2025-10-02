package au.com.woolworths.android.onesite.modules.rewards;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.e;
import au.com.woolworths.android.onesite.analytics.adobe.data.ScreenState;
import au.com.woolworths.android.onesite.legacy.databinding.ActivityRewardsChooserMoreBinding;
import au.com.woolworths.android.onesite.modules.onboarding.analytics.RewardsSetupActions;
import au.com.woolworths.android.onesite.modules.onboarding.rewardssetup.RewardsSetupFragment;
import au.com.woolworths.android.onesite.modules.onboarding.rewardssetup.RewardsSetupViewModel;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/RewardsSetupMoreActivity;", "Lau/com/woolworths/android/onesite/modules/BaseShopAppActivity;", "<init>", "()V", "Companion", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsSetupMoreActivity extends Hilt_RewardsSetupMoreActivity {
    public static final /* synthetic */ int E = 0;
    public final String B = "More Rewards screen";
    public final ViewModelLazy C = new ViewModelLazy(Reflection.f24268a.b(RewardsSetupViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.android.onesite.modules.rewards.RewardsSetupMoreActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.android.onesite.modules.rewards.RewardsSetupMoreActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.android.onesite.modules.rewards.RewardsSetupMoreActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public Activities.RewardsSetupMoreActivity.ExtraSetupEntryPoint D;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/RewardsSetupMoreActivity$Companion;", "", "", "EXTRA_SOURCE", "Ljava/lang/String;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public RewardsSetupMoreActivity() {
        this.u = true;
    }

    @Override // au.com.woolworths.android.onesite.modules.BaseShopAppActivity
    /* renamed from: P4 */
    public final int getH() {
        throw new IllegalStateException("Since we use `setUsesDatabinding(true)` we shouldn't need layoutRes");
    }

    public final void R4(boolean z) {
        Intent intentB = Activities.MainActivity.f4487a.b();
        if (z && getIntent().getBooleanExtra("is_deep_link_flag", false)) {
            intentB.putExtras(getIntent());
        }
        startActivity(intentB);
    }

    public final void S4() {
        Activities.RewardsSetupMoreActivity.ExtraSetupEntryPoint extraSetupEntryPoint = this.D;
        if ((extraSetupEntryPoint != null ? extraSetupEntryPoint.d : null) == Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint.f) {
            R4(false);
        } else {
            ((RewardsSetupViewModel) this.C.getD()).f.c(RewardsSetupActions.e);
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if ((i == 5 || i == 10005) && i2 == -1) {
            Activities.RewardsSetupMoreActivity.ExtraSetupEntryPoint extraSetupEntryPoint = this.D;
            if ((extraSetupEntryPoint != null ? extraSetupEntryPoint.d : null) == Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint.f) {
                R4(true);
            } else {
                Bundle extras = getIntent().getExtras();
                Intent intent2 = new Intent();
                if (extras != null && extras.containsKey("EXTRA_SOURCE")) {
                    intent2.putExtra("EXTRA_SOURCE", extras.getParcelable("EXTRA_SOURCE"));
                }
                setResult(-1, intent2);
            }
            finish();
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.Hilt_RewardsSetupMoreActivity, au.com.woolworths.android.onesite.modules.BaseShopAppActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws NoSuchMethodException, SecurityException {
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = ActivityRewardsChooserMoreBinding.B;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        ActivityRewardsChooserMoreBinding activityRewardsChooserMoreBinding = (ActivityRewardsChooserMoreBinding) ViewDataBinding.q(layoutInflater, R.layout.activity_rewards_chooser_more, null, false, null);
        Intrinsics.g(activityRewardsChooserMoreBinding, "inflate(...)");
        setContentView(activityRewardsChooserMoreBinding.h);
        setSupportActionBar(activityRewardsChooserMoreBinding.y.y);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u();
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("DISPLAY_SKIP_BUTTON", false);
        RewardsSetupFragment rewardsSetupFragment = new RewardsSetupFragment();
        rewardsSetupFragment.setArguments(bundle2);
        FragmentTransaction fragmentTransactionE = getSupportFragmentManager().e();
        fragmentTransactionE.g(R.id.rewards_card_prompt_frame_layout, rewardsSetupFragment, "REWARDS_CARD_PROMPT_ID", 1);
        fragmentTransactionE.d();
        Bundle extras = getIntent().getExtras();
        Activities.RewardsSetupMoreActivity.ExtraSetupEntryPoint extraSetupEntryPoint = extras != null ? (Activities.RewardsSetupMoreActivity.ExtraSetupEntryPoint) extras.getParcelable("EXTRA_SOURCE") : null;
        this.D = extraSetupEntryPoint != null ? extraSetupEntryPoint : null;
        OnBackPressedDispatcherKt.a(getOnBackPressedDispatcher(), this, new e(this, 5), 2);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                S4();
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        LegacyShopAnalyticsManager legacyShopAnalyticsManager = this.w;
        if (legacyShopAnalyticsManager != null) {
            legacyShopAnalyticsManager.a(ScreenState.Companion.a(this.B));
        } else {
            Intrinsics.p("legacyShopAnalyticsManager");
            throw null;
        }
    }
}
