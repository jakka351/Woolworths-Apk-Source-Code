package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0013\u0018\u00002\u00020\u0001J?\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/activity/EdgeToEdgeApi26;", "Landroidx/activity/EdgeToEdgeBase;", "Landroidx/activity/SystemBarStyle;", "statusBarStyle", "navigationBarStyle", "Landroid/view/Window;", "window", "Landroid/view/View;", "view", "", "statusBarIsDark", "navigationBarIsDark", "", "b", "(Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;Landroid/view/Window;Landroid/view/View;ZZ)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
class EdgeToEdgeApi26 extends EdgeToEdgeBase {
    @Override // androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void b(@NotNull SystemBarStyle statusBarStyle, @NotNull SystemBarStyle navigationBarStyle, @NotNull Window window, @NotNull View view, boolean statusBarIsDark, boolean navigationBarIsDark) {
        Intrinsics.h(statusBarStyle, "statusBarStyle");
        Intrinsics.h(navigationBarStyle, "navigationBarStyle");
        Intrinsics.h(window, "window");
        Intrinsics.h(view, "view");
        WindowCompat.b(window, false);
        window.setStatusBarColor(statusBarIsDark ? statusBarStyle.b : statusBarStyle.f59a);
        window.setNavigationBarColor(navigationBarIsDark ? navigationBarStyle.b : navigationBarStyle.f59a);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, view);
        windowInsetsControllerCompat.e(!statusBarIsDark);
        windowInsetsControllerCompat.d(!navigationBarIsDark);
    }
}
