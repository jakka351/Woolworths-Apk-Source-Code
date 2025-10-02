package androidx.viewpager2.widget;

import android.view.View;
import androidx.camera.core.impl.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.medallia.digital.mobilesdk.q2;
import java.util.Locale;

/* loaded from: classes2.dex */
final class PageTransformerAdapter extends ViewPager2.OnPageChangeCallback {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayoutManager f3833a;
    public ViewPager2.PageTransformer b;

    public PageTransformerAdapter(LinearLayoutManager linearLayoutManager) {
        this.f3833a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void a(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void b(float f, int i, int i2) {
        if (this.b == null) {
            return;
        }
        float f2 = -f;
        int i3 = 0;
        while (true) {
            LinearLayoutManager linearLayoutManager = this.f3833a;
            if (i3 >= linearLayoutManager.z()) {
                return;
            }
            View viewY = linearLayoutManager.y(i3);
            if (viewY == null) {
                Locale locale = Locale.US;
                throw new IllegalStateException(b.j(i3, linearLayoutManager.z(), "LayoutManager returned a null child at pos ", q2.c, " while transforming pages"));
            }
            this.b.a(viewY, (RecyclerView.LayoutManager.O(viewY) - i) + f2);
            i3++;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void c(int i) {
    }
}
