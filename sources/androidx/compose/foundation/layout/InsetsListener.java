package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/InsetsListener;", "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;", "Ljava/lang/Runnable;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroid/view/View$OnAttachStateChangeListener;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class InsetsListener extends WindowInsetsAnimationCompat.Callback implements Runnable, OnApplyWindowInsetsListener, View.OnAttachStateChangeListener {
    public final WindowInsetsHolder f;
    public boolean g;
    public boolean h;
    public WindowInsetsCompat i;

    public InsetsListener(WindowInsetsHolder windowInsetsHolder) {
        super(!windowInsetsHolder.u ? 1 : 0);
        this.f = windowInsetsHolder;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void a(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.g = false;
        this.h = false;
        WindowInsetsCompat windowInsetsCompat = this.i;
        if (windowInsetsAnimationCompat.b() != 0 && windowInsetsCompat != null) {
            WindowInsetsHolder windowInsetsHolder = this.f;
            windowInsetsHolder.t.f(WindowInsets_androidKt.d(windowInsetsCompat.e(8)));
            windowInsetsHolder.s.f(WindowInsets_androidKt.d(windowInsetsCompat.e(8)));
            WindowInsetsHolder.a(windowInsetsHolder, windowInsetsCompat);
        }
        this.i = null;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void b(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.g = true;
        this.h = true;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsCompat c(WindowInsetsCompat windowInsetsCompat, List list) {
        WindowInsetsHolder windowInsetsHolder = this.f;
        WindowInsetsHolder.a(windowInsetsHolder, windowInsetsCompat);
        return windowInsetsHolder.u ? WindowInsetsCompat.b : windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsAnimationCompat.BoundsCompat d(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        this.g = false;
        return boundsCompat;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.i = windowInsetsCompat;
        WindowInsetsHolder windowInsetsHolder = this.f;
        windowInsetsHolder.s.f(WindowInsets_androidKt.d(windowInsetsCompat.e(8)));
        if (this.g) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.h) {
            windowInsetsHolder.t.f(WindowInsets_androidKt.d(windowInsetsCompat.e(8)));
            WindowInsetsHolder.a(windowInsetsHolder, windowInsetsCompat);
        }
        return windowInsetsHolder.u ? WindowInsetsCompat.b : windowInsetsCompat;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.g) {
            this.g = false;
            this.h = false;
            WindowInsetsCompat windowInsetsCompat = this.i;
            if (windowInsetsCompat != null) {
                WindowInsetsHolder windowInsetsHolder = this.f;
                windowInsetsHolder.t.f(WindowInsets_androidKt.d(windowInsetsCompat.e(8)));
                WindowInsetsHolder.a(windowInsetsHolder, windowInsetsCompat);
                this.i = null;
            }
        }
    }
}
