package coil.size;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/size/RealSizeResolver;", "Lcoil/size/SizeResolver;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RealSizeResolver implements SizeResolver {
    @Override // coil.size.SizeResolver
    public final Object a(Continuation continuation) {
        return Size.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealSizeResolver)) {
            return false;
        }
        Size size = Size.c;
        return size.equals(size);
    }

    public final int hashCode() {
        return Size.c.hashCode();
    }
}
