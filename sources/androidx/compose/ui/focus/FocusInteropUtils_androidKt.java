package androidx.compose.ui.focus;

import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusInteropUtils_androidKt {
    public static final Rect a(View view, AndroidComposeView androidComposeView) {
        int[] iArr = FocusInteropUtils.f1745a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        androidComposeView.getLocationInWindow(iArr);
        float f = i - iArr[0];
        float f2 = i2 - iArr[1];
        return new Rect(f, f2, view.getWidth() + f, view.getHeight() + f2);
    }

    public static final boolean b(View view, Integer num, android.graphics.Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if ((!viewGroup.isFocusable() || view.hasFocus()) && !(view instanceof AndroidComposeView)) {
            if (rect != null) {
                View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
                return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
            return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue(), rect);
    }

    public static final Integer c(int i) {
        if (FocusDirection.b(i, 5)) {
            return 33;
        }
        if (FocusDirection.b(i, 6)) {
            return 130;
        }
        if (FocusDirection.b(i, 3)) {
            return 17;
        }
        if (FocusDirection.b(i, 4)) {
            return 66;
        }
        if (FocusDirection.b(i, 1)) {
            return 2;
        }
        return FocusDirection.b(i, 2) ? 1 : null;
    }

    public static final FocusDirection d(int i) {
        if (i == 1) {
            return FocusDirection.a(2);
        }
        if (i == 2) {
            return FocusDirection.a(1);
        }
        if (i == 17) {
            return FocusDirection.a(3);
        }
        if (i == 33) {
            return FocusDirection.a(5);
        }
        if (i == 66) {
            return FocusDirection.a(4);
        }
        if (i != 130) {
            return null;
        }
        return FocusDirection.a(6);
    }
}
