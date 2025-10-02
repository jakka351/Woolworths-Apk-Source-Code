package androidx.viewpager2.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class ScrollEventAdapter extends RecyclerView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public ViewPager2.OnPageChangeCallback f3834a;
    public final ViewPager2 b;
    public final RecyclerView c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final ScrollEventValues g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    public static final class ScrollEventValues {

        /* renamed from: a, reason: collision with root package name */
        public int f3835a;
        public float b;
        public int c;
    }

    public ScrollEventAdapter(ViewPager2 viewPager2) {
        this.b = viewPager2;
        RecyclerView recyclerView = viewPager2.m;
        this.c = recyclerView;
        this.d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.g = new ScrollEventValues();
        f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void a(int i, RecyclerView recyclerView) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback;
        ViewPager2.OnPageChangeCallback onPageChangeCallback2;
        int i2 = this.e;
        if (!(i2 == 1 && this.f == 1) && i == 1) {
            this.e = 1;
            int i3 = this.i;
            if (i3 != -1) {
                this.h = i3;
                this.i = -1;
            } else if (this.h == -1) {
                this.h = this.d.b1();
            }
            e(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.k) {
                e(2);
                this.j = true;
                return;
            }
            return;
        }
        ScrollEventValues scrollEventValues = this.g;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            g();
            if (!this.k) {
                int i4 = scrollEventValues.f3835a;
                if (i4 != -1 && (onPageChangeCallback2 = this.f3834a) != null) {
                    onPageChangeCallback2.b(BitmapDescriptorFactory.HUE_RED, i4, 0);
                }
            } else if (scrollEventValues.c == 0) {
                int i5 = this.h;
                int i6 = scrollEventValues.f3835a;
                if (i5 != i6 && (onPageChangeCallback = this.f3834a) != null) {
                    onPageChangeCallback.c(i6);
                }
            }
            e(0);
            f();
        }
        if (this.e == 2 && i == 0 && this.l) {
            g();
            if (scrollEventValues.c == 0) {
                int i7 = this.i;
                int i8 = scrollEventValues.f3835a;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    ViewPager2.OnPageChangeCallback onPageChangeCallback3 = this.f3834a;
                    if (onPageChangeCallback3 != null) {
                        onPageChangeCallback3.c(i8);
                    }
                }
                e(0);
                f();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.k = r6
            r5.g()
            boolean r0 = r5.j
            r1 = -1
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r2 = r5.g
            r3 = 0
            if (r0 == 0) goto L39
            r5.j = r3
            if (r8 > 0) goto L21
            if (r8 != 0) goto L29
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.b
            boolean r8 = r8.b()
            if (r7 != r8) goto L29
        L21:
            int r7 = r2.c
            if (r7 == 0) goto L29
            int r7 = r2.f3835a
            int r7 = r7 + r6
            goto L2b
        L29:
            int r7 = r2.f3835a
        L2b:
            r5.i = r7
            int r8 = r5.h
            if (r8 == r7) goto L49
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r8 = r5.f3834a
            if (r8 == 0) goto L49
            r8.c(r7)
            goto L49
        L39:
            int r7 = r5.e
            if (r7 != 0) goto L49
            int r7 = r2.f3835a
            if (r7 != r1) goto L42
            r7 = r3
        L42:
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r8 = r5.f3834a
            if (r8 == 0) goto L49
            r8.c(r7)
        L49:
            int r7 = r2.f3835a
            if (r7 != r1) goto L4e
            r7 = r3
        L4e:
            float r8 = r2.b
            int r0 = r2.c
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r4 = r5.f3834a
            if (r4 == 0) goto L59
            r4.b(r8, r7, r0)
        L59:
            int r7 = r2.f3835a
            int r8 = r5.i
            if (r7 == r8) goto L61
            if (r8 != r1) goto L6f
        L61:
            int r7 = r2.c
            if (r7 != 0) goto L6f
            int r7 = r5.f
            if (r7 == r6) goto L6f
            r5.e(r3)
            r5.f()
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ScrollEventAdapter.d(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void e(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f3834a;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.a(i);
        }
    }

    public final void f() {
        this.e = 0;
        this.f = 0;
        ScrollEventValues scrollEventValues = this.g;
        scrollEventValues.f3835a = -1;
        scrollEventValues.b = BitmapDescriptorFactory.HUE_RED;
        scrollEventValues.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.l = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ScrollEventAdapter.g():void");
    }
}
