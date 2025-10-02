package au.com.woolworths.shop.lists.ui.shoppinglist.utils;

import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003¨\u0006\u0004"}, d2 = {"au/com/woolworths/shop/lists/ui/shoppinglist/utils/QueueSimpleCoachMarkKt$queueSimpleCoachMark$showCoachMarkFunc$1$1", "Lkotlin/Function0;", "", "Lau/com/woolworths/android/onesite/modules/customviews/coachmark/CoachMarkDismissCallback;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QueueSimpleCoachMarkKt$queueSimpleCoachMark$showCoachMarkFunc$1$1 implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LinkedList linkedList = QueueSimpleCoachMarkKt.f12451a;
        linkedList.remove();
        Function0 function0 = (Function0) linkedList.peek();
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f24250a;
    }
}
