package androidx.compose.animation.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/graphics/vector/PropertyValuesHolderPath;", "Landroidx/compose/animation/graphics/vector/PropertyValuesHolder1D;", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PropertyValuesHolderPath extends PropertyValuesHolder1D<List<? extends PathNode>> {
    public final ArrayList b;

    public PropertyValuesHolderPath(String str, ArrayList arrayList) {
        super(str);
        this.b = arrayList;
    }
}
