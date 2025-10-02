package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/IntStack;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntStack {

    /* renamed from: a, reason: collision with root package name */
    public int[] f1639a = new int[10];
    public int b;

    public final int a(int i) {
        int i2 = this.b - 1;
        return i2 >= 0 ? this.f1639a[i2] : i;
    }

    public final int b() {
        int[] iArr = this.f1639a;
        int i = this.b - 1;
        this.b = i;
        return iArr[i];
    }

    public final void c(int i) {
        int[] iArrCopyOf = this.f1639a;
        if (this.b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            Intrinsics.g(iArrCopyOf, "copyOf(...)");
            this.f1639a = iArrCopyOf;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        iArrCopyOf[i2] = i;
    }
}
