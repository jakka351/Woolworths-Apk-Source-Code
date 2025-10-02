package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
class ViewBoundsCheck {

    /* renamed from: a, reason: collision with root package name */
    public final Callback f3705a;
    public final BoundFlags b;

    public static class BoundFlags {

        /* renamed from: a, reason: collision with root package name */
        public int f3706a;
        public int b;
        public int c;
        public int d;
        public int e;

        public final boolean a() {
            int i = this.f3706a;
            int i2 = 2;
            if ((i & 7) != 0) {
                int i3 = this.d;
                int i4 = this.b;
                if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 112) != 0) {
                int i5 = this.d;
                int i6 = this.c;
                if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 1792) != 0) {
                int i7 = this.e;
                int i8 = this.b;
                if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                    return false;
                }
            }
            if ((i & 28672) != 0) {
                int i9 = this.e;
                int i10 = this.c;
                if (i9 > i10) {
                    i2 = 1;
                } else if (i9 != i10) {
                    i2 = 4;
                }
                if ((i & (i2 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public interface Callback {
        int a();

        int b();

        View c(int i);

        int d(View view);

        int e(View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    public ViewBoundsCheck(Callback callback) {
        this.f3705a = callback;
        BoundFlags boundFlags = new BoundFlags();
        boundFlags.f3706a = 0;
        this.b = boundFlags;
    }

    public final View a(int i, int i2, int i3, int i4) {
        Callback callback = this.f3705a;
        int iA = callback.a();
        int iB = callback.b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewC = callback.c(i);
            int iD = callback.d(viewC);
            int iE = callback.e(viewC);
            BoundFlags boundFlags = this.b;
            boundFlags.b = iA;
            boundFlags.c = iB;
            boundFlags.d = iD;
            boundFlags.e = iE;
            if (i3 != 0) {
                boundFlags.f3706a = i3;
                if (boundFlags.a()) {
                    return viewC;
                }
            }
            if (i4 != 0) {
                boundFlags.f3706a = i4;
                if (boundFlags.a()) {
                    view = viewC;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean b(View view) {
        Callback callback = this.f3705a;
        int iA = callback.a();
        int iB = callback.b();
        int iD = callback.d(view);
        int iE = callback.e(view);
        BoundFlags boundFlags = this.b;
        boundFlags.b = iA;
        boundFlags.c = iB;
        boundFlags.d = iD;
        boundFlags.e = iE;
        boundFlags.f3706a = 24579;
        return boundFlags.a();
    }
}
