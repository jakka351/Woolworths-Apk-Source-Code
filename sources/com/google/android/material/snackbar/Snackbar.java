package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.navigation.ui.a;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.woolworths.R;

/* loaded from: classes6.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    public static final int[] F = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public final AccessibilityManager D;
    public boolean E;

    public static class Callback extends BaseTransientBottomBar.BaseCallback<Snackbar> {
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public final /* bridge */ /* synthetic */ void a(BaseTransientBottomBar baseTransientBottomBar, int i) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public final /* bridge */ /* synthetic */ void b(BaseTransientBottomBar baseTransientBottomBar) {
        }
    }

    @RestrictTo
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@Nullable Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@Nullable Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context) {
            super(context, null);
        }
    }

    public Snackbar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.D = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static Snackbar i(View view, int i, int i2) {
        return j(null, view, view.getResources().getText(i), i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[LOOP:0: B:3:0x0002->B:37:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.material.snackbar.Snackbar j(androidx.fragment.app.FragmentActivity r6, android.view.View r7, java.lang.CharSequence r8, int r9) {
        /*
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r2 == 0) goto L9
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L9:
            boolean r2 = r7 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L1c
            int r1 = r7.getId()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 != r2) goto L19
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L19:
            r1 = r7
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L1c:
            if (r7 == 0) goto L2a
            android.view.ViewParent r7 = r7.getParent()
            boolean r2 = r7 instanceof android.view.View
            if (r2 == 0) goto L29
            android.view.View r7 = (android.view.View) r7
            goto L2a
        L29:
            r7 = r0
        L2a:
            if (r7 != 0) goto L2
            r7 = r1
        L2d:
            if (r7 == 0) goto L75
            if (r6 != 0) goto L35
            android.content.Context r6 = r7.getContext()
        L35:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r6)
            int[] r1 = com.google.android.material.snackbar.Snackbar.F
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r1)
            r2 = 0
            r3 = -1
            int r4 = r1.getResourceId(r2, r3)
            r5 = 1
            int r5 = r1.getResourceId(r5, r3)
            r1.recycle()
            if (r4 == r3) goto L55
            if (r5 == r3) goto L55
            r1 = 2131559161(0x7f0d02f9, float:1.8743658E38)
            goto L58
        L55:
            r1 = 2131558560(0x7f0d00a0, float:1.874244E38)
        L58:
            android.view.View r0 = r0.inflate(r1, r7, r2)
            com.google.android.material.snackbar.SnackbarContentLayout r0 = (com.google.android.material.snackbar.SnackbarContentLayout) r0
            com.google.android.material.snackbar.Snackbar r1 = new com.google.android.material.snackbar.Snackbar
            r1.<init>(r6, r7, r0, r0)
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r6 = r1.i
            android.view.View r6 = r6.getChildAt(r2)
            com.google.android.material.snackbar.SnackbarContentLayout r6 = (com.google.android.material.snackbar.SnackbarContentLayout) r6
            android.widget.TextView r6 = r6.getMessageView()
            r6.setText(r8)
            r1.k = r9
            return r1
        L75:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "No suitable parent found from the given view. Please provide a valid view."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.Snackbar.j(androidx.fragment.app.FragmentActivity, android.view.View, java.lang.CharSequence, int):com.google.android.material.snackbar.Snackbar");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final void a() {
        b(3);
    }

    public final void k(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.i.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence)) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.E = false;
        } else {
            this.E = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new a(20, this, onClickListener));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            r8 = this;
            com.google.android.material.snackbar.SnackbarManager r0 = com.google.android.material.snackbar.SnackbarManager.b()
            android.view.accessibility.AccessibilityManager r1 = r8.D
            int r2 = r8.k
            r3 = 0
            r4 = 4
            r5 = -2
            if (r2 != r5) goto Le
            goto L2c
        Le:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 29
            if (r6 < r7) goto L22
            boolean r5 = r8.E
            if (r5 == 0) goto L1a
            r5 = r4
            goto L1b
        L1a:
            r5 = r3
        L1b:
            r5 = r5 | 3
            int r2 = androidx.media3.exoplayer.source.mediaparser.a.c(r1, r2, r5)
            goto L2d
        L22:
            boolean r6 = r8.E
            if (r6 == 0) goto L2d
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L2d
        L2c:
            r2 = r5
        L2d:
            com.google.android.material.snackbar.BaseTransientBottomBar$5 r1 = r8.w
            java.lang.Object r5 = r0.f14655a
            monitor-enter(r5)
            boolean r6 = r0.c(r1)     // Catch: java.lang.Throwable -> L48
            if (r6 == 0) goto L4a
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r1 = r0.c     // Catch: java.lang.Throwable -> L48
            r1.b = r2     // Catch: java.lang.Throwable -> L48
            android.os.Handler r2 = r0.b     // Catch: java.lang.Throwable -> L48
            r2.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L48
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r1 = r0.c     // Catch: java.lang.Throwable -> L48
            r0.f(r1)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r0 = move-exception
            goto L8e
        L4a:
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r6 = r0.d     // Catch: java.lang.Throwable -> L48
            if (r6 == 0) goto L57
            java.lang.ref.WeakReference r6 = r6.f14656a     // Catch: java.lang.Throwable -> L48
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L48
            if (r6 != r1) goto L57
            r3 = 1
        L57:
            if (r3 == 0) goto L5e
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r1 = r0.d     // Catch: java.lang.Throwable -> L48
            r1.b = r2     // Catch: java.lang.Throwable -> L48
            goto L65
        L5e:
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r3 = new com.google.android.material.snackbar.SnackbarManager$SnackbarRecord     // Catch: java.lang.Throwable -> L48
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> L48
            r0.d = r3     // Catch: java.lang.Throwable -> L48
        L65:
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r1 = r0.c     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L71
            boolean r1 = r0.a(r1, r4)     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L71
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L48
            return
        L71:
            r1 = 0
            r0.c = r1     // Catch: java.lang.Throwable -> L48
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r2 = r0.d     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L8c
            r0.c = r2     // Catch: java.lang.Throwable -> L48
            r0.d = r1     // Catch: java.lang.Throwable -> L48
            java.lang.ref.WeakReference r2 = r2.f14656a     // Catch: java.lang.Throwable -> L48
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L48
            com.google.android.material.snackbar.SnackbarManager$Callback r2 = (com.google.android.material.snackbar.SnackbarManager.Callback) r2     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L8a
            r2.a()     // Catch: java.lang.Throwable -> L48
            goto L8c
        L8a:
            r0.c = r1     // Catch: java.lang.Throwable -> L48
        L8c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L48
            return
        L8e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L48
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.Snackbar.l():void");
    }
}
