package coil3.gif;

import kotlin.Metadata;
import okio.BufferedSource;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-gif_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DecodeUtilsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteString f13104a;
    public static final ByteString b;
    public static final ByteString c;
    public static final ByteString d;
    public static final ByteString e;
    public static final ByteString f;
    public static final ByteString g;
    public static final ByteString h;
    public static final ByteString i;

    static {
        ByteString byteString = ByteString.g;
        f13104a = ByteString.Companion.b("GIF87a");
        b = ByteString.Companion.b("GIF89a");
        c = ByteString.Companion.b("RIFF");
        d = ByteString.Companion.b("WEBP");
        e = ByteString.Companion.b("VP8X");
        f = ByteString.Companion.b("ftyp");
        g = ByteString.Companion.b("msf1");
        h = ByteString.Companion.b("hevc");
        i = ByteString.Companion.b("hevx");
    }

    public static final boolean a(BufferedSource bufferedSource) {
        return bufferedSource.a0(0L, b) || bufferedSource.a0(0L, f13104a);
    }
}
