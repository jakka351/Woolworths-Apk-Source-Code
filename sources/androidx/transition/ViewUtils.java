package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* loaded from: classes2.dex */
class ViewUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewUtilsApi23 f3800a;
    public static final Property b;
    public static final Property c;

    /* renamed from: androidx.transition.ViewUtils$1, reason: invalid class name */
    public class AnonymousClass1 extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(ViewUtils.f3800a.a(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            ViewUtils.b(view, f.floatValue());
        }
    }

    /* renamed from: androidx.transition.ViewUtils$2, reason: invalid class name */
    public class AnonymousClass2 extends Property<View, Rect> {
        @Override // android.util.Property
        public final Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f3800a = new ViewUtilsApi29();
        } else {
            f3800a = new ViewUtilsApi23();
        }
        b = new AnonymousClass1(Float.class, "translationAlpha");
        c = new AnonymousClass2(Rect.class, "clipBounds");
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f3800a.g(view, i, i2, i3, i4);
    }

    public static void b(View view, float f) {
        f3800a.b(view, f);
    }

    public static void c(int i, View view) {
        f3800a.c(i, view);
    }
}
