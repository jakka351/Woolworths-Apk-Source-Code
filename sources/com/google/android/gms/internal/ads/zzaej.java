package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzaej implements zzacu {
    private static final int[] zza = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzaeb zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzacx zzn;
    private zzaeb zzo;
    private zzaeb zzp;
    private zzadv zzq;
    private long zzr;
    private boolean zzs;

    static {
        String str = zzeo.zza;
        Charset charset = StandardCharsets.UTF_8;
        zzc = "#!AMR\n".getBytes(charset);
        zzd = "#!AMR-WB\n".getBytes(charset);
    }

    public zzaej() {
        throw null;
    }

    private final boolean zza(zzacv zzacvVar) throws IOException {
        byte[] bArr = zzc;
        if (zzb(zzacvVar, bArr)) {
            this.zzg = false;
            zzacvVar.zzf(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzb(zzacvVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzacvVar.zzf(bArr2.length);
        return true;
    }

    private static boolean zzb(zzacv zzacvVar, byte[] bArr) throws IOException {
        zzacvVar.zzl();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzacvVar.zzi(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[Catch: EOFException -> 0x00a4, TryCatch #0 {EOFException -> 0x00a4, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x003a, B:22:0x0043, B:21:0x003f, B:31:0x005d, B:32:0x0085, B:33:0x0086, B:34:0x00a3), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[Catch: EOFException -> 0x00a4, TryCatch #0 {EOFException -> 0x00a4, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x003a, B:22:0x0043, B:21:0x003f, B:31:0x005d, B:32:0x0085, B:33:0x0086, B:34:0x00a3), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzc(com.google.android.gms.internal.ads.zzacv r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.zzj
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto La5
            java.lang.String r0 = "Invalid padding bits for frame header "
            r12.zzl()     // Catch: java.io.EOFException -> La4
            byte[] r4 = r11.zze     // Catch: java.io.EOFException -> La4
            r12.zzi(r4, r3, r2)     // Catch: java.io.EOFException -> La4
            r4 = r4[r3]     // Catch: java.io.EOFException -> La4
            r5 = r4 & 131(0x83, float:1.84E-43)
            r6 = 0
            if (r5 > 0) goto L86
            int r0 = r4 >> 3
            java.lang.String r4 = "Illegal AMR "
            java.lang.String r5 = " frame type "
            boolean r7 = r11.zzg     // Catch: java.io.EOFException -> La4
            r0 = r0 & 15
            if (r7 == 0) goto L2d
            r8 = 10
            if (r0 < r8) goto L38
            r8 = 13
            if (r0 <= r8) goto L2d
            goto L38
        L2d:
            if (r7 != 0) goto L56
            r8 = 12
            if (r0 < r8) goto L38
            r8 = 14
            if (r0 > r8) goto L38
            goto L56
        L38:
            if (r7 == 0) goto L3f
            int[] r4 = com.google.android.gms.internal.ads.zzaej.zzb     // Catch: java.io.EOFException -> La4
            r0 = r4[r0]     // Catch: java.io.EOFException -> La4
            goto L43
        L3f:
            int[] r4 = com.google.android.gms.internal.ads.zzaej.zza     // Catch: java.io.EOFException -> La4
            r0 = r4[r0]     // Catch: java.io.EOFException -> La4
        L43:
            r11.zzi = r0     // Catch: java.io.EOFException -> La4
            r11.zzj = r0
            int r4 = r11.zzk
            if (r4 != r1) goto L4e
            r11.zzk = r0
            r4 = r0
        L4e:
            if (r4 != r0) goto La5
            int r4 = r11.zzl
            int r4 = r4 + r2
            r11.zzl = r4
            goto La5
        L56:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r7) goto L5d
            r12 = r3
        L5d:
            int r2 = r12.length()     // Catch: java.io.EOFException -> La4
            int r2 = r2 + 24
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch: java.io.EOFException -> La4
            int r3 = r3.length()     // Catch: java.io.EOFException -> La4
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> La4
            r3.<init>(r2)     // Catch: java.io.EOFException -> La4
            r3.append(r4)     // Catch: java.io.EOFException -> La4
            r3.append(r12)     // Catch: java.io.EOFException -> La4
            r3.append(r5)     // Catch: java.io.EOFException -> La4
            r3.append(r0)     // Catch: java.io.EOFException -> La4
            java.lang.String r12 = r3.toString()     // Catch: java.io.EOFException -> La4
            com.google.android.gms.internal.ads.zzas r12 = com.google.android.gms.internal.ads.zzas.zzb(r12, r6)     // Catch: java.io.EOFException -> La4
            throw r12     // Catch: java.io.EOFException -> La4
        L86:
            java.lang.String r12 = java.lang.String.valueOf(r4)     // Catch: java.io.EOFException -> La4
            int r12 = r12.length()     // Catch: java.io.EOFException -> La4
            int r12 = r12 + 38
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> La4
            r2.<init>(r12)     // Catch: java.io.EOFException -> La4
            r2.append(r0)     // Catch: java.io.EOFException -> La4
            r2.append(r4)     // Catch: java.io.EOFException -> La4
            java.lang.String r12 = r2.toString()     // Catch: java.io.EOFException -> La4
            com.google.android.gms.internal.ads.zzas r12 = com.google.android.gms.internal.ads.zzas.zzb(r12, r6)     // Catch: java.io.EOFException -> La4
            throw r12     // Catch: java.io.EOFException -> La4
        La4:
            return r1
        La5:
            com.google.android.gms.internal.ads.zzaeb r4 = r11.zzp
            int r12 = r4.zzy(r12, r0, r2)
            if (r12 != r1) goto Lae
            return r1
        Lae:
            int r0 = r11.zzj
            int r0 = r0 - r12
            r11.zzj = r0
            if (r0 <= 0) goto Lb6
            return r3
        Lb6:
            com.google.android.gms.internal.ads.zzaeb r4 = r11.zzp
            long r5 = r11.zzh
            int r8 = r11.zzi
            r9 = 0
            r10 = 0
            r7 = 1
            r4.zzx(r5, r7, r8, r9, r10)
            long r0 = r11.zzh
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.zzh = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaej.zzc(com.google.android.gms.internal.ads.zzacv):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        return zza(zzacvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzn = zzacxVar;
        zzaeb zzaebVarZzu = zzacxVar.zzu(0, 1);
        this.zzo = zzaebVarZzu;
        this.zzp = zzaebVarZzu;
        zzacxVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        this.zzo.getClass();
        String str = zzeo.zza;
        if (zzacvVar.zzn() == 0 && !zza(zzacvVar)) {
            throw zzas.zzb("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z = this.zzg;
            String str2 = true != z ? "audio/amr" : "audio/amr-wb";
            String str3 = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i = true != z ? 8000 : 16000;
            int i2 = z ? zzb[8] : zza[7];
            zzaeb zzaebVar = this.zzo;
            zzs zzsVar = new zzs();
            zzsVar.zzl(str2);
            zzsVar.zzm(str3);
            zzsVar.zzn(i2);
            zzsVar.zzE(1);
            zzsVar.zzF(i);
            zzaebVar.zzu(zzsVar.zzM());
        }
        int iZzc = zzc(zzacvVar);
        if (this.zzq == null) {
            zzadu zzaduVar = new zzadu(-9223372036854775807L, 0L);
            this.zzq = zzaduVar;
            this.zzn.zzw(zzaduVar);
        }
        return iZzc == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j2;
        this.zzm = 0L;
    }

    public zzaej(int i) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzacr zzacrVar = new zzacr();
        this.zzf = zzacrVar;
        this.zzp = zzacrVar;
    }
}
