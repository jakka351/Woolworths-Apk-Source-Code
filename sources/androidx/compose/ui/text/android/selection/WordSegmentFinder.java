package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordSegmentFinder;", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WordSegmentFinder implements SegmentFinder {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2085a;
    public final WordIterator b;

    public WordSegmentFinder(CharSequence charSequence, WordIterator wordIterator) {
        this.f2085a = charSequence;
        this.b = wordIterator;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int a(int i) {
        do {
            i = this.b.i(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f2085a.charAt(i - 1)));
        return i;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int b(int i) {
        CharSequence charSequence;
        do {
            i = this.b.h(i);
            if (i != -1) {
                charSequence = this.f2085a;
                if (i == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int c(int i) {
        do {
            i = this.b.i(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f2085a.charAt(i)));
        return i;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int d(int i) {
        do {
            i = this.b.h(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f2085a.charAt(i - 1)));
        return i;
    }
}
