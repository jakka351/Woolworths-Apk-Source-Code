package io.grpc.okhttp.internal.proxy;

import io.grpc.okhttp.internal.Headers;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class Request {

    /* renamed from: a, reason: collision with root package name */
    public final HttpUrl f24154a;
    public final Headers b;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public HttpUrl f24155a;
        public Headers.Builder b;

        public final void a(String str, String str2) {
            ArrayList arrayList = this.b.f24136a;
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt <= 31 || cCharAt >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            int length2 = str2.length();
            for (int i3 = 0; i3 < length2; i3++) {
                char cCharAt2 = str2.charAt(i3);
                if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i3), str2));
                }
            }
            while (i < arrayList.size()) {
                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            arrayList.add(str);
            arrayList.add(str2.trim());
        }
    }

    public Request(Builder builder) {
        this.f24154a = builder.f24155a;
        Headers.Builder builder2 = builder.b;
        builder2.getClass();
        this.b = new Headers(builder2);
    }

    public final String toString() {
        return "Request{url=" + this.f24154a + '}';
    }
}
