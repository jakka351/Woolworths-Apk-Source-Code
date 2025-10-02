package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public abstract class zzsz extends zzhq {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    @Nullable
    private ArrayDeque zzA;

    @Nullable
    private zzsw zzB;

    @Nullable
    private zzst zzC;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private long zzJ;
    private boolean zzK;
    private long zzL;
    private int zzM;
    private int zzN;

    @Nullable
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private boolean zzZ;
    protected zzhr zza;
    private boolean zzaa;
    private long zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzsy zzag;
    private long zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private long zzal;
    private final zzso zzc;
    private final zztb zzd;
    private final float zze;
    private final zzhg zzf;
    private final zzhg zzg;
    private final zzhg zzh;
    private final zzsh zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzrh zzl;

    @Nullable
    private zzu zzm;
    private zzu zzn;

    @Nullable
    private zzrn zzo;

    @Nullable
    private zzrn zzp;
    private zzlk zzq;

    @Nullable
    private MediaCrypto zzr;
    private long zzs;
    private float zzt;
    private float zzu;

    @Nullable
    private zzsq zzv;

    @Nullable
    private zzu zzw;

    @Nullable
    private MediaFormat zzx;
    private boolean zzy;
    private float zzz;

    public zzsz(int i, zzso zzsoVar, zztb zztbVar, boolean z, float f) {
        super(i);
        this.zzc = zzsoVar;
        zztbVar.getClass();
        this.zzd = zztbVar;
        this.zze = f;
        this.zzf = new zzhg(0, 0);
        this.zzg = new zzhg(0, 0);
        this.zzh = new zzhg(2, 0);
        zzsh zzshVar = new zzsh();
        this.zzi = zzshVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzt = 1.0f;
        this.zzu = 1.0f;
        this.zzs = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzag = zzsy.zza;
        zzshVar.zzj(0);
        zzshVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzrh();
        this.zzz = -1.0f;
        this.zzD = 0;
        this.zzV = 0;
        this.zzM = -1;
        this.zzN = -1;
        this.zzL = -9223372036854775807L;
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzJ = -9223372036854775807L;
        this.zzW = 0;
        this.zzX = 0;
        this.zza = new zzhr();
        this.zzak = false;
        this.zzal = 0L;
    }

    private final void zzan() {
        this.zzR = false;
        zzas();
    }

    private final void zzas() {
        zzav();
        this.zzT = false;
        this.zzi.zza();
        this.zzh.zza();
        this.zzS = false;
        this.zzl.zzb();
    }

    private final boolean zzat() {
        if (this.zzv == null) {
            return false;
        }
        if (zzaJ()) {
            zzaH();
            return true;
        }
        if (zzaK()) {
            zzau();
            return false;
        }
        this.zzak = true;
        return false;
    }

    private final void zzau() {
        try {
            zzsq zzsqVar = this.zzv;
            if (zzsqVar == null) {
                throw null;
            }
            zzsqVar.zzj();
        } finally {
            zzaM();
        }
    }

    private final void zzav() {
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
    }

    private final boolean zzaw(int i) throws zzsw, zzhz {
        zzkh zzkhVarZzH = zzH();
        zzhg zzhgVar = this.zzf;
        zzhgVar.zza();
        int iZzO = zzO(zzkhVarZzH, zzhgVar, i | 4);
        if (iZzO == -5) {
            zzal(zzkhVarZzH);
            return true;
        }
        if (iZzO != -4 || !zzhgVar.zzb()) {
            return false;
        }
        this.zzad = true;
        zzbj();
        return false;
    }

    private final boolean zzax(long j) {
        return this.zzs == -9223372036854775807L || zzL().zzb() - j < this.zzs;
    }

    public static boolean zzbb(zzu zzuVar) {
        return zzuVar.zzN == 0;
    }

    private final boolean zzbd() {
        return this.zzN >= 0;
    }

    private final void zzbe() {
        this.zzM = -1;
        this.zzg.zzc = null;
    }

    private final void zzbf() {
        this.zzN = -1;
        this.zzO = null;
    }

    private final boolean zzbg(@Nullable zzu zzuVar) throws zzsw, zzhz {
        if (this.zzv != null && this.zzX != 3 && zze() != 0) {
            float f = this.zzu;
            zzuVar.getClass();
            float fZzah = zzah(f, zzuVar, zzI());
            float f2 = this.zzz;
            if (f2 != fZzah) {
                if (fZzah == -1.0f) {
                    zzbi();
                    return false;
                }
                if (f2 != -1.0f || fZzah > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzah);
                    zzsq zzsqVar = this.zzv;
                    zzsqVar.getClass();
                    zzsqVar.zzo(bundle);
                    this.zzz = fZzah;
                }
            }
        }
        return true;
    }

    private final boolean zzbh() throws zzhz {
        if (this.zzY) {
            this.zzW = 1;
            if (this.zzF) {
                this.zzX = 3;
                return false;
            }
            this.zzX = 2;
        } else {
            zzbl();
        }
        return true;
    }

    private final void zzbi() throws zzsw, zzhz {
        if (this.zzY) {
            this.zzW = 1;
            this.zzX = 3;
        } else {
            zzaH();
            zzaz();
        }
    }

    private final void zzbj() throws zzsw, zzhz {
        int i = this.zzX;
        if (i == 1) {
            zzau();
            return;
        }
        if (i == 2) {
            zzau();
            zzbl();
        } else if (i != 3) {
            this.zzae = true;
            zzaq();
        } else {
            zzaH();
            zzaz();
        }
    }

    private final void zzbk(zzsy zzsyVar) {
        this.zzag = zzsyVar;
        if (zzsyVar.zzd != -9223372036854775807L) {
            this.zzai = true;
        }
    }

    private final void zzbl() throws zzhz {
        zzrn zzrnVar = this.zzp;
        zzrnVar.getClass();
        this.zzo = zzrnVar;
        this.zzW = 0;
        this.zzX = 0;
    }

    private final boolean zzbm(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzu zzuVar = this.zzn;
        return (zzuVar != null && Objects.equals(zzuVar.zzo, "audio/opus") && zzadr.zzf(j, j2)) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public void zzA(long j, boolean z) throws zzhz {
        this.zzad = false;
        this.zzae = false;
        if (this.zzR) {
            zzas();
        } else {
            zzaI();
        }
        zzek zzekVar = this.zzag.zze;
        if (zzekVar.zzc() > 0) {
            this.zzaf = true;
        }
        zzekVar.zzb();
        this.zzk.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public void zzD() {
        this.zzm = null;
        zzbk(zzsy.zza);
        this.zzk.clear();
        if (this.zzR) {
            zzan();
        } else {
            zzat();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public void zzE() {
        try {
            zzan();
            zzaH();
        } finally {
            this.zzp = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final long zzT(long j, long j2) {
        return zzag(j, j2, this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public void zzU(float f, float f2) throws zzsw, zzhz {
        this.zzt = f;
        this.zzu = f2;
        zzbg(this.zzw);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:128|129|(12:390|131|(2:133|(2:135|(6:137|(1:146)(1:143)|144|145|227|(2:409|229)(1:230))(2:403|147))(6:402|148|(1:154)|155|(1:159)|160))(2:162|(4:164|145|227|(0)(0))(2:167|(7:172|(1:174)|175|(1:181)|(1:183)(2:184|(0))|188|(1:190)(2:405|191))(2:404|171)))|365|(2:368|(1:386))|372|(1:377)(1:376)|(1:379)|380|(1:382)(1:383)|384|385)(1:192)|193|(1:197)(1:198)|199|(1:204)(1:203)|205|206|400|207|(3:209|210|(5:212|(1:214)(1:215)|(1:221)|222|(2:408|224)(3:226|227|(0)(0)))(1:407))(3:406|356|357)) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x025c, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x034d, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0362, code lost:
    
        r4 = r21.zzv;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0364, code lost:
    
        if (r4 == null) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0369, code lost:
    
        if (r21.zzW == 2) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x036d, code lost:
    
        if (r21.zzad == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0375, code lost:
    
        if (r21.zzM >= 0) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0377, code lost:
    
        r0 = r4.zze();
        r21.zzM = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x037d, code lost:
    
        if (r0 < 0) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x037f, code lost:
    
        r5 = r21.zzg;
        r5.zzc = r4.zzh(r0);
        r5.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x038c, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x038d, code lost:
    
        if (r21.zzW != 1) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0391, code lost:
    
        if (r21.zzI != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0393, code lost:
    
        r21.zzZ = true;
        r4.zza(r21.zzM, 0, 0, 0, 4);
        zzbe();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x03a4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x03a7, code lost:
    
        r21.zzW = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x03ae, code lost:
    
        if (r21.zzG == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x03b1, code lost:
    
        r21.zzG = false;
        r0 = r21.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x03b7, code lost:
    
        if (r0 == null) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x03b9, code lost:
    
        r0.put(com.google.android.gms.internal.ads.zzsz.zzb);
        r4.zza(r21.zzM, 0, 38, 0, 0);
        zzbe();
        r21.zzY = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x03d6, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x03d7, code lost:
    
        r12 = false;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x03da, code lost:
    
        if (r21.zzV != 1) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x03dc, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x03dd, code lost:
    
        r5 = r21.zzw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x03df, code lost:
    
        if (r5 == null) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x03e7, code lost:
    
        if (r0 >= r5.zzr.size()) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x03e9, code lost:
    
        r5 = (byte[]) r21.zzw.zzr.get(r0);
        r6 = r21.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x03f7, code lost:
    
        if (r6 == null) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x03f9, code lost:
    
        r6.put(r5);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x03ff, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0400, code lost:
    
        r21.zzV = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0403, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0404, code lost:
    
        r0 = r21.zzg;
        r5 = r0.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0408, code lost:
    
        if (r5 == null) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x040a, code lost:
    
        r5 = r5.position();
        r6 = zzH();
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0412, code lost:
    
        r0 = zzO(r6, r0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0417, code lost:
    
        if (r0 != (-3)) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x041d, code lost:
    
        if (zzdb() == false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x041f, code lost:
    
        r21.zzac = r21.zzab;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0426, code lost:
    
        if (r0 != (-5)) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x042a, code lost:
    
        if (r21.zzV != 2) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x042c, code lost:
    
        r21.zzg.zza();
        r21.zzV = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0433, code lost:
    
        zzal(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0438, code lost:
    
        r0 = r21.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x043e, code lost:
    
        if (r0.zzb() == false) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0440, code lost:
    
        r21.zzac = r21.zzab;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0446, code lost:
    
        if (r21.zzV != 2) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0448, code lost:
    
        r0.zza();
        r21.zzV = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x044d, code lost:
    
        r21.zzad = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0451, code lost:
    
        if (r21.zzY != false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0453, code lost:
    
        zzbj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x045a, code lost:
    
        if (r21.zzI != false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x045c, code lost:
    
        r21.zzZ = true;
        r4.zza(r21.zzM, 0, 0, 0, 4);
        zzbe();
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0470, code lost:
    
        if (r21.zzY != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0476, code lost:
    
        if (r0.zzc() != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0478, code lost:
    
        r0.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x047d, code lost:
    
        if (r21.zzV != 2) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x047f, code lost:
    
        r21.zzV = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0487, code lost:
    
        if (zzaS(r0) != false) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0489, code lost:
    
        r6 = r0.zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x048d, code lost:
    
        if (r6 == false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x048f, code lost:
    
        r0.zzb.zzc(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0494, code lost:
    
        r7 = r0.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0498, code lost:
    
        if (r21.zzaf == false) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x049a, code lost:
    
        r5 = r21.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x04a0, code lost:
    
        if (r5.isEmpty() != false) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x04a2, code lost:
    
        r5 = ((com.google.android.gms.internal.ads.zzsy) r5.peekLast()).zze;
        r9 = r21.zzm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x04ac, code lost:
    
        if (r9 == null) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x04ae, code lost:
    
        r5.zza(r7, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x04b2, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x04b3, code lost:
    
        r5 = r21.zzag.zze;
        r9 = r21.zzm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04b9, code lost:
    
        if (r9 == null) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x04bb, code lost:
    
        r5.zza(r7, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x04be, code lost:
    
        r21.zzaf = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x04c1, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x04c2, code lost:
    
        r9 = java.lang.Math.max(r21.zzab, r7);
        r21.zzab = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x04ce, code lost:
    
        if (zzdb() != false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x04d4, code lost:
    
        if (r0.zzd() == false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x04d6, code lost:
    
        r21.zzac = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x04d8, code lost:
    
        r0.zzl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x04df, code lost:
    
        if (r0.zze() == false) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x04e1, code lost:
    
        zzar(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x04e6, code lost:
    
        if (r21.zzak == false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x04e8, code lost:
    
        r9 = r21.zzab;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x04ec, code lost:
    
        if (r7 > r9) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x04ee, code lost:
    
        r21.zzal = ((r9 - r7) + 1) + r21.zzal;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x04f8, code lost:
    
        r21.zzab = r7;
        r21.zzak = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x04fc, code lost:
    
        zzaQ(r0);
        r10 = zzaR(r0);
        r8 = r7 + r21.zzal;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0507, code lost:
    
        if (r6 == false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0509, code lost:
    
        r4.zzb(r21.zzM, 0, r0.zzb, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0512, code lost:
    
        r5 = r21.zzM;
        r0 = r0.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0516, code lost:
    
        if (r0 == null) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0518, code lost:
    
        r4.zza(r5, 0, r0.limit(), r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0520, code lost:
    
        zzbe();
        r21.zzY = true;
        r21.zzV = 0;
        r21.zza.zzc++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x052f, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0530, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0531, code lost:
    
        zzak(r0);
        zzaw(0);
        zzau();
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0542, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x054b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x054c, code lost:
    
        r12 = r5;
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000d, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0359 A[LOOP:0: B:126:0x01ec->B:230:0x0359, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0358 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzsz] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // com.google.android.gms.internal.ads.zzll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzW(long r22, long r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsz.zzW(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public boolean zzX() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public boolean zzY() {
        return this.zzae;
    }

    public final boolean zzaA(zzu zzuVar) {
        return this.zzp == null && zzad(zzuVar);
    }

    public boolean zzaB(zzst zzstVar) {
        return true;
    }

    public final boolean zzaC() {
        return this.zzR;
    }

    @Nullable
    public final zzsq zzaD() {
        return this.zzv;
    }

    @Nullable
    public final zzu zzaE() {
        return this.zzw;
    }

    @Nullable
    public final MediaFormat zzaF() {
        return this.zzx;
    }

    @Nullable
    public final zzst zzaG() {
        return this.zzC;
    }

    public final void zzaH() {
        try {
            zzsq zzsqVar = this.zzv;
            if (zzsqVar != null) {
                zzsqVar.zzk();
                this.zza.zzb++;
                zzst zzstVar = this.zzC;
                if (zzstVar == null) {
                    throw null;
                }
                zzaj(zzstVar.zza);
            }
            this.zzv = null;
            this.zzr = null;
            this.zzo = null;
            zzaN();
        } catch (Throwable th) {
            this.zzv = null;
            this.zzr = null;
            this.zzo = null;
            zzaN();
            throw th;
        }
    }

    public final boolean zzaI() throws zzsw, zzhz {
        boolean zZzat = zzat();
        if (zZzat) {
            zzaz();
        }
        return zZzat;
    }

    public boolean zzaJ() {
        int i = this.zzX;
        if (i == 3 || ((this.zzE && !this.zzaa) || (this.zzF && this.zzZ))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            zzbl();
            return false;
        } catch (zzhz e) {
            zzds.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public boolean zzaK() {
        return true;
    }

    public final long zzaL() {
        return this.zzal;
    }

    @CallSuper
    public void zzaM() {
        zzbe();
        zzbf();
        zzav();
        this.zzL = -9223372036854775807L;
        this.zzZ = false;
        this.zzJ = -9223372036854775807L;
        this.zzY = false;
        this.zzG = false;
        this.zzH = false;
        this.zzP = false;
        this.zzQ = false;
        this.zzW = 0;
        this.zzX = 0;
        this.zzV = this.zzU ? 1 : 0;
        this.zzak = false;
        this.zzal = 0L;
    }

    @CallSuper
    public final void zzaN() {
        zzaM();
        this.zzA = null;
        this.zzC = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = false;
        this.zzaa = false;
        this.zzz = -1.0f;
        this.zzD = 0;
        this.zzE = false;
        this.zzF = false;
        this.zzI = false;
        this.zzK = false;
        this.zzU = false;
        this.zzV = 0;
    }

    public zzss zzaO(Throwable th, @Nullable zzst zzstVar) {
        return new zzss(th, zzstVar);
    }

    public boolean zzaP(zzu zzuVar) throws zzhz {
        return true;
    }

    public void zzaQ(zzhg zzhgVar) throws zzhz {
    }

    public int zzaR(zzhg zzhgVar) {
        return 0;
    }

    public boolean zzaS(zzhg zzhgVar) {
        return false;
    }

    public final long zzaT() {
        return this.zzac;
    }

    @CallSuper
    public void zzaU(long j) {
        this.zzah = j;
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || j < ((zzsy) arrayDeque.peek()).zzb) {
                return;
            }
            zzsy zzsyVar = (zzsy) arrayDeque.poll();
            zzsyVar.getClass();
            zzbk(zzsyVar);
            zzao();
        }
    }

    public final boolean zzaV() {
        if (this.zzm == null) {
            return false;
        }
        if (zzQ() || zzbd()) {
            return true;
        }
        return this.zzL != -9223372036854775807L && zzL().zzb() < this.zzL;
    }

    public final float zzaW() {
        return this.zzt;
    }

    @Nullable
    public final zzlk zzaX() {
        return this.zzq;
    }

    public final boolean zzaY() throws zzhz {
        return zzbg(this.zzw);
    }

    public final long zzaZ() {
        return this.zzag.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final int zzaa(zzu zzuVar) throws zzhz {
        try {
            return zzab(this.zzd, zzuVar);
        } catch (zztd e) {
            throw zzN(e, zzuVar, false, 4002);
        }
    }

    public abstract int zzab(zztb zztbVar, zzu zzuVar) throws zztd;

    public abstract List zzac(zztb zztbVar, zzu zzuVar, boolean z) throws zztd;

    public boolean zzad(zzu zzuVar) {
        return false;
    }

    public abstract zzsn zzae(zzst zzstVar, zzu zzuVar, @Nullable MediaCrypto mediaCrypto, float f);

    public zzhs zzaf(zzst zzstVar, zzu zzuVar, zzu zzuVar2) {
        throw null;
    }

    public long zzag(long j, long j2, boolean z) {
        return super.zzT(j, j2);
    }

    public float zzah(float f, zzu zzuVar, zzu[] zzuVarArr) {
        throw null;
    }

    public void zzai(String str, zzsn zzsnVar, long j, long j2) {
        throw null;
    }

    public void zzaj(String str) {
        throw null;
    }

    public void zzak(Exception exc) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    @androidx.annotation.Nullable
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zzhs zzal(com.google.android.gms.internal.ads.zzkh r14) throws com.google.android.gms.internal.ads.zzhz {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsz.zzal(com.google.android.gms.internal.ads.zzkh):com.google.android.gms.internal.ads.zzhs");
    }

    public void zzam(zzu zzuVar, @Nullable MediaFormat mediaFormat) throws zzhz {
        throw null;
    }

    public void zzao() {
    }

    public abstract boolean zzap(long j, long j2, @Nullable zzsq zzsqVar, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzu zzuVar) throws zzhz;

    public void zzaq() throws zzhz {
        throw null;
    }

    public void zzar(zzhg zzhgVar) throws zzhz {
        throw null;
    }

    public final void zzay() {
        this.zzaj = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01eb A[Catch: Exception -> 0x0106, TryCatch #3 {Exception -> 0x0106, blocks: (B:57:0x00dd, B:59:0x00e7, B:61:0x00f8, B:67:0x0138, B:69:0x0149, B:71:0x0177, B:73:0x0182, B:77:0x018e, B:79:0x0197, B:81:0x019f, B:83:0x01a7, B:85:0x01af, B:87:0x01b7, B:89:0x01bf, B:101:0x01e5, B:103:0x01eb, B:105:0x01f2, B:106:0x0200, B:93:0x01cb, B:95:0x01d5, B:97:0x01df), top: B:146:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0248 A[Catch: zzsw -> 0x0084, TryCatch #0 {zzsw -> 0x0084, blocks: (B:25:0x0057, B:27:0x005e, B:29:0x0062, B:31:0x0078, B:36:0x0089, B:40:0x0095, B:42:0x009d, B:44:0x00a1, B:46:0x00a5, B:48:0x00ae, B:121:0x022f, B:123:0x0248, B:125:0x0251, B:128:0x0258, B:129:0x025a, B:124:0x024b, B:131:0x025c, B:132:0x025d, B:134:0x0262, B:135:0x0263, B:136:0x026d, B:38:0x008c, B:39:0x0094, B:138:0x0270), top: B:142:0x0057, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024b A[Catch: zzsw -> 0x0084, TryCatch #0 {zzsw -> 0x0084, blocks: (B:25:0x0057, B:27:0x005e, B:29:0x0062, B:31:0x0078, B:36:0x0089, B:40:0x0095, B:42:0x009d, B:44:0x00a1, B:46:0x00a5, B:48:0x00ae, B:121:0x022f, B:123:0x0248, B:125:0x0251, B:128:0x0258, B:129:0x025a, B:124:0x024b, B:131:0x025c, B:132:0x025d, B:134:0x0262, B:135:0x0263, B:136:0x026d, B:38:0x008c, B:39:0x0094, B:138:0x0270), top: B:142:0x0057, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x021a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARN: Type inference failed for: r0v30, types: [com.google.android.gms.internal.ads.zzso] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.google.android.gms.internal.ads.zzsn] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzsz] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzaz() throws com.google.android.gms.internal.ads.zzsw, com.google.android.gms.internal.ads.zzhz {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsz.zzaz():void");
    }

    public final long zzba() {
        return this.zzag.zzc;
    }

    public final /* synthetic */ zzlk zzbc() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzln
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzlg
    public void zzx(int i, @Nullable Object obj) throws zzhz {
        if (i == 11) {
            zzlk zzlkVar = (zzlk) obj;
            zzlkVar.getClass();
            this.zzq = zzlkVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public void zzy(boolean z, boolean z2) throws zzhz {
        this.zza = new zzhr();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzhq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzz(com.google.android.gms.internal.ads.zzu[] r12, long r13, long r15, com.google.android.gms.internal.ads.zzup r17) throws com.google.android.gms.internal.ads.zzhz {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzsy r12 = r11.zzag
            long r0 = r12.zzd
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            com.google.android.gms.internal.ads.zzsy r4 = new com.google.android.gms.internal.ads.zzsy
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzbk(r4)
            boolean r12 = r11.zzaj
            if (r12 == 0) goto L56
            r11.zzao()
            return
        L24:
            java.util.ArrayDeque r12 = r11.zzk
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.zzab
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.zzah
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            com.google.android.gms.internal.ads.zzsy r4 = new com.google.android.gms.internal.ads.zzsy
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzbk(r4)
            com.google.android.gms.internal.ads.zzsy r12 = r11.zzag
            long r12 = r12.zzd
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.zzao()
        L56:
            return
        L57:
            com.google.android.gms.internal.ads.zzsy r0 = new com.google.android.gms.internal.ads.zzsy
            long r1 = r11.zzab
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsz.zzz(com.google.android.gms.internal.ads.zzu[], long, long, com.google.android.gms.internal.ads.zzup):void");
    }
}
