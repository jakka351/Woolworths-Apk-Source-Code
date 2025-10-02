package coil.size;

import coil.size.Dimension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/size/Size;", "", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Size {
    public static final Size c;

    /* renamed from: a, reason: collision with root package name */
    public final Dimension f13028a;
    public final Dimension b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/size/Size$Companion;", "", "Lcoil/size/Size;", "ORIGINAL", "Lcoil/size/Size;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        Dimension.Undefined undefined = Dimension.Undefined.f13027a;
        c = new Size(undefined, undefined);
    }

    public Size(Dimension dimension, Dimension dimension2) {
        this.f13028a = dimension;
        this.b = dimension2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return Intrinsics.c(this.f13028a, size.f13028a) && Intrinsics.c(this.b, size.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13028a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f13028a + ", height=" + this.b + ')';
    }
}
