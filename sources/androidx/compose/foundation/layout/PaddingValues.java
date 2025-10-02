package androidx.compose.foundation.layout;

import android.support.v4.media.session.a;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValues;", "", "Absolute", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PaddingValues {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValues$Absolute;", "Landroidx/compose/foundation/layout/PaddingValues;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Immutable
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class Absolute implements PaddingValues {
        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: a */
        public final float getD() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        public final float b(LayoutDirection layoutDirection) {
            return BitmapDescriptorFactory.HUE_RED;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        public final float c(LayoutDirection layoutDirection) {
            return BitmapDescriptorFactory.HUE_RED;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: d */
        public final float getB() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Absolute) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }

        public final int hashCode() {
            return Float.hashCode(BitmapDescriptorFactory.HUE_RED) + a.b(BitmapDescriptorFactory.HUE_RED, a.b(BitmapDescriptorFactory.HUE_RED, Float.hashCode(BitmapDescriptorFactory.HUE_RED) * 31, 31), 31);
        }

        public final String toString() {
            return "PaddingValues.Absolute(left=" + ((Object) Dp.b(BitmapDescriptorFactory.HUE_RED)) + ", top=" + ((Object) Dp.b(BitmapDescriptorFactory.HUE_RED)) + ", right=" + ((Object) Dp.b(BitmapDescriptorFactory.HUE_RED)) + ", bottom=" + ((Object) Dp.b(BitmapDescriptorFactory.HUE_RED)) + ')';
        }
    }

    /* renamed from: a */
    float getD();

    float b(LayoutDirection layoutDirection);

    float c(LayoutDirection layoutDirection);

    /* renamed from: d */
    float getB();
}
