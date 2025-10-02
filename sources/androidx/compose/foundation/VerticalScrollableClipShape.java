package androidx.compose.foundation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/VerticalScrollableClipShape;", "Landroidx/compose/ui/graphics/Shape;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class VerticalScrollableClipShape implements Shape {

    /* renamed from: a, reason: collision with root package name */
    public static final VerticalScrollableClipShape f849a = new VerticalScrollableClipShape();

    @Override // androidx.compose.ui.graphics.Shape
    public final Outline a(long j, LayoutDirection layoutDirection, Density density) {
        float fR1 = density.r1(ClipScrollableContainerKt.f830a);
        return new Outline.Rectangle(new Rect(-fR1, BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (j >> 32)) + fR1, Float.intBitsToFloat((int) (j & 4294967295L))));
    }
}
