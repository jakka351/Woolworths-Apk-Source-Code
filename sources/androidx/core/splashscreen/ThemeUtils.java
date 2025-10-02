package androidx.core.splashscreen;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/core/splashscreen/ThemeUtils;", "", "Api31", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ThemeUtils {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J-\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/core/splashscreen/ThemeUtils$Api31;", "", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "Landroid/view/View;", "decor", "Landroid/util/TypedValue;", "tv", "", "b", "(Landroid/content/res/Resources$Theme;Landroid/view/View;Landroid/util/TypedValue;)V", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Api31 {
        @JvmStatic
        @JvmOverloads
        @DoNotInline
        public static final void a(@NotNull Resources.Theme theme, @NotNull View decor) {
            Intrinsics.h(theme, "theme");
            Intrinsics.h(decor, "decor");
            b(theme, decor, new TypedValue());
        }

        @JvmStatic
        @JvmOverloads
        @DoNotInline
        public static final void b(@NotNull Resources.Theme theme, @NotNull View decor, @NotNull TypedValue tv) {
            Intrinsics.h(theme, "theme");
            Intrinsics.h(decor, "decor");
            Intrinsics.h(tv, "tv");
            int i = (!theme.resolveAttribute(android.R.attr.windowLightStatusBar, tv, true) || tv.data == 0) ? 0 : 8;
            if (theme.resolveAttribute(android.R.attr.windowLightNavigationBar, tv, true) && tv.data != 0) {
                i |= 16;
            }
            WindowInsetsController windowInsetsController = decor.getWindowInsetsController();
            Intrinsics.e(windowInsetsController);
            windowInsetsController.setSystemBarsAppearance(i, 24);
        }
    }
}
