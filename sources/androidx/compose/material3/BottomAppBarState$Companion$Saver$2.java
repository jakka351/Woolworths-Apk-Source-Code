package androidx.compose.material3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/material3/BottomAppBarState;", "it", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BottomAppBarState$Companion$Saver$2 extends Lambda implements Function1<List<? extends Float>, BottomAppBarState> {
    public static final BottomAppBarState$Companion$Saver$2 h = new BottomAppBarState$Companion$Saver$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        float fFloatValue = ((Number) list.get(0)).floatValue();
        float fFloatValue2 = ((Number) list.get(1)).floatValue();
        float fFloatValue3 = ((Number) list.get(2)).floatValue();
        float f = AppBarKt.f1396a;
        return new BottomAppBarStateImpl(fFloatValue, fFloatValue2, fFloatValue3);
    }
}
