package androidx.compose.ui.node;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {
    public final CanvasDrawScope d = new CanvasDrawScope();
    public DrawModifierNode e;

    @Override // androidx.compose.ui.unit.Density
    public final float B(int i) {
        return this.d.B(i);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float C(float f) {
        return f / this.d.getD();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void D1(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.d.D1(j, j2, j3, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long F(long j) {
        return this.d.F(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final long H(float f) {
        return this.d.H(f);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: I0 */
    public final CanvasDrawScope$drawContext$1 getE() {
        return this.d.e;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final long M0() {
        return this.d.M0();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void N1(ShaderBrush shaderBrush, float f, float f2, boolean z, long j, long j2, DrawStyle drawStyle) {
        this.d.N1(shaderBrush, f, f2, z, j, j2, drawStyle);
    }

    @Override // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public final void Q0() {
        CanvasDrawScope canvasDrawScope = this.d;
        Canvas canvasA = canvasDrawScope.e.a();
        DrawModifierNode drawModifierNode = this.e;
        if (drawModifierNode == null) {
            throw b.w("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        Modifier.Node nodeB = drawModifierNode.getD().i;
        if (nodeB == null || (nodeB.g & 4) == 0) {
            nodeB = null;
        } else {
            while (nodeB != null) {
                int i = nodeB.f;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    nodeB = nodeB.i;
                }
            }
            nodeB = null;
        }
        if (nodeB == null) {
            NodeCoordinator nodeCoordinatorE = DelegatableNodeKt.e(drawModifierNode, 4);
            if (nodeCoordinatorE.j1() == drawModifierNode.getD()) {
                nodeCoordinatorE = nodeCoordinatorE.s;
                Intrinsics.e(nodeCoordinatorE);
            }
            nodeCoordinatorE.L1(canvasA, canvasDrawScope.e.b);
            return;
        }
        MutableVector mutableVector = null;
        while (nodeB != null) {
            if (nodeB instanceof DrawModifierNode) {
                DrawModifierNode drawModifierNode2 = (DrawModifierNode) nodeB;
                GraphicsLayer graphicsLayer = canvasDrawScope.e.b;
                NodeCoordinator nodeCoordinatorE2 = DelegatableNodeKt.e(drawModifierNode2, 4);
                long jD = IntSizeKt.d(nodeCoordinatorE2.f);
                LayoutNode layoutNode = nodeCoordinatorE2.p;
                layoutNode.getClass();
                LayoutNodeKt.a(layoutNode).getSharedDrawScope().i(canvasA, jD, nodeCoordinatorE2, drawModifierNode2, graphicsLayer);
            } else if ((nodeB.f & 4) != 0 && (nodeB instanceof DelegatingNode)) {
                int i2 = 0;
                for (Modifier.Node node = ((DelegatingNode) nodeB).s; node != null; node = node.i) {
                    if ((node.f & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            nodeB = node;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (nodeB != null) {
                                mutableVector.c(nodeB);
                                nodeB = null;
                            }
                            mutableVector.c(node);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            nodeB = DelegatableNodeKt.b(mutableVector);
        }
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: Q1 */
    public final float getE() {
        return this.d.getE();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void R1(long j, float f, float f2, long j2, long j3, float f3, DrawStyle drawStyle) {
        this.d.R1(j, f, f2, j2, j3, f3, drawStyle);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float T1(float f) {
        return this.d.getD() * f;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void V1(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f) {
        this.d.V1(j, j2, j3, j4, drawStyle, f);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void W(long j, float f, long j2, DrawStyle drawStyle, int i) {
        this.d.W(j, f, j2, drawStyle, i);
    }

    @Override // androidx.compose.ui.unit.Density
    public final int W1(long j) {
        return this.d.W1(j);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void X1(ArrayList arrayList, long j, float f) {
        this.d.X1(arrayList, j, f);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void a2(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        this.d.a2(imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void b1(long j, long j2, long j3, float f, int i, PathEffect pathEffect, int i2) {
        this.d.b1(j, j2, j3, f, i, pathEffect, i2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: getDensity */
    public final float getD() {
        return this.d.getD();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final LayoutDirection getLayoutDirection() {
        return this.d.d.b;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final long h() {
        return this.d.h();
    }

    public final void i(Canvas canvas, long j, NodeCoordinator nodeCoordinator, DrawModifierNode drawModifierNode, GraphicsLayer graphicsLayer) {
        DrawModifierNode drawModifierNode2 = this.e;
        this.e = drawModifierNode;
        LayoutDirection layoutDirection = nodeCoordinator.p.E;
        CanvasDrawScope canvasDrawScope = this.d;
        Density densityB = canvasDrawScope.e.b();
        CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = canvasDrawScope.e;
        LayoutDirection layoutDirectionC = canvasDrawScope$drawContext$1.c();
        Canvas canvasA = canvasDrawScope$drawContext$1.a();
        long jD = canvasDrawScope$drawContext$1.d();
        GraphicsLayer graphicsLayer2 = canvasDrawScope$drawContext$1.b;
        canvasDrawScope$drawContext$1.f(nodeCoordinator);
        canvasDrawScope$drawContext$1.g(layoutDirection);
        canvasDrawScope$drawContext$1.e(canvas);
        canvasDrawScope$drawContext$1.h(j);
        canvasDrawScope$drawContext$1.b = graphicsLayer;
        canvas.save();
        try {
            drawModifierNode.I(this);
            canvas.m();
            canvasDrawScope$drawContext$1.f(densityB);
            canvasDrawScope$drawContext$1.g(layoutDirectionC);
            canvasDrawScope$drawContext$1.e(canvasA);
            canvasDrawScope$drawContext$1.h(jD);
            canvasDrawScope$drawContext$1.b = graphicsLayer2;
            this.e = drawModifierNode2;
        } catch (Throwable th) {
            canvas.m();
            canvasDrawScope$drawContext$1.f(densityB);
            canvasDrawScope$drawContext$1.g(layoutDirectionC);
            canvasDrawScope$drawContext$1.e(canvasA);
            canvasDrawScope$drawContext$1.h(jD);
            canvasDrawScope$drawContext$1.b = graphicsLayer2;
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void l0(Path path, long j, float f, DrawStyle drawStyle) {
        this.d.l0(path, j, f, drawStyle);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void m1(Brush brush, long j, long j2, float f, int i, float f2) {
        this.d.m1(brush, j, j2, f, i, f2);
    }

    public final void n(long j, GraphicsLayer graphicsLayer, final Function1 function1) {
        final DrawModifierNode drawModifierNode = this.e;
        graphicsLayer.e(this, getLayoutDirection(), j, new Function1<DrawScope, Unit>(drawModifierNode, function1) { // from class: androidx.compose.ui.node.LayoutNodeDrawScope$record$1
            public final /* synthetic */ DrawModifierNode i;
            public final /* synthetic */ Lambda j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.j = (Lambda) function1;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                DrawModifierNode drawModifierNode2;
                DrawScope drawScope = (DrawScope) obj;
                LayoutNodeDrawScope layoutNodeDrawScope = this.h;
                CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.d;
                DrawModifierNode drawModifierNode3 = layoutNodeDrawScope.e;
                layoutNodeDrawScope.e = this.i;
                try {
                    Density densityB = drawScope.getE().b();
                    LayoutDirection layoutDirectionC = drawScope.getE().c();
                    Canvas canvasA = drawScope.getE().a();
                    long jD = drawScope.getE().d();
                    GraphicsLayer graphicsLayer2 = drawScope.getE().b;
                    ?? r10 = this.j;
                    Density densityB2 = canvasDrawScope.e.b();
                    LayoutDirection layoutDirectionC2 = canvasDrawScope.e.c();
                    Canvas canvasA2 = canvasDrawScope.e.a();
                    long jD2 = canvasDrawScope.e.d();
                    CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = canvasDrawScope.e;
                    try {
                        GraphicsLayer graphicsLayer3 = canvasDrawScope$drawContext$1.b;
                        canvasDrawScope$drawContext$1.f(densityB);
                        canvasDrawScope$drawContext$1.g(layoutDirectionC);
                        canvasDrawScope$drawContext$1.e(canvasA);
                        canvasDrawScope$drawContext$1.h(jD);
                        canvasDrawScope$drawContext$1.b = graphicsLayer2;
                        canvasA.save();
                        try {
                            r10.invoke(layoutNodeDrawScope);
                            canvasA.m();
                            CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$12 = canvasDrawScope.e;
                            canvasDrawScope$drawContext$12.f(densityB2);
                            canvasDrawScope$drawContext$12.g(layoutDirectionC2);
                            canvasDrawScope$drawContext$12.e(canvasA2);
                            canvasDrawScope$drawContext$12.h(jD2);
                            canvasDrawScope$drawContext$12.b = graphicsLayer3;
                            layoutNodeDrawScope.e = drawModifierNode3;
                            return Unit.f24250a;
                        } catch (Throwable th) {
                            drawModifierNode2 = drawModifierNode3;
                            try {
                                canvasA.m();
                                CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$13 = canvasDrawScope.e;
                                canvasDrawScope$drawContext$13.f(densityB2);
                                canvasDrawScope$drawContext$13.g(layoutDirectionC2);
                                canvasDrawScope$drawContext$13.e(canvasA2);
                                canvasDrawScope$drawContext$13.h(jD2);
                                canvasDrawScope$drawContext$13.b = graphicsLayer3;
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                layoutNodeDrawScope.e = drawModifierNode2;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        drawModifierNode2 = drawModifierNode3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    drawModifierNode2 = drawModifierNode3;
                }
            }
        });
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void o0(ImageBitmap imageBitmap, ColorFilter colorFilter) {
        this.d.o0(imageBitmap, colorFilter);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long p(long j) {
        return this.d.p(j);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void q0(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter) {
        this.d.q0(brush, j, j2, f, drawStyle, colorFilter);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void q1(Path path, Brush brush, float f, DrawStyle drawStyle, int i) {
        this.d.q1(path, brush, f, drawStyle, i);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float r(long j) {
        return this.d.r(j);
    }

    @Override // androidx.compose.ui.unit.Density
    public final int r1(float f) {
        return this.d.r1(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long t(int i) {
        return this.d.t(i);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float t1(long j) {
        return this.d.t1(j);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void u1(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle) {
        this.d.u1(brush, j, j2, j3, f, drawStyle);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long v(float f) {
        return this.d.v(f);
    }
}
