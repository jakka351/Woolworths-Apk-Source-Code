package androidx.compose.runtime.changelist;

import YU.a;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ChangeList extends OperationsDebugStringFormattable {

    /* renamed from: a, reason: collision with root package name */
    public final Operations f1672a = new Operations();

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public final String a(String str) {
        StringBuilder sbS = a.s("ChangeList instance containing ");
        Operations operations = this.f1672a;
        sbS.append(operations.b);
        sbS.append(" operations");
        if (sbS.length() > 0) {
            sbS.append(":\n");
            sbS.append(operations.a(str));
        }
        String string = sbS.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    public final void b(Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
        this.f1672a.c(applier, slotWriter, rememberEventDispatcher);
    }
}
