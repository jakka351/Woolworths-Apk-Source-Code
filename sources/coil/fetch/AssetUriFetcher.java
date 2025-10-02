package coil.fetch;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import coil.decode.AssetMetadata;
import coil.decode.DataSource;
import coil.decode.ImageSources;
import coil.fetch.Fetcher;
import coil.request.Options;
import coil.util.Utils;
import com.medallia.digital.mobilesdk.q2;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import okio.Okio;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/fetch/AssetUriFetcher;", "Lcoil/fetch/Fetcher;", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AssetUriFetcher implements Fetcher {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f12985a;
    public final Options b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/fetch/AssetUriFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/net/Uri;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<Uri> {
        @Override // coil.fetch.Fetcher.Factory
        public final Fetcher a(Object obj, Options options) {
            Uri uri = (Uri) obj;
            if (Utils.d(uri)) {
                return new AssetUriFetcher(uri, options);
            }
            return null;
        }
    }

    public AssetUriFetcher(Uri uri, Options options) {
        this.f12985a = uri;
        this.b = options;
    }

    @Override // coil.fetch.Fetcher
    public final Object a(Continuation continuation) {
        String strM = CollectionsKt.M(CollectionsKt.x(this.f12985a.getPathSegments(), 1), q2.c, null, null, null, 62);
        Options options = this.b;
        return new SourceResult(ImageSources.b(Okio.c(Okio.h(options.f13021a.getAssets().open(strM))), options.f13021a, new AssetMetadata()), Utils.b(MimeTypeMap.getSingleton(), strM), DataSource.f);
    }
}
