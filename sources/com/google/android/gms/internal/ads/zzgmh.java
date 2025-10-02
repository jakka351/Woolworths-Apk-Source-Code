package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes5.dex */
final class zzgmh extends zzgmj {
    private zzgmh(zzgmf zzgmfVar, Character ch) {
        super(zzgmfVar, ch);
        zzghc.zza(zzgmfVar.zzf().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgmj, com.google.android.gms.internal.ads.zzgmk
    public final void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzghc.zzo(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = bArr[i3] & 255;
            int i6 = bArr[i3 + 1] & 255;
            int i7 = bArr[i3 + 2] & 255;
            zzgmf zzgmfVar = this.zzb;
            int i8 = (i6 << 8) | (i5 << 16) | i7;
            appendable.append(zzgmfVar.zza(i8 >>> 18));
            appendable.append(zzgmfVar.zza((i8 >>> 12) & 63));
            appendable.append(zzgmfVar.zza((i8 >>> 6) & 63));
            appendable.append(zzgmfVar.zza(i8 & 63));
            i3 += 3;
        }
        if (i3 < i2) {
            zze(appendable, bArr, i3, i2 - i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmj, com.google.android.gms.internal.ads.zzgmk
    public final int zzb(byte[] bArr, CharSequence charSequence) throws zzgmi {
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgmf zzgmfVar = this.zzb;
        if (!zzgmfVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            throw new zzgmi(YU.a.n(new StringBuilder(String.valueOf(length2).length() + 21), "Invalid input length ", length2));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceZzg.length()) {
            int i3 = i2 + 1;
            int iZzc = (zzgmfVar.zzc(charSequenceZzg.charAt(i + 1)) << 12) | (zzgmfVar.zzc(charSequenceZzg.charAt(i)) << 18);
            bArr[i2] = (byte) (iZzc >>> 16);
            int i4 = i + 2;
            if (i4 < charSequenceZzg.length()) {
                int i5 = i + 3;
                int iZzc2 = iZzc | (zzgmfVar.zzc(charSequenceZzg.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((iZzc2 >>> 8) & 255);
                if (i5 < charSequenceZzg.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iZzc2 | zzgmfVar.zzc(charSequenceZzg.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final zzgmk zzc(zzgmf zzgmfVar, Character ch) {
        return new zzgmh(zzgmfVar, ch);
    }

    public zzgmh(String str, String str2, Character ch) {
        this(new zzgmf(str, str2.toCharArray()), ch);
    }
}
