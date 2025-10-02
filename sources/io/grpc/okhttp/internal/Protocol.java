package io.grpc.okhttp.internal;

/* loaded from: classes7.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    public final String d;

    Protocol(String str) {
        this.d = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
