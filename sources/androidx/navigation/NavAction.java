package androidx.navigation;

import android.os.Bundle;
import androidx.os.SavedStateReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavAction;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NavAction {

    /* renamed from: a, reason: collision with root package name */
    public final int f3470a;
    public NavOptions b = null;
    public Bundle c = null;

    public NavAction(int i) {
        this.f3470a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavAction)) {
            return false;
        }
        NavAction navAction = (NavAction) obj;
        if (this.f3470a != navAction.f3470a || !Intrinsics.c(this.b, navAction.b)) {
            return false;
        }
        Bundle bundle = this.c;
        Bundle bundle2 = navAction.c;
        if (Intrinsics.c(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !SavedStateReader.a(bundle, bundle2)) ? false : true;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f3470a) * 31;
        NavOptions navOptions = this.b;
        int iHashCode2 = iHashCode + (navOptions != null ? navOptions.hashCode() : 0);
        Bundle bundle = this.c;
        if (bundle != null) {
            return SavedStateReader.b(bundle) + (iHashCode2 * 31);
        }
        return iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavAction(0x");
        sb.append(Integer.toHexString(this.f3470a));
        sb.append(")");
        if (this.b != null) {
            sb.append(" navOptions=");
            sb.append(this.b);
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}
