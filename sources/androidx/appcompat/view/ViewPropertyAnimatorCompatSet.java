package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

@RestrictTo
/* loaded from: classes2.dex */
public class ViewPropertyAnimatorCompatSet {
    public Interpolator c;
    public ViewPropertyAnimatorListener d;
    public boolean e;
    public long b = -1;
    public final ViewPropertyAnimatorListenerAdapter f = new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.view.ViewPropertyAnimatorCompatSet.1

        /* renamed from: a, reason: collision with root package name */
        public boolean f130a = false;
        public int b = 0;

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void d() {
            int i = this.b + 1;
            this.b = i;
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = ViewPropertyAnimatorCompatSet.this;
            if (i == viewPropertyAnimatorCompatSet.f129a.size()) {
                ViewPropertyAnimatorListener viewPropertyAnimatorListener = viewPropertyAnimatorCompatSet.d;
                if (viewPropertyAnimatorListener != null) {
                    viewPropertyAnimatorListener.d();
                }
                this.b = 0;
                this.f130a = false;
                viewPropertyAnimatorCompatSet.e = false;
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void e() {
            if (this.f130a) {
                return;
            }
            this.f130a = true;
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = ViewPropertyAnimatorCompatSet.this.d;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.e();
            }
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f129a = new ArrayList();

    public final void a() {
        if (this.e) {
            Iterator it = this.f129a.iterator();
            while (it.hasNext()) {
                ((ViewPropertyAnimatorCompat) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        Iterator it = this.f129a.iterator();
        while (it.hasNext()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) it.next();
            long j = this.b;
            if (j >= 0) {
                viewPropertyAnimatorCompat.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) viewPropertyAnimatorCompat.f2494a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                viewPropertyAnimatorCompat.d(this.f);
            }
            View view2 = (View) viewPropertyAnimatorCompat.f2494a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
