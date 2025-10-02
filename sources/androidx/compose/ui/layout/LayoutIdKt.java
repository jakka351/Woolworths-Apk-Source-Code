package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LayoutIdKt {
    public static final Object a(Measurable measurable) {
        Object objI = measurable.i();
        LayoutIdParentData layoutIdParentData = objI instanceof LayoutIdParentData ? (LayoutIdParentData) objI : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.A1();
        }
        return null;
    }

    public static final Modifier b(Modifier modifier, Object obj) {
        return modifier.x0(new LayoutIdElement(obj));
    }
}
