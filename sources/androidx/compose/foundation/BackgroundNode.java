package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/BackgroundNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ObserverModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class BackgroundNode extends Modifier.Node implements DrawModifierNode, ObserverModifierNode {
    public long r;
    public Brush s;
    public float t;
    public Shape u;
    public long v;
    public LayoutDirection w;
    public Outline x;
    public Shape y;
    public Outline z;

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void I(final LayoutNodeDrawScope layoutNodeDrawScope) {
        Outline outline;
        Brush brush;
        Path path;
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.d;
        if (this.u == RectangleShapeKt.f1779a) {
            if (!Color.c(this.r, Color.k)) {
                DrawScope.S(layoutNodeDrawScope, this.r, 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 126);
            }
            Brush brush2 = this.s;
            if (brush2 != null) {
                DrawScope.z0(layoutNodeDrawScope, brush2, 0L, 0L, this.t, null, null, 118);
            }
        } else {
            if (Size.a(canvasDrawScope.h(), this.v) && layoutNodeDrawScope.getLayoutDirection() == this.w && Intrinsics.c(this.y, this.u)) {
                outline = this.x;
                Intrinsics.e(outline);
            } else {
                ObserverModifierNodeKt.a(this, new Function0<Unit>() { // from class: androidx.compose.foundation.BackgroundNode$getOutline$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        BackgroundNode backgroundNode = this.h;
                        Shape shape = backgroundNode.u;
                        LayoutNodeDrawScope layoutNodeDrawScope2 = layoutNodeDrawScope;
                        backgroundNode.z = shape.a(layoutNodeDrawScope2.d.h(), layoutNodeDrawScope2.getLayoutDirection(), layoutNodeDrawScope2);
                        return Unit.f24250a;
                    }
                });
                outline = this.z;
                this.z = null;
            }
            this.x = outline;
            this.v = canvasDrawScope.h();
            this.w = layoutNodeDrawScope.getLayoutDirection();
            this.y = this.u;
            Intrinsics.e(outline);
            if (!Color.c(this.r, Color.k)) {
                OutlineKt.a(layoutNodeDrawScope, outline, this.r);
            }
            Brush brush3 = this.s;
            if (brush3 != null) {
                float f = this.t;
                boolean z = outline instanceof Outline.Rectangle;
                Fill fill = Fill.f1802a;
                if (z) {
                    Rect rect = ((Outline.Rectangle) outline).f1775a;
                    float f2 = rect.f1752a;
                    float f3 = rect.b;
                    layoutNodeDrawScope.q0(brush3, (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), OutlineKt.b(rect), f, fill, null);
                } else {
                    if (outline instanceof Outline.Rounded) {
                        Outline.Rounded rounded = (Outline.Rounded) outline;
                        brush = brush3;
                        path = rounded.b;
                        if (path == null) {
                            RoundRect roundRect = rounded.f1776a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.h >> 32));
                            float f4 = roundRect.f1753a;
                            float f5 = roundRect.b;
                            long jFloatToRawIntBits = (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
                            float fB = roundRect.b();
                            float fA = roundRect.a();
                            layoutNodeDrawScope.u1(brush, jFloatToRawIntBits, (Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), f, fill);
                        }
                    } else {
                        if (!(outline instanceof Outline.Generic)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Path path2 = ((Outline.Generic) outline).f1774a;
                        brush = brush3;
                        path = path2;
                    }
                    layoutNodeDrawScope.q1(path, brush, f, fill, 3);
                }
            }
        }
        layoutNodeDrawScope.Q0();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void o1() {
        this.v = 9205357640488583168L;
        this.w = null;
        this.x = null;
        this.y = null;
        DrawModifierNodeKt.a(this);
    }
}
