package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi23;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RequiresApi
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RenderNodeApi23 implements DeviceRenderNode {
    public static boolean g = true;

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f1979a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi23$Companion;", "", "", "needToValidateAccess", "Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public RenderNodeApi23(AndroidComposeView androidComposeView) {
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.f1979a = renderNodeCreate;
        if (g) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            RenderNodeVerificationHelper28.c(renderNodeCreate, RenderNodeVerificationHelper28.a(renderNodeCreate));
            RenderNodeVerificationHelper28.d(renderNodeCreate, RenderNodeVerificationHelper28.b(renderNodeCreate));
            RenderNodeVerificationHelper24.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            g = false;
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void A(float f) {
        this.f1979a.setPivotX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void B(float f) {
        this.f1979a.setPivotY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void C(Outline outline) {
        this.f1979a.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void D(boolean z) {
        this.f1979a.setClipToOutline(z);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean E(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        return this.f1979a.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: F, reason: from getter */
    public final int getC() {
        return this.c;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void G(int i) {
        RenderNodeVerificationHelper28.c(this.f1979a, i);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void H(CanvasHolder canvasHolder, Path path, Function1 function1) {
        Canvas canvasStart = this.f1979a.start(getWidth(), getHeight());
        AndroidCanvas androidCanvas = canvasHolder.f1764a;
        Canvas canvas = androidCanvas.f1755a;
        androidCanvas.f1755a = canvasStart;
        if (path != null) {
            androidCanvas.save();
            androidCanvas.l(path, 1);
        }
        ((RenderNodeLayer$updateDisplayList$1$1) function1).invoke(androidCanvas);
        if (path != null) {
            androidCanvas.m();
        }
        canvasHolder.f1764a.f1755a = canvas;
        this.f1979a.end(canvasStart);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void I(int i) {
        RenderNodeVerificationHelper28.d(this.f1979a, i);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float J() {
        return this.f1979a.getElevation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float a() {
        return this.f1979a.getAlpha();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void b(float f) {
        this.f1979a.setAlpha(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void c(float f) {
        this.f1979a.setTranslationY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void d(float f) {
        this.f1979a.setCameraDistance(-f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void e(float f) {
        this.f1979a.setRotationX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void f(float f) {
        this.f1979a.setRotationY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void g(float f) {
        this.f1979a.setRotation(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getHeight() {
        return this.e - this.c;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getWidth() {
        return this.d - this.b;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean h() {
        return this.f1979a.isValid();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: i, reason: from getter */
    public final int getD() {
        return this.d;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void j(float f) {
        this.f1979a.setScaleX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void k(RenderEffect renderEffect) {
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void l(float f) {
        this.f1979a.setScaleY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void m(float f) {
        this.f1979a.setTranslationX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: n, reason: from getter */
    public final int getB() {
        return this.b;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void o() {
        RenderNodeVerificationHelper24.a(this.f1979a);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: p, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void q(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f1979a);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void r(boolean z) {
        this.f = z;
        this.f1979a.setClipToBounds(z);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void s(float f) {
        this.f1979a.setElevation(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void t(int i) {
        this.c += i;
        this.e += i;
        this.f1979a.offsetTopAndBottom(i);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean u() {
        return this.f1979a.setHasOverlappingRendering(true);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean v() {
        return this.f1979a.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void w(Matrix matrix) {
        this.f1979a.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void x() {
        this.f1979a.setLayerType(0);
        this.f1979a.setHasOverlappingRendering(true);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void y(int i) {
        this.b += i;
        this.d += i;
        this.f1979a.offsetLeftAndRight(i);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: z, reason: from getter */
    public final int getE() {
        return this.e;
    }
}
