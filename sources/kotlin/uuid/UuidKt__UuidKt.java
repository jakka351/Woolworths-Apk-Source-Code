package kotlin.uuid;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
@SourceDebugExtension
/* loaded from: classes7.dex */
class UuidKt__UuidKt extends UuidKt__UuidJVMKt {
    public static final void b(int i, String str) {
        Intrinsics.h(str, "<this>");
        if (str.charAt(i) == '-') {
            return;
        }
        StringBuilder sbR = a.r(i, "Expected '-' (hyphen) at index ", ", but was '");
        sbR.append(str.charAt(i));
        sbR.append('\'');
        throw new IllegalArgumentException(sbR.toString().toString());
    }
}
