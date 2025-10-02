package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FragmentPagerAdapter extends PagerAdapter {
    public Fragment f;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void e(ViewPager viewPager, Object obj) {
        throw null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void f() {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object h(ViewPager viewPager, int i) {
        throw null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean i(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void j(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable k() {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void l(Object obj) {
        Fragment fragment2 = (Fragment) obj;
        Fragment fragment3 = this.f;
        if (fragment2 != fragment3) {
            if (fragment3 != null) {
                fragment3.setMenuVisibility(false);
                this.f.setUserVisibleHint(false);
            }
            fragment2.setMenuVisibility(true);
            fragment2.setUserVisibleHint(true);
            this.f = fragment2;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void m(ViewPager viewPager) {
        if (viewPager.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
