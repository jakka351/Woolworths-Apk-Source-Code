package androidx.compose.foundation.shape;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/ui/graphics/Shape;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class CornerBasedShape implements Shape {

    /* renamed from: a, reason: collision with root package name */
    public final CornerSize f1097a;
    public final CornerSize b;
    public final CornerSize c;
    public final CornerSize d;

    public CornerBasedShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        this.f1097a = cornerSize;
        this.b = cornerSize2;
        this.c = cornerSize3;
        this.d = cornerSize4;
    }

    public static /* synthetic */ CornerBasedShape c(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i) {
        if ((i & 1) != 0) {
            cornerSize = cornerBasedShape.f1097a;
        }
        if ((i & 2) != 0) {
            cornerSize2 = cornerBasedShape.b;
        }
        if ((i & 4) != 0) {
            cornerSize3 = cornerBasedShape.c;
        }
        if ((i & 8) != 0) {
            cornerSize4 = cornerBasedShape.d;
        }
        return cornerBasedShape.b(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.ui.graphics.Shape
    public final Outline a(long j, LayoutDirection layoutDirection, Density density) {
        float fA = this.f1097a.a(j, density);
        float fA2 = this.b.a(j, density);
        float fA3 = this.c.a(j, density);
        float fA4 = this.d.a(j, density);
        float fC = Size.c(j);
        float f = fA + fA4;
        if (f > fC) {
            float f2 = fC / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fC) {
            float f4 = fC / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < BitmapDescriptorFactory.HUE_RED || fA2 < BitmapDescriptorFactory.HUE_RED || fA3 < BitmapDescriptorFactory.HUE_RED || fA4 < BitmapDescriptorFactory.HUE_RED) {
            InlineClassHelperKt.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        return d(j, fA, fA2, fA3, fA4, layoutDirection);
    }

    public abstract CornerBasedShape b(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4);

    public abstract Outline d(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection);
}
