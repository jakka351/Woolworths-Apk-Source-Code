package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes5.dex */
public class zzafv implements zzan {
    public final String zza;
    public final String zzb;

    public zzafv(String str, String str2) {
        this.zza = zzggj.zzb(str);
        this.zzb = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafv zzafvVar = (zzafv) obj;
            if (this.zza.equals(zzafvVar.zza) && this.zzb.equals(zzafvVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        return this.zzb.hashCode() + (iHashCode * 31);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        return androidx.constraintlayout.core.state.a.l(new StringBuilder(length + 5 + String.valueOf(str2).length()), "VC: ", str, "=", str2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzan
    public final void zza(zzal zzalVar) {
        Integer numZzh;
        Integer numZzh2;
        Integer numZzh3;
        Integer numZzh4;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (numZzh = zzgne.zzh(this.zzb, 10)) != null) {
                    zzalVar.zzh(numZzh);
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (numZzh2 = zzgne.zzh(this.zzb, 10)) != null) {
                    zzalVar.zzs(numZzh2);
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (numZzh3 = zzgne.zzh(this.zzb, 10)) != null) {
                    zzalVar.zzg(numZzh3);
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    zzalVar.zzc(this.zzb);
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    zzalVar.zzt(this.zzb);
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    zzalVar.zza(this.zzb);
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    zzalVar.zze(this.zzb);
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (numZzh4 = zzgne.zzh(this.zzb, 10)) != null) {
                    zzalVar.zzr(numZzh4);
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    zzalVar.zzd(this.zzb);
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    zzalVar.zzb(this.zzb);
                    break;
                }
                break;
        }
    }
}
