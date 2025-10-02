package coil3.fetch;

import android.graphics.Bitmap;
import coil3.RealImageLoader;
import coil3.Uri;
import coil3.UriKt;
import coil3.decode.DataSource;
import coil3.decode.ImageSourceKt;
import coil3.fetch.Fetcher;
import coil3.request.Options;
import coil3.util.MimeTypeMap;
import coil3.util.UtilsKt;
import coil3.util.Utils_androidKt;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okio.Path;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/FileUriFetcher;", "Lcoil3/fetch/Fetcher;", "Factory", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FileUriFetcher implements Fetcher {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f13096a;
    public final Options b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/FileUriFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Lcoil3/Uri;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<Uri> {
        @Override // coil3.fetch.Fetcher.Factory
        public final Fetcher a(Object obj, Options options, RealImageLoader realImageLoader) {
            Uri uri = (Uri) obj;
            Function1 function1 = UtilsKt.f13156a;
            String str = uri.c;
            if ((str != null && !str.equals("file")) || uri.e == null) {
                return null;
            }
            Bitmap.Config[] configArr = Utils_androidKt.f13157a;
            if (Intrinsics.c(uri.c, "file") && Intrinsics.c(CollectionsKt.F(UriKt.c(uri)), "android_asset")) {
                return null;
            }
            return new FileUriFetcher(uri, options);
        }
    }

    public FileUriFetcher(Uri uri, Options options) {
        this.f13096a = uri;
        this.b = options;
    }

    @Override // coil3.fetch.Fetcher
    public final Object a(Continuation continuation) {
        String str = Path.e;
        String strB = UriKt.b(this.f13096a);
        if (strB == null) {
            throw new IllegalStateException("filePath == null");
        }
        Path pathA = Path.Companion.a(strB, false);
        return new SourceFetchResult(ImageSourceKt.a(pathA, this.b.f, null, null, 28), MimeTypeMap.a(StringsKt.a0(JwtParser.SEPARATOR_CHAR, pathA.b(), "")), DataSource.f);
    }
}
