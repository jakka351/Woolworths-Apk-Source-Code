package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class VelocityTracker {

    /* renamed from: a, reason: collision with root package name */
    public final VelocityTracker1D f1867a;
    public final VelocityTracker1D b;
    public long c;

    public VelocityTracker() {
        VelocityTracker1D.Strategy strategy = VelocityTracker1D.Strategy.d;
        this.f1867a = new VelocityTracker1D();
        this.b = new VelocityTracker1D();
    }

    public final void a(long j, long j2) {
        this.f1867a.a(j, Float.intBitsToFloat((int) (j2 >> 32)));
        this.b.a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public final long b() {
        return c(VelocityKt.a(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    public final long c(long j) {
        if (Velocity.d(j) <= BitmapDescriptorFactory.HUE_RED || Velocity.e(j) <= BitmapDescriptorFactory.HUE_RED) {
            InlineClassHelperKt.b("maximumVelocity should be a positive value. You specified=" + ((Object) Velocity.i(j)));
        }
        return VelocityKt.a(this.f1867a.c(Velocity.d(j)), this.b.c(Velocity.e(j)));
    }

    public final void d() {
        VelocityTracker1D velocityTracker1D = this.f1867a;
        DataPointAtTime[] dataPointAtTimeArr = velocityTracker1D.d;
        ArraysKt.B(dataPointAtTimeArr, 0, dataPointAtTimeArr.length, null);
        velocityTracker1D.e = 0;
        VelocityTracker1D velocityTracker1D2 = this.b;
        DataPointAtTime[] dataPointAtTimeArr2 = velocityTracker1D2.d;
        ArraysKt.B(dataPointAtTimeArr2, 0, dataPointAtTimeArr2.length, null);
        velocityTracker1D2.e = 0;
        this.c = 0L;
    }
}
