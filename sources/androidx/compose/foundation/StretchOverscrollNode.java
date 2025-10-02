package androidx.compose.foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.d;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@RequiresApi
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/StretchOverscrollNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class StretchOverscrollNode extends DelegatingNode implements DrawModifierNode {
    public final AndroidEdgeEffectOverscrollEffect t;
    public final EdgeEffectWrapper u;
    public RenderNode v;

    public StretchOverscrollNode(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, EdgeEffectWrapper edgeEffectWrapper) {
        this.t = androidEdgeEffectOverscrollEffect;
        this.u = edgeEffectWrapper;
        s2(suspendingPointerInputModifierNodeImpl);
    }

    public static boolean v2(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
        boolean zV2;
        char c;
        float f;
        float f2;
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.d;
        long jH = canvasDrawScope.h();
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.t;
        androidEdgeEffectOverscrollEffect.h(jH);
        Canvas canvasA = AndroidCanvas_androidKt.a(canvasDrawScope.e.a());
        ((SnapshotMutableStateImpl) androidEdgeEffectOverscrollEffect.d).getD();
        if (Size.e(canvasDrawScope.h())) {
            layoutNodeDrawScope.Q0();
            return;
        }
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        EdgeEffectWrapper edgeEffectWrapper = this.u;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = edgeEffectWrapper.d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = edgeEffectWrapper.e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = edgeEffectWrapper.f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = edgeEffectWrapper.g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = edgeEffectWrapper.h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = edgeEffectWrapper.i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = edgeEffectWrapper.j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = edgeEffectWrapper.k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            layoutNodeDrawScope.Q0();
            return;
        }
        float fT1 = layoutNodeDrawScope.T1(ClipScrollableContainerKt.f830a);
        boolean z = EdgeEffectWrapper.f(edgeEffectWrapper.d) || EdgeEffectWrapper.g(edgeEffectWrapper.h) || EdgeEffectWrapper.f(edgeEffectWrapper.e) || EdgeEffectWrapper.g(edgeEffectWrapper.i);
        boolean z2 = EdgeEffectWrapper.f(edgeEffectWrapper.f) || EdgeEffectWrapper.g(edgeEffectWrapper.j) || EdgeEffectWrapper.f(edgeEffectWrapper.g) || EdgeEffectWrapper.g(edgeEffectWrapper.k);
        if (z && z2) {
            w2().setPosition(0, 0, canvasA.getWidth(), canvasA.getHeight());
        } else if (z) {
            w2().setPosition(0, 0, (MathKt.b(fT1) * 2) + canvasA.getWidth(), canvasA.getHeight());
        } else {
            if (!z2) {
                layoutNodeDrawScope.Q0();
                return;
            }
            w2().setPosition(0, 0, canvasA.getWidth(), (MathKt.b(fT1) * 2) + canvasA.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = w2().beginRecording();
        if (EdgeEffectWrapper.g(edgeEffectWrapper.j)) {
            EdgeEffect edgeEffectA = edgeEffectWrapper.j;
            if (edgeEffectA == null) {
                edgeEffectA = edgeEffectWrapper.a(Orientation.e);
                edgeEffectWrapper.j = edgeEffectA;
            }
            v2(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (EdgeEffectWrapper.f(edgeEffectWrapper.f)) {
            EdgeEffect edgeEffectC = edgeEffectWrapper.c();
            zV2 = v2(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            if (EdgeEffectWrapper.g(edgeEffectWrapper.f)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (androidEdgeEffectOverscrollEffect.b() & 4294967295L));
                EdgeEffect edgeEffectA2 = edgeEffectWrapper.j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = edgeEffectWrapper.a(Orientation.e);
                    edgeEffectWrapper.j = edgeEffectA2;
                }
                EdgeEffectCompat.e(edgeEffectA2, EdgeEffectCompat.c(edgeEffectC), 1 - fIntBitsToFloat);
            }
        } else {
            zV2 = false;
        }
        if (EdgeEffectWrapper.g(edgeEffectWrapper.h)) {
            EdgeEffect edgeEffectA3 = edgeEffectWrapper.h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = edgeEffectWrapper.a(Orientation.d);
                edgeEffectWrapper.h = edgeEffectA3;
            }
            v2(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (EdgeEffectWrapper.f(edgeEffectWrapper.d)) {
            EdgeEffect edgeEffectE = edgeEffectWrapper.e();
            zV2 = v2(BitmapDescriptorFactory.HUE_RED, edgeEffectE, recordingCanvasBeginRecording) || zV2;
            c = ' ';
            if (EdgeEffectWrapper.g(edgeEffectWrapper.d)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (androidEdgeEffectOverscrollEffect.b() >> 32));
                EdgeEffect edgeEffectA4 = edgeEffectWrapper.h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = edgeEffectWrapper.a(Orientation.d);
                    edgeEffectWrapper.h = edgeEffectA4;
                }
                EdgeEffectCompat.e(edgeEffectA4, EdgeEffectCompat.c(edgeEffectE), fIntBitsToFloat2);
            }
        } else {
            c = ' ';
        }
        if (EdgeEffectWrapper.g(edgeEffectWrapper.k)) {
            EdgeEffect edgeEffectA5 = edgeEffectWrapper.k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = edgeEffectWrapper.a(Orientation.e);
                edgeEffectWrapper.k = edgeEffectA5;
            }
            v2(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
            edgeEffectA5.finish();
        }
        if (EdgeEffectWrapper.f(edgeEffectWrapper.g)) {
            EdgeEffect edgeEffectD = edgeEffectWrapper.d();
            zV2 = v2(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zV2;
            if (EdgeEffectWrapper.g(edgeEffectWrapper.g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (androidEdgeEffectOverscrollEffect.b() & 4294967295L));
                EdgeEffect edgeEffectA6 = edgeEffectWrapper.k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = edgeEffectWrapper.a(Orientation.e);
                    edgeEffectWrapper.k = edgeEffectA6;
                }
                EdgeEffectCompat.e(edgeEffectA6, EdgeEffectCompat.c(edgeEffectD), fIntBitsToFloat3);
            }
        }
        if (EdgeEffectWrapper.g(edgeEffectWrapper.i)) {
            EdgeEffect edgeEffectA7 = edgeEffectWrapper.i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = edgeEffectWrapper.a(Orientation.d);
                edgeEffectWrapper.i = edgeEffectA7;
            }
            v2(BitmapDescriptorFactory.HUE_RED, edgeEffectA7, recordingCanvasBeginRecording);
            edgeEffectA7.finish();
        }
        if (EdgeEffectWrapper.f(edgeEffectWrapper.e)) {
            EdgeEffect edgeEffectB = edgeEffectWrapper.b();
            boolean z3 = v2(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zV2;
            if (EdgeEffectWrapper.g(edgeEffectWrapper.e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (androidEdgeEffectOverscrollEffect.b() >> c));
                EdgeEffect edgeEffectA8 = edgeEffectWrapper.i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = edgeEffectWrapper.a(Orientation.d);
                    edgeEffectWrapper.i = edgeEffectA8;
                }
                EdgeEffectCompat.e(edgeEffectA8, EdgeEffectCompat.c(edgeEffectB), 1 - fIntBitsToFloat4);
            }
            zV2 = z3;
        }
        if (zV2) {
            androidEdgeEffectOverscrollEffect.c();
        }
        float f3 = z2 ? 0.0f : fT1;
        if (z) {
            fT1 = 0.0f;
        }
        LayoutDirection layoutDirection = layoutNodeDrawScope.getLayoutDirection();
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.f1755a = recordingCanvasBeginRecording;
        long jH2 = canvasDrawScope.h();
        Density densityB = canvasDrawScope.e.b();
        LayoutDirection layoutDirectionC = canvasDrawScope.e.c();
        androidx.compose.ui.graphics.Canvas canvasA2 = canvasDrawScope.e.a();
        long jD = canvasDrawScope.e.d();
        CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = canvasDrawScope.e;
        GraphicsLayer graphicsLayer = canvasDrawScope$drawContext$1.b;
        canvasDrawScope$drawContext$1.f(layoutNodeDrawScope);
        canvasDrawScope$drawContext$1.g(layoutDirection);
        canvasDrawScope$drawContext$1.e(androidCanvas);
        canvasDrawScope$drawContext$1.h(jH2);
        canvasDrawScope$drawContext$1.b = null;
        androidCanvas.save();
        try {
            canvasDrawScope.e.f1798a.f(f3, fT1);
            try {
                layoutNodeDrawScope.Q0();
                androidCanvas.m();
                CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$12 = canvasDrawScope.e;
                canvasDrawScope$drawContext$12.f(densityB);
                canvasDrawScope$drawContext$12.g(layoutDirectionC);
                canvasDrawScope$drawContext$12.e(canvasA2);
                canvasDrawScope$drawContext$12.h(jD);
                canvasDrawScope$drawContext$12.b = graphicsLayer;
                w2().endRecording();
                int iSave = canvasA.save();
                canvasA.translate(f, f2);
                canvasA.drawRenderNode(w2());
                canvasA.restoreToCount(iSave);
            } finally {
                canvasDrawScope.e.f1798a.f(-f3, -fT1);
            }
        } catch (Throwable th) {
            androidCanvas.m();
            CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$13 = canvasDrawScope.e;
            canvasDrawScope$drawContext$13.f(densityB);
            canvasDrawScope$drawContext$13.g(layoutDirectionC);
            canvasDrawScope$drawContext$13.e(canvasA2);
            canvasDrawScope$drawContext$13.h(jD);
            canvasDrawScope$drawContext$13.b = graphicsLayer;
            throw th;
        }
    }

    public final RenderNode w2() {
        RenderNode renderNode = this.v;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeD = d.d();
        this.v = renderNodeD;
        return renderNodeD;
    }
}
