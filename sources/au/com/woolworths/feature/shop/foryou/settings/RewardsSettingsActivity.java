package au.com.woolworths.feature.shop.foryou.settings;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsState;
import au.com.woolworths.feature.shop.foryou.databinding.ActivityRewardsSettingsBinding;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsContract;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsSettingsActivity extends Hilt_RewardsSettingsActivity {
    public static final /* synthetic */ int C = 0;
    public RewardsSettingsController A;
    public final ViewModelLazy B = new ViewModelLazy(Reflection.f24268a.b(RewardsSettingsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public AnalyticsManager x;
    public FeatureToggleManager y;
    public ActivityRewardsSettingsBinding z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsActivity$Companion;", "", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public final AnalyticsManager O4() {
        AnalyticsManager analyticsManager = this.x;
        if (analyticsManager != null) {
            return analyticsManager;
        }
        Intrinsics.p("analyticsManager");
        throw null;
    }

    public final RewardsSettingsViewModel P4() {
        return (RewardsSettingsViewModel) this.B.getD();
    }

    @Override // au.com.woolworths.feature.shop.foryou.settings.Hilt_RewardsSettingsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityRewardsSettingsBinding activityRewardsSettingsBinding = (ActivityRewardsSettingsBinding) DataBindingUtil.d(this, R.layout.activity_rewards_settings);
        this.z = activityRewardsSettingsBinding;
        if (activityRewardsSettingsBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        setSupportActionBar(activityRewardsSettingsBinding.A);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        ActivityRewardsSettingsBinding activityRewardsSettingsBinding2 = this.z;
        if (activityRewardsSettingsBinding2 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        activityRewardsSettingsBinding2.D(this);
        activityRewardsSettingsBinding2.L(P4());
        RewardsSettingsController rewardsSettingsController = new RewardsSettingsController(P4());
        this.A = rewardsSettingsController;
        ActivityRewardsSettingsBinding activityRewardsSettingsBinding3 = this.z;
        if (activityRewardsSettingsBinding3 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        activityRewardsSettingsBinding3.z.setController(rewardsSettingsController);
        P4().j.f(this, new RewardsSettingsActivity$sam$androidx_lifecycle_Observer$0(new a(this)));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new RewardsSettingsActivity$observeActions$1(this, null), 3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Callback.p(menuItem);
        try {
            Intrinsics.h(menuItem, "menuItem");
            if (menuItem.getItemId() == 16908332) {
                onBackPressed();
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        List list;
        super.onResume();
        RewardsSettingsViewModel rewardsSettingsViewModelP4 = P4();
        RewardsSettingsInteractor rewardsSettingsInteractor = rewardsSettingsViewModelP4.e;
        int iOrdinal = rewardsSettingsInteractor.b.f7144a.b().ordinal();
        if (iOrdinal == 0) {
            list = RewardsAuSettingsOption.g;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            list = RewardsNzSettingsOption.f;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (rewardsSettingsInteractor.f7143a.getRewardsState() == RewardsState.ACTIVE ? ((RewardsSettingsOption) next).d() : true) {
                arrayList.add(next);
            }
        }
        rewardsSettingsViewModelP4.k = arrayList;
        rewardsSettingsViewModelP4.j.m(new RewardsSettingsContract.ViewState(arrayList, false));
        O4().a(Screens.B);
    }
}
