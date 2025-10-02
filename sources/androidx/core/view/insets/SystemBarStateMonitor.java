package androidx.core.view.insets;

import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.insets.SystemBarStateMonitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
class SystemBarStateMonitor {

    /* renamed from: a, reason: collision with root package name */
    public final View f2522a;
    public final ArrayList b = new ArrayList();
    public Insets c;
    public Insets d;
    public int e;

    public interface Callback {
        void a(Insets insets, Insets insets2);

        void b();

        void c(int i);

        void d();

        void e();
    }

    public SystemBarStateMonitor(final ViewGroup viewGroup) {
        Insets insets = Insets.e;
        this.c = insets;
        this.d = insets;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        View view = new View(viewGroup.getContext()) { // from class: androidx.core.view.insets.SystemBarStateMonitor.1
            @Override // android.view.View
            public final void onConfigurationChanged(Configuration configuration) {
                Drawable background2 = viewGroup.getBackground();
                int color = background2 instanceof ColorDrawable ? ((ColorDrawable) background2).getColor() : 0;
                SystemBarStateMonitor systemBarStateMonitor = SystemBarStateMonitor.this;
                if (systemBarStateMonitor.e != color) {
                    systemBarStateMonitor.e = color;
                    for (int size = systemBarStateMonitor.b.size() - 1; size >= 0; size--) {
                        ((Callback) systemBarStateMonitor.b.get(size)).c(color);
                    }
                }
            }
        };
        this.f2522a = view;
        view.setWillNotDraw(true);
        ViewCompat.I(view, new OnApplyWindowInsetsListener() { // from class: androidx.core.view.insets.a
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                SystemBarStateMonitor systemBarStateMonitor = this.d;
                ArrayList arrayList = systemBarStateMonitor.b;
                Insets insetsB = Insets.b(windowInsetsCompat.e(519), windowInsetsCompat.e(64));
                Insets insetsB2 = Insets.b(windowInsetsCompat.f(519), windowInsetsCompat.f(64));
                if (!insetsB.equals(systemBarStateMonitor.c) || !insetsB2.equals(systemBarStateMonitor.d)) {
                    systemBarStateMonitor.c = insetsB;
                    systemBarStateMonitor.d = insetsB2;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((SystemBarStateMonitor.Callback) arrayList.get(size)).a(insetsB, insetsB2);
                    }
                }
                return windowInsetsCompat;
            }
        });
        ViewCompat.P(view, new WindowInsetsAnimationCompat.Callback() { // from class: androidx.core.view.insets.SystemBarStateMonitor.2
            public final HashMap f = new HashMap();

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public final void a(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
                ArrayList arrayList = SystemBarStateMonitor.this.b;
                if ((windowInsetsAnimationCompat.d() & 519) != 0) {
                    this.f.remove(windowInsetsAnimationCompat);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((Callback) arrayList.get(size)).d();
                    }
                }
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public final void b(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
                ArrayList arrayList = SystemBarStateMonitor.this.b;
                if ((windowInsetsAnimationCompat.d() & 519) != 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((Callback) arrayList.get(size)).e();
                    }
                }
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public final WindowInsetsCompat c(WindowInsetsCompat windowInsetsCompat, List list) {
                ArrayList arrayList = SystemBarStateMonitor.this.b;
                RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) list.get(size);
                    Integer num = (Integer) this.f.get(windowInsetsAnimationCompat);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        float fA = windowInsetsAnimationCompat.a();
                        if ((iIntValue & 1) != 0) {
                            rectF.left = fA;
                        }
                        if ((iIntValue & 2) != 0) {
                            rectF.top = fA;
                        }
                        if ((iIntValue & 4) != 0) {
                            rectF.right = fA;
                        }
                        if ((iIntValue & 8) != 0) {
                            rectF.bottom = fA;
                        }
                    }
                }
                Insets.b(windowInsetsCompat.e(519), windowInsetsCompat.e(64));
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((Callback) arrayList.get(size2)).b();
                }
                return windowInsetsCompat;
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public final WindowInsetsAnimationCompat.BoundsCompat d(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
                if ((windowInsetsAnimationCompat.d() & 519) != 0) {
                    Insets insets2 = boundsCompat.b;
                    Insets insets3 = boundsCompat.f2496a;
                    int i = insets2.f2430a != insets3.f2430a ? 1 : 0;
                    if (insets2.b != insets3.b) {
                        i |= 2;
                    }
                    if (insets2.c != insets3.c) {
                        i |= 4;
                    }
                    if (insets2.d != insets3.d) {
                        i |= 8;
                    }
                    this.f.put(windowInsetsAnimationCompat, Integer.valueOf(i));
                }
                return boundsCompat;
            }
        });
        viewGroup.addView(view, 0);
    }
}
