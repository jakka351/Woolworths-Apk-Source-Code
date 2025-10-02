package androidx.work.impl.constraints;

import YU.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/work/impl/constraints/ConstraintsState;", "", "ConstraintsMet", "ConstraintsNotMet", "Landroidx/work/impl/constraints/ConstraintsState$ConstraintsMet;", "Landroidx/work/impl/constraints/ConstraintsState$ConstraintsNotMet;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ConstraintsState {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/constraints/ConstraintsState$ConstraintsMet;", "Landroidx/work/impl/constraints/ConstraintsState;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ConstraintsMet extends ConstraintsState {

        /* renamed from: a, reason: collision with root package name */
        public static final ConstraintsMet f3958a = new ConstraintsMet();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/constraints/ConstraintsState$ConstraintsNotMet;", "Landroidx/work/impl/constraints/ConstraintsState;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class ConstraintsNotMet extends ConstraintsState {

        /* renamed from: a, reason: collision with root package name */
        public final int f3959a;

        public ConstraintsNotMet(int i) {
            this.f3959a = i;
        }

        /* renamed from: a, reason: from getter */
        public final int getF3959a() {
            return this.f3959a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConstraintsNotMet) && this.f3959a == ((ConstraintsNotMet) obj).f3959a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f3959a);
        }

        public final String toString() {
            return a.l(new StringBuilder("ConstraintsNotMet(reason="), this.f3959a, ')');
        }
    }
}
