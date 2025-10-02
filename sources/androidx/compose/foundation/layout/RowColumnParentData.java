package androidx.compose.foundation.layout;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnParentData;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RowColumnParentData {

    /* renamed from: a, reason: collision with root package name */
    public float f971a = BitmapDescriptorFactory.HUE_RED;
    public boolean b = true;
    public CrossAxisAlignment c = null;
    public FlowLayoutData d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) obj;
        return Float.compare(this.f971a, rowColumnParentData.f971a) == 0 && this.b == rowColumnParentData.b && Intrinsics.c(this.c, rowColumnParentData.c) && Intrinsics.c(this.d, rowColumnParentData.d);
    }

    public final int hashCode() {
        int iE = b.e(Float.hashCode(this.f971a) * 31, 31, this.b);
        CrossAxisAlignment crossAxisAlignment = this.c;
        return ((iE + (crossAxisAlignment == null ? 0 : crossAxisAlignment.hashCode())) * 31) + (this.d != null ? Float.hashCode(BitmapDescriptorFactory.HUE_RED) : 0);
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f971a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=" + this.d + ')';
    }
}
