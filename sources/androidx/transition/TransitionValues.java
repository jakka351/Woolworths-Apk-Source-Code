package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class TransitionValues {
    public View b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3796a = new HashMap();
    public final ArrayList c = new ArrayList();

    public TransitionValues(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.b == transitionValues.b && this.f3796a.equals(transitionValues.f3796a);
    }

    public final int hashCode() {
        return this.f3796a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbT = YU.a.t("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbT.append(this.b);
        sbT.append("\n");
        String strG = YU.a.g(sbT.toString(), "    values:");
        HashMap map = this.f3796a;
        for (String str : map.keySet()) {
            strG = strG + "    " + str + ": " + map.get(str) + "\n";
        }
        return strG;
    }
}
