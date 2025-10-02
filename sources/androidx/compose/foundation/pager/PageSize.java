package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PageSize;", "", "Fill", "Fixed", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PageSize {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/PageSize$Fill;", "Landroidx/compose/foundation/pager/PageSize;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Fill implements PageSize {

        /* renamed from: a, reason: collision with root package name */
        public static final Fill f1083a = new Fill();

        @Override // androidx.compose.foundation.pager.PageSize
        public final int a(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, int i2) {
            return i;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/PageSize$Fixed;", "Landroidx/compose/foundation/pager/PageSize;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Fixed implements PageSize {
        @Override // androidx.compose.foundation.pager.PageSize
        public final int a(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, int i2) {
            return lazyLayoutMeasureScope.r1(BitmapDescriptorFactory.HUE_RED);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Fixed) {
                return Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(BitmapDescriptorFactory.HUE_RED);
        }
    }

    int a(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, int i2);
}
