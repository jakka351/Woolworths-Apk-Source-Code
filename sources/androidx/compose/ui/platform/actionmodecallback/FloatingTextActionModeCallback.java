package androidx.compose.ui.platform.actionmodecallback;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;", "Landroid/view/ActionMode$Callback2;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FloatingTextActionModeCallback extends ActionMode.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final TextActionModeCallback f1995a;

    public FloatingTextActionModeCallback(TextActionModeCallback textActionModeCallback) {
        this.f1995a = textActionModeCallback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        TextActionModeCallback textActionModeCallback = this.f1995a;
        textActionModeCallback.getClass();
        Intrinsics.e(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.f.getD()) {
            Function0 function0 = textActionModeCallback.c;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == MenuItemOption.g.getD()) {
            Function0 function02 = textActionModeCallback.d;
            if (function02 != null) {
                function02.invoke();
            }
        } else if (itemId == MenuItemOption.h.getD()) {
            Function0 function03 = textActionModeCallback.e;
            if (function03 != null) {
                function03.invoke();
            }
        } else if (itemId == MenuItemOption.i.getD()) {
            Function0 function04 = textActionModeCallback.f;
            if (function04 != null) {
                function04.invoke();
            }
        } else {
            if (itemId != MenuItemOption.j.getD()) {
                return false;
            }
            Function0 function05 = textActionModeCallback.g;
            if (function05 != null) {
                function05.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        TextActionModeCallback textActionModeCallback = this.f1995a;
        textActionModeCallback.getClass();
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (textActionModeCallback.c != null) {
            TextActionModeCallback.a(menu, MenuItemOption.f);
        }
        if (textActionModeCallback.d != null) {
            TextActionModeCallback.a(menu, MenuItemOption.g);
        }
        if (textActionModeCallback.e != null) {
            TextActionModeCallback.a(menu, MenuItemOption.h);
        }
        if (textActionModeCallback.f != null) {
            TextActionModeCallback.a(menu, MenuItemOption.i);
        }
        if (textActionModeCallback.g == null) {
            return true;
        }
        TextActionModeCallback.a(menu, MenuItemOption.j);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f1995a.f1996a.invoke();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        androidx.compose.ui.geometry.Rect rect2 = this.f1995a.b;
        if (rect != null) {
            rect.set((int) rect2.f1752a, (int) rect2.b, (int) rect2.c, (int) rect2.d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        TextActionModeCallback textActionModeCallback = this.f1995a;
        textActionModeCallback.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        TextActionModeCallback.b(menu, MenuItemOption.f, textActionModeCallback.c);
        TextActionModeCallback.b(menu, MenuItemOption.g, textActionModeCallback.d);
        TextActionModeCallback.b(menu, MenuItemOption.h, textActionModeCallback.e);
        TextActionModeCallback.b(menu, MenuItemOption.i, textActionModeCallback.f);
        TextActionModeCallback.b(menu, MenuItemOption.j, textActionModeCallback.g);
        return true;
    }
}
