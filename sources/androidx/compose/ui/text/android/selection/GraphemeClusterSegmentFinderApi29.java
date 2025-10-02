package androidx.compose.ui.text.android.selection;

import android.text.TextPaint;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinderApi29;", "Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinder;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GraphemeClusterSegmentFinderApi29 extends GraphemeClusterSegmentFinder {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2082a;
    public final TextPaint b;

    public GraphemeClusterSegmentFinderApi29(CharSequence charSequence, TextPaint textPaint) {
        this.f2082a = charSequence;
        this.b = textPaint;
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public final int e(int i) {
        CharSequence charSequence = this.f2082a;
        return this.b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public final int f(int i) {
        CharSequence charSequence = this.f2082a;
        return this.b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
