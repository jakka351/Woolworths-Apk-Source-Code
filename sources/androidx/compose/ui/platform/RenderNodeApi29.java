package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi29;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RequiresApi
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RenderNodeApi29 implements DeviceRenderNode {

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f1980a = androidx.compose.ui.graphics.layer.a.e();

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void A(float f) {
        this.f1980a.setPivotX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void B(float f) {
        this.f1980a.setPivotY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void C(Outline outline) {
        this.f1980a.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void D(boolean z) {
        this.f1980a.setClipToOutline(z);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean E(int i, int i2, int i3, int i4) {
        return this.f1980a.setPosition(i, i2, i3, i4);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int F() {
        return this.f1980a.getTop();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void G(int i) {
        this.f1980a.setAmbientShadowColor(i);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void H(CanvasHolder canvasHolder, Path path, Function1 function1) {
        RecordingCanvas recordingCanvasBeginRecording = this.f1980a.beginRecording();
        AndroidCanvas androidCanvas = canvasHolder.f1764a;
        Canvas canvas = androidCanvas.f1755a;
        androidCanvas.f1755a = recordingCanvasBeginRecording;
        if (path != null) {
            androidCanvas.save();
            androidCanvas.l(path, 1);
        }
        ((RenderNodeLayer$updateDisplayList$1$1) function1).invoke(androidCanvas);
        if (path != null) {
            androidCanvas.m();
        }
        canvasHolder.f1764a.f1755a = canvas;
        this.f1980a.endRecording();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void I(int i) {
        this.f1980a.setSpotShadowColor(i);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float J() {
        return this.f1980a.getElevation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float a() {
        return this.f1980a.getAlpha();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void b(float f) {
        this.f1980a.setAlpha(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void c(float f) {
        this.f1980a.setTranslationY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void d(float f) {
        this.f1980a.setCameraDistance(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void e(float f) {
        this.f1980a.setRotationX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void f(float f) {
        this.f1980a.setRotationY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void g(float f) {
        this.f1980a.setRotationZ(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getHeight() {
        return this.f1980a.getHeight();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getWidth() {
        return this.f1980a.getWidth();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean h() {
        return this.f1980a.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int i() {
        return this.f1980a.getRight();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void j(float f) {
        this.f1980a.setScaleX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void k(RenderEffect renderEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f1980a.setRenderEffect(renderEffect != null ? renderEffect.a() : null);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void l(float f) {
        this.f1980a.setScaleY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void m(float f) {
        this.f1980a.setTranslationX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int n() {
        return this.f1980a.getLeft();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void o() {
        this.f1980a.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean p() {
        return this.f1980a.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void q(Canvas canvas) {
        canvas.drawRenderNode(this.f1980a);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void r(boolean z) {
        this.f1980a.setClipToBounds(z);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void s(float f) {
        this.f1980a.setElevation(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void t(int i) {
        this.f1980a.offsetTopAndBottom(i);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean u() {
        return this.f1980a.setHasOverlappingRendering(true);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean v() {
        return this.f1980a.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void w(Matrix matrix) {
        this.f1980a.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void x() {
        RenderNode renderNode = this.f1980a;
        renderNode.setUseCompositingLayer(false, null);
        renderNode.setHasOverlappingRendering(true);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void y(int i) {
        this.f1980a.offsetLeftAndRight(i);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int z() {
        return this.f1980a.getBottom();
    }
}
