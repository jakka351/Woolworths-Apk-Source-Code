package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/shape/AbsoluteCutCornerShape;", "Landroidx/compose/foundation/shape/CornerBasedShape;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AbsoluteCutCornerShape extends CornerBasedShape {
    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public final CornerBasedShape b(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new AbsoluteCutCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public final Outline d(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        if (f + f2 + f4 + f3 == BitmapDescriptorFactory.HUE_RED) {
            return new Outline.Rectangle(RectKt.a(0L, j));
        }
        AndroidPath androidPathA = AndroidPath_androidKt.a();
        androidPathA.a(BitmapDescriptorFactory.HUE_RED, f);
        androidPathA.b(f, BitmapDescriptorFactory.HUE_RED);
        int i = (int) (j >> 32);
        androidPathA.b(Float.intBitsToFloat(i) - f2, BitmapDescriptorFactory.HUE_RED);
        androidPathA.b(Float.intBitsToFloat(i), f2);
        int i2 = (int) (j & 4294967295L);
        androidPathA.b(Float.intBitsToFloat(i), Float.intBitsToFloat(i2) - f3);
        androidPathA.b(Float.intBitsToFloat(i) - f3, Float.intBitsToFloat(i2));
        androidPathA.b(f4, Float.intBitsToFloat(i2));
        androidPathA.b(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat(i2) - f4);
        androidPathA.close();
        return new Outline.Generic(androidPathA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteCutCornerShape)) {
            return false;
        }
        AbsoluteCutCornerShape absoluteCutCornerShape = (AbsoluteCutCornerShape) obj;
        return Intrinsics.c(this.f1097a, absoluteCutCornerShape.f1097a) && Intrinsics.c(this.b, absoluteCutCornerShape.b) && Intrinsics.c(this.c, absoluteCutCornerShape.c) && Intrinsics.c(this.d, absoluteCutCornerShape.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f1097a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AbsoluteCutCornerShape(topLeft = " + this.f1097a + ", topRight = " + this.b + ", bottomRight = " + this.c + ", bottomLeft = " + this.d + ')';
    }
}
