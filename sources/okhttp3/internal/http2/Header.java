package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Header {
    public static final ByteString d;
    public static final ByteString e;
    public static final ByteString f;
    public static final ByteString g;
    public static final ByteString h;
    public static final ByteString i;

    /* renamed from: a, reason: collision with root package name */
    public final ByteString f26736a;
    public final ByteString b;
    public final int c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http2/Header$Companion;", "", "<init>", "()V", "PSEUDO_PREFIX", "Lokio/ByteString;", "RESPONSE_STATUS_UTF8", "", "TARGET_METHOD_UTF8", "TARGET_PATH_UTF8", "TARGET_SCHEME_UTF8", "TARGET_AUTHORITY_UTF8", "RESPONSE_STATUS", "TARGET_METHOD", "TARGET_PATH", "TARGET_SCHEME", "TARGET_AUTHORITY", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        ByteString byteString = ByteString.g;
        d = ByteString.Companion.b(":");
        e = ByteString.Companion.b(":status");
        f = ByteString.Companion.b(":method");
        g = ByteString.Companion.b(":path");
        h = ByteString.Companion.b(":scheme");
        i = ByteString.Companion.b(":authority");
    }

    public Header(ByteString name, ByteString value) {
        Intrinsics.h(name, "name");
        Intrinsics.h(value, "value");
        this.f26736a = name;
        this.b = value;
        this.c = value.c() + name.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Intrinsics.c(this.f26736a, header.f26736a) && Intrinsics.c(this.b, header.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26736a.hashCode() * 31);
    }

    public final String toString() {
        return this.f26736a.y() + ": " + this.b.y();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(ByteString.Companion.b(str), ByteString.Companion.b(str2));
        ByteString byteString = ByteString.g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(ByteString name, String value) {
        this(name, ByteString.Companion.b(value));
        Intrinsics.h(name, "name");
        Intrinsics.h(value, "value");
        ByteString byteString = ByteString.g;
    }
}
