package androidx.compose.ui.layout;

import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics;", "", "DefaultIntrinsicMeasurable", "EmptyPlaceable", "IntrinsicMinMax", "IntrinsicWidthHeight", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MeasuringIntrinsics {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$DefaultIntrinsicMeasurable;", "Landroidx/compose/ui/layout/Measurable;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultIntrinsicMeasurable implements Measurable {
        public final IntrinsicMeasurable d;
        public final IntrinsicMinMax e;
        public final IntrinsicWidthHeight f;

        public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
            this.d = intrinsicMeasurable;
            this.e = intrinsicMinMax;
            this.f = intrinsicWidthHeight;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int J(int i) {
            return this.d.J(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int T(int i) {
            return this.d.T(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int a0(int i) {
            return this.d.a0(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int b0(int i) {
            return this.d.b0(i);
        }

        @Override // androidx.compose.ui.layout.Measurable
        public final Placeable c0(long j) {
            IntrinsicWidthHeight intrinsicWidthHeight = this.f;
            IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.d;
            IntrinsicMinMax intrinsicMinMax = this.e;
            IntrinsicMeasurable intrinsicMeasurable = this.d;
            if (intrinsicWidthHeight == intrinsicWidthHeight2) {
                return new EmptyPlaceable(intrinsicMinMax == IntrinsicMinMax.e ? intrinsicMeasurable.b0(Constraints.g(j)) : intrinsicMeasurable.a0(Constraints.g(j)), Constraints.c(j) ? Constraints.g(j) : 32767);
            }
            return new EmptyPlaceable(Constraints.d(j) ? Constraints.h(j) : 32767, intrinsicMinMax == IntrinsicMinMax.e ? intrinsicMeasurable.J(Constraints.h(j)) : intrinsicMeasurable.T(Constraints.h(j)));
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        /* renamed from: i */
        public final Object getA() {
            return this.d.getA();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$EmptyPlaceable;", "Landroidx/compose/ui/layout/Placeable;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class EmptyPlaceable extends Placeable {
        public EmptyPlaceable(int i, int i2) {
            u0((i2 & 4294967295L) | (i << 32));
        }

        @Override // androidx.compose.ui.layout.Measured
        public final int d0(AlignmentLine alignmentLine) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.compose.ui.layout.Placeable
        public final void s0(long j, float f, Function1 function1) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IntrinsicMinMax {
        public static final IntrinsicMinMax d;
        public static final IntrinsicMinMax e;
        public static final /* synthetic */ IntrinsicMinMax[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            IntrinsicMinMax intrinsicMinMax = new IntrinsicMinMax("Min", 0);
            d = intrinsicMinMax;
            IntrinsicMinMax intrinsicMinMax2 = new IntrinsicMinMax("Max", 1);
            e = intrinsicMinMax2;
            IntrinsicMinMax[] intrinsicMinMaxArr = {intrinsicMinMax, intrinsicMinMax2};
            f = intrinsicMinMaxArr;
            g = EnumEntriesKt.a(intrinsicMinMaxArr);
        }

        public static IntrinsicMinMax valueOf(String str) {
            return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
        }

        public static IntrinsicMinMax[] values() {
            return (IntrinsicMinMax[]) f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IntrinsicWidthHeight {
        public static final IntrinsicWidthHeight d;
        public static final IntrinsicWidthHeight e;
        public static final /* synthetic */ IntrinsicWidthHeight[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            IntrinsicWidthHeight intrinsicWidthHeight = new IntrinsicWidthHeight("Width", 0);
            d = intrinsicWidthHeight;
            IntrinsicWidthHeight intrinsicWidthHeight2 = new IntrinsicWidthHeight("Height", 1);
            e = intrinsicWidthHeight2;
            IntrinsicWidthHeight[] intrinsicWidthHeightArr = {intrinsicWidthHeight, intrinsicWidthHeight2};
            f = intrinsicWidthHeightArr;
            g = EnumEntriesKt.a(intrinsicWidthHeightArr);
        }

        public static IntrinsicWidthHeight valueOf(String str) {
            return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, str);
        }

        public static IntrinsicWidthHeight[] values() {
            return (IntrinsicWidthHeight[]) f.clone();
        }
    }

    public static int a(LayoutModifier layoutModifier, LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return layoutModifier.n(new IntrinsicsMeasureScope(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getD()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.e, IntrinsicWidthHeight.e), ConstraintsKt.b(i, 0, 13)).getB();
    }

    public static int b(LayoutModifier layoutModifier, LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return layoutModifier.n(new IntrinsicsMeasureScope(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getD()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.e, IntrinsicWidthHeight.d), ConstraintsKt.b(0, i, 7)).getF1885a();
    }

    public static int c(LayoutModifier layoutModifier, LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return layoutModifier.n(new IntrinsicsMeasureScope(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getD()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.d, IntrinsicWidthHeight.e), ConstraintsKt.b(i, 0, 13)).getB();
    }

    public static int d(LayoutModifier layoutModifier, LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return layoutModifier.n(new IntrinsicsMeasureScope(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getD()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.d, IntrinsicWidthHeight.d), ConstraintsKt.b(0, i, 7)).getF1885a();
    }
}
