package androidx.compose.ui.window;

import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/window/PopupLayoutHelperImpl29;", "Landroidx/compose/ui/window/PopupLayoutHelperImpl;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PopupLayoutHelperImpl29 extends PopupLayoutHelperImpl {
    @Override // androidx.compose.ui.window.PopupLayoutHelperImpl, androidx.compose.ui.window.PopupLayoutHelper
    public final void a(PopupLayout popupLayout, int i, int i2) {
        popupLayout.setSystemGestureExclusionRects(CollectionsKt.Z(new Rect(0, 0, i, i2)));
    }
}
