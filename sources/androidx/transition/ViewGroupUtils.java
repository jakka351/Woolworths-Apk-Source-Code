package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class ViewGroupUtils {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3799a = true;
    public static Method b;
    public static boolean c;

    @RequiresApi
    public static class Api29Impl {
        public static int a(ViewGroup viewGroup, int i) {
            return viewGroup.getChildDrawingOrder(i);
        }

        public static void b(ViewGroup viewGroup, boolean z) {
            viewGroup.suppressLayout(z);
        }
    }

    public static void a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.b(viewGroup, z);
        } else if (f3799a) {
            try {
                Api29Impl.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f3799a = false;
            }
        }
    }
}
