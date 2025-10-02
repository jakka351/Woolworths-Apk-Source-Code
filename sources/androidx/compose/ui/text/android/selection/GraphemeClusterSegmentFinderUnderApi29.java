package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinderUnderApi29;", "Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinder;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class GraphemeClusterSegmentFinderUnderApi29 extends GraphemeClusterSegmentFinder {

    /* renamed from: a, reason: collision with root package name */
    public final BreakIterator f2083a;

    public GraphemeClusterSegmentFinderUnderApi29(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f2083a = characterInstance;
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public final int e(int i) {
        return this.f2083a.following(i);
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public final int f(int i) {
        return this.f2083a.preceding(i);
    }
}
