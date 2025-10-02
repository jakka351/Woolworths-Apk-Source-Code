package coil.size;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcoil/size/Dimension;", "", "Pixels", "Undefined", "Lcoil/size/Dimension$Pixels;", "Lcoil/size/Dimension$Undefined;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class Dimension {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/size/Dimension$Pixels;", "Lcoil/size/Dimension;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Pixels extends Dimension {

        /* renamed from: a, reason: collision with root package name */
        public final int f13026a;

        public Pixels(int i) {
            this.f13026a = i;
            if (i <= 0) {
                throw new IllegalArgumentException("px must be > 0.");
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Pixels) {
                return this.f13026a == ((Pixels) obj).f13026a;
            }
            return false;
        }

        /* renamed from: hashCode, reason: from getter */
        public final int getF13026a() {
            return this.f13026a;
        }

        public final String toString() {
            return String.valueOf(this.f13026a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/size/Dimension$Undefined;", "Lcoil/size/Dimension;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Undefined extends Dimension {

        /* renamed from: a, reason: collision with root package name */
        public static final Undefined f13027a = new Undefined();

        public final String toString() {
            return "Dimension.Undefined";
        }
    }
}
