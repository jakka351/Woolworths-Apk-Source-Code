package au.com.woolworths.feature.rewards.account.settings;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.rewards.base.RewardsAccountNavigation;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsActivityOld;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/rewards/base/RewardsAccountNavigation;", "<init>", "()V", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class AccountSettingsActivityOld extends Hilt_AccountSettingsActivityOld implements RewardsAccountNavigation {
    public FeatureToggleManager x;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsActivityOld$Companion;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // au.com.woolworths.rewards.base.RewardsAccountNavigation
    public final void A3() {
        startActivity(ActivityNavigatorKt.a(Activities.DevOptions2.f4469a, ApplicationType.d));
    }

    @Override // au.com.woolworths.rewards.base.RewardsAccountNavigation
    public final void R1(boolean z) {
        finish();
        startActivity(Activities.Welcome.b(z).setFlags(268468224));
    }

    @Override // au.com.woolworths.feature.rewards.account.settings.Hilt_AccountSettingsActivityOld, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataBindingUtil.d(this, R.layout.activity_account_settings);
    }
}
