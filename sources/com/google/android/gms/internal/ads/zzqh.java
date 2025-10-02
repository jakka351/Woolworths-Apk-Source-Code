package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzqh extends zzcg {

    @Nullable
    private int[] zzd;

    @Nullable
    private int[] zze;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    @Override // com.google.android.gms.internal.ads.zzcf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(java.nio.ByteBuffer r17) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqh.zzd(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcc zzm(zzcc zzccVar) throws zzce {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcc.zza;
        }
        int i = zzccVar.zzd;
        if (!zzeo.zzA(i)) {
            throw new zzce("Unhandled input format:", zzccVar);
        }
        int i2 = zzccVar.zzc;
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (true) {
            int length = iArr.length;
            if (i3 >= length) {
                return z ? new zzcc(zzccVar.zzb, length, i) : zzcc.zza;
            }
            int i4 = iArr[i3];
            if (i4 >= i2) {
                String string = Arrays.toString(iArr);
                throw new zzce(YU.a.p(new StringBuilder(String.valueOf(string).length() + 59), "Channel map (", string, ") trying to access non-existent input channel."), zzccVar);
            }
            z |= i4 != i3;
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzo() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzp() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzq(@Nullable int[] iArr) {
        this.zzd = iArr;
    }
}
