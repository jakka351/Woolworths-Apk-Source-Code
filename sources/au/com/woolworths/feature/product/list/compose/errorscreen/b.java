package au.com.woolworths.feature.product.list.compose.errorscreen;

import au.com.woolworths.feature.product.list.v2.ProductListUiEvent;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ String f;

    public /* synthetic */ b(Function1 function1, String str, int i) {
        this.d = i;
        this.e = function1;
        this.f = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ActionData it = (ActionData) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(it, "it");
                this.e.invoke(this.f);
                break;
            case 1:
                Intrinsics.h(it, "it");
                this.e.invoke(this.f);
                break;
            default:
                Intrinsics.h(it, "it");
                this.e.invoke(new ProductListUiEvent.OnChatEntryBannerClick(this.f));
                break;
        }
        return Unit.f24250a;
    }
}
