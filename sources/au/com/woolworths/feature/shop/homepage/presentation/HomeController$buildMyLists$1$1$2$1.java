package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.feature.shop.homepage.data.MyShoppingListItemData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class HomeController$buildMyLists$1$1$2$1 extends FunctionReferenceImpl implements Function1<MyShoppingListItemData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MyShoppingListItemData p0 = (MyShoppingListItemData) obj;
        Intrinsics.h(p0, "p0");
        ((HomePageViewModel) this.receiver).G6(p0);
        return Unit.f24250a;
    }
}
