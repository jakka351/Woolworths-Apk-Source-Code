package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.material.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes6.dex */
public class ViewUtils {

    /* renamed from: com.google.android.material.internal.ViewUtils$3, reason: invalid class name */
    class AnonymousClass3 implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            ViewCompat.y(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public interface OnApplyWindowInsetsListener {
        WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, RelativePadding relativePadding);
    }

    public static class RelativePadding {

        /* renamed from: a, reason: collision with root package name */
        public int f14609a;
        public int b;
        public int c;
        public int d;
    }

    public static Rect a(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    public static void b(View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        final RelativePadding relativePadding = new RelativePadding();
        relativePadding.f14609a = paddingStart;
        relativePadding.b = paddingTop;
        relativePadding.c = paddingEnd;
        relativePadding.d = paddingBottom;
        ViewCompat.I(view, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.2
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                RelativePadding relativePadding2 = new RelativePadding();
                RelativePadding relativePadding3 = relativePadding;
                relativePadding2.f14609a = relativePadding3.f14609a;
                relativePadding2.b = relativePadding3.b;
                relativePadding2.c = relativePadding3.c;
                relativePadding2.d = relativePadding3.d;
                return onApplyWindowInsetsListener.a(view2, windowInsetsCompat, relativePadding2);
            }
        });
        if (view.isAttachedToWindow()) {
            ViewCompat.y(view);
        } else {
            view.addOnAttachStateChangeListener(new AnonymousClass3());
        }
    }

    public static void c(BottomAppBar bottomAppBar, AttributeSet attributeSet, int i, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        TypedArray typedArrayObtainStyledAttributes = bottomAppBar.getContext().obtainStyledAttributes(attributeSet, R.styleable.w, i, 2132084074);
        final boolean z = typedArrayObtainStyledAttributes.getBoolean(3, false);
        final boolean z2 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        final boolean z3 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        typedArrayObtainStyledAttributes.recycle();
        b(bottomAppBar, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, RelativePadding relativePadding) {
                if (z) {
                    relativePadding.d = windowInsetsCompat.h() + relativePadding.d;
                }
                boolean zH = ViewUtils.h(view);
                if (z2) {
                    if (zH) {
                        relativePadding.c = windowInsetsCompat.i() + relativePadding.c;
                    } else {
                        relativePadding.f14609a = windowInsetsCompat.i() + relativePadding.f14609a;
                    }
                }
                if (z3) {
                    if (zH) {
                        relativePadding.f14609a = windowInsetsCompat.j() + relativePadding.f14609a;
                    } else {
                        relativePadding.c = windowInsetsCompat.j() + relativePadding.c;
                    }
                }
                int i2 = relativePadding.f14609a;
                int i3 = relativePadding.b;
                int i4 = relativePadding.c;
                int i5 = relativePadding.d;
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                view.setPaddingRelative(i2, i3, i4, i5);
                onApplyWindowInsetsListener.a(view, windowInsetsCompat, relativePadding);
                return windowInsetsCompat;
            }
        });
    }

    public static float d(int i, Context context) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static ViewGroup e(View view) {
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static ViewOverlayImpl f(View view) {
        if (view == null) {
            return null;
        }
        return new ViewOverlayApi18(view);
    }

    public static void g(View view, boolean z) {
        WindowInsetsControllerCompat windowInsetsControllerCompatQ;
        if (z && (windowInsetsControllerCompatQ = ViewCompat.q(view)) != null) {
            windowInsetsControllerCompatQ.a(8);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean h(View view) {
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode i(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
