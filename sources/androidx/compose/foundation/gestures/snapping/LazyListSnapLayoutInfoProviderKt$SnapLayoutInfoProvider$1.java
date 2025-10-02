package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 implements SnapLayoutInfoProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyListState f912a;
    public final /* synthetic */ SnapPosition b;

    public LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(LazyListState lazyListState, SnapPosition snapPosition) {
        this.f912a = lazyListState;
        this.b = snapPosition;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r21) {
        /*
            r20 = this;
            r0 = r20
            androidx.compose.foundation.lazy.LazyListState r1 = r0.f912a
            androidx.compose.foundation.lazy.LazyListLayoutInfo r2 = r1.j()
            java.util.List r2 = r2.f()
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = -8388608(0xffffffffff800000, float:-Infinity)
            r5 = 2139095040(0x7f800000, float:Infinity)
            r6 = 0
            r8 = r4
            r9 = r5
            r7 = r6
        L1b:
            r10 = 0
            r11 = 1
            if (r7 >= r3) goto L81
            java.lang.Object r12 = r2.get(r7)
            androidx.compose.foundation.lazy.LazyListItemInfo r12 = (androidx.compose.foundation.lazy.LazyListItemInfo) r12
            boolean r13 = r12 instanceof androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
            if (r13 == 0) goto L2d
            r13 = r12
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem r13 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) r13
            goto L2e
        L2d:
            r13 = 0
        L2e:
            if (r13 == 0) goto L37
            boolean r13 = r13.getT()
            if (r13 != r11) goto L37
            goto L7e
        L37:
            androidx.compose.foundation.lazy.LazyListLayoutInfo r11 = r1.j()
            int r14 = androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.a(r11)
            androidx.compose.foundation.lazy.LazyListLayoutInfo r11 = r1.j()
            int r16 = r11.c()
            androidx.compose.foundation.lazy.LazyListLayoutInfo r11 = r1.j()
            int r17 = r11.getQ()
            int r15 = r12.getQ()
            int r11 = r12.getP()
            int r18 = r12.getF996a()
            androidx.compose.foundation.lazy.LazyListLayoutInfo r12 = r1.j()
            int r19 = r12.getN()
            androidx.compose.foundation.gestures.snapping.SnapPosition r13 = r0.b
            int r12 = r13.a(r14, r15, r16, r17, r18, r19)
            float r12 = (float) r12
            float r11 = (float) r11
            float r11 = r11 - r12
            int r12 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r12 > 0) goto L75
            int r12 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r12 <= 0) goto L75
            r8 = r11
        L75:
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 < 0) goto L7e
            int r10 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r10 >= 0) goto L7e
            r9 = r11
        L7e:
            int r7 = r7 + 1
            goto L1b
        L81:
            androidx.compose.runtime.MutableState r1 = r1.e
            androidx.compose.runtime.SnapshotMutableStateImpl r1 = (androidx.compose.runtime.SnapshotMutableStateImpl) r1
            java.lang.Object r1 = r1.getD()
            androidx.compose.foundation.lazy.LazyListMeasureResult r1 = (androidx.compose.foundation.lazy.LazyListMeasureResult) r1
            androidx.compose.ui.unit.Density r1 = r1.i
            float r2 = java.lang.Math.abs(r21)
            float r3 = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.f915a
            float r1 = r1.T1(r3)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r2 = 2
            if (r1 >= 0) goto L9d
            goto La4
        L9d:
            int r1 = (r21 > r10 ? 1 : (r21 == r10 ? 0 : -1))
            if (r1 <= 0) goto La3
            r6 = r11
            goto La4
        La3:
            r6 = r2
        La4:
            if (r6 != 0) goto Lb3
            float r1 = java.lang.Math.abs(r9)
            float r2 = java.lang.Math.abs(r8)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto Lbb
            goto Lb5
        Lb3:
            if (r6 != r11) goto Lb7
        Lb5:
            r8 = r9
            goto Lbb
        Lb7:
            if (r6 != r2) goto Lba
            goto Lbb
        Lba:
            r8 = r10
        Lbb:
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 != 0) goto Lc0
            goto Lc4
        Lc0:
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 != 0) goto Lc5
        Lc4:
            return r10
        Lc5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1.a(float):float");
    }

    @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
    public final float b(float f, float f2) {
        float fAbs = Math.abs(f2);
        LazyListLayoutInfo lazyListLayoutInfoJ = this.f912a.j();
        int q = 0;
        if (!lazyListLayoutInfoJ.f().isEmpty()) {
            int size = lazyListLayoutInfoJ.f().size();
            Iterator it = lazyListLayoutInfoJ.f().iterator();
            while (it.hasNext()) {
                q += ((LazyListItemInfo) it.next()).getQ();
            }
            q /= size;
        }
        float f3 = fAbs - q;
        if (f3 < BitmapDescriptorFactory.HUE_RED) {
            f3 = 0.0f;
        }
        return Math.signum(f2) * f3;
    }
}
