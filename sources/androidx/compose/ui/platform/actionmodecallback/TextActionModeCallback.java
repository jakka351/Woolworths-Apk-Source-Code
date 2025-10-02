package androidx.compose.ui.platform.actionmodecallback;

import android.view.Menu;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TextActionModeCallback {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f1996a;
    public Rect b = Rect.e;
    public Function0 c = null;
    public Function0 d = null;
    public Function0 e = null;
    public Function0 f = null;
    public Function0 g = null;

    public TextActionModeCallback(Function0 function0) {
        this.f1996a = function0;
    }

    public static void a(Menu menu, MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getD(), menuItemOption.getE(), menuItemOption.b()).setShowAsAction(1);
    }

    public static void b(Menu menu, MenuItemOption menuItemOption, Function0 function0) {
        if (function0 != null && menu.findItem(menuItemOption.getD()) == null) {
            a(menu, menuItemOption);
        } else {
            if (function0 != null || menu.findItem(menuItemOption.getD()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getD());
        }
    }
}
