package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/GroupSourceInformation;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GroupSourceInformation {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1638a;

    public final boolean a(Anchor anchor) {
        ArrayList arrayList = this.f1638a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = arrayList.get(i);
                if (Intrinsics.c(obj, anchor)) {
                    return true;
                }
                if ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).a(anchor)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    public final GroupSourceInformation b() {
        GroupSourceInformation groupSourceInformation;
        ArrayList arrayList = this.f1638a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                groupSourceInformation = arrayList.get(size);
                if (groupSourceInformation instanceof GroupSourceInformation) {
                    break;
                }
            }
            groupSourceInformation = 0;
        } else {
            groupSourceInformation = 0;
        }
        GroupSourceInformation groupSourceInformation2 = groupSourceInformation instanceof GroupSourceInformation ? groupSourceInformation : null;
        return groupSourceInformation2 != null ? groupSourceInformation2.b() : this;
    }

    public final boolean c(Anchor anchor) {
        ArrayList arrayList = this.f1638a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof Anchor) {
                    if (obj.equals(anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).c(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.f1638a = null;
                return false;
            }
        }
        return true;
    }
}
