package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class OrientationHelper {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.LayoutManager f3680a;
    public int b = Integer.MIN_VALUE;
    public final Rect c = new Rect();

    /* renamed from: androidx.recyclerview.widget.OrientationHelper$1, reason: invalid class name */
    class AnonymousClass1 extends OrientationHelper {
        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int d(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.f3680a.getClass();
            return RecyclerView.LayoutManager.H(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.f3680a.getClass();
            return RecyclerView.LayoutManager.G(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.f3680a.getClass();
            return RecyclerView.LayoutManager.F(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int g(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.f3680a.getClass();
            return RecyclerView.LayoutManager.E(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int h() {
            return this.f3680a.n;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int i() {
            RecyclerView.LayoutManager layoutManager = this.f3680a;
            return layoutManager.n - layoutManager.M();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int j() {
            return this.f3680a.M();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int k() {
            return this.f3680a.l;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int l() {
            return this.f3680a.m;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int m() {
            return this.f3680a.L();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int n() {
            RecyclerView.LayoutManager layoutManager = this.f3680a;
            return (layoutManager.n - layoutManager.L()) - layoutManager.M();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int o(View view) {
            RecyclerView.LayoutManager layoutManager = this.f3680a;
            Rect rect = this.c;
            layoutManager.R(rect, view);
            return rect.right;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int p(View view) {
            RecyclerView.LayoutManager layoutManager = this.f3680a;
            Rect rect = this.c;
            layoutManager.R(rect, view);
            return rect.left;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final void q(int i) {
            this.f3680a.Z(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.OrientationHelper$2, reason: invalid class name */
    class AnonymousClass2 extends OrientationHelper {
        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int d(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.f3680a.getClass();
            return RecyclerView.LayoutManager.C(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.f3680a.getClass();
            return RecyclerView.LayoutManager.F(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.f3680a.getClass();
            return RecyclerView.LayoutManager.G(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int g(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.f3680a.getClass();
            return RecyclerView.LayoutManager.I(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int h() {
            return this.f3680a.o;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int i() {
            RecyclerView.LayoutManager layoutManager = this.f3680a;
            return layoutManager.o - layoutManager.K();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int j() {
            return this.f3680a.K();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int k() {
            return this.f3680a.m;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int l() {
            return this.f3680a.l;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int m() {
            return this.f3680a.N();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int n() {
            RecyclerView.LayoutManager layoutManager = this.f3680a;
            return (layoutManager.o - layoutManager.N()) - layoutManager.K();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int o(View view) {
            RecyclerView.LayoutManager layoutManager = this.f3680a;
            Rect rect = this.c;
            layoutManager.R(rect, view);
            return rect.bottom;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int p(View view) {
            RecyclerView.LayoutManager layoutManager = this.f3680a;
            Rect rect = this.c;
            layoutManager.R(rect, view);
            return rect.top;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final void q(int i) {
            this.f3680a.a0(i);
        }
    }

    public OrientationHelper(RecyclerView.LayoutManager layoutManager) {
        this.f3680a = layoutManager;
    }

    public static OrientationHelper a(RecyclerView.LayoutManager layoutManager) {
        return new AnonymousClass1(layoutManager);
    }

    public static OrientationHelper b(RecyclerView.LayoutManager layoutManager, int i) {
        if (i == 0) {
            return new AnonymousClass1(layoutManager);
        }
        if (i == 1) {
            return new AnonymousClass2(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static OrientationHelper c(RecyclerView.LayoutManager layoutManager) {
        return new AnonymousClass2(layoutManager);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View view);

    public abstract int p(View view);

    public abstract void q(int i);
}
