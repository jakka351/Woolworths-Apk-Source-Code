package okio.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C1866SegmentedByteString;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes8.dex */
public final class SegmentedByteString {
    public static final int a(C1866SegmentedByteString c1866SegmentedByteString, int i) {
        int i2;
        int[] iArr = c1866SegmentedByteString.i;
        int i3 = i + 1;
        int length = c1866SegmentedByteString.h.length;
        Intrinsics.h(iArr, "<this>");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }
}
