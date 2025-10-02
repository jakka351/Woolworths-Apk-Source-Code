package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

@CoreFriendModuleApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/ElementMarker;", "", "Companion", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ElementMarker {
    public static final long[] e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f24794a;
    public final Function2 b;
    public long c;
    public final long[] d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/internal/ElementMarker$Companion;", "", "", "EMPTY_HIGH_MARKS", "[J", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ElementMarker(SerialDescriptor descriptor, Function2 function2) {
        Intrinsics.h(descriptor, "descriptor");
        this.f24794a = descriptor;
        this.b = function2;
        int iE = descriptor.e();
        if (iE <= 64) {
            this.c = iE != 64 ? (-1) << iE : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (iE - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iE & 63) != 0) {
            jArr[i - 1] = (-1) << iE;
        }
        this.d = jArr;
    }

    public final void a(int i) {
        if (i < 64) {
            this.c = (1 << i) | this.c;
        } else {
            int i2 = (i >>> 6) - 1;
            long[] jArr = this.d;
            jArr[i2] = (1 << (i & 63)) | jArr[i2];
        }
    }

    public final int b() {
        Function2 function2;
        int iNumberOfTrailingZeros;
        SerialDescriptor serialDescriptor = this.f24794a;
        int iE = serialDescriptor.e();
        do {
            long j = this.c;
            function2 = this.b;
            if (j == -1) {
                if (iE <= 64) {
                    return -1;
                }
                long[] jArr = this.d;
                int length = jArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    int i3 = i2 * 64;
                    long j2 = jArr[i];
                    while (j2 != -1) {
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j2);
                        j2 |= 1 << iNumberOfTrailingZeros2;
                        int i4 = iNumberOfTrailingZeros2 + i3;
                        if (((Boolean) function2.invoke(serialDescriptor, Integer.valueOf(i4))).booleanValue()) {
                            jArr[i] = j2;
                            return i4;
                        }
                    }
                    jArr[i] = j2;
                    i = i2;
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            this.c |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) function2.invoke(serialDescriptor, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
