package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinder;", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class GraphemeClusterSegmentFinder implements SegmentFinder {
    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int a(int i) {
        int iF = f(i);
        if (iF == -1 || f(iF) == -1) {
            return -1;
        }
        return iF;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int b(int i) {
        int iE = e(i);
        if (iE == -1 || e(iE) == -1) {
            return -1;
        }
        return iE;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int c(int i) {
        return f(i);
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int d(int i) {
        return e(i);
    }

    public abstract int e(int i);

    public abstract int f(int i);
}
