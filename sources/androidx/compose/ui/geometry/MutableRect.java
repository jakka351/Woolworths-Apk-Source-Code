package androidx.compose.ui.geometry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/geometry/MutableRect;", "", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MutableRect {

    /* renamed from: a, reason: collision with root package name */
    public float f1750a = BitmapDescriptorFactory.HUE_RED;
    public float b = BitmapDescriptorFactory.HUE_RED;
    public float c = BitmapDescriptorFactory.HUE_RED;
    public float d = BitmapDescriptorFactory.HUE_RED;

    public final void a(float f, float f2, float f3, float f4) {
        this.f1750a = Math.max(f, this.f1750a);
        this.b = Math.max(f2, this.b);
        this.c = Math.min(f3, this.c);
        this.d = Math.min(f4, this.d);
    }

    public final boolean b() {
        return (this.f1750a >= this.c) | (this.b >= this.d);
    }

    public final String toString() {
        return "MutableRect(" + GeometryUtilsKt.a(this.f1750a) + ", " + GeometryUtilsKt.a(this.b) + ", " + GeometryUtilsKt.a(this.c) + ", " + GeometryUtilsKt.a(this.d) + ')';
    }
}
