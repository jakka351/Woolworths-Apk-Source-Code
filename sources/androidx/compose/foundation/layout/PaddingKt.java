package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PaddingKt {
    public static PaddingValuesImpl a(float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return new PaddingValuesImpl(f, f2, f, f2);
    }

    public static PaddingValuesImpl b(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return new PaddingValuesImpl(f, f2, f3, f4);
    }

    public static final float c(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.d ? paddingValues.c(layoutDirection) : paddingValues.b(layoutDirection);
    }

    public static final float d(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.d ? paddingValues.b(layoutDirection) : paddingValues.c(layoutDirection);
    }

    public static final Modifier e(Modifier modifier, final PaddingValues paddingValues) {
        return modifier.x0(new PaddingValuesElement(paddingValues, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((InspectorInfo) obj).getClass();
                throw null;
            }
        }));
    }

    public static final Modifier f(Modifier modifier, final float f) {
        return modifier.x0(new PaddingElement(f, f, f, f, new Function1<InspectorInfo, Unit>(f) { // from class: androidx.compose.foundation.layout.PaddingKt$padding$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((InspectorInfo) obj).getClass();
                return Unit.f24250a;
            }
        }));
    }

    public static final Modifier g(Modifier modifier, float f, float f2) {
        return modifier.x0(new PaddingElement(f, f2, f, f2, new PaddingKt$padding$2(1)));
    }

    public static Modifier h(Modifier modifier, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return g(modifier, f, f2);
    }

    public static final Modifier i(Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        return modifier.x0(new PaddingElement(f, f2, f3, f4, new Function1<InspectorInfo, Unit>(f, f2, f3, f4) { // from class: androidx.compose.foundation.layout.PaddingKt$padding$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((InspectorInfo) obj).getClass();
                throw null;
            }
        }));
    }

    public static Modifier j(Modifier modifier, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return i(modifier, f, f2, f3, f4);
    }
}
