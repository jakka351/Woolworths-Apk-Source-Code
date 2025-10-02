package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteOrder;

/* loaded from: classes5.dex */
final class zzaer implements zzaek {
    public final zzgjz zza;
    private final int zzb;

    private zzaer(int i, zzgjz zzgjzVar) {
        this.zzb = i;
        this.zza = zzgjzVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzaer zzb(int i, zzef zzefVar) {
        zzaek zzaesVar;
        String str;
        zzgjw zzgjwVar = new zzgjw();
        int iZze = zzefVar.zze();
        int iZzc = -2;
        while (zzefVar.zzd() > 8) {
            int iZzC = zzefVar.zzC();
            int iZzg = zzefVar.zzg() + zzefVar.zzC();
            zzefVar.zzf(iZzg);
            if (iZzC != 1414744396) {
                zzaes zzaesVar2 = null;
                switch (iZzC) {
                    case 1718776947:
                        if (iZzc == 2) {
                            zzefVar.zzk(4);
                            int iZzC2 = zzefVar.zzC();
                            int iZzC3 = zzefVar.zzC();
                            zzefVar.zzk(4);
                            int iZzC4 = zzefVar.zzC();
                            switch (iZzC4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                com.google.android.gms.common.api.internal.a.r(new StringBuilder(String.valueOf(iZzC4).length() + 44), "Ignoring track with unsupported compression ", iZzC4, "StreamFormatChunk");
                            } else {
                                zzs zzsVar = new zzs();
                                zzsVar.zzt(iZzC2);
                                zzsVar.zzu(iZzC3);
                                zzsVar.zzm(str);
                                zzaesVar2 = new zzaes(zzsVar.zzM());
                            }
                        } else if (iZzc == 1) {
                            int iZzu = zzefVar.zzu();
                            String str2 = iZzu != 1 ? iZzu != 85 ? iZzu != 255 ? iZzu != 8192 ? iZzu != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int iZzu2 = zzefVar.zzu();
                                int iZzC5 = zzefVar.zzC();
                                zzefVar.zzk(6);
                                int iZzz = zzeo.zzz(zzefVar.zzu(), ByteOrder.LITTLE_ENDIAN);
                                int iZzu3 = zzefVar.zzd() > 0 ? zzefVar.zzu() : 0;
                                zzs zzsVar2 = new zzs();
                                zzsVar2.zzm(str2);
                                zzsVar2.zzE(iZzu2);
                                zzsVar2.zzF(iZzC5);
                                if (str2.equals("audio/raw") && iZzz != 0) {
                                    zzsVar2.zzG(iZzz);
                                }
                                if (str2.equals("audio/mp4a-latm") && iZzu3 > 0) {
                                    byte[] bArr = new byte[iZzu3];
                                    zzefVar.zzm(bArr, 0, iZzu3);
                                    zzsVar2.zzp(zzgjz.zzj(bArr));
                                }
                                zzaesVar = new zzaes(zzsVar2.zzM());
                                break;
                            } else {
                                com.google.android.gms.common.api.internal.a.r(new StringBuilder(String.valueOf(iZzu).length() + 43), "Ignoring track with unsupported format tag ", iZzu, "StreamFormatChunk");
                            }
                        } else {
                            zzds.zzc("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzeo.zzQ(iZzc)));
                        }
                        zzaesVar = zzaesVar2;
                        break;
                    case 1751742049:
                        zzaesVar = zzaeo.zzb(zzefVar);
                        break;
                    case 1752331379:
                        zzaesVar = zzaep.zzb(zzefVar);
                        break;
                    case 1852994675:
                        zzaesVar = zzaet.zzb(zzefVar);
                        break;
                    default:
                        zzaesVar = zzaesVar2;
                        break;
                }
            } else {
                zzaesVar = zzb(zzefVar.zzC(), zzefVar);
            }
            if (zzaesVar != null) {
                if (zzaesVar.zza() == 1752331379) {
                    iZzc = ((zzaep) zzaesVar).zzc();
                }
                zzgjwVar.zzf(zzaesVar);
            }
            zzefVar.zzh(iZzg);
            zzefVar.zzf(iZze);
        }
        return new zzaer(i, zzgjwVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzaek
    public final int zza() {
        return this.zzb;
    }

    @Nullable
    public final zzaek zzc(Class cls) {
        zzgjz zzgjzVar = this.zza;
        int size = zzgjzVar.size();
        int i = 0;
        while (i < size) {
            zzaek zzaekVar = (zzaek) zzgjzVar.get(i);
            i++;
            if (zzaekVar.getClass() == cls) {
                return zzaekVar;
            }
        }
        return null;
    }
}
