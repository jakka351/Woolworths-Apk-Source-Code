package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.SlotWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"", "IntParameter", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OperationKt {
    public static final void a(SlotWriter slotWriter, Applier applier, int i) {
        while (true) {
            int i2 = slotWriter.v;
            if (i > i2 && i < slotWriter.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            slotWriter.L();
            if (slotWriter.w(slotWriter.v)) {
                applier.j();
            }
            slotWriter.i();
        }
    }
}
