package au.com.woolworths.feature.shared.instore.wifi.notifications;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/notifications/InStoreWiFiNotificationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes.dex */
public final class InStoreWiFiNotificationReceiver extends Hilt_InStoreWiFiNotificationReceiver {
    public InStoreWiFiNotificationHelper c;

    @Override // au.com.woolworths.feature.shared.instore.wifi.notifications.Hilt_InStoreWiFiNotificationReceiver, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        Intrinsics.h(context, "context");
        Intrinsics.h(intent, "intent");
        if ("android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (networkInfo != null && 1 == networkInfo.getType() && networkInfo.isConnected()) {
                InStoreWiFiNotificationHelper inStoreWiFiNotificationHelper = this.c;
                if (inStoreWiFiNotificationHelper != null) {
                    inStoreWiFiNotificationHelper.b(context);
                    return;
                } else {
                    Intrinsics.p("inStoreWiFiNotificationHelper");
                    throw null;
                }
            }
            InStoreWiFiNotificationHelper inStoreWiFiNotificationHelper2 = this.c;
            if (inStoreWiFiNotificationHelper2 != null) {
                inStoreWiFiNotificationHelper2.a();
            } else {
                Intrinsics.p("inStoreWiFiNotificationHelper");
                throw null;
            }
        }
    }
}
