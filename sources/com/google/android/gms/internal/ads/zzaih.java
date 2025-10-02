package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.medallia.digital.mobilesdk.q2;

/* loaded from: classes5.dex */
final class zzaih {
    public static void zza(int i, @Nullable zzao zzaoVar, zzs zzsVar, @Nullable zzao zzaoVar2, zzao... zzaoVarArr) {
        if (zzaoVar2 == null) {
            zzaoVar2 = new zzao(-9223372036854775807L, new zzan[0]);
        }
        if (zzaoVar != null) {
            for (int i2 = 0; i2 < zzaoVar.zza(); i2++) {
                zzan zzanVarZzb = zzaoVar.zzb(i2);
                if (zzanVarZzb instanceof zzer) {
                    zzer zzerVar = (zzer) zzanVarZzb;
                    if (!zzerVar.zza.equals("com.android.capture.fps")) {
                        zzaoVar2 = zzaoVar2.zzd(zzerVar);
                    } else if (i == 2) {
                        zzaoVar2 = zzaoVar2.zzd(zzerVar);
                    }
                }
            }
        }
        for (zzao zzaoVar3 : zzaoVarArr) {
            zzaoVar2 = zzaoVar2.zzc(zzaoVar3);
        }
        if (zzaoVar2.zza() > 0) {
            zzsVar.zzk(zzaoVar2);
        }
    }

    public static void zzb(int i, zzadk zzadkVar, zzs zzsVar) {
        if (i == 1 && zzadkVar.zzb()) {
            zzsVar.zzH(zzadkVar.zza);
            zzsVar.zzI(zzadkVar.zzb);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0267 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:9:0x002e, B:11:0x0039, B:15:0x0048, B:18:0x0054, B:21:0x0061, B:24:0x0070, B:27:0x007d, B:30:0x008b, B:32:0x0097, B:40:0x00b2, B:41:0x00d0, B:42:0x00e2, B:45:0x00ee, B:48:0x00fb, B:51:0x0108, B:54:0x0115, B:57:0x0122, B:60:0x012f, B:63:0x013c, B:66:0x0149, B:69:0x0156, B:72:0x0163, B:76:0x0174, B:78:0x017a, B:80:0x018e, B:81:0x0195, B:83:0x019c, B:88:0x01a7, B:93:0x01b3, B:131:0x0267, B:94:0x01c8, B:96:0x01cf, B:98:0x01db, B:99:0x01ef, B:112:0x0219, B:115:0x0226, B:118:0x0232, B:121:0x023e, B:124:0x024a, B:127:0x0256, B:130:0x0260, B:132:0x0284, B:133:0x028b), top: B:138:0x0020 }] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzan zzc(com.google.android.gms.internal.ads.zzef r15) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaih.zzc(com.google.android.gms.internal.ads.zzef):com.google.android.gms.internal.ads.zzan");
    }

    @Nullable
    private static zzagm zzd(int i, String str, zzef zzefVar) {
        int iZzB = zzefVar.zzB();
        if (zzefVar.zzB() == 1684108385) {
            zzefVar.zzk(8);
            return new zzagm(str, null, zzgjz.zzj(zzefVar.zzL(iZzB - 16)));
        }
        zzds.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzev.zze(i)));
        return null;
    }

    @Nullable
    private static zzagh zze(int i, String str, zzef zzefVar, boolean z, boolean z2) {
        int iZzf = zzf(zzefVar);
        if (z2) {
            iZzf = Math.min(1, iZzf);
        }
        if (iZzf >= 0) {
            return z ? new zzagm(str, null, zzgjz.zzj(Integer.toString(iZzf))) : new zzagb("und", str, Integer.toString(iZzf));
        }
        zzds.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzev.zze(i)));
        return null;
    }

    private static int zzf(zzef zzefVar) {
        int iZzB = zzefVar.zzB();
        if (zzefVar.zzB() == 1684108385) {
            zzefVar.zzk(8);
            int i = iZzB - 16;
            if (i == 1) {
                return zzefVar.zzs();
            }
            if (i == 2) {
                return zzefVar.zzt();
            }
            if (i == 3) {
                return zzefVar.zzx();
            }
            if (i == 4 && (zzefVar.zzn() & 128) == 0) {
                return zzefVar.zzH();
            }
        }
        zzds.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    @Nullable
    private static zzagm zzg(int i, String str, zzef zzefVar) {
        int iZzB = zzefVar.zzB();
        if (zzefVar.zzB() == 1684108385 && iZzB >= 22) {
            zzefVar.zzk(10);
            int iZzt = zzefVar.zzt();
            if (iZzt > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(iZzt).length());
                sb.append(iZzt);
                String string = sb.toString();
                int iZzt2 = zzefVar.zzt();
                if (iZzt2 > 0) {
                    StringBuilder sb2 = new StringBuilder(string.length() + 1 + String.valueOf(iZzt2).length());
                    sb2.append(string);
                    sb2.append(q2.c);
                    sb2.append(iZzt2);
                    string = sb2.toString();
                }
                return new zzagm(str, null, zzgjz.zzj(string));
            }
        }
        zzds.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzev.zze(i)));
        return null;
    }
}
