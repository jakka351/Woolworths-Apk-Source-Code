package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@StabilityInferred
@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/AndroidLayoutApi34;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidLayoutApi34 {
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.text.android.a] */
    public static int[] a(TextLayout textLayout, RectF rectF, int i, final Function2 function2) {
        SegmentFinder segmentFinderM;
        if (i == 1) {
            final WordSegmentFinder wordSegmentFinder = new WordSegmentFinder(textLayout.f.getText(), textLayout.k());
            segmentFinderM = new SegmentFinder() { // from class: androidx.compose.ui.text.android.selection.Api34SegmentFinder$toAndroidSegmentFinder$1
                public final int nextEndBoundary(int i2) {
                    return wordSegmentFinder.d(i2);
                }

                public final int nextStartBoundary(int i2) {
                    return wordSegmentFinder.b(i2);
                }

                public final int previousEndBoundary(int i2) {
                    return wordSegmentFinder.a(i2);
                }

                public final int previousStartBoundary(int i2) {
                    return wordSegmentFinder.c(i2);
                }
            };
        } else {
            c.s();
            segmentFinderM = c.m(c.l(textLayout.f.getText(), textLayout.f2078a));
        }
        return textLayout.f.getRangeForRect(rectF, segmentFinderM, new Layout.TextInclusionStrategy() { // from class: androidx.compose.ui.text.android.a
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) function2.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }
}
