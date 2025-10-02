package androidx.compose.ui.window;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/window/PopupProperties;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PopupProperties {

    /* renamed from: a, reason: collision with root package name */
    public final int f2222a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public PopupProperties(boolean z, int i) {
        this((i & 1) != 0 ? false : z, SecureFlagPolicy.d, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupProperties)) {
            return false;
        }
        PopupProperties popupProperties = (PopupProperties) obj;
        return this.f2222a == popupProperties.f2222a && this.b == popupProperties.b && this.c == popupProperties.c && this.d == popupProperties.d && this.e == popupProperties.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + b.e(b.e(b.e(b.e(this.f2222a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public PopupProperties(boolean z, SecureFlagPolicy secureFlagPolicy, boolean z2) {
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AndroidPopup_androidKt.f2215a;
        int i = !z ? 262152 : 262144;
        i = secureFlagPolicy == SecureFlagPolicy.e ? i | 8192 : i;
        i = z2 ? i : i | 512;
        boolean z3 = secureFlagPolicy == SecureFlagPolicy.d;
        this.f2222a = i;
        this.b = z3;
        this.c = true;
        this.d = true;
        this.e = true;
    }
}
