package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class AnimateLayoutChangeDetector {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.MarginLayoutParams f3830a;

    /* renamed from: androidx.viewpager2.widget.AnimateLayoutChangeDetector$1, reason: invalid class name */
    class AnonymousClass1 implements Comparator<int[]> {
        @Override // java.util.Comparator
        public final int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f3830a = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public static boolean a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
