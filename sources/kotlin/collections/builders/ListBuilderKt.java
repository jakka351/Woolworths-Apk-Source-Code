package kotlin.collections.builders;

import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ListBuilderKt {
    public static final String a(Object[] objArr, int i, int i2, AbstractMutableList abstractMutableList) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractMutableList) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    public static final void b(int i, int i2, Object[] objArr) {
        Intrinsics.h(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }
}
