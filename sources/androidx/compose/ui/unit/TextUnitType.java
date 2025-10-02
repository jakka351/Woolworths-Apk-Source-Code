package androidx.compose.ui.unit;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/TextUnitType;", "", "Companion", "type", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class TextUnitType {

    /* renamed from: a, reason: collision with root package name */
    public final long f2205a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/TextUnitType$Companion;", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        return a(j, 0L) ? "Unspecified" : a(j, llqqqql.a00610061aaaa) ? "Sp" : a(j, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextUnitType) {
            return this.f2205a == ((TextUnitType) obj).f2205a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2205a);
    }

    public final String toString() {
        return b(this.f2205a);
    }
}
