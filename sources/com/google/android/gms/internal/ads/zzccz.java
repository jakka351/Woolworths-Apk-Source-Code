package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.medallia.digital.mobilesdk.q2;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzccz extends zzccq implements zzcat {
    public static final /* synthetic */ int zzd = 0;
    private zzcau zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcci zzi;
    private long zzj;
    private long zzk;

    public zzccz(zzcbd zzcbdVar, zzcbc zzcbcVar) {
        super(zzcbdVar);
        zzcds zzcdsVar = new zzcds(zzcbdVar.getContext(), zzcbcVar, (zzcbd) this.zzc.get(), null);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        this.zze = zzcdsVar;
        zzcdsVar.zzs(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzd(long j) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        }, j);
    }

    private static String zzx(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.a(str.length(), 1, String.valueOf(canonicalName).length(), 1, String.valueOf(message).length()));
        androidx.constraintlayout.core.state.a.B(sb, str, q2.c, canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzccq, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcau zzcauVar = this.zze;
        if (zzcauVar != null) {
            zzcauVar.zzs(null);
            this.zze.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzD() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache onRenderedFirstFrame");
    }

    public final zzcau zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzs(null);
        zzcau zzcauVar = this.zze;
        this.zze = null;
        return zzcauVar;
    }

    public final /* synthetic */ void zzb() {
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        long j;
        long j2;
        long j3;
        String strZzc = zzc(this.zzf);
        try {
            jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzQ)).longValue() * 1000;
            jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzu)).intValue();
            zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue();
        } catch (Exception e) {
            String str = this.zzf;
            String message = e.getMessage();
            String strL = androidx.constraintlayout.core.state.a.l(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strL);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(this.zzf, strZzc, "error", zzx("error", e));
        }
        synchronized (this) {
            if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj > jLongValue) {
                StringBuilder sb = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                sb.append("Timeout reached. Limit: ");
                sb.append(jLongValue);
                sb.append(" ms");
                throw new IOException(sb.toString());
            }
            if (this.zzg) {
                throw new IOException("Abort requested before buffering finished. ");
            }
            if (!this.zzh) {
                if (!this.zze.zzB()) {
                    throw new IOException("ExoPlayer was released during preloading.");
                }
                long jZzH = this.zze.zzH();
                if (jZzH > 0) {
                    long jZzN = this.zze.zzN();
                    if (jZzN != this.zzk) {
                        boolean z = jZzN > 0;
                        j2 = jZzH;
                        j3 = jZzN;
                        j = jIntValue;
                        zzm(this.zzf, strZzc, j3, j2, z, zBooleanValue ? this.zze.zzI() : -1L, zBooleanValue ? this.zze.zzJ() : -1L, zBooleanValue ? this.zze.zzK() : -1L, zzcau.zzP(), zzcau.zzQ());
                        this.zzk = j3;
                    } else {
                        j = jIntValue;
                        j2 = jZzH;
                        j3 = jZzN;
                    }
                    if (j3 >= j2) {
                        zzp(this.zzf, strZzc, j2);
                    } else if (this.zze.zzO() >= j && j3 > 0) {
                    }
                }
                zzd(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzR)).longValue());
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzB().zzd(this.zzi);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final boolean zze(String str) {
        return zzf(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final boolean zzf(String str, String[] strArr) {
        Clock clock;
        String str2;
        String str3;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        boolean z;
        this.zzf = str;
        String strZzc = zzc(str);
        String str4 = " ms";
        String str5 = "Timeout reached. Limit: ";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcbd zzcbdVar = (zzcbd) this.zzc.get();
            if (zzcbdVar != null) {
                zzcbdVar.zzt(strZzc, this);
            }
            Clock clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
            long jCurrentTimeMillis = clockZzk.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzR)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzQ)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzu)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue();
            long j8 = -1;
            while (true) {
                synchronized (this) {
                    if (clockZzk.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                        long j9 = jLongValue2;
                        StringBuilder sb = new StringBuilder(String.valueOf(j9).length() + 27);
                        sb.append(str5);
                        sb.append(j9);
                        sb.append(str4);
                        throw new IOException(sb.toString());
                    }
                    if (this.zzg) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (!this.zzh) {
                        if (!this.zze.zzB()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jZzH = this.zze.zzH();
                        if (jZzH > 0) {
                            clock = clockZzk;
                            long jZzN = this.zze.zzN();
                            if (jZzN != j8) {
                                if (jZzN > 0) {
                                    j7 = jLongValue2;
                                    z = true;
                                } else {
                                    j7 = jLongValue2;
                                    z = false;
                                }
                                long j10 = jLongValue;
                                j5 = jZzH;
                                str3 = str5;
                                j4 = j10;
                                str2 = str4;
                                j6 = jZzN;
                                j2 = jIntValue;
                                j = j7;
                                zzm(str, strZzc, j6, j5, z, zBooleanValue ? this.zze.zzI() : -1L, zBooleanValue ? this.zze.zzJ() : -1L, zBooleanValue ? this.zze.zzK() : -1L, zzcau.zzP(), zzcau.zzQ());
                                j8 = j6;
                            } else {
                                str3 = str5;
                                j4 = jLongValue;
                                j2 = jIntValue;
                                j5 = jZzH;
                                str2 = str4;
                                j = jLongValue2;
                                j6 = jZzN;
                            }
                            if (j6 >= j5) {
                                zzp(str, strZzc, j5);
                            } else if (this.zze.zzO() < j2 || j6 <= 0) {
                                j3 = j4;
                            }
                        } else {
                            clock = clockZzk;
                            str2 = str4;
                            str3 = str5;
                            j = jLongValue2;
                            j2 = jIntValue;
                            j3 = jLongValue;
                        }
                        try {
                            wait(j3);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    }
                }
                jLongValue = j3;
                str4 = str2;
                jLongValue2 = j;
                jIntValue = j2;
                str5 = str3;
                clockZzk = clock;
            }
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            String strL = androidx.constraintlayout.core.state.a.l(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strL);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, "error", zzx("error", e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final boolean zzg(String str, String[] strArr, zzcci zzcciVar) {
        this.zzf = str;
        this.zzi = zzcciVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcbd zzcbdVar = (zzcbd) this.zzc.get();
            if (zzcbdVar != null) {
                zzcbdVar.zzt(strZzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            this.zzk = -1L;
            zzd(0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            String strL = androidx.constraintlayout.core.state.a.l(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strL);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, "error", zzx("error", e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzh(int i) {
        this.zze.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzi(int i) {
        this.zze.zzF(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzj(int i) {
        this.zze.zzy(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzk(int i) {
        this.zze.zzz(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzl() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzq(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzr(final boolean z, final long j) {
        final zzcbd zzcbdVar = (zzcbd) this.zzc.get();
        if (zzcbdVar != null) {
            zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcbdVar.zzu(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzs(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzt(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzu(String str, Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzv(String str, Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onException");
    }
}
