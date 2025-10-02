package androidx.compose.runtime.snapshots;

import androidx.collection.MutableLongList;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdArrayBuilder;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SnapshotIdArrayBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final MutableLongList f1706a;

    public SnapshotIdArrayBuilder(long[] jArr) {
        MutableLongList mutableLongList;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            mutableLongList = new MutableLongList(jArrCopyOf.length);
            int i = mutableLongList.b;
            if (i < 0) {
                RuntimeHelpersKt.c("");
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                int length = jArrCopyOf.length + i;
                long[] jArr2 = mutableLongList.f684a;
                if (jArr2.length < length) {
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    Intrinsics.g(jArrCopyOf2, "copyOf(...)");
                    mutableLongList.f684a = jArrCopyOf2;
                }
                long[] jArr3 = mutableLongList.f684a;
                int i2 = mutableLongList.b;
                if (i != i2) {
                    ArraysKt.r(jArrCopyOf.length + i, jArr3, i, jArr3, i2);
                }
                ArraysKt.r(i, jArrCopyOf, 0, jArr3, jArrCopyOf.length);
                mutableLongList.b += jArrCopyOf.length;
            }
        } else {
            mutableLongList = new MutableLongList(16);
        }
        this.f1706a = mutableLongList;
    }

    public final void a(long j) {
        this.f1706a.a(j);
    }

    public final long[] b() {
        MutableLongList mutableLongList = this.f1706a;
        int i = mutableLongList.b;
        if (i == 0) {
            return null;
        }
        long[] jArr = new long[i];
        long[] jArr2 = mutableLongList.f684a;
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = jArr2[i2];
        }
        return jArr;
    }
}
