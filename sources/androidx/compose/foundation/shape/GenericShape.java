package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/shape/GenericShape;", "Landroidx/compose/ui/graphics/Shape;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GenericShape implements Shape {

    /* renamed from: a, reason: collision with root package name */
    public final Function3 f1099a;

    public GenericShape(Function3 function3) {
        this.f1099a = function3;
    }

    @Override // androidx.compose.ui.graphics.Shape
    public final Outline a(long j, LayoutDirection layoutDirection, Density density) {
        AndroidPath androidPathA = AndroidPath_androidKt.a();
        this.f1099a.invoke(androidPathA, new Size(j), layoutDirection);
        androidPathA.close();
        return new Outline.Generic(androidPathA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        GenericShape genericShape = obj instanceof GenericShape ? (GenericShape) obj : null;
        return (genericShape != null ? genericShape.f1099a : null) == this.f1099a;
    }

    public final int hashCode() {
        return this.f1099a.hashCode();
    }
}
