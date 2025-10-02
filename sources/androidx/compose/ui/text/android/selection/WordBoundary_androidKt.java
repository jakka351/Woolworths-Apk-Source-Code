package androidx.compose.ui.text.android.selection;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WordBoundary_androidKt {
    public static final int a(WordIterator wordIterator, int i) {
        int iH;
        int iH2;
        if (wordIterator.c(wordIterator.h(i))) {
            wordIterator.a(i);
            iH = i;
            while (iH != -1 && (wordIterator.g(iH) || !wordIterator.c(iH))) {
                iH = wordIterator.h(iH);
            }
        } else {
            wordIterator.a(i);
            if (wordIterator.b(i)) {
                if (!wordIterator.d(i) || wordIterator.f(i)) {
                    iH2 = wordIterator.h(i);
                    iH = iH2;
                } else {
                    iH = i;
                }
            } else if (wordIterator.f(i)) {
                iH2 = wordIterator.h(i);
                iH = iH2;
            } else {
                iH = -1;
            }
        }
        return iH == -1 ? i : iH;
    }

    public static final int b(WordIterator wordIterator, int i) {
        int i2;
        int i3;
        if (wordIterator.g(wordIterator.i(i))) {
            wordIterator.a(i);
            i2 = i;
            while (i2 != -1 && (!wordIterator.g(i2) || wordIterator.c(i2))) {
                i2 = wordIterator.i(i2);
            }
        } else {
            wordIterator.a(i);
            if (wordIterator.f(i)) {
                if (!wordIterator.d(i) || wordIterator.b(i)) {
                    i3 = wordIterator.i(i);
                    i2 = i3;
                } else {
                    i2 = i;
                }
            } else if (wordIterator.b(i)) {
                i3 = wordIterator.i(i);
                i2 = i3;
            } else {
                i2 = -1;
            }
        }
        return i2 == -1 ? i : i2;
    }
}
