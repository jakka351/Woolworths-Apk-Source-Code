package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzdfa extends zzcqs {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzddd zze;
    private final zzdgp zzf;
    private final zzcrn zzg;
    private final zzfor zzh;
    private final zzcwf zzi;
    private final zzbyz zzj;
    private final zzdsm zzk;
    private boolean zzl;

    public zzdfa(zzcqr zzcqrVar, Context context, @Nullable zzcek zzcekVar, zzddd zzdddVar, zzdgp zzdgpVar, zzcrn zzcrnVar, zzfor zzforVar, zzcwf zzcwfVar, zzbyz zzbyzVar, zzdsm zzdsmVar) {
        super(zzcqrVar);
        this.zzl = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcekVar);
        this.zze = zzdddVar;
        this.zzf = zzdgpVar;
        this.zzg = zzcrnVar;
        this.zzh = zzforVar;
        this.zzi = zzcwfVar;
        this.zzj = zzbyzVar;
        this.zzk = zzdsmVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcek zzcekVar = (zzcek) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhe)).booleanValue()) {
                if (!this.zzl && zzcekVar != null) {
                    zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdez
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcekVar.destroy();
                        }
                    });
                }
            } else if (zzcekVar != null) {
                zzcekVar.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(boolean r7, @javax.annotation.Nullable android.app.Activity r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzddd r0 = r6.zze
            r0.zza()
            com.google.android.gms.ads.internal.zzt.zzc()
            com.google.android.gms.internal.ads.zzdgp r1 = r6.zzf
            com.google.android.gms.internal.ads.zzfcj r2 = r1.zzb()
            boolean r2 = com.google.android.gms.ads.internal.util.zzs.zzS(r2)
            r3 = 0
            if (r2 != 0) goto L7d
            com.google.android.gms.internal.ads.zzbbz r2 = com.google.android.gms.internal.ads.zzbci.zzom
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r4.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L33
            com.google.android.gms.ads.internal.zzt.zzc()
            android.content.Context r2 = r6.zzc
            com.google.android.gms.internal.ads.zzfcj r4 = r6.zzb
            com.google.android.gms.internal.ads.zzdsm r5 = r6.zzk
            com.google.android.gms.ads.internal.util.zzs.zzR(r2, r4, r5)
        L33:
            com.google.android.gms.internal.ads.zzbbz r2 = com.google.android.gms.internal.ads.zzbci.zzaR
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r4.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L7d
            com.google.android.gms.ads.internal.zzt.zzc()
            android.content.Context r2 = r6.zzc
            boolean r2 = com.google.android.gms.ads.internal.util.zzs.zzK(r2)
            if (r2 == 0) goto L7d
            int r7 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r7 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies"
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r7)
            com.google.android.gms.internal.ads.zzcwf r7 = r6.zzi
            r7.zze()
            com.google.android.gms.internal.ads.zzbbz r7 = com.google.android.gms.internal.ads.zzbci.zzaS
            com.google.android.gms.internal.ads.zzbcg r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r7 = r8.zzd(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Lf3
            com.google.android.gms.internal.ads.zzfor r7 = r6.zzh
            com.google.android.gms.internal.ads.zzfcu r8 = r6.zza
            com.google.android.gms.internal.ads.zzfct r8 = r8.zzb
            com.google.android.gms.internal.ads.zzfcm r8 = r8.zzb
            java.lang.String r8 = r8.zzb
            r7.zza(r8)
            goto Lf3
        L7d:
            java.lang.ref.WeakReference r2 = r6.zzd
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.zzcek r2 = (com.google.android.gms.internal.ads.zzcek) r2
            com.google.android.gms.internal.ads.zzbbz r4 = com.google.android.gms.internal.ads.zzbci.zzmI
            com.google.android.gms.internal.ads.zzbcg r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r5.zzd(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 0
            if (r4 == 0) goto Lc3
            if (r2 == 0) goto Lc3
            com.google.android.gms.internal.ads.zzfcj r2 = r2.zzC()
            if (r2 == 0) goto Lc3
            boolean r4 = r2.zzar
            if (r4 == 0) goto Lc3
            int r2 = r2.zzas
            com.google.android.gms.internal.ads.zzbyz r4 = r6.zzj
            int r4 = r4.zzj()
            if (r2 == r4) goto Lc3
            int r7 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r7 = "The interstitial consent form has been shown."
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r7)
            com.google.android.gms.internal.ads.zzcwf r7 = r6.zzi
            r8 = 12
            java.lang.String r0 = "The consent form has already been shown."
            com.google.android.gms.ads.internal.client.zze r8 = com.google.android.gms.internal.ads.zzfee.zzd(r8, r0, r5)
            r7.zzc(r8)
            goto Lf3
        Lc3:
            boolean r2 = r6.zzl
            if (r2 == 0) goto Ld9
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r2 = "The interstitial ad has been shown."
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r2)
            com.google.android.gms.internal.ads.zzcwf r2 = r6.zzi
            r4 = 10
            com.google.android.gms.ads.internal.client.zze r4 = com.google.android.gms.internal.ads.zzfee.zzd(r4, r5, r5)
            r2.zzc(r4)
        Ld9:
            boolean r2 = r6.zzl
            if (r2 != 0) goto Lf3
            if (r8 != 0) goto Le1
            android.content.Context r8 = r6.zzc
        Le1:
            com.google.android.gms.internal.ads.zzcwf r2 = r6.zzi     // Catch: com.google.android.gms.internal.ads.zzdgo -> Led
            r1.zza(r7, r8, r2)     // Catch: com.google.android.gms.internal.ads.zzdgo -> Led
            r0.zzb()     // Catch: com.google.android.gms.internal.ads.zzdgo -> Led
            r7 = 1
            r6.zzl = r7
            return r7
        Led:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzcwf r8 = r6.zzi
            r8.zzd(r7)
        Lf3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdfa.zza(boolean, android.app.Activity):boolean");
    }

    public final boolean zzb() {
        return this.zzg.zzl();
    }
}
