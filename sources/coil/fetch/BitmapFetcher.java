package coil.fetch;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.decode.DataSource;
import coil.fetch.Fetcher;
import coil.request.Options;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/fetch/BitmapFetcher;", "Lcoil/fetch/Fetcher;", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BitmapFetcher implements Fetcher {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f12986a;
    public final Options b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/fetch/BitmapFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/graphics/Bitmap;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<Bitmap> {
        @Override // coil.fetch.Fetcher.Factory
        public final Fetcher a(Object obj, Options options) {
            return new BitmapFetcher((Bitmap) obj, options);
        }
    }

    public BitmapFetcher(Bitmap bitmap, Options options) {
        this.f12986a = bitmap;
        this.b = options;
    }

    @Override // coil.fetch.Fetcher
    public final Object a(Continuation continuation) {
        return new DrawableResult(new BitmapDrawable(this.b.f13021a.getResources(), this.f12986a), false, DataSource.e);
    }
}
