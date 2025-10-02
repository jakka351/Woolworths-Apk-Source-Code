package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/Composer;", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class Composer {

    /* renamed from: a, reason: collision with root package name */
    public final JsonToStringWriter f24857a;
    public boolean b = true;

    public Composer(JsonToStringWriter jsonToStringWriter) {
        this.f24857a = jsonToStringWriter;
    }

    public void a() {
        this.b = true;
    }

    public void b() {
        this.b = false;
    }

    public void c() {
        this.b = false;
    }

    public void d(byte b) {
        this.f24857a.c(b);
    }

    public final void e(char c) {
        JsonToStringWriter jsonToStringWriter = this.f24857a;
        jsonToStringWriter.a(jsonToStringWriter.b, 1);
        char[] cArr = jsonToStringWriter.f24866a;
        int i = jsonToStringWriter.b;
        jsonToStringWriter.b = i + 1;
        cArr[i] = c;
    }

    public void f(int i) {
        this.f24857a.c(i);
    }

    public void g(long j) {
        this.f24857a.c(j);
    }

    public final void h(String v) {
        Intrinsics.h(v, "v");
        this.f24857a.b(v);
    }

    public void i(short s) {
        this.f24857a.c(s);
    }

    public void j(String value) {
        byte b;
        Intrinsics.h(value, "value");
        int length = value.length() + 2;
        JsonToStringWriter jsonToStringWriter = this.f24857a;
        jsonToStringWriter.a(jsonToStringWriter.b, length);
        char[] cArr = jsonToStringWriter.f24866a;
        int i = jsonToStringWriter.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length2 = value.length();
        value.getChars(0, length2, cArr, i2);
        int i3 = length2 + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = StringOpsKt.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length3 = value.length();
                for (int i5 = i4 - i2; i5 < length3; i5++) {
                    jsonToStringWriter.a(i4, 2);
                    char cCharAt = value.charAt(i5);
                    byte[] bArr2 = StringOpsKt.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        jsonToStringWriter.f24866a[i4] = cCharAt;
                        i4 = i6;
                    } else {
                        if (b == 1) {
                            String str = StringOpsKt.f24873a[cCharAt];
                            Intrinsics.e(str);
                            jsonToStringWriter.a(i4, str.length());
                            str.getChars(0, str.length(), jsonToStringWriter.f24866a, i4);
                            int length4 = str.length() + i4;
                            jsonToStringWriter.b = length4;
                            i4 = length4;
                        } else {
                            char[] cArr2 = jsonToStringWriter.f24866a;
                            cArr2[i4] = '\\';
                            cArr2[i4 + 1] = (char) b;
                            i4 += 2;
                            jsonToStringWriter.b = i4;
                        }
                    }
                }
                jsonToStringWriter.a(i4, 1);
                jsonToStringWriter.f24866a[i4] = '\"';
                jsonToStringWriter.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        jsonToStringWriter.b = i3 + 1;
    }

    public void k() {
    }

    public void l() {
    }
}
