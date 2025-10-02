package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineProvider;", "", "Block", "Value", "Landroidx/compose/foundation/layout/AlignmentLineProvider$Block;", "Landroidx/compose/foundation/layout/AlignmentLineProvider$Value;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AlignmentLineProvider {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineProvider$Block;", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Block extends AlignmentLineProvider {
        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public final int a(Placeable placeable) {
            throw null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Block);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Block(lineProviderBlock=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineProvider$Value;", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Value extends AlignmentLineProvider {

        /* renamed from: a, reason: collision with root package name */
        public final AlignmentLine f931a;

        public Value(AlignmentLine alignmentLine) {
            this.f931a = alignmentLine;
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public final int a(Placeable placeable) {
            return placeable.d0(this.f931a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Value) && Intrinsics.c(this.f931a, ((Value) obj).f931a);
        }

        public final int hashCode() {
            return this.f931a.hashCode();
        }

        public final String toString() {
            return "Value(alignmentLine=" + this.f931a + ')';
        }
    }

    public abstract int a(Placeable placeable);
}
