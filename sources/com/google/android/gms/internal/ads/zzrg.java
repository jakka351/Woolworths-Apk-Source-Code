package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzrg extends zzsz implements zzkm {
    private final Context zzb;
    private final zzpu zzc;
    private final zzqc zzd;

    @Nullable
    private final zzsm zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;

    @Nullable
    private zzu zzi;

    @Nullable
    private zzu zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrg(Context context, zzso zzsoVar, zztb zztbVar, boolean z, @Nullable Handler handler, @Nullable zzpv zzpvVar, zzqc zzqcVar) {
        super(1, zzsoVar, zztbVar, false, 44100.0f);
        byte[] bArr = null;
        zzsm zzsmVar = Build.VERSION.SDK_INT >= 35 ? new zzsm(zzsl.zzb) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzqcVar;
        this.zze = zzsmVar;
        this.zzo = -1000;
        this.zzc = new zzpu(handler, zzpvVar);
        this.zzq = -9223372036854775807L;
        zzqcVar.zza(new zzrf(this, bArr));
    }

    private static List zzbd(zztb zztbVar, zzu zzuVar, boolean z, zzqc zzqcVar) throws zztd {
        zzst zzstVarZza;
        return zzuVar.zzo == null ? zzgjz.zzi() : (!zzqcVar.zzd(zzuVar) || (zzstVarZza = zztl.zza()) == null) ? zztl.zzc(zztbVar, zzuVar, false, false) : zzgjz.zzj(zzstVarZza);
    }

    private final int zzbe(zzst zzstVar, zzu zzuVar) {
        "OMX.google.raw.decoder".equals(zzstVar.zza);
        return zzuVar.zzp;
    }

    private final void zzbf() {
        long jZzg = this.zzd.zzg(zzY());
        if (jZzg != Long.MIN_VALUE) {
            if (!this.zzl) {
                jZzg = Math.max(this.zzk, jZzg);
            }
            this.zzk = jZzg;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzA(long j, boolean z) throws zzhz {
        super.zzA(j, z);
        this.zzd.zzz();
        this.zzk = j;
        this.zzq = -9223372036854775807L;
        this.zzn = false;
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final void zzB() {
        this.zzd.zzi();
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final void zzC() {
        zzbf();
        this.zzp = false;
        this.zzd.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzD() {
        this.zzm = true;
        this.zzi = null;
        this.zzq = -9223372036854775807L;
        try {
            this.zzd.zzz();
            super.zzD();
        } catch (Throwable th) {
            super.zzD();
            throw th;
        } finally {
            this.zzc.zzg(((zzsz) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzE() {
        this.zzn = false;
        this.zzq = -9223372036854775807L;
        try {
            super.zzE();
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzA();
            }
        } catch (Throwable th) {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzA();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final void zzF() {
        zzsm zzsmVar;
        this.zzd.zzB();
        if (Build.VERSION.SDK_INT < 35 || (zzsmVar = this.zze) == null) {
            return;
        }
        zzsmVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzll, com.google.android.gms.internal.ads.zzln
    public final String zzS() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final boolean zzX() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final boolean zzY() {
        return super.zzY() && this.zzd.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final int zzab(zztb zztbVar, zzu zzuVar) throws zztd {
        int i;
        boolean z;
        String str = zzuVar.zzo;
        if (!zzar.zza(str)) {
            return 128;
        }
        int i2 = zzuVar.zzN;
        boolean zZzbb = zzsz.zzbb(zzuVar);
        int i3 = 1;
        if (!zZzbb || (i2 != 0 && zztl.zza() == null)) {
            i = 0;
        } else {
            zzqc zzqcVar = this.zzd;
            zzpg zzpgVarZzf = zzqcVar.zzf(zzuVar);
            if (zzpgVarZzf.zzb) {
                i = true != zzpgVarZzf.zzc ? 512 : 1536;
                if (zzpgVarZzf.zzd) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (zzqcVar.zzd(zzuVar)) {
                return i | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.zzd.zzd(zzuVar)) {
            zzqc zzqcVar2 = this.zzd;
            if (zzqcVar2.zzd(zzeo.zzy(2, zzuVar.zzG, zzuVar.zzH))) {
                List listZzbd = zzbd(zztbVar, zzuVar, false, zzqcVar2);
                if (!listZzbd.isEmpty()) {
                    if (zZzbb) {
                        zzst zzstVar = (zzst) listZzbd.get(0);
                        boolean zZzc = zzstVar.zzc(zzuVar);
                        if (zZzc) {
                            z = true;
                        } else {
                            for (int i4 = 1; i4 < listZzbd.size(); i4++) {
                                zzst zzstVar2 = (zzst) listZzbd.get(i4);
                                if (zzstVar2.zzc(zzuVar)) {
                                    z = false;
                                    zZzc = true;
                                    zzstVar = zzstVar2;
                                    break;
                                }
                            }
                            z = true;
                        }
                        int i5 = true != zZzc ? 3 : 4;
                        int i6 = 8;
                        if (zZzc && zzstVar.zze(zzuVar)) {
                            i6 = 16;
                        }
                        return i5 | i6 | 32 | (true != zzstVar.zzg ? 0 : 64) | (true != z ? 0 : 128) | i;
                    }
                    i3 = 2;
                }
            }
        }
        return i3 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final List zzac(zztb zztbVar, zzu zzuVar, boolean z) throws zztd {
        return zztl.zze(zzbd(zztbVar, zzuVar, false, this.zzd), zzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final boolean zzad(zzu zzuVar) {
        zzJ();
        return this.zzd.zzd(zzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final zzsn zzae(zzst zzstVar, zzu zzuVar, @Nullable MediaCrypto mediaCrypto, float f) {
        zzu[] zzuVarArrZzI = zzI();
        int length = zzuVarArrZzI.length;
        int iZzbe = zzbe(zzstVar, zzuVar);
        if (length != 1) {
            for (zzu zzuVar2 : zzuVarArrZzI) {
                if (zzstVar.zzf(zzuVar, zzuVar2).zzd != 0) {
                    iZzbe = Math.max(iZzbe, zzbe(zzstVar, zzuVar2));
                }
            }
        }
        this.zzf = iZzbe;
        String str = zzstVar.zza;
        int i = Build.VERSION.SDK_INT;
        this.zzg = false;
        this.zzh = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zzstVar.zzc;
        int i2 = this.zzf;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i3 = zzuVar.zzG;
        mediaFormat.setInteger("channel-count", i3);
        int i4 = zzuVar.zzH;
        mediaFormat.setInteger("sample-rate", i4);
        zzdv.zza(mediaFormat, zzuVar.zzr);
        zzdv.zzb(mediaFormat, "max-input-size", i2);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        String str3 = zzuVar.zzo;
        if ("audio/ac4".equals(str3)) {
            Pair pairZze = zzdc.zze(zzuVar);
            if (pairZze != null) {
                zzdv.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZze.first).intValue());
                zzdv.zzb(mediaFormat, "level", ((Integer) pairZze.second).intValue());
            }
            if (i <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.zzd.zze(zzeo.zzy(4, i3, i4)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzo));
        }
        this.zzj = (!"audio/raw".equals(zzstVar.zzb) || "audio/raw".equals(str3)) ? null : zzuVar;
        return zzsn.zza(zzstVar, mediaFormat, zzuVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final zzhs zzaf(zzst zzstVar, zzu zzuVar, zzu zzuVar2) {
        int i;
        int i2;
        zzhs zzhsVarZzf = zzstVar.zzf(zzuVar, zzuVar2);
        int i3 = zzhsVarZzf.zze;
        if (zzaA(zzuVar2)) {
            i3 |= 32768;
        }
        if (zzbe(zzstVar, zzuVar2) > this.zzf) {
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
    public final long zzag(long j, long j2, boolean z) {
        long j3 = this.zzq;
        if (!this.zzp) {
            return (j3 != -9223372036854775807L || super.zzY()) ? 1000000L : 10000L;
        }
        long jZzv = this.zzd.zzv();
        if (j3 == -9223372036854775807L || jZzv == -9223372036854775807L) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(jZzv, this.zzq - j) / (zzj() != null ? zzj().zzb : 1.0f)) / 2.0f)) - (zzeo.zzq(zzL().zzb()) - j2));
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final float zzah(float f, zzu zzuVar, zzu[] zzuVarArr) {
        int iMax = -1;
        for (zzu zzuVar2 : zzuVarArr) {
            int i = zzuVar2.zzH;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzai(String str, zzsn zzsnVar, long j, long j2) {
        this.zzc.zzb(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzaj(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzak(Exception exc) {
        zzds.zzf("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @Nullable
    public final zzhs zzal(zzkh zzkhVar) throws zzhz {
        zzu zzuVar = zzkhVar.zzb;
        zzuVar.getClass();
        this.zzi = zzuVar;
        zzhs zzhsVarZzal = super.zzal(zzkhVar);
        this.zzc.zzc(zzuVar, zzhsVarZzal);
        return zzhsVarZzal;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzam(zzu zzuVar, @Nullable MediaFormat mediaFormat) throws zzhz {
        int i;
        zzu zzuVar2 = this.zzj;
        int[] iArr = null;
        boolean z = true;
        if (zzuVar2 != null) {
            zzuVar = zzuVar2;
        } else if (zzaD() != null) {
            mediaFormat.getClass();
            int integer = "audio/raw".equals(zzuVar.zzo) ? zzuVar.zzI : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? zzeo.zzz(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            zzs zzsVar = new zzs();
            zzsVar.zzm("audio/raw");
            zzsVar.zzG(integer);
            zzsVar.zzH(zzuVar.zzJ);
            zzsVar.zzI(zzuVar.zzK);
            zzsVar.zzk(zzuVar.zzl);
            zzsVar.zza(zzuVar.zza);
            zzsVar.zzc(zzuVar.zzb);
            zzsVar.zzd(zzuVar.zzc);
            zzsVar.zze(zzuVar.zzd);
            zzsVar.zzf(zzuVar.zze);
            zzsVar.zzg(zzuVar.zzf);
            zzsVar.zzE(mediaFormat.getInteger("channel-count"));
            zzsVar.zzF(mediaFormat.getInteger("sample-rate"));
            zzu zzuVarZzM = zzsVar.zzM();
            if (this.zzg && zzuVarZzM.zzG == 6 && (i = zzuVar.zzG) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = i2;
                }
            } else if (this.zzh) {
                int i3 = zzuVarZzM.zzG;
                if (i3 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i3 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i3 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i3 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i3 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            zzuVar = zzuVarZzM;
        }
        try {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 29) {
                if (zzaC()) {
                    zzJ();
                }
                if (i4 < 29) {
                    z = false;
                }
                zzghc.zzh(z);
            }
            this.zzd.zzh(zzuVar, 0, iArr);
        } catch (zzpx e) {
            throw zzN(e, e.zza, false, 5001);
        }
    }

    @CallSuper
    public final void zzan() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzao() {
        this.zzd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final boolean zzap(long j, long j2, @Nullable zzsq zzsqVar, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzu zzuVar) throws zzhz {
        byteBuffer.getClass();
        this.zzq = -9223372036854775807L;
        if (this.zzj != null && (i2 & 2) != 0) {
            zzsqVar.getClass();
            zzsqVar.zzc(i, false);
            return true;
        }
        if (z) {
            if (zzsqVar != null) {
                zzsqVar.zzc(i, false);
            }
            ((zzsz) this).zza.zzf += i3;
            this.zzd.zzj();
            return true;
        }
        try {
            if (!this.zzd.zzk(byteBuffer, j3, i3)) {
                this.zzq = j3;
                return false;
            }
            if (zzsqVar != null) {
                zzsqVar.zzc(i, false);
            }
            ((zzsz) this).zza.zze += i3;
            return true;
        } catch (zzpy e) {
            zzu zzuVar2 = this.zzi;
            if (zzaC()) {
                zzJ();
            }
            throw zzN(e, zzuVar2, e.zzb, 5001);
        } catch (zzqb e2) {
            if (zzaC()) {
                zzJ();
            }
            throw zzN(e2, zzuVar, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzaq() throws zzhz {
        try {
            this.zzd.zzl();
            if (zzaT() != -9223372036854775807L) {
                this.zzq = zzaT();
            }
        } catch (zzqb e) {
            throw zzN(e, e.zzc, e.zzb, true != zzaC() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzar(zzhg zzhgVar) {
        zzu zzuVar;
        if (Build.VERSION.SDK_INT < 29 || (zzuVar = zzhgVar.zza) == null || !Objects.equals(zzuVar.zzo, "audio/opus") || !zzaC()) {
            return;
        }
        ByteBuffer byteBuffer = zzhgVar.zzf;
        byteBuffer.getClass();
        zzu zzuVar2 = zzhgVar.zza;
        zzuVar2.getClass();
        int i = zzuVar2.zzJ;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzw(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    public final /* synthetic */ zzpu zzav() {
        return this.zzc;
    }

    public final /* synthetic */ zzsm zzaw() {
        return this.zze;
    }

    public final /* synthetic */ void zzax(boolean z) {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzll
    @Nullable
    public final zzkm zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final long zzg() {
        if (zze() == 2) {
            zzbf();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final boolean zzh() {
        boolean z = this.zzn;
        this.zzn = false;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzi(zzau zzauVar) {
        this.zzd.zzo(zzauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final zzau zzj() {
        return this.zzd.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzlg
    public final void zzx(int i, @Nullable Object obj) throws zzhz {
        zzsm zzsmVar;
        if (i == 2) {
            zzqc zzqcVar = this.zzd;
            obj.getClass();
            zzqcVar.zzx(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            zzc zzcVar = (zzc) obj;
            zzqc zzqcVar2 = this.zzd;
            zzcVar.getClass();
            zzqcVar2.zzr(zzcVar);
            return;
        }
        if (i == 6) {
            zzd zzdVar = (zzd) obj;
            zzqc zzqcVar3 = this.zzd;
            zzdVar.getClass();
            zzqcVar3.zzt(zzdVar);
            return;
        }
        if (i == 12) {
            this.zzd.zzu((AudioDeviceInfo) obj);
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.zzo = ((Integer) obj).intValue();
            zzsq zzsqVarZzaD = zzaD();
            if (zzsqVarZzaD == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzo));
            zzsqVarZzaD.zzo(bundle);
            return;
        }
        if (i == 9) {
            zzqc zzqcVar4 = this.zzd;
            obj.getClass();
            zzqcVar4.zzq(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                super.zzx(i, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            this.zzd.zzs(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (zzsmVar = this.zze) == null) {
                return;
            }
            zzsmVar.zza(iIntValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzy(boolean z, boolean z2) throws zzhz {
        super.zzy(z, z2);
        this.zzc.zza(((zzsz) this).zza);
        zzJ();
        zzqc zzqcVar = this.zzd;
        zzqcVar.zzb(zzK());
        zzqcVar.zzc(zzL());
    }
}
