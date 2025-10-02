package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment;", "", "AlignmentLineCrossAxisAlignment", "CenterCrossAxisAlignment", "Companion", "EndCrossAxisAlignment", "HorizontalCrossAxisAlignment", "StartCrossAxisAlignment", "VerticalCrossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment$AlignmentLineCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$CenterCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$EndCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$HorizontalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$StartCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$VerticalCrossAxisAlignment;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CrossAxisAlignment {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$AlignmentLineCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class AlignmentLineCrossAxisAlignment extends CrossAxisAlignment {

        /* renamed from: a, reason: collision with root package name */
        public final AlignmentLineProvider f951a;

        public AlignmentLineCrossAxisAlignment(AlignmentLineProvider alignmentLineProvider) {
            this.f951a = alignmentLineProvider;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i, int i2, Placeable placeable, LayoutDirection layoutDirection) {
            int iA = this.f951a.a(placeable);
            if (iA == Integer.MIN_VALUE) {
                return 0;
            }
            int i3 = i2 - iA;
            return layoutDirection == LayoutDirection.e ? i - i3 : i3;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final Integer b(Placeable placeable) {
            return Integer.valueOf(this.f951a.a(placeable));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$CenterCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CenterCrossAxisAlignment extends CrossAxisAlignment {
        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i, int i2, Placeable placeable, LayoutDirection layoutDirection) {
            return i / 2;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$EndCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EndCrossAxisAlignment extends CrossAxisAlignment {
        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i, int i2, Placeable placeable, LayoutDirection layoutDirection) {
            if (layoutDirection == LayoutDirection.d) {
                return i;
            }
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$HorizontalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class HorizontalCrossAxisAlignment extends CrossAxisAlignment {

        /* renamed from: a, reason: collision with root package name */
        public final Alignment.Horizontal f952a;

        public HorizontalCrossAxisAlignment(Alignment.Horizontal horizontal) {
            this.f952a = horizontal;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i, int i2, Placeable placeable, LayoutDirection layoutDirection) {
            return this.f952a.a(0, i, layoutDirection);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalCrossAxisAlignment) && Intrinsics.c(this.f952a, ((HorizontalCrossAxisAlignment) obj).f952a);
        }

        public final int hashCode() {
            return this.f952a.hashCode();
        }

        public final String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f952a + ')';
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$StartCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartCrossAxisAlignment extends CrossAxisAlignment {
        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i, int i2, Placeable placeable, LayoutDirection layoutDirection) {
            if (layoutDirection == LayoutDirection.d) {
                return 0;
            }
            return i;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$VerticalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VerticalCrossAxisAlignment extends CrossAxisAlignment {

        /* renamed from: a, reason: collision with root package name */
        public final Alignment.Vertical f953a;

        public VerticalCrossAxisAlignment(Alignment.Vertical vertical) {
            this.f953a = vertical;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i, int i2, Placeable placeable, LayoutDirection layoutDirection) {
            return this.f953a.a(0, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalCrossAxisAlignment) && Intrinsics.c(this.f953a, ((VerticalCrossAxisAlignment) obj).f953a);
        }

        public final int hashCode() {
            return this.f953a.hashCode();
        }

        public final String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f953a + ')';
        }
    }

    public abstract int a(int i, int i2, Placeable placeable, LayoutDirection layoutDirection);

    public Integer b(Placeable placeable) {
        return null;
    }
}
