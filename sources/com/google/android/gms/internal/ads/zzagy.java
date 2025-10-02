package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes5.dex */
public final class zzagy {
    public byte[] zzO;
    public zzaec zzU;
    public boolean zzW;
    public zzaeb zzY;
    public zzu zzZ;
    public boolean zza;
    public int zzaa;
    private int zzab;
    public String zzb;
    public String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public zzaea zzj;
    public byte[] zzk;
    public zzp zzl;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = 0;
    public int zzs = -1;
    public float zzt = BitmapDescriptorFactory.HUE_RED;
    public float zzu = BitmapDescriptorFactory.HUE_RED;
    public float zzv = BitmapDescriptorFactory.HUE_RED;
    public byte[] zzw = null;
    public int zzx = -1;
    public boolean zzy = false;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = 1000;
    public int zzD = 200;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public float zzN = -1.0f;
    public int zzP = 1;
    public int zzQ = -1;
    public int zzR = 8000;
    public long zzS = 0;
    public long zzT = 0;
    public boolean zzV = false;
    public boolean zzX = true;
    private String zzac = "eng";

    private static Pair zzf(zzef zzefVar) throws zzas {
        try {
            zzefVar.zzk(16);
            long jZzA = zzefVar.zzA();
            if (jZzA == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzA == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jZzA != 826496599) {
                zzds.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iZzg = zzefVar.zzg() + 20;
            byte[] bArrZzi = zzefVar.zzi();
            while (true) {
                int length = bArrZzi.length;
                if (iZzg >= length - 4) {
                    throw zzas.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i = iZzg + 1;
                if (bArrZzi[iZzg] == 0 && bArrZzi[i] == 0 && bArrZzi[iZzg + 2] == 1 && bArrZzi[iZzg + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzi, iZzg, length)));
                }
                iZzg = i;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzas.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzas {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw zzas.zzb("Error parsing vorbis codec private", null);
            }
            int i3 = 0;
            int i4 = 1;
            while (true) {
                int i5 = bArr[i4];
                i4++;
                i = i5 & 255;
                if (i != 255) {
                    break;
                }
                i3 += 255;
            }
            int i6 = i3 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i4];
                i4++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i9 = i7 + i2;
            if (bArr[i4] != 1) {
                throw zzas.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            int i10 = i4 + i6;
            if (bArr[i10] != 3) {
                throw zzas.zzb("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw zzas.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzas.zzb("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzef zzefVar) throws zzas {
        try {
            int iZzu = zzefVar.zzu();
            if (iZzu == 1) {
                return true;
            }
            if (iZzu == 65534) {
                zzefVar.zzh(24);
                if (zzefVar.zzD() == zzagz.zzf.getMostSignificantBits()) {
                    if (zzefVar.zzD() == zzagz.zzf.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzas.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull
    private final byte[] zzi(String str) throws zzas {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        throw zzas.zzb("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List] */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull
    @org.checkerframework.checker.nullness.qual.RequiresNonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzacx r19, int r20) throws com.google.android.gms.internal.ads.zzas {
        /*
            Method dump skipped, instructions count: 1870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagy.zza(com.google.android.gms.internal.ads.zzacx, int):void");
    }

    public final /* synthetic */ void zzb() {
        this.zzY.getClass();
    }

    public final /* synthetic */ int zzc() {
        return this.zzab;
    }

    public final /* synthetic */ void zzd(int i) {
        this.zzab = i;
    }

    public final /* synthetic */ void zze(String str) {
        this.zzac = str;
    }
}
