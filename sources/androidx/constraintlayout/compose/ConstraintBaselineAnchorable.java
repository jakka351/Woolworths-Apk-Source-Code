package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintBaselineAnchorable;", "Landroidx/constraintlayout/compose/BaselineAnchorable;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ConstraintBaselineAnchorable implements BaselineAnchorable {

    /* renamed from: a, reason: collision with root package name */
    public final CLObject f2235a;

    public ConstraintBaselineAnchorable(CLObject cLObject) {
        this.f2235a = cLObject;
    }

    @Override // androidx.constraintlayout.compose.BaselineAnchorable
    public final void b(ConstraintLayoutBaseScope.BaselineAnchor baselineAnchor, float f, float f2) {
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.k(CLString.k(baselineAnchor.f2237a.toString()));
        cLArray.k(CLString.k("baseline"));
        cLArray.k(new CLNumber(f));
        cLArray.k(new CLNumber(f2));
        this.f2235a.I("baseline", cLArray);
    }
}
