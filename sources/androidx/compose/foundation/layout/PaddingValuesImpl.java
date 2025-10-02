package androidx.compose.foundation.layout;

import android.support.v4.media.session.a;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesImpl;", "Landroidx/compose/foundation/layout/PaddingValues;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PaddingValuesImpl implements PaddingValues {

    /* renamed from: a, reason: collision with root package name */
    public final float f969a;
    public final float b;
    public final float c;
    public final float d;

    public PaddingValuesImpl(float f, float f2, float f3, float f4) {
        this.f969a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= BitmapDescriptorFactory.HUE_RED) & (f2 >= BitmapDescriptorFactory.HUE_RED) & (f3 >= BitmapDescriptorFactory.HUE_RED)) || !(f4 >= BitmapDescriptorFactory.HUE_RED)) {
            InlineClassHelperKt.a("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: a, reason: from getter */
    public final float getD() {
        return this.d;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    public final float b(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.d ? this.f969a : this.c;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    public final float c(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.d ? this.c : this.f969a;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: d, reason: from getter */
    public final float getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
        return Dp.a(this.f969a, paddingValuesImpl.f969a) && Dp.a(this.b, paddingValuesImpl.b) && Dp.a(this.c, paddingValuesImpl.c) && Dp.a(this.d, paddingValuesImpl.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + a.b(this.c, a.b(this.b, Float.hashCode(this.f969a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) Dp.b(this.f969a)) + ", top=" + ((Object) Dp.b(this.b)) + ", end=" + ((Object) Dp.b(this.c)) + ", bottom=" + ((Object) Dp.b(this.d)) + ')';
    }
}
