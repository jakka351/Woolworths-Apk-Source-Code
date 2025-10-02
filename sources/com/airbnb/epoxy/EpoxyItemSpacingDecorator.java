package com.airbnb.epoxy;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class EpoxyItemSpacingDecorator extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    public int f13315a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        boolean z;
        boolean z2;
        rect.setEmpty();
        int iN = RecyclerView.N(view);
        if (iN == -1) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int i = recyclerView.getAdapter().i();
        this.d = iN == 0;
        int i2 = i - 1;
        this.e = iN == i2;
        this.c = layoutManager.g();
        this.b = layoutManager.h();
        boolean z3 = layoutManager instanceof GridLayoutManager;
        this.f = z3;
        if (z3) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.K;
            int iC = spanSizeLookup.c(iN);
            int i3 = gridLayoutManager.F;
            int iB = spanSizeLookup.b(iN, i3);
            this.g = iB == 0;
            this.h = iB + iC == i3;
            int i4 = 0;
            int iC2 = 0;
            while (true) {
                if (i4 > iN) {
                    z = true;
                    break;
                }
                iC2 += spanSizeLookup.c(i4);
                if (iC2 > i3) {
                    z = false;
                    break;
                }
                i4++;
            }
            this.i = z;
            if (z) {
                z2 = false;
                this.j = z2;
            } else {
                int iC3 = 0;
                while (i2 >= iN) {
                    iC3 += spanSizeLookup.c(i2);
                    if (iC3 > i3) {
                        z2 = false;
                        break;
                    }
                    i2--;
                }
                z2 = true;
                this.j = z2;
            }
        }
        boolean z4 = this.f;
        boolean z5 = !z4 ? !this.c || this.d : (!this.c || this.i) && (!this.b || this.g);
        boolean z6 = !z4 ? !this.c || this.e : (!this.c || this.j) && (!this.b || this.h);
        boolean z7 = !z4 ? !this.b || this.d : (!this.c || this.g) && (!this.b || this.i);
        boolean z8 = !z4 ? !this.b || this.e : (!this.c || this.h) && (!this.b || this.j);
        boolean z9 = this.c;
        boolean z10 = (layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).t;
        boolean z11 = layoutManager.b.getLayoutDirection() == 1;
        if (z9 && z11) {
            z10 = !z10;
        }
        if (!z10) {
            boolean z12 = z6;
            z6 = z5;
            z5 = z12;
        } else if (!this.c) {
            boolean z13 = z7;
            z7 = z8;
            z8 = z13;
            boolean z122 = z6;
            z6 = z5;
            z5 = z122;
        }
        int i5 = this.f13315a / 2;
        rect.right = z5 ? i5 : 0;
        rect.left = z6 ? i5 : 0;
        rect.top = z7 ? i5 : 0;
        rect.bottom = z8 ? i5 : 0;
    }
}
