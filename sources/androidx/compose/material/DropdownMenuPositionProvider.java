package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class DropdownMenuPositionProvider implements PopupPositionProvider {

    /* renamed from: a, reason: collision with root package name */
    public final long f1279a;
    public final Density b;
    public final Function2 c;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/compose/ui/unit/IntRect;", "<anonymous parameter 1>", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.DropdownMenuPositionProvider$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function2<IntRect, IntRect, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Unit.f24250a;
        }
    }

    public DropdownMenuPositionProvider(long j, Density density, Function2 function2) {
        this.f1279a = j;
        this.b = density;
        this.c = function2;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    public final long a(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        Sequence sequenceG;
        Object obj;
        Object next;
        float f = MenuKt.b;
        Density density = this.b;
        int iR1 = density.r1(f);
        long j3 = this.f1279a;
        int iR12 = density.r1(DpOffset.a(j3));
        LayoutDirection layoutDirection2 = LayoutDirection.d;
        int i = iR12 * (layoutDirection == layoutDirection2 ? 1 : -1);
        int iR13 = density.r1(DpOffset.b(j3));
        int i2 = intRect.f2201a;
        int i3 = intRect.c;
        int i4 = i2 + i;
        int i5 = (int) (j2 >> 32);
        int iIntValue = (i3 - i5) + i;
        int i6 = (int) (j >> 32);
        int i7 = i6 - i5;
        if (layoutDirection == layoutDirection2) {
            Integer numValueOf = Integer.valueOf(i4);
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            if (intRect.f2201a < 0) {
                i7 = 0;
            }
            sequenceG = ArraysKt.g(new Integer[]{numValueOf, numValueOf2, Integer.valueOf(i7)});
        } else {
            Integer numValueOf3 = Integer.valueOf(iIntValue);
            Integer numValueOf4 = Integer.valueOf(i4);
            if (i3 <= i6) {
                i7 = 0;
            }
            sequenceG = ArraysKt.g(new Integer[]{numValueOf3, numValueOf4, Integer.valueOf(i7)});
        }
        Iterator f24664a = sequenceG.getF24664a();
        while (true) {
            obj = null;
            if (!f24664a.hasNext()) {
                next = null;
                break;
            }
            next = f24664a.next();
            int iIntValue2 = ((Number) next).intValue();
            if (iIntValue2 >= 0 && iIntValue2 + i5 <= i6) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            iIntValue = num.intValue();
        }
        int iMax = Math.max(intRect.d + iR13, iR1);
        int i8 = intRect.b;
        int i9 = (int) (j2 & 4294967295L);
        int iIntValue3 = (i8 - i9) + iR13;
        int i10 = (i8 - (i9 / 2)) + iR13;
        int i11 = (int) (4294967295L & j);
        Iterator f24664a2 = ArraysKt.g(new Integer[]{Integer.valueOf(iMax), Integer.valueOf(iIntValue3), Integer.valueOf(i10), Integer.valueOf((i11 - i9) - iR1)}).getF24664a();
        while (true) {
            if (!f24664a2.hasNext()) {
                break;
            }
            Object next2 = f24664a2.next();
            int iIntValue4 = ((Number) next2).intValue();
            if (iIntValue4 >= iR1 && iIntValue4 + i9 <= i11 - iR1) {
                obj = next2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            iIntValue3 = num2.intValue();
        }
        this.c.invoke(intRect, new IntRect(iIntValue, iIntValue3, i5 + iIntValue, i9 + iIntValue3));
        return IntOffsetKt.a(iIntValue, iIntValue3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropdownMenuPositionProvider) {
            DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
            if (this.f1279a == dropdownMenuPositionProvider.f1279a && Intrinsics.c(this.b, dropdownMenuPositionProvider.b) && Intrinsics.c(this.c, dropdownMenuPositionProvider.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f1279a) * 31)) * 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.c(this.f1279a)) + ", density=" + this.b + ", onPositionCalculated=" + this.c + ')';
    }
}
