package androidx.transition;

import android.util.Log;
import android.view.View;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
class ViewUtilsApi19 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3801a = true;
    public static Field b;
    public static boolean c;

    @RequiresApi
    public static class Api29Impl {
    }

    public float a(View view) {
        if (f3801a) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f3801a = false;
            }
        }
        return view.getAlpha();
    }

    public void b(View view, float f) {
        if (f3801a) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f3801a = false;
            }
        }
        view.setAlpha(f);
    }

    public void c(int i, View view) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            c = true;
        }
        Field field = b;
        if (field != null) {
            try {
                b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
