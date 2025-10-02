package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: classes5.dex */
class zzgmj extends zzgmk {
    private volatile zzgmk zza;
    final zzgmf zzb;
    final Character zzc;

    public zzgmj(zzgmf zzgmfVar, Character ch) {
        this.zzb = zzgmfVar;
        boolean z = true;
        if (ch != null && zzgmfVar.zze('=')) {
            z = false;
        }
        zzghc.zzf(z, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgmj) {
            zzgmj zzgmjVar = (zzgmj) obj;
            if (this.zzb.equals(zzgmjVar.zzb) && Objects.equals(this.zzc, zzgmjVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zzgmf zzgmfVar = this.zzb;
        sb.append(zzgmfVar);
        if (8 % zzgmfVar.zzb != 0) {
            Character ch = this.zzc;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzghc.zzo(0, i2, bArr.length);
        while (i3 < i2) {
            int i4 = this.zzb.zzd;
            zze(appendable, bArr, i3, Math.min(i4, i2 - i3));
            i3 += i4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public int zzb(byte[] bArr, CharSequence charSequence) throws zzgmi {
        int i;
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgmf zzgmfVar = this.zzb;
        if (!zzgmfVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            throw new zzgmi(YU.a.n(new StringBuilder(String.valueOf(length2).length() + 21), "Invalid input length ", length2));
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceZzg.length()) {
            long jZzc = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = zzgmfVar.zzc;
                if (i4 >= i) {
                    break;
                }
                jZzc <<= zzgmfVar.zzb;
                if (i2 + i4 < charSequenceZzg.length()) {
                    jZzc |= zzgmfVar.zzc(charSequenceZzg.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = zzgmfVar.zzd;
            int i7 = i5 * zzgmfVar.zzb;
            int i8 = (i6 - 1) * 8;
            while (i8 >= (i6 * 8) - i7) {
                bArr[i3] = (byte) ((jZzc >>> i8) & 255);
                i8 -= 8;
                i3++;
            }
            i2 += i;
        }
        return i3;
    }

    public zzgmk zzc(zzgmf zzgmfVar, Character ch) {
        return new zzgmj(zzgmfVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public final int zzd(int i) {
        zzgmf zzgmfVar = this.zzb;
        return zzgmfVar.zzc * zzgmx.zzb(i, zzgmfVar.zzd, RoundingMode.CEILING);
    }

    public final void zze(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzghc.zzo(i, i + i2, bArr.length);
        zzgmf zzgmfVar = this.zzb;
        int i3 = zzgmfVar.zzd;
        int i4 = 0;
        zzghc.zza(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & 255)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = zzgmfVar.zzb;
        while (i4 < i2 * 8) {
            appendable.append(zzgmfVar.zza(zzgmfVar.zza & ((int) (j >>> ((i6 - i7) - i4)))));
            i4 += i7;
        }
        if (this.zzc != null) {
            while (i4 < i3 * 8) {
                appendable.append('=');
                i4 += i7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public final int zzf(int i) {
        return (int) (((this.zzb.zzb * i) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public final zzgmk zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public final zzgmk zzi() {
        zzgmk zzgmkVarZzc = this.zza;
        if (zzgmkVarZzc == null) {
            zzgmf zzgmfVar = this.zzb;
            zzgmf zzgmfVarZzd = zzgmfVar.zzd();
            zzgmkVarZzc = zzgmfVarZzd == zzgmfVar ? this : zzc(zzgmfVarZzd, this.zzc);
            this.zza = zzgmkVarZzc;
        }
        return zzgmkVarZzc;
    }

    public zzgmj(String str, String str2, Character ch) {
        this(new zzgmf(str, str2.toCharArray()), ch);
    }
}
