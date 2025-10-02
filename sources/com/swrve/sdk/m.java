package com.swrve.sdk;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ SwrveImp f;

    public /* synthetic */ m(SwrveImp swrveImp, SwrveBase swrveBase) {
        this.d = 2;
        this.e = swrveImp;
        this.f = swrveBase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: Exception -> 0x007c, TryCatch #3 {Exception -> 0x007c, blocks: (B:5:0x0012, B:7:0x0016, B:19:0x003d, B:21:0x0047, B:23:0x004b, B:25:0x0054, B:27:0x005a, B:36:0x009a, B:30:0x007e, B:31:0x0084, B:33:0x0088, B:35:0x008c, B:16:0x0035, B:9:0x001c, B:13:0x002e), top: B:60:0x0012, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.swrve.sdk.messaging.SwrveBaseMessage] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.swrve.sdk.messaging.SwrveBaseMessage] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.d
            r1 = 0
            com.swrve.sdk.SwrveImp r2 = r9.f
            java.lang.Object r3 = r9.e
            switch(r0) {
                case 0: goto Lb7;
                case 1: goto La5;
                default: goto La;
            }
        La:
            java.lang.String r0 = "Exception thrown in Swrve SDK"
            com.swrve.sdk.SwrveImp r3 = (com.swrve.sdk.SwrveImp) r3
            com.swrve.sdk.SwrveBase r2 = (com.swrve.sdk.SwrveBase) r2
            java.util.List r4 = com.swrve.sdk.SwrveImp.i0
            boolean r4 = r3.G     // Catch: java.lang.Exception -> L7c
            if (r4 == 0) goto La4
            java.lang.String r4 = "Swrve.Messages.showAtSessionStart"
            r2.getClass()     // Catch: java.lang.Exception -> L7c
            r5 = 0
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Exception -> L34
            r6.<init>()     // Catch: java.lang.Exception -> L34
            com.swrve.sdk.messaging.SwrveOrientation r7 = com.swrve.sdk.messaging.SwrveOrientation.f     // Catch: java.lang.Exception -> L34
            java.util.Date r8 = new java.util.Date     // Catch: java.lang.Exception -> L2d
            r8.<init>()     // Catch: java.lang.Exception -> L2d
            com.swrve.sdk.messaging.SwrveBaseMessage r0 = r2.o0(r4, r6, r7, r8)     // Catch: java.lang.Exception -> L2d
            goto L3b
        L2d:
            r4 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L34
            com.swrve.sdk.SwrveLogger.c(r0, r4, r6)     // Catch: java.lang.Exception -> L34
            goto L3a
        L34:
            r4 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L7c
            com.swrve.sdk.SwrveLogger.c(r0, r4, r6)     // Catch: java.lang.Exception -> L7c
        L3a:
            r0 = r5
        L3b:
            if (r0 == 0) goto La4
            com.swrve.sdk.messaging.SwrveOrientation r4 = r3.R()     // Catch: java.lang.Exception -> L7c
            boolean r4 = r0.d(r4)     // Catch: java.lang.Exception -> L7c
            if (r4 == 0) goto La4
            boolean r4 = r0 instanceof com.swrve.sdk.messaging.SwrveMessage     // Catch: java.lang.Exception -> L7c
            if (r4 == 0) goto L84
            r4 = r0
            com.swrve.sdk.messaging.SwrveMessage r4 = (com.swrve.sdk.messaging.SwrveMessage) r4     // Catch: java.lang.Exception -> L7c
            boolean r4 = r3.K(r4)     // Catch: java.lang.Exception -> L7c
            if (r4 == 0) goto L84
            boolean r4 = r0.c()     // Catch: java.lang.Exception -> L7c
            if (r4 == 0) goto L7e
            java.lang.String r4 = "SwrveSDK: %s is a control message and will not be displayed."
            int r5 = r0.getId()     // Catch: java.lang.Exception -> L7c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L7c
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Exception -> L7c
            com.swrve.sdk.SwrveLogger.g(r4, r5)     // Catch: java.lang.Exception -> L7c
            com.swrve.sdk.messaging.SwrveBaseCampaign r4 = r0.a()     // Catch: java.lang.Exception -> L7c
            r4.p()     // Catch: java.lang.Exception -> L7c
            int r0 = r0.getId()     // Catch: java.lang.Exception -> L7c
            java.lang.String r4 = "false"
            r2.O0(r0, r4)     // Catch: java.lang.Exception -> L7c
            goto L9a
        L7c:
            r0 = move-exception
            goto L9d
        L7e:
            com.swrve.sdk.messaging.SwrveMessage r0 = (com.swrve.sdk.messaging.SwrveMessage) r0     // Catch: java.lang.Exception -> L7c
            r3.M(r0)     // Catch: java.lang.Exception -> L7c
            goto L9a
        L84:
            au.com.woolworths.foundation.swrve.embedded.campaign.a r4 = r3.n     // Catch: java.lang.Exception -> L7c
            if (r4 == 0) goto L9a
            boolean r4 = r0 instanceof com.swrve.sdk.messaging.SwrveEmbeddedMessage     // Catch: java.lang.Exception -> L7c
            if (r4 == 0) goto L9a
            java.util.HashMap r4 = r3.h0(r5)     // Catch: java.lang.Exception -> L7c
            au.com.woolworths.foundation.swrve.embedded.campaign.a r5 = r3.n     // Catch: java.lang.Exception -> L7c
            r2.P()     // Catch: java.lang.Exception -> L7c
            com.swrve.sdk.messaging.SwrveEmbeddedMessage r0 = (com.swrve.sdk.messaging.SwrveEmbeddedMessage) r0     // Catch: java.lang.Exception -> L7c
            r5.a(r0, r4)     // Catch: java.lang.Exception -> L7c
        L9a:
            r3.G = r1     // Catch: java.lang.Exception -> L7c
            goto La4
        L9d:
            java.lang.String r2 = "Could not launch campaign automatically."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.swrve.sdk.SwrveLogger.c(r2, r0, r1)
        La4:
            return
        La5:
            java.util.concurrent.ScheduledExecutorService r3 = (java.util.concurrent.ScheduledExecutorService) r3
            java.util.List r0 = com.swrve.sdk.SwrveImp.i0
            r2.getClass()
            r2.G = r1     // Catch: java.lang.Throwable -> Lb2
            r3.shutdownNow()
            return
        Lb2:
            r0 = move-exception
            r3.shutdownNow()
            throw r0
        Lb7:
            com.swrve.sdk.SwrveBase r2 = (com.swrve.sdk.SwrveBase) r2
            java.util.concurrent.ScheduledExecutorService r3 = (java.util.concurrent.ScheduledExecutorService) r3
            java.util.List r0 = com.swrve.sdk.SwrveImp.i0
            r2.R0()     // Catch: java.lang.Throwable -> Lc4
            r3.shutdownNow()
            return
        Lc4:
            r0 = move-exception
            r3.shutdownNow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.m.run():void");
    }

    public /* synthetic */ m(SwrveImp swrveImp, ScheduledExecutorService scheduledExecutorService, int i) {
        this.d = i;
        this.f = swrveImp;
        this.e = scheduledExecutorService;
    }
}
