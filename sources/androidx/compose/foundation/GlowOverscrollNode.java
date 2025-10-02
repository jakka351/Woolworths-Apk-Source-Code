package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/GlowOverscrollNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class GlowOverscrollNode extends DelegatingNode implements DrawModifierNode {
    public final AndroidEdgeEffectOverscrollEffect t;
    public final EdgeEffectWrapper u;
    public final PaddingValues v;

    public GlowOverscrollNode(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, EdgeEffectWrapper edgeEffectWrapper, PaddingValues paddingValues) {
        this.t = androidEdgeEffectOverscrollEffect;
        this.u = edgeEffectWrapper;
        this.v = paddingValues;
        s2(suspendingPointerInputModifierNodeImpl);
    }

    public static boolean v2(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
        boolean zV2;
        char c;
        long j;
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.d;
        long jH = canvasDrawScope.h();
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.t;
        androidEdgeEffectOverscrollEffect.h(jH);
        if (Size.e(canvasDrawScope.h())) {
            layoutNodeDrawScope.Q0();
            return;
        }
        layoutNodeDrawScope.Q0();
        ((SnapshotMutableStateImpl) androidEdgeEffectOverscrollEffect.d).getD();
        Canvas canvasA = AndroidCanvas_androidKt.a(canvasDrawScope.e.a());
        EdgeEffectWrapper edgeEffectWrapper = this.u;
        boolean zF = EdgeEffectWrapper.f(edgeEffectWrapper.f);
        PaddingValues paddingValues = this.v;
        if (zF) {
            EdgeEffect edgeEffectC = edgeEffectWrapper.c();
            float f = -Float.intBitsToFloat((int) (canvasDrawScope.h() & 4294967295L));
            zV2 = v2(270.0f, (Float.floatToRawIntBits(layoutNodeDrawScope.T1(paddingValues.b(layoutNodeDrawScope.getLayoutDirection()))) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), edgeEffectC, canvasA);
        } else {
            zV2 = false;
        }
        if (EdgeEffectWrapper.f(edgeEffectWrapper.d)) {
            c = ' ';
            j = 4294967295L;
            zV2 = v2(BitmapDescriptorFactory.HUE_RED, (((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32) | (((long) Float.floatToRawIntBits(layoutNodeDrawScope.T1(paddingValues.getB()))) & 4294967295L), edgeEffectWrapper.e(), canvasA) || zV2;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (EdgeEffectWrapper.f(edgeEffectWrapper.g)) {
            zV2 = v2(90.0f, (((long) Float.floatToRawIntBits(layoutNodeDrawScope.T1(paddingValues.c(layoutNodeDrawScope.getLayoutDirection())) + (-((float) MathKt.b(Float.intBitsToFloat((int) (canvasDrawScope.h() >> c))))))) & j) | (((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << c), edgeEffectWrapper.d(), canvasA) || zV2;
        }
        if (EdgeEffectWrapper.f(edgeEffectWrapper.e)) {
            EdgeEffect edgeEffectB = edgeEffectWrapper.b();
            zV2 = v2(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (canvasDrawScope.h() & j))) + layoutNodeDrawScope.T1(paddingValues.getD()))) & j) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (canvasDrawScope.h() >> c)))) << c), edgeEffectB, canvasA) || zV2;
        }
        if (zV2) {
            androidEdgeEffectOverscrollEffect.c();
        }
    }
}
