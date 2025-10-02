package com.swrve.sdk;

import android.app.Application;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.Map;

/* loaded from: classes6.dex */
public class SwrvePushServiceDefault {
    public static boolean a(Application application, Map map, String str, long j) {
        boolean z;
        if (map == null) {
            return false;
        }
        map.put("provider.message_id", str);
        map.put("provider.sent_time", String.valueOf(j));
        SwrvePushWorkerHelper swrvePushWorkerHelper = new SwrvePushWorkerHelper(application, map);
        SwrveLogger.e("SwrveSDK: Attempt to handle push message via SwrvePushWorkerHelper.", new Object[0]);
        try {
            Data dataA = swrvePushWorkerHelper.a();
            if (!swrvePushWorkerHelper.b) {
                SwrveLogger.e("SwrveSDK: Swrve will not handle this push because it is not a swrve push.", new Object[0]);
                return false;
            }
            if (SwrvePushSidDeDuper.a(application, swrvePushWorkerHelper.f19073a)) {
                SwrveLogger.e("SwrveSDK Received Push: but not processing as _sid has been processed before.", new Object[0]);
                return false;
            }
            String strB = dataA.b(NotificationMessage.NOTIF_KEY_SID);
            if (SwrveHelper.p(strB) && dataA.c("provider.message_id")) {
                strB = dataA.b("provider.message_id");
            }
            if (SwrveHelper.p(strB)) {
                strB = dataA.b("_p");
            }
            OneTimeWorkRequest.Builder builder = new OneTimeWorkRequest.Builder(SwrvePushManagerWorker.class);
            builder.c.e = dataA;
            WorkManager.Companion.a(application).c("SwrvePushWorkerHelper_" + strB, ExistingWorkPolicy.e, (OneTimeWorkRequest) builder.a());
            try {
                SwrveLogger.e("SwrveSDK: Swrve push worker queued with data via SwrvePushWorkerHelper.", new Object[0]);
                return true;
            } catch (Exception e) {
                z = true;
                e = e;
                SwrveLogger.c("SwrveSDK: Error trying to queue SwrvePushWorkerHelper.", e, new Object[0]);
                return z;
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
    }
}
