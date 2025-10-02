package coil3.fetch;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import coil3.RealImageLoader;
import coil3.Uri;
import coil3.UriKt;
import coil3.decode.ContentMetadata;
import coil3.decode.DataSource;
import coil3.decode.SourceImageSource;
import coil3.fetch.Fetcher;
import coil3.request.Options;
import coil3.size.Dimension;
import coil3.size.Size;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Okio;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/ContentUriFetcher;", "Lcoil3/fetch/Fetcher;", "Factory", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ContentUriFetcher implements Fetcher {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f13094a;
    public final Options b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/ContentUriFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Lcoil3/Uri;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<Uri> {
        @Override // coil3.fetch.Fetcher.Factory
        public final Fetcher a(Object obj, Options options, RealImageLoader realImageLoader) {
            Uri uri = (Uri) obj;
            if (Intrinsics.c(uri.c, "content")) {
                return new ContentUriFetcher(uri, options);
            }
            return null;
        }
    }

    public ContentUriFetcher(Uri uri, Options options) {
        this.f13094a = uri;
        this.b = options;
    }

    @Override // coil3.fetch.Fetcher
    public final Object a(Continuation continuation) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        List listC;
        int size;
        Uri uri = this.f13094a;
        android.net.Uri uri2 = android.net.Uri.parse(uri.f13055a);
        Options options = this.b;
        ContentResolver contentResolver = options.f13145a.getContentResolver();
        String str = uri.d;
        if (Intrinsics.c(str, "com.android.contacts") && Intrinsics.c(CollectionsKt.P(UriKt.c(uri)), "display_photo")) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri2, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri2 + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT >= 29 && Intrinsics.c(str, "media") && (size = (listC = UriKt.c(uri)).size()) >= 3 && Intrinsics.c(listC.get(size - 3), "audio") && Intrinsics.c(listC.get(size - 2), "albums")) {
            Size size2 = options.b;
            Dimension dimension = size2.f13149a;
            Bundle bundle = null;
            Dimension.Pixels pixels = dimension instanceof Dimension.Pixels ? (Dimension.Pixels) dimension : null;
            if (pixels != null) {
                int i = pixels.f13147a;
                Dimension dimension2 = size2.b;
                Dimension.Pixels pixels2 = dimension2 instanceof Dimension.Pixels ? (Dimension.Pixels) dimension2 : null;
                if (pixels2 != null) {
                    int i2 = pixels2.f13147a;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                }
            }
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uri2, "image/*", bundle, null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uri2 + "'.").toString());
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri2, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to open '" + uri2 + "'.").toString());
            }
        }
        return new SourceFetchResult(new SourceImageSource(Okio.c(Okio.h(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), options.f, new ContentMetadata(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri2), DataSource.f);
    }
}
