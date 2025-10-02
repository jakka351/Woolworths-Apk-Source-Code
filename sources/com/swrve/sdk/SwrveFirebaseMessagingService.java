package com.swrve.sdk;

import com.google.firebase.messaging.FirebaseMessagingService;

/* loaded from: classes6.dex */
public class SwrveFirebaseMessagingService extends FirebaseMessagingService {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:3:0x0005, B:6:0x000d, B:7:0x0033, B:9:0x0039, B:12:0x0050, B:15:0x0078, B:26:0x009c, B:28:0x00ad, B:29:0x00b1, B:36:0x00c1, B:38:0x00d1, B:40:0x00d7, B:43:0x00df, B:45:0x00e5, B:47:0x00ea, B:49:0x00f0, B:51:0x00fa, B:53:0x0104, B:55:0x010c, B:32:0x00b8, B:18:0x0088, B:19:0x008c, B:22:0x0094), top: B:59:0x0005 }] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMessageReceived(com.google.firebase.messaging.RemoteMessage r13) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.SwrveFirebaseMessagingService.onMessageReceived(com.google.firebase.messaging.RemoteMessage):void");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        Object obj = SwrveSDKBase.f19075a;
        if (obj instanceof Swrve) {
            ((Swrve) obj).j(str);
        } else {
            SwrveLogger.d("Could not notify the SDK of a new token.", new Object[0]);
        }
    }
}
