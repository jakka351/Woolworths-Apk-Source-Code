package coil3.fetch;

import androidx.camera.core.impl.b;
import coil3.Image;
import coil3.decode.DataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/fetch/ImageFetchResult;", "Lcoil3/fetch/FetchResult;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageFetchResult implements FetchResult {

    /* renamed from: a, reason: collision with root package name */
    public final Image f13097a;
    public final boolean b;
    public final DataSource c;

    public ImageFetchResult(Image image, boolean z, DataSource dataSource) {
        this.f13097a = image;
        this.b = z;
        this.c = dataSource;
    }

    /* renamed from: a, reason: from getter */
    public final DataSource getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final Image getF13097a() {
        return this.f13097a;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageFetchResult)) {
            return false;
        }
        ImageFetchResult imageFetchResult = (ImageFetchResult) obj;
        return Intrinsics.c(this.f13097a, imageFetchResult.f13097a) && this.b == imageFetchResult.b && this.c == imageFetchResult.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + b.e(this.f13097a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.f13097a + ", isSampled=" + this.b + ", dataSource=" + this.c + ')';
    }
}
