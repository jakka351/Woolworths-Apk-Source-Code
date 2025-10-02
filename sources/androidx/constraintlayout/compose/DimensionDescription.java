package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.compose.Dimension;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/constraintlayout/compose/DimensionDescription;", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DimensionDescription implements Dimension.Coercible, Dimension.MinCoercible, Dimension.MaxCoercible, Dimension {

    /* renamed from: a, reason: collision with root package name */
    public final DimensionSymbol f2241a;
    public final DimensionSymbol b = new DimensionSymbol(null, "min");
    public final DimensionSymbol c = new DimensionSymbol(null, "max");

    public DimensionDescription(String str) {
        this.f2241a = new DimensionSymbol(str, "base");
    }
}
