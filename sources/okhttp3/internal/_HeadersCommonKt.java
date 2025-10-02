package okhttp3.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okhttp3.Headers;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class _HeadersCommonKt {
    public static final void a(Headers.Builder builder, String name, String value) {
        Intrinsics.h(builder, "<this>");
        Intrinsics.h(name, "name");
        Intrinsics.h(value, "value");
        ArrayList arrayList = builder.f26682a;
        arrayList.add(name);
        arrayList.add(StringsKt.k0(value).toString());
    }

    public static final void b(String name) {
        Intrinsics.h(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = name.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                CharsKt.b(16);
                String string = Integer.toString(cCharAt, 16);
                Intrinsics.g(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                YU.a.x(i, string, " at ", " in header name: ", sb);
                sb.append(name);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void c(String value, String name) {
        Intrinsics.h(value, "value");
        Intrinsics.h(name, "name");
        int length = value.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = value.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                CharsKt.b(16);
                String string = Integer.toString(cCharAt, 16);
                Intrinsics.g(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                YU.a.x(i, string, " at ", " in ", sb);
                sb.append(name);
                sb.append(" value");
                sb.append(_UtilCommonKt.m(name) ? "" : ": ".concat(value));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }
}
