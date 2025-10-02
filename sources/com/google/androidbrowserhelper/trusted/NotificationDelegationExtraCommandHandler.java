package com.google.androidbrowserhelper.trusted;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes6.dex */
public class NotificationDelegationExtraCommandHandler implements ExtraCommandHandler {
    @Override // com.google.androidbrowserhelper.trusted.ExtraCommandHandler
    public final Bundle a(DelegationService delegationService, String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("success", false);
        String string = bundle.getString("notificationChannelName");
        str.getClass();
        if (str.equals("checkNotificationPermission")) {
            if (!TextUtils.isEmpty(string)) {
                int i = !NotificationUtils.a(delegationService, string) ? 1 : 0;
                if (i == 1 && !delegationService.getApplicationContext().getSharedPreferences("com.google.androidbrowserhelper", 0).getBoolean("HAS_REQUESTED_NOTIFICATION_PERMISSION", false)) {
                    i = 2;
                }
                bundle2.putInt("permissionStatus", i);
                bundle2.putBoolean("success", true);
                return bundle2;
            }
        } else if (str.equals("getNotificationPermissionRequestPendingIntent") && !TextUtils.isEmpty(string)) {
            int i2 = NotificationPermissionRequestActivity.f;
            Intent intent = new Intent(delegationService.getApplicationContext(), (Class<?>) NotificationPermissionRequestActivity.class);
            intent.putExtra("notificationChannelName", string);
            bundle2.putParcelable("notificationPermissionRequestPendingIntent", PendingIntent.getActivity(delegationService.getApplicationContext(), 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0));
            bundle2.putBoolean("success", true);
            return bundle2;
        }
        return bundle2;
    }
}
