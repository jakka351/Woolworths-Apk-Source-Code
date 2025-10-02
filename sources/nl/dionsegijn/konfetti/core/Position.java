package nl.dionsegijn.konfetti.core;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lnl/dionsegijn/konfetti/core/Position;", "", "Absolute", "Relative", "between", "Lnl/dionsegijn/konfetti/core/Position$Absolute;", "Lnl/dionsegijn/konfetti/core/Position$Relative;", "Lnl/dionsegijn/konfetti/core/Position$between;", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class Position {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/core/Position$Absolute;", "Lnl/dionsegijn/konfetti/core/Position;", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Absolute extends Position {

        /* renamed from: a, reason: collision with root package name */
        public final float f26637a;
        public final float b;

        public Absolute(float f, float f2) {
            this.f26637a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Absolute)) {
                return false;
            }
            Absolute absolute = (Absolute) obj;
            return Float.valueOf(this.f26637a).equals(Float.valueOf(absolute.f26637a)) && Float.valueOf(this.b).equals(Float.valueOf(absolute.b));
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.f26637a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Absolute(x=");
            sb.append(this.f26637a);
            sb.append(", y=");
            return a.r(sb, this.b, ')');
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/core/Position$Relative;", "Lnl/dionsegijn/konfetti/core/Position;", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Relative extends Position {

        /* renamed from: a, reason: collision with root package name */
        public final double f26638a;
        public final double b;

        public Relative(double d, double d2) {
            this.f26638a = d;
            this.b = d2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Relative)) {
                return false;
            }
            Relative relative = (Relative) obj;
            return Double.valueOf(this.f26638a).equals(Double.valueOf(relative.f26638a)) && Double.valueOf(this.b).equals(Double.valueOf(relative.b));
        }

        public final int hashCode() {
            return Double.hashCode(this.b) + (Double.hashCode(this.f26638a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Relative(x=");
            sb.append(this.f26638a);
            sb.append(", y=");
            return b.p(sb, this.b, ')');
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/core/Position$between;", "Lnl/dionsegijn/konfetti/core/Position;", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class between extends Position {

        /* renamed from: a, reason: collision with root package name */
        public final Relative f26639a;
        public final Relative b;

        public between(Relative relative, Relative relative2) {
            this.f26639a = relative;
            this.b = relative2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof between)) {
                return false;
            }
            between betweenVar = (between) obj;
            return this.f26639a.equals(betweenVar.f26639a) && this.b.equals(betweenVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f26639a.hashCode() * 31);
        }

        public final String toString() {
            return "between(min=" + this.f26639a + ", max=" + this.b + ')';
        }
    }
}
