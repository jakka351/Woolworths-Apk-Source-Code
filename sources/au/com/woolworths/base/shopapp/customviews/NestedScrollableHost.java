package au.com.woolworths.base.shopapp.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/base/shopapp/customviews/NestedScrollableHost;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Landroidx/viewpager2/widget/ViewPager2;", "getAncestorViewPagers", "()Ljava/util/List;", "ancestorViewPagers", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NestedScrollableHost extends FrameLayout {
    public final int d;
    public float e;
    public float f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/shopapp/customviews/NestedScrollableHost$Companion;", "", "", "COEFFICIENT_HALF", "F", "COEFFICIENT_DEFAULT", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
        this.d = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0012, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<androidx.viewpager2.widget.ViewPager2> getAncestorViewPagers() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.ViewParent r1 = r4.getParent()
            boolean r2 = r1 instanceof android.view.View
            r3 = 0
            if (r2 == 0) goto L11
            android.view.View r1 = (android.view.View) r1
            goto L12
        L11:
            r1 = r3
        L12:
            if (r1 == 0) goto L26
            boolean r2 = r1 instanceof androidx.viewpager2.widget.ViewPager2
            if (r2 == 0) goto L1b
            r0.add(r1)
        L1b:
            android.view.ViewParent r1 = r1.getParent()
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L11
            android.view.View r1 = (android.view.View) r1
            goto L12
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.base.shopapp.customviews.NestedScrollableHost.getAncestorViewPagers():java.util.List");
    }

    private final Sequence<View> getChildren() {
        View childAt = getChildAt(0);
        Intrinsics.f(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        return new ViewGroupKt$children$1((ViewGroup) childAt);
    }

    public final boolean a(float f, int i) {
        int i2 = -((int) Math.signum(f));
        if (i == 0) {
            Iterator it = getChildren().iterator();
            while (it.hasNext()) {
                if (((View) it.next()).canScrollHorizontally(i2)) {
                    return true;
                }
            }
            return false;
        }
        if (i != 1) {
            throw new IllegalArgumentException(YU.a.d(i, "Unknown orientation: "));
        }
        Iterator it2 = getChildren().iterator();
        while (it2.hasNext()) {
            if (((View) it2.next()).canScrollVertically(i2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent e) {
        Intrinsics.h(e, "e");
        Iterator<ViewPager2> it = getAncestorViewPagers().iterator();
        while (it.hasNext()) {
            int orientation = it.next().getOrientation();
            if (a(-1.0f, orientation) || a(1.0f, orientation)) {
                if (e.getAction() == 0) {
                    this.e = e.getX();
                    this.f = e.getY();
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else if (e.getAction() == 2) {
                    float x = e.getX() - this.e;
                    float y = e.getY() - this.f;
                    boolean z = orientation == 0;
                    float fAbs = Math.abs(x) * (z ? 0.5f : 1.0f);
                    float fAbs2 = Math.abs(y) * (z ? 1.0f : 0.5f);
                    float f = this.d;
                    if (fAbs > f || fAbs2 > f) {
                        if (z == (fAbs2 > fAbs)) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        } else {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.h(context, "context");
        this.d = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
