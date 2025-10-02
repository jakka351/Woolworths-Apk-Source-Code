package androidx.compose.runtime.changelist;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/FixupList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FixupList extends OperationsDebugStringFormattable {

    /* renamed from: a, reason: collision with root package name */
    public final Operations f1674a = new Operations();
    public final Operations b = new Operations();

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("FixupList instance containing ");
        Operations operations = this.f1674a;
        sb2.append(operations.b);
        sb2.append(" operations");
        sb.append(sb2.toString());
        if (sb.length() > 0) {
            sb.append(":\n" + operations.a(str));
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}
