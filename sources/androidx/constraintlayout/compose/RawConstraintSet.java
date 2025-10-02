package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/RawConstraintSet;", "Landroidx/constraintlayout/compose/ConstraintSet;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@PublishedApi
/* loaded from: classes2.dex */
public final class RawConstraintSet implements ConstraintSet {
    @Override // androidx.constraintlayout.compose.ConstraintSet
    public final void a(State state, List list) throws CLParsingException {
        ConstraintSetParser.i(null, state, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RawConstraintSet.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type androidx.constraintlayout.compose.RawConstraintSet");
        ((RawConstraintSet) obj).getClass();
        return Intrinsics.c(null, null);
    }

    public final int hashCode() {
        throw null;
    }
}
