package androidx.compose.runtime.snapshots;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000*\n\u0010\u0003\"\u00020\u00022\u00020\u0002¨\u0006\u0004"}, d2 = {"", "SnapshotId", "", "SnapshotIdArray", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotId_jvmKt {
    public static final int a(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }
}
