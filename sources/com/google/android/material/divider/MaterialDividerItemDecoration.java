package com.google.android.material.divider;

import YU.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;

/* loaded from: classes6.dex */
public class MaterialDividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    public final ShapeDrawable f14573a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Rect h = new Rect();

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        TypedArray typedArrayD = ThemeEnforcement.d(context, attributeSet, R.styleable.G, com.woolworths.R.attr.materialDividerStyle, com.woolworths.R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.c = MaterialResources.a(context, typedArrayD, 0).getDefaultColor();
        this.b = typedArrayD.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(com.woolworths.R.dimen.material_divider_thickness));
        this.e = typedArrayD.getDimensionPixelOffset(2, 0);
        this.f = typedArrayD.getDimensionPixelOffset(1, 0);
        this.g = typedArrayD.getBoolean(4, true);
        typedArrayD.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        int i2 = this.c;
        this.c = i2;
        this.f14573a = shapeDrawable;
        shapeDrawable.setTint(i2);
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.e(i, "Invalid orientation: ", ". It should be either HORIZONTAL or VERTICAL"));
        }
        this.d = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        if (i(view, recyclerView)) {
            int i = this.d;
            int i2 = this.b;
            if (i == 1) {
                rect.bottom = i2;
            } else if (ViewUtils.h(recyclerView)) {
                rect.left = i2;
            } else {
                rect.right = i2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int height;
        int paddingTop;
        int i;
        int i2;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        int i3 = this.d;
        int i4 = this.b;
        int i5 = 0;
        int i6 = this.f;
        int i7 = this.e;
        Rect rect = this.h;
        if (i3 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            boolean zH = ViewUtils.h(recyclerView);
            int i8 = paddingLeft + (zH ? i6 : i7);
            if (zH) {
                i6 = i7;
            }
            int i9 = width - i6;
            int childCount = recyclerView.getChildCount();
            while (i5 < childCount) {
                View childAt = recyclerView.getChildAt(i5);
                if (i(childAt, recyclerView)) {
                    recyclerView.getLayoutManager().D(rect, childAt);
                    int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                    this.f14573a.setBounds(i8, iRound - i4, i9, iRound);
                    this.f14573a.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                    this.f14573a.draw(canvas);
                }
                i5++;
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
        int i10 = paddingTop + i7;
        int i11 = height - i6;
        boolean zH2 = ViewUtils.h(recyclerView);
        int childCount2 = recyclerView.getChildCount();
        while (i5 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i5);
            if (i(childAt2, recyclerView)) {
                recyclerView.getLayoutManager().D(rect, childAt2);
                int iRound2 = Math.round(childAt2.getTranslationX());
                if (zH2) {
                    i2 = rect.left + iRound2;
                    i = i2 + i4;
                } else {
                    i = iRound2 + rect.right;
                    i2 = i - i4;
                }
                this.f14573a.setBounds(i2, i10, i, i11);
                this.f14573a.setAlpha(Math.round(childAt2.getAlpha() * 255.0f));
                this.f14573a.draw(canvas);
            }
            i5++;
        }
        canvas.restore();
    }

    public final boolean i(View view, RecyclerView recyclerView) {
        int iN = RecyclerView.N(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        return iN != -1 && (!(adapter != null && iN == adapter.i() - 1) || this.g);
    }
}
