package ovh.plrapps.mapcompose.api;

import androidx.compose.runtime.MutableDoubleState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.MutexImpl;
import ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState;
import ovh.plrapps.mapcompose.utils.RotationUtilsKt;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.api.LayoutApiKt", f = "LayoutApi.kt", l = {485, 626}, m = "visibleArea-70tqf50")
/* loaded from: classes8.dex */
final class LayoutApiKt$visibleArea$1 extends ContinuationImpl {
    public MutexImpl p;
    public double q;
    public double r;
    public double s;
    public double t;
    public double u;
    public double v;
    public double w;
    public double x;
    public /* synthetic */ Object y;
    public int z;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LayoutApiKt$visibleArea$1 layoutApiKt$visibleArea$1;
        double d;
        double d2;
        double d3;
        MutexImpl mutexImpl;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        this.y = obj;
        int i = this.z | Integer.MIN_VALUE;
        this.z = i;
        MutexImpl mutexImpl2 = LayoutApiKt.f26931a;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.z = i - Integer.MIN_VALUE;
            layoutApiKt$visibleArea$1 = this;
        } else {
            layoutApiKt$visibleArea$1 = new LayoutApiKt$visibleArea$1(this);
        }
        Object obj2 = layoutApiKt$visibleArea$1.y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = layoutApiKt$visibleArea$1.z;
        if (i2 == 0) {
            ResultKt.b(obj2);
            throw null;
        }
        if (i2 == 1) {
            ZoomPanRotateState zoomPanRotateState = (ZoomPanRotateState) layoutApiKt$visibleArea$1.p;
            ResultKt.b(obj2);
            MutableDoubleState mutableDoubleState = zoomPanRotateState.r;
            int i3 = zoomPanRotateState.b;
            int i4 = zoomPanRotateState.f26960a;
            MutableDoubleState mutableDoubleState2 = zoomPanRotateState.l;
            MutableFloatState mutableFloatState = zoomPanRotateState.m;
            MutableDoubleState mutableDoubleState3 = zoomPanRotateState.s;
            SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl = (SnapshotMutableDoubleStateImpl) mutableDoubleState;
            int i5 = ((int) (0 >> 32)) * 2;
            double d9 = i4 * 2;
            SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl2 = (SnapshotMutableDoubleStateImpl) mutableDoubleState2;
            double dF = snapshotMutableDoubleStateImpl.f() - ((((int) (zoomPanRotateState.t() >> 32)) + i5) / (snapshotMutableDoubleStateImpl2.f() * d9));
            SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl3 = (SnapshotMutableDoubleStateImpl) mutableDoubleState3;
            double dF2 = snapshotMutableDoubleStateImpl3.f();
            double dT = ((int) (zoomPanRotateState.t() & 4294967295L)) + (((int) (0 & 4294967295L)) * 2);
            double d10 = i3 * 2;
            double dF3 = dF2 - (dT / (snapshotMutableDoubleStateImpl2.f() * d10));
            double dT2 = ((((int) (zoomPanRotateState.t() >> 32)) + i5) / (snapshotMutableDoubleStateImpl2.f() * d9)) + snapshotMutableDoubleStateImpl.f();
            double dT3 = ((((int) (zoomPanRotateState.t() & 4294967295L)) + r1) / (snapshotMutableDoubleStateImpl2.f() * d10)) + snapshotMutableDoubleStateImpl3.f();
            double d11 = i3 / i4;
            double dF4 = snapshotMutableDoubleStateImpl.f() / d11;
            double d12 = dF / d11;
            SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl = (SnapshotMutableFloatStateImpl) mutableFloatState;
            double dA = RotationUtilsKt.a(d12, dF3, dF4, snapshotMutableDoubleStateImpl3.f(), -(snapshotMutableFloatStateImpl.a() * 0.017453292f)) * d11;
            double dB = RotationUtilsKt.b(d12, dF3, dF4, snapshotMutableDoubleStateImpl3.f(), -(snapshotMutableFloatStateImpl.a() * 0.017453292f));
            double d13 = dT2 / d11;
            double dA2 = RotationUtilsKt.a(d13, dF3, dF4, snapshotMutableDoubleStateImpl3.f(), -(snapshotMutableFloatStateImpl.a() * 0.017453292f)) * d11;
            double dB2 = RotationUtilsKt.b(d13, dF3, dF4, snapshotMutableDoubleStateImpl3.f(), -(snapshotMutableFloatStateImpl.a() * 0.017453292f));
            double dA3 = RotationUtilsKt.a(d13, dT3, dF4, snapshotMutableDoubleStateImpl3.f(), -(snapshotMutableFloatStateImpl.a() * 0.017453292f)) * d11;
            double dB3 = RotationUtilsKt.b(d13, dT3, dF4, snapshotMutableDoubleStateImpl3.f(), -(snapshotMutableFloatStateImpl.a() * 0.017453292f));
            double dA4 = RotationUtilsKt.a(d12, dT3, dF4, snapshotMutableDoubleStateImpl3.f(), -(snapshotMutableFloatStateImpl.a() * 0.017453292f)) * d11;
            double dB4 = RotationUtilsKt.b(d12, dT3, dF4, snapshotMutableDoubleStateImpl3.f(), -(snapshotMutableFloatStateImpl.a() * 0.017453292f));
            MutexImpl mutexImpl3 = LayoutApiKt.f26931a;
            layoutApiKt$visibleArea$1.p = mutexImpl3;
            layoutApiKt$visibleArea$1.q = dA;
            layoutApiKt$visibleArea$1.r = dB;
            layoutApiKt$visibleArea$1.s = dA2;
            layoutApiKt$visibleArea$1.t = dB2;
            layoutApiKt$visibleArea$1.u = dA3;
            layoutApiKt$visibleArea$1.v = dB3;
            layoutApiKt$visibleArea$1.w = dA4;
            layoutApiKt$visibleArea$1.x = dB4;
            layoutApiKt$visibleArea$1.z = 2;
            if (mutexImpl3.a(layoutApiKt$visibleArea$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            d = dA4;
            d2 = dA;
            d3 = dB4;
            mutexImpl = mutexImpl3;
            d4 = dA3;
            d5 = dB2;
            d6 = dB3;
            d7 = dB;
            d8 = dA2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            double d14 = layoutApiKt$visibleArea$1.x;
            double d15 = layoutApiKt$visibleArea$1.w;
            double d16 = layoutApiKt$visibleArea$1.v;
            double d17 = layoutApiKt$visibleArea$1.u;
            double d18 = layoutApiKt$visibleArea$1.t;
            double d19 = layoutApiKt$visibleArea$1.s;
            d7 = layoutApiKt$visibleArea$1.r;
            d2 = layoutApiKt$visibleArea$1.q;
            MutexImpl mutexImpl4 = layoutApiKt$visibleArea$1.p;
            ResultKt.b(obj2);
            mutexImpl = mutexImpl4;
            d3 = d14;
            d8 = d19;
            d6 = d16;
            d4 = d17;
            d5 = d18;
            d = d15;
        }
        try {
            VisibleArea visibleArea = LayoutApiKt.b;
            if (visibleArea == null) {
                VisibleArea visibleArea2 = new VisibleArea();
                visibleArea2.f26933a = d2;
                visibleArea2.b = d7;
                visibleArea2.c = d8;
                visibleArea2.d = d5;
                visibleArea2.e = d4;
                visibleArea2.f = d6;
                visibleArea2.g = d;
                visibleArea2.h = d3;
                LayoutApiKt.b = visibleArea2;
            } else {
                visibleArea.f26933a = d2;
                visibleArea.b = d7;
                visibleArea.c = d8;
                visibleArea.d = d5;
                visibleArea.e = d4;
                visibleArea.f = d6;
                visibleArea.g = d;
                visibleArea.h = d3;
            }
            VisibleArea visibleArea3 = LayoutApiKt.b;
            Intrinsics.f(visibleArea3, "null cannot be cast to non-null type ovh.plrapps.mapcompose.api.VisibleArea");
            mutexImpl.c(null);
            return visibleArea3;
        } catch (Throwable th) {
            mutexImpl.c(null);
            throw th;
        }
    }
}
