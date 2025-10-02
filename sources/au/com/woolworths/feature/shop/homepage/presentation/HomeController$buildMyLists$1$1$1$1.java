package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.feature.shop.homepage.data.MyShoppingListsData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class HomeController$buildMyLists$1$1$1$1 extends FunctionReferenceImpl implements Function1<MyShoppingListsData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MyShoppingListsData p0 = (MyShoppingListsData) obj;
        Intrinsics.h(p0, "p0");
        ((HomePageViewModel) this.receiver).H6(p0);
        return Unit.f24250a;
    }
}
