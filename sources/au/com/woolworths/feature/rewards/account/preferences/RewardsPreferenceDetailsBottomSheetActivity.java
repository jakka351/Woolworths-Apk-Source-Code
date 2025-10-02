package au.com.woolworths.feature.rewards.account.preferences;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.base.extensions.ActivityExtKt;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsBottomSheetActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class RewardsPreferenceDetailsBottomSheetActivity extends Hilt_RewardsPreferenceDetailsBottomSheetActivity {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsBottomSheetActivity$Companion;", "", "", "EXTRA_PREFERENCES_KEY", "Ljava/lang/String;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.fade_out);
    }

    @Override // au.com.woolworths.feature.rewards.account.preferences.Hilt_RewardsPreferenceDetailsBottomSheetActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityExtKt.a(this);
        String stringExtra = getIntent().getStringExtra("preferences_key");
        if (stringExtra == null && (stringExtra = getIntent().getStringExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.preferencesKey")) == null) {
            throw new IllegalArgumentException("preferences_key cannot be null");
        }
        RewardsPreferenceDetailsBottomSheetFragment rewardsPreferenceDetailsBottomSheetFragment = new RewardsPreferenceDetailsBottomSheetFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("preferences_key", stringExtra);
        bundle2.putBoolean("is_bottom_sheet", true);
        bundle2.putString("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.sourceScreen", getIntent().getStringExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.sourceScreen"));
        rewardsPreferenceDetailsBottomSheetFragment.setArguments(bundle2);
        rewardsPreferenceDetailsBottomSheetFragment.show(getSupportFragmentManager(), "RewardsPreferenceDetailsFragment");
    }
}
