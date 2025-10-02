package ovh.plrapps.mapcompose.api;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;
import ovh.plrapps.mapcompose.ui.state.MapState;
import ovh.plrapps.mapcompose.ui.state.VisibleAreaPadding;
import ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState;
import ovh.plrapps.mapcompose.utils.ApiUtilsKt;
import ovh.plrapps.mapcompose.utils.Point;
import ovh.plrapps.mapcompose.utils.RotationUtilsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mapcompose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class LayoutApiKt {

    /* renamed from: a, reason: collision with root package name */
    public static final MutexImpl f26931a = MutexKt.a();
    public static VisibleArea b;

    public static final Pair a(ZoomPanRotateState zoomPanRotateState, BoundingBox boundingBox, long j) {
        boundingBox.getClass();
        double d = 2;
        double d2 = (0.0d + 0.0d) / d;
        double d3 = (0.0d + 0.0d) / d;
        double d4 = zoomPanRotateState.b;
        double d5 = zoomPanRotateState.f26960a;
        double d6 = d4 / d5;
        double d7 = 1 / d6;
        double d8 = 0.0d * d7;
        double d9 = d7 * 0.0d;
        Point point = new Point(d2 / d6, d3);
        float f = -(((SnapshotMutableFloatStateImpl) zoomPanRotateState.m).a() * 0.017453292f);
        List<Point> listR = CollectionsKt.R(new Point(d8, 0.0d), new Point(d9, 0.0d), new Point(d8, 0.0d), new Point(d9, 0.0d));
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listR, 10));
        for (Point point2 : listR) {
            Intrinsics.h(point2, "point");
            arrayList.add(new Point(RotationUtilsKt.a(point2.f26966a, point2.b, point.f26966a, point.b, f), RotationUtilsKt.b(point2.f26966a, point2.b, point.f26966a, point.b, f)));
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dMin = ((Point) it.next()).f26966a;
        while (it.hasNext()) {
            dMin = Math.min(dMin, ((Point) it.next()).f26966a);
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        double dMin2 = ((Point) it2.next()).b;
        while (it2.hasNext()) {
            dMin2 = Math.min(dMin2, ((Point) it2.next()).b);
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        double dMax = ((Point) it3.next()).f26966a;
        while (it3.hasNext()) {
            dMax = Math.max(dMax, ((Point) it3.next()).f26966a);
        }
        Iterator it4 = arrayList.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        double dMax2 = ((Point) it4.next()).b;
        while (it4.hasNext()) {
            dMax2 = Math.max(dMax2, ((Point) it4.next()).b);
            it4 = it4;
        }
        int iT = (int) (zoomPanRotateState.t() >> 32);
        VisibleAreaPadding visibleAreaPadding = zoomPanRotateState.u;
        float f2 = (iT - visibleAreaPadding.f26959a) - visibleAreaPadding.c;
        float f3 = 1;
        double dE = ((f3 - Offset.e(j)) * f2) / (((dMax * d6) - (dMin * d6)) * d5);
        double d10 = (dMax2 - dMin2) * zoomPanRotateState.b;
        int iT2 = (int) (zoomPanRotateState.t() & 4294967295L);
        VisibleAreaPadding visibleAreaPadding2 = zoomPanRotateState.u;
        return new Pair(new Point(d2, d3), Double.valueOf(zoomPanRotateState.s(Math.min(dE, ((f3 - Offset.f(j)) * ((iT2 - visibleAreaPadding2.b) - visibleAreaPadding2.d)) / d10))));
    }

    public static final long b(MapState mapState) {
        Intrinsics.h(mapState, "<this>");
        ZoomPanRotateState zoomPanRotateState = mapState.b;
        return IntSizeKt.a(zoomPanRotateState.f26960a, zoomPanRotateState.b);
    }

    public static final double c(MapState mapState) {
        Intrinsics.h(mapState, "<this>");
        return ((SnapshotMutableDoubleStateImpl) mapState.b.l).f();
    }

    public static final Object d(MapState mapState, float f, TweenSpec tweenSpec, Continuation continuation) {
        Object objA = ApiUtilsKt.a(6, 10L, new LayoutApiKt$rotateTo$2(mapState, f, tweenSpec, null), (ContinuationImpl) continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ee, code lost:
    
        if (ovh.plrapps.mapcompose.utils.ApiUtilsKt.a(6, 10, r0, r1) == r2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(ovh.plrapps.mapcompose.ui.state.MapState r22, double r23, double r25, double r27, androidx.compose.animation.core.AnimationSpec r29, long r30, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.api.LayoutApiKt.e(ovh.plrapps.mapcompose.ui.state.MapState, double, double, double, androidx.compose.animation.core.AnimationSpec, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void g(MapState mapState, float f, float f2) {
        Intrinsics.h(mapState, "<this>");
        ZoomPanRotateState zoomPanRotateState = mapState.b;
        long jA = OffsetKt.a(f, f2);
        zoomPanRotateState.getClass();
        float fE = Offset.e(jA);
        if (BitmapDescriptorFactory.HUE_RED <= fE && fE <= 1.0f) {
            float f3 = Offset.f(jA);
            if (BitmapDescriptorFactory.HUE_RED <= f3 && f3 <= 1.0f) {
                zoomPanRotateState.y = jA;
                zoomPanRotateState.C(((SnapshotMutableDoubleStateImpl) zoomPanRotateState.n).f(), ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.o).f());
                return;
            }
        }
        throw new IllegalArgumentException("The offset ratio should have values in 0f..1f range");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(ovh.plrapps.mapcompose.ui.state.MapState r8, double r9, double r11, long r13, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            boolean r0 = r15 instanceof ovh.plrapps.mapcompose.api.LayoutApiKt$snapScrollTo$1
            if (r0 == 0) goto L13
            r0 = r15
            ovh.plrapps.mapcompose.api.LayoutApiKt$snapScrollTo$1 r0 = (ovh.plrapps.mapcompose.api.LayoutApiKt$snapScrollTo$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            ovh.plrapps.mapcompose.api.LayoutApiKt$snapScrollTo$1 r0 = new ovh.plrapps.mapcompose.api.LayoutApiKt$snapScrollTo$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.t
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r13 = r0.r
            double r11 = r0.q
            double r9 = r0.p
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState r8 = r0.s
            kotlin.ResultKt.b(r15)
            goto L4d
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.ResultKt.b(r15)
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState r8 = r8.b
            r0.s = r8
            r0.p = r9
            r0.q = r11
            r0.r = r13
            r0.u = r3
            java.lang.Object r15 = r8.r(r0)
            if (r15 != r1) goto L4d
            return r1
        L4d:
            float r15 = androidx.compose.ui.geometry.Offset.e(r13)
            long r0 = r8.t()
            androidx.compose.runtime.MutableDoubleState r2 = r8.l
            r3 = 32
            long r0 = r0 >> r3
            int r0 = (int) r0
            float r0 = (float) r0
            float r15 = r15 * r0
            float r13 = androidx.compose.ui.geometry.Offset.f(r13)
            long r0 = r8.t()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            int r14 = (int) r0
            float r14 = (float) r14
            float r13 = r13 * r14
            ovh.plrapps.mapcompose.ui.state.VisibleAreaPadding r14 = r8.u
            androidx.compose.runtime.MutableFloatState r0 = r8.m
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r0 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r0
            float r0 = r0.a()
            long r0 = ovh.plrapps.mapcompose.api.CommonKt.a(r14, r0)
            int r14 = r8.f26960a
            double r6 = (double) r14
            double r9 = r9 * r6
            androidx.compose.runtime.SnapshotMutableDoubleStateImpl r2 = (androidx.compose.runtime.SnapshotMutableDoubleStateImpl) r2
            double r6 = r2.f()
            double r6 = r6 * r9
            double r9 = (double) r15
            double r6 = r6 + r9
            long r9 = r0 >> r3
            int r9 = (int) r9
            double r9 = (double) r9
            double r6 = r6 - r9
            int r9 = r8.b
            double r9 = (double) r9
            double r11 = r11 * r9
            double r9 = r2.f()
            double r9 = r9 * r11
            double r11 = (double) r13
            double r9 = r9 + r11
            long r11 = r0 & r4
            int r11 = (int) r11
            double r11 = (double) r11
            double r9 = r9 - r11
            r8.C(r6, r9)
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.api.LayoutApiKt.h(ovh.plrapps.mapcompose.ui.state.MapState, double, double, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
