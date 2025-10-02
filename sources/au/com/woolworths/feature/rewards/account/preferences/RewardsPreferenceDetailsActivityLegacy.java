package au.com.woolworths.feature.rewards.account.preferences;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import au.com.woolworths.feature.rewards.account.preferences.notification.RewardsPushPreferenceDetailsFragmentLegacy;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsActivityLegacy;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@Deprecated
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsPreferenceDetailsActivityLegacy extends Hilt_RewardsPreferenceDetailsActivityLegacy {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsActivityLegacy$Companion;", "", "", "EXTRA_PREFERENCES_KEY", "Ljava/lang/String;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // au.com.woolworths.feature.rewards.account.preferences.Hilt_RewardsPreferenceDetailsActivityLegacy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataBindingUtil.d(this, R.layout.activity_rewards_preference_details);
        if (getSupportFragmentManager().G("RewardsPreferenceDetailsFragment") == null) {
            String stringExtra = getIntent().getStringExtra("preferences_key");
            if (stringExtra == null && (stringExtra = getIntent().getStringExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.preferencesKey")) == null) {
                throw new IllegalArgumentException("preferences_key cannot be null");
            }
            Fragment rewardsPushPreferenceDetailsFragmentLegacy = stringExtra.equals("pushNotifications") ? new RewardsPushPreferenceDetailsFragmentLegacy() : new RewardsPreferenceDetailsFragmentLegacy();
            Bundle bundle2 = new Bundle();
            bundle2.putString("preferences_key", stringExtra);
            rewardsPushPreferenceDetailsFragmentLegacy.setArguments(bundle2);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
            FragmentTransaction fragmentTransactionE = supportFragmentManager.e();
            fragmentTransactionE.j(R.id.fragment_container, rewardsPushPreferenceDetailsFragmentLegacy, "RewardsPreferenceDetailsFragment");
            fragmentTransactionE.f();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                onBackPressed();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }
}
