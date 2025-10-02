package coil.request;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/ErrorResult;", "Lcoil/request/ImageResult;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ErrorResult extends ImageResult {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f13016a;
    public final ImageRequest b;
    public final Throwable c;

    public ErrorResult(Drawable drawable, ImageRequest imageRequest, Throwable th) {
        this.f13016a = drawable;
        this.b = imageRequest;
        this.c = th;
    }

    @Override // coil.request.ImageResult
    /* renamed from: a, reason: from getter */
    public final Drawable getF13024a() {
        return this.f13016a;
    }

    @Override // coil.request.ImageResult
    /* renamed from: b, reason: from getter */
    public final ImageRequest getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorResult)) {
            return false;
        }
        ErrorResult errorResult = (ErrorResult) obj;
        return Intrinsics.c(this.f13016a, errorResult.f13016a) && Intrinsics.c(this.b, errorResult.b) && Intrinsics.c(this.c, errorResult.c);
    }

    public final int hashCode() {
        Drawable drawable = this.f13016a;
        return this.c.hashCode() + ((this.b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
