package au.com.woolworths.feature.shared.notification.optin;

import android.os.Build;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.a;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import au.com.woolworths.android.onesite.utils.NotificationManager;
import com.swrve.sdk.SwrveSDKBase;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shared/notification/optin/NotificationOptInActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "notification-optin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class NotificationOptInActivity extends Hilt_NotificationOptInActivity {
    public static final /* synthetic */ int y = 0;
    public NotificationManager w;
    public final ActivityResultLauncher x = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new a(this, 6));

    /* JADX WARN: Type inference failed for: r3v2, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    @Override // au.com.woolworths.feature.shared.notification.optin.Hilt_NotificationOptInActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.b(this);
        if (Build.VERSION.SDK_INT >= 33) {
            this.x.a("android.permission.POST_NOTIFICATIONS", null);
            return;
        }
        SwrveSDKBase.a();
        SwrveSDKBase.f19075a.s();
        finish();
    }
}
