package au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem;

import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    public /* synthetic */ a(Function1 function1, String str, String str2, int i) {
        this.d = i;
        this.e = function1;
        this.f = str;
        this.g = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                this.e.invoke(new WPayForOrderContract.UiEvent.GiftCard.Check(this.f, this.g, ((Boolean) obj).booleanValue()));
                break;
            default:
                String newValue = (String) obj;
                Intrinsics.h(newValue, "newValue");
                this.e.invoke(new WPayForOrderContract.UiEvent.GiftCard.Update(this.f, newValue, this.g));
                break;
        }
        return Unit.f24250a;
    }
}
