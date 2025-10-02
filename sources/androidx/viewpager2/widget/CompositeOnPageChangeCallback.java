package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class CompositeOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3831a = new ArrayList(3);

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void a(int i) {
        try {
            Iterator it = this.f3831a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.OnPageChangeCallback) it.next()).a(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void b(float f, int i, int i2) {
        try {
            Iterator it = this.f3831a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.OnPageChangeCallback) it.next()).b(f, i, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void c(int i) {
        try {
            Iterator it = this.f3831a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.OnPageChangeCallback) it.next()).c(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
