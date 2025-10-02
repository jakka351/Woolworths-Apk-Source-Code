package androidx.transition;

import android.graphics.Canvas;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class CanvasUtils {

    /* renamed from: a, reason: collision with root package name */
    public static Method f3778a;
    public static Method b;
    public static boolean c;

    @RequiresApi
    public static class Api29Impl {
        public static void a(Canvas canvas) {
            canvas.disableZ();
        }

        public static void b(Canvas canvas) {
            canvas.enableZ();
        }
    }

    public static void a(Canvas canvas, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                Api29Impl.b(canvas);
                return;
            } else {
                Api29Impl.a(canvas);
                return;
            }
        }
        if (i == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                f3778a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            c = true;
        }
        if (z) {
            try {
                Method method2 = f3778a;
                if (method2 != null) {
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        if (z || (method = b) == null) {
            return;
        }
        method.invoke(canvas, null);
    }
}
