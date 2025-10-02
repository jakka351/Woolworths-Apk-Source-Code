package androidx.collection;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/collection/MutableLongList;", "Landroidx/collection/LongList;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MutableLongList extends LongList {
    public MutableLongList(int i) {
        this.f684a = i == 0 ? LongSetKt.f688a : new long[i];
    }

    public final void a(long j) {
        int i = this.b + 1;
        long[] jArr = this.f684a;
        if (jArr.length < i) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
            Intrinsics.g(jArrCopyOf, "copyOf(...)");
            this.f684a = jArrCopyOf;
        }
        long[] jArr2 = this.f684a;
        int i2 = this.b;
        jArr2[i2] = j;
        this.b = i2 + 1;
    }
}
