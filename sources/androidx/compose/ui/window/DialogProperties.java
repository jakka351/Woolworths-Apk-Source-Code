package androidx.compose.ui.window;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/window/DialogProperties;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DialogProperties {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2221a;
    public final boolean b;
    public final SecureFlagPolicy c;
    public final boolean d;
    public final boolean e;

    public DialogProperties(int i) {
        boolean z = (i & 4) != 0;
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.d;
        this.f2221a = true;
        this.b = true;
        this.c = secureFlagPolicy;
        this.d = z;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogProperties)) {
            return false;
        }
        DialogProperties dialogProperties = (DialogProperties) obj;
        return this.f2221a == dialogProperties.f2221a && this.b == dialogProperties.b && this.c == dialogProperties.c && this.d == dialogProperties.d && this.e == dialogProperties.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + b.e((this.c.hashCode() + b.e(Boolean.hashCode(this.f2221a) * 31, 31, this.b)) * 31, 31, this.d);
    }
}
