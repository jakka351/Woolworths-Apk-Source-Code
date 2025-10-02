package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/AndroidPointerIconType;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidPointerIconType implements PointerIcon {
    public final int b;

    public AndroidPointerIconType(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AndroidPointerIconType.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.b == ((AndroidPointerIconType) obj).b;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getB() {
        return this.b;
    }

    public final String toString() {
        return YU.a.l(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}
