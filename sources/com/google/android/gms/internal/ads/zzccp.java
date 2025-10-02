package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzccp implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzccq zze;

    public zzccp(zzccq zzccqVar, String str, String str2, String str3, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        Objects.requireNonNull(zzccqVar);
        this.zze = zzccqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            java.lang.String r1 = "precacheCanceled"
            java.util.HashMap r0 = androidx.constraintlayout.core.state.a.r(r0, r1)
            java.lang.String r1 = "src"
            java.lang.String r2 = r4.zza
            r0.put(r1, r2)
            java.lang.String r1 = r4.zzb
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L1c
            java.lang.String r2 = "cachedSrc"
            r0.put(r2, r1)
        L1c:
            java.lang.String r1 = r4.zzc
            int r2 = r1.hashCode()
            java.lang.String r3 = "internal"
            switch(r2) {
                case -1947652542: goto L76;
                case -1396664534: goto L6b;
                case -1347010958: goto L68;
                case -918817863: goto L5f;
                case -659376217: goto L5c;
                case -642208130: goto L59;
                case -354048396: goto L4e;
                case -32082395: goto L45;
                case 3387234: goto L42;
                case 96784904: goto L3c;
                case 580119100: goto L31;
                case 725497484: goto L28;
                default: goto L27;
            }
        L27:
            goto L79
        L28:
            java.lang.String r2 = "noCacheDir"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L79
            goto L39
        L31:
            java.lang.String r2 = "expireFailed"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L79
        L39:
            java.lang.String r3 = "io"
            goto L79
        L3c:
            java.lang.String r2 = "error"
        L3e:
            r1.equals(r2)
            goto L79
        L42:
            java.lang.String r2 = "noop"
            goto L3e
        L45:
            java.lang.String r2 = "externalAbort"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L79
            goto L56
        L4e:
            java.lang.String r2 = "sizeExceeded"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L79
        L56:
            java.lang.String r3 = "policy"
            goto L79
        L59:
            java.lang.String r2 = "playerFailed"
            goto L3e
        L5c:
            java.lang.String r2 = "contentLengthMissing"
            goto L3e
        L5f:
            java.lang.String r2 = "downloadTimeout"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L79
            goto L73
        L68:
            java.lang.String r2 = "inProgress"
            goto L3e
        L6b:
            java.lang.String r2 = "badUrl"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L79
        L73:
            java.lang.String r3 = "network"
            goto L79
        L76:
            java.lang.String r2 = "interrupted"
            goto L3e
        L79:
            java.lang.String r2 = "type"
            r0.put(r2, r3)
            java.lang.String r2 = "reason"
            r0.put(r2, r1)
            java.lang.String r1 = r4.zzd
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L90
            java.lang.String r2 = "message"
            r0.put(r2, r1)
        L90:
            com.google.android.gms.internal.ads.zzccq r1 = r4.zze
            java.lang.String r2 = "onPrecacheEvent"
            r1.zzw(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccp.run():void");
    }
}
