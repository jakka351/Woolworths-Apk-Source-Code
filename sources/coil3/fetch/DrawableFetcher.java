package coil3.fetch;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil3.Image_androidKt;
import coil3.RealImageLoader;
import coil3.decode.DataSource;
import coil3.fetch.Fetcher;
import coil3.request.ImageRequests_androidKt;
import coil3.request.Options;
import coil3.size.Precision;
import coil3.util.DrawableUtils;
import coil3.util.Utils_androidKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/DrawableFetcher;", "Lcoil3/fetch/Fetcher;", "Factory", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DrawableFetcher implements Fetcher {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f13095a;
    public final Options b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/DrawableFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Landroid/graphics/drawable/Drawable;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<Drawable> {
        @Override // coil3.fetch.Fetcher.Factory
        public final Fetcher a(Object obj, Options options, RealImageLoader realImageLoader) {
            return new DrawableFetcher((Drawable) obj, options);
        }
    }

    public DrawableFetcher(Drawable drawable, Options options) {
        this.f13095a = drawable;
        this.b = options;
    }

    @Override // coil3.fetch.Fetcher
    public final Object a(Continuation continuation) {
        Bitmap.Config[] configArr = Utils_androidKt.f13157a;
        Drawable bitmapDrawable = this.f13095a;
        boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof VectorDrawableCompat);
        if (z) {
            Options options = this.b;
            bitmapDrawable = new BitmapDrawable(options.f13145a.getResources(), DrawableUtils.a(bitmapDrawable, ImageRequests_androidKt.b(options), options.b, options.c, options.d == Precision.e));
        }
        return new ImageFetchResult(Image_androidKt.b(bitmapDrawable), z, DataSource.e);
    }
}
