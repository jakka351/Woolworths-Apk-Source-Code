package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes5.dex */
final class zzjs extends zze implements zzik {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzda zzB;
    private final zzlz zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private zzls zzG;
    private zzlt zzH;
    private zzij zzI;
    private zzaw zzJ;
    private zzam zzK;

    @Nullable
    private Object zzL;

    @Nullable
    private Surface zzM;
    private int zzN;
    private zzeg zzO;
    private zzc zzP;
    private float zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private int zzU;
    private zzam zzV;
    private zzld zzW;
    private int zzX;
    private long zzY;
    private zzwi zzZ;
    final zzyn zzb;
    final zzaw zzc;
    private final zzde zze = new zzde(zzdb.zza);
    private final Context zzf;
    private final zzba zzg;
    private final zzll[] zzh;
    private final zzll[] zzi;
    private final zzym zzj;
    private final zzdl zzk;
    private final zzkd zzl;
    private final zzkf zzm;
    private final zzdr zzn;
    private final CopyOnWriteArraySet zzo;
    private final zzbc zzp;
    private final List zzq;
    private final boolean zzr;
    private final zzmd zzs;
    private final Looper zzt;
    private final zzyu zzu;
    private final zzdb zzv;
    private final zzir zzw;
    private final zzjq zzx;
    private final zzmb zzy;
    private final zzmc zzz;

    static {
        zzak.zzb("media3.exoplayer");
    }

