package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActions;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KeyboardActions {
    public static final KeyboardActions d = new KeyboardActions(null, null, null, 63);

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f1119a;
    public final Function1 b;
    public final Function1 c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActions$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public KeyboardActions(Function1 function1, Function1 function12, Function1 function13, int i) {
        function1 = (i & 1) != 0 ? null : function1;
        function12 = (i & 4) != 0 ? null : function12;
        function13 = (i & 16) != 0 ? null : function13;
        this.f1119a = function1;
        this.b = function12;
        this.c = function13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardActions)) {
            return false;
        }
        KeyboardActions keyboardActions = (KeyboardActions) obj;
        return this.f1119a == keyboardActions.f1119a && this.b == keyboardActions.b && this.c == keyboardActions.c;
    }

    public final int hashCode() {
        Function1 function1 = this.f1119a;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 961;
        Function1 function12 = this.b;
        int iHashCode2 = (iHashCode + (function12 != null ? function12.hashCode() : 0)) * 961;
        Function1 function13 = this.c;
        return (iHashCode2 + (function13 != null ? function13.hashCode() : 0)) * 31;
    }
}
