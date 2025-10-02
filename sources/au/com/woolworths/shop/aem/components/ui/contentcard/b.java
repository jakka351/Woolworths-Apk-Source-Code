package au.com.woolworths.shop.aem.components.ui.contentcard;

import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthContentCardData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ FullWidthContentCardData f;

    public /* synthetic */ b(Function1 function1, FullWidthContentCardData fullWidthContentCardData, int i) {
        this.d = i;
        this.e = function1;
        this.f = fullWidthContentCardData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke(this.f);
                break;
            default:
                this.e.invoke(this.f);
                break;
        }
        return Unit.f24250a;
    }
}
