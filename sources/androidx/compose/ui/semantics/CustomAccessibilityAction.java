package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CustomAccessibilityAction {

    /* renamed from: a, reason: collision with root package name */
    public final String f2011a;
    public final Function0 b;

    public CustomAccessibilityAction(String str, Function0 function0) {
        this.f2011a = str;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAccessibilityAction)) {
            return false;
        }
        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) obj;
        return Intrinsics.c(this.f2011a, customAccessibilityAction.f2011a) && this.b == customAccessibilityAction.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2011a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.f2011a + ", action=" + this.b + ')';
    }
}
