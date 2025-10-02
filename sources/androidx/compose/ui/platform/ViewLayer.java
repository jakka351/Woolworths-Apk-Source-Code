package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002./R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\u001e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR$\u0010)\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/platform/AndroidComposeView;", "d", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", "e", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "container", "", "value", "k", "Z", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "", "q", "J", "getLayerId", "()J", "layerId", "Landroidx/compose/ui/graphics/Matrix;", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "getOwnerViewId", "ownerViewId", "", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "Landroidx/compose/ui/graphics/Path;", "getManualClipPath", "()Landroidx/compose/ui/graphics/Path;", "manualClipPath", "Companion", "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {
    public static final Function2 s = null;
    public static final ViewLayer$Companion$OutlineProvider$1 t = new ViewLayer$Companion$OutlineProvider$1();
    public static Method u;
    public static Field v;
    public static boolean w;
    public static boolean x;

    /* renamed from: d, reason: from kotlin metadata */
    public final AndroidComposeView ownerView;

    /* renamed from: e, reason: from kotlin metadata */
    public final DrawChildContainer container;
    public Function2 f;
    public Function0 g;
    public final OutlineResolver h;
    public boolean i;
    public Rect j;

    /* renamed from: k, reason: from kotlin metadata */
    public boolean isInvalidated;
    public boolean l;
    public final CanvasHolder m;
    public final LayerMatrixCache n;
    public long o;
    public boolean p;

    /* renamed from: q, reason: from kotlin metadata */
    public final long layerId;
    public int r;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$Companion;", "", "Lkotlin/Function2;", "Landroid/view/View;", "Landroid/graphics/Matrix;", "", "getMatrix", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static void a(View view) {
            try {
                if (!ViewLayer.w) {
                    ViewLayer.w = true;
                    ViewLayer.u = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    ViewLayer.v = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    Method method = ViewLayer.u;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.v;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.v;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.u;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                ViewLayer.x = true;
            }
        }
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$UniqueDrawingIdApi29;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class UniqueDrawingIdApi29 {
        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, Function2 function2, Function0 function0) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.f = function2;
        this.g = function0;
        this.h = new OutlineResolver();
        this.m = new CanvasHolder();
        this.n = new LayerMatrixCache(ViewLayer$Companion$getMatrix$1.h);
        this.o = TransformOrigin.b;
        this.p = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.layerId = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        OutlineResolver outlineResolver = this.h;
        if (outlineResolver.e()) {
            return null;
        }
        return outlineResolver.d();
    }

    private final void setInvalidated(boolean z) {
        if (z != this.isInvalidated) {
            this.isInvalidated = z;
            this.ownerView.S(this, z);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void a(Function2 function2, Function0 function0) {
        this.container.addView(this);
        this.n.h();
        this.i = false;
        this.l = false;
        this.o = TransformOrigin.b;
        this.f = function2;
        this.g = function0;
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void b(Canvas canvas, GraphicsLayer graphicsLayer) {
        boolean z = getElevation() > BitmapDescriptorFactory.HUE_RED;
        this.l = z;
        if (z) {
            canvas.n();
        }
        this.container.a(canvas, this, getDrawingTime());
        if (this.l) {
            canvas.g();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void c(MutableRect mutableRect, boolean z) {
        LayerMatrixCache layerMatrixCache = this.n;
        if (z) {
            layerMatrixCache.f(this, mutableRect);
        } else {
            layerMatrixCache.d(this, mutableRect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void d(float[] fArr) {
        Matrix.f(fArr, this.n.b(this));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.ownerView;
        androidComposeView.I = true;
        this.f = null;
        this.g = null;
        androidComposeView.X(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        boolean z;
        CanvasHolder canvasHolder = this.m;
        AndroidCanvas androidCanvas = canvasHolder.f1764a;
        android.graphics.Canvas canvas2 = androidCanvas.f1755a;
        androidCanvas.f1755a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z = false;
        } else {
            androidCanvas.save();
            this.h.a(androidCanvas);
            z = true;
        }
        Function2 function2 = this.f;
        if (function2 != null) {
            function2.invoke(androidCanvas, null);
        }
        if (z) {
            androidCanvas.m();
        }
        canvasHolder.f1764a.f1755a = canvas2;
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final long e(long j, boolean z) {
        LayerMatrixCache layerMatrixCache = this.n;
        return z ? layerMatrixCache.g(j, this) : layerMatrixCache.e(j, this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void f(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (i == getWidth() && i2 == getHeight()) {
            return;
        }
        setPivotX(TransformOrigin.b(this.o) * i);
        setPivotY(TransformOrigin.c(this.o) * i2);
        setOutlineProvider(this.h.b() != null ? t : null);
        layout(getLeft(), getTop(), getLeft() + i, getTop() + i2);
        l();
        this.n.c();
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final boolean g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (this.i) {
            return BitmapDescriptorFactory.HUE_RED <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && BitmapDescriptorFactory.HUE_RED <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.h.f(j);
        }
        return true;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @NotNull
    public final DrawChildContainer getContainer() {
        return this.container;
    }

    public long getLayerId() {
        return this.layerId;
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.a(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    @NotNull
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo2getUnderlyingMatrixsQKQjiQ() {
        return this.n.b(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void h(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        Function0 function0;
        int i = reusableGraphicsLayerScope.d | this.r;
        if ((i & 4096) != 0) {
            long j = reusableGraphicsLayerScope.q;
            this.o = j;
            setPivotX(TransformOrigin.b(j) * getWidth());
            setPivotY(TransformOrigin.c(this.o) * getHeight());
        }
        if ((i & 1) != 0) {
            setScaleX(reusableGraphicsLayerScope.e);
        }
        if ((i & 2) != 0) {
            setScaleY(reusableGraphicsLayerScope.f);
        }
        if ((i & 4) != 0) {
            setAlpha(reusableGraphicsLayerScope.g);
        }
        if ((i & 8) != 0) {
            setTranslationX(reusableGraphicsLayerScope.h);
        }
        if ((i & 16) != 0) {
            setTranslationY(reusableGraphicsLayerScope.i);
        }
        if ((i & 32) != 0) {
            setElevation(reusableGraphicsLayerScope.j);
        }
        if ((i & 1024) != 0) {
            setRotation(reusableGraphicsLayerScope.o);
        }
        if ((i & 256) != 0) {
            setRotationX(reusableGraphicsLayerScope.m);
        }
        if ((i & 512) != 0) {
            setRotationY(reusableGraphicsLayerScope.n);
        }
        if ((i & 2048) != 0) {
            setCameraDistancePx(reusableGraphicsLayerScope.p);
        }
        boolean z = getManualClipPath() != null;
        boolean z2 = reusableGraphicsLayerScope.s;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
        boolean z3 = z2 && reusableGraphicsLayerScope.r != rectangleShapeKt$RectangleShape$1;
        if ((i & 24576) != 0) {
            this.i = z2 && reusableGraphicsLayerScope.r == rectangleShapeKt$RectangleShape$1;
            l();
            setClipToOutline(z3);
        }
        boolean zG = this.h.g(reusableGraphicsLayerScope.x, reusableGraphicsLayerScope.g, z3, reusableGraphicsLayerScope.j, reusableGraphicsLayerScope.t);
        OutlineResolver outlineResolver = this.h;
        if (outlineResolver.getF()) {
            setOutlineProvider(outlineResolver.b() != null ? t : null);
        }
        boolean z4 = getManualClipPath() != null;
        if (z != z4 || (z4 && zG)) {
            invalidate();
        }
        if (!this.l && getElevation() > BitmapDescriptorFactory.HUE_RED && (function0 = this.g) != null) {
            function0.invoke();
        }
        if ((i & 7963) != 0) {
            this.n.c();
        }
        int i2 = Build.VERSION.SDK_INT;
        if ((i & 64) != 0) {
            ViewLayerVerificationHelper28.a(this, ColorKt.j(reusableGraphicsLayerScope.k));
        }
        if ((i & 128) != 0) {
            ViewLayerVerificationHelper28.b(this, ColorKt.j(reusableGraphicsLayerScope.l));
        }
        if (i2 >= 31 && (131072 & i) != 0) {
            ViewLayerVerificationHelper31.a(this, reusableGraphicsLayerScope.w);
        }
        if ((i & 32768) != 0) {
            setLayerType(0, null);
            this.p = true;
        }
        this.r = reusableGraphicsLayerScope.d;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.p;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void i(float[] fArr) {
        float[] fArrA = this.n.a(this);
        if (fArrA != null) {
            Matrix.f(fArr, fArrA);
        }
    }

    @Override // android.view.View, androidx.compose.ui.node.OwnedLayer
    public final void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void j(long j) {
        int i = (int) (j >> 32);
        int left = getLeft();
        LayerMatrixCache layerMatrixCache = this.n;
        if (i != left) {
            offsetLeftAndRight(i - getLeft());
            layerMatrixCache.c();
        }
        int i2 = (int) (j & 4294967295L);
        if (i2 != getTop()) {
            offsetTopAndBottom(i2 - getTop());
            layerMatrixCache.c();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void k() {
        if (!this.isInvalidated || x) {
            return;
        }
        Companion.a(this);
        setInvalidated(false);
    }

    public final void l() {
        Rect rect;
        if (this.i) {
            Rect rect2 = this.j;
            if (rect2 == null) {
                this.j = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.e(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.j;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }
}
