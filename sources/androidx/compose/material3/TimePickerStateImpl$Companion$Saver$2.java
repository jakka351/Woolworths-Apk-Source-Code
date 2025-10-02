package androidx.compose.material3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/material3/TimePickerStateImpl;", "value", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TimePickerStateImpl$Companion$Saver$2 extends Lambda implements Function1<List, TimePickerStateImpl> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) obj3).intValue();
        Object obj4 = list.get(2);
        Intrinsics.f(obj4, "null cannot be cast to non-null type kotlin.Boolean");
        return new TimePickerStateImpl(iIntValue, iIntValue2, ((Boolean) obj4).booleanValue());
    }
}
