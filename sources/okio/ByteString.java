package okio;

import YU.a;
import androidx.compose.ui.platform.i;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okio.internal.ByteStringNonJs;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "(Ljava/io/ObjectOutputStream;)V", "", "d", "[B", "getData$okio", "()[B", "data", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final ByteString g = new ByteString(new byte[0]);

    /* renamed from: d, reason: from kotlin metadata */
    public final byte[] data;
    public transient int e;
    public transient String f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lokio/ByteString$Companion;", "", "", "serialVersionUID", "J", "Lokio/ByteString;", "EMPTY", "Lokio/ByteString;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static ByteString a(String str) {
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (ByteStringNonJs.a(str.charAt(i2 + 1)) + (ByteStringNonJs.a(str.charAt(i2)) << 4));
            }
            return new ByteString(bArr);
        }

        public static ByteString b(String str) {
            Intrinsics.h(str, "<this>");
            byte[] bytes = str.getBytes(Charsets.f24671a);
            Intrinsics.g(bytes, "getBytes(...)");
            ByteString byteString = new ByteString(bytes);
            byteString.f = str;
            return byteString;
        }

        public static ByteString c(byte... data) {
            Intrinsics.h(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            Intrinsics.g(bArrCopyOf, "copyOf(...)");
            return new ByteString(bArrCopyOf);
        }

        public static ByteString d(byte[] bArr) {
            ByteString byteString = ByteString.g;
            Intrinsics.h(bArr, "<this>");
            int length = bArr.length;
            SegmentedByteString.b(bArr.length, 0, length);
            return new ByteString(ArraysKt.y(bArr, 0, length));
        }
    }

    public ByteString(byte[] data) {
        Intrinsics.h(data, "data");
        this.data = data;
    }

    public static int f(ByteString byteString, ByteString other) {
        byteString.getClass();
        Intrinsics.h(other, "other");
        return byteString.e(0, other.getData());
    }

    public static int o(ByteString byteString, ByteString other) {
        byteString.getClass();
        Intrinsics.h(other, "other");
        return byteString.n(other.getData());
    }

    private final void readObject(ObjectInputStream in) throws IllegalAccessException, NoSuchFieldException, IOException, SecurityException, IllegalArgumentException {
        int i = in.readInt();
        if (i < 0) {
            throw new IllegalArgumentException(a.d(i, "byteCount < 0: ").toString());
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = in.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        ByteString byteString = new ByteString(bArr);
        Field declaredField = ByteString.class.getDeclaredField("d");
        declaredField.setAccessible(true);
        declaredField.set(this, byteString.data);
    }

    public static /* synthetic */ ByteString u(ByteString byteString, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return byteString.t(i, i2);
    }

    private final void writeObject(ObjectOutputStream out) throws IOException {
        out.writeInt(this.data.length);
        out.write(this.data);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ByteString other) {
        Intrinsics.h(other, "other");
        int iC = c();
        int iC2 = other.c();
        int iMin = Math.min(iC, iC2);
        for (int i = 0; i < iMin; i++) {
            int iM = m(i) & 255;
            int iM2 = other.m(i) & 255;
            if (iM != iM2) {
                return iM < iM2 ? -1 : 1;
            }
        }
        if (iC == iC2) {
            return 0;
        }
        return iC < iC2 ? -1 : 1;
    }

    public ByteString b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, c());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.e(bArrDigest);
        return new ByteString(bArrDigest);
    }

    public int c() {
        return this.data.length;
    }

    public String d() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = okio.internal.ByteString.f26786a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public int e(int i, byte[] other) {
        Intrinsics.h(other, "other");
        int length = this.data.length - other.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.a(iMax, 0, other.length, this.data, other)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int iC = byteString.c();
            byte[] bArr = this.data;
            if (iC == bArr.length && byteString.p(0, 0, bArr, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.data);
        this.e = iHashCode;
        return iHashCode;
    }

    /* renamed from: l, reason: from getter */
    public byte[] getData() {
        return this.data;
    }

    public byte m(int i) {
        return this.data[i];
    }

    public int n(byte[] other) {
        Intrinsics.h(other, "other");
        for (int iMin = Math.min(c(), this.data.length - other.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.a(iMin, 0, other.length, this.data, other)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean p(int i, int i2, byte[] other, int i3) {
        Intrinsics.h(other, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr = this.data;
        return i <= bArr.length - i3 && i2 >= 0 && i2 <= other.length - i3 && SegmentedByteString.a(i, i2, i3, bArr, other);
    }

    public boolean q(int i, ByteString other, int i2) {
        Intrinsics.h(other, "other");
        return other.p(0, i, this.data, i2);
    }

    public final boolean r(ByteString prefix) {
        Intrinsics.h(prefix, "prefix");
        return q(0, prefix, prefix.c());
    }

    public String s(Charset charset) {
        Intrinsics.h(charset, "charset");
        return new String(this.data, charset);
    }

    public ByteString t(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = c();
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.data;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException(a.l(new StringBuilder("endIndex > length("), this.data.length, ')').toString());
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new ByteString(ArraysKt.y(bArr, i, i2));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public String toString() {
        byte b;
        int i;
        byte[] bArr = this.data;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (127 <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 < 2048) {
                                if (i4 != 64) {
                                    break;
                                }
                            } else if (55296 > i9 || i9 >= 57344) {
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                    break;
                                }
                                i3 += i9 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 > 1114111) {
                                    if (i4 != 64) {
                                        break;
                                    }
                                } else if (55296 > i11 || i11 >= 57344) {
                                    if (i11 >= 65536) {
                                        i = i4 + 1;
                                        if (i4 == 64) {
                                            break;
                                        }
                                        if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                            break;
                                        }
                                        i3 += i11 < 65536 ? 1 : 2;
                                        i2 += 4;
                                        i4 = i;
                                    } else if (i4 != 64) {
                                        break;
                                    }
                                } else if (i4 != 64) {
                                    break;
                                }
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if (i4 != 64) {
                break;
            }
        }
        i3 = -1;
        if (i3 != -1) {
            String strY = y();
            String strSubstring = strY.substring(0, i3);
            Intrinsics.g(strSubstring, "substring(...)");
            String strQ = StringsKt.Q(StringsKt.Q(StringsKt.Q(strSubstring, "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            if (i3 >= strY.length()) {
                return i.a(']', "[text=", strQ);
            }
            return "[size=" + this.data.length + " text=" + strQ + "…]";
        }
        if (this.data.length <= 64) {
            return "[hex=" + d() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(this.data.length);
        sb.append(" hex=");
        byte[] bArr2 = this.data;
        if (64 > bArr2.length) {
            throw new IllegalArgumentException(a.l(new StringBuilder("endIndex > length("), this.data.length, ')').toString());
        }
        sb.append((64 == bArr2.length ? this : new ByteString(ArraysKt.y(bArr2, 0, 64))).d());
        sb.append("…]");
        return sb.toString();
    }

    public ByteString w() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.g(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
            i++;
        }
    }

    public byte[] x() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.g(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public final String y() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        byte[] data = getData();
        Intrinsics.h(data, "<this>");
        String str2 = new String(data, Charsets.f24671a);
        this.f = str2;
        return str2;
    }

    public void z(Buffer buffer, int i) {
        buffer.write(this.data, 0, i);
    }
}
