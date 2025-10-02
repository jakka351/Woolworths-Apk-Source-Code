package com.apollographql.apollo.api.json;

import com.apollographql.apollo.api.Upload;
import com.apollographql.apollo.api.json.internal.JsonScope;
import java.io.IOException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSink;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/json/BufferedSinkJsonWriter;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "Companion", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BufferedSinkJsonWriter implements JsonWriter {
    public static final Companion j = new Companion();
    public static final String[] k;
    public final BufferedSink d;
    public int e;
    public int[] f = new int[64];
    public String[] g = new String[64];
    public int[] h = new int[64];
    public String i;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/apollographql/apollo/api/json/BufferedSinkJsonWriter$Companion;", "", "", "HEX_ARRAY", "Ljava/lang/String;", "", "REPLACEMENT_CHARS", "[Ljava/lang/String;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(okio.BufferedSink r7, java.lang.String r8) {
            /*
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.h(r8, r0)
                java.lang.String[] r0 = com.apollographql.apollo.api.json.BufferedSinkJsonWriter.k
                r1 = 34
                r7.writeByte(r1)
                int r2 = r8.length()
                r3 = 0
                r4 = r3
            L12:
                if (r3 >= r2) goto L3b
                char r5 = r8.charAt(r3)
                r6 = 128(0x80, float:1.794E-43)
                if (r5 >= r6) goto L21
                r5 = r0[r5]
                if (r5 != 0) goto L2e
                goto L38
            L21:
                r6 = 8232(0x2028, float:1.1535E-41)
                if (r5 != r6) goto L28
                java.lang.String r5 = "\\u2028"
                goto L2e
            L28:
                r6 = 8233(0x2029, float:1.1537E-41)
                if (r5 != r6) goto L38
                java.lang.String r5 = "\\u2029"
            L2e:
                if (r4 >= r3) goto L33
                r7.i2(r4, r3, r8)
            L33:
                r7.r1(r5)
                int r4 = r3 + 1
            L38:
                int r3 = r3 + 1
                goto L12
            L3b:
                if (r4 >= r2) goto L40
                r7.i2(r4, r2, r8)
            L40:
                r7.writeByte(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.api.json.BufferedSinkJsonWriter.Companion.a(okio.BufferedSink, java.lang.String):void");
        }
    }

    static {
        String[] strArr = new String[128];
        for (int i = 0; i < 32; i++) {
            StringBuilder sb = new StringBuilder("\\u00");
            byte b = (byte) i;
            j.getClass();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("0123456789abcdef".charAt(b >>> 4));
            sb2.append("0123456789abcdef".charAt(b & 15));
            sb.append(sb2.toString());
            strArr[i] = sb.toString();
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        k = strArr;
    }

    public BufferedSinkJsonWriter(BufferedSink bufferedSink) {
        this.d = bufferedSink;
        e(6);
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter A1(JsonNumber value) {
        Intrinsics.h(value, "value");
        c(value.f13534a);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter F1(String str) {
        int i = this.e;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (this.i != null) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.i = str;
        this.g[i - 1] = str;
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter G() {
        f();
        a();
        e(3);
        this.h[this.e - 1] = 0;
        this.d.r1("{");
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter K() {
        b(3, 5, "}");
        return this;
    }

    public final void a() {
        int iD = d();
        if (iD == 1) {
            this.f[this.e - 1] = 2;
            return;
        }
        BufferedSink bufferedSink = this.d;
        if (iD == 2) {
            bufferedSink.writeByte(44);
            return;
        }
        if (iD == 4) {
            bufferedSink.r1(":");
            this.f[this.e - 1] = 5;
        } else if (iD == 6) {
            this.f[this.e - 1] = 7;
        } else {
            if (iD == 7) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            throw new IllegalStateException("Nesting problem.");
        }
    }

    public final void b(int i, int i2, String str) {
        int iD = d();
        if (iD != i2 && iD != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.i != null) {
            throw new IllegalStateException(("Dangling name: " + this.i).toString());
        }
        int i3 = this.e;
        int i4 = i3 - 1;
        this.e = i4;
        this.g[i4] = null;
        int[] iArr = this.h;
        int i5 = i3 - 2;
        iArr[i5] = iArr[i5] + 1;
        this.d.r1(str);
    }

    public final void c(String value) {
        Intrinsics.h(value, "value");
        f();
        a();
        this.d.r1(value);
        int[] iArr = this.h;
        int i = this.e - 1;
        iArr[i] = iArr[i] + 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
        int i = this.e;
        if (i > 1 || (i == 1 && this.f[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.e = 0;
    }

    public final int d() {
        int i = this.e;
        if (i != 0) {
            return this.f[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter d1(long j2) {
        c(String.valueOf(j2));
        return this;
    }

    public final void e(int i) {
        int i2 = this.e;
        int[] iArr = this.f;
        if (i2 == iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.g(iArrCopyOf, "copyOf(...)");
            this.f = iArrCopyOf;
            String[] strArr = this.g;
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length * 2);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            this.g = (String[]) objArrCopyOf;
            int[] iArr2 = this.h;
            int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length * 2);
            Intrinsics.g(iArrCopyOf2, "copyOf(...)");
            this.h = iArrCopyOf2;
        }
        int[] iArr3 = this.f;
        int i3 = this.e;
        this.e = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter e1(int i) {
        c(String.valueOf(i));
        return this;
    }

    public final void f() {
        if (this.i != null) {
            int iD = d();
            BufferedSink bufferedSink = this.d;
            if (iD == 5) {
                bufferedSink.writeByte(44);
            } else if (iD != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f[this.e - 1] = 4;
            String str = this.i;
            Intrinsics.e(str);
            Companion.a(bufferedSink, str);
            this.i = null;
        }
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final String getPath() {
        return CollectionsKt.M(JsonScope.a(this.e, this.f, this.h, this.g), ".", null, null, null, 62);
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter h1(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            c(String.valueOf(d));
            return this;
        }
        throw new IllegalArgumentException(("Numeric values must be finite, but was " + d).toString());
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter q1(boolean z) {
        c(z ? "true" : "false");
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter s2() {
        c("null");
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter v0(String value) {
        Intrinsics.h(value, "value");
        f();
        a();
        Companion.a(this.d, value);
        int[] iArr = this.h;
        int i = this.e - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter w() {
        b(1, 2, "]");
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter y() {
        f();
        a();
        e(1);
        this.h[this.e - 1] = 0;
        this.d.r1("[");
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter z1(Upload value) {
        Intrinsics.h(value, "value");
        s2();
        return this;
    }
}
