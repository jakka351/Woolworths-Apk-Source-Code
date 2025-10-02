package androidx.navigation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/Navigation;", "", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Navigation {
    public static final NavController a(View view) {
        Intrinsics.h(view, "view");
        NavController navController = (NavController) SequencesKt.i(SequencesKt.s(SequencesKt.m(view, new a(7)), new a(8)));
        if (navController != null) {
            return navController;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
