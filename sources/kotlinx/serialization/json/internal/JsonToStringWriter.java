package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/JsonToStringWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JsonToStringWriter implements InternalJsonWriter {

    /* renamed from: a, reason: collision with root package name */
    public char[] f24866a;
    public int b;

    public final void a(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.f24866a;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i3);
            Intrinsics.g(cArrCopyOf, "copyOf(...)");
            this.f24866a = cArrCopyOf;
        }
    }

    public final void b(String text) {
        Intrinsics.h(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        a(this.b, length);
        text.getChars(0, text.length(), this.f24866a, this.b);
        this.b += length;
    }

    public final void c(long j) {
        b(String.valueOf(j));
    }

    public final String toString() {
        return new String(this.f24866a, 0, this.b);
    }
}
