package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public final class zzyd extends zzyj implements zzlm {
    public static final /* synthetic */ int zzb = 0;
    private static final zzglj zzc = zzglj.zzc(zzxj.zza);

    @Nullable
    public final Context zza;
    private final Object zzd;

    @GuardedBy
    private zzxo zze;

    @Nullable
    @GuardedBy
    private Thread zzf;

    @Nullable
    private zzxs zzg;
    private zzc zzh;
    private Boolean zzi;
    private final zzww zzj;

    public zzyd(Context context) {
        zzww zzwwVar = new zzww();
        zzxo zzxoVar = zzxo.zzJ;
        this.zzd = new Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzwwVar;
        if (zzxoVar != null) {
            this.zze = zzxoVar;
        } else {
            zzxn zzxnVar = new zzxn(zzxoVar, bArr);
            zzxnVar.zzx((zzbk) zzxoVar);
            this.zze = new zzxo(zzxnVar, bArr);
        }
        this.zzh = zzc.zza;
        if (this.zze.zzU && context == null) {
            zzds.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Nullable
    public static String zzi(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int zzj(zzu zzuVar, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzuVar.zzd)) {
            return 4;
        }
        String strZzi = zzi(str);
        String strZzi2 = zzi(zzuVar.zzd);
        if (strZzi2 == null || strZzi == null) {
            return (z && strZzi2 == null) ? 1 : 0;
        }
        if (strZzi2.startsWith(strZzi) || strZzi.startsWith(strZzi2)) {
            return 3;
        }
        String str2 = zzeo.zza;
        return strZzi2.split("-", 2)[0].equals(strZzi.split("-", 2)[0]) ? 2 : 0;
    }

    public static /* synthetic */ int zzm(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ int zzn(com.google.android.gms.internal.ads.zzu r5, com.google.android.gms.internal.ads.zzgjz r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L2a
            r2 = r0
        L9:
            java.util.List r3 = r5.zzc
            int r4 = r3.size()
            if (r2 >= r4) goto L27
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.zzw r3 = (com.google.android.gms.internal.ads.zzw) r3
            java.lang.String r3 = r3.zzb
            java.lang.Object r4 = r6.get(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            return r1
        L24:
            int r2 = r2 + 1
            goto L9
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            r5 = 2147483647(0x7fffffff, float:NaN)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyd.zzn(com.google.android.gms.internal.ads.zzu, com.google.android.gms.internal.ads.zzgjz):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final void zzl() {
        boolean z;
        zzxs zzxsVar;
        synchronized (this.zzd) {
            try {
                z = false;
                if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzxsVar = this.zzg) != null && zzxsVar.zza()) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            zzs();
        }
    }

    private static void zzv(zzwq zzwqVar, zzbk zzbkVar, Map map) {
        for (int i = 0; i < zzwqVar.zzb; i++) {
            if (((zzbg) zzbkVar.zzH.get(zzwqVar.zza(i))) != null) {
                throw null;
            }
        }
    }

    @Nullable
    private static final Pair zzw(int i, zzyi zzyiVar, int[][][] iArr, zzxu zzxuVar, Comparator comparator) {
        RandomAccess randomAccessZzj;
        zzyi zzyiVar2 = zzyiVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == zzyiVar2.zza(i2)) {
                zzwq zzwqVarZzb = zzyiVar2.zzb(i2);
                for (int i3 = 0; i3 < zzwqVarZzb.zzb; i3++) {
                    zzbf zzbfVarZza = zzwqVarZzb.zza(i3);
                    List listZza = zzxuVar.zza(i2, zzbfVarZza, iArr[i2][i3]);
                    int i4 = zzbfVarZza.zza;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        zzxv zzxvVar = (zzxv) listZza.get(i5);
                        int iZza = zzxvVar.zza();
                        if (!zArr[i5] && iZza != 0) {
                            if (iZza == 1) {
                                randomAccessZzj = zzgjz.zzj(zzxvVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzxvVar);
                                for (int i7 = i6; i7 < i4; i7++) {
                                    zzxv zzxvVar2 = (zzxv) listZza.get(i7);
                                    if (zzxvVar2.zza() == 2 && zzxvVar.zzc(zzxvVar2)) {
                                        arrayList2.add(zzxvVar2);
                                        zArr[i7] = true;
                                    }
                                }
                                randomAccessZzj = arrayList2;
                            }
                            arrayList.add(randomAccessZzj);
                        }
                        i5 = i6;
                    }
                }
            }
            i2++;
            zzyiVar2 = zzyiVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((zzxv) list.get(i8)).zzc;
        }
        zzxv zzxvVar3 = (zzxv) list.get(0);
        return Pair.create(new zzye(zzxvVar3.zzb, iArr2, 0), Integer.valueOf(zzxvVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zza(zzll zzllVar) {
        synchronized (this.zzd) {
            boolean z = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final void zzb() {
        zzxs zzxsVar;
        synchronized (this.zzd) {
            try {
                Thread thread = this.zzf;
                if (thread != null) {
                    zzghc.zzi(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzxsVar = this.zzg) != null) {
            zzxsVar.zze();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzxo zzc() {
        zzxo zzxoVar;
        synchronized (this.zzd) {
            zzxoVar = this.zze;
        }
        return zzxoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final void zze(zzc zzcVar) {
        if (this.zzh.equals(zzcVar)) {
            return;
        }
        this.zzh = zzcVar;
        zzl();
    }

    public final void zzf(zzxn zzxnVar) {
        boolean zEquals;
        zzxo zzxoVar = new zzxo(zzxnVar, null);
        synchronized (this.zzd) {
            zEquals = this.zze.equals(zzxoVar);
            this.zze = zzxoVar;
        }
        if (zEquals) {
            return;
        }
        if (zzxoVar.zzU && this.zza == null) {
            zzds.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzym
    @Nullable
    public final zzlm zzg() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final Pair zzh(zzyi zzyiVar, int[][][] iArr, final int[] iArr2, zzup zzupVar, zzbe zzbeVar) throws zzhz {
        final zzxo zzxoVar;
        int i;
        final boolean z;
        final String str;
        final String languageTag;
        int[] iArr3;
        int length;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        Context context3;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzxoVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzeo.zzN(context3));
        }
        if (zzxoVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzxs(this.zza, this, this.zzi);
        }
        int i2 = 2;
        zzye[] zzyeVarArr = new zzye[2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= 2) {
                z = false;
                break;
            }
            if (zzyiVar.zza(i4) == 2 && zzyiVar.zzb(i4).zzb > 0) {
                z = true;
                break;
            }
            i4++;
        }
        Pair pairZzw = zzw(1, zzyiVar, iArr, new zzxu() { // from class: com.google.android.gms.internal.ads.zzxf
            @Override // com.google.android.gms.internal.ads.zzxu
            public final /* synthetic */ List zza(int i5, zzbf zzbfVar, int[] iArr4) {
                final zzyd zzydVar = this.zza;
                final zzxo zzxoVar2 = zzxoVar;
                zzghd zzghdVar = new zzghd() { // from class: com.google.android.gms.internal.ads.zzxi
                    @Override // com.google.android.gms.internal.ads.zzghd
                    public final /* synthetic */ boolean zza(Object obj) {
                        return zzydVar.zzk(zzxoVar2, (zzu) obj);
                    }
                };
                int i6 = iArr2[i5];
                int i7 = zzgjz.zzd;
                zzgjw zzgjwVar = new zzgjw();
                for (int i8 = 0; i8 < zzbfVar.zza; i8++) {
                    zzgjwVar.zzf(new zzxa(i5, zzbfVar, i8, zzxoVar2, iArr4[i8], z, zzghdVar, i6));
                }
                return zzgjwVar.zzi();
            }
        }, zzxb.zza);
        if (pairZzw != null) {
            zzyeVarArr[((Integer) pairZzw.second).intValue()] = (zzye) pairZzw.first;
        }
        if (pairZzw == null) {
            str = null;
        } else {
            Object obj = pairZzw.first;
            str = ((zzye) obj).zza.zza(((zzye) obj).zzb[0]).zzd;
        }
        int i5 = zzxoVar.zzw.zzb;
        final Point pointZzP = (!zzxoVar.zzk || (context2 = this.zza) == null) ? null : zzeo.zzP(context2);
        Pair pairZzw2 = zzw(2, zzyiVar, iArr, new zzxu() { // from class: com.google.android.gms.internal.ads.zzxk
            /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
            @Override // com.google.android.gms.internal.ads.zzxu
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final /* synthetic */ java.util.List zza(int r18, com.google.android.gms.internal.ads.zzbf r19, int[] r20) {
                /*
                    Method dump skipped, instructions count: 207
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxk.zza(int, com.google.android.gms.internal.ads.zzbf, int[]):java.util.List");
            }
        }, zzxe.zza);
        int i6 = 4;
        Pair pairZzw3 = pairZzw2 == null ? zzw(4, zzyiVar, iArr, new zzxu() { // from class: com.google.android.gms.internal.ads.zzxh
            @Override // com.google.android.gms.internal.ads.zzxu
            public final /* synthetic */ List zza(int i7, zzbf zzbfVar, int[] iArr4) {
                int i8 = zzyd.zzb;
                int i9 = zzgjz.zzd;
                zzgjw zzgjwVar = new zzgjw();
                for (int i10 = 0; i10 < zzbfVar.zza; i10++) {
                    zzgjwVar.zzf(new zzxl(i7, zzbfVar, i10, zzxoVar, iArr4[i10]));
                }
                return zzgjwVar.zzi();
            }
        }, zzxc.zza) : null;
        if (pairZzw3 != null) {
            zzyeVarArr[((Integer) pairZzw3.second).intValue()] = (zzye) pairZzw3.first;
        } else if (pairZzw2 != null) {
            zzyeVarArr[((Integer) pairZzw2.second).intValue()] = (zzye) pairZzw2.first;
        }
        if (!zzxoVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str2 = zzeo.zza;
            languageTag = locale.toLanguageTag();
        }
        int i7 = 3;
        Pair pairZzw4 = zzw(3, zzyiVar, iArr, new zzxu() { // from class: com.google.android.gms.internal.ads.zzxg
            @Override // com.google.android.gms.internal.ads.zzxu
            public final /* synthetic */ List zza(int i8, zzbf zzbfVar, int[] iArr4) {
                int i9 = zzyd.zzb;
                int i10 = zzgjz.zzd;
                zzgjw zzgjwVar = new zzgjw();
                for (int i11 = 0; i11 < zzbfVar.zza; i11++) {
                    zzgjwVar.zzf(new zzxt(i8, zzbfVar, i11, zzxoVar, iArr4[i11], str, languageTag));
                }
                return zzgjwVar.zzi();
            }
        }, zzxd.zza);
        if (pairZzw4 != null) {
            zzyeVarArr[((Integer) pairZzw4.second).intValue()] = (zzye) pairZzw4.first;
        }
        int i8 = 0;
        while (i8 < i2) {
            int iZza = zzyiVar.zza(i8);
            if (iZza != i2 && iZza != i && iZza != i7 && iZza != i6) {
                zzwq zzwqVarZzb = zzyiVar.zzb(i8);
                int[][] iArr4 = iArr[i8];
                int i9 = i3;
                int i10 = i9;
                zzbf zzbfVar = null;
                zzxm zzxmVar = null;
                while (i9 < zzwqVarZzb.zzb) {
                    zzbf zzbfVarZza = zzwqVarZzb.zza(i9);
                    int[] iArr5 = iArr4[i9];
                    zzxm zzxmVar2 = zzxmVar;
                    for (int i11 = i3; i11 < zzbfVarZza.zza; i11++) {
                        if (zzln.zzZ(iArr5[i11], zzxoVar.zzV)) {
                            zzxm zzxmVar3 = new zzxm(zzbfVarZza.zza(i11), iArr5[i11]);
                            if (zzxmVar2 == null || zzxmVar3.compareTo(zzxmVar2) > 0) {
                                zzbfVar = zzbfVarZza;
                                zzxmVar2 = zzxmVar3;
                                i10 = i11;
                            }
                        }
                    }
                    i9++;
                    zzxmVar = zzxmVar2;
                    i3 = 0;
                }
                zzyeVarArr[i8] = zzbfVar == null ? null : new zzye(zzbfVar, new int[]{i10}, 0);
            }
            i8++;
            i2 = 2;
            i3 = 0;
            i7 = 3;
            i = 1;
            i6 = 4;
        }
        HashMap map = new HashMap();
        int i12 = 2;
        for (int i13 = 0; i13 < 2; i13++) {
            zzv(zzyiVar.zzb(i13), zzxoVar, map);
        }
        zzv(zzyiVar.zze(), zzxoVar, map);
        for (int i14 = 0; i14 < 2; i14++) {
            if (((zzbg) map.get(Integer.valueOf(zzyiVar.zza(i14)))) != null) {
                throw null;
            }
        }
        int i15 = 0;
        while (i15 < i12) {
            zzwq zzwqVarZzb2 = zzyiVar.zzb(i15);
            if (zzxoVar.zzb(i15, zzwqVarZzb2)) {
                if (zzxoVar.zzc(i15, zzwqVarZzb2) != null) {
                    throw null;
                }
                zzyeVarArr[i15] = null;
            }
            i15++;
            i12 = 2;
        }
        int i16 = 0;
        while (i16 < i12) {
            int iZza2 = zzyiVar.zza(i16);
            if (zzxoVar.zza(i16) || zzxoVar.zzI.contains(Integer.valueOf(iZza2))) {
                zzyeVarArr[i16] = null;
            }
            i16++;
            i12 = 2;
        }
        zzww zzwwVar = this.zzj;
        zzyu zzyuVarZzt = zzt();
        zzgjz zzgjzVarZzd = zzwx.zzd(zzyeVarArr);
        int i17 = 2;
        zzyf[] zzyfVarArr = new zzyf[2];
        int i18 = 0;
        while (i18 < i17) {
            zzye zzyeVar = zzyeVarArr[i18];
            if (zzyeVar != null && (length = (iArr3 = zzyeVar.zzb).length) != 0) {
                zzyfVarArr[i18] = length == 1 ? new zzyg(zzyeVar.zza, iArr3[0], 0, 0, null) : zzwwVar.zza(zzyeVar.zza, iArr3, 0, zzyuVarZzt, (zzgjz) zzgjzVarZzd.get(i18));
            }
            i18++;
            i17 = 2;
        }
        zzlo[] zzloVarArr = new zzlo[i17];
        for (int i19 = 0; i19 < i17; i19++) {
            zzloVarArr[i19] = (zzxoVar.zza(i19) || zzxoVar.zzI.contains(Integer.valueOf(zzyiVar.zza(i19))) || (zzyiVar.zza(i19) != -2 && zzyfVarArr[i19] == null)) ? null : zzlo.zza;
        }
        return Pair.create(zzloVarArr, zzyfVarArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ boolean zzk(com.google.android.gms.internal.ads.zzxo r4, com.google.android.gms.internal.ads.zzu r5) {
        /*
            r3 = this;
            boolean r4 = r4.zzU
            r0 = 1
            if (r4 == 0) goto L83
            java.lang.Boolean r4 = r3.zzi
            if (r4 == 0) goto L11
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L10
            goto L11
        L10:
            return r0
        L11:
            int r4 = r5.zzG
            r1 = -1
            if (r4 == r1) goto L83
            r1 = 2
            if (r4 <= r1) goto L83
            java.lang.String r4 = r5.zzo
            r1 = 32
            if (r4 != 0) goto L20
            goto L5a
        L20:
            int r2 = r4.hashCode()
            switch(r2) {
                case -2123537834: goto L43;
                case 187078296: goto L3a;
                case 187078297: goto L31;
                case 1504578661: goto L28;
                default: goto L27;
            }
        L27:
            goto L5a
        L28:
            java.lang.String r2 = "audio/eac3"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L5a
            goto L4b
        L31:
            java.lang.String r2 = "audio/ac4"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L5a
            goto L4b
        L3a:
            java.lang.String r2 = "audio/ac3"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L5a
            goto L4b
        L43:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L5a
        L4b:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r1) goto L59
            com.google.android.gms.internal.ads.zzxs r4 = r3.zzg
            if (r4 == 0) goto L59
            boolean r4 = r4.zza()
            if (r4 != 0) goto L5a
        L59:
            return r0
        L5a:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            if (r4 < r1) goto L82
            com.google.android.gms.internal.ads.zzxs r4 = r3.zzg
            if (r4 == 0) goto L82
            boolean r1 = r4.zza()
            if (r1 == 0) goto L82
            boolean r4 = r4.zzb()
            if (r4 == 0) goto L82
            com.google.android.gms.internal.ads.zzxs r4 = r3.zzg
            boolean r4 = r4.zzc()
            if (r4 == 0) goto L82
            com.google.android.gms.internal.ads.zzxs r4 = r3.zzg
            com.google.android.gms.internal.ads.zzc r1 = r3.zzh
            boolean r4 = r4.zzd(r1, r5)
            if (r4 == 0) goto L82
            return r0
        L82:
            return r2
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyd.zzk(com.google.android.gms.internal.ads.zzxo, com.google.android.gms.internal.ads.zzu):boolean");
    }
}
