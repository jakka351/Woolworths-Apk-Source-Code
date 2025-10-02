package coil.request;

import android.graphics.drawable.Drawable;
import androidx.camera.core.impl.b;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/SuccessResult;", "Lcoil/request/ImageResult;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuccessResult extends ImageResult {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f13024a;
    public final ImageRequest b;
    public final DataSource c;
    public final MemoryCache.Key d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public SuccessResult(Drawable drawable, ImageRequest imageRequest, DataSource dataSource, MemoryCache.Key key, String str, boolean z, boolean z2) {
        this.f13024a = drawable;
        this.b = imageRequest;
        this.c = dataSource;
        this.d = key;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // coil.request.ImageResult
    /* renamed from: a, reason: from getter */
    public final Drawable getF13016a() {
        return this.f13024a;
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
        if (!(obj instanceof SuccessResult)) {
            return false;
        }
        SuccessResult successResult = (SuccessResult) obj;
        return Intrinsics.c(this.f13024a, successResult.f13024a) && Intrinsics.c(this.b, successResult.b) && this.c == successResult.c && Intrinsics.c(this.d, successResult.d) && Intrinsics.c(this.e, successResult.e) && this.f == successResult.f && this.g == successResult.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f13024a.hashCode() * 31)) * 31)) * 31;
        MemoryCache.Key key = this.d;
        int iHashCode2 = (iHashCode + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + b.e((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }
}
