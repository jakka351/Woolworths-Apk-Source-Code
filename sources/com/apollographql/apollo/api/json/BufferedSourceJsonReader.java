package com.apollographql.apollo.api.json;

import YU.a;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.internal.JsonScope;
import com.apollographql.apollo.exception.JsonDataException;
import com.apollographql.apollo.exception.JsonEncodingException;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/json/BufferedSourceJsonReader;", "Lcom/apollographql/apollo/api/json/JsonReader;", "Companion", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BufferedSourceJsonReader implements JsonReader {
    public static final ByteString p;
    public static final ByteString q;
    public static final ByteString r;
    public final BufferedSource d;
    public final Buffer e;
    public int f;
    public long g;
    public int h;
    public String i;
    public int[] j;
    public int k;
    public String[] l;
    public int[] m;
    public int[] n;
    public int o;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\fR\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\fR\u0014\u0010 \u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\fR\u0014\u0010!\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\fR\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\fR\u0014\u0010#\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\fR\u0014\u0010$\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\fR\u0014\u0010%\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\fR\u0014\u0010&\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\f¨\u0006'"}, d2 = {"Lcom/apollographql/apollo/api/json/BufferedSourceJsonReader$Companion;", "", "", "MIN_INCOMPLETE_INTEGER", "J", "Lokio/ByteString;", "SINGLE_QUOTE_OR_SLASH", "Lokio/ByteString;", "DOUBLE_QUOTE_OR_SLASH", "UNQUOTED_STRING_TERMINALS", "", "PEEKED_NONE", "I", "PEEKED_BEGIN_OBJECT", "PEEKED_END_OBJECT", "PEEKED_BEGIN_ARRAY", "PEEKED_END_ARRAY", "PEEKED_TRUE", "PEEKED_FALSE", "PEEKED_NULL", "PEEKED_SINGLE_QUOTED", "PEEKED_DOUBLE_QUOTED", "PEEKED_UNQUOTED", "PEEKED_BUFFERED", "PEEKED_SINGLE_QUOTED_NAME", "PEEKED_DOUBLE_QUOTED_NAME", "PEEKED_UNQUOTED_NAME", "PEEKED_LONG", "PEEKED_NUMBER", "PEEKED_EOF", "NUMBER_CHAR_NONE", "NUMBER_CHAR_SIGN", "NUMBER_CHAR_DIGIT", "NUMBER_CHAR_DECIMAL", "NUMBER_CHAR_FRACTION_DIGIT", "NUMBER_CHAR_EXP_E", "NUMBER_CHAR_EXP_SIGN", "NUMBER_CHAR_EXP_DIGIT", "INITIAL_STACK_SIZE", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ByteString byteString = ByteString.g;
        p = ByteString.Companion.b("'\\");
        q = ByteString.Companion.b("\"\\");
        r = ByteString.Companion.b("{}[]:, \n\t\r/\\;#=");
    }

    public BufferedSourceJsonReader(BufferedSource source) {
        Intrinsics.h(source, "source");
        this.d = source;
        this.e = source.getE();
        int[] iArr = new int[64];
        iArr[0] = 6;
        this.j = iArr;
        this.k = 1;
        this.l = new String[64];
        this.m = new int[64];
        int[] iArr2 = new int[64];
        iArr2[0] = 0;
        this.n = iArr2;
        this.o = 1;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final JsonReader G() {
        Integer numValueOf = Integer.valueOf(this.f);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) != 1) {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + getF() + " at path " + b());
        }
        g(3);
        this.f = 0;
        int i = this.o;
        this.o = i + 1;
        this.n[i] = 0;
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final JsonReader K() {
        Integer numValueOf = Integer.valueOf(this.f);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + getF() + " at path " + b());
        }
        int i = this.k;
        int i2 = i - 1;
        this.k = i2;
        this.l[i2] = null;
        int[] iArr = this.m;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f = 0;
        this.o--;
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final JsonNumber Q0() {
        String strNextString = nextString();
        Intrinsics.e(strNextString);
        return new JsonNumber(strNextString);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0164 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.api.json.BufferedSourceJsonReader.a():int");
    }

    public final String b() {
        return CollectionsKt.M(getPath(), ".", null, null, null, 62);
    }

    public final boolean c(char c) {
        if (c == '\t' || c == '\n' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        j("Unexpected character: " + c);
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f = 0;
        this.j[0] = 8;
        this.k = 1;
        this.e.a();
        this.d.close();
    }

    public final int d(boolean z) throws EOFException {
        int i = 0;
        while (true) {
            long j = i;
            BufferedSource bufferedSource = this.d;
            if (!bufferedSource.request(j + 1)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            i++;
            Buffer buffer = this.e;
            byte bE = buffer.e(j);
            if (bE != 9 && bE != 10 && bE != 13 && bE != 32) {
                buffer.skip(i - 1);
                if (bE == 35) {
                    j("Malformed JSON");
                    throw null;
                }
                if (bE != 47 || !bufferedSource.request(2L)) {
                    return bE;
                }
                j("Malformed JSON");
                throw null;
            }
        }
    }

    public final String e(ByteString byteString) {
        StringBuilder sb = null;
        while (true) {
            long jV = this.d.V(byteString);
            if (jV == -1) {
                j("Unterminated string");
                throw null;
            }
            Buffer buffer = this.e;
            if (buffer.e(jV) != 92) {
                if (sb == null) {
                    String strR = buffer.r(jV, Charsets.f24671a);
                    buffer.readByte();
                    return strR;
                }
                sb.append(buffer.r(jV, Charsets.f24671a));
                buffer.readByte();
                String string = sb.toString();
                Intrinsics.e(string);
                return string;
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(buffer.r(jV, Charsets.f24671a));
            buffer.readByte();
            sb.append(h());
        }
    }

    public final String f() {
        long jV = this.d.V(r);
        Buffer buffer = this.e;
        if (jV == -1) {
            return buffer.v();
        }
        buffer.getClass();
        return buffer.r(jV, Charsets.f24671a);
    }

    public final void g(int i) {
        int i2 = this.k;
        int[] iArr = this.j;
        if (i2 == iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.g(iArrCopyOf, "copyOf(...)");
            this.j = iArrCopyOf;
            String[] strArr = this.l;
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length * 2);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            this.l = (String[]) objArrCopyOf;
            int[] iArr2 = this.m;
            int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length * 2);
            Intrinsics.g(iArrCopyOf2, "copyOf(...)");
            this.m = iArrCopyOf2;
            int[] iArr3 = this.n;
            int[] iArrCopyOf3 = Arrays.copyOf(iArr3, iArr3.length * 2);
            Intrinsics.g(iArrCopyOf3, "copyOf(...)");
            this.n = iArrCopyOf3;
        }
        int[] iArr4 = this.j;
        int i3 = this.k;
        this.k = i3 + 1;
        iArr4[i3] = i;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final ArrayList getPath() {
        return JsonScope.a(this.k, this.j, this.m, this.l);
    }

    public final char h() throws EOFException {
        int i;
        BufferedSource bufferedSource = this.d;
        if (!bufferedSource.request(1L)) {
            j("Unterminated escape sequence");
            throw null;
        }
        Buffer buffer = this.e;
        char c = (char) buffer.readByte();
        if (c == '\n' || c == '\"' || c == '\'' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            j("Invalid escape sequence: \\" + c);
            throw null;
        }
        if (!bufferedSource.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c2 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bE = buffer.e(i2);
            char c3 = (char) (c2 << 4);
            if (bE >= 48 && bE <= 57) {
                i = bE - 48;
            } else if (bE >= 97 && bE <= 102) {
                i = bE - 87;
            } else {
                if (bE < 65 || bE > 70) {
                    j("\\u".concat(buffer.r(4L, Charsets.f24671a)));
                    throw null;
                }
                i = bE - 55;
            }
            c2 = (char) (c3 + i);
        }
        buffer.skip(4L);
        return c2;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final boolean hasNext() {
        Integer numValueOf = Integer.valueOf(this.f);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        return (iIntValue == 2 || iIntValue == 4) ? false : true;
    }

    public final void i(ByteString byteString) throws EOFException {
        while (true) {
            long jV = this.d.V(byteString);
            if (jV == -1) {
                j("Unterminated string");
                throw null;
            }
            Buffer buffer = this.e;
            if (buffer.e(jV) != 92) {
                buffer.skip(jV + 1);
                return;
            } else {
                buffer.skip(jV + 1);
                h();
            }
        }
    }

    public final void j(String str) {
        StringBuilder sbT = a.t(str, " at path ");
        sbT.append(getPath());
        throw new JsonEncodingException(sbT.toString());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final boolean nextBoolean() {
        Integer numValueOf = Integer.valueOf(this.f);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        if (iIntValue == 5) {
            this.f = 0;
            int[] iArr = this.m;
            int i = this.k - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iIntValue == 6) {
            this.f = 0;
            int[] iArr2 = this.m;
            int i2 = this.k - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + getF() + " at path " + b());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final double nextDouble() throws NumberFormatException {
        Integer numValueOf = Integer.valueOf(this.f);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        if (iIntValue == 15) {
            this.f = 0;
            int[] iArr = this.m;
            int i = this.k - 1;
            iArr[i] = iArr[i] + 1;
            return this.g;
        }
        if (iIntValue == 16) {
            long j = this.h;
            Buffer buffer = this.e;
            buffer.getClass();
            this.i = buffer.r(j, Charsets.f24671a);
        } else if (iIntValue == 9) {
            this.i = e(q);
        } else if (iIntValue == 8) {
            this.i = e(p);
        } else if (iIntValue == 10) {
            this.i = f();
        } else if (iIntValue != 11) {
            throw new JsonDataException("Expected a double but was " + getF() + " at path " + b());
        }
        this.f = 11;
        try {
            String str = this.i;
            Intrinsics.e(str);
            double d = Double.parseDouble(str);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                StringBuilder sbN = androidx.constraintlayout.core.state.a.n(d, "JSON forbids NaN and infinities: ", " at path ");
                sbN.append(b());
                throw new JsonEncodingException(sbN.toString());
            }
            this.i = null;
            this.f = 0;
            int[] iArr2 = this.m;
            int i2 = this.k - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.i + " at path " + b());
        }
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final int nextInt() throws NumberFormatException {
        int i = this.f;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        if (iIntValue == 15) {
            long j = this.g;
            int i2 = (int) j;
            if (j == i2) {
                this.f = 0;
                int[] iArr = this.m;
                int i3 = this.k - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.g + " at path " + getPath());
        }
        if (iIntValue == 16) {
            long j2 = this.h;
            Buffer buffer = this.e;
            buffer.getClass();
            this.i = buffer.r(j2, Charsets.f24671a);
        } else if (iIntValue == 9 || iIntValue == 8) {
            String strE = e(iIntValue == 9 ? q : p);
            this.i = strE;
            try {
                int i4 = Integer.parseInt(strE);
                this.f = 0;
                int[] iArr2 = this.m;
                int i5 = this.k - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        } else if (iIntValue != 11) {
            throw new JsonDataException("Expected an int but was " + getF() + " at path " + b());
        }
        this.f = 11;
        try {
            String str = this.i;
            Intrinsics.e(str);
            double d = Double.parseDouble(str);
            int i6 = (int) d;
            if (i6 != d) {
                throw new JsonDataException("Expected an int but was " + this.i + " at path " + b());
            }
            this.i = null;
            this.f = 0;
            int[] iArr3 = this.m;
            int i7 = this.k - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.i + " at path " + b());
        }
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final long nextLong() throws NumberFormatException {
        Integer numValueOf = Integer.valueOf(this.f);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        if (iIntValue == 15) {
            this.f = 0;
            int[] iArr = this.m;
            int i = this.k - 1;
            iArr[i] = iArr[i] + 1;
            return this.g;
        }
        if (iIntValue == 16) {
            long j = this.h;
            Buffer buffer = this.e;
            buffer.getClass();
            this.i = buffer.r(j, Charsets.f24671a);
        } else if (iIntValue == 9 || iIntValue == 8) {
            String strE = e(iIntValue == 9 ? q : p);
            this.i = strE;
            try {
                long j2 = Long.parseLong(strE);
                this.f = 0;
                int[] iArr2 = this.m;
                int i2 = this.k - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        } else if (iIntValue != 11) {
            throw new JsonDataException("Expected a long but was " + getF() + " at path " + b());
        }
        this.f = 11;
        try {
            String str = this.i;
            Intrinsics.e(str);
            double d = Double.parseDouble(str);
            long j3 = (long) d;
            if (j3 != d) {
                throw new JsonDataException("Expected a long but was " + this.i + " at path " + b());
            }
            this.i = null;
            this.f = 0;
            int[] iArr3 = this.m;
            int i3 = this.k - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return j3;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.i + " at path " + b());
        }
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final String nextName() {
        String strE;
        Integer numValueOf = Integer.valueOf(this.f);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        switch (numValueOf != null ? numValueOf.intValue() : a()) {
            case 12:
                strE = e(p);
                break;
            case 13:
                strE = e(q);
                break;
            case 14:
                strE = f();
                break;
            default:
                throw new JsonDataException("Expected a name but was " + getF() + " at path " + b());
        }
        this.f = 0;
        this.l[this.k - 1] = strE;
        return strE;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final void nextNull() {
        int i = this.f;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) == 7) {
            this.f = 0;
            int[] iArr = this.m;
            int i2 = this.k - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new JsonDataException("Expected null but was " + getF() + " at path " + b());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final String nextString() {
        Integer numValueOf = Integer.valueOf(this.f);
        String strValueOf = null;
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        if (iIntValue == 15) {
            strValueOf = String.valueOf(this.g);
        } else if (iIntValue != 16) {
            switch (iIntValue) {
                case 8:
                    strValueOf = e(p);
                    break;
                case 9:
                    strValueOf = e(q);
                    break;
                case 10:
                    strValueOf = f();
                    break;
                case 11:
                    String str = this.i;
                    if (str != null) {
                        this.i = null;
                        strValueOf = str;
                        break;
                    }
                    break;
                default:
                    throw new JsonDataException("Expected a string but was " + getF() + " at path " + b());
            }
        } else {
            long j = this.h;
            Buffer buffer = this.e;
            buffer.getClass();
            strValueOf = buffer.r(j, Charsets.f24671a);
        }
        this.f = 0;
        int[] iArr = this.m;
        int i = this.k - 1;
        iArr[i] = iArr[i] + 1;
        return strValueOf;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final void o() {
        throw new IllegalStateException("BufferedSourceJsonReader cannot rewind.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        skipValue();
     */
    @Override // com.apollographql.apollo.api.json.JsonReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o2(java.util.List r7) throws java.io.EOFException {
        /*
            r6 = this;
            java.lang.String r0 = "names"
            kotlin.jvm.internal.Intrinsics.h(r7, r0)
            boolean r0 = r7.isEmpty()
            r1 = -1
            if (r0 == 0) goto Ld
            return r1
        Ld:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7e
            java.lang.String r0 = r6.nextName()
            int[] r2 = r6.n
            int r3 = r6.o
            int r3 = r3 + (-1)
            r2 = r2[r3]
            java.lang.Object r3 = r7.get(r2)
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r3, r0)
            r4 = 0
            if (r3 == 0) goto L47
            int[] r0 = r6.n
            int r1 = r6.o
            int r3 = r1 + (-1)
            int r5 = r2 + 1
            r0[r3] = r5
            int r1 = r1 + (-1)
            r0 = r0[r1]
            int r7 = r7.size()
            if (r0 != r7) goto L46
            int[] r7 = r6.n
            int r0 = r6.o
            int r0 = r0 + (-1)
            r7[r0] = r4
        L46:
            return r2
        L47:
            r3 = r2
        L48:
            int r3 = r3 + 1
            int r5 = r7.size()
            if (r3 != r5) goto L51
            r3 = r4
        L51:
            if (r3 != r2) goto L57
            r6.skipValue()
            goto Ld
        L57:
            java.lang.Object r5 = r7.get(r3)
            boolean r5 = kotlin.jvm.internal.Intrinsics.c(r5, r0)
            if (r5 == 0) goto L48
            int[] r0 = r6.n
            int r1 = r6.o
            int r2 = r1 + (-1)
            int r5 = r3 + 1
            r0[r2] = r5
            int r1 = r1 + (-1)
            r0 = r0[r1]
            int r7 = r7.size()
            if (r0 != r7) goto L7d
            int[] r7 = r6.n
            int r0 = r6.o
            int r0 = r0 + (-1)
            r7[r0] = r4
        L7d:
            return r3
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.api.json.BufferedSourceJsonReader.o2(java.util.List):int");
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    /* renamed from: peek */
    public final JsonReader.Token getF() {
        Integer numValueOf = Integer.valueOf(this.f);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        switch (numValueOf != null ? numValueOf.intValue() : a()) {
            case 1:
                return JsonReader.Token.f;
            case 2:
                return JsonReader.Token.g;
            case 3:
                return JsonReader.Token.d;
            case 4:
                return JsonReader.Token.e;
            case 5:
            case 6:
                return JsonReader.Token.l;
            case 7:
                return JsonReader.Token.m;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.i;
            case 12:
            case 13:
            case 14:
                return JsonReader.Token.h;
            case 15:
                return JsonReader.Token.k;
            case 16:
                return JsonReader.Token.j;
            case 17:
                return JsonReader.Token.n;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final void skipValue() throws EOFException {
        int i = 0;
        do {
            int i2 = this.f;
            Integer numValueOf = Integer.valueOf(i2);
            if (i2 == 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
            Buffer buffer = this.e;
            switch (iIntValue) {
                case 1:
                    g(3);
                    i++;
                    break;
                case 2:
                    this.k--;
                    i--;
                    break;
                case 3:
                    g(1);
                    i++;
                    break;
                case 4:
                    this.k--;
                    i--;
                    break;
                case 8:
                case 12:
                    i(p);
                    break;
                case 9:
                case 13:
                    i(q);
                    break;
                case 10:
                case 14:
                    long jV = this.d.V(r);
                    if (jV == -1) {
                        jV = buffer.e;
                    }
                    buffer.skip(jV);
                    break;
                case 16:
                    buffer.skip(this.h);
                    break;
            }
            this.f = 0;
        } while (i != 0);
        int[] iArr = this.m;
        int i3 = this.k - 1;
        iArr[i3] = iArr[i3] + 1;
        this.l[i3] = "null";
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final JsonReader w() {
        Integer numValueOf = Integer.valueOf(this.f);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + getF() + " at path " + b());
        }
        int i = this.k;
        this.k = i - 1;
        int[] iArr = this.m;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f = 0;
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final JsonReader y() {
        Integer numValueOf = Integer.valueOf(this.f);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) == 3) {
            g(1);
            this.m[this.k - 1] = 0;
            this.f = 0;
            return this;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + getF() + " at path " + b());
    }
}
