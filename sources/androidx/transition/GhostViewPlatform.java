package androidx.transition;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

@RequiresApi
/* loaded from: classes2.dex */
class GhostViewPlatform implements GhostView {
    public static Class e;
    public static boolean f;
    public static Method g;
    public static boolean h;
    public static Method i;
    public static boolean j;
    public final View d;

    public GhostViewPlatform(View view) {
        this.d = view;
    }

    public static void b() {
        if (f) {
            return;
        }
        try {
            e = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e2) {
            Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e2);
        }
        f = true;
    }

    @Override // androidx.transition.GhostView
    public final void a(View view, ViewGroup viewGroup) {
    }

    @Override // androidx.transition.GhostView
    public final void setVisibility(int i2) {
        this.d.setVisibility(i2);
    }
}
