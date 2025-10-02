package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.MotionReferencePlacementDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "PlacementScope", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class Placeable implements Measured {
    public int d;
    public int e;
    public long f;
    public long g = PlaceableKt.b;
    public long h = 0;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @PlacementScopeMarker
    @SourceDebugExtension
    public static abstract class PlacementScope {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1892a;

        /* JADX WARN: Multi-variable type inference failed */
        public static final void a(PlacementScope placementScope, Placeable placeable) {
            placementScope.getClass();
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).w(placementScope.f1892a);
            }
        }

        public static void g(PlacementScope placementScope, Placeable placeable, long j) {
            placementScope.getClass();
            a(placementScope, placeable);
            placeable.s0(IntOffset.d(j, placeable.h), BitmapDescriptorFactory.HUE_RED, null);
        }

        public static void h(PlacementScope placementScope, Placeable placeable, int i, int i2) {
            long j = (i << 32) | (i2 & 4294967295L);
            if (placementScope.c() == LayoutDirection.d || placementScope.d() == 0) {
                a(placementScope, placeable);
                placeable.s0(IntOffset.d(j, placeable.h), BitmapDescriptorFactory.HUE_RED, null);
            } else {
                int iD = (placementScope.d() - placeable.d) - ((int) (j >> 32));
                a(placementScope, placeable);
                placeable.s0(IntOffset.d((iD << 32) | (((int) (j & 4294967295L)) & 4294967295L), placeable.h), BitmapDescriptorFactory.HUE_RED, null);
            }
        }

        public static void i(PlacementScope placementScope, Placeable placeable, int i, int i2) {
            Function1 function1 = PlaceableKt.f1893a;
            long j = (i << 32) | (i2 & 4294967295L);
            LayoutDirection layoutDirectionC = placementScope.c();
            LayoutDirection layoutDirection = LayoutDirection.d;
            PlaceableKt$DefaultLayerBlock$1 placeableKt$DefaultLayerBlock$1 = PlaceableKt$DefaultLayerBlock$1.h;
            if (layoutDirectionC == layoutDirection || placementScope.d() == 0) {
                a(placementScope, placeable);
                placeable.s0(IntOffset.d(j, placeable.h), BitmapDescriptorFactory.HUE_RED, placeableKt$DefaultLayerBlock$1);
            } else {
                int iD = (placementScope.d() - placeable.d) - ((int) (j >> 32));
                a(placementScope, placeable);
                placeable.s0(IntOffset.d((iD << 32) | (((int) (j & 4294967295L)) & 4294967295L), placeable.h), BitmapDescriptorFactory.HUE_RED, placeableKt$DefaultLayerBlock$1);
            }
        }

        public static void j(PlacementScope placementScope, Placeable placeable, long j) {
            Function1 function1 = PlaceableKt.f1893a;
            LayoutDirection layoutDirectionC = placementScope.c();
            LayoutDirection layoutDirection = LayoutDirection.d;
            PlaceableKt$DefaultLayerBlock$1 placeableKt$DefaultLayerBlock$1 = PlaceableKt$DefaultLayerBlock$1.h;
            if (layoutDirectionC == layoutDirection || placementScope.d() == 0) {
                a(placementScope, placeable);
                placeable.s0(IntOffset.d(j, placeable.h), BitmapDescriptorFactory.HUE_RED, placeableKt$DefaultLayerBlock$1);
            } else {
                int iD = (placementScope.d() - placeable.d) - ((int) (j >> 32));
                a(placementScope, placeable);
                placeable.s0(IntOffset.d((((int) (j & 4294967295L)) & 4294967295L) | (iD << 32), placeable.h), BitmapDescriptorFactory.HUE_RED, placeableKt$DefaultLayerBlock$1);
            }
        }

        public static void k(PlacementScope placementScope, Placeable placeable, long j, GraphicsLayer graphicsLayer) {
            if (placementScope.c() == LayoutDirection.d || placementScope.d() == 0) {
                a(placementScope, placeable);
                placeable.n0(IntOffset.d(j, placeable.h), BitmapDescriptorFactory.HUE_RED, graphicsLayer);
            } else {
                int iD = (placementScope.d() - placeable.d) - ((int) (j >> 32));
                a(placementScope, placeable);
                placeable.n0(IntOffset.d((((int) (j & 4294967295L)) & 4294967295L) | (iD << 32), placeable.h), BitmapDescriptorFactory.HUE_RED, graphicsLayer);
            }
        }

        public static /* synthetic */ void m(PlacementScope placementScope, Placeable placeable, int i, int i2, Function1 function1, int i3) {
            if ((i3 & 8) != 0) {
                Function1 function12 = PlaceableKt.f1893a;
                function1 = PlaceableKt$DefaultLayerBlock$1.h;
            }
            placementScope.l(placeable, i, i2, BitmapDescriptorFactory.HUE_RED, function1);
        }

        public static void n(PlacementScope placementScope, Placeable placeable, long j) {
            Function1 function1 = PlaceableKt.f1893a;
            placementScope.getClass();
            a(placementScope, placeable);
            placeable.s0(IntOffset.d(j, placeable.h), BitmapDescriptorFactory.HUE_RED, PlaceableKt$DefaultLayerBlock$1.h);
        }

        public LayoutCoordinates b() {
            return null;
        }

        public abstract LayoutDirection c();

        public abstract int d();

        public final void e(Placeable placeable, int i, int i2, float f) {
            a(this, placeable);
            placeable.s0(IntOffset.d((i2 & 4294967295L) | (i << 32), placeable.h), f, null);
        }

        public final void l(Placeable placeable, int i, int i2, float f, Function1 function1) {
            a(this, placeable);
            placeable.s0(IntOffset.d((i2 & 4294967295L) | (i << 32), placeable.h), f, function1);
        }
    }

    public Placeable() {
        long j = 0;
        this.f = (j & 4294967295L) | (j << 32);
    }

    public int h0() {
        return (int) (this.f & 4294967295L);
    }

    public int i0() {
        return (int) (this.f >> 32);
    }

    public final void k0() {
        this.d = RangesKt.c((int) (this.f >> 32), Constraints.j(this.g), Constraints.h(this.g));
        this.e = RangesKt.c((int) (this.f & 4294967295L), Constraints.i(this.g), Constraints.g(this.g));
        int i = this.d;
        long j = this.f;
        this.h = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public void n0(long j, float f, GraphicsLayer graphicsLayer) {
        s0(j, f, null);
    }

    public abstract void s0(long j, float f, Function1 function1);

    public final void u0(long j) {
        if (IntSize.b(this.f, j)) {
            return;
        }
        this.f = j;
        k0();
    }

    public final void v0(long j) {
        if (Constraints.b(this.g, j)) {
            return;
        }
        this.g = j;
        k0();
    }
}
