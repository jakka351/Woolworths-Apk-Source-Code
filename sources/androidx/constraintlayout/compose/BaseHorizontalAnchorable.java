package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/BaseHorizontalAnchorable;", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseHorizontalAnchorable implements HorizontalAnchorable {

    /* renamed from: a, reason: collision with root package name */
    public final CLObject f2230a;
    public final String b;

    public BaseHorizontalAnchorable(CLObject cLObject, int i) {
        this.f2230a = cLObject;
        String str = "top";
        if (i != 0) {
            if (i != 1) {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            } else {
                str = "bottom";
            }
        }
        this.b = str;
    }

    @Override // androidx.constraintlayout.compose.HorizontalAnchorable
    public final void b(ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f, float f2) {
        int i = horizontalAnchor.b;
        String str = "top";
        if (i != 0) {
            if (i != 1) {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            } else {
                str = "bottom";
            }
        }
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.k(CLString.k(horizontalAnchor.f2238a.toString()));
        cLArray.k(CLString.k(str));
        cLArray.k(new CLNumber(f));
        cLArray.k(new CLNumber(f2));
        this.f2230a.I(this.b, cLArray);
    }
}
