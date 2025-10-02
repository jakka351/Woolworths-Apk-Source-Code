package androidx.media3.common.util;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.f = obj;
        this.e = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.d
            switch(r0) {
                case 0: goto L9d;
                case 1: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r11.f
            androidx.media3.common.util.BackgroundThreadStateHandler r0 = (androidx.media3.common.util.BackgroundThreadStateHandler) r0
            java.lang.Object r1 = r0.d
            java.lang.Object r2 = r11.e
            r0.d = r2
            boolean r3 = r1.equals(r2)
            if (r3 != 0) goto L1a
            androidx.media3.common.util.BackgroundThreadStateHandler$StateChangeListener r0 = r0.c
            r0.a(r1, r2)
        L1a:
            return
        L1b:
            java.lang.Object r0 = r11.f
            androidx.media3.common.util.NetworkTypeObserver$Receiver r0 = (androidx.media3.common.util.NetworkTypeObserver.Receiver) r0
            java.lang.Object r1 = r11.e
            android.content.Context r1 = (android.content.Context) r1
            androidx.media3.common.util.NetworkTypeObserver r0 = r0.f2920a
            java.lang.String r2 = "connectivity"
            java.lang.Object r2 = r1.getSystemService(r2)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            r3 = 5
            r4 = 0
            if (r2 != 0) goto L32
            goto L74
        L32:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L74
            r5 = 1
            if (r2 == 0) goto L73
            boolean r6 = r2.isConnected()
            if (r6 != 0) goto L40
            goto L73
        L40:
            int r6 = r2.getType()
            r7 = 2
            r8 = 9
            r9 = 6
            r10 = 4
            if (r6 == 0) goto L5e
            if (r6 == r5) goto L5c
            if (r6 == r10) goto L5e
            if (r6 == r3) goto L5e
            if (r6 == r9) goto L5a
            if (r6 == r8) goto L58
            r4 = 8
            goto L74
        L58:
            r4 = 7
            goto L74
        L5a:
            r4 = r3
            goto L74
        L5c:
            r4 = r7
            goto L74
        L5e:
            int r2 = r2.getSubtype()
            switch(r2) {
                case 1: goto L71;
                case 2: goto L71;
                case 3: goto L6f;
                case 4: goto L6f;
                case 5: goto L6f;
                case 6: goto L6f;
                case 7: goto L6f;
                case 8: goto L6f;
                case 9: goto L6f;
                case 10: goto L6f;
                case 11: goto L6f;
                case 12: goto L6f;
                case 13: goto L5a;
                case 14: goto L6f;
                case 15: goto L6f;
                case 16: goto L65;
                case 17: goto L6f;
                case 18: goto L5c;
                case 19: goto L65;
                case 20: goto L67;
                default: goto L65;
            }
        L65:
            r4 = r9
            goto L74
        L67:
            int r2 = androidx.media3.common.util.Util.f2928a
            r5 = 29
            if (r2 < r5) goto L74
            r4 = r8
            goto L74
        L6f:
            r4 = r10
            goto L74
        L71:
            r4 = 3
            goto L74
        L73:
            r4 = r5
        L74:
            int r2 = androidx.media3.common.util.Util.f2928a
            r5 = 31
            if (r2 < r5) goto L99
            if (r4 != r3) goto L99
            java.lang.String r2 = "phone"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.RuntimeException -> L95
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.RuntimeException -> L95
            r1.getClass()     // Catch: java.lang.RuntimeException -> L95
            androidx.media3.common.util.NetworkTypeObserver$Api31$DisplayInfoCallback r2 = new androidx.media3.common.util.NetworkTypeObserver$Api31$DisplayInfoCallback     // Catch: java.lang.RuntimeException -> L95
            r2.<init>(r0)     // Catch: java.lang.RuntimeException -> L95
            java.util.concurrent.Executor r4 = r0.f2917a     // Catch: java.lang.RuntimeException -> L95
            androidx.core.splashscreen.a.s(r1, r4, r2)     // Catch: java.lang.RuntimeException -> L95
            androidx.core.splashscreen.a.r(r1, r2)     // Catch: java.lang.RuntimeException -> L95
            goto L9c
        L95:
            r0.d(r3)
            goto L9c
        L99:
            r0.d(r4)
        L9c:
            return
        L9d:
            java.lang.Object r0 = r11.f
            androidx.media3.common.util.NetworkTypeObserver r0 = (androidx.media3.common.util.NetworkTypeObserver) r0
            java.lang.Object r1 = r11.e
            android.content.Context r1 = (android.content.Context) r1
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2.addAction(r3)
            androidx.media3.common.util.NetworkTypeObserver$Receiver r3 = new androidx.media3.common.util.NetworkTypeObserver$Receiver
            r3.<init>(r0)
            r1.registerReceiver(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.c.run():void");
    }
}
