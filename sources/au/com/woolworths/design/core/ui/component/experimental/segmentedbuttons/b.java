package au.com.woolworths.design.core.ui.component.experimental.segmentedbuttons;

import au.com.woolworths.feature.shop.myorders.details.models.StarCount;
import au.com.woolworths.foundation.rewards.common.ui.buttons.FilterSelectorKt;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.RatingSubmissionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ b(int i, int i2, Function1 function1) {
        this.d = i2;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        int i2 = this.f;
        Function1 function1 = this.e;
        switch (i) {
            case 0:
                function1.invoke(Integer.valueOf(i2));
                break;
            case 1:
                StarCount.e.getClass();
                function1.invoke(StarCount.Companion.a(i2));
                break;
            case 2:
                function1.invoke(Integer.valueOf(i2));
                break;
            case 3:
                function1.invoke(Integer.valueOf(i2));
                break;
            case 4:
                float f = FilterSelectorKt.f8578a;
                function1.invoke(Integer.valueOf(i2));
                break;
            case 5:
                function1.invoke(Integer.valueOf(i2));
                break;
            default:
                int i3 = RatingSubmissionKt.b;
                function1.invoke(Integer.valueOf(i2));
                break;
        }
        return unit;
    }
}
