package au.com.woolworths.android.onesite.modules.customviews.itemdividers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/customviews/itemdividers/DefaultDividerItemDecoration;", "Landroidx/recyclerview/widget/DividerItemDecoration;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public class DefaultDividerItemDecoration extends DividerItemDecoration {
    public final int e;
    public Drawable f;
    public final Rect g;

    public DefaultDividerItemDecoration(Context context) {
        super(context);
        this.e = 1;
        Drawable drawable = context.getDrawable(R.drawable.default_horizontal_divider_deprecated);
        Intrinsics.e(drawable);
        this.f = drawable;
        this.g = new Rect();
    }

    @Override // androidx.recyclerview.widget.DividerItemDecoration, androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void f(Rect outRect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.h(outRect, "outRect");
        Intrinsics.h(view, "view");
        Intrinsics.h(state, "state");
        if (!i(view, recyclerView)) {
            outRect.setEmpty();
        } else if (this.e == 1) {
            outRect.bottom = this.f.getIntrinsicHeight();
        } else {
            outRect.right = this.f.getIntrinsicWidth();
        }
    }

    @Override // androidx.recyclerview.widget.DividerItemDecoration, androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void g(Canvas c, RecyclerView recyclerView, RecyclerView.State state) {
        int iSave;
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        Intrinsics.h(c, "c");
        Intrinsics.h(state, "state");
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        int i = this.e;
        int i2 = 0;
        Rect rect = this.g;
        if (i == 1) {
            iSave = c.save();
            try {
                if (recyclerView.getClipToPadding()) {
                    paddingLeft = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    c.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    paddingLeft = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i2 < childCount) {
                    View childAt = recyclerView.getChildAt(i2);
                    Intrinsics.e(childAt);
                    if (i(childAt, recyclerView)) {
                        RecyclerView.Q(rect, childAt);
                        int iB = rect.bottom + MathKt.b(childAt.getTranslationY());
                        this.f.setBounds(paddingLeft, iB - this.f.getIntrinsicHeight(), width, iB);
                        this.f.draw(c);
                    }
                    i2++;
                }
                c.restoreToCount(iSave);
                return;
            } finally {
            }
        }
        iSave = c.save();
        try {
            if (recyclerView.getClipToPadding()) {
                paddingTop = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                c.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            } else {
                height = recyclerView.getHeight();
                paddingTop = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i2 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i2);
                Intrinsics.e(childAt2);
                if (i(childAt2, recyclerView)) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    Intrinsics.e(layoutManager);
                    layoutManager.D(rect, childAt2);
                    int iRound = rect.right + Math.round(childAt2.getTranslationX());
                    this.f.setBounds(iRound - this.f.getIntrinsicWidth(), paddingTop, iRound, height);
                    this.f.draw(c);
                }
                i2++;
            }
            c.restoreToCount(iSave);
        } finally {
        }
    }

    public boolean i(View child, RecyclerView recyclerView) {
        Intrinsics.h(child, "child");
        return true;
    }
}
