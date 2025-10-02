package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Immutable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/BaselineShift;", "", "Companion", "multiplier", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class BaselineShift {

    /* renamed from: a, reason: collision with root package name */
    public final float f2148a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/BaselineShift$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BaselineShift) {
            return Float.compare(this.f2148a, ((BaselineShift) obj).f2148a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2148a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f2148a + ')';
    }
}
