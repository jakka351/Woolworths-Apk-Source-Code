package androidx.compose.ui.semantics;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/ui/semantics/AccessibilityAction;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function;", "", "parentValue", "childValue", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsPropertiesKt$ActionPropertyKey$1 extends Lambda implements Function2<AccessibilityAction<Function<? extends Boolean>>, AccessibilityAction<Function<? extends Boolean>>, AccessibilityAction<Function<? extends Boolean>>> {
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 h = new SemanticsPropertiesKt$ActionPropertyKey$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        Function function;
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj2;
        if (accessibilityAction == null || (str = accessibilityAction.f2009a) == null) {
            str = accessibilityAction2.f2009a;
        }
        if (accessibilityAction == null || (function = accessibilityAction.b) == null) {
            function = accessibilityAction2.b;
        }
        return new AccessibilityAction(str, function);
    }
}
