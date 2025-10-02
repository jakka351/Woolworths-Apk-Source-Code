package io.grpc;

import YU.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.io.BaseEncoding;
import com.google.common.io.ByteStreams;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes7.dex */
public final class Metadata {
    public static final Logger c = Logger.getLogger(Metadata.class.getName());
    public static final AsciiMarshaller d = new AnonymousClass2();
    public static final BaseEncoding e = BaseEncoding.f14922a.g();

    /* renamed from: a, reason: collision with root package name */
    public Object[] f23959a;
    public int b;

    /* renamed from: io.grpc.Metadata$1, reason: invalid class name */
    public class AnonymousClass1 implements BinaryMarshaller<byte[]> {
    }

    /* renamed from: io.grpc.Metadata$2, reason: invalid class name */
    public class AnonymousClass2 implements AsciiMarshaller<String> {
        @Override // io.grpc.Metadata.AsciiMarshaller
        public final String a(Object obj) {
            return (String) obj;
        }

        @Override // io.grpc.Metadata.AsciiMarshaller
        public final Object b(String str) {
            return str;
        }
    }

    public static class AsciiKey<T> extends Key<T> {
        public final AsciiMarshaller e;

        public AsciiKey(String str, AsciiMarshaller asciiMarshaller) {
            super(str, asciiMarshaller, false);
            Preconditions.h(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            Preconditions.j(asciiMarshaller, "marshaller");
            this.e = asciiMarshaller;
        }

        @Override // io.grpc.Metadata.Key
        public final Object b(byte[] bArr) {
            return this.e.b(new String(bArr, Charsets.f14860a));
        }

        @Override // io.grpc.Metadata.Key
        public final byte[] c(Object obj) {
            String strA = this.e.a(obj);
            Preconditions.j(strA, "null marshaller.toAsciiString()");
            return strA.getBytes(Charsets.f14860a);
        }
    }

    public interface AsciiMarshaller<T> {
        String a(Object obj);

        Object b(String str);
    }

    public static class BinaryKey<T> extends Key<T> {
        @Override // io.grpc.Metadata.Key
        public final Object b(byte[] bArr) {
            throw null;
        }

        @Override // io.grpc.Metadata.Key
        public final byte[] c(Object obj) {
            throw null;
        }
    }

    public interface BinaryMarshaller<T> {
    }

    @ExperimentalApi
    public interface BinaryStreamMarshaller<T> {
        InputStream a();

        Object b();
    }

    public final class IterableAt<T> implements Iterable<T> {

        /* renamed from: io.grpc.Metadata$IterableAt$1, reason: invalid class name */
        class AnonymousClass1 implements Iterator<Object> {
            public boolean d;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                if (this.d) {
                    return true;
                }
                throw null;
            }

            @Override // java.util.Iterator
            public final Object next() {
                hasNext();
                this.d = false;
                Logger logger = Metadata.c;
                throw null;
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        @Override // java.lang.Iterable
        public final Iterator iterator() {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            anonymousClass1.d = true;
            return anonymousClass1;
        }
    }

    @Immutable
    public static abstract class Key<T> {
        public static final BitSet d;

        /* renamed from: a, reason: collision with root package name */
        public final String f23960a;
        public final byte[] b;
        public final Object c;

        static {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
                bitSet.set(c);
            }
            for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
                bitSet.set(c2);
            }
            d = bitSet;
        }

        public Key(String str, Object obj, boolean z) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Preconditions.j(lowerCase, AppMeasurementSdk.ConditionalUserProperty.NAME);
            Preconditions.f("token must have at least 1 tchar", !lowerCase.isEmpty());
            if (lowerCase.equals("connection")) {
                Metadata.c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i = 0; i < lowerCase.length(); i++) {
                char cCharAt = lowerCase.charAt(i);
                if ((!z || cCharAt != ':' || i != 0) && !d.get(cCharAt)) {
                    throw new IllegalArgumentException(Strings.b("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
                }
            }
            this.f23960a = lowerCase;
            this.b = lowerCase.getBytes(Charsets.f14860a);
            this.c = obj;
        }

        public static Key a(String str, AsciiMarshaller asciiMarshaller) {
            return new AsciiKey(str, asciiMarshaller);
        }

        public abstract Object b(byte[] bArr);

        public abstract byte[] c(Object obj);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f23960a.equals(((Key) obj).f23960a);
        }

