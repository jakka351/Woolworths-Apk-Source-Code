package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SizeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final FillElement f977a;
    public static final FillElement b;
    public static final FillElement c;
    public static final WrapContentElement d;
    public static final WrapContentElement e;
    public static final WrapContentElement f;
    public static final WrapContentElement g;
    public static final WrapContentElement h;
    public static final WrapContentElement i;

    static {
        Direction direction = Direction.e;
        f977a = new FillElement(direction, 1.0f);
        Direction direction2 = Direction.d;
        b = new FillElement(direction2, 1.0f);
        Direction direction3 = Direction.f;
        c = new FillElement(direction3, 1.0f);
        BiasAlignment.Horizontal horizontal = Alignment.Companion.n;
        d = new WrapContentElement(direction, false, new WrapContentElement$Companion$width$1(horizontal), horizontal);
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.m;
        e = new WrapContentElement(direction, false, new WrapContentElement$Companion$width$1(horizontal2), horizontal2);
        BiasAlignment.Vertical vertical = Alignment.Companion.k;
        f = new WrapContentElement(direction2, false, new WrapContentElement$Companion$height$1(vertical), vertical);
        BiasAlignment.Vertical vertical2 = Alignment.Companion.j;
        g = new WrapContentElement(direction2, false, new WrapContentElement$Companion$height$1(vertical2), vertical2);
        BiasAlignment biasAlignment = Alignment.Companion.e;
        h = new WrapContentElement(direction3, false, new WrapContentElement$Companion$size$1(biasAlignment), biasAlignment);
        BiasAlignment biasAlignment2 = Alignment.Companion.f1719a;
        i = new WrapContentElement(direction3, false, new WrapContentElement$Companion$size$1(biasAlignment2), biasAlignment2);
    }

    public static final Modifier A(Modifier modifier, Alignment.Horizontal horizontal, boolean z) {
        return modifier.x0((!Intrinsics.c(horizontal, Alignment.Companion.n) || z) ? (!Intrinsics.c(horizontal, Alignment.Companion.m) || z) ? new WrapContentElement(Direction.e, z, new WrapContentElement$Companion$width$1(horizontal), horizontal) : e : d);
    }

    public static final Modifier a(Modifier modifier, float f2, float f3) {
        return modifier.x0(new UnspecifiedConstraintsElement(f2, f3));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(modifier, f2, f3);
    }

    public static final Modifier c(Modifier modifier, float f2) {
        return modifier.x0(f2 == 1.0f ? b : new FillElement(Direction.d, f2));
    }

    public static Modifier d(Modifier modifier) {
        return modifier.x0(c);
    }

    public static final Modifier e(Modifier modifier, float f2) {
        return modifier.x0(f2 == 1.0f ? f977a : new FillElement(Direction.e, f2));
    }

    public static final Modifier g(Modifier modifier, float f2) {
        return modifier.x0(new SizeElement(BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, f2, true, InspectableValueKt.a(), 5));
    }

    public static final Modifier h(Modifier modifier, float f2, float f3) {
        return modifier.x0(new SizeElement(BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, f3, true, InspectableValueKt.a(), 5));
    }

    public static /* synthetic */ Modifier i(Modifier modifier, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return h(modifier, f2, f3);
    }

    public static final Modifier j(Modifier modifier, float f2) {
        return modifier.x0(new SizeElement(BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, f2, false, InspectableValueKt.a(), 5));
    }

    public static final Modifier k(Modifier modifier, float f2) {
        return modifier.x0(new SizeElement(f2, f2, f2, f2, false, InspectableValueKt.a()));
    }

    public static final Modifier l(Modifier modifier, float f2, float f3) {
        return modifier.x0(new SizeElement(f2, f3, f2, f3, false, InspectableValueKt.a()));
    }

    public static final Modifier m(Modifier modifier, float f2, float f3, float f4, float f5) {
        return modifier.x0(new SizeElement(f2, f3, f4, f5, false, InspectableValueKt.a()));
    }

    public static /* synthetic */ Modifier n(Modifier modifier, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 8) != 0) {
            f5 = Float.NaN;
        }
        return m(modifier, f2, f3, f4, f5);
    }

    public static final Modifier o(Modifier modifier, float f2) {
        return modifier.x0(new SizeElement(f2, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, false, InspectableValueKt.a(), 10));
    }

    public static Modifier p(Modifier modifier, float f2) {
        return modifier.x0(new SizeElement(f2, BitmapDescriptorFactory.HUE_RED, Float.NaN, BitmapDescriptorFactory.HUE_RED, false, InspectableValueKt.a(), 10));
    }

    public static final Modifier q(Modifier modifier, float f2) {
        return modifier.x0(new SizeElement(f2, f2, f2, f2, true, InspectableValueKt.a()));
    }

    public static final Modifier r(Modifier modifier, float f2, float f3) {
        return modifier.x0(new SizeElement(f2, f3, f2, f3, true, InspectableValueKt.a()));
    }

    public static final Modifier s(Modifier modifier, float f2, float f3, float f4, float f5) {
        return modifier.x0(new SizeElement(f2, f3, f4, f5, true, InspectableValueKt.a()));
    }

    public static /* synthetic */ Modifier t(Modifier modifier, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 8) != 0) {
            f5 = Float.NaN;
        }
        return s(modifier, f2, f3, f4, f5);
    }

    public static final Modifier u(Modifier modifier, float f2) {
        return modifier.x0(new SizeElement(f2, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, true, InspectableValueKt.a(), 10));
    }

    public static final Modifier v(Modifier modifier, float f2, float f3) {
        return modifier.x0(new SizeElement(f2, BitmapDescriptorFactory.HUE_RED, f3, BitmapDescriptorFactory.HUE_RED, true, InspectableValueKt.a(), 10));
    }

    public static /* synthetic */ Modifier w(Modifier modifier, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return v(modifier, f2, f3);
    }

    public static final Modifier x(Modifier modifier, Alignment.Vertical vertical, boolean z) {
        return modifier.x0((!Intrinsics.c(vertical, Alignment.Companion.k) || z) ? (!Intrinsics.c(vertical, Alignment.Companion.j) || z) ? new WrapContentElement(Direction.d, z, new WrapContentElement$Companion$height$1(vertical), vertical) : g : f);
    }

    public static Modifier z(Modifier modifier, BiasAlignment biasAlignment, int i2) {
        int i3 = i2 & 1;
        BiasAlignment biasAlignment2 = Alignment.Companion.e;
        if (i3 != 0) {
            biasAlignment = biasAlignment2;
        }
        return modifier.x0(biasAlignment.equals(biasAlignment2) ? h : biasAlignment.equals(Alignment.Companion.f1719a) ? i : new WrapContentElement(Direction.f, false, new WrapContentElement$Companion$size$1(biasAlignment), biasAlignment));
    }
}
