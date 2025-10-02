package au.com.woolworths.shop.lists.ui.utils;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/utils/InsetsWithKeyboardCallback;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InsetsWithKeyboardCallback extends WindowInsetsAnimationCompat.Callback implements OnApplyWindowInsetsListener {
    public final Window f;
    public boolean g;
    public View h;
    public WindowInsetsCompat i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsetsWithKeyboardCallback(Window window, View root) {
        super(1);
        Intrinsics.h(root, "root");
        this.f = window;
        if (Build.VERSION.SDK_INT <= 29) {
            window.setSoftInputMode(16);
        }
        ViewCompat.I(root, this);
        ViewCompat.P(root, this);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void a(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        View view;
        if (!this.g || (windowInsetsAnimationCompat.d() & 8) == 0) {
            return;
        }
        this.g = false;
        WindowInsetsCompat windowInsetsCompat = this.i;
        if (windowInsetsCompat == null || (view = this.h) == null) {
            return;
        }
        Intrinsics.e(windowInsetsCompat);
        ViewCompat.d(view, windowInsetsCompat);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void b(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        if ((windowInsetsAnimationCompat.d() & 8) != 0) {
            this.g = true;
        }
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsCompat c(WindowInsetsCompat insets, List runningAnimations) {
        Intrinsics.h(insets, "insets");
        Intrinsics.h(runningAnimations, "runningAnimations");
        return insets;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.h(v, "v");
        this.h = v;
        this.i = windowInsetsCompat;
        Insets insetsE = windowInsetsCompat.e(this.g ? 519 : 527);
        Intrinsics.g(insetsE, "getInsets(...)");
        v.setPadding(insetsE.f2430a, insetsE.b, insetsE.c, insetsE.d);
        WindowInsetsCompat CONSUMED = WindowInsetsCompat.b;
        Intrinsics.g(CONSUMED, "CONSUMED");
        return CONSUMED;
    }
}