        public final int hashCode() {
            return this.f23960a.hashCode();
        }

        public final String toString() {
            return a.o(new StringBuilder("Key{name='"), this.f23960a, "'}");
        }
    }

    public static class LazyStreamBinaryKey<T> extends Key<T> {
        @Override // io.grpc.Metadata.Key
        public final Object b(byte[] bArr) {
            new ByteArrayInputStream(bArr);
            throw null;
        }

        @Override // io.grpc.Metadata.Key
        public final byte[] c(Object obj) {
            throw null;
        }
    }

    public static final class LazyValue<T> {

        /* renamed from: a, reason: collision with root package name */
        public final BinaryStreamMarshaller f23961a;
        public final Object b;
        public volatile byte[] c;

        public LazyValue(BinaryStreamMarshaller binaryStreamMarshaller, Object obj) {
            this.f23961a = binaryStreamMarshaller;
            this.b = obj;
        }

        public final byte[] a() {
            if (this.c == null) {
                synchronized (this) {
                    try {
                        if (this.c == null) {
                            InputStream inputStreamA = this.f23961a.a();
                            Preconditions.j(inputStreamA, "null marshaller.toStream()");
                            Logger logger = Metadata.c;
                            try {
                                this.c = ByteStreams.c(inputStreamA);
                            } catch (IOException e) {
                                throw new RuntimeException("failure reading serialized stream", e);
                            }
                        }
                    } finally {
                    }
                }
            }
            return this.c;
        }
    }

    public static final class TrustedAsciiKey<T> extends Key<T> {
        public final TrustedAsciiMarshaller e;

        public TrustedAsciiKey(String str, boolean z, TrustedAsciiMarshaller trustedAsciiMarshaller) {
            super(str, trustedAsciiMarshaller, z);
            Preconditions.h(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.e = trustedAsciiMarshaller;
        }

        @Override // io.grpc.Metadata.Key
        public final Object b(byte[] bArr) {
            return this.e.b(bArr);
        }

        @Override // io.grpc.Metadata.Key
        public final byte[] c(Object obj) {
            byte[] bArrA = this.e.a(obj);
            Preconditions.j(bArrA, "null marshaller.toAsciiString()");
            return bArrA;
        }
    }

    @Immutable
    public interface TrustedAsciiMarshaller<T> {
        byte[] a(Object obj);

        Object b(byte[] bArr);
    }

    public final void a(Key key) {
        if (this.b == 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                Arrays.fill(this.f23959a, i2 * 2, i3 * 2, (Object) null);
                this.b = i2;
                return;
            }
            if (!Arrays.equals(key.b, e(i))) {
                byte[] bArrE = e(i);
                Object[] objArr = this.f23959a;
                int i4 = i2 * 2;
                objArr[i4] = bArrE;
                Object obj = objArr[(i * 2) + 1];
                if (objArr instanceof byte[][]) {
                    b(objArr.length);
                }
                this.f23959a[i4 + 1] = obj;
                i2++;
            }
            i++;
        }
    }

    public final void b(int i) {
        Object[] objArr = new Object[i];
        int i2 = this.b;
        if (i2 != 0) {
            System.arraycopy(this.f23959a, 0, objArr, 0, i2 * 2);
        }
        this.f23959a = objArr;
    }

