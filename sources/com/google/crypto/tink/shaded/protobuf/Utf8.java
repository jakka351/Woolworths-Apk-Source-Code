package com.google.crypto.tink.shaded.protobuf;

import androidx.camera.core.impl.b;
import com.google.crypto.tink.shaded.protobuf.UnsafeUtil;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class Utf8 {

    /* renamed from: a, reason: collision with root package name */
    public static final Processor f15122a;

    public static class DecodeUtil {
        public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (!d(b2)) {
                if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !d(b3) && !d(b4)) {
                    int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                    cArr[i] = (char) ((i2 >>> 10) + 55232);
                    cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                    return;
                }
            }
            throw InvalidProtocolBufferException.c();
        }

        public static void b(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b < -62 || d(b2)) {
                throw InvalidProtocolBufferException.c();
            }
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        }

        public static void c(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || d(b3)))) {
                throw InvalidProtocolBufferException.c();
            }
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }

        public static boolean d(byte b) {
            return b > -65;
        }
    }

    public static abstract class Processor {
        public static String b(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (b < 0) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (b2 >= 0) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b2;
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = byteBuffer.get(i8);
                        if (b3 < 0) {
                            break;
                        }
                        i8++;
                        cArr[i7] = (char) b3;
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (b2 < -32) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.c();
                    }
                    i += 2;
                    DecodeUtil.b(b2, byteBuffer.get(i6), cArr, i5);
                    i5++;
                } else if (b2 < -16) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.c();
                    }
                    int i9 = i + 2;
                    i += 3;
                    DecodeUtil.c(b2, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte b4 = byteBuffer.get(i6);
                    int i10 = i + 3;
                    byte b5 = byteBuffer.get(i + 2);
                    i += 4;
                    DecodeUtil.a(b2, b4, b5, byteBuffer.get(i10), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        public static int h(ByteBuffer byteBuffer, int i, int i2, int i3) {
            byte b;
            int i4;
            byte b2;
            int i5;
            int i6 = i2;
            if (i != 0) {
                if (i6 >= i3) {
                    return i;
                }
                byte b3 = (byte) i;
                if (b3 < -32) {
                    if (b3 < -62) {
                        return -1;
                    }
                    int i7 = i6 + 1;
                    if (byteBuffer.get(i6) > -65) {
                        return -1;
                    }
                    i6 = i7;
                } else if (b3 < -16) {
                    byte b4 = (byte) (~(i >> 8));
                    if (b4 == 0) {
                        i5 = i6 + 1;
                        b2 = byteBuffer.get(i6);
                        if (i5 >= i3) {
                            return Utf8.e(b3, b2);
                        }
                    } else {
                        b2 = b4;
                        i5 = i6;
                    }
                    if (b2 > -65) {
                        return -1;
                    }
                    if (b3 == -32 && b2 < -96) {
                        return -1;
                    }
                    if (b3 == -19 && b2 >= -96) {
                        return -1;
                    }
                    i6 = i5 + 1;
                    if (byteBuffer.get(i5) > -65) {
                        return -1;
                    }
                } else {
                    byte b5 = (byte) (~(i >> 8));
                    if (b5 == 0) {
                        i4 = i6 + 1;
                        b5 = byteBuffer.get(i6);
                        if (i4 >= i3) {
                            return Utf8.e(b3, b5);
                        }
                        b = 0;
                    } else {
                        b = (byte) (i >> 16);
                        i4 = i6;
                    }
                    if (b == 0) {
                        int i8 = i4 + 1;
                        byte b6 = byteBuffer.get(i4);
                        if (i8 >= i3) {
                            return Utf8.f(b3, b5, b6);
                        }
                        b = b6;
                        i4 = i8;
                    }
                    if (b5 > -65) {
                        return -1;
                    }
                    if ((((b5 + 112) + (b3 << 28)) >> 30) != 0 || b > -65) {
                        return -1;
                    }
                    i6 = i4 + 1;
                    if (byteBuffer.get(i4) > -65) {
                        return -1;
                    }
                }
            }
            Processor processor = Utf8.f15122a;
            int i9 = i3 - 7;
            int i10 = i6;
            while (i10 < i9 && (byteBuffer.getLong(i10) & (-9187201950435737472L)) == 0) {
                i10 += 8;
            }
            int i11 = (i10 - i6) + i6;
            while (i11 < i3) {
                int i12 = i11 + 1;
                byte b7 = byteBuffer.get(i11);
                if (b7 >= 0) {
                    i11 = i12;
                } else if (b7 < -32) {
                    if (i12 >= i3) {
                        return b7;
                    }
                    if (b7 < -62 || byteBuffer.get(i12) > -65) {
                        return -1;
                    }
                    i11 += 2;
                } else if (b7 < -16) {
                    if (i12 >= i3 - 1) {
                        return Utf8.b(byteBuffer, b7, i12, i3 - i12);
                    }
                    int i13 = i11 + 2;
                    byte b8 = byteBuffer.get(i12);
                    if (b8 > -65) {
                        return -1;
                    }
                    if (b7 == -32 && b8 < -96) {
                        return -1;
                    }
                    if ((b7 == -19 && b8 >= -96) || byteBuffer.get(i13) > -65) {
                        return -1;
                    }
                    i11 += 3;
                } else {
                    if (i12 >= i3 - 2) {
                        return Utf8.b(byteBuffer, b7, i12, i3 - i12);
                    }
                    int i14 = i11 + 2;
                    byte b9 = byteBuffer.get(i12);
                    if (b9 > -65) {
                        return -1;
                    }
                    if ((((b9 + 112) + (b7 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    int i15 = i11 + 3;
                    if (byteBuffer.get(i14) > -65) {
                        return -1;
                    }
                    i11 += 4;
                    if (byteBuffer.get(i15) > -65) {
                        return -1;
                    }
                }
            }
            return 0;
        }

        public abstract String a(int i, int i2, byte[] bArr);

        public abstract String c(ByteBuffer byteBuffer, int i, int i2);

        public abstract int d(int i, int i2, String str, byte[] bArr);

        public final boolean e(int i, int i2, byte[] bArr) {
            return f(0, i, bArr, i2) == 0;
        }

        public abstract int f(int i, int i2, byte[] bArr, int i3);

        public final int g(ByteBuffer byteBuffer, int i, int i2, int i3) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? i(byteBuffer, i, i2, i3) : h(byteBuffer, i, i2, i3);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return f(i, i2 + iArrayOffset, byteBuffer.array(), iArrayOffset + i3);
        }

        public abstract int i(ByteBuffer byteBuffer, int i, int i2, int i3);
    }

    public static final class SafeProcessor extends Processor {
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        public final String a(int i, int i2, byte[] bArr) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (b < 0) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b2;
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = bArr[i8];
                        if (b3 < 0) {
                            break;
                        }
                        i8++;
                        cArr[i7] = (char) b3;
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (b2 < -32) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.c();
                    }
                    i += 2;
                    DecodeUtil.b(b2, bArr[i6], cArr, i5);
                    i5++;
                } else if (b2 < -16) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.c();
                    }
                    int i9 = i + 2;
                    i += 3;
                    DecodeUtil.c(b2, bArr[i6], bArr[i9], cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte b4 = bArr[i6];
                    int i10 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    DecodeUtil.a(b2, b4, b5, bArr[i10], cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        public final String c(ByteBuffer byteBuffer, int i, int i2) {
            return Processor.b(byteBuffer, i, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        public final int d(int i, int i2, String str, byte[] bArr) {
            int i3;
            int i4;
            char cCharAt;
            int length = str.length();
            int i5 = i2 + i;
            int i6 = 0;
            while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
                bArr[i4] = (byte) cCharAt;
                i6++;
            }
            if (i6 == length) {
                return i + length;
            }
            int i7 = i + i6;
            while (i6 < length) {
                char cCharAt2 = str.charAt(i6);
                if (cCharAt2 < 128 && i7 < i5) {
                    bArr[i7] = (byte) cCharAt2;
                    i7++;
                } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                    i7 += 2;
                    bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                        if (i7 > i5 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                throw new UnpairedSurrogateException(i6, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i7);
                        }
                        int i9 = i6 + 1;
                        if (i9 != str.length()) {
                            char cCharAt3 = str.charAt(i9);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i10 = i7 + 3;
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i7 += 4;
                                bArr[i10] = (byte) ((codePoint & 63) | 128);
                                i6 = i9;
                            } else {
                                i6 = i9;
                            }
                        }
                        throw new UnpairedSurrogateException(i6 - 1, length);
                    }
                    bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i11 = i7 + 2;
                    bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i7 += 3;
                    bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
                }
                i6++;
            }
            return i7;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if (r14[r13] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
        
            if (r14[r13] > (-65)) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
        
            if (r14[r13] > (-65)) goto L50;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int f(int r12, int r13, byte[] r14, int r15) {
            /*
                Method dump skipped, instructions count: 239
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.SafeProcessor.f(int, int, byte[], int):int");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        public final int i(ByteBuffer byteBuffer, int i, int i2, int i3) {
            return Processor.h(byteBuffer, i, i2, i3);
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super(b.i(i, i2, "Unpaired surrogate at index ", " of "));
        }
    }

    public static final class UnsafeProcessor extends Processor {
        public static int j(int i, int i2, long j) {
            if (i2 == 0) {
                Processor processor = Utf8.f15122a;
                if (i > -12) {
                    return -1;
                }
                return i;
            }
            if (i2 == 1) {
                return Utf8.e(i, UnsafeUtil.d.f(j));
            }
            if (i2 != 2) {
                throw new AssertionError();
            }
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
            return Utf8.f(i, memoryAccessor.f(j), memoryAccessor.f(j + 1));
        }

        public static int k(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                Processor processor = Utf8.f15122a;
                if (i > -12) {
                    return -1;
                }
                return i;
            }
            if (i2 == 1) {
                return Utf8.e(i, UnsafeUtil.f(j, bArr));
            }
            if (i2 == 2) {
                return Utf8.f(i, UnsafeUtil.f(j, bArr), UnsafeUtil.f(j + 1, bArr));
            }
            throw new AssertionError();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        public final String a(int i, int i2, byte[] bArr) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte bF = UnsafeUtil.f(i, bArr);
                if (bF < 0) {
                    break;
                }
                i++;
                cArr[i4] = (char) bF;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte bF2 = UnsafeUtil.f(i, bArr);
                if (bF2 >= 0) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) bF2;
                    while (i6 < i3) {
                        byte bF3 = UnsafeUtil.f(i6, bArr);
                        if (bF3 < 0) {
                            break;
                        }
                        i6++;
                        cArr[i7] = (char) bF3;
                        i7++;
                    }
                    i5 = i7;
                    i = i6;
                } else if (bF2 < -32) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.c();
                    }
                    i += 2;
                    DecodeUtil.b(bF2, UnsafeUtil.f(i6, bArr), cArr, i5);
                    i5++;
                } else if (bF2 < -16) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.c();
                    }
                    int i8 = i + 2;
                    i += 3;
                    DecodeUtil.c(bF2, UnsafeUtil.f(i6, bArr), UnsafeUtil.f(i8, bArr), cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte bF4 = UnsafeUtil.f(i6, bArr);
                    int i9 = i + 3;
                    byte bF5 = UnsafeUtil.f(i + 2, bArr);
                    i += 4;
                    DecodeUtil.a(bF2, bF4, bF5, UnsafeUtil.f(i9, bArr), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        public final String c(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            long j;
            byte bF;
            byte bF2;
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long jL = UnsafeUtil.d.l(UnsafeUtil.h, byteBuffer) + i;
            long j2 = i2 + jL;
            char[] cArr = new char[i2];
            int i3 = 0;
            while (true) {
                j = 1;
                if (jL >= j2 || (bF2 = UnsafeUtil.d.f(jL)) < 0) {
                    break;
                }
                jL++;
                cArr[i3] = (char) bF2;
                i3++;
            }
            int i4 = i3;
            while (jL < j2) {
                long j3 = jL + j;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
                byte bF3 = memoryAccessor.f(jL);
                if (bF3 >= 0) {
                    int i5 = i4 + 1;
                    cArr[i4] = (char) bF3;
                    while (j3 < j2 && (bF = UnsafeUtil.d.f(j3)) >= 0) {
                        j3 += j;
                        cArr[i5] = (char) bF;
                        i5++;
                    }
                    i4 = i5;
                    jL = j3;
                } else if (bF3 < -32) {
                    if (j3 >= j2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    jL += 2;
                    DecodeUtil.b(bF3, memoryAccessor.f(j3), cArr, i4);
                    i4++;
                } else if (bF3 < -16) {
                    if (j3 >= j2 - j) {
                        throw InvalidProtocolBufferException.c();
                    }
                    long j4 = 2 + jL;
                    jL += 3;
                    DecodeUtil.c(bF3, memoryAccessor.f(j3), memoryAccessor.f(j4), cArr, i4);
                    i4++;
                } else {
                    if (j3 >= j2 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte bF4 = memoryAccessor.f(j3);
                    long j5 = jL + 3;
                    byte bF5 = memoryAccessor.f(2 + jL);
                    jL += 4;
                    DecodeUtil.a(bF3, bF4, bF5, memoryAccessor.f(j5), cArr, i4);
                    i4 += 2;
                }
                j = 1;
            }
            return new String(cArr, 0, i4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        public final int d(int i, int i2, String str, byte[] bArr) {
            long j;
            long j2;
            long j3;
            int i3;
            char cCharAt;
            long j4 = i;
            long j5 = i2 + j4;
            int length = str.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (cCharAt = str.charAt(i4)) >= 128) {
                    break;
                }
                UnsafeUtil.k(bArr, j4, (byte) cCharAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 < 128 && j4 < j5) {
                    UnsafeUtil.k(bArr, j4, (byte) cCharAt2);
                    j3 = j5;
                    j2 = j;
                    j4 += j;
                } else if (cCharAt2 >= 2048 || j4 > j5 - 2) {
                    j2 = j;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                        j3 = j5;
                        if (j4 > j3 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                throw new UnpairedSurrogateException(i4, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt3 = str.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                UnsafeUtil.k(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                UnsafeUtil.k(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j6 = j4 + 3;
                                UnsafeUtil.k(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 += 4;
                                UnsafeUtil.k(bArr, j6, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new UnpairedSurrogateException(i4 - 1, length);
                    }
                    UnsafeUtil.k(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j7 = j4 + 2;
                    j3 = j5;
                    UnsafeUtil.k(bArr, j4 + j2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j4 += 3;
                    UnsafeUtil.k(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j2 = j;
                    long j8 = j4 + j2;
                    UnsafeUtil.k(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                    j4 += 2;
                    UnsafeUtil.k(bArr, j8, (byte) ((cCharAt2 & '?') | 128));
                    j3 = j5;
                }
                i4++;
                j = j2;
                j5 = j3;
            }
            return (int) j4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.f(r4, r22) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.f(r4, r22) > (-65)) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.f(r4, r22) > (-65)) goto L54;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int f(int r20, int r21, byte[] r22, int r23) {
            /*
                Method dump skipped, instructions count: 377
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.UnsafeProcessor.f(int, int, byte[], int):int");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        public final int i(ByteBuffer byteBuffer, int i, int i2, int i3) {
            long j;
            byte b;
            int i4;
            byte bF;
            long j2;
            if ((i2 | i3 | (byteBuffer.limit() - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
            long jL = memoryAccessor.l(UnsafeUtil.h, byteBuffer) + i2;
            long j3 = (i3 - i2) + jL;
            byte b2 = -19;
            byte b3 = -16;
            if (i == 0) {
                j = 1;
                b = 0;
            } else {
                if (jL >= j3) {
                    return i;
                }
                b = 0;
                byte b4 = (byte) i;
                if (b4 < -32) {
                    if (b4 < -62) {
                        return -1;
                    }
                    j2 = jL + 1;
                    if (memoryAccessor.f(jL) > -65) {
                        return -1;
                    }
                } else if (b4 < -16) {
                    byte bF2 = (byte) (~(i >> 8));
                    if (bF2 == 0) {
                        long j4 = jL + 1;
                        bF2 = memoryAccessor.f(jL);
                        if (j4 >= j3) {
                            return Utf8.e(b4, bF2);
                        }
                        jL = j4;
                    }
                    if (bF2 > -65) {
                        return -1;
                    }
                    if (b4 == -32 && bF2 < -96) {
                        return -1;
                    }
                    if (b4 == -19 && bF2 >= -96) {
                        return -1;
                    }
                    j2 = jL + 1;
                    if (memoryAccessor.f(jL) > -65) {
                        return -1;
                    }
                } else {
                    j = 1;
                    byte b5 = (byte) (~(i >> 8));
                    if (b5 == 0) {
                        long j5 = jL + 1;
                        byte bF3 = memoryAccessor.f(jL);
                        if (j5 >= j3) {
                            return Utf8.e(b4, bF3);
                        }
                        jL = j5;
                        b5 = bF3;
                        bF = 0;
                    } else {
                        bF = (byte) (i >> 16);
                    }
                    if (bF == 0) {
                        long j6 = jL + 1;
                        bF = memoryAccessor.f(jL);
                        if (j6 >= j3) {
                            return Utf8.f(b4, b5, bF);
                        }
                        jL = j6;
                    }
                    if (b5 > -65) {
                        return -1;
                    }
                    if ((((b5 + 112) + (b4 << 28)) >> 30) != 0 || bF > -65) {
                        return -1;
                    }
                    long j7 = jL + 1;
                    if (memoryAccessor.f(jL) > -65) {
                        return -1;
                    }
                    jL = j7;
                }
                j = 1;
                jL = j2;
            }
            int i5 = (int) (j3 - jL);
            if (i5 < 16) {
                i4 = b;
            } else {
                int i6 = 8 - (((int) jL) & 7);
                int i7 = i6;
                long j8 = jL;
                while (true) {
                    if (i7 > 0) {
                        long j9 = j8 + j;
                        if (UnsafeUtil.d.f(j8) < 0) {
                            i4 = i6 - i7;
                            break;
                        }
                        i7--;
                        j8 = j9;
                    } else {
                        int i8 = i5 - i6;
                        while (i8 >= 8 && (UnsafeUtil.d.k(j8) & (-9187201950435737472L)) == 0) {
                            j8 += 8;
                            i8 -= 8;
                        }
                        i4 = i5 - i8;
                    }
                }
            }
            long j10 = jL + i4;
            int i9 = i5 - i4;
            while (true) {
                byte b6 = b;
                while (true) {
                    if (i9 <= 0) {
                        break;
                    }
                    long j11 = j10 + j;
                    byte bF4 = UnsafeUtil.d.f(j10);
                    if (bF4 < 0) {
                        b6 = bF4;
                        j10 = j11;
                        break;
                    }
                    i9--;
                    b6 = bF4;
                    j10 = j11;
                }
                if (i9 == 0) {
                    return b;
                }
                int i10 = i9 - 1;
                if (b6 < -32) {
                    if (i10 == 0) {
                        return b6;
                    }
                    i9 -= 2;
                    if (b6 < -62) {
                        return -1;
                    }
                    long j12 = j10 + j;
                    if (UnsafeUtil.d.f(j10) > -65) {
                        return -1;
                    }
                    j10 = j12;
                } else if (b6 < b3) {
                    if (i10 < 2) {
                        return j(b6, i10, j10);
                    }
                    i9 -= 3;
                    long j13 = j10 + j;
                    UnsafeUtil.MemoryAccessor memoryAccessor2 = UnsafeUtil.d;
                    byte bF5 = memoryAccessor2.f(j10);
                    if (bF5 > -65) {
                        return -1;
                    }
                    if (b6 == -32 && bF5 < -96) {
                        return -1;
                    }
                    if (b6 == b2 && bF5 >= -96) {
                        return -1;
                    }
                    j10 += 2;
                    if (memoryAccessor2.f(j13) > -65) {
                        return -1;
                    }
                } else {
                    if (i10 < 3) {
                        return j(b6, i10, j10);
                    }
                    i9 -= 4;
                    long j14 = j10 + j;
                    UnsafeUtil.MemoryAccessor memoryAccessor3 = UnsafeUtil.d;
                    byte bF6 = memoryAccessor3.f(j10);
                    if (bF6 > -65) {
                        return -1;
                    }
                    if ((((bF6 + 112) + (b6 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    long j15 = j10 + 2;
                    if (memoryAccessor3.f(j14) > -65) {
                        return -1;
                    }
                    j10 += 3;
                    if (memoryAccessor3.f(j15) > -65) {
                        return -1;
                    }
                }
                b2 = -19;
                b3 = -16;
            }
        }
    }

    static {
        f15122a = (UnsafeUtil.f && UnsafeUtil.e && !Android.a()) ? new UnsafeProcessor() : new SafeProcessor();
    }

    public static int a(int i, int i2, byte[] bArr) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return e(b, bArr[i]);
        }
        if (i3 == 2) {
            return f(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static int b(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i3 == 1) {
            return e(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return f(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        throw new AssertionError();
    }

    public static String c(ByteBuffer byteBuffer, int i, int i2) {
        Processor processor = f15122a;
        processor.getClass();
        if (byteBuffer.hasArray()) {
            return processor.a(byteBuffer.arrayOffset() + i, i2, byteBuffer.array());
        }
        return byteBuffer.isDirect() ? processor.c(byteBuffer, i, i2) : Processor.b(byteBuffer, i, i2);
    }

    public static int d(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new UnpairedSurrogateException(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + llqqqql.a00610061aaaa));
    }

    public static int e(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int f(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
