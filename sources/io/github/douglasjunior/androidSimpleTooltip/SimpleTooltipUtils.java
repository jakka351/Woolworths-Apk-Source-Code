package io.github.douglasjunior.androidSimpleTooltip;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes7.dex */
public final class SimpleTooltipUtils {
    public static RectF a(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new RectF(iArr[0], iArr[1], view.getMeasuredWidth() + r2, view.getMeasuredHeight() + iArr[1]);
    }

    public static RectF b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getMeasuredWidth() + r2, view.getMeasuredHeight() + iArr[1]);
    }

    public static void c(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }
}
