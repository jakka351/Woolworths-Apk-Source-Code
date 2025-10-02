package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells;", "", "Adaptive", "Fixed", "FixedSize", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface GridCells {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells$Adaptive;", "Landroidx/compose/foundation/lazy/grid/GridCells;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Adaptive implements GridCells {

        /* renamed from: a, reason: collision with root package name */
        public final float f1005a;

        public Adaptive(float f) {
            this.f1005a = f;
            if (Float.compare(f, 0) > 0) {
                return;
            }
            InlineClassHelperKt.a("Provided min size should be larger than zero.");
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public final ArrayList a(Density density, int i, int i2) {
            return LazyGridDslKt.c(i, Math.max((i + i2) / (density.r1(this.f1005a) + i2), 1), i2);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Adaptive) {
                return Dp.a(this.f1005a, ((Adaptive) obj).f1005a);
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f1005a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;", "Landroidx/compose/foundation/lazy/grid/GridCells;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Fixed implements GridCells {

        /* renamed from: a, reason: collision with root package name */
        public final int f1006a;

        public Fixed(int i) {
            this.f1006a = i;
            if (i > 0) {
                return;
            }
            InlineClassHelperKt.a("Provided count should be larger than zero");
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public final ArrayList a(Density density, int i, int i2) {
            return LazyGridDslKt.c(i, this.f1006a, i2);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Fixed) {
                return this.f1006a == ((Fixed) obj).f1006a;
            }
            return false;
        }

        public final int hashCode() {
            return -this.f1006a;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells$FixedSize;", "Landroidx/compose/foundation/lazy/grid/GridCells;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class FixedSize implements GridCells {
        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public final ArrayList a(Density density, int i, int i2) {
            int iR1 = density.r1(BitmapDescriptorFactory.HUE_RED);
            int i3 = iR1 + i2;
            int i4 = i2 + i;
            if (i3 >= i4) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(i));
                return arrayList;
            }
            int i5 = i4 / i3;
            ArrayList arrayList2 = new ArrayList(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                arrayList2.add(Integer.valueOf(iR1));
            }
            return arrayList2;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof FixedSize) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }

        public final int hashCode() {
            return Float.hashCode(BitmapDescriptorFactory.HUE_RED);
        }
    }

    ArrayList a(Density density, int i, int i2);
}
