package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccessibilityAction<T extends Function<? extends Boolean>> {

    /* renamed from: a, reason: collision with root package name */
    public final String f2009a;
    public final Function b;

    public AccessibilityAction(String str, Function function) {
        this.f2009a = str;
        this.b = function;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        return Intrinsics.c(this.f2009a, accessibilityAction.f2009a) && Intrinsics.c(this.b, accessibilityAction.b);
    }

    public final int hashCode() {
        String str = this.f2009a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Function function = this.b;
        return iHashCode + (function != null ? function.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f2009a + ", action=" + this.b + ')';
    }
}
