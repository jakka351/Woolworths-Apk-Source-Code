package coil3.request;

import coil3.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/request/ErrorResult;", "Lcoil3/request/ImageResult;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ErrorResult implements ImageResult {

    /* renamed from: a, reason: collision with root package name */
    public final Image f13136a;
    public final ImageRequest b;
    public final Throwable c;

    public ErrorResult(Image image, ImageRequest imageRequest, Throwable th) {
        this.f13136a = image;
        this.b = imageRequest;
        this.c = th;
    }

    @Override // coil3.request.ImageResult
    /* renamed from: a, reason: from getter */
    public final ImageRequest getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final Throwable getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorResult)) {
            return false;
        }
        ErrorResult errorResult = (ErrorResult) obj;
        return Intrinsics.c(this.f13136a, errorResult.f13136a) && Intrinsics.c(this.b, errorResult.b) && Intrinsics.c(this.c, errorResult.c);
    }

    @Override // coil3.request.ImageResult
    /* renamed from: getImage, reason: from getter */
    public final Image getF13146a() {
        return this.f13136a;
    }

    public final int hashCode() {
        Image image = this.f13136a;
        return this.c.hashCode() + ((this.b.hashCode() + ((image == null ? 0 : image.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.f13136a + ", request=" + this.b + ", throwable=" + this.c + ')';
    }
}
