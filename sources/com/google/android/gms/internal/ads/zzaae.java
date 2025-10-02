package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes5.dex */
public final class zzaae extends zzsz implements zzaat {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private int zzC;

    @Nullable
    private zzls zzD;
    private boolean zzE;
    private long zzF;
    private int zzG;
    private long zzH;
    private zzbu zzI;

    @Nullable
    private zzbu zzJ;
    private int zzK;
    private int zzL;

    @Nullable
    private zzaar zzM;
    private long zzN;
    private long zzO;
    private boolean zzP;
    private final Context zze;
    private final boolean zzf;
    private final zzabl zzg;
    private final boolean zzh;
    private final zzaau zzi;
    private final zzaas zzj;
    private final long zzk;
    private final PriorityQueue zzl;
    private zzaad zzm;
    private boolean zzn;
    private boolean zzo;
    private zzabr zzp;
    private boolean zzq;
    private int zzr;
    private List zzs;

    @Nullable
    private Surface zzt;

    @Nullable
    private zzaag zzu;
    private zzeg zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    public zzaae(zzaac zzaacVar) {
        super(2, zzaacVar.zzg(), zzaacVar.zzf(), false, 30.0f);
        Context applicationContext = zzaacVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzp = null;
        this.zzg = new zzabl(zzaacVar.zzh(), zzaacVar.zzi());
        this.zzf = this.zzp == null;
        this.zzi = new zzaau(applicationContext, this, 0L);
        this.zzj = new zzaas();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzv = zzeg.zza;
        this.zzx = 1;
        this.zzy = 0;
        this.zzI = zzbu.zza;
        this.zzL = 0;
        this.zzJ = null;
        this.zzK = -1000;
        this.zzN = -9223372036854775807L;
        this.zzO = -9223372036854775807L;
        this.zzl = new PriorityQueue();
        this.zzk = -9223372036854775807L;
        this.zzD = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r3.equals("video/x-vnd.on2.vp8") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bc, code lost:
    
        if (r3.equals("video/av01") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
    
        if (r3.equals("video/3gpp") != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzas(com.google.android.gms.internal.ads.zzst r8, com.google.android.gms.internal.ads.zzu r9) {
        /*
            int r0 = r9.zzv
            int r1 = r9.zzw
            r2 = -1
            if (r0 == r2) goto Lcc
            if (r1 != r2) goto Lb
            goto Lcc
        Lb:
            java.lang.String r3 = r9.zzo
            r3.getClass()
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/av01"
            java.lang.String r7 = "video/hevc"
            if (r4 == 0) goto L42
            int r3 = com.google.android.gms.internal.ads.zztl.zza
            android.util.Pair r9 = com.google.android.gms.internal.ads.zzdc.zze(r9)
            if (r9 == 0) goto L41
            java.lang.Object r9 = r9.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r9 == r3) goto L3f
            r3 = 1
            if (r9 == r3) goto L3f
            r3 = 2
            if (r9 != r3) goto L39
            goto L3f
        L39:
            r3 = 1024(0x400, float:1.435E-42)
            if (r9 != r3) goto L41
            r3 = r6
            goto L42
        L3f:
            r3 = r5
            goto L42
        L41:
            r3 = r7
        L42:
            int r9 = r3.hashCode()
            r4 = 4
            switch(r9) {
                case -1664118616: goto Lbf;
                case -1662735862: goto Lb8;
                case -1662541442: goto La7;
                case 1187890754: goto L9e;
                case 1331836730: goto L61;
                case 1599127256: goto L58;
                case 1599127257: goto L4c;
                default: goto L4a;
            }
        L4a:
            goto Lcc
        L4c:
            java.lang.String r8 = "video/x-vnd.on2.vp9"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
            r4 = 8
            goto Lc7
        L58:
            java.lang.String r8 = "video/x-vnd.on2.vp8"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
            goto Lc7
        L61:
            boolean r9 = r3.equals(r5)
            if (r9 == 0) goto Lcc
            java.lang.String r9 = android.os.Build.MODEL
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto Lcc
            java.lang.String r3 = "Amazon"
            java.lang.String r5 = android.os.Build.MANUFACTURER
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L8f
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto Lcc
            java.lang.String r3 = "AFTS"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L8f
            boolean r8 = r8.zzf
            if (r8 != 0) goto Lcc
        L8f:
            java.lang.String r8 = com.google.android.gms.internal.ads.zzeo.zza
            int r0 = r0 + 15
            int r1 = r1 + 15
            int r0 = r0 / 16
            int r1 = r1 / 16
            int r1 = r1 * r0
            int r1 = r1 * 768
            int r1 = r1 / r4
            return r1
        L9e:
            java.lang.String r8 = "video/mp4v-es"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
            goto Lc7
        La7:
            boolean r8 = r3.equals(r7)
            if (r8 == 0) goto Lcc
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r4
            r8 = 2097152(0x200000, float:2.938736E-39)
            int r8 = java.lang.Math.max(r8, r0)
            return r8
        Lb8:
            boolean r8 = r3.equals(r6)
            if (r8 == 0) goto Lcc
            goto Lc7
        Lbf:
            java.lang.String r8 = "video/3gpp"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
        Lc7:
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r4
            return r0
        Lcc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaae.zzas(com.google.android.gms.internal.ads.zzst, com.google.android.gms.internal.ads.zzu):int");
    }

    public static int zzbe(zzst zzstVar, zzu zzuVar) {
        int i = zzuVar.zzp;
        if (i == -1) {
            return zzas(zzstVar, zzuVar);
        }
        List list = zzuVar.zzr;
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return i + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e A[Catch: all -> 0x006b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:70:0x00c9, B:40:0x006e, B:71:0x00cd), top: B:76:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzbi(java.lang.String r4) {
        /*
            java.lang.String r0 = "OMX.google"
            boolean r4 = r4.startsWith(r0)
            r0 = 0
            if (r4 == 0) goto La
            return r0
        La:
            java.lang.Class<com.google.android.gms.internal.ads.zzaae> r4 = com.google.android.gms.internal.ads.zzaae.class
            monitor-enter(r4)
            boolean r1 = com.google.android.gms.internal.ads.zzaae.zzc     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto Lcd
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L6b
            r2 = 28
            r3 = 1
            if (r1 > r2) goto L6e
            java.lang.String r1 = android.os.Build.DEVICE     // Catch: java.lang.Throwable -> L6b
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> L6b
            switch(r2) {
                case -1339091551: goto L61;
                case -1220081023: goto L58;
                case -1220066608: goto L4f;
                case -1012436106: goto L46;
                case -760312546: goto L3d;
                case -64886864: goto L34;
                case 3415681: goto L2b;
                case 825323514: goto L22;
                default: goto L21;
            }
        L21:
            goto L6e
        L22:
            java.lang.String r2 = "machuca"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6e
            goto L69
        L2b:
            java.lang.String r2 = "once"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6e
            goto L69
        L34:
            java.lang.String r2 = "magnolia"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6e
            goto L69
        L3d:
            java.lang.String r2 = "aquaman"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6e
            goto L69
        L46:
            java.lang.String r2 = "oneday"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6e
            goto L69
        L4f:
            java.lang.String r2 = "dangalUHD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6e
            goto L69
        L58:
            java.lang.String r2 = "dangalFHD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6e
            goto L69
        L61:
            java.lang.String r2 = "dangal"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6e
        L69:
            r0 = r3
            goto Lc9
        L6b:
            r0 = move-exception
            goto Ld1
        L6e:
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L6b
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> L6b
            switch(r2) {
                case -349662828: goto Lc0;
                case -321033677: goto Lb7;
                case 2006354: goto Lae;
                case 2006367: goto La5;
                case 2006371: goto L9c;
                case 1785421873: goto L93;
                case 1785421876: goto L8a;
                case 1798172390: goto L81;
                case 2119412532: goto L78;
                default: goto L77;
            }
        L77:
            goto Lc9
        L78:
            java.lang.String r2 = "AFTEUFF014"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lc9
            goto Lc8
        L81:
            java.lang.String r2 = "AFTSO001"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lc9
            goto Lc8
        L8a:
            java.lang.String r2 = "AFTEU014"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lc9
            goto Lc8
        L93:
            java.lang.String r2 = "AFTEU011"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lc9
            goto Lc8
        L9c:
            java.lang.String r2 = "AFTR"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lc9
            goto Lc8
        La5:
            java.lang.String r2 = "AFTN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lc9
            goto Lc8
        Lae:
            java.lang.String r2 = "AFTA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lc9
            goto Lc8
        Lb7:
            java.lang.String r2 = "AFTKMST12"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lc9
            goto Lc8
        Lc0:
            java.lang.String r2 = "AFTJMST12"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lc9
        Lc8:
            goto L69
        Lc9:
            com.google.android.gms.internal.ads.zzaae.zzd = r0     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zzaae.zzc = r3     // Catch: java.lang.Throwable -> L6b
        Lcd:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6b
            boolean r4 = com.google.android.gms.internal.ads.zzaae.zzd
            return r4
        Ld1:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaae.zzbi(java.lang.String):boolean");
    }

    public static final boolean zzbj(zzst zzstVar) {
        return Build.VERSION.SDK_INT >= 35 && zzstVar.zzh;
    }

    private static List zzbk(Context context, zztb zztbVar, zzu zzuVar, boolean z, boolean z2) throws zztd {
        String str = zzuVar.zzo;
        if (str == null) {
            return zzgjz.zzi();
        }
        if ("video/dolby-vision".equals(str) && !zzaab.zza(context)) {
            List listZzd = zztl.zzd(zztbVar, zzuVar, z, z2);
            if (!listZzd.isEmpty()) {
                return listZzd;
            }
        }
        return zztl.zzc(zztbVar, zzuVar, z, z2);
    }

    private final void zzbl(@Nullable Object obj) throws zzsw, zzhz {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzt == surface) {
            if (surface != null) {
                zzbt();
                Surface surface2 = this.zzt;
                if (surface2 == null || !this.zzw) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzt = surface;
        if (this.zzp == null) {
            this.zzi.zzd(surface);
        }
        this.zzw = false;
        int iZze = zze();
        zzsq zzsqVarZzaD = zzaD();
        if (zzsqVarZzaD != null && this.zzp == null) {
            zzst zzstVarZzaG = zzaG();
            zzstVarZzaG.getClass();
            if (!zzbp(zzstVarZzaG) || this.zzn) {
                zzaH();
                zzaz();
            } else {
                Surface surfaceZzbq = zzbq(zzstVarZzaG);
                if (surfaceZzbq != null) {
                    zzsqVarZzaD.zzm(surfaceZzbq);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzsqVarZzaD.zzn();
                }
            }
        }
        if (surface != null) {
            zzbt();
        } else {
            this.zzJ = null;
            zzabr zzabrVar = this.zzp;
            if (zzabrVar != null) {
                zzabrVar.zzq();
            }
        }
        if (iZze == 2) {
            zzabr zzabrVar2 = this.zzp;
            if (zzabrVar2 != null) {
                zzabrVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final boolean zzbm(zzhg zzhgVar) {
        if (zzdb() || zzhgVar.zzd() || this.zzO == -9223372036854775807L) {
            return true;
        }
        return this.zzO - (zzhgVar.zze - zzaZ()) <= 100000;
    }

    private final boolean zzbn(zzhg zzhgVar) {
        return zzhgVar.zze < zzG();
    }

    private final void zzbo(long j, long j2, zzu zzuVar) {
        zzaar zzaarVar = this.zzM;
        if (zzaarVar != null) {
            zzaarVar.zzcS(j, j2, zzuVar, zzaF());
        }
    }

    private final boolean zzbp(zzst zzstVar) {
        if (this.zzp != null) {
            return true;
        }
        Surface surface = this.zzt;
        return (surface != null && surface.isValid()) || zzbj(zzstVar) || zzbd(zzstVar);
    }

    @Nullable
    private final Surface zzbq(zzst zzstVar) {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            return zzabrVar.zzk();
        }
        Surface surface = this.zzt;
        if (surface != null) {
            return surface;
        }
        if (zzbj(zzstVar)) {
            return null;
        }
        zzghc.zzh(zzbd(zzstVar));
        zzaag zzaagVar = this.zzu;
        if (zzaagVar != null) {
            if (zzaagVar.zza != zzstVar.zzf) {
                zzbr();
            }
        }
        if (this.zzu == null) {
            this.zzu = zzaag.zzb(this.zze, zzstVar.zzf);
        }
        return this.zzu;
    }

    private final void zzbr() {
        zzaag zzaagVar = this.zzu;
        if (zzaagVar != null) {
            zzaagVar.release();
            this.zzu = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull
    /* renamed from: zzbs, reason: merged with bridge method [inline-methods] */
    public final void zzbg() {
        this.zzg.zzg(this.zzt);
        this.zzw = true;
    }

    private final void zzbt() {
        zzbu zzbuVar = this.zzJ;
        if (zzbuVar != null) {
            this.zzg.zzf(zzbuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzA(long j, boolean z) throws zzhz {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null && !z) {
            zzabrVar.zzg(true);
        }
        super.zzA(j, z);
        if (this.zzp == null) {
            this.zzi.zzl();
        }
        if (z) {
            zzabr zzabrVar2 = this.zzp;
            if (zzabrVar2 != null) {
                zzabrVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzB = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final void zzB() {
        this.zzA = 0;
        this.zzz = zzL().zzb();
        this.zzF = 0L;
        this.zzG = 0;
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final void zzC() {
        if (this.zzA > 0) {
            long jZzb = zzL().zzb();
            this.zzg.zzd(this.zzA, jZzb - this.zzz);
            this.zzA = 0;
            this.zzz = jZzb;
        }
        int i = this.zzG;
        if (i != 0) {
            this.zzg.zze(this.zzF, i);
            this.zzF = 0L;
            this.zzG = 0;
        }
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzb();
        } else {
            this.zzi.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzD() {
        this.zzJ = null;
        this.zzO = -9223372036854775807L;
        this.zzw = false;
        this.zzE = true;
        try {
            super.zzD();
        } finally {
            zzabl zzablVar = this.zzg;
            zzablVar.zzi(((zzsz) this).zza);
            zzablVar.zzf(zzbu.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzq = false;
            this.zzN = -9223372036854775807L;
            zzbr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final void zzF() {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null || !this.zzf) {
            return;
        }
        zzabrVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzll, com.google.android.gms.internal.ads.zzln
    public final String zzS() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final void zzU(float f, float f2) throws zzsw, zzhz {
        super.zzU(f, f2);
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzm(f);
        } else {
            this.zzi.zzn(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzV() {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null) {
            this.zzi.zzh();
            return;
        }
        int i = this.zzr;
        if (i == 0 || i == 1) {
            this.zzr = 0;
        } else {
            zzabrVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    @CallSuper
    public final void zzW(long j, long j2) throws Throwable {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            try {
                zzabrVar.zzv(j, j2);
            } catch (zzabq e) {
                throw zzN(e, e.zza, false, 7001);
            }
        }
        super.zzW(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final boolean zzX() {
        boolean zZzaV = zzaV();
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            return zzabrVar.zzh(zZzaV);
        }
        if (zZzaV && zzaD() == null) {
            return true;
        }
        return this.zzi.zzi(zZzaV);
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final boolean zzY() {
        if (!super.zzY()) {
            return false;
        }
        zzabr zzabrVar = this.zzp;
        return zzabrVar == null || zzabrVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final boolean zzaB(zzst zzstVar) {
        return zzbp(zzstVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final boolean zzaJ() {
        zzst zzstVarZzaG = zzaG();
        if (this.zzp != null && zzstVarZzaG != null) {
            String str = zzstVarZzaG.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    @Override // com.google.android.gms.internal.ads.zzsz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzaK() {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.zzu r0 = r12.zzaE()
            long r1 = r12.zzO
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L2a
            r8 = 1
            long r1 = r1 + r8
            long r8 = r12.zzaZ()
            long r10 = r12.zzO
            long r8 = r8 + r10
            long r10 = r12.zzaL()
            long r10 = r10 + r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r1 = r1 - r8
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto L2c
        L2a:
            r1 = r7
            goto L2d
        L2c:
            r1 = r6
        L2d:
            com.google.android.gms.internal.ads.zzls r2 = r12.zzD
            if (r2 != 0) goto L32
            goto L47
        L32:
            boolean r2 = r12.zzE
            if (r2 != 0) goto L47
            if (r0 == 0) goto L3c
            int r0 = r0.zzq
            if (r0 > 0) goto L47
        L3c:
            if (r1 != 0) goto L47
            long r0 = r12.zzaT()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L47
            return r6
        L47:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaae.zzaK():boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @CallSuper
    public final void zzaM() {
        super.zzaM();
        this.zzl.clear();
        this.zzC = 0;
        this.zzE = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final zzss zzaO(Throwable th, @Nullable zzst zzstVar) {
        return new zzzy(th, zzstVar, this.zzt);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @CallSuper
    public final boolean zzaP(zzu zzuVar) throws zzhz {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null || zzabrVar.zze()) {
            return true;
        }
        try {
            zzabrVar.zzd(zzuVar);
            return true;
        } catch (zzabq e) {
            throw zzN(e, zzuVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @CallSuper
    public final void zzaQ(zzhg zzhgVar) throws zzhz {
        int iZzaR = zzaR(zzhgVar);
        if (Build.VERSION.SDK_INT < 34 || (iZzaR & 32) == 0) {
            this.zzC++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final int zzaR(zzhg zzhgVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzD == null || !zzbn(zzhgVar) || zzbm(zzhgVar)) ? 0 : 32;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final boolean zzaS(zzhg zzhgVar) {
        boolean z = false;
        if (zzbm(zzhgVar)) {
            return false;
        }
        if (zzbn(zzhgVar)) {
            if (zzhgVar.zze()) {
                return false;
            }
            if (zzhgVar.zzf()) {
                zzhgVar.zza();
                z = true;
            }
            if (z) {
                ((zzsz) this).zza.zzd++;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @CallSuper
    public final void zzaU(long j) {
        super.zzaU(j);
        this.zzC--;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final int zzab(zztb zztbVar, zzu zzuVar) throws zztd {
        boolean z;
        String str = zzuVar.zzo;
        if (!zzar.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i = 0;
        boolean z2 = zzuVar.zzs != null;
        List listZzbk = zzbk(context, zztbVar, zzuVar, z2, false);
        if (z2 && listZzbk.isEmpty()) {
            listZzbk = zzbk(context, zztbVar, zzuVar, false, false);
        }
        if (listZzbk.isEmpty()) {
            return 129;
        }
        if (!zzsz.zzbb(zzuVar)) {
            return 130;
        }
        zzst zzstVar = (zzst) listZzbk.get(0);
        boolean zZzc = zzstVar.zzc(zzuVar);
        if (zZzc) {
            z = true;
        } else {
            for (int i2 = 1; i2 < listZzbk.size(); i2++) {
                zzst zzstVar2 = (zzst) listZzbk.get(i2);
                if (zzstVar2.zzc(zzuVar)) {
                    zZzc = true;
                    z = false;
                    zzstVar = zzstVar2;
                    break;
                }
            }
            z = true;
        }
        int i3 = true != zZzc ? 3 : 4;
        int i4 = true != zzstVar.zze(zzuVar) ? 8 : 16;
        int i5 = true != zzstVar.zzg ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if ("video/dolby-vision".equals(str) && !zzaab.zza(context)) {
            i6 = 256;
        }
        if (zZzc) {
            List listZzbk2 = zzbk(context, zztbVar, zzuVar, z2, true);
            if (!listZzbk2.isEmpty()) {
                zzst zzstVar3 = (zzst) zztl.zze(listZzbk2, zzuVar).get(0);
                if (zzstVar3.zzc(zzuVar) && zzstVar3.zze(zzuVar)) {
                    i = 32;
                }
            }
        }
        return i3 | i4 | i | i5 | i6;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final List zzac(zztb zztbVar, zzu zzuVar, boolean z) throws zztd {
        return zztl.zze(zzbk(this.zze, zztbVar, zzuVar, false, false), zzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final zzsn zzae(zzst zzstVar, zzu zzuVar, @Nullable MediaCrypto mediaCrypto, float f) {
        zzaad zzaadVar;
        Point pointZzi;
        int i;
        int i2;
        int i3;
        boolean z;
        zzu[] zzuVarArr;
        char c;
        boolean z2;
        int iZzas;
        zzu[] zzuVarArrZzI = zzI();
        int length = zzuVarArrZzI.length;
        int iZzbe = zzbe(zzstVar, zzuVar);
        int i4 = zzuVar.zzw;
        int i5 = zzuVar.zzv;
        if (length == 1) {
            if (iZzbe != -1 && (iZzas = zzas(zzstVar, zzuVar)) != -1) {
                iZzbe = Math.min((int) (iZzbe * 1.5f), iZzas);
            }
            zzaadVar = new zzaad(i5, i4, iZzbe);
        } else {
            int iMax = i4;
            int iMax2 = i5;
            int i6 = 0;
            boolean z3 = false;
            while (i6 < length) {
                zzu zzuVarZzM = zzuVarArrZzI[i6];
                zzh zzhVar = zzuVar.zzE;
                if (zzhVar != null && zzuVarZzM.zzE == null) {
                    zzs zzsVarZza = zzuVarZzM.zza();
                    zzsVarZza.zzC(zzhVar);
                    zzuVarZzM = zzsVarZza.zzM();
                }
                if (zzstVar.zzf(zzuVar, zzuVarZzM).zzd != 0) {
                    int i7 = zzuVarZzM.zzv;
                    c = 65535;
                    if (i7 != -1) {
                        zzuVarArr = zzuVarArrZzI;
                        if (zzuVarZzM.zzw != -1) {
                            z2 = false;
                        }
                        z3 |= z2;
                        iMax2 = Math.max(iMax2, i7);
                        iMax = Math.max(iMax, zzuVarZzM.zzw);
                        iZzbe = Math.max(iZzbe, zzbe(zzstVar, zzuVarZzM));
                    } else {
                        zzuVarArr = zzuVarArrZzI;
                    }
                    z2 = true;
                    z3 |= z2;
                    iMax2 = Math.max(iMax2, i7);
                    iMax = Math.max(iMax, zzuVarZzM.zzw);
                    iZzbe = Math.max(iZzbe, zzbe(zzstVar, zzuVarZzM));
                } else {
                    zzuVarArr = zzuVarArrZzI;
                    c = 65535;
                }
                i6++;
                zzuVarArrZzI = zzuVarArr;
            }
            if (z3) {
                zzds.zzc("MediaCodecVideoRenderer", au.com.woolworths.shop.checkout.ui.confirmation.c.l(iMax2, iMax, "Resolutions unknown. Codec max resolution: ", "x", new StringBuilder(String.valueOf(iMax2).length() + 44 + String.valueOf(iMax).length())));
                boolean z4 = i4 > i5;
                int i8 = z4 ? i4 : i5;
                int i9 = true != z4 ? i4 : i5;
                int[] iArr = zzb;
                int i10 = 0;
                while (i10 < 9) {
                    float f2 = i9;
                    float f3 = i8;
                    int i11 = iArr[i10];
                    int i12 = i10;
                    float f4 = i11;
                    if (i11 <= i8 || (i = (int) (f4 * (f2 / f3))) <= i9) {
                        break;
                    }
                    int i13 = i8;
                    if (true != z4) {
                        i2 = i9;
                        i3 = i11;
                    } else {
                        i2 = i9;
                        i3 = i;
                    }
                    if (true != z4) {
                        i11 = i;
                    }
                    pointZzi = zzstVar.zzi(i3, i11);
                    float f5 = zzuVar.zzz;
                    if (pointZzi != null) {
                        z = z4;
                        if (zzstVar.zzg(pointZzi.x, pointZzi.y, f5)) {
                            break;
                        }
                    } else {
                        z = z4;
                    }
                    i10 = i12 + 1;
                    i8 = i13;
                    i9 = i2;
                    z4 = z;
                }
                pointZzi = null;
                if (pointZzi != null) {
                    iMax2 = Math.max(iMax2, pointZzi.x);
                    iMax = Math.max(iMax, pointZzi.y);
                    zzs zzsVarZza2 = zzuVar.zza();
                    zzsVarZza2.zzt(iMax2);
                    zzsVarZza2.zzu(iMax);
                    iZzbe = Math.max(iZzbe, zzas(zzstVar, zzsVarZza2.zzM()));
                    zzds.zzc("MediaCodecVideoRenderer", au.com.woolworths.shop.checkout.ui.confirmation.c.l(iMax2, iMax, "Codec max resolution adjusted to: ", "x", new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.a(iMax2, 35) + String.valueOf(iMax).length())));
                }
            }
            zzaadVar = new zzaad(iMax2, iMax, iZzbe);
        }
        String str = zzstVar.zzc;
        this.zzm = zzaadVar;
        boolean z5 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i5);
        mediaFormat.setInteger("height", i4);
        zzdv.zza(mediaFormat, zzuVar.zzr);
        float f6 = zzuVar.zzz;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        zzdv.zzb(mediaFormat, "rotation-degrees", zzuVar.zzA);
        zzh zzhVar2 = zzuVar.zzE;
        if (zzhVar2 != null) {
            zzdv.zzb(mediaFormat, "color-transfer", zzhVar2.zzd);
            zzdv.zzb(mediaFormat, "color-standard", zzhVar2.zzb);
            zzdv.zzb(mediaFormat, "color-range", zzhVar2.zzc);
            byte[] bArr = zzhVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzuVar.zzo)) {
            int i14 = zztl.zza;
            Pair pairZze = zzdc.zze(zzuVar);
            if (pairZze != null) {
                zzdv.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZze.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzaadVar.zza);
        mediaFormat.setInteger("max-height", zzaadVar.zzb);
        zzdv.zzb(mediaFormat, "max-input-size", zzaadVar.zzc);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z5) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzK));
        }
        Surface surfaceZzbq = zzbq(zzstVar);
        if (this.zzp != null && !zzeo.zzS(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzsn.zzb(zzstVar, mediaFormat, zzuVar, surfaceZzbq, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final zzhs zzaf(zzst zzstVar, zzu zzuVar, zzu zzuVar2) {
        int i;
        int i2;
        zzhs zzhsVarZzf = zzstVar.zzf(zzuVar, zzuVar2);
        int i3 = zzhsVarZzf.zze;
        zzaad zzaadVar = this.zzm;
        zzaadVar.getClass();
        if (zzuVar2.zzv > zzaadVar.zza || zzuVar2.zzw > zzaadVar.zzb) {
            i3 |= 256;
        }
        if (zzbe(zzstVar, zzuVar2) > zzaadVar.zzc) {
            i3 |= 64;
        }
        String str = zzstVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzhsVarZzf.zzd;
        }
        return new zzhs(str, zzuVar, zzuVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final float zzah(float f, zzu zzuVar, zzu[] zzuVarArr) {
        zzst zzstVarZzaG;
        float fMax = -1.0f;
        for (zzu zzuVar2 : zzuVarArr) {
            float f2 = zzuVar2.zzz;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.zzD == null || (zzstVarZzaG = zzaG()) == null) {
            return f3;
        }
        float fZzh = zzstVarZzaG.zzh(zzuVar.zzv, zzuVar.zzw);
        return f3 != -1.0f ? Math.max(f3, fZzh) : fZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzai(String str, zzsn zzsnVar, long j, long j2) {
        this.zzg.zzb(str, j, j2);
        this.zzn = zzbi(str);
        zzst zzstVarZzaG = zzaG();
        zzstVarZzaG.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzstVarZzaG.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzb = zzstVarZzaG.zzb();
            int length = codecProfileLevelArrZzb.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArrZzb[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.zzo = z;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzaj(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzak(Exception exc) {
        zzds.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @Nullable
    public final zzhs zzal(zzkh zzkhVar) throws zzhz {
        zzhs zzhsVarZzal = super.zzal(zzkhVar);
        zzu zzuVar = zzkhVar.zzb;
        zzuVar.getClass();
        this.zzg.zzc(zzuVar, zzhsVarZzal);
        return zzhsVarZzal;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzam(zzu zzuVar, @Nullable MediaFormat mediaFormat) {
        zzsq zzsqVarZzaD = zzaD();
        if (zzsqVarZzaD != null) {
            zzsqVarZzaD.zzp(this.zzx);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzuVar.zzB;
        int i = zzuVar.zzA;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.zzI = new zzbu(integer, integer2, f);
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null || !this.zzP) {
            this.zzi.zze(zzuVar.zzz);
        } else {
            zzs zzsVarZza = zzuVar.zza();
            zzsVarZza.zzt(integer);
            zzsVarZza.zzu(integer2);
            zzsVarZza.zzz(f);
            zzu zzuVarZzM = zzsVarZza.zzM();
            int i3 = this.zzr;
            List listZzi = this.zzs;
            if (listZzi == null) {
                listZzi = zzgjz.zzi();
            }
            zzabrVar.zzs(1, zzuVarZzM, zzba(), i3, listZzi);
            this.zzr = 2;
        }
        this.zzP = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final boolean zzan(long j, long j2, long j3, boolean z, boolean z2) throws zzsw, zzhz {
        int iZzP;
        if (this.zzp != null && this.zzf) {
            j2 -= -this.zzN;
        }
        if (j >= -500000 || z || (iZzP = zzP(j2)) == 0) {
            return false;
        }
        if (z2) {
            zzhr zzhrVar = ((zzsz) this).zza;
            int i = zzhrVar.zzd + iZzP;
            zzhrVar.zzd = i;
            zzhrVar.zzf += this.zzC;
            zzhrVar.zzd = this.zzl.size() + i;
        } else {
            ((zzsz) this).zza.zzj++;
            zzav(this.zzl.size() + iZzP, this.zzC);
        }
        zzaI();
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzao() {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzi();
            long jZzba = this.zzN;
            if (jZzba == -9223372036854775807L) {
                jZzba = zzba();
                this.zzN = jZzba;
            }
            this.zzp.zzo(-jZzba);
        } else {
            this.zzi.zza(2);
        }
        this.zzP = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final boolean zzap(long j, long j2, @Nullable zzsq zzsqVar, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzu zzuVar) throws zzhz {
        zzaae zzaaeVar;
        long j4;
        zzsqVar.getClass();
        long jZzaZ = j3 - zzaZ();
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzl;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            i4++;
        }
        zzav(i4, 0);
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            if (!z || z2) {
                return zzabrVar.zzu(j3, new zzaaa(this, zzsqVar, i, jZzaZ));
            }
            zzat(zzsqVar, i, jZzaZ);
            return true;
        }
        zzaau zzaauVar = this.zzi;
        long jZzba = zzba();
        zzaas zzaasVar = this.zzj;
        int iZzk = zzaauVar.zzk(j3, j, j2, jZzba, z, z2, zzaasVar);
        if (iZzk == 0) {
            long jZzc = zzL().zzc();
            zzbo(jZzaZ, jZzc, zzuVar);
            zzax(zzsqVar, i, jZzaZ, jZzc);
            zzaw(zzaasVar.zza());
            return true;
        }
        if (iZzk != 1) {
            if (iZzk == 2) {
                zzau(zzsqVar, i, jZzaZ);
                zzaw(zzaasVar.zza());
                return true;
            }
            if (iZzk != 3) {
                return false;
            }
            zzat(zzsqVar, i, jZzaZ);
            zzaw(zzaasVar.zza());
            return true;
        }
        long jZzb = zzaasVar.zzb();
        long jZza = zzaasVar.zza();
        if (jZzb == this.zzH) {
            zzat(zzsqVar, i, jZzaZ);
            j4 = jZzb;
            zzaaeVar = this;
        } else {
            zzbo(jZzaZ, jZzb, zzuVar);
            zzax(zzsqVar, i, jZzaZ, jZzb);
            zzaaeVar = this;
            j4 = jZzb;
        }
        zzaaeVar.zzaw(jZza);
        zzaaeVar.zzH = j4;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzaq() {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @TargetApi
    public final void zzar(zzhg zzhgVar) throws zzhz {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzhgVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzsq zzsqVarZzaD = zzaD();
                        zzsqVarZzaD.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzsqVarZzaD.zzo(bundle);
                    }
                }
            }
        }
    }

    public final void zzat(zzsq zzsqVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zzsqVar.zzc(i, false);
        Trace.endSection();
        ((zzsz) this).zza.zzf++;
    }

    public final void zzau(zzsq zzsqVar, int i, long j) {
        Trace.beginSection("dropVideoBuffer");
        zzsqVar.zzc(i, false);
        Trace.endSection();
        zzav(0, 1);
    }

    public final void zzav(int i, int i2) {
        zzhr zzhrVar = ((zzsz) this).zza;
        zzhrVar.zzh += i;
        int i3 = i + i2;
        zzhrVar.zzg += i3;
        this.zzA += i3;
        int i4 = this.zzB + i3;
        this.zzB = i4;
        zzhrVar.zzi = Math.max(i4, zzhrVar.zzi);
    }

    public final void zzaw(long j) {
        zzhr zzhrVar = ((zzsz) this).zza;
        zzhrVar.zzk += j;
        zzhrVar.zzl++;
        this.zzF += j;
        this.zzG++;
    }

    public final void zzax(zzsq zzsqVar, int i, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zzsqVar.zzd(i, j2);
        Trace.endSection();
        ((zzsz) this).zza.zze++;
        this.zzB = 0;
        if (this.zzp == null) {
            zzbu zzbuVar = this.zzI;
            if (!zzbuVar.equals(zzbu.zza) && !zzbuVar.equals(this.zzJ)) {
                this.zzJ = zzbuVar;
                this.zzg.zzf(zzbuVar);
            }
            if (!this.zzi.zzf() || this.zzt == null) {
                return;
            }
            zzbg();
        }
    }

    public final boolean zzbd(zzst zzstVar) {
        if (zzbi(zzstVar.zza)) {
            return false;
        }
        return !zzstVar.zzf || zzaag.zza(this.zze);
    }

    public final /* synthetic */ Surface zzbh() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzlg
    public final void zzx(int i, @Nullable Object obj) throws zzsw, zzhz {
        if (i == 1) {
            zzbl(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            zzaar zzaarVar = (zzaar) obj;
            this.zzM = zzaarVar;
            zzabr zzabrVar = this.zzp;
            if (zzabrVar != null) {
                zzabrVar.zzl(zzaarVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzL != iIntValue) {
                this.zzL = iIntValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzx = iIntValue2;
            zzsq zzsqVarZzaD = zzaD();
            if (zzsqVarZzaD != null) {
                zzsqVarZzaD.zzp(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzy = iIntValue3;
            zzabr zzabrVar2 = this.zzp;
            if (zzabrVar2 != null) {
                zzabrVar2.zzr(iIntValue3);
                return;
            } else {
                this.zzi.zzm(iIntValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbq.zza)) {
                zzabr zzabrVar3 = this.zzp;
                if (zzabrVar3 == null || !zzabrVar3.zze()) {
                    return;
                }
                zzabrVar3.zzf();
                return;
            }
            this.zzs = list;
            zzabr zzabrVar4 = this.zzp;
            if (zzabrVar4 != null) {
                zzabrVar4.zzn(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            zzeg zzegVar = (zzeg) obj;
            if (zzegVar.zza() == 0 || zzegVar.zzb() == 0) {
                return;
            }
            this.zzv = zzegVar;
            zzabr zzabrVar5 = this.zzp;
            if (zzabrVar5 != null) {
                Surface surface = this.zzt;
                surface.getClass();
                zzabrVar5.zzp(surface, zzegVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.zzK = ((Integer) obj).intValue();
                zzsq zzsqVarZzaD2 = zzaD();
                if (zzsqVarZzaD2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzK));
                    zzsqVarZzaD2.zzo(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzt;
                zzbl(null);
                obj.getClass();
                ((zzaae) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z = this.zzD != null;
                zzls zzlsVar = (zzls) obj;
                this.zzD = zzlsVar;
                if (z != (zzlsVar != null)) {
                    zzaY();
                    break;
                }
                break;
            default:
                super.zzx(i, obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzy(boolean z, boolean z2) throws zzhz {
        super.zzy(z, z2);
        zzJ();
        this.zzg.zza(((zzsz) this).zza);
        if (!this.zzq) {
            if (this.zzs != null && this.zzp == null) {
                zzaai zzaaiVar = new zzaai(this.zze, this.zzi);
                zzaaiVar.zza(true);
                long j = this.zzk;
                zzaaiVar.zzc(j != -9223372036854775807L ? -j : -9223372036854775807L);
                zzaaiVar.zzb(zzL());
                zzaaq zzaaqVarZzd = zzaaiVar.zzd();
                zzaaqVarZzd.zza(1);
                this.zzp = zzaaqVarZzd.zzb(0);
            }
            this.zzq = true;
        }
        int i = !z2 ? 1 : 0;
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null) {
            zzaau zzaauVar = this.zzi;
            zzaauVar.zzg(zzL());
            zzaauVar.zza(i);
            return;
        }
        zzabrVar.zzc(new zzzz(this), zzgpk.zza());
        zzaar zzaarVar = this.zzM;
        if (zzaarVar != null) {
            this.zzp.zzl(zzaarVar);
        }
        if (this.zzt != null && !this.zzv.equals(zzeg.zza)) {
            this.zzp.zzp(this.zzt, this.zzv);
        }
        this.zzp.zzr(this.zzy);
        this.zzp.zzm(zzaW());
        List list = this.zzs;
        if (list != null) {
            this.zzp.zzn(list);
        }
        this.zzr = i;
        zzay();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzz(zzu[] zzuVarArr, long j, long j2, zzup zzupVar) throws zzhz {
        super.zzz(zzuVarArr, j, j2, zzupVar);
        zzbe zzbeVarZzM = zzM();
        if (zzbeVarZzM.zzg()) {
            this.zzO = -9223372036854775807L;
        } else {
            this.zzO = zzbeVarZzM.zzo(zzupVar.zza, new zzbc()).zzd;
        }
    }
}
