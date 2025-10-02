package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/BaseVerticalAnchorable;", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseVerticalAnchorable implements VerticalAnchorable {

    /* renamed from: a, reason: collision with root package name */
    public final CLObject f2232a;
    public final String b;

    public BaseVerticalAnchorable(CLObject cLObject, int i) {
        this.f2232a = cLObject;
        this.b = AnchorFunctions.a(i);
    }

    @Override // androidx.constraintlayout.compose.VerticalAnchorable
    public final void b(ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, float f, float f2) {
        String strA = AnchorFunctions.a(verticalAnchor.b);
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.k(CLString.k(verticalAnchor.f2239a.toString()));
        cLArray.k(CLString.k(strA));
        cLArray.k(new CLNumber(f));
        cLArray.k(new CLNumber(f2));
        this.f2232a.I(this.b, cLArray);
    }
}
