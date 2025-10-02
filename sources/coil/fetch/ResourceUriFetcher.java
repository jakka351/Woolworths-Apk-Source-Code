package coil.fetch;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.support.v4.media.session.a;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil.decode.DataSource;
import coil.decode.ImageSources;
import coil.decode.ResourceMetadata;
import coil.fetch.Fetcher;
import coil.request.Options;
import coil.util.DrawableUtils;
import coil.util.Utils;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okio.Okio;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcoil/fetch/ResourceUriFetcher;", "Lcoil/fetch/Fetcher;", "Companion", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ResourceUriFetcher implements Fetcher {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f12994a;
    public final Options b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/fetch/ResourceUriFetcher$Companion;", "", "", "MIME_TYPE_XML", "Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/fetch/ResourceUriFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/net/Uri;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<Uri> {
        @Override // coil.fetch.Fetcher.Factory
        public final Fetcher a(Object obj, Options options) {
            Uri uri = (Uri) obj;
            if (Intrinsics.c(uri.getScheme(), "android.resource")) {
                return new ResourceUriFetcher(uri, options);
            }
            return null;
        }
    }

    public ResourceUriFetcher(Uri uri, Options options) {
        this.f12994a = uri;
        this.b = options;
    }

    @Override // coil.fetch.Fetcher
    public final Object a(Continuation continuation) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Integer numI0;
        Drawable drawableC;
        Uri uri = this.f12994a;
        String authority = uri.getAuthority();
        if (authority != null) {
            if (StringsKt.D(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) CollectionsKt.P(uri.getPathSegments());
                if (str == null || (numI0 = StringsKt.i0(str)) == null) {
                    throw new IllegalStateException(a.m(uri, "Invalid android.resource URI: "));
                }
                int iIntValue = numI0.intValue();
                Options options = this.b;
                Context context = options.f13021a;
                Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                boolean z = true;
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String strB = Utils.b(MimeTypeMap.getSingleton(), charSequence.subSequence(StringsKt.G(charSequence, '/', 0, 6), charSequence.length()).toString());
                if (!Intrinsics.c(strB, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new SourceResult(ImageSources.b(Okio.c(Okio.h(resources.openRawResource(iIntValue, typedValue2))), context, new ResourceMetadata(typedValue2.density)), strB, DataSource.f);
                }
                if (authority.equals(context.getPackageName())) {
                    drawableC = AppCompatResources.b(iIntValue, context);
                    if (drawableC == null) {
                        throw new IllegalStateException(YU.a.d(iIntValue, "Invalid resource ID: ").toString());
                    }
                } else {
                    XmlResourceParser xml = resources.getXml(iIntValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found.");
                    }
                    drawableC = ResourcesCompat.c(iIntValue, context.getTheme(), resources);
                    if (drawableC == null) {
                        throw new IllegalStateException(YU.a.d(iIntValue, "Invalid resource ID: ").toString());
                    }
                }
                if (!(drawableC instanceof VectorDrawable) && !(drawableC instanceof VectorDrawableCompat)) {
                    z = false;
                }
                if (z) {
                    drawableC = new BitmapDrawable(context.getResources(), DrawableUtils.a(drawableC, options.b, options.c, options.d, options.e));
                }
                return new DrawableResult(drawableC, z, DataSource.f);
            }
        }
        throw new IllegalStateException(a.m(uri, "Invalid android.resource URI: "));
    }
}
