package coil3.fetch;

import android.graphics.Bitmap;
import coil3.RealImageLoader;
import coil3.Uri;
import coil3.UriKt;
import coil3.decode.AssetMetadata;
import coil3.decode.DataSource;
import coil3.decode.SourceImageSource;
import coil3.fetch.Fetcher;
import coil3.request.Options;
import coil3.util.MimeTypeMap;
import coil3.util.Utils_androidKt;
import com.medallia.digital.mobilesdk.q2;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/AssetUriFetcher;", "Lcoil3/fetch/Fetcher;", "Factory", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AssetUriFetcher implements Fetcher {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f13090a;
    public final Options b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/AssetUriFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Lcoil3/Uri;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<Uri> {
        @Override // coil3.fetch.Fetcher.Factory
        public final Fetcher a(Object obj, Options options, RealImageLoader realImageLoader) {
            Uri uri = (Uri) obj;
            Bitmap.Config[] configArr = Utils_androidKt.f13157a;
            if (Intrinsics.c(uri.c, "file") && Intrinsics.c(CollectionsKt.F(UriKt.c(uri)), "android_asset")) {
                return new AssetUriFetcher(uri, options);
            }
            return null;
        }
    }

    public AssetUriFetcher(Uri uri, Options options) {
        this.f13090a = uri;
        this.b = options;
    }

    @Override // coil3.fetch.Fetcher
    public final Object a(Continuation continuation) {
        String strM = CollectionsKt.M(CollectionsKt.x(UriKt.c(this.f13090a), 1), q2.c, null, null, null, 62);
        Options options = this.b;
        return new SourceFetchResult(new SourceImageSource(Okio.c(Okio.h(options.f13145a.getAssets().open(strM))), options.f, new AssetMetadata(strM)), MimeTypeMap.b(strM), DataSource.f);
    }
}
