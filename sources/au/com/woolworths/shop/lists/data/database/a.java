package au.com.woolworths.shop.lists.data.database;

import androidx.collection.ArrayMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ShoppingListDao_Impl e;

    public /* synthetic */ a(ShoppingListDao_Impl shoppingListDao_Impl, int i) {
        this.d = i;
        this.e = shoppingListDao_Impl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayMap it = (ArrayMap) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(it, "it");
                this.e.o(it);
                break;
            default:
                Intrinsics.h(it, "it");
                this.e.p(it);
                break;
        }
        return Unit.f24250a;
    }
}
