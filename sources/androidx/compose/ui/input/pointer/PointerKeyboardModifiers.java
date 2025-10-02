package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "", "packedValue", "", "Landroidx/compose/ui/input/pointer/NativePointerKeyboardModifiers;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class PointerKeyboardModifiers {

    /* renamed from: a, reason: collision with root package name */
    public final int f1862a;

    public final boolean equals(Object obj) {
        if (obj instanceof PointerKeyboardModifiers) {
            return this.f1862a == ((PointerKeyboardModifiers) obj).f1862a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1862a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f1862a + ')';
    }
}
