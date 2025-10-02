package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SparseArrayCompatKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f704a = new Object();

    public static final void a(SparseArrayCompat sparseArrayCompat) {
        int i = sparseArrayCompat.g;
        int[] iArr = sparseArrayCompat.e;
        Object[] objArr = sparseArrayCompat.f;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f704a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        sparseArrayCompat.d = false;
        sparseArrayCompat.g = i2;
    }

    public static final Object b(SparseArrayCompat sparseArrayCompat, int i) {
        Object obj;
        Intrinsics.h(sparseArrayCompat, "<this>");
        int iA = ContainerHelpersKt.a(sparseArrayCompat.g, i, sparseArrayCompat.e);
        if (iA < 0 || (obj = sparseArrayCompat.f[iA]) == f704a) {
            return null;
        }
        return obj;
    }
}
