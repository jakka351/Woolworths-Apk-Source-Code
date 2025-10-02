package okhttp3;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Base64;
import okio.ByteString;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Credentials;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Credentials {
    static {
        new Credentials();
    }

    private Credentials() {
    }

    public static final String a(String str, String str2, Charset charset) {
        Intrinsics.h(charset, "charset");
        String str3 = str + ':' + str2;
        ByteString byteString = ByteString.g;
        Intrinsics.h(str3, "<this>");
        byte[] bytes = str3.getBytes(charset);
        Intrinsics.g(bytes, "getBytes(...)");
        return "Basic ".concat(Base64.b(new ByteString(bytes).data, Base64.f26779a));
    }
}
