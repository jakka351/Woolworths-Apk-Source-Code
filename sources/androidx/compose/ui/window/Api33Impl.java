package androidx.compose.ui.window;

import android.window.OnBackInvokedDispatcher;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/window/Api33Impl;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class Api33Impl {
    public static final void a(PopupLayout popupLayout, a aVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (aVar == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = popupLayout.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, aVar);
    }

    public static final void b(PopupLayout popupLayout, a aVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (aVar == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = popupLayout.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(aVar);
    }
}
