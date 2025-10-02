package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/IntList;", "", "Landroidx/collection/MutableIntList;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class IntList {

    /* renamed from: a, reason: collision with root package name */
    public int[] f676a;
    public int b;

    public final int a(int i) {
        if (i >= 0 && i < this.b) {
            return this.f676a[i];
        }
        RuntimeHelpersKt.c("Index must be between 0 and size");
        throw null;
    }

    public final int b() {
        int i = this.b;
        if (i != 0) {
            return this.f676a[i - 1];
        }
        RuntimeHelpersKt.d("IntList is empty.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IntList) {
            IntList intList = (IntList) obj;
            int i = intList.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.f676a;
                int[] iArr2 = intList.f676a;
                IntRange intRangeO = RangesKt.o(0, i2);
                int i3 = intRangeO.d;
                int i4 = intRangeO.e;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f676a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f676a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}
