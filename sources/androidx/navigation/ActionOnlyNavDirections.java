package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/ActionOnlyNavDirections;", "Landroidx/navigation/NavDirections;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class ActionOnlyNavDirections implements NavDirections {
    @Override // androidx.navigation.NavDirections
    public final Bundle b() {
        return null;
    }

    @Override // androidx.navigation.NavDirections
    public final int c() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ActionOnlyNavDirections.class.equals(obj.getClass())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 31;
    }

    public final String toString() {
        return "ActionOnlyNavDirections(actionId=0)";
    }
}
