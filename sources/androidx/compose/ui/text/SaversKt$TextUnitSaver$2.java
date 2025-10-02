package androidx.compose.ui.text;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/TextUnit;", "it", "", "invoke-XNhUCwk"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SaversKt$TextUnitSaver$2 extends Lambda implements Function1<Object, TextUnit> {
    public static final SaversKt$TextUnitSaver$2 h = new SaversKt$TextUnitSaver$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (Intrinsics.c(obj, Boolean.FALSE)) {
            return new TextUnit(TextUnit.c);
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f = obj2 != null ? (Float) obj2 : null;
        Intrinsics.e(f);
        float fFloatValue = f.floatValue();
        Object obj3 = list.get(1);
        TextUnitType textUnitType = obj3 != null ? (TextUnitType) obj3 : null;
        Intrinsics.e(textUnitType);
        return new TextUnit(TextUnitKt.e(textUnitType.f2205a, fFloatValue));
    }
}
