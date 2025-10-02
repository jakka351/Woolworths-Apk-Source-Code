package coil3.fetch;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil3.Image_androidKt;
import coil3.RealImageLoader;
import coil3.decode.DataSource;
import coil3.fetch.Fetcher;
import coil3.request.Options;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/BitmapFetcher;", "Lcoil3/fetch/Fetcher;", "Factory", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BitmapFetcher implements Fetcher {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f13091a;
    public final Options b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/BitmapFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Landroid/graphics/Bitmap;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<Bitmap> {
        @Override // coil3.fetch.Fetcher.Factory
        public final Fetcher a(Object obj, Options options, RealImageLoader realImageLoader) {
            return new BitmapFetcher((Bitmap) obj, options);
        }
    }

    public BitmapFetcher(Bitmap bitmap, Options options) {
        this.f13091a = bitmap;
        this.b = options;
    }

    @Override // coil3.fetch.Fetcher
    public final Object a(Continuation continuation) {
        return new ImageFetchResult(Image_androidKt.b(new BitmapDrawable(this.b.f13145a.getResources(), this.f13091a)), false, DataSource.e);
    }
}
