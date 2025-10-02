package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "Companion", "packedValue", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TextUnit {
    public static final TextUnitType[] b = {new TextUnitType(0), new TextUnitType(llqqqql.a00610061aaaa), new TextUnitType(8589934592L)};
    public static final long c = TextUnitKt.e(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f2204a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].f2205a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final boolean d(long j) {
        return (j & 1095216660480L) == 8589934592L;
    }

    public static String e(long j) {
        long jB = b(j);
        if (TextUnitType.a(jB, 0L)) {
            return "Unspecified";
        }
        if (TextUnitType.a(jB, llqqqql.a00610061aaaa)) {
            return c(j) + ".sp";
        }
        if (!TextUnitType.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextUnit) {
            return this.f2204a == ((TextUnit) obj).f2204a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2204a);
    }

    public final String toString() {
        return e(this.f2204a);
    }
}
