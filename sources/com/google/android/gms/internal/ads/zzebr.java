package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzebr implements zzgoq {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzebs zzb;

    public zzebr(zzebs zzebsVar, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzebsVar);
        this.zzb = zzebsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    @Override // com.google.android.gms.internal.ads.zzgoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzebs r0 = r8.zzb
            com.google.android.gms.internal.ads.zzcuu r9 = (com.google.android.gms.internal.ads.zzcuu) r9
            boolean r1 = r0.zzf()
            if (r1 == 0) goto Lb
            return
        Lb:
            android.os.Bundle r9 = r9.zza
            java.lang.String r1 = "ad_types"
            java.lang.Object r1 = r9.get(r1)
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L1a
            java.util.List r1 = (java.util.List) r1
            goto L24
        L1a:
            boolean r2 = r1 instanceof java.lang.String[]
            if (r2 == 0) goto L4a
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.List r1 = java.util.Arrays.asList(r1)
        L24:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L31
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            goto L31
        L45:
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            goto L4c
        L4a:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
        L4c:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L55:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            switch(r3) {
                case -1396342996: goto L8a;
                case -1052618729: goto L7f;
                case -239580146: goto L74;
                case 604727084: goto L69;
                default: goto L68;
            }
        L68:
            goto L95
        L69:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L95
            com.google.android.gms.internal.ads.zzbbn$zzd$zza r2 = com.google.android.gms.internal.ads.zzbbn.zzd.zza.INTERSTITIAL
            goto L97
        L74:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L95
            com.google.android.gms.internal.ads.zzbbn$zzd$zza r2 = com.google.android.gms.internal.ads.zzbbn.zzd.zza.REWARD_BASED_VIDEO_AD
            goto L97
        L7f:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L95
            com.google.android.gms.internal.ads.zzbbn$zzd$zza r2 = com.google.android.gms.internal.ads.zzbbn.zzd.zza.NATIVE_APP_INSTALL
            goto L97
        L8a:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L95
            com.google.android.gms.internal.ads.zzbbn$zzd$zza r2 = com.google.android.gms.internal.ads.zzbbn.zzd.zza.BANNER
            goto L97
        L95:
            com.google.android.gms.internal.ads.zzbbn$zzd$zza r2 = com.google.android.gms.internal.ads.zzbbn.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED
        L97:
            r5.add(r2)
            goto L55
        L9b:
            com.google.android.gms.internal.ads.zzbbn$zzaf$zzd r7 = com.google.android.gms.internal.ads.zzebs.zze(r9)
            com.google.android.gms.internal.ads.zzbbn$zzab r6 = r0.zzb(r9)
            boolean r4 = r8.zza
            com.google.android.gms.internal.ads.zzebq r2 = new com.google.android.gms.internal.ads.zzebq
            r3 = r8
            r2.<init>()
            com.google.android.gms.internal.ads.zzebg r9 = r0.zza
            r9.zza(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebr.zzb(java.lang.Object):void");
    }
}
