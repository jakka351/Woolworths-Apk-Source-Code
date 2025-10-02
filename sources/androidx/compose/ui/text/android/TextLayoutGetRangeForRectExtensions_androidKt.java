package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinderApi29;
import androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinderUnderApi29;
import androidx.compose.ui.text.android.selection.SegmentFinder;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextLayoutGetRangeForRectExtensions_androidKt {
    public static final float a(int i, int i2, float[] fArr) {
        return fArr[android.support.v4.media.session.a.c(i, i2, 2, 1)];
    }

    public static final int[] b(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, RectF rectF, int i, Function2 function2) {
        SegmentFinder graphemeClusterSegmentFinderApi29;
        int i2;
        if (i == 1) {
            graphemeClusterSegmentFinderApi29 = new WordSegmentFinder(textLayout.f.getText(), textLayout.k());
        } else {
            CharSequence text = textLayout.f.getText();
            graphemeClusterSegmentFinderApi29 = Build.VERSION.SDK_INT >= 29 ? new GraphemeClusterSegmentFinderApi29(text, textLayout.f2078a) : new GraphemeClusterSegmentFinderUnderApi29(text);
        }
        SegmentFinder segmentFinder = graphemeClusterSegmentFinderApi29;
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > textLayout.f(lineForVertical) && (lineForVertical = lineForVertical + 1) >= textLayout.g) {
            return null;
        }
        int i3 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < textLayout.h(0)) {
            return null;
        }
        int iC = c(textLayout, layout, layoutHelper, i3, rectF, segmentFinder, function2, true);
        while (true) {
            i2 = i3;
            if (iC != -1 || i2 >= lineForVertical2) {
                break;
            }
            i3 = i2 + 1;
            iC = c(textLayout, layout, layoutHelper, i3, rectF, segmentFinder, function2, true);
        }
        if (iC == -1) {
            return null;
        }
        int iC2 = c(textLayout, layout, layoutHelper, lineForVertical2, rectF, segmentFinder, function2, false);
        while (iC2 == -1 && i2 < lineForVertical2) {
            int i4 = lineForVertical2 - 1;
            iC2 = c(textLayout, layout, layoutHelper, i4, rectF, segmentFinder, function2, false);
            lineForVertical2 = i4;
        }
        if (iC2 == -1) {
            return null;
        }
        return new int[]{segmentFinder.c(iC + 1), segmentFinder.d(iC2 - 1)};
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0263 A[EDGE_INSN: B:203:0x0263->B:144:0x0263 BREAK  A[LOOP:5: B:154:0x027f->B:206:0x027f], EDGE_INSN: B:204:0x0263->B:144:0x0263 BREAK  A[LOOP:5: B:154:0x027f->B:206:0x027f]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(androidx.compose.ui.text.android.TextLayout r19, android.text.Layout r20, androidx.compose.ui.text.android.LayoutHelper r21, int r22, android.graphics.RectF r23, androidx.compose.ui.text.android.selection.SegmentFinder r24, kotlin.jvm.functions.Function2 r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.TextLayoutGetRangeForRectExtensions_androidKt.c(androidx.compose.ui.text.android.TextLayout, android.text.Layout, androidx.compose.ui.text.android.LayoutHelper, int, android.graphics.RectF, androidx.compose.ui.text.android.selection.SegmentFinder, kotlin.jvm.functions.Function2, boolean):int");
    }
}
