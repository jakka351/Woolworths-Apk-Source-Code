package coil3.size;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcoil3/size/Dimension;", "", "Pixels", "Undefined", "Lcoil3/size/Dimension$Pixels;", "Lcoil3/size/Dimension$Undefined;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Dimension {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/size/Dimension$Pixels;", "Lcoil3/size/Dimension;", "px", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @JvmInline
    @SourceDebugExtension
    public static final class Pixels implements Dimension {

        /* renamed from: a, reason: collision with root package name */
        public final int f13147a;

        public /* synthetic */ Pixels(int i) {
            this.f13147a = i;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Pixels) {
                return this.f13147a == ((Pixels) obj).f13147a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f13147a);
        }

        public final String toString() {
            return "Pixels(px=" + this.f13147a + ')';
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/size/Dimension$Undefined;", "Lcoil3/size/Dimension;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Undefined implements Dimension {

        /* renamed from: a, reason: collision with root package name */
        public static final Undefined f13148a = new Undefined();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Undefined);
        }

        public final int hashCode() {
            return -2093724603;
        }

        public final String toString() {
            return "Undefined";
        }
    }
}
