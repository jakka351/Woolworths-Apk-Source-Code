package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzalz implements zzamd {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;

    @Nullable
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzaeb zzi;
    private zzaeb zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzaeb zzw;
    private long zzx;
    private final zzee zzc = new zzee(new byte[7], 7);
    private final zzef zzd = new zzef(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public zzalz(boolean z, @Nullable String str, int i, String str2) {
        this.zzb = z;
        this.zze = str;
        this.zzf = i;
        this.zzg = str2;
        zzi();
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final boolean zzh(zzef zzefVar, byte[] bArr, int i) {
        int iMin = Math.min(zzefVar.zzd(), i - this.zzl);
        zzefVar.zzm(bArr, this.zzl, iMin);
        int i2 = this.zzl + iMin;
        this.zzl = i2;
        return i2 == i;
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(zzaeb zzaebVar, long j, int i, int i2) {
        this.zzk = 4;
        this.zzl = i;
        this.zzw = zzaebVar;
        this.zzx = j;
        this.zzu = i2;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | 65280);
    }

    private static final boolean zzm(zzef zzefVar, byte[] bArr, int i) {
        if (zzefVar.zzd() < i) {
            return false;
        }
        zzefVar.zzm(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzv = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzh = zzanrVar.zzc();
        zzaeb zzaebVarZzu = zzacxVar.zzu(zzanrVar.zzb(), 1);
        this.zzi = zzaebVarZzu;
        this.zzw = zzaebVarZzu;
        if (!this.zzb) {
            this.zzj = new zzacr();
            return;
        }
        zzanrVar.zza();
        zzaeb zzaebVarZzu2 = zzacxVar.zzu(zzanrVar.zzb(), 5);
        this.zzj = zzaebVarZzu2;
        zzs zzsVar = new zzs();
        zzsVar.zza(zzanrVar.zzc());
        zzsVar.zzl(this.zzg);
        zzsVar.zzm("application/id3");
        zzaebVarZzu2.zzu(zzsVar.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzv = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x025b, code lost:
    
        r18.zzk = 1;
        r18.zzl = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0261, code lost:
    
        zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0264, code lost:
    
        r19.zzh(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0247, code lost:
    
        r18.zzr = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0250, code lost:
    
        if (1 == ((r14 & 1) ^ 1)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0252, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0254, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0255, code lost:
    
        r18.zzn = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0259, code lost:
    
        if (r18.zzo != false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0247 A[EDGE_INSN: B:143:0x0247->B:94:0x0247 BREAK  A[LOOP:1: B:48:0x01a0->B:169:0x01a0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ff  */
    @Override // com.google.android.gms.internal.ads.zzamd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzef r19) throws com.google.android.gms.internal.ads.zzas {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalz.zzd(com.google.android.gms.internal.ads.zzef):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
    }
}
