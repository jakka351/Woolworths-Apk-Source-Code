package androidx.compose.material3.carousel;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/material3/carousel/CarouselState;", "it", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CarouselState$Companion$Saver$2 extends Lambda implements Function1<List, CarouselState> {
    public static final CarouselState$Companion$Saver$2 h = new CarouselState$Companion$Saver$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final List list = (List) obj;
        Object obj2 = list.get(0);
        Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.Float");
        return new CarouselState(iIntValue, ((Float) obj3).floatValue(), new Function0<Integer>() { // from class: androidx.compose.material3.carousel.CarouselState$Companion$Saver$2.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj4 = list.get(2);
                Intrinsics.f(obj4, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj4;
            }
        });
    }
}
