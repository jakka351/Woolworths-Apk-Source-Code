package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.PlatformLocale_jvmKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/intl/Locale;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaversKt$LocaleSaver$1 extends Lambda implements Function2<SaverScope, Locale, Object> {
    public static final SaversKt$LocaleSaver$1 h = new SaversKt$LocaleSaver$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return PlatformLocale_jvmKt.a(((Locale) obj2).f2136a);
    }
}
