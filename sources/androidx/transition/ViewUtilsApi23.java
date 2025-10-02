package androidx.transition;

import android.os.Build;
import android.view.View;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes2.dex */
class ViewUtilsApi23 extends ViewUtilsApi22 {
    public static boolean h = true;

    @RequiresApi
    public static class Api29Impl {
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void c(int i, View view) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.c(i, view);
        } else if (h) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }
}
