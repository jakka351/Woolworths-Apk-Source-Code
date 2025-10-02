package coil3.fetch;

import YU.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.TypedValue;
import androidx.core.content.res.ResourcesCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil3.ExtrasKt;
import coil3.Image_androidKt;
import coil3.RealImageLoader;
import coil3.Uri;
import coil3.UriKt;
import coil3.decode.DataSource;
import coil3.decode.ResourceMetadata;
import coil3.decode.SourceImageSource;
import coil3.fetch.Fetcher;
import coil3.request.ImageRequests_androidKt;
import coil3.request.Options;
import coil3.size.Precision;
import coil3.util.ContextsKt;
import coil3.util.DrawableUtils;
import coil3.util.MimeTypeMap;
import coil3.util.Utils_androidKt;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okio.Okio;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/ResourceUriFetcher;", "Lcoil3/fetch/Fetcher;", "Factory", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ResourceUriFetcher implements Fetcher {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f13099a;
    public final Options b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/ResourceUriFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Lcoil3/Uri;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<Uri> {
        @Override // coil3.fetch.Fetcher.Factory
        public final Fetcher a(Object obj, Options options, RealImageLoader realImageLoader) {
            Uri uri = (Uri) obj;
            if (Intrinsics.c(uri.c, "android.resource")) {
                return new ResourceUriFetcher(uri, options);
            }
            return null;
        }
    }

    public ResourceUriFetcher(Uri uri, Options options) {
        this.f13099a = uri;
        this.b = options;
    }

    @Override // coil3.fetch.Fetcher
    public final Object a(Continuation continuation) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Integer numI0;
        Drawable bitmapDrawable;
        Uri uri = this.f13099a;
        String str = uri.d;
        if (str != null) {
            if (StringsKt.D(str)) {
                str = null;
            }
            if (str != null) {
                String str2 = (String) CollectionsKt.P(UriKt.c(uri));
                if (str2 == null || (numI0 = StringsKt.i0(str2)) == null) {
                    throw new IllegalStateException("Invalid android.resource URI: " + uri);
                }
                int iIntValue = numI0.intValue();
                Options options = this.b;
                Context context = options.f13145a;
                Resources resources = str.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                String strB = MimeTypeMap.b(typedValue.string.toString());
                if (!Intrinsics.c(strB, "text/xml")) {
                    return new SourceFetchResult(new SourceImageSource(Okio.c(Okio.h(resources.openRawResource(iIntValue, new TypedValue()))), options.f, new ResourceMetadata(str, iIntValue)), strB, DataSource.f);
                }
                if (str.equals(context.getPackageName())) {
                    bitmapDrawable = ContextsKt.a(iIntValue, context);
                } else {
                    XmlResourceParser xml = resources.getXml(iIntValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found.");
                    }
                    Drawable drawableC = ResourcesCompat.c(iIntValue, context.getTheme(), resources);
                    if (drawableC == null) {
                        throw new IllegalStateException(a.d(iIntValue, "Invalid resource ID: ").toString());
                    }
                    bitmapDrawable = drawableC;
                }
                Bitmap.Config[] configArr = Utils_androidKt.f13157a;
                boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof VectorDrawableCompat);
                if (z) {
                    bitmapDrawable = new BitmapDrawable(context.getResources(), DrawableUtils.a(bitmapDrawable, (Bitmap.Config) ExtrasKt.b(options, ImageRequests_androidKt.c), options.b, options.c, options.d == Precision.e));
                }
                return new ImageFetchResult(Image_androidKt.b(bitmapDrawable), z, DataSource.f);
            }
        }
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }
}
