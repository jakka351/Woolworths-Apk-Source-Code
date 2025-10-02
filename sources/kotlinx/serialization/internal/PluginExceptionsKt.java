package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PluginExceptionsKt {
    public static final void a(int i, int i2, SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(descriptor.g(i4));
            }
            i3 >>>= 1;
        }
        String serialName = descriptor.getF24771a();
        Intrinsics.h(serialName, "serialName");
        throw new MissingFieldException(arrayList, arrayList.size() == 1 ? androidx.constraintlayout.core.state.a.l(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", serialName, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }
}
