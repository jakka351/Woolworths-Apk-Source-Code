package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class DividerItemDecoration extends RecyclerView.ItemDecoration {
    public static final int[] d = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    public Drawable f3664a;
    public final int b;
    public final Rect c = new Rect();

    public DividerItemDecoration(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(d);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f3664a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        this.b = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Drawable drawable = this.f3664a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null || this.f3664a == null) {
            return;
        }
        int i = this.b;
        int i2 = 0;
        Rect rect = this.c;
        if (i == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i2 < childCount) {
                View childAt = recyclerView.getChildAt(i2);
                RecyclerView.Q(rect, childAt);
                int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.f3664a.setBounds(paddingLeft, iRound - this.f3664a.getIntrinsicHeight(), width, iRound);
                this.f3664a.draw(canvas);
                i2++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i2 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i2);
            recyclerView.getLayoutManager().D(rect, childAt2);
            int iRound2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.f3664a.setBounds(iRound2 - this.f3664a.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.f3664a.draw(canvas);
            i2++;
        }
        canvas.restore();
    }
}
