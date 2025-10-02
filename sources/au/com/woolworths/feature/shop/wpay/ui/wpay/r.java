package au.com.woolworths.feature.shop.wpay.ui.wpay;

import au.com.woolworths.feature.shop.wpay.ui.wpay.GiftCardEdit;
import java.util.function.BiFunction;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements BiFunction {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;

    public /* synthetic */ r(int i, Function2 function2) {
        this.d = i;
        this.e = function2;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return (GiftCardEdit.Linked) ((q) this.e).invoke(obj, obj2);
            case 1:
                return (GiftCardEdit.Unlinked) ((q) this.e).invoke(obj, obj2);
            case 2:
                return (GiftCardEdit.Linked) ((au.com.woolworths.design.core.ui.component.stable.corerow.impl.b) this.e).invoke(obj, obj2);
            case 3:
                return (GiftCardEdit.Unlinked) ((au.com.woolworths.design.core.ui.component.stable.corerow.impl.b) this.e).invoke(obj, obj2);
            case 4:
                return (GiftCardEdit.Linked) ((q) this.e).invoke(obj, obj2);
            case 5:
                return (GiftCardEdit.Unlinked) ((q) this.e).invoke(obj, obj2);
            case 6:
                return (GiftCardEdit.Linked) ((t) this.e).invoke(obj, obj2);
            default:
                return (GiftCardEdit.Unlinked) ((t) this.e).invoke(obj, obj2);
        }
    }
}
