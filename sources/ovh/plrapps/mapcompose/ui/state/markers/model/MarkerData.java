package ovh.plrapps.mapcompose.ui.state.markers.model;

import androidx.compose.runtime.MutableDoubleState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotDoubleStateKt;
import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.DpOffset;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ovh.plrapps.mapcompose.utils.Point;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/state/markers/model/MarkerData;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarkerData {

    /* renamed from: a, reason: collision with root package name */
    public final String f26963a;
    public final RenderingStrategy b;
    public final ComposableLambdaImpl c;
    public final MutableDoubleState d;
    public final MutableDoubleState e;
    public final MutableState f;
    public final MutableState l;
    public final MutableState m;
    public final MutableState n;
    public int q;
    public int r;
    public Double s;
    public Double t;
    public final UUID u;
    public final MutableState g = SnapshotStateKt.f(new DpOffset(0));
    public final MutableState h = SnapshotStateKt.f(Boolean.FALSE);
    public final MutableState i = SnapshotStateKt.f(null);
    public final MutableState j = SnapshotStateKt.f(null);
    public final MutableState k = SnapshotStateKt.f(null);
    public final MutableFloatState o = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
    public final MutableState p = SnapshotStateKt.f(Boolean.TRUE);

    public MarkerData(String str, double d, double d2, long j, boolean z, long j2, long j3, RenderingStrategy renderingStrategy, ComposableLambdaImpl composableLambdaImpl) {
        this.f26963a = str;
        this.b = renderingStrategy;
        this.c = composableLambdaImpl;
        this.d = SnapshotDoubleStateKt.a(d);
        this.e = SnapshotDoubleStateKt.a(d2);
        this.f = SnapshotStateKt.f(new Offset(j));
        this.l = SnapshotStateKt.f(Boolean.valueOf(z));
        this.m = SnapshotStateKt.f(new Offset(j2));
        this.n = SnapshotStateKt.f(new Offset(j3));
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.g(uuidRandomUUID, "randomUUID(...)");
        this.u = uuidRandomUUID;
    }

    public final Point a() {
        Double d = this.s;
        if (d == null) {
            return null;
        }
        double dDoubleValue = d.doubleValue();
        Double d2 = this.t;
        if (d2 == null) {
            return null;
        }
        double dDoubleValue2 = d2.doubleValue();
        int i = this.q;
        MutableState mutableState = this.n;
        double dE = dDoubleValue + (i / 2) + (Offset.e(((Offset) ((SnapshotMutableStateImpl) mutableState).getD()).f1751a) * i);
        int i2 = this.r;
        return new Point(dE, dDoubleValue2 + (i2 / 2) + (Offset.f(((Offset) ((SnapshotMutableStateImpl) mutableState).getD()).f1751a) * i2));
    }

    public final long b() {
        return ((Offset) ((SnapshotMutableStateImpl) this.f).getD()).f1751a;
    }

    public final boolean c() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.p).getD()).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MarkerData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type ovh.plrapps.mapcompose.ui.state.markers.model.MarkerData");
        MarkerData markerData = (MarkerData) obj;
        return Intrinsics.c(this.f26963a, markerData.f26963a) && ((SnapshotMutableDoubleStateImpl) this.d).f() == ((SnapshotMutableDoubleStateImpl) markerData.d).f() && ((SnapshotMutableDoubleStateImpl) this.e).f() == ((SnapshotMutableDoubleStateImpl) markerData.e).f() && Intrinsics.c(this.u, markerData.u);
    }

    public final int hashCode() {
        return Double.hashCode(((SnapshotMutableDoubleStateImpl) this.e).f()) + ((Double.hashCode(((SnapshotMutableDoubleStateImpl) this.d).f()) + (this.f26963a.hashCode() * 31)) * 31);
    }
}
