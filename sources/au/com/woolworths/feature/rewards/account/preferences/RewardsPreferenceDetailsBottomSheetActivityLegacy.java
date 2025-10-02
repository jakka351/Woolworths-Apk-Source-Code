package au.com.woolworths.feature.rewards.account.preferences;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import au.com.woolworths.feature.rewards.account.preferences.notification.RewardsPushPreferenceDetailsFragmentLegacy;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Deprecated;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsBottomSheetActivityLegacy;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/content/DialogInterface$OnDismissListener;", "<init>", "()V", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@Deprecated
/* loaded from: classes3.dex */
public final class RewardsPreferenceDetailsBottomSheetActivityLegacy extends Hilt_RewardsPreferenceDetailsBottomSheetActivityLegacy implements DialogInterface.OnDismissListener {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsBottomSheetActivityLegacy$Companion;", "", "", "EXTRA_PREFERENCES_KEY", "Ljava/lang/String;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.fade_out);
    }

    @Override // au.com.woolworths.feature.rewards.account.preferences.Hilt_RewardsPreferenceDetailsBottomSheetActivityLegacy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        String stringExtra = getIntent().getStringExtra("preferences_key");
        if (stringExtra == null && (stringExtra = getIntent().getStringExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.preferencesKey")) == null) {
            throw new IllegalArgumentException("preferences_key cannot be null");
        }
        DialogFragment rewardsPushPreferenceDetailsFragmentLegacy = stringExtra.equals("pushNotifications") ? new RewardsPushPreferenceDetailsFragmentLegacy() : new RewardsPreferenceDetailsFragmentLegacy();
        Bundle bundle2 = new Bundle();
        bundle2.putString("preferences_key", stringExtra);
        bundle2.putBoolean("should_hide_toolbar", true);
        bundle2.putString("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.sourceScreen", getIntent().getStringExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.sourceScreen"));
        rewardsPushPreferenceDetailsFragmentLegacy.setArguments(bundle2);
        rewardsPushPreferenceDetailsFragmentLegacy.show(getSupportFragmentManager(), "RewardsPreferenceDetailsFragment");
    }
}
