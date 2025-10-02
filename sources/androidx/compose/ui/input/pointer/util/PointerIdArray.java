package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerIdArray {

    /* renamed from: a, reason: collision with root package name */
    public int f1866a;
    public long[] b;

    public final void a(long j) {
        if (b(j)) {
            return;
        }
        int i = this.f1866a;
        long[] jArrCopyOf = this.b;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            Intrinsics.g(jArrCopyOf, "copyOf(...)");
            this.b = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.f1866a) {
            this.f1866a = i + 1;
        }
    }

    public final boolean b(long j) {
        int i = this.f1866a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public final void c(long j) {
        int i = this.f1866a;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.b[i2]) {
                int i3 = this.f1866a - 1;
                while (i2 < i3) {
                    long[] jArr = this.b;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.f1866a--;
                return;
            }
            i2++;
        }
    }
}
