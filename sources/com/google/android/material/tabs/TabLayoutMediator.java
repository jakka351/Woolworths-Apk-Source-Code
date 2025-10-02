package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class TabLayoutMediator {

    /* renamed from: a, reason: collision with root package name */
    public final TabLayout f14663a;
    public final ViewPager2 b;
    public final TabConfigurationStrategy c;
    public RecyclerView.Adapter d;
    public boolean e;
    public TabLayout.OnTabSelectedListener f;

    public class PagerAdapterObserver extends RecyclerView.AdapterDataObserver {
        public PagerAdapterObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void a() {
            TabLayoutMediator.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void b(int i, int i2) {
            TabLayoutMediator.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void c(int i, int i2, Object obj) {
            TabLayoutMediator.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void d(int i, int i2) {
            TabLayoutMediator.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void e(int i, int i2) {
            TabLayoutMediator.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void f(int i, int i2) {
            TabLayoutMediator.this.b();
        }
    }

    public interface TabConfigurationStrategy {
        void c(TabLayout.Tab tab, int i);
    }

    public static class TabLayoutOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f14665a;
        public int c = 0;
        public int b = 0;

        public TabLayoutOnPageChangeCallback(TabLayout tabLayout) {
            this.f14665a = new WeakReference(tabLayout);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void a(int i) {
            this.b = this.c;
            this.c = i;
            TabLayout tabLayout = (TabLayout) this.f14665a.get();
            if (tabLayout != null) {
                tabLayout.a0 = this.c;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void b(float f, int i, int i2) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.f14665a.get();
            if (tabLayout != null) {
                int i3 = this.c;
                boolean z2 = true;
                if (i3 != 2 || this.b == 1) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                if (i3 == 2 && this.b == 0) {
                    z = false;
                }
                tabLayout.n(i, f, z2, z, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void c(int i) {
            TabLayout tabLayout = (TabLayout) this.f14665a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.c;
            tabLayout.l(tabLayout.h(i), i2 == 0 || (i2 == 2 && this.b == 0));
        }
    }

    public static class ViewPagerOnTabSelectedListener implements TabLayout.OnTabSelectedListener {

        /* renamed from: a, reason: collision with root package name */
        public final ViewPager2 f14666a;

        public ViewPagerOnTabSelectedListener(ViewPager2 viewPager2) {
            this.f14666a = viewPager2;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void a(TabLayout.Tab tab) {
            this.f14666a.e(tab.d, true);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void b(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void c(TabLayout.Tab tab) {
        }
    }

    public TabLayoutMediator(TabLayout tabLayout, ViewPager2 viewPager2, TabConfigurationStrategy tabConfigurationStrategy) {
        this.f14663a = tabLayout;
        this.b = viewPager2;
        this.c = tabConfigurationStrategy;
    }

    public final void a() {
        if (this.e) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        ViewPager2 viewPager2 = this.b;
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        this.d = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.e = true;
        TabLayout tabLayout = this.f14663a;
        viewPager2.c(new TabLayoutOnPageChangeCallback(tabLayout));
        ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(viewPager2);
        this.f = viewPagerOnTabSelectedListener;
        tabLayout.a(viewPagerOnTabSelectedListener);
        this.d.D(new PagerAdapterObserver());
        b();
        tabLayout.n(viewPager2.getCurrentItem(), BitmapDescriptorFactory.HUE_RED, true, true, true);
    }

    public final void b() {
        TabLayout tabLayout = this.f14663a;
        tabLayout.k();
        RecyclerView.Adapter adapter = this.d;
        if (adapter != null) {
            int i = adapter.i();
            for (int i2 = 0; i2 < i; i2++) {
                TabLayout.Tab tabI = tabLayout.i();
                this.c.c(tabI, i2);
                tabLayout.b(tabI, false);
            }
            if (i > 0) {
                int iMin = Math.min(this.b.getCurrentItem(), tabLayout.getTabCount() - 1);
                if (iMin != tabLayout.getSelectedTabPosition()) {
                    tabLayout.l(tabLayout.h(iMin), true);
                }
            }
        }
    }
}
