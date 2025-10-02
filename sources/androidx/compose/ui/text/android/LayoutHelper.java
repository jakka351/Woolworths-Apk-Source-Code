package androidx.compose.ui.text.android;

import android.text.Layout;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.Bidi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper;", "", "BidiRun", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LayoutHelper {

    /* renamed from: a, reason: collision with root package name */
    public final Layout f2073a;
    public final ArrayList b;
    public final ArrayList c;
    public final boolean[] d;
    public char[] e;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BidiRun {

        /* renamed from: a, reason: collision with root package name */
        public final int f2074a;
        public final int b;
        public final boolean c;

        public BidiRun(int i, int i2, boolean z) {
            this.f2074a = i;
            this.b = i2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) obj;
            return this.f2074a == bidiRun.f2074a && this.b == bidiRun.b && this.c == bidiRun.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + b.a(this.b, Integer.hashCode(this.f2074a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BidiRun(start=");
            sb.append(this.f2074a);
            sb.append(", end=");
            sb.append(this.b);
            sb.append(", isRtl=");
            return b.s(sb, this.c, ')');
        }
    }

    public LayoutHelper(Layout layout) {
        this.f2073a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iB = StringsKt.B(this.f2073a.getText(), '\n', length, 4);
            length = iB < 0 ? this.f2073a.getText().length() : iB + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f2073a.getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[this.b.size()];
        this.b.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi a(int r14) {
        /*
            r13 = this;
            boolean[] r0 = r13.d
            boolean r1 = r0[r14]
            java.util.ArrayList r2 = r13.c
            if (r1 == 0) goto Lf
            java.lang.Object r14 = r2.get(r14)
            java.text.Bidi r14 = (java.text.Bidi) r14
            return r14
        Lf:
            java.util.ArrayList r1 = r13.b
            r3 = 0
            if (r14 != 0) goto L16
            r4 = r3
            goto L22
        L16:
            int r4 = r14 + (-1)
            java.lang.Object r4 = r1.get(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
        L22:
            java.lang.Object r1 = r1.get(r14)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r10 = r1 - r4
            char[] r5 = r13.e
            if (r5 == 0) goto L38
            int r6 = r5.length
            if (r6 >= r10) goto L36
            goto L38
        L36:
            r6 = r5
            goto L3b
        L38:
            char[] r5 = new char[r10]
            goto L36
        L3b:
            android.text.Layout r5 = r13.f2073a
            java.lang.CharSequence r7 = r5.getText()
            android.text.TextUtils.getChars(r7, r4, r1, r6, r3)
            boolean r1 = java.text.Bidi.requiresBidi(r6, r3, r10)
            r4 = 0
            r12 = 1
            if (r1 == 0) goto L6c
            int r1 = r13.f(r14)
            int r1 = r5.getLineForOffset(r1)
            int r1 = r5.getParagraphDirection(r1)
            r5 = -1
            if (r1 != r5) goto L5d
            r11 = r12
            goto L5e
        L5d:
            r11 = r3
        L5e:
            java.text.Bidi r5 = new java.text.Bidi
            r8 = 0
            r9 = 0
            r7 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            int r1 = r5.getRunCount()
            if (r1 != r12) goto L6d
        L6c:
            r5 = r4
        L6d:
            r2.set(r14, r5)
            r0[r14] = r12
            if (r5 == 0) goto L7b
            char[] r14 = r13.e
            if (r6 != r14) goto L7a
            r6 = r4
            goto L7b
        L7a:
            r6 = r14
        L7b:
            r13.e = r6
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutHelper.a(int):java.text.Bidi");
    }

    public final float b(int i, boolean z) {
        Layout layout = this.f2073a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public final float c(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int iG = i;
        if (!z2) {
            return b(i, z);
        }
        Layout layout = this.f2073a;
        int iA = LayoutCompat_androidKt.a(layout, iG, z2);
        int lineStart = layout.getLineStart(iA);
        int lineEnd = layout.getLineEnd(iA);
        if (iG != lineStart && iG != lineEnd) {
            return b(i, z);
        }
        if (iG == 0 || iG == layout.getText().length()) {
            return b(i, z);
        }
        int iE = e(iG, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(f(iE))) == -1;
        int iG2 = g(lineEnd, lineStart);
        int iF = f(iE);
        int i4 = lineStart - iF;
        int i5 = iG2 - iF;
        Bidi bidiA = a(iE);
        Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return iG == lineStart ? z3 : !z3 ? layout.getLineLeft(iA) : layout.getLineRight(iA);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            bidiRunArr[i6] = new BidiRun(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        if (iG == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (bidiRunArr[i8].f2074a == iG) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == bidiRunArr[i3].c) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(iA) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(bidiRunArr[i3 - 1].f2074a) : layout.getPrimaryHorizontal(bidiRunArr[i3 + 1].f2074a) : layout.getLineRight(iA);
        }
        if (iG > iG2) {
            iG = g(iG, lineStart);
        }
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (bidiRunArr[i9].b == iG) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == bidiRunArr[i2].c) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(iA) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(bidiRunArr[i2 - 1].b) : layout.getPrimaryHorizontal(bidiRunArr[i2 + 1].b) : layout.getLineRight(iA);
    }

    public final int d(int i) {
        Layout layout = this.f2073a;
        return g(layout.getLineEnd(i), layout.getLineStart(i));
    }

    public final int e(int i, boolean z) {
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = this.b;
        int iP = CollectionsKt.p(arrayList, numValueOf);
        int i2 = iP < 0 ? -(iP + 1) : iP + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int f(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) this.b.get(i - 1)).intValue();
    }

    public final int g(int i, int i2) {
        while (i > i2) {
            char cCharAt = this.f2073a.getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((Intrinsics.j(cCharAt, 8192) < 0 || Intrinsics.j(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }
}
