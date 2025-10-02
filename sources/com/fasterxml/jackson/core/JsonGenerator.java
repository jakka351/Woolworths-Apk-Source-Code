package com.fasterxml.jackson.core;

import androidx.constraintlayout.core.state.a;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Closeable;
import java.io.Flushable;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public abstract class JsonGenerator implements Closeable, Flushable, Versioned {
    public PrettyPrinter d;

    /* renamed from: com.fasterxml.jackson.core.JsonGenerator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14191a;

        static {
            int[] iArr = new int[WritableTypeId.Inclusion.values().length];
            f14191a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14191a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14191a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14191a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14191a[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false),
        USE_FAST_DOUBLE_WRITER(false),
        WRITE_HEX_UPPER_CASE(true);

        public final boolean d;
        public final int e = 1 << ordinal();

        Feature(boolean z) {
            this.d = z;
        }

        public static int a() {
            int i = 0;
            for (Feature feature : values()) {
                if (feature.d) {
                    i |= feature.e;
                }
            }
            return i;
        }

        public final boolean b(int i) {
            return (i & this.e) != 0;
        }
    }

    static {
        JacksonFeatureSet.a(StreamWriteCapability.values());
        StreamWriteCapability.CAN_WRITE_FORMATTED_NUMBERS.a();
        StreamWriteCapability.CAN_WRITE_BINARY_NATIVELY.a();
    }

    public static void b(int i, int i2) {
        if (i2 > i) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", 0, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public abstract void A(boolean z);

    public void B0() throws JsonGenerationException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void C(Object obj) throws JsonGenerationException {
        if (obj == null) {
            Y();
        } else {
            if (!(obj instanceof byte[])) {
                throw new JsonGenerationException(a.g(obj, "No native support for writing embedded objects of type "), this);
            }
            byte[] bArr = (byte[]) obj;
            x(Base64Variants.b, bArr, 0, bArr.length);
        }
    }

    public abstract void C1(SerializableString serializableString);

    public abstract void F();

    public abstract void G0(char c);

    public abstract void H();

    public void H0(SerializableString serializableString) {
        O0(serializableString.getValue());
    }

    public abstract void J1(String str);

    public abstract void K1(char[] cArr, int i, int i2);

    public void N1(Object obj) throws JsonGenerationException {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    public abstract void O0(String str);

    public abstract void P0(char[] cArr, int i);

    public final void P1(WritableTypeId writableTypeId) throws JsonGenerationException {
        Object obj = writableTypeId.c;
        JsonToken jsonToken = writableTypeId.f;
        if (e()) {
            writableTypeId.g = false;
            N1(obj);
        } else {
            String strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            writableTypeId.g = true;
            WritableTypeId.Inclusion inclusion = writableTypeId.e;
            if (jsonToken != JsonToken.START_OBJECT) {
                inclusion.getClass();
                if (inclusion == WritableTypeId.Inclusion.f || inclusion == WritableTypeId.Inclusion.g) {
                    inclusion = WritableTypeId.Inclusion.d;
                    writableTypeId.e = inclusion;
                }
            }
            int iOrdinal = inclusion.ordinal();
            if (iOrdinal == 1) {
                p1();
                U(strValueOf);
            } else if (iOrdinal == 2) {
                x1(writableTypeId.f14217a);
                U(writableTypeId.d);
                J1(strValueOf);
                return;
            } else if (iOrdinal != 3 && iOrdinal != 4) {
                W0();
                J1(strValueOf);
            }
        }
        if (jsonToken == JsonToken.START_OBJECT) {
            x1(writableTypeId.f14217a);
        } else if (jsonToken == JsonToken.START_ARRAY) {
            W0();
        }
    }

    public void R(long j) {
        U(Long.toString(j));
    }

    public final void R1(WritableTypeId writableTypeId) {
        JsonToken jsonToken = writableTypeId.f;
        if (jsonToken == JsonToken.START_OBJECT) {
            H();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            F();
        }
        if (writableTypeId.g) {
            int iOrdinal = writableTypeId.e.ordinal();
            if (iOrdinal == 0) {
                F();
                return;
            }
            if (iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                H();
                return;
            }
            Object obj = writableTypeId.c;
            String strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            U(writableTypeId.d);
            J1(strValueOf);
        }
    }

    public abstract void T(SerializableString serializableString);

    public void T0(SerializableString serializableString) {
        V0(serializableString.getValue());
    }

    public abstract void U(String str);

    public abstract void V0(String str);

    public abstract void W0();

    public abstract void Y();

    public abstract void Z(double d);

    public final void a(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, this);
    }

    public void a1(int i, Object obj) {
        m1();
        i(obj);
    }

    public abstract void b0(float f);

    public void b1(Object obj) {
        W0();
        i(obj);
    }

    public boolean c() {
        return this instanceof TokenBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public boolean d() {
        return false;
    }

    public abstract void d0(int i);

    public boolean e() {
        return false;
    }

    public abstract JsonStreamContext f();

    @Override // java.io.Flushable
    public abstract void flush();

    public PrettyPrinter g() {
        return this.d;
    }

    public abstract boolean h(Feature feature);

    public void i(Object obj) {
        JsonStreamContext jsonStreamContextF = f();
        if (jsonStreamContextF != null) {
            jsonStreamContextF.g(obj);
        }
    }

    public abstract void i0(long j);

    public void j(int i) {
    }

    public void k(PrettyPrinter prettyPrinter) {
        this.d = prettyPrinter;
    }

    public abstract void k0(String str);

    public void l(int i, int[] iArr) {
        if (iArr == null) {
            throw new IllegalArgumentException("null array");
        }
        b(iArr.length, i);
        a1(i, iArr);
        for (int i2 = 0; i2 < i; i2++) {
            d0(iArr[i2]);
        }
        F();
    }

    public abstract void m0(BigDecimal bigDecimal);

    public void m1() {
        W0();
    }

    public void p(double[] dArr, int i) {
        if (dArr == null) {
            throw new IllegalArgumentException("null array");
        }
        b(dArr.length, i);
        a1(i, dArr);
        for (int i2 = 0; i2 < i; i2++) {
            Z(dArr[i2]);
        }
        F();
    }

    public abstract void p1();

    public void r(long[] jArr, int i) {
        if (jArr == null) {
            throw new IllegalArgumentException("null array");
        }
        b(jArr.length, i);
        a1(i, jArr);
        for (int i2 = 0; i2 < i; i2++) {
            i0(jArr[i2]);
        }
        F();
    }

    public abstract void r0(BigInteger bigInteger);

    public void t0(short s) {
        d0(s);
    }

    public abstract int v(Base64Variant base64Variant, InputStream inputStream, int i);

    public abstract void writeObject(Object obj);

    public abstract void x(Base64Variant base64Variant, byte[] bArr, int i, int i2);

    public void x1(Object obj) {
        p1();
        i(obj);
    }

    public void y1(Object obj) {
        x1(obj);
    }

    public void z0(Object obj) throws JsonGenerationException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }
}
