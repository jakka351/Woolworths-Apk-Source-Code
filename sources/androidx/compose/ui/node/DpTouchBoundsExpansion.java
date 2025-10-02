package androidx.compose.ui.node;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class DpTouchBoundsExpansion {

    /* renamed from: a, reason: collision with root package name */
    public final float f1909a;
    public final float b;
    public final float c;
    public final float d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/DpTouchBoundsExpansion$Companion;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    public DpTouchBoundsExpansion(float f, float f2, float f3, float f4) {
        this.f1909a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            InlineClassHelperKt.a("Left must be non-negative");
        }
        if (f2 < BitmapDescriptorFactory.HUE_RED) {
            InlineClassHelperKt.a("Top must be non-negative");
        }
        if (f3 < BitmapDescriptorFactory.HUE_RED) {
            InlineClassHelperKt.a("Right must be non-negative");
        }
        if (f4 >= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        InlineClassHelperKt.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpTouchBoundsExpansion)) {
            return false;
        }
        DpTouchBoundsExpansion dpTouchBoundsExpansion = (DpTouchBoundsExpansion) obj;
        return Dp.a(this.f1909a, dpTouchBoundsExpansion.f1909a) && Dp.a(this.b, dpTouchBoundsExpansion.b) && Dp.a(this.c, dpTouchBoundsExpansion.c) && Dp.a(this.d, dpTouchBoundsExpansion.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + a.b(this.d, a.b(this.c, a.b(this.b, Float.hashCode(this.f1909a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) Dp.b(this.f1909a)) + ", top=" + ((Object) Dp.b(this.b)) + ", end=" + ((Object) Dp.b(this.c)) + ", bottom=" + ((Object) Dp.b(this.d)) + ", isLayoutDirectionAware=true)";
    }
}
