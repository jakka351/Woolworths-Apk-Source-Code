package io.grpc.okhttp.internal.framed;

import androidx.camera.core.impl.b;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Header {
    public static final ByteString d;
    public static final ByteString e;
    public static final ByteString f;
    public static final ByteString g;
    public static final ByteString h;

    /* renamed from: a, reason: collision with root package name */
    public final ByteString f24143a;
    public final ByteString b;
    public final int c;

    static {
        ByteString byteString = ByteString.g;
        d = ByteString.Companion.b(":status");
        e = ByteString.Companion.b(":method");
        f = ByteString.Companion.b(":path");
        g = ByteString.Companion.b(":scheme");
        h = ByteString.Companion.b(":authority");
        ByteString.Companion.b(":host");
        ByteString.Companion.b(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(ByteString.Companion.b(str), ByteString.Companion.b(str2));
        ByteString byteString = ByteString.g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Header) {
            Header header = (Header) obj;
            if (this.f24143a.equals(header.f24143a) && this.b.equals(header.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f24143a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return b.o(this.f24143a.y(), ": ", this.b.y());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(ByteString byteString, String str) {
        this(byteString, ByteString.Companion.b(str));
        ByteString byteString2 = ByteString.g;
    }

    public Header(ByteString byteString, ByteString byteString2) {
        this.f24143a = byteString;
        this.b = byteString2;
        this.c = byteString2.c() + byteString.c() + 32;
    }
}
