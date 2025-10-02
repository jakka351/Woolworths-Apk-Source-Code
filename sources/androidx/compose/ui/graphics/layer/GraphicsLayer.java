package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GraphicsLayer {
    public static final LayerSnapshotImpl y;

    /* renamed from: a, reason: collision with root package name */
    public final GraphicsLayerImpl f1805a;
    public Outline f;
    public float j;
    public androidx.compose.ui.graphics.Outline k;
    public Path l;
    public AndroidPath m;
    public boolean n;
    public CanvasDrawScope o;
    public AndroidPaint p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public Density b = DrawContextKt.f1800a;
    public LayoutDirection c = LayoutDirection.d;
    public Function1 d = GraphicsLayer$drawBlock$1.h;
    public final Function1 e = new GraphicsLayer$clipDrawBlock$1(this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final ChildLayerDependenciesTracker r = new ChildLayerDependenciesTracker();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer$Companion;", "", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "SnapshotImpl", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        boolean z = LayerManager.f1808a;
        y = LayerManager.f1808a ? LayerSnapshotV21.f1809a : LayerSnapshotV28.f1810a;
    }

    public GraphicsLayer(GraphicsLayerImpl graphicsLayerImpl) {
        this.f1805a = graphicsLayerImpl;
        graphicsLayerImpl.z(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            GraphicsLayerImpl graphicsLayerImpl = this.f1805a;
            if (z || graphicsLayerImpl.w() > BitmapDescriptorFactory.HUE_RED) {
                Path path = this.l;
                if (path != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = path instanceof AndroidPath;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((AndroidPath) path).f1761a.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.l()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            OutlineVerificationHelper.a(outline, path);
                        } else {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(((AndroidPath) path).f1761a);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = path;
                    if (outline != null) {
                        outline.setAlpha(graphicsLayerImpl.a());
                        outline2 = outline;
                    }
                    graphicsLayerImpl.t(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.n && this.w) {
                        graphicsLayerImpl.z(false);
                        graphicsLayerImpl.o();
                    } else {
                        graphicsLayerImpl.z(this.w);
                    }
                } else {
                    graphicsLayerImpl.z(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jD = IntSizeKt.d(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    long j3 = j2 == 9205357640488583168L ? jD : j2;
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(graphicsLayerImpl.a());
                    graphicsLayerImpl.t(outline5, IntSizeKt.c(j3));
                }
            } else {
                graphicsLayerImpl.z(false);
                graphicsLayerImpl.t(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.s
            if (r0 == 0) goto L71
            int r0 = r15.q
            if (r0 != 0) goto L71
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker r0 = r15.r
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = r0.f1804a
            if (r1 == 0) goto L1a
            int r2 = r1.q
            int r2 = r2 + (-1)
            r1.q = r2
            r1.b()
            r1 = 0
            r0.f1804a = r1
        L1a:
            androidx.collection.MutableScatterSet r0 = r0.c
            if (r0 == 0) goto L6c
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.f700a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L69
            r4 = 0
            r5 = r4
        L29:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L64
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L43:
            if (r10 >= r8) goto L62
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            androidx.compose.ui.graphics.layer.GraphicsLayer r11 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r11
            int r12 = r11.q
            int r12 = r12 + (-1)
            r11.q = r12
            r11.b()
        L5e:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L43
        L62:
            if (r8 != r9) goto L69
        L64:
            if (r5 == r3) goto L69
            int r5 = r5 + 1
            goto L29
        L69:
            r0.g()
        L6c:
            androidx.compose.ui.graphics.layer.GraphicsLayerImpl r0 = r15.f1805a
            r0.o()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.compose.ui.graphics.drawscope.DrawScope r15) {
        /*
            r14 = this;
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker r0 = r14.r
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = r0.f1804a
            r0.b = r1
            androidx.collection.MutableScatterSet r1 = r0.c
            if (r1 == 0) goto L23
            boolean r2 = r1.d()
            if (r2 == 0) goto L23
            androidx.collection.MutableScatterSet r2 = r0.d
            if (r2 != 0) goto L1d
            int r2 = androidx.collection.ScatterSetKt.f701a
            androidx.collection.MutableScatterSet r2 = new androidx.collection.MutableScatterSet
            r2.<init>()
            r0.d = r2
        L1d:
            r2.l(r1)
            r1.g()
        L23:
            r1 = 1
            r0.e = r1
            kotlin.jvm.functions.Function1 r1 = r14.d
            r1.invoke(r15)
            r15 = 0
            r0.e = r15
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = r0.b
            if (r1 == 0) goto L3b
            int r2 = r1.q
            int r2 = r2 + (-1)
            r1.q = r2
            r1.b()
        L3b:
            androidx.collection.MutableScatterSet r0 = r0.d
            if (r0 == 0) goto L92
            boolean r1 = r0.d()
            if (r1 == 0) goto L92
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.f700a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L8f
            r4 = r15
        L4f:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L8a
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L69:
            if (r9 >= r7) goto L88
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L84
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.graphics.layer.GraphicsLayer r10 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r10
            int r11 = r10.q
            int r11 = r11 + (-1)
            r10.q = r11
            r10.b()
        L84:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L69
        L88:
            if (r7 != r8) goto L8f
        L8a:
            if (r4 == r3) goto L8f
            int r4 = r4 + 1
            goto L4f
        L8f:
            r0.g()
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.c(androidx.compose.ui.graphics.drawscope.DrawScope):void");
    }

    public final androidx.compose.ui.graphics.Outline d() {
        androidx.compose.ui.graphics.Outline rectangle;
        androidx.compose.ui.graphics.Outline outline = this.k;
        Path path = this.l;
        if (outline != null) {
            return outline;
        }
        if (path != null) {
            Outline.Generic generic = new Outline.Generic(path);
            this.k = generic;
            return generic;
        }
        long jD = IntSizeKt.d(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jD = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jD >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jD & 4294967295L)) + fIntBitsToFloat2;
        if (this.j > BitmapDescriptorFactory.HUE_RED) {
            rectangle = new Outline.Rounded(RoundRectKt.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            rectangle = new Outline.Rectangle(new Rect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = rectangle;
        return rectangle;
    }

    public final void e(Density density, LayoutDirection layoutDirection, long j, Function1 function1) {
        boolean zB = IntSize.b(this.u, j);
        GraphicsLayerImpl graphicsLayerImpl = this.f1805a;
        if (!zB) {
            this.u = j;
            long j2 = this.t;
            graphicsLayerImpl.C((int) (j2 >> 32), (int) (j2 & 4294967295L), j);
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = density;
        this.c = layoutDirection;
        this.d = function1;
        graphicsLayerImpl.y(density, layoutDirection, this, this.e);
    }

    public final void f(float f) {
        GraphicsLayerImpl graphicsLayerImpl = this.f1805a;
        if (graphicsLayerImpl.a() == f) {
            return;
        }
        graphicsLayerImpl.b(f);
    }

    public final void g(long j, float f, long j2) {
        if (Offset.c(this.h, j) && Size.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}
