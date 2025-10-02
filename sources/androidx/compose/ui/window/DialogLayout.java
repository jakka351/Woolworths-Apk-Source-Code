package androidx.compose.ui.window;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/window/DialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/DialogWindowProvider;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DialogLayout extends AbstractComposeView implements DialogWindowProvider, OnApplyWindowInsetsListener {
    public final Window l;
    public final MutableState m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    public DialogLayout(Context context, Window window) {
        super(context, null, 6, 0);
        this.l = window;
        this.m = SnapshotStateKt.f(ComposableSingletons$AndroidDialog_androidKt.f2219a);
        ViewCompat.I(this, this);
        ViewCompat.P(this, new WindowInsetsAnimationCompat.Callback() { // from class: androidx.compose.ui.window.DialogLayout.1
            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public final WindowInsetsCompat c(WindowInsetsCompat windowInsetsCompat, List list) {
                DialogLayout dialogLayout = DialogLayout.this;
                if (!dialogLayout.o) {
                    View childAt = dialogLayout.getChildAt(0);
                    int iMax = Math.max(0, childAt.getLeft());
                    int iMax2 = Math.max(0, childAt.getTop());
                    int iMax3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                    int iMax4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                    if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                        return windowInsetsCompat.n(iMax, iMax2, iMax3, iMax4);
                    }
                }
                return windowInsetsCompat;
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public final WindowInsetsAnimationCompat.BoundsCompat d(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
                DialogLayout dialogLayout = DialogLayout.this;
                if (!dialogLayout.o) {
                    View childAt = dialogLayout.getChildAt(0);
                    int iMax = Math.max(0, childAt.getLeft());
                    int iMax2 = Math.max(0, childAt.getTop());
                    int iMax3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                    int iMax4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                    if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                        Insets insetsC = Insets.c(iMax, iMax2, iMax3, iMax4);
                        int i = insetsC.f2430a;
                        Insets insets = boundsCompat.f2496a;
                        int i2 = insetsC.b;
                        int i3 = insetsC.c;
                        int i4 = insetsC.d;
                        return new WindowInsetsAnimationCompat.BoundsCompat(WindowInsetsCompat.o(insets, i, i2, i3, i4), WindowInsetsCompat.o(boundsCompat.b, i, i2, i3, i4));
                    }
                }
                return boundsCompat;
            }
        });
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i) {
        composer.o(1735448596);
        ((Function2) ((SnapshotMutableStateImpl) this.m).getD()).invoke(composer, 0);
        composer.l();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void f(int i, int i2, int i3, int i4, boolean z) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void g(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.g(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.l;
        int i3 = (mode != Integer.MIN_VALUE || this.n || this.o || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i3 - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.n || this.o || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    public final boolean getQ() {
        return this.q;
    }

    @Override // androidx.compose.ui.window.DialogWindowProvider
    /* renamed from: getWindow, reason: from getter */
    public final Window getL() {
        return this.l;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        if (!this.o) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return windowInsetsCompat.n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return windowInsetsCompat;
    }
}
