package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/BoundsHelperApi16Impl;", "Landroidx/compose/ui/platform/BoundsHelper;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BoundsHelperApi16Impl implements BoundsHelper {
    @Override // androidx.compose.ui.platform.BoundsHelper
    public final Rect a(Activity activity) {
        int i;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Rect rect = new Rect();
        int i2 = point.x;
        if (i2 == 0 || (i = point.y) == 0) {
            defaultDisplay.getRectSize(rect);
            return rect;
        }
        rect.right = i2;
        rect.bottom = i;
        return rect;
    }
}
