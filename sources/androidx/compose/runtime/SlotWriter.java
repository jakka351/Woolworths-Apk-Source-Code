package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SlotWriter {

    /* renamed from: a, reason: collision with root package name */
    public final SlotTable f1667a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public MutableIntObjectMap f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final IntStack p;
    public final IntStack q;
    public final IntStack r;
    public MutableIntObjectMap s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public MutableIntList x;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        public static List a(SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2, boolean z3) {
            EmptyList emptyList;
            EmptyList emptyList2;
            boolean z4;
            int i2;
            Anchor anchorR;
            Anchor anchorR2;
            int i3;
            int i4;
            int iS = slotWriter.s(i);
            int i5 = i + iS;
            int iF = slotWriter.f(slotWriter.q(i), slotWriter.b);
            int iF2 = slotWriter.f(slotWriter.q(i5), slotWriter.b);
            int i6 = iF2 - iF;
            boolean z5 = i >= 0 && (slotWriter.b[(slotWriter.q(i) * 5) + 1] & 201326592) != 0;
            slotWriter2.u(iS);
            slotWriter2.v(i6, slotWriter2.t);
            if (slotWriter.g < i5) {
                slotWriter.z(i5);
            }
            if (slotWriter.k < iF2) {
                slotWriter.A(iF2, i5);
            }
            int[] iArr = slotWriter2.b;
            int i7 = slotWriter2.t;
            int i8 = i7 * 5;
            ArraysKt.q(i8, i * 5, i5 * 5, slotWriter.b, iArr);
            Object[] objArr = slotWriter2.c;
            int i9 = slotWriter2.i;
            System.arraycopy(slotWriter.c, iF, objArr, i9, i6);
            int i10 = slotWriter2.v;
            iArr[i8 + 2] = i10;
            int i11 = i7 - i;
            int i12 = i7 + iS;
            int iF3 = i9 - slotWriter2.f(i7, iArr);
            int i13 = slotWriter2.m;
            int i14 = slotWriter2.l;
            int length = objArr.length;
            boolean z6 = z5;
            int i15 = i13;
            int i16 = i7;
            while (i16 < i12) {
                if (i16 != i7) {
                    int i17 = (i16 * 5) + 2;
                    iArr[i17] = iArr[i17] + i11;
                }
                int[] iArr2 = iArr;
                int iF4 = slotWriter2.f(i16, iArr) + iF3;
                if (i15 < i16) {
                    i3 = i7;
                    i4 = 0;
                } else {
                    i3 = i7;
                    i4 = slotWriter2.k;
                }
                iArr2[(i16 * 5) + 4] = SlotWriter.h(iF4, i4, i14, length);
                if (i16 == i15) {
                    i15++;
                }
                i16++;
                i7 = i3;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            slotWriter2.m = i15;
            int iB = SlotTableKt.b(i, slotWriter.n(), slotWriter.d);
            int iB2 = SlotTableKt.b(i5, slotWriter.n(), slotWriter.d);
            if (iB < iB2) {
                ArrayList arrayList = slotWriter.d;
                ArrayList arrayList2 = new ArrayList(iB2 - iB);
                for (int i18 = iB; i18 < iB2; i18++) {
                    Anchor anchor = (Anchor) arrayList.get(i18);
                    anchor.f1619a += i11;
                    arrayList2.add(anchor);
                }
                slotWriter2.d.addAll(SlotTableKt.b(slotWriter2.t, slotWriter2.n(), slotWriter2.d), arrayList2);
                arrayList.subList(iB, iB2).clear();
                emptyList = arrayList2;
            } else {
                emptyList = EmptyList.d;
            }
            EmptyList emptyList3 = emptyList;
            if (!emptyList3.isEmpty()) {
                HashMap map = slotWriter.e;
                HashMap map2 = slotWriter2.e;
                if (map != null && map2 != null) {
                    int size = emptyList3.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        Anchor anchor2 = (Anchor) emptyList.get(i19);
                        GroupSourceInformation groupSourceInformation = (GroupSourceInformation) map.get(anchor2);
                        if (groupSourceInformation != null) {
                            map.remove(anchor2);
                            map2.put(anchor2, groupSourceInformation);
                        }
                    }
                }
            }
            int i20 = slotWriter2.v;
            HashMap map3 = slotWriter2.e;
            GroupSourceInformation groupSourceInformation2 = null;
            if (map3 != null && (anchorR2 = slotWriter2.R(i10)) != null) {
                groupSourceInformation2 = (GroupSourceInformation) map3.get(anchorR2);
            }
            if (groupSourceInformation2 != null) {
                int i21 = i20 + 1;
                int i22 = slotWriter2.t;
                int i23 = -1;
                while (i21 < i22) {
                    i23 = i21;
                    i21 = slotWriter2.b[(i21 * 5) + 3] + i21;
                }
                ArrayList arrayList3 = groupSourceInformation2.f1638a;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    groupSourceInformation2.f1638a = arrayList3;
                }
                if (i23 < 0 || (anchorR = slotWriter2.R(i23)) == null) {
                    emptyList2 = emptyList;
                    i2 = 0;
                } else {
                    int size2 = arrayList3.size();
                    int i24 = 0;
                    EmptyList emptyList4 = emptyList;
                    while (i24 < size2) {
                        Object obj = arrayList3.get(i24);
                        if (Intrinsics.c(obj, anchorR)) {
                            emptyList2 = emptyList4;
                        } else {
                            emptyList2 = emptyList4;
                            if (!(obj instanceof GroupSourceInformation) || !((GroupSourceInformation) obj).a(anchorR)) {
                                i24++;
                                emptyList4 = emptyList2;
                            }
                        }
                        i2 = i24;
                        break;
                    }
                    emptyList2 = emptyList4;
                    i2 = -1;
                }
                arrayList3.add(i2, slotWriter2.b(i22));
            } else {
                emptyList2 = emptyList;
            }
            int iE = slotWriter.E(i, slotWriter.b);
            if (!z3) {
                z4 = false;
            } else if (z) {
                boolean z7 = iE >= 0;
                if (z7) {
                    slotWriter.P();
                    slotWriter.a(iE - slotWriter.t);
                    slotWriter.P();
                }
                slotWriter.a(i - slotWriter.t);
                boolean zH = slotWriter.H();
                if (z7) {
                    slotWriter.L();
                    slotWriter.i();
                    slotWriter.L();
                    slotWriter.i();
                }
                z4 = zH;
            } else {
                boolean zI = slotWriter.I(i, iS);
                slotWriter.J(iF, i6, i - 1);
                z4 = zI;
            }
            if (z4) {
                ComposerKt.c("Unexpectedly removed anchors");
            }
            int i25 = slotWriter2.o;
            int i26 = iArr3[i8 + 1];
            slotWriter2.o = i25 + ((1073741824 & i26) != 0 ? 1 : i26 & 67108863);
            if (z2) {
                slotWriter2.t = i12;
                slotWriter2.i = i9 + i6;
            }
            if (z6) {
                slotWriter2.U(i10);
            }
            return emptyList2;
        }
    }

    public SlotWriter(SlotTable slotTable) {
        this.f1667a = slotTable;
        int[] iArr = slotTable.d;
        this.b = iArr;
        Object[] objArr = slotTable.f;
        this.c = objArr;
        this.d = slotTable.l;
        this.e = slotTable.m;
        this.f = slotTable.n;
        int i = slotTable.e;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = slotTable.g;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new IntStack();
        this.q = new IntStack();
        this.r = new IntStack();
        this.u = i;
        this.v = -1;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void x(SlotWriter slotWriter) {
        int i = slotWriter.v;
        int iQ = slotWriter.q(i);
        int[] iArr = slotWriter.b;
        int i2 = (iQ * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        slotWriter.U(slotWriter.E(i, iArr));
    }

    public final void A(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, n());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iQ = q(iMin);
                int iQ2 = q(i5);
                int i7 = this.g;
                while (iQ < iQ2) {
                    int i8 = (iQ * 5) + 4;
                    int i9 = this.b[i8];
                    if (!(i9 >= 0)) {
                        ComposerKt.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iQ++;
                    if (iQ == i7) {
                        iQ += this.h;
                    }
                }
            } else {
                int iQ3 = q(i5);
                int iQ4 = q(iMin);
                while (iQ3 < iQ4) {
                    int i10 = (iQ3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (!(i11 < 0)) {
                        ComposerKt.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iQ3++;
                    if (iQ3 == this.g) {
                        iQ3 += this.h;
                    }
                }
            }
            this.m = iMin;
        }
        this.k = i;
    }

    public final List B(Anchor anchor, SlotWriter slotWriter) {
        if (slotWriter.n <= 0) {
            ComposerKt.c("Check failed");
        }
        if (this.n != 0) {
            ComposerKt.c("Check failed");
        }
        if (!anchor.a()) {
            ComposerKt.c("Check failed");
        }
        int iC = c(anchor) + 1;
        int i = this.t;
        if (i > iC || iC >= this.u) {
            ComposerKt.c("Check failed");
        }
        int iE = E(iC, this.b);
        int iS = s(iC);
        int iD = w(iC) ? 1 : D(iC);
        List listA = Companion.a(this, iC, slotWriter, false, false, true);
        U(iE);
        boolean z = iD > 0;
        while (iE >= i) {
            int iQ = q(iE);
            int[] iArr = this.b;
            int i2 = iQ * 5;
            int i3 = i2 + 3;
            iArr[i3] = iArr[i3] - iS;
            if (z) {
                int i4 = iArr[i2 + 1];
                if ((1073741824 & i4) != 0) {
                    z = false;
                } else {
                    SlotTableKt.e(iQ, (i4 & 67108863) - iD, iArr);
                }
            }
            iE = E(iE, this.b);
        }
        if (z) {
            if (this.o < iD) {
                ComposerKt.c("Check failed");
            }
            this.o -= iD;
        }
        return listA;
    }

    public final Object C(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        if ((iArr[(iQ * 5) + 1] & 1073741824) != 0) {
            return this.c[g(f(iQ, iArr))];
        }
        return null;
    }

    public final int D(int i) {
        return this.b[(q(i) * 5) + 1] & 67108863;
    }

    public final int E(int i, int[] iArr) {
        int i2 = iArr[(q(i) * 5) + 2];
        return i2 > -2 ? i2 : (n() + i2) - (-2);
    }

    public final Object F(Object obj) {
        if (this.n > 0) {
            v(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[g(i)];
        if (this.i > this.j) {
            ComposerKt.c("Writing to an invalid slot");
        }
        this.c[g(this.i - 1)] = obj;
        return obj2;
    }

    public final void G() {
        int i;
        MutableIntList mutableIntList = this.x;
        if (mutableIntList != null) {
            while (mutableIntList.b != 0) {
                int iB = PrioritySet.b(mutableIntList);
                int iQ = q(iB);
                int iS = iB + 1;
                int iS2 = s(iB) + iB;
                while (true) {
                    if (iS >= iS2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(q(iS) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iS += s(iS);
                    }
                }
                int[] iArr = this.b;
                int i2 = (iQ * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iE = E(iB, iArr);
                    if (iE >= 0) {
                        PrioritySet.a(mutableIntList, iE);
                    }
                }
            }
        }
    }

    public final boolean H() {
        Anchor anchorR;
        Anchor anchorR2;
        if (this.n != 0) {
            ComposerKt.c("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int iF = f(q(i), this.b);
        int iK = K();
        int i3 = this.v;
        HashMap map = this.e;
        GroupSourceInformation groupSourceInformation = (map == null || (anchorR2 = R(i3)) == null) ? null : (GroupSourceInformation) map.get(anchorR2);
        if (groupSourceInformation != null && (anchorR = R(i)) != null) {
            groupSourceInformation.c(anchorR);
        }
        MutableIntList mutableIntList = this.x;
        if (mutableIntList != null) {
            while (true) {
                int i4 = mutableIntList.b;
                if (i4 == 0) {
                    break;
                }
                if (i4 == 0) {
                    RuntimeHelpersKt.d("IntList is empty.");
                    throw null;
                }
                if (mutableIntList.f676a[0] < i) {
                    break;
                }
                PrioritySet.b(mutableIntList);
            }
        }
        boolean zI = I(i, this.t - i);
        J(iF, this.i - iF, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= iK;
        return zI;
    }

    public final boolean I(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            z(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.e;
                int i3 = i + i2;
                int iB = SlotTableKt.b(i3, m() - this.h, this.d);
                if (iB >= this.d.size()) {
                    iB--;
                }
                int i4 = iB + 1;
                int i5 = 0;
                while (iB >= 0) {
                    Anchor anchor = (Anchor) this.d.get(iB);
                    int iC = c(anchor);
                    if (iC < i) {
                        break;
                    }
                    if (iC < i3) {
                        anchor.f1619a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iB + 1;
                        }
                        i4 = iB;
                    }
                    iB--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(q(i8) * 5) + 1] & 67108864) != 0) {
                U(i8);
            }
        }
        return z;
    }

    public final void J(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            A(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            ArraysKt.B(this.c, i, i5, null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final int K() {
        int iQ = q(this.t);
        int iA = SlotTableKt.a(iQ, this.b) + this.t;
        this.t = iA;
        this.i = f(q(iA), this.b);
        int i = this.b[(iQ * 5) + 1];
        if ((1073741824 & i) != 0) {
            return 1;
        }
        return i & 67108863;
    }

    public final void L() {
        int i = this.u;
        this.t = i;
        this.i = f(q(i), this.b);
    }

    public final int M(int i, int[] iArr) {
        if (i >= m()) {
            return this.c.length - this.l;
        }
        int iD = SlotTableKt.d(i, iArr);
        return iD < 0 ? (this.c.length - this.l) + iD + 1 : iD;
    }

    public final int N(int i, int i2) {
        int iM = M(q(i), this.b);
        int i3 = iM + i2;
        if (!(i3 >= iM && i3 < f(q(i + 1), this.b))) {
            ComposerKt.c("Write to an invalid slot index " + i2 + " for group " + i);
        }
        return i3;
    }

    public final int O(int i) {
        return f(q(s(i) + i), this.b);
    }

    public final void P() {
        if (this.n != 0) {
            ComposerKt.c("Key must be supplied when inserting");
        }
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        Q(composer$Companion$Empty$1, 0, composer$Companion$Empty$1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Object obj, int i, Object obj2, boolean z) {
        int i2;
        Anchor anchorR;
        int i3 = this.v;
        byte b = this.n > 0;
        this.r.c(this.o);
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (b == true) {
            int i4 = this.t;
            int iF = f(q(i4), this.b);
            u(1);
            this.i = iF;
            this.j = iF;
            int iQ = q(i4);
            int i5 = obj != composer$Companion$Empty$1 ? 1 : 0;
            int i6 = (z || obj2 == composer$Companion$Empty$1) ? 0 : 1;
            int iH = h(iF, this.k, this.l, this.c.length);
            if (iH >= 0 && this.m < i4) {
                iH = -(((this.c.length - this.l) - iH) + 1);
            }
            int[] iArr = this.b;
            int i7 = this.v;
            int i8 = iQ * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iH;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                v(i9, i4);
                Object[] objArr = this.c;
                int i10 = this.i;
                if (z) {
                    objArr[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr[i10] = obj2;
                    i10++;
                }
                this.i = i10;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0) {
                HashMap map = this.e;
                GroupSourceInformation groupSourceInformation = null;
                if (map != null && (anchorR = R(i3)) != null) {
                    groupSourceInformation = (GroupSourceInformation) map.get(anchorR);
                }
                if (groupSourceInformation != null) {
                    GroupSourceInformation groupSourceInformationB = groupSourceInformation.b();
                    Anchor anchorB = b(i4);
                    ArrayList arrayList = groupSourceInformationB.f1638a;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    groupSourceInformationB.f1638a = arrayList;
                    arrayList.add(anchorB);
                }
            }
        } else {
            this.p.c(i3);
            this.q.c((m() - this.h) - this.u);
            int i11 = this.t;
            int iQ2 = q(i11);
            if (!Intrinsics.c(obj2, composer$Companion$Empty$1)) {
                if (z) {
                    V(this.t, obj2);
                } else {
                    T(obj2);
                }
            }
            this.i = M(iQ2, this.b);
            this.j = f(q(this.t + 1), this.b);
            int[] iArr2 = this.b;
            int i12 = iQ2 * 5;
            this.o = iArr2[i12 + 1] & 67108863;
            this.v = i11;
            this.t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.u = i2;
    }

    public final Anchor R(int i) {
        ArrayList arrayList;
        int iF;
        if (i < 0 || i >= n() || (iF = SlotTableKt.f(i, n(), (arrayList = this.d))) < 0) {
            return null;
        }
        return (Anchor) arrayList.get(iF);
    }

    public final void S(Object obj) {
        if (this.n <= 0 || this.i == this.k) {
            F(obj);
            return;
        }
        MutableIntObjectMap mutableIntObjectMap = this.s;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap();
        }
        this.s = mutableIntObjectMap;
        int i = this.v;
        Object objB = mutableIntObjectMap.b(i);
        if (objB == null) {
            objB = new MutableObjectList();
            mutableIntObjectMap.h(i, objB);
        }
        ((MutableObjectList) objB).g(obj);
    }

    public final void T(Object obj) {
        int iQ = q(this.t);
        int i = (iQ * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            ComposerKt.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[g(Integer.bitCount(iArr[i] >> 29) + f(iQ, iArr))] = obj;
    }

    public final void U(int i) {
        if (i >= 0) {
            MutableIntList mutableIntList = this.x;
            if (mutableIntList == null) {
                mutableIntList = new MutableIntList();
                this.x = mutableIntList;
            }
            PrioritySet.a(mutableIntList, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.q(r5)
            int[] r1 = r4.b
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating the node of a group at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            androidx.compose.runtime.ComposerKt.c(r5)
        L2e:
            java.lang.Object[] r5 = r4.c
            int[] r1 = r4.b
            int r0 = r4.f(r0, r1)
            int r0 = r4.g(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.V(int, java.lang.Object):void");
    }

    public final void a(int i) {
        boolean z = false;
        if (!(i >= 0)) {
            ComposerKt.c("Cannot seek backwards");
        }
        if (!(this.n <= 0)) {
            PreconditionsKt.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 >= this.v && i2 <= this.u) {
            z = true;
        }
        if (!z) {
            ComposerKt.c("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        }
        this.t = i2;
        int iF = f(q(i2), this.b);
        this.i = iF;
        this.j = iF;
    }

    public final Anchor b(int i) {
        ArrayList arrayList = this.d;
        int iF = SlotTableKt.f(i, n(), arrayList);
        if (iF >= 0) {
            return (Anchor) arrayList.get(iF);
        }
        if (i > this.g) {
            i = -(n() - i);
        }
        Anchor anchor = new Anchor(i);
        arrayList.add(-(iF + 1), anchor);
        return anchor;
    }

    public final int c(Anchor anchor) {
        int i = anchor.f1619a;
        return i < 0 ? n() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.c((m() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            z(n());
            A(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            G();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap map = this.e;
        MutableIntObjectMap mutableIntObjectMap = this.f;
        SlotTable slotTable = this.f1667a;
        if (!slotTable.j) {
            PreconditionsKt.a("Unexpected writer close()");
        }
        slotTable.j = false;
        slotTable.d = iArr;
        slotTable.e = i2;
        slotTable.f = objArr;
        slotTable.g = i3;
        slotTable.l = arrayList;
        slotTable.m = map;
        slotTable.n = mutableIntObjectMap;
    }

    public final int f(int i, int[] iArr) {
        if (i >= m()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int g(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void i() {
        MutableObjectList mutableObjectList;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int iQ = q(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = iQ * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        IntStack intStack = this.r;
        if (z) {
            MutableIntObjectMap mutableIntObjectMap = this.s;
            if (mutableIntObjectMap != null && (mutableObjectList = (MutableObjectList) mutableIntObjectMap.b(i3)) != null) {
                Object[] objArr = mutableObjectList.f694a;
                int i8 = mutableObjectList.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    F(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            SlotTableKt.e(iQ, i4, iArr);
            int iB = intStack.b();
            if (z2) {
                i4 = 1;
            }
            this.o = iB + i4;
            int iE = E(i3, this.b);
            this.v = iE;
            int iN = iE < 0 ? n() : q(iE + 1);
            int iF = iN >= 0 ? f(iN, this.b) : 0;
            this.i = iF;
            this.j = iF;
            return;
        }
        if (i != i2) {
            ComposerKt.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        SlotTableKt.e(iQ, i4, iArr2);
        int iB2 = this.p.b();
        this.u = (m() - this.h) - this.q.b();
        this.v = iB2;
        int iE2 = E(i3, this.b);
        int iB3 = intStack.b();
        this.o = iB3;
        if (iE2 == iB2) {
            this.o = iB3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iE2 != 0 && iE2 != iB2 && (i14 != 0 || i13 != 0)) {
                int iQ2 = q(iE2);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (iQ2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    SlotTableKt.e(iQ2, (iArr4[(iQ2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(iQ2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iE2 = E(iE2, iArr5);
            }
        }
        this.o += i14;
    }

    public final void j() {
        if (this.n <= 0) {
            PreconditionsKt.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                ComposerKt.c("startGroup/endGroup mismatch while inserting");
            }
            this.u = (m() - this.h) - this.q.b();
        }
    }

    public final void k(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            ComposerKt.c("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                ComposerKt.c("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            P();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((n() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(q(i3) * 5) + 2] = i;
            int i4 = this.b[(q(i3) * 5) + 3] + i3;
            l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final int m() {
        return this.b.length / 5;
    }

    public final int n() {
        return m() - this.h;
    }

    public final int o() {
        return this.c.length - this.l;
    }

    public final Object p(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        int i2 = (iQ * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return Composer.Companion.f1624a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + f(iQ, iArr)];
    }

    public final int q(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final Object r(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        if ((iArr[(iQ * 5) + 1] & 536870912) != 0) {
            return this.c[SlotTableKt.c(iQ, iArr)];
        }
        return null;
    }

    public final int s(int i) {
        return SlotTableKt.a(q(i), this.b);
    }

    public final boolean t(int i, int i2) {
        int iM;
        int iS;
        if (i2 == this.v) {
            iM = this.u;
        } else {
            IntStack intStack = this.p;
            if (i2 > intStack.a(0)) {
                iS = s(i2);
            } else {
                int[] iArr = intStack.f1639a;
                int iMin = Math.min(iArr.length, intStack.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iS = s(i2);
                } else {
                    iM = (m() - this.h) - this.q.f1639a[i3];
                }
            }
            iM = iS + i2;
        }
        return i > i2 && i < iM;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + n() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final void u(int i) {
        if (i > 0) {
            int i2 = this.t;
            z(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                ArraysKt.q(0, 0, i3 * 5, iArr, iArr2);
                ArraysKt.q((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i4 = i6;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int iH = h(i5 > 0 ? f(q(i2 + i), this.b) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.b[(i9 * 5) + 4] = iH;
            }
            int i10 = this.m;
            if (i10 >= i3) {
                this.m = i10 + i;
            }
        }
    }

    public final void v(int i, int i2) {
        if (i > 0) {
            A(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean w(int i) {
        return (this.b[(q(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void y(SlotTable slotTable, int i) {
        if (this.n <= 0) {
            ComposerKt.c("Check failed");
        }
        if (i == 0 && this.t == 0 && this.f1667a.e == 0) {
            int[] iArr = slotTable.d;
            int i2 = iArr[(i * 5) + 3];
            int i3 = slotTable.e;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap map = this.e;
                MutableIntObjectMap mutableIntObjectMap = this.f;
                Object[] objArr2 = slotTable.f;
                int i4 = slotTable.g;
                HashMap map2 = slotTable.m;
                MutableIntObjectMap mutableIntObjectMap2 = slotTable.n;
                this.b = iArr;
                this.c = objArr2;
                this.d = slotTable.l;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = map2;
                this.f = mutableIntObjectMap2;
                slotTable.d = iArr2;
                slotTable.e = 0;
                slotTable.f = objArr;
                slotTable.g = 0;
                slotTable.l = arrayList;
                slotTable.m = map;
                slotTable.n = mutableIntObjectMap;
                return;
            }
        }
        SlotWriter slotWriterM = slotTable.m();
        try {
            Companion.a(slotWriterM, i, this, true, true, false);
            slotWriterM.e(true);
        } catch (Throwable th) {
            slotWriterM.e(false);
            throw th;
        }
    }

    public final void z(int i) {
        Anchor anchor;
        int i2;
        Anchor anchor2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iM = m() - this.h;
                if (i6 < i) {
                    for (int iB = SlotTableKt.b(i6, iM, this.d); iB < this.d.size() && (i3 = (anchor2 = (Anchor) this.d.get(iB)).f1619a) < 0 && (i4 = i3 + iM) < i; iB++) {
                        anchor2.f1619a = i4;
                    }
                } else {
                    for (int iB2 = SlotTableKt.b(i, iM, this.d); iB2 < this.d.size() && (i2 = (anchor = (Anchor) this.d.get(iB2)).f1619a) >= 0; iB2++) {
                        anchor.f1619a = -(iM - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    ArraysKt.q(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    ArraysKt.q(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iM2 = m();
            if (i6 >= iM2) {
                ComposerKt.c("Check failed");
            }
            while (i6 < iM2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.b[i10];
                int iN = i11 > -2 ? i11 : (n() + i11) - (-2);
                if (iN >= i) {
                    iN = -((n() - iN) - (-2));
                }
                if (iN != i11) {
                    this.b[i10] = iN;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }
}
