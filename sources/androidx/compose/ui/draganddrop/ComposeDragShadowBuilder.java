package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/draganddrop/ComposeDragShadowBuilder;", "Landroid/view/View$DragShadowBuilder;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ComposeDragShadowBuilder extends View.DragShadowBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Density f1738a;
    public final long b;
    public final Function1 c;

    public ComposeDragShadowBuilder(Density density, long j, Function1 function1) {
        this.f1738a = density;
        this.b = j;
        this.c = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
        LayoutDirection layoutDirection = LayoutDirection.d;
        Canvas canvas2 = AndroidCanvas_androidKt.f1756a;
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.f1755a = canvas;
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.d;
        Density density = drawParams.f1797a;
        LayoutDirection layoutDirection2 = drawParams.b;
        androidx.compose.ui.graphics.Canvas canvas3 = drawParams.c;
        long j = drawParams.d;
        drawParams.f1797a = this.f1738a;
        drawParams.b = layoutDirection;
        drawParams.c = androidCanvas;
        drawParams.d = this.b;
        androidCanvas.save();
        this.c.invoke(canvasDrawScope);
        androidCanvas.m();
        drawParams.f1797a = density;
        drawParams.b = layoutDirection2;
        drawParams.c = canvas3;
        drawParams.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        Density density = this.f1738a;
        point.set(density.r1(density.C(fIntBitsToFloat)), density.r1(density.C(Float.intBitsToFloat((int) (j & 4294967295L)))));
        point2.set(point.x / 2, point.y / 2);
    }
}
