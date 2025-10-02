package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SlotReader {

    /* renamed from: a, reason: collision with root package name */
    public final SlotTable f1665a;
    public final int[] b;
    public final int c;
    public final Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public final IntStack j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public SlotReader(SlotTable slotTable) {
        this.f1665a = slotTable;
        this.b = slotTable.d;
        int i = slotTable.e;
        this.c = i;
        this.d = slotTable.f;
        this.e = slotTable.g;
        this.h = i;
        this.i = -1;
        this.j = new IntStack();
    }

    public final Anchor a(int i) {
        ArrayList arrayList = this.f1665a.l;
        int iF = SlotTableKt.f(i, this.c, arrayList);
        if (iF >= 0) {
            return (Anchor) arrayList.get(iF);
        }
        Anchor anchor = new Anchor(i);
        arrayList.add(-(iF + 1), anchor);
        return anchor;
    }

    public final Object b(int i, int[] iArr) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.d[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return Composer.Companion.f1624a;
    }

    public final void c() {
        this.f = true;
        SlotTable slotTable = this.f1665a;
        slotTable.getClass();
        if (this.f1665a != slotTable || slotTable.h <= 0) {
            ComposerKt.c("Unexpected reader close()");
        }
        slotTable.h--;
    }

    public final boolean d(int i) {
        return (this.b[(i * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.k == 0) {
            if (!(this.g == this.h)) {
                ComposerKt.c("endGroup() not called at the end of a group");
            }
            int i = (this.i * 5) + 2;
            int[] iArr = this.b;
            int i2 = iArr[i];
            this.i = i2;
            int i3 = this.c;
            this.h = i2 < 0 ? i3 : SlotTableKt.a(i2, iArr) + i2;
            int iB = this.j.b();
            if (iB < 0) {
                this.l = 0;
                this.m = 0;
            } else {
                this.l = iB;
                this.m = i2 >= i3 - 1 ? this.e : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i = this.g;
        if (i < this.h) {
            return b(i, this.b);
        }
        return 0;
    }

    public final int g() {
        int i = this.g;
        if (i >= this.h) {
            return 0;
        }
        return this.b[i * 5];
    }

    public final Object h(int i, int i2) {
        int[] iArr = this.b;
        int iD = SlotTableKt.d(i, iArr);
        int i3 = i + 1;
        int i4 = iD + i2;
        return i4 < (i3 < this.c ? iArr[(i3 * 5) + 4] : this.e) ? this.d[i4] : Composer.Companion.f1624a;
    }

    public final boolean i(int i) {
        return (this.b[(i * 5) + 1] & 536870912) != 0;
    }

    public final boolean j(int i) {
        return (this.b[(i * 5) + 1] & 1073741824) != 0;
    }

    public final Object k() {
        int i;
        if (this.k > 0 || (i = this.l) >= this.m) {
            this.n = false;
            return Composer.Companion.f1624a;
        }
        this.n = true;
        this.l = i + 1;
        return this.d[i];
    }

    public final Object l(int i) {
        int i2 = i * 5;
        int[] iArr = this.b;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 == 0) {
            return null;
        }
        if (i3 == 0) {
            return Composer.Companion.f1624a;
        }
        return this.d[iArr[i2 + 4]];
    }

    public final int m(int i) {
        return this.b[(i * 5) + 1] & 67108863;
    }

    public final Object n(int i, int[] iArr) {
        if ((iArr[(i * 5) + 1] & 536870912) != 0) {
            return this.d[SlotTableKt.c(i, iArr)];
        }
        return null;
    }

    public final int o(int i) {
        return this.b[(i * 5) + 2];
    }

    public final void p(int i) {
        if (!(this.k == 0)) {
            ComposerKt.c("Cannot reposition while in an empty region");
        }
        this.g = i;
        int[] iArr = this.b;
        int i2 = this.c;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        this.i = i3;
        if (i3 < 0) {
            this.h = i2;
        } else {
            this.h = SlotTableKt.a(i3, iArr) + i3;
        }
        this.l = 0;
        this.m = 0;
    }

    public final int q() {
        if (!(this.k == 0)) {
            ComposerKt.c("Cannot skip while in an empty region");
        }
        int i = this.g;
        int[] iArr = this.b;
        int i2 = (iArr[(i * 5) + 1] & 1073741824) == 0 ? iArr[(i * 5) + 1] & 67108863 : 1;
        this.g = SlotTableKt.a(i, iArr) + i;
        return i2;
    }

    public final void r() {
        if (!(this.k == 0)) {
            ComposerKt.c("Cannot skip the enclosing group while in an empty region");
        }
        this.g = this.h;
        this.l = 0;
        this.m = 0;
    }

    public final void s() {
        if (this.k <= 0) {
            int i = this.i;
            int i2 = this.g;
            int[] iArr = this.b;
            if (!(iArr[(i2 * 5) + 2] == i)) {
                PreconditionsKt.a("Invalid slot table detected");
            }
            int i3 = this.l;
            int i4 = this.m;
            IntStack intStack = this.j;
            if (i3 == 0 && i4 == 0) {
                intStack.c(-1);
            } else {
                intStack.c(i3);
            }
            this.i = i2;
            this.h = SlotTableKt.a(i2, iArr) + i2;
            int i5 = i2 + 1;
            this.g = i5;
            this.l = SlotTableKt.d(i2, iArr);
            this.m = i2 >= this.c - 1 ? this.e : iArr[(i5 * 5) + 4];
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.g);
        sb.append(", key=");
        sb.append(g());
        sb.append(", parent=");
        sb.append(this.i);
        sb.append(", end=");
        return YU.a.l(sb, this.h, ')');
    }
}
