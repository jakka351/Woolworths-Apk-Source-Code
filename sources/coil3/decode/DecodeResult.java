package coil3.decode;

import coil3.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/decode/DecodeResult;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DecodeResult {

    /* renamed from: a, reason: collision with root package name */
    public final Image f13076a;
    public final boolean b;

    public DecodeResult(Image image, boolean z) {
        this.f13076a = image;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecodeResult)) {
            return false;
        }
        DecodeResult decodeResult = (DecodeResult) obj;
        return Intrinsics.c(this.f13076a, decodeResult.f13076a) && this.b == decodeResult.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f13076a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecodeResult(image=");
        sb.append(this.f13076a);
        sb.append(", isSampled=");
        return androidx.camera.core.impl.b.s(sb, this.b, ')');
    }
}
