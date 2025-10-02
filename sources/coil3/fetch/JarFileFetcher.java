package coil3.fetch;

import coil3.RealImageLoader;
import coil3.Uri;
import coil3.decode.DataSource;
import coil3.decode.ImageSourceKt;
import coil3.fetch.Fetcher;
import coil3.request.Options;
import coil3.util.MimeTypeMap;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okio.Okio;
import okio.Path;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/JarFileFetcher;", "Lcoil3/fetch/Fetcher;", "Factory", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class JarFileFetcher implements Fetcher {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f13098a;
    public final Options b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/JarFileFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Lcoil3/Uri;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<Uri> {
        @Override // coil3.fetch.Fetcher.Factory
        public final Fetcher a(Object obj, Options options, RealImageLoader realImageLoader) {
            Uri uri = (Uri) obj;
            if (Intrinsics.c(uri.c, "jar:file")) {
                return new JarFileFetcher(uri, options);
            }
            return null;
        }
    }

    public JarFileFetcher(Uri uri, Options options) {
        this.f13098a = uri;
        this.b = options;
    }

    @Override // coil3.fetch.Fetcher
    public final Object a(Continuation continuation) {
        Uri uri = this.f13098a;
        String str = uri.e;
        if (str == null) {
            str = "";
        }
        int iB = StringsKt.B(str, '!', 0, 6);
        if (iB == -1) {
            throw new IllegalStateException(("Invalid jar:file URI: " + uri).toString());
        }
        String str2 = Path.e;
        String strSubstring = str.substring(0, iB);
        Intrinsics.g(strSubstring, "substring(...)");
        Path pathA = Path.Companion.a(strSubstring, false);
        String strSubstring2 = str.substring(iB + 1, str.length());
        Intrinsics.g(strSubstring2, "substring(...)");
        Path pathA2 = Path.Companion.a(strSubstring2, false);
        return new SourceFetchResult(ImageSourceKt.a(pathA2, Okio.d(this.b.f, pathA), null, null, 28), MimeTypeMap.a(StringsKt.a0(JwtParser.SEPARATOR_CHAR, pathA2.b(), "")), DataSource.f);
    }
}
