package coil3.request;

import androidx.camera.core.impl.b;
import coil3.Image;
import coil3.decode.DataSource;
import coil3.memory.MemoryCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/request/SuccessResult;", "Lcoil3/request/ImageResult;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuccessResult implements ImageResult {

    /* renamed from: a, reason: collision with root package name */
    public final Image f13146a;
    public final ImageRequest b;
    public final DataSource c;
    public final MemoryCache.Key d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public SuccessResult(Image image, ImageRequest imageRequest, DataSource dataSource, MemoryCache.Key key, String str, boolean z, boolean z2) {
        this.f13146a = image;
        this.b = imageRequest;
        this.c = dataSource;
        this.d = key;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // coil3.request.ImageResult
    /* renamed from: a, reason: from getter */
    public final ImageRequest getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuccessResult)) {
            return false;
        }
        SuccessResult successResult = (SuccessResult) obj;
        return Intrinsics.c(this.f13146a, successResult.f13146a) && Intrinsics.c(this.b, successResult.b) && this.c == successResult.c && Intrinsics.c(this.d, successResult.d) && Intrinsics.c(this.e, successResult.e) && this.f == successResult.f && this.g == successResult.g;
    }

    @Override // coil3.request.ImageResult
    /* renamed from: getImage, reason: from getter */
    public final Image getF13136a() {
        return this.f13146a;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f13146a.hashCode() * 31)) * 31)) * 31;
        MemoryCache.Key key = this.d;
        int iHashCode2 = (iHashCode + (key == null ? 0 : key.hashCode())) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + b.e((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.f13146a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", memoryCacheKey=");
        sb.append(this.d);
        sb.append(", diskCacheKey=");
        sb.append(this.e);
        sb.append(", isSampled=");
        sb.append(this.f);
        sb.append(", isPlaceholderCached=");
        return b.s(sb, this.g, ')');
    }
}
