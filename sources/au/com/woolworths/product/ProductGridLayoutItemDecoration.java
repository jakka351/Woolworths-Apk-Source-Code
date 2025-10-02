package au.com.woolworths.product;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/ProductGridLayoutItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Companion", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class ProductGridLayoutItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f9228a;
    public final int b;
    public final int c;
    public final Rect d = new Rect();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/product/ProductGridLayoutItemDecoration$Companion;", "", "", "HORIZONTAL", "I", "VERTICAL", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductGridLayoutItemDecoration(Drawable drawable, int i, int i2) {
        this.f9228a = drawable;
        this.b = i;
        this.c = i2;
    }

    public static boolean j(View view, RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int i = gridLayoutManager.F;
        int iN = RecyclerView.N(view);
        return gridLayoutManager.K.b(iN, i) + gridLayoutManager.K.c(iN) == i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void f(Rect outRect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.h(outRect, "outRect");
        Intrinsics.h(view, "view");
        Intrinsics.h(state, "state");
        int i = this.b;
        Drawable drawable = this.f9228a;
        if (i != 1) {
            outRect.set(0, 0, j(view, recyclerView) ? 0 : drawable.getIntrinsicWidth(), 0);
            return;
        }
        if (l(RecyclerView.N(view), recyclerView)) {
            outRect.top = drawable.getIntrinsicHeight();
        }
        if (k(RecyclerView.N(view), recyclerView)) {
            outRect.bottom = drawable.getIntrinsicHeight();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void g(Canvas c, RecyclerView recyclerView, RecyclerView.State state) {
        int iSave;
        Intrinsics.h(c, "c");
        Intrinsics.h(state, "state");
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        int i = this.b;
        Drawable drawable = this.f9228a;
        Rect rect = this.d;
        if (i != 1) {
            iSave = c.save();
            try {
                int childCount = recyclerView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    Intrinsics.e(childAt);
                    if (!j(childAt, recyclerView)) {
                        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                        Intrinsics.e(layoutManager);
                        layoutManager.D(rect, childAt);
                        int iB = rect.right + MathKt.b(childAt.getTranslationX());
                        drawable.setBounds(iB - drawable.getIntrinsicWidth(), rect.top + MathKt.b(childAt.getTranslationY()), iB, rect.bottom + MathKt.b(childAt.getTranslationY()));
                        drawable.draw(c);
                    }
                }
                return;
            } finally {
                c.restoreToCount(iSave);
            }
        }
        iSave = c.save();
        try {
            int childCount2 = recyclerView.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = recyclerView.getChildAt(i3);
                int iN = RecyclerView.N(childAt2);
                RecyclerView.Q(rect, childAt2);
                if (l(iN, recyclerView)) {
                    drawable.setBounds(i(childAt2, rect, true));
                    drawable.draw(c);
                }
                if (k(iN, recyclerView)) {
                    drawable.setBounds(i(childAt2, rect, false));
                    drawable.draw(c);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Rect i(View view, Rect rect, boolean z) {
        int iB;
        int intrinsicHeight;
        int iB2 = MathKt.b(view.getTranslationX()) + rect.left;
        int iB3 = MathKt.b(view.getTranslationX()) + rect.right;
        Drawable drawable = this.f9228a;
        if (z) {
            intrinsicHeight = MathKt.b(view.getTranslationY()) + rect.top;
            iB = drawable.getIntrinsicHeight() + intrinsicHeight;
        } else {
            iB = rect.bottom + MathKt.b(view.getTranslationY());
            intrinsicHeight = iB - drawable.getIntrinsicHeight();
        }
        return new Rect(iB2, intrinsicHeight, iB3, iB);
    }

    public boolean k(int i, RecyclerView recyclerView) {
        return true;
    }

    public boolean l(int i, RecyclerView recyclerView) {
        return i < this.c;
    }
}
