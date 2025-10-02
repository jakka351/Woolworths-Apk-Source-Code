package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public abstract class GeneratorBase extends JsonGenerator {
    public static final int i = (JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.e | JsonGenerator.Feature.ESCAPE_NON_ASCII.e) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.e;
    public ObjectCodec e;
    public int f;
    public boolean g;
    public JsonWriteContext h;

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void C1(SerializableString serializableString) {
        J1(serializableString.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void T(SerializableString serializableString) {
        U(serializableString.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void T0(SerializableString serializableString) {
        b2("write raw value");
        H0(serializableString);
    }

    public final String U1(BigDecimal bigDecimal) throws JsonGenerationException {
        if (!JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.b(this.f)) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale >= -9999 && iScale <= 9999) {
            return bigDecimal.toPlainString();
        }
        a(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void V0(String str) {
        b2("write raw value");
        O0(str);
    }

    public final void V1(int i2, int i3, byte[] bArr) throws JsonGenerationException {
        if (bArr == null) {
            a("Invalid `byte[]` argument: `null`");
            throw null;
        }
        int length = bArr.length;
        int i4 = i2 + i3;
        if (((length - i4) | i2 | i3 | i4) >= 0) {
            return;
        }
        a(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `byte[]` of length %d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(length)));
        throw null;
    }

    public final void W1(char[] cArr, int i2) throws JsonGenerationException {
        if (cArr == null) {
            a("Invalid `char[]` argument: `null`");
            throw null;
        }
        int length = cArr.length;
        if (((length - i2) | i2) >= 0) {
            return;
        }
        a(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", 0, Integer.valueOf(i2), Integer.valueOf(length)));
        throw null;
    }

    public void Y1(int i2, int i3) {
        if ((i & i3) == 0) {
            return;
        }
        this.g = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.b(i2);
        JsonGenerator.Feature feature = JsonGenerator.Feature.ESCAPE_NON_ASCII;
        if (feature.b(i3)) {
            if (feature.b(i2)) {
                j(127);
            } else {
                j(0);
            }
        }
        JsonGenerator.Feature feature2 = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
        if (feature2.b(i3)) {
            if (!feature2.b(i2)) {
                JsonWriteContext jsonWriteContext = this.h;
                jsonWriteContext.d = null;
                this.h = jsonWriteContext;
            } else {
                JsonWriteContext jsonWriteContext2 = this.h;
                if (jsonWriteContext2.d == null) {
                    jsonWriteContext2.d = new DupDetector(this);
                    this.h = jsonWriteContext2;
                }
            }
        }
    }

    public abstract void b2(String str);

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public JsonGenerator d2(JsonGenerator.Feature feature) {
        int i2 = feature.e;
        this.f &= ~i2;
        if ((i2 & i) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this.g = false;
                return this;
            }
            if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                j(0);
                return this;
            }
            if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION) {
                JsonWriteContext jsonWriteContext = this.h;
                jsonWriteContext.d = null;
                this.h = jsonWriteContext;
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final JsonStreamContext f() {
        return this.h;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean h(JsonGenerator.Feature feature) {
        return (feature.e & this.f) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void i(Object obj) {
        JsonWriteContext jsonWriteContext = this.h;
        if (jsonWriteContext != null) {
            jsonWriteContext.g = obj;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int v(Base64Variant base64Variant, InputStream inputStream, int i2) {
        throw new UnsupportedOperationException("Operation not supported by generator of type ".concat(getClass().getName()));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeObject(Object obj) {
        if (obj == null) {
            Y();
            return;
        }
        ObjectCodec objectCodec = this.e;
        if (objectCodec != null) {
            objectCodec.c(this, obj);
            return;
        }
        if (obj instanceof String) {
            J1((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                d0(number.intValue());
                return;
            }
            if (number instanceof Long) {
                i0(number.longValue());
                return;
            }
            if (number instanceof Double) {
                Z(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                b0(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                t0(number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                t0(number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                r0((BigInteger) number);
                return;
            }
            if (number instanceof BigDecimal) {
                m0((BigDecimal) number);
                return;
            } else if (number instanceof AtomicInteger) {
                d0(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                i0(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            x(Base64Variants.b, bArr, 0, bArr.length);
            return;
        } else if (obj instanceof Boolean) {
            A(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            A(((AtomicBoolean) obj).get());
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void x1(Object obj) {
        p1();
        if (obj != null) {
            i(obj);
        }
    }
}
