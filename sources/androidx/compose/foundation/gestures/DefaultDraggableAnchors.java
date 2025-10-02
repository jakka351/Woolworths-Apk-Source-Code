package androidx.compose.foundation.gestures;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultDraggableAnchors;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/gestures/DraggableAnchors;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DefaultDraggableAnchors<T> implements DraggableAnchors<T> {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f877a;
    public final int b;

    public DefaultDraggableAnchors(float[] fArr) {
        this.f877a = fArr;
        this.b = fArr.length;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final Object a(float f, boolean z) {
        float[] fArr = this.f877a;
        int length = fArr.length;
        int i = -1;
        int i2 = 0;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i2 < length) {
            float f3 = fArr[i2];
            int i4 = i3 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < BitmapDescriptorFactory.HUE_RED) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                i = i3;
                f2 = f4;
            }
            i2++;
            i3 = i4;
        }
        EmptyList.d.get(i);
        throw null;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final Object b(float f) {
        float[] fArr = this.f877a;
        int length = fArr.length;
        int i = -1;
        float f2 = Float.POSITIVE_INFINITY;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            float fAbs = Math.abs(f - fArr[i2]);
            if (fAbs <= f2) {
                i = i3;
                f2 = fAbs;
            }
            i2++;
            i3 = i4;
        }
        EmptyList.d.get(i);
        throw null;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final float c(Object obj) {
        Function1 function1 = AnchoredDraggableKt.f865a;
        AnchoredDraggableKt$GetOrNan$1.h.invoke(-1);
        return Float.NaN;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final boolean d(Object obj) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultDraggableAnchors)) {
            return false;
        }
        DefaultDraggableAnchors defaultDraggableAnchors = (DefaultDraggableAnchors) obj;
        EmptyList emptyList = EmptyList.d;
        return emptyList.equals(emptyList) && Arrays.equals(this.f877a, defaultDraggableAnchors.f877a) && this.b == defaultDraggableAnchors.b;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f877a) + 31) * 31) + this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DraggableAnchors(anchors={"
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r6.b
            if (r1 >= r2) goto L4e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.d
            java.lang.Object r4 = kotlin.collections.CollectionsKt.J(r1, r4)
            r3.append(r4)
            r4 = 61
            r3.append(r4)
            kotlin.jvm.functions.Function1 r4 = androidx.compose.foundation.gestures.AnchoredDraggableKt.f865a
            if (r1 < 0) goto L2d
            float[] r4 = r6.f877a
            int r5 = r4.length
            int r5 = r5 + (-1)
            if (r1 > r5) goto L2d
            r4 = r4[r1]
            goto L38
        L2d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            androidx.compose.foundation.gestures.AnchoredDraggableKt$GetOrNan$1 r5 = androidx.compose.foundation.gestures.AnchoredDraggableKt$GetOrNan$1.h
            r5.invoke(r4)
            r4 = 2143289344(0x7fc00000, float:NaN)
        L38:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L4b
            java.lang.String r2 = ", "
            r0.append(r2)
        L4b:
            int r1 = r1 + 1
            goto L8
        L4e:
            java.lang.String r1 = "})"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DefaultDraggableAnchors.toString():java.lang.String");
    }
}
