package androidx.compose.foundation.layout;

import androidx.camera.core.impl.b;
import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class FlowLayoutOverflowState {

    /* renamed from: a, reason: collision with root package name */
    public int f960a;
    public int b;
    public Measurable c;
    public Measurable d;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FlowLayoutOverflow.OverflowType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FlowLayoutOverflow.OverflowType overflowType = FlowLayoutOverflow.OverflowType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FlowLayoutOverflow.OverflowType overflowType2 = FlowLayoutOverflow.OverflowType.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FlowLayoutOverflow.OverflowType overflowType3 = FlowLayoutOverflow.OverflowType.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final void a(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMeasurable intrinsicMeasurable2, boolean z, long j) {
        long jA = OrientationIndependentConstraints.a(j, z ? LayoutOrientation.d : LayoutOrientation.e);
        if (intrinsicMeasurable != null) {
            int iG = Constraints.g(jA);
            int iA0 = z ? intrinsicMeasurable.a0(iG) : intrinsicMeasurable.T(iG);
            new IntIntPair(IntIntPair.a(iA0, z ? intrinsicMeasurable.T(iA0) : intrinsicMeasurable.a0(iA0)));
            this.c = intrinsicMeasurable instanceof Measurable ? (Measurable) intrinsicMeasurable : null;
        }
        if (intrinsicMeasurable2 != null) {
            int iG2 = Constraints.g(jA);
            int iA02 = z ? intrinsicMeasurable2.a0(iG2) : intrinsicMeasurable2.T(iG2);
            new IntIntPair(IntIntPair.a(iA02, z ? intrinsicMeasurable2.T(iA02) : intrinsicMeasurable2.a0(iA02)));
            this.d = intrinsicMeasurable2 instanceof Measurable ? (Measurable) intrinsicMeasurable2 : null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowLayoutOverflowState)) {
            return false;
        }
        FlowLayoutOverflow.OverflowType overflowType = FlowLayoutOverflow.OverflowType.d;
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + b.a(0, FlowLayoutOverflow.OverflowType.d.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + FlowLayoutOverflow.OverflowType.d + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
