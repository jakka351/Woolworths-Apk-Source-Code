package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes5.dex */
final class zzakk {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzakk(int i, int i2, int i3, int i4, int i5, int i6) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Nullable
    public static zzakk zza(String str) {
        zzghc.zza(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                if (i3 == -1 || i4 == -1 || i6 == -1) {
                    return null;
                }
                return new zzakk(i2, i3, i4, i5, i6, length);
            }
            String strZza = zzggj.zza(strArrSplit[i].trim());
            switch (strZza.hashCode()) {
                case 100571:
                    if (!strZza.equals("end")) {
                        break;
                    } else {
                        i4 = i;
                        break;
                    }
                case 3556653:
                    if (!strZza.equals(TextBundle.TEXT_ENTRY)) {
                        break;
                    } else {
                        i6 = i;
                        break;
                    }
                case 102749521:
                    if (!strZza.equals("layer")) {
                        break;
                    } else {
                        i2 = i;
                        break;
                    }
                case 109757538:
                    if (!strZza.equals("start")) {
                        break;
                    } else {
                        i3 = i;
                        break;
                    }
                case 109780401:
                    if (!strZza.equals("style")) {
                        break;
                    } else {
                        i5 = i;
                        break;
                    }
            }
            i++;
        }
    }
}
