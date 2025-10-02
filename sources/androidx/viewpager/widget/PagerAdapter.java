package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class PagerAdapter {
    public final DataSetObservable d = new DataSetObservable();
    public DataSetObserver e;

    public void e(ViewPager viewPager, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void f() {
    }

    public abstract int g();

    public Object h(ViewPager viewPager, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public abstract boolean i(View view, Object obj);

    public void j(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable k() {
        return null;
    }

    public void l(Object obj) {
    }

    public void m(ViewPager viewPager) {
    }
}
