package au.com.woolworths.rewards.base;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/DeferredIntentHelper;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DeferredIntentHelper {
    public static Intent a(Intent intent) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (Intent) intent.getParcelableExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.DEFERRED_INTENT", Intent.class);
        }
        Intent intent2 = (Intent) intent.getParcelableExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.DEFERRED_INTENT");
        Bundle bundle = (Bundle) intent.getParcelableExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.DEFERRED_BUNDLE");
        if (intent2 != null && bundle != null) {
            intent2.putExtras(bundle);
        }
        return intent2;
    }
}
