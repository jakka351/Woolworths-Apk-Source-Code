package io.grpc.okhttp.internal.proxy;

/* loaded from: classes7.dex */
public final class HttpUrl {

    /* renamed from: a, reason: collision with root package name */
    public final String f24152a;
    public final int b;
    public final String c;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f24153a;
        public String b;
        public int c;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f24153a);
            sb.append("://");
            int i = -1;
            if (this.b.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.b);
                sb.append(']');
            } else {
                sb.append(this.b);
            }
            int i2 = this.c;
            if (i2 == -1) {
                String str = this.f24153a;
                i2 = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
            }
            String str2 = this.f24153a;
            if (str2.equals("http")) {
                i = 80;
            } else if (str2.equals("https")) {
                i = 443;
            }
            if (i2 != i) {
                sb.append(':');
                sb.append(i2);
            }
            return sb.toString();
        }
    }

    public HttpUrl(Builder builder) {
        String str = builder.f24153a;
        this.f24152a = builder.b;
        int i = builder.c;
        this.b = i == -1 ? str.equals("http") ? 80 : str.equals("https") ? 443 : -1 : i;
        this.c = builder.toString();
    }

    public static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && ((HttpUrl) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }
}
