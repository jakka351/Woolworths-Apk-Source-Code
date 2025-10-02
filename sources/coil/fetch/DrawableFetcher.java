package coil.fetch;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil.decode.DataSource;
import coil.fetch.Fetcher;
import coil.request.Options;
import coil.util.DrawableUtils;
import coil.util.Utils;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/fetch/DrawableFetcher;", "Lcoil/fetch/Fetcher;", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DrawableFetcher implements Fetcher {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f12989a;
    public final Options b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/fetch/DrawableFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/graphics/drawable/Drawable;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<Drawable> {
        @Override // coil.fetch.Fetcher.Factory
        public final Fetcher a(Object obj, Options options) {
            return new DrawableFetcher((Drawable) obj, options);
        }
    }

    public DrawableFetcher(Drawable drawable, Options options) {
        this.f12989a = drawable;
        this.b = options;
    }

    @Override // coil.fetch.Fetcher
    public final Object a(Continuation continuation) {
        Bitmap.Config[] configArr = Utils.f13033a;
        Drawable bitmapDrawable = this.f12989a;
        boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof VectorDrawableCompat);
        if (z) {
            Options options = this.b;
            bitmapDrawable = new BitmapDrawable(options.f13021a.getResources(), DrawableUtils.a(bitmapDrawable, options.b, options.c, options.d, options.e));
        }
        return new DrawableResult(bitmapDrawable, z, DataSource.e);
    }
}
