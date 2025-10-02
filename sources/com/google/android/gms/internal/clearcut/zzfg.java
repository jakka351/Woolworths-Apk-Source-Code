package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import org.bouncycastle.asn1.BERTags;

/* loaded from: classes5.dex */
abstract class zzfg {
    public static void zzc(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i, (byte) cCharAt);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                int iMax = Math.max(i, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position();
                char cCharAt2 = charSequence.charAt(i);
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(cCharAt2);
                sb.append(" at index ");
                sb.append(iMax);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
        }
        if (i == length) {
            byteBuffer.position(iPosition + i);
            return;
        }
        iPosition += i;
        while (i < length) {
            char cCharAt3 = charSequence.charAt(i);
            if (cCharAt3 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt3);
            } else if (cCharAt3 < 2048) {
                int i2 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt3 >>> 6) | BERTags.PRIVATE));
                    byteBuffer.put(i2, (byte) ((cCharAt3 & '?') | 128));
                    iPosition = i2;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i2;
                    int iMax2 = Math.max(i, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position();
                    char cCharAt22 = charSequence.charAt(i);
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Failed writing ");
                    sb2.append(cCharAt22);
                    sb2.append(" at index ");
                    sb2.append(iMax2);
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
            } else {
                if (cCharAt3 >= 55296 && 57343 >= cCharAt3) {
                    int i3 = i + 1;
                    if (i3 != length) {
                        try {
                            char cCharAt4 = charSequence.charAt(i3);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                int i4 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    int i5 = iPosition + 2;
                                    try {
                                        byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                        iPosition += 3;
                                        byteBuffer.put(i5, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                        i = i3;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        i = i3;
                                        iPosition = i5;
                                        int iMax22 = Math.max(i, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position();
                                        char cCharAt222 = charSequence.charAt(i);
                                        StringBuilder sb22 = new StringBuilder(37);
                                        sb22.append("Failed writing ");
                                        sb22.append(cCharAt222);
                                        sb22.append(" at index ");
                                        sb22.append(iMax22);
                                        throw new ArrayIndexOutOfBoundsException(sb22.toString());
                                    }
                                } catch (IndexOutOfBoundsException unused4) {
                                    iPosition = i4;
                                    i = i3;
                                    int iMax222 = Math.max(i, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position();
                                    char cCharAt2222 = charSequence.charAt(i);
                                    StringBuilder sb222 = new StringBuilder(37);
                                    sb222.append("Failed writing ");
                                    sb222.append(cCharAt2222);
                                    sb222.append(" at index ");
                                    sb222.append(iMax222);
                                    throw new ArrayIndexOutOfBoundsException(sb222.toString());
                                }
                            } else {
                                i = i3;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new zzfi(i, length);
                }
                int i6 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt3 >>> '\f') | BERTags.FLAGS));
                iPosition += 2;
                byteBuffer.put(i6, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt3 & '?') | 128));
            }
            i++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    public abstract int zzb(int i, byte[] bArr, int i2, int i3);

    public abstract int zzb(CharSequence charSequence, byte[] bArr, int i, int i2);

    public abstract void zzb(CharSequence charSequence, ByteBuffer byteBuffer);

    public final boolean zze(byte[] bArr, int i, int i2) {
        return zzb(0, bArr, i, i2) == 0;
    }
}
