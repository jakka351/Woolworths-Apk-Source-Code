package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes5.dex */
final class zzgmg extends zzgmj {
    final char[] zza;

    private zzgmg(zzgmf zzgmfVar) {
        super(zzgmfVar, null);
        this.zza = new char[512];
        zzghc.zza(zzgmfVar.zzf().length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzgmfVar.zza(i >>> 4);
            this.zza[i | 256] = zzgmfVar.zza(i & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmj, com.google.android.gms.internal.ads.zzgmk
    public final void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzghc.zzo(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3] & 255;
            char[] cArr = this.zza;
            appendable.append(cArr[i4]);
            appendable.append(cArr[i4 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmj, com.google.android.gms.internal.ads.zzgmk
    public final int zzb(byte[] bArr, CharSequence charSequence) throws zzgmi {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new zzgmi(YU.a.n(new StringBuilder(String.valueOf(length).length() + 21), "Invalid input length ", length));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            zzgmf zzgmfVar = this.zzb;
            bArr[i2] = (byte) (zzgmfVar.zzc(charSequence.charAt(i + 1)) | (zzgmfVar.zzc(charSequence.charAt(i)) << 4));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final zzgmk zzc(zzgmf zzgmfVar, Character ch) {
        return new zzgmg(zzgmfVar);
    }

    public zzgmg(String str, String str2) {
        this(new zzgmf("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
