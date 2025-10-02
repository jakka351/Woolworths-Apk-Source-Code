package androidx.compose.material3.internal;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/internal/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class DropdownMenuPositionProvider implements PopupPositionProvider {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/compose/ui/unit/IntRect;", "<anonymous parameter 1>", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.internal.DropdownMenuPositionProvider$2, reason: invalid class name */
    final class AnonymousClass2 extends Lambda implements Function2<IntRect, IntRect, Unit> {
        static {
            new AnonymousClass2(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Unit.f24250a;
        }
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    public final long a(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        intRect.a();
        int i = (int) (j >> 32);
        List listR = CollectionsKt.R(null, null, null);
        int size = listR.size();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = (int) (j2 >> 32);
            int iA = ((MenuPosition.Horizontal) listR.get(i2)).a(intRect, j, i3, layoutDirection);
            if (i2 == CollectionsKt.I(listR) || (iA >= 0 && iA + i3 <= i)) {
                break;
            }
        }
        intRect.a();
        int i4 = (int) (j & 4294967295L);
        List listR2 = CollectionsKt.R(null, null, null, null);
        int size2 = listR2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            int i6 = (int) (j2 & 4294967295L);
            int iA2 = ((MenuPosition.Vertical) listR2.get(i5)).a(intRect, j, i6);
            if (i5 == CollectionsKt.I(listR2) || (iA2 >= 0 && iA2 + i6 <= i4 + 0)) {
                break;
            }
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DropdownMenuPositionProvider) && 0 == 0 && Intrinsics.c(null, null) && Intrinsics.c(null, null);
    }

    public final int hashCode() {
        Long.hashCode(0L);
        throw null;
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.c(0L)) + ", density=" + ((Object) null) + ", verticalMargin=0, onPositionCalculated=" + ((Object) null) + ')';
    }
}
