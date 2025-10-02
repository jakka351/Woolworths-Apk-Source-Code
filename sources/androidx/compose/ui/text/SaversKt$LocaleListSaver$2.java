package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/intl/LocaleList;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SaversKt$LocaleListSaver$2 extends Lambda implements Function1<Object, LocaleList> {
    public static final SaversKt$LocaleListSaver$2 h = new SaversKt$LocaleListSaver$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.v;
            Locale locale = null;
            if ((!Intrinsics.c(obj2, Boolean.FALSE) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj2 != null) {
                locale = (Locale) saverKt$Saver$1.b.invoke(obj2);
            }
            Intrinsics.e(locale);
            arrayList.add(locale);
        }
        return new LocaleList(arrayList);
    }
}
