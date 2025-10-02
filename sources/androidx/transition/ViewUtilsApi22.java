package androidx.transition;

import android.view.View;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes2.dex */
class ViewUtilsApi22 extends ViewUtilsApi21 {
    public static boolean g = true;

    @RequiresApi
    public static class Api29Impl {
    }

    public void g(View view, int i, int i2, int i3, int i4) {
        if (g) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }
}