    @SuppressLint
    public zzjs(zzii zziiVar, @Nullable zzba zzbaVar) {
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzeo.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.8.0] [");
            sb.append(str);
            sb.append("]");
            zzds.zzb("ExoPlayerImpl", sb.toString());
            this.zzf = zziiVar.zza.getApplicationContext();
            this.zzs = (zzmd) zziiVar.zzh.apply(zziiVar.zzb);
            this.zzU = zziiVar.zzj;
            this.zzP = zziiVar.zzk;
            this.zzN = zziiVar.zzl;
            this.zzR = false;
            this.zzA = zziiVar.zzq;
            zzir zzirVar = new zzir(this, null);
            this.zzw = zzirVar;
            this.zzx = new zzjq(null);
            zzll[] zzllVarArrZza = ((zzlq) zziiVar.zzc.zza()).zza(new Handler(zziiVar.zzi), zzirVar, zzirVar, zzirVar, zzirVar);
            this.zzh = zzllVarArrZza;
            int length = zzllVarArrZza.length;
            this.zzi = new zzll[2];
            int i = 0;
            while (true) {
                zzll[] zzllVarArr = this.zzi;
                int length2 = zzllVarArr.length;
                if (i >= 2) {
                    break;
                }
                zzll zzllVar = this.zzh[i];
                zzllVarArr[i] = null;
                i++;
            }
            zzym zzymVar = (zzym) zziiVar.zze.zza();
            this.zzj = zzymVar;
            zzyu zzyuVar = (zzyu) zziiVar.zzg.zza();
            this.zzu = zzyuVar;
            this.zzr = zziiVar.zzm;
            this.zzH = zziiVar.zzn;
            this.zzG = zziiVar.zzo;
            Looper looper = zziiVar.zzi;
            this.zzt = looper;
            zzdb zzdbVar = zziiVar.zzb;
            this.zzv = zzdbVar;
            this.zzg = zzbaVar;
            this.zzn = new zzdr(looper, zzdbVar, new zzdn() { // from class: com.google.android.gms.internal.ads.zzjp
                @Override // com.google.android.gms.internal.ads.zzdn
                public final /* synthetic */ void zza(Object obj, zzr zzrVar) {
                    this.zza.zzH((zzay) obj, zzrVar);
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzo = copyOnWriteArraySet;
            this.zzq = new ArrayList();
            this.zzZ = new zzwi(0);
            this.zzI = zzij.zza;
            int length3 = this.zzh.length;
            zzyn zzynVar = new zzyn(new zzlo[2], new zzyf[2], zzbm.zza, null);
            this.zzb = zzynVar;
            this.zzp = new zzbc();
            zzav zzavVar = new zzav();
            zzavVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzymVar.zzd();
            zzavVar.zzb(29, true);
            zzavVar.zzb(23, false);
            zzavVar.zzb(25, false);
            zzavVar.zzb(33, false);
            zzavVar.zzb(26, false);
            zzavVar.zzb(34, false);
            zzaw zzawVarZze = zzavVar.zze();
            this.zzc = zzawVarZze;
            zzav zzavVar2 = new zzav();
            zzavVar2.zzd(zzawVarZze);
            zzavVar2.zza(4);
            zzavVar2.zza(10);
            this.zzJ = zzavVar2.zze();
            this.zzk = zzdbVar.zzd(looper, null);
            zzkd zzkdVar = new zzkd() { // from class: com.google.android.gms.internal.ads.zzis
                @Override // com.google.android.gms.internal.ads.zzkd
                public final /* synthetic */ void zza(zzkc zzkcVar) {
                    this.zza.zzI(zzkcVar);
                }
            };
            this.zzl = zzkdVar;
            this.zzW = zzld.zza(zzynVar);
            this.zzs.zzx(zzbaVar, looper);
            final zzox zzoxVar = new zzox(zziiVar.zzu);
            zzkf zzkfVar = new zzkf(this.zzf, this.zzh, this.zzi, zzymVar, zzynVar, (zzkj) zziiVar.zzf.zza(), zzyuVar, 0, false, this.zzs, this.zzH, zziiVar.zzv, zziiVar.zzp, false, false, looper, zzdbVar, zzkdVar, zzoxVar, null, this.zzI, this.zzx);
            this.zzm = zzkfVar;
            Looper looperZzn = zzkfVar.zzn();
            this.zzQ = 1.0f;
            zzam zzamVar = zzam.zza;
            this.zzK = zzamVar;
            this.zzV = zzamVar;
            this.zzX = -1;
            int i2 = zzcn.zza;
            this.zzS = true;
            zzd(this.zzs);
            zzyuVar.zzf(new Handler(looper), this.zzs);
            copyOnWriteArraySet.add(this.zzw);
            if (Build.VERSION.SDK_INT >= 31) {
                final Context context = this.zzf;
                final boolean z = zziiVar.zzs;
                zzdbVar.zzd(zzkfVar.zzn(), null).zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzil
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzot zzotVarZza = zzot.zza(context);
                        if (zzotVarZza == null) {
                            zzds.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z) {
                            this.zzB(zzotVarZza);
                        }
                        zzoxVar.zzb(zzotVarZza.zzb());
                    }
                });
            }
            zzda zzdaVar = new zzda(0, looperZzn, looper, zzdbVar, new zzcz() { // from class: com.google.android.gms.internal.ads.zzjd
                @Override // com.google.android.gms.internal.ads.zzcz
                public final /* synthetic */ void zza(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    this.zza.zzJ(((Integer) obj).intValue(), iIntValue);
                }
            });
            this.zzB = zzdaVar;
            zzdaVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzji
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzK();
                }
            });
            new zzhl(zziiVar.zza, looperZzn, zziiVar.zzi, this.zzw, zzdbVar);
            this.zzy = new zzmb(zziiVar.zza, looperZzn, zzdbVar);
            this.zzz = new zzmc(zziiVar.zza, looperZzn, zzdbVar);
            int i3 = zzl.zza;
            zzbu zzbuVar = zzbu.zza;
            this.zzO = zzeg.zza;
            this.zzC = new zzlz(this, this.zzw, zzdbVar, zziiVar.zzr);
            zzkfVar.zzg(this.zzG);
            zzkfVar.zzi(this.zzP, false);
            zzam(1, 3, this.zzP);
            zzam(2, 4, Integer.valueOf(this.zzN));
            zzam(2, 5, 0);
            zzam(1, 9, Boolean.valueOf(this.zzR));
            zzam(6, 8, this.zzx);
            zzam(-1, 16, Integer.valueOf(this.zzU));
            this.zze.zza();
        } catch (Throwable th) {
            this.zze.zza();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzX, reason: merged with bridge method [inline-methods] */
    public final void zzN(@Nullable zzhz zzhzVar) {
        zzld zzldVar = this.zzW;
        zzld zzldVarZzh = zzldVar.zzh(zzldVar.zzb);
        zzldVarZzh.zzq = zzldVarZzh.zzs;
        zzldVarZzh.zzr = 0L;
        zzld zzldVarZzae = zzae(zzldVarZzh, 1);
        if (zzhzVar != null) {
            zzldVarZzae = zzldVarZzae.zzf(zzhzVar);
        }
        this.zzD++;
        this.zzm.zzh();
        zzab(zzldVarZzae, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final int zzY(zzld zzldVar) {
        zzbe zzbeVar = zzldVar.zza;
        return zzbeVar.zzg() ? this.zzX : zzbeVar.zzo(zzldVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzZ(zzld zzldVar) {
        zzup zzupVar = zzldVar.zzb;
        if (!zzupVar.zzb()) {
            return zzeo.zzp(zzaa(zzldVar));
        }
        zzbe zzbeVar = zzldVar.zza;
        zzbeVar.zzo(zzupVar.zza, this.zzp);
        long j = zzldVar.zzc;
        if (j == -9223372036854775807L) {
            long j2 = zzbeVar.zzb(zzY(zzldVar), this.zza, 0L).zzl;
            return zzeo.zzp(0L);
        }
        return zzeo.zzp(j) + zzeo.zzp(0L);
    }

    private final long zzaa(zzld zzldVar) {
        zzbe zzbeVar = zzldVar.zza;
        if (zzbeVar.zzg()) {
            return zzeo.zzq(this.zzY);
        }
        long j = zzldVar.zzs;
        zzup zzupVar = zzldVar.zzb;
        if (zzupVar.zzb()) {
            return j;
        }
        zzag(zzbeVar, zzupVar, j);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0470 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x047a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0497 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0285  */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzab(final com.google.android.gms.internal.ads.zzld r33, final int r34, boolean r35, int r36, long r37, int r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjs.zzab(com.google.android.gms.internal.ads.zzld, int, boolean, int, long, int, boolean):void");
    }

    private static long zzac(zzld zzldVar) {
        zzbd zzbdVar = new zzbd();
        zzbc zzbcVar = new zzbc();
        zzbe zzbeVar = zzldVar.zza;
        zzbeVar.zzo(zzldVar.zzb.zza, zzbcVar);
        long j = zzldVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzbeVar.zzb(zzbcVar.zzc, zzbdVar, 0L).zzl;
        return 0L;
    }

    private final zzld zzad(zzld zzldVar, zzbe zzbeVar, @Nullable Pair pair) {
        zzghc.zza(zzbeVar.zzg() || pair != null);
        zzbe zzbeVar2 = zzldVar.zza;
        long jZzZ = zzZ(zzldVar);
        zzld zzldVarZzd = zzldVar.zzd(zzbeVar);
        if (zzbeVar.zzg()) {
            zzup zzupVarZzb = zzld.zzb();
            long jZzq = zzeo.zzq(this.zzY);
            zzld zzldVarZzh = zzldVarZzd.zzc(zzupVarZzb, jZzq, jZzq, jZzq, 0L, zzwq.zza, this.zzb, zzgjz.zzi()).zzh(zzupVarZzb);
            zzldVarZzh.zzq = zzldVarZzh.zzs;
            return zzldVarZzh;
        }
        zzup zzupVar = zzldVarZzd.zzb;
        Object obj = zzupVar.zza;
        String str = zzeo.zza;
        boolean zEquals = obj.equals(pair.first);
        zzup zzupVar2 = !zEquals ? new zzup(pair.first, -1L) : zzupVar;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzq2 = zzeo.zzq(jZzZ);
        if (!zzbeVar2.zzg()) {
            zzbeVar2.zzo(obj, this.zzp);
        }
        if (!zEquals || jLongValue < jZzq2) {
            zzup zzupVar3 = zzupVar2;
            zzghc.zzh(!zzupVar3.zzb());
            zzld zzldVarZzh2 = zzldVarZzd.zzc(zzupVar3, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? zzwq.zza : zzldVarZzd.zzh, !zEquals ? this.zzb : zzldVarZzd.zzi, !zEquals ? zzgjz.zzi() : zzldVarZzd.zzj).zzh(zzupVar3);
            zzldVarZzh2.zzq = jLongValue;
            return zzldVarZzh2;
        }
        if (jLongValue != jZzq2) {
            zzup zzupVar4 = zzupVar2;
            zzghc.zzh(!zzupVar4.zzb());
            long jMax = Math.max(0L, zzldVarZzd.zzr - (jLongValue - jZzq2));
            long j = zzldVarZzd.zzq;
            if (zzldVarZzd.zzk.equals(zzupVar)) {
                j = jLongValue + jMax;
            }
            zzld zzldVarZzc = zzldVarZzd.zzc(zzupVar4, jLongValue, jLongValue, jLongValue, jMax, zzldVarZzd.zzh, zzldVarZzd.zzi, zzldVarZzd.zzj);
            zzldVarZzc.zzq = j;
            return zzldVarZzc;
        }
        int iZze = zzbeVar.zze(zzldVarZzd.zzk.zza);
        if (iZze != -1) {
            zzbc zzbcVar = this.zzp;
            if (zzbeVar.zzd(iZze, zzbcVar, false).zzc == zzbeVar.zzo(zzupVar2.zza, zzbcVar).zzc) {
                return zzldVarZzd;
            }
        }
        Object obj2 = zzupVar2.zza;
        zzbc zzbcVar2 = this.zzp;
        zzbeVar.zzo(obj2, zzbcVar2);
        long jZzh = zzupVar2.zzb() ? zzbcVar2.zzh(zzupVar2.zzb, zzupVar2.zzc) : zzbcVar2.zzd;
        zzup zzupVar5 = zzupVar2;
        zzld zzldVarZzh3 = zzldVarZzd.zzc(zzupVar5, zzldVarZzd.zzs, zzldVarZzd.zzs, zzldVarZzd.zzd, jZzh - zzldVarZzd.zzs, zzldVarZzd.zzh, zzldVarZzd.zzi, zzldVarZzd.zzj).zzh(zzupVar5);
        zzldVarZzh3.zzq = jZzh;
        return zzldVarZzh3;
    }

    private static zzld zzae(zzld zzldVar, int i) {
        zzld zzldVarZze = zzldVar.zze(i);
        return (i == 1 || i == 4) ? zzldVarZze.zzg(false) : zzldVarZze;
    }

    @Nullable
    private final Pair zzaf(zzbe zzbeVar, int i, long j) {
        if (zzbeVar.zzg()) {
            this.zzX = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzY = j;
            return null;
        }
        if (i == -1 || i >= zzbeVar.zza()) {
            i = zzbeVar.zzk(false);
            long j2 = zzbeVar.zzb(i, this.zza, 0L).zzl;
            j = zzeo.zzp(0L);
        }
        return zzbeVar.zzm(this.zza, this.zzp, i, zzeo.zzq(j));
    }

    private final long zzag(zzbe zzbeVar, zzup zzupVar, long j) {
        zzbeVar.zzo(zzupVar.zza, this.zzp);
        return j;
    }

    private final zzlh zzah(zzlg zzlgVar) {
        int iZzY = zzY(this.zzW);
        zzbe zzbeVar = this.zzW.zza;
        if (iZzY == -1) {
            iZzY = 0;
        }
        zzdb zzdbVar = this.zzv;
        zzkf zzkfVar = this.zzm;
        return new zzlh(zzkfVar, zzlgVar, zzbeVar, iZzY, zzdbVar, zzkfVar.zzn());
    }

    private final void zzai(@Nullable Object obj) {
        Object obj2 = this.zzL;
        boolean z = false;
        if (obj2 != null && obj2 != obj) {
            z = true;
        }
        boolean zZzl = this.zzm.zzl(obj, z ? this.zzA : -9223372036854775807L);
        if (z) {
            Object obj3 = this.zzL;
            Surface surface = this.zzM;
            if (obj3 == surface) {
                surface.release();
                this.zzM = null;
            }
        }
        this.zzL = obj;
        if (zZzl) {
            return;
        }
        zzN(zzhz.zzc(new zzkg(3), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final void zzQ(final int i, final int i2) {
        if (i == this.zzO.zza() && i2 == this.zzO.zzb()) {
            return;
        }
        this.zzO = new zzeg(i, i2);
        zzdr zzdrVar = this.zzn;
        zzdrVar.zzd(24, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjf
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                int i3 = zzjs.zzd;
                ((zzay) obj).zzu(i, i2);
            }
        });
        zzdrVar.zze();
        zzam(2, 14, new zzeg(i, i2));
    }

    private final void zzak() {
        int iZzg = zzg();
        if (iZzg != 2 && iZzg != 3) {
            this.zzy.zza(false);
            this.zzz.zza(false);
        } else {
            zzal();
            boolean z = this.zzW.zzp;
            this.zzy.zza(zzj());
            this.zzz.zza(zzj());
        }
    }

    private final void zzal() {
        this.zze.zzd();
        Looper looper = this.zzt;
        if (Thread.currentThread() != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = zzeo.zza;
            Locale locale = Locale.US;
            String strJ = YU.a.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.zzS) {
                throw new IllegalStateException(strJ);
            }
            zzds.zzd("ExoPlayerImpl", strJ, this.zzT ? null : new IllegalStateException());
            this.zzT = true;
        }
    }

    private final void zzam(int i, int i2, @Nullable Object obj) {
        zzll[] zzllVarArr = this.zzh;
        int length = zzllVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzll zzllVar = zzllVarArr[i3];
            if (i == -1 || zzllVar.zza() == i) {
                zzlh zzlhVarZzah = zzah(zzllVar);
                zzlhVarZzah.zzb(i2);
                zzlhVarZzah.zzd(obj);
                zzlhVarZzah.zzg();
            }
        }
        zzll[] zzllVarArr2 = this.zzi;
        int length2 = zzllVarArr2.length;
        for (int i4 = 0; i4 < 2; i4++) {
            zzll zzllVar2 = zzllVarArr2[i4];
            if (zzllVar2 != null && (i == -1 || zzllVar2.zza() == i)) {
                zzlh zzlhVarZzah2 = zzah(zzllVar2);
                zzlhVarZzah2.zzb(i2);
                zzlhVarZzah2.zzd(obj);
                zzlhVarZzah2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzA(@Nullable Surface surface) {
        zzal();
        zzai(surface);
        int i = surface == null ? 0 : -1;
        zzQ(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzB(zzmg zzmgVar) {
        this.zzs.zzv(zzmgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzC(zzmg zzmgVar) {
        zzal();
        this.zzs.zzw(zzmgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final int zzD() {
        zzal();
        int length = this.zzh.length;
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    @Override // com.google.android.gms.internal.ads.zzik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzE(com.google.android.gms.internal.ads.zzur r14) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjs.zzE(com.google.android.gms.internal.ads.zzur):void");
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzF() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzeo.zza;
        String strZza = zzak.zza();
        StringBuilder sb = new StringBuilder(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.a(String.valueOf(hexString).length(), 33, String.valueOf(str).length(), 3, String.valueOf(strZza).length()) + 1);
        androidx.constraintlayout.core.state.a.B(sb, "Release ", hexString, " [AndroidXMedia3/1.8.0] [", str);
        sb.append("] [");
        sb.append(strZza);
        sb.append("]");
        zzds.zzb("ExoPlayerImpl", sb.toString());
        zzal();
        this.zzy.zza(false);
        this.zzz.zza(false);
        this.zzC.zzv();
        if (!this.zzm.zzm()) {
            zzdr zzdrVar = this.zzn;
            zzdrVar.zzd(10, zzjj.zza);
            zzdrVar.zze();
        }
        this.zzn.zzf();
        this.zzk.zzl(null);
        zzyu zzyuVar = this.zzu;
        zzmd zzmdVar = this.zzs;
        zzyuVar.zzg(zzmdVar);
        zzld zzldVar = this.zzW;
        boolean z = zzldVar.zzp;
        zzld zzldVarZzae = zzae(zzldVar, 1);
        this.zzW = zzldVarZzae;
        zzld zzldVarZzh = zzldVarZzae.zzh(zzldVarZzae.zzb);
        this.zzW = zzldVarZzh;
        zzldVarZzh.zzq = zzldVarZzh.zzs;
        this.zzW.zzr = 0L;
        zzmdVar.zzy();
        Surface surface = this.zzM;
        if (surface != null) {
            surface.release();
            this.zzM = null;
        }
        int i = zzcn.zza;
    }

    @Nullable
    public final zzhz zzG() {
        zzal();
        return this.zzW.zzf;
    }

    public final /* synthetic */ void zzH(zzay zzayVar, zzr zzrVar) {
        zzayVar.zza(this.zzg, new zzax(zzrVar));
    }

    public final /* synthetic */ void zzI(final zzkc zzkcVar) {
        this.zzk.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzM(zzkcVar);
            }
        });
    }

    public final /* synthetic */ void zzJ(int i, final int i2) {
        zzal();
        Integer numValueOf = Integer.valueOf(i2);
        zzam(1, 10, numValueOf);
        zzam(2, 10, numValueOf);
        zzdm zzdmVar = new zzdm() { // from class: com.google.android.gms.internal.ads.zzjg
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                int i3 = zzjs.zzd;
                ((zzay) obj).zzq(i2);
            }
        };
        zzdr zzdrVar = this.zzn;
        zzdrVar.zzd(21, zzdmVar);
        zzdrVar.zze();
    }

    public final /* synthetic */ void zzK() {
        String str = zzeo.zza;
        this.zzB.zzb(Integer.valueOf(zzca.zza(this.zzf).generateAudioSessionId()));
    }

    public final /* synthetic */ void zzL(zzay zzayVar) {
        zzayVar.zzg(this.zzJ);
    }

    public final /* synthetic */ void zzM(zzkc zzkcVar) {
        boolean z;
        int i = this.zzD - zzkcVar.zzb;
        this.zzD = i;
        boolean z2 = true;
        if (zzkcVar.zzc) {
            this.zzE = zzkcVar.zzd;
            this.zzF = true;
        }
        if (i == 0) {
            zzbe zzbeVar = zzkcVar.zza.zza;
            if (!this.zzW.zza.zzg() && zzbeVar.zzg()) {
                this.zzX = -1;
                this.zzY = 0L;
            }
            if (!zzbeVar.zzg()) {
                List listZzw = ((zzlj) zzbeVar).zzw();
                int size = listZzw.size();
                List list = this.zzq;
                zzghc.zzh(size == list.size());
                for (int i2 = 0; i2 < listZzw.size(); i2++) {
                    ((zzjr) list.get(i2)).zzc((zzbe) listZzw.get(i2));
                }
            }
            long j = -9223372036854775807L;
            if (this.zzF) {
                if (zzkcVar.zza.zzb.equals(this.zzW.zzb) && zzkcVar.zza.zzd == this.zzW.zzs) {
                    z2 = false;
                }
                if (z2) {
                    if (zzbeVar.zzg() || zzkcVar.zza.zzb.zzb()) {
                        j = zzkcVar.zza.zzd;
                    } else {
                        zzld zzldVar = zzkcVar.zza;
                        zzup zzupVar = zzldVar.zzb;
                        long j2 = zzldVar.zzd;
                        zzag(zzbeVar, zzupVar, j2);
                        j = j2;
                    }
                }
                z = z2;
            } else {
                z = false;
            }
            this.zzF = false;
            zzab(zzkcVar.zza, 1, z, this.zzE, j, -1, false);
        }
    }

    public final /* synthetic */ void zzO(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzai(surface);
        this.zzM = surface;
    }

    public final /* synthetic */ void zzP(Object obj) {
        zzai(null);
    }

    public final /* synthetic */ zzdr zzR() {
        return this.zzn;
    }

    public final /* synthetic */ zzmd zzS() {
        return this.zzs;
    }

    public final /* synthetic */ zzda zzT() {
        return this.zzB;
    }

    public final /* synthetic */ Object zzU() {
        return this.zzL;
    }

    public final /* synthetic */ boolean zzV() {
        return this.zzR;
    }

    public final /* synthetic */ void zzW(boolean z) {
        this.zzR = z;
    }

    @Override // com.google.android.gms.internal.ads.zze
    public final void zzb(int i, long j, int i2, boolean z) {
        zzal();
        if (i == -1) {
            return;
        }
        zzghc.zza(i >= 0);
        zzbe zzbeVar = this.zzW.zza;
        if (zzbeVar.zzg() || i < zzbeVar.zza()) {
            this.zzs.zzA();
            this.zzD++;
            if (zzv()) {
                zzds.zzc("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzkc zzkcVar = new zzkc(this.zzW);
                zzkcVar.zza(1);
                this.zzl.zza(zzkcVar);
                return;
            }
            zzld zzldVarZzae = this.zzW;
            int i3 = zzldVarZzae.zze;
            if (i3 == 3 || (i3 == 4 && !zzbeVar.zzg())) {
                zzldVarZzae = zzae(this.zzW, 2);
            }
            int iZzq = zzq();
            zzld zzldVarZzad = zzad(zzldVarZzae, zzbeVar, zzaf(zzbeVar, i, j));
            this.zzm.zzf(zzbeVar, i, zzeo.zzq(j));
            zzab(zzldVarZzad, 0, true, 1, zzaa(zzldVarZzad), iZzq, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final Looper zzc() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzd(zzay zzayVar) {
        zzayVar.getClass();
        this.zzn.zzb(zzayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zze(zzay zzayVar) {
        zzal();
        this.zzn.zzc(zzayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzf() {
        zzal();
        zzld zzldVar = this.zzW;
        if (zzldVar.zze != 1) {
            return;
        }
        zzld zzldVarZzf = zzldVar.zzf(null);
        zzld zzldVarZzae = zzae(zzldVarZzf, true != zzldVarZzf.zza.zzg() ? 2 : 4);
        this.zzD++;
        this.zzm.zzd();
        zzab(zzldVarZzae, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzg() {
        zzal();
        return this.zzW.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzh() {
        zzal();
        return this.zzW.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzi(boolean z) {
        zzal();
        zzld zzldVar = this.zzW;
        int i = zzldVar.zzn;
        int i2 = 0;
        if (i == 1) {
            if (z) {
                i = 1;
            } else {
                i = 1;
                i2 = 1;
            }
        }
        if (zzldVar.zzl == z && i == i2 && zzldVar.zzm == 1) {
            return;
        }
        this.zzD++;
        zzld zzldVarZzi = zzldVar.zzi(z, 1, i2);
        this.zzm.zze(z, 1, i2);
        zzab(zzldVarZzi, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final boolean zzj() {
        zzal();
        return this.zzW.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzk() {
        zzal();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final boolean zzl() {
        zzal();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzm() {
        zzal();
        zzN(null);
        new zzcn(zzgjz.zzi(), this.zzW.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final zzbm zzn() {
        zzal();
        return this.zzW.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final zzbe zzo() {
        zzal();
        return this.zzW.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzp() {
        zzal();
        if (this.zzW.zza.zzg()) {
            return 0;
        }
        zzld zzldVar = this.zzW;
        return zzldVar.zza.zze(zzldVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzq() {
        zzal();
        int iZzY = zzY(this.zzW);
        if (iZzY == -1) {
            return 0;
        }
        return iZzY;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzr() {
        zzal();
        if (!zzv()) {
            zzbe zzbeVarZzo = zzo();
            if (zzbeVarZzo.zzg()) {
                return -9223372036854775807L;
            }
            return zzeo.zzp(zzbeVarZzo.zzb(zzq(), this.zza, 0L).zzm);
        }
        zzld zzldVar = this.zzW;
        zzup zzupVar = zzldVar.zzb;
        zzbe zzbeVar = zzldVar.zza;
        Object obj = zzupVar.zza;
        zzbc zzbcVar = this.zzp;
        zzbeVar.zzo(obj, zzbcVar);
        return zzeo.zzp(zzbcVar.zzh(zzupVar.zzb, zzupVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzs() {
        zzal();
        return zzeo.zzp(zzaa(this.zzW));
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzt() {
        zzal();
        if (zzv()) {
            zzld zzldVar = this.zzW;
            return zzldVar.zzk.equals(zzldVar.zzb) ? zzeo.zzp(this.zzW.zzq) : zzr();
        }
        zzal();
        if (this.zzW.zza.zzg()) {
            return this.zzY;
        }
        zzld zzldVar2 = this.zzW;
        long j = 0;
        if (zzldVar2.zzk.zzd != zzldVar2.zzb.zzd) {
            return zzeo.zzp(zzldVar2.zza.zzb(zzq(), this.zza, 0L).zzm);
        }
        long j2 = zzldVar2.zzq;
        if (this.zzW.zzk.zzb()) {
            zzld zzldVar3 = this.zzW;
            zzldVar3.zza.zzo(zzldVar3.zzk.zza, this.zzp).zzc(this.zzW.zzk.zzb);
        } else {
            j = j2;
        }
        zzld zzldVar4 = this.zzW;
        zzag(zzldVar4.zza, zzldVar4.zzk, j);
        return zzeo.zzp(j);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzu() {
        zzal();
        return zzeo.zzp(this.zzW.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final boolean zzv() {
        zzal();
        return this.zzW.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzw() {
        zzal();
        if (zzv()) {
            return this.zzW.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzx() {
        zzal();
        if (zzv()) {
            return this.zzW.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzy() {
        zzal();
        return zzZ(this.zzW);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzz(float f) {
        zzal();
        String str = zzeo.zza;
        final float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(f, 1.0f));
        if (this.zzQ == fMax) {
            return;
        }
        this.zzQ = fMax;
        this.zzm.zzj(fMax);
        zzdr zzdrVar = this.zzn;
        zzdrVar.zzd(22, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjk
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                int i = zzjs.zzd;
                ((zzay) obj).zzr(fMax);
            }
        });
        zzdrVar.zze();
    }
}