    public final Object c(Key key) {
        int i = this.b;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(key.b, e(i)));
        Object obj = this.f23959a[(i * 2) + 1];
        if (obj instanceof byte[]) {
            return key.b((byte[]) obj);
        }
        LazyValue lazyValue = (LazyValue) obj;
        lazyValue.getClass();
        if (key instanceof LazyStreamBinaryKey) {
            Object obj2 = key.c;
            BinaryStreamMarshaller binaryStreamMarshaller = (BinaryStreamMarshaller) (BinaryStreamMarshaller.class.isInstance(obj2) ? BinaryStreamMarshaller.class.cast(obj2) : null);
            if (binaryStreamMarshaller != null) {
                Preconditions.j(lazyValue.f23961a.a(), "null marshaller.toStream()");
                return binaryStreamMarshaller.b();
            }
        }
        return key.b(lazyValue.a());
    }

    public final void d(Metadata metadata) {
        int i = metadata.b;
        if (i == 0) {
            return;
        }
        Object[] objArr = this.f23959a;
        int length = objArr != null ? objArr.length : 0;
        int i2 = this.b;
        int i3 = length - (i2 * 2);
        if (i2 == 0 || i3 < i * 2) {
            b((i * 2) + (i2 * 2));
        }
        System.arraycopy(metadata.f23959a, 0, this.f23959a, this.b * 2, metadata.b * 2);
        this.b += metadata.b;
    }

    public final byte[] e(int i) {
        return (byte[]) this.f23959a[i * 2];
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(io.grpc.Metadata.Key r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r0 = "key"
            com.google.common.base.Preconditions.j(r5, r0)
            java.lang.String r0 = "value"
            com.google.common.base.Preconditions.j(r6, r0)
            int r0 = r4.b
            int r1 = r0 * 2
            if (r1 == 0) goto L19
            java.lang.Object[] r2 = r4.f23959a
            if (r2 == 0) goto L16
            int r2 = r2.length
            goto L17
        L16:
            r2 = 0
        L17:
            if (r1 != r2) goto L24
        L19:
            int r0 = r0 * 4
            r1 = 8
            int r0 = java.lang.Math.max(r0, r1)
            r4.b(r0)
        L24:
            int r0 = r4.b
            byte[] r1 = r5.b
            java.lang.Object[] r2 = r4.f23959a
            int r3 = r0 * 2
            r2[r3] = r1
            boolean r1 = r5 instanceof io.grpc.Metadata.LazyStreamBinaryKey
            if (r1 == 0) goto L5f
            io.grpc.Metadata$LazyValue r1 = new io.grpc.Metadata$LazyValue
            java.lang.Object r5 = r5.c
            java.lang.Class<io.grpc.Metadata$BinaryStreamMarshaller> r2 = io.grpc.Metadata.BinaryStreamMarshaller.class
            boolean r3 = r2.isInstance(r5)
            if (r3 == 0) goto L43
            java.lang.Object r5 = r2.cast(r5)
            goto L44
        L43:
            r5 = 0
        L44:
            io.grpc.Metadata$BinaryStreamMarshaller r5 = (io.grpc.Metadata.BinaryStreamMarshaller) r5
            r5.getClass()
            r1.<init>(r5, r6)
            java.lang.Object[] r5 = r4.f23959a
            boolean r6 = r5 instanceof byte[][]
            if (r6 == 0) goto L56
            int r5 = r5.length
            r4.b(r5)
        L56:
            java.lang.Object[] r5 = r4.f23959a
            int r0 = r0 * 2
            int r0 = r0 + 1
            r5[r0] = r1
            goto L6b
        L5f:
            byte[] r5 = r5.c(r6)
            java.lang.Object[] r6 = r4.f23959a
            int r0 = r0 * 2
            int r0 = r0 + 1
            r6[r0] = r5
        L6b:
            int r5 = r4.b
            int r5 = r5 + 1
            r4.b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.Metadata.f(io.grpc.Metadata$Key, java.lang.Object):void");
    }

    public final byte[] g(int i) {
        Object obj = this.f23959a[(i * 2) + 1];
        return obj instanceof byte[] ? (byte[]) obj : ((LazyValue) obj).a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.b; i++) {
            if (i != 0) {
                sb.append(',');
            }
            byte[] bArrE = e(i);
            Charset charset = Charsets.f14860a;
            String str = new String(bArrE, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                byte[] bArrG = g(i);
                BaseEncoding baseEncoding = e;
                baseEncoding.getClass();
                sb.append(baseEncoding.c(bArrG.length, bArrG));
            } else {
                sb.append(new String(g(i), charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
