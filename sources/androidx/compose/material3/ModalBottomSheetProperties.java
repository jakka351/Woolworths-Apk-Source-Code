package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.Metadata;

@Immutable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetProperties;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ModalBottomSheetProperties {

    /* renamed from: a, reason: collision with root package name */
    public final SecureFlagPolicy f1460a = SecureFlagPolicy.d;
    public final boolean b = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ModalBottomSheetProperties) {
            return this.f1460a == ((ModalBottomSheetProperties) obj).f1460a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f1460a.hashCode() * 31);
    }
}
