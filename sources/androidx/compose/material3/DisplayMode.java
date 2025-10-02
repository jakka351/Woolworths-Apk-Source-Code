package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/DisplayMode;", "", "Companion", "value", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@JvmInline
/* loaded from: classes2.dex */
public final class DisplayMode {

    /* renamed from: a, reason: collision with root package name */
    public final int f1438a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/DisplayMode$Companion;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DisplayMode) {
            return this.f1438a == ((DisplayMode) obj).f1438a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1438a);
    }

    public final String toString() {
        int i = this.f1438a;
        return i == 0 ? "Picker" : i == 1 ? "Input" : "Unknown";
    }
}
