package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzama implements zzanq {
    private final List zza;

    public zzama(int i, List list) {
        this.zza = list;
    }

    private final zzang zzc(zzanp zzanpVar) {
        return new zzang(zze(zzanpVar), "video/mp2t");
    }

    private final zzanv zzd(zzanp zzanpVar) {
        return new zzanv(zze(zzanpVar), "video/mp2t");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zze(zzanp zzanpVar) {
        String str;
        int i;
        List listSingletonList;
        zzef zzefVar = new zzef(zzanpVar.zze);
        ArrayList arrayList = this.zza;
        while (zzefVar.zzd() > 0) {
            int iZzs = zzefVar.zzs();
            int iZzg = zzefVar.zzg() + zzefVar.zzs();
            if (iZzs == 134) {
                arrayList = new ArrayList();
                int iZzs2 = zzefVar.zzs() & 31;
                for (int i2 = 0; i2 < iZzs2; i2++) {
                    String strZzK = zzefVar.zzK(3, StandardCharsets.UTF_8);
                    int iZzs3 = zzefVar.zzs();
                    boolean z = (iZzs3 & 128) != 0;
                    if (z) {
                        i = iZzs3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bZzs = (byte) zzefVar.zzs();
                    zzefVar.zzk(1);
                    if (z) {
                        int i3 = bZzs & 64;
                        int i4 = zzdc.zza;
                        listSingletonList = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzs zzsVar = new zzs();
                    zzsVar.zzm(str);
                    zzsVar.zze(strZzK);
                    zzsVar.zzJ(i);
                    zzsVar.zzp(listSingletonList);
                    arrayList.add(zzsVar.zzM());
                }
            }
            zzefVar.zzh(iZzg);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzanq
    public final SparseArray zza() {
        return new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.zzanq
    @Nullable
    public final zzans zzb(int i, zzanp zzanpVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzamw(new zzamp(zzanpVar.zzb, zzanpVar.zza(), "video/mp2t"));
            }
            if (i == 21) {
                return new zzamw(new zzamn("video/mp2t"));
            }
            if (i == 27) {
                return new zzamw(new zzamk(zzc(zzanpVar), false, false, "video/mp2t"));
            }
            if (i == 36) {
                return new zzamw(new zzamm(zzc(zzanpVar), "video/mp2t"));
            }
            if (i == 45) {
                return new zzamw(new zzamq("video/mp2t"));
            }
            if (i == 89) {
                return new zzamw(new zzamc(zzanpVar.zzd, "video/mp2t"));
            }
            if (i == 172) {
                return new zzamw(new zzalw(zzanpVar.zzb, zzanpVar.zza(), "video/mp2t"));
            }
            if (i == 257) {
                return new zzane(new zzamv("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i == 139) {
                            return new zzamw(new zzamb(zzanpVar.zzb, zzanpVar.zza(), 5408, "video/mp2t"));
                        }
                        switch (i) {
                            case 15:
                                return new zzamw(new zzalz(false, zzanpVar.zzb, zzanpVar.zza(), "video/mp2t"));
                            case 16:
                                return new zzamw(new zzami(zzd(zzanpVar), "video/mp2t"));
                            case 17:
                                return new zzamw(new zzamo(zzanpVar.zzb, zzanpVar.zza(), "video/mp2t"));
                            default:
                                switch (i) {
                                    case 134:
                                        return new zzane(new zzamv("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new zzamw(new zzamb(zzanpVar.zzb, zzanpVar.zza(), 4096, "video/mp2t"));
                }
                return new zzamw(new zzalt(zzanpVar.zzb, zzanpVar.zza(), "video/mp2t"));
            }
        }
        return new zzamw(new zzamf(zzd(zzanpVar), "video/mp2t"));
    }

    public zzama() {
        this(0);
    }

    public zzama(int i) {
        this.zza = zzgjz.zzi();
    }
}
