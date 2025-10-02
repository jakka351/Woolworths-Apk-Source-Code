package androidx.constraintlayout.compose;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLObject;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;", "", "BaselineAnchor", "HorizontalAnchor", "VerticalAnchor", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class ConstraintLayoutBaseScope {

    /* renamed from: a, reason: collision with root package name */
    public final CLObject f2236a;

    @Stable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class BaselineAnchor {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2237a;
        public final ConstrainedLayoutReference b;

        public BaselineAnchor(Object obj, ConstrainedLayoutReference constrainedLayoutReference) {
            this.f2237a = obj;
            this.b = constrainedLayoutReference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BaselineAnchor)) {
                return false;
            }
            BaselineAnchor baselineAnchor = (BaselineAnchor) obj;
            return this.f2237a.equals(baselineAnchor.f2237a) && this.b.equals(baselineAnchor.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f2237a.hashCode() * 31);
        }

        public final String toString() {
            return "BaselineAnchor(id=" + this.f2237a + ", reference=" + this.b + ')';
        }
    }

    @Stable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class HorizontalAnchor {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2238a;
        public final int b;
        public final ConstrainedLayoutReference c;

        public HorizontalAnchor(Object obj, int i, ConstrainedLayoutReference constrainedLayoutReference) {
            this.f2238a = obj;
            this.b = i;
            this.c = constrainedLayoutReference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HorizontalAnchor)) {
                return false;
            }
            HorizontalAnchor horizontalAnchor = (HorizontalAnchor) obj;
            return this.f2238a.equals(horizontalAnchor.f2238a) && this.b == horizontalAnchor.b && this.c.equals(horizontalAnchor.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.a(this.b, this.f2238a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "HorizontalAnchor(id=" + this.f2238a + ", index=" + this.b + ", reference=" + this.c + ')';
        }
    }

    @Stable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class VerticalAnchor {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2239a;
        public final int b;
        public final ConstrainedLayoutReference c;

        public VerticalAnchor(Object obj, int i, ConstrainedLayoutReference constrainedLayoutReference) {
            this.f2239a = obj;
            this.b = i;
            this.c = constrainedLayoutReference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerticalAnchor)) {
                return false;
            }
            VerticalAnchor verticalAnchor = (VerticalAnchor) obj;
            return this.f2239a.equals(verticalAnchor.f2239a) && this.b == verticalAnchor.b && this.c.equals(verticalAnchor.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.a(this.b, this.f2239a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "VerticalAnchor(id=" + this.f2239a + ", index=" + this.b + ", reference=" + this.c + ')';
        }
    }

    public ConstraintLayoutBaseScope() {
        new ArrayList();
        this.f2236a = new CLObject(new char[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConstraintLayoutBaseScope)) {
            return false;
        }
        return Intrinsics.c(this.f2236a, ((ConstraintLayoutBaseScope) obj).f2236a);
    }

    public final int hashCode() {
        return this.f2236a.hashCode();
    }
}
