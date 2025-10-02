package au.com.woolworths.feature.product.list.compose;

import android.os.Parcelable;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import au.com.woolworths.feature.product.list.data.IngredientCardApiData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.shop.cart.domain.model.OfferProductList;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Function h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ Object j;

    public /* synthetic */ e(Parcelable parcelable, SnapshotStateMap snapshotStateMap, Function1 function1, ProductCardConfig productCardConfig, Function2 function2, Function1 function12, int i) {
        this.d = i;
        this.j = parcelable;
        this.e = snapshotStateMap;
        this.f = function1;
        this.g = productCardConfig;
        this.h = function2;
        this.i = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                final IngredientCardApiData ingredientCardApiData = (IngredientCardApiData) this.j;
                final SnapshotStateMap snapshotStateMap = (SnapshotStateMap) this.e;
                final ProductCardConfig productCardConfig = (ProductCardConfig) this.g;
                final Function2 function2 = (Function2) this.h;
                LazyGridScope LazyVerticalGrid = (LazyGridScope) obj;
                Intrinsics.h(LazyVerticalGrid, "$this$LazyVerticalGrid");
                final List<ProductCard> alternativeProducts = ingredientCardApiData.getAlternativeProducts();
                int size = alternativeProducts.size();
                Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.product.list.compose.AlternativeProductsPageKt$AlternativeProductsGrid$lambda$7$lambda$6$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        alternativeProducts.get(((Number) obj2).intValue());
                        return null;
                    }
                };
                final Function1 function12 = this.f;
                final Function1 function13 = this.i;
                LazyVerticalGrid.d(size, null, null, function1, new ComposableLambdaImpl(new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.AlternativeProductsPageKt$AlternativeProductsGrid$lambda$7$lambda$6$$inlined$itemsIndexed$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
                    @Override // kotlin.jvm.functions.Function4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
                        /*
                            Method dump skipped, instructions count: 265
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.compose.AlternativeProductsPageKt$AlternativeProductsGrid$lambda$7$lambda$6$$inlined$itemsIndexed$default$4.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, true, 1229287273));
                break;
            case 1:
                final au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData ingredientCardApiData2 = (au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData) this.j;
                final SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) this.e;
                final ProductCardConfig productCardConfig2 = (ProductCardConfig) this.g;
                final Function2 function22 = (Function2) this.h;
                LazyGridScope LazyVerticalGrid2 = (LazyGridScope) obj;
                Intrinsics.h(LazyVerticalGrid2, "$this$LazyVerticalGrid");
                final List list = ingredientCardApiData2.f;
                int size2 = list.size();
                Function1<Integer, Object> function14 = new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.AlternativeProductsPageKt$AlternativeProductsGrid$lambda$7$lambda$6$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list.get(((Number) obj2).intValue());
                        return null;
                    }
                };
                final Function1 function15 = this.f;
                final Function1 function16 = this.i;
                LazyVerticalGrid2.d(size2, null, null, function14, new ComposableLambdaImpl(new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.AlternativeProductsPageKt$AlternativeProductsGrid$lambda$7$lambda$6$$inlined$itemsIndexed$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
                    @Override // kotlin.jvm.functions.Function4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
                        /*
                            Method dump skipped, instructions count: 263
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.compose.AlternativeProductsPageKt$AlternativeProductsGrid$lambda$7$lambda$6$$inlined$itemsIndexed$default$4.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, true, 1229287273));
                break;
            default:
                OfferProductList.Success success = (OfferProductList.Success) this.j;
                final Function1 function17 = (Function1) this.g;
                final Function1 function18 = (Function1) this.h;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                final List list2 = success.g;
                int size3 = list2.size();
                Function1<Integer, Object> function19 = new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferSuccessScreenKt$Body$lambda$13$lambda$12$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list2.get(((Number) obj2).intValue());
                        return null;
                    }
                };
                final Map map = this.e;
                final Function1 function110 = this.f;
                final Function1 function111 = this.i;
                LazyColumn.b(size3, null, function19, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferSuccessScreenKt$Body$lambda$13$lambda$12$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        Object obj6 = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.n(obj6) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if (composer.z(i & 1, (i & 147) != 146)) {
                            final ProductCard productCard = (ProductCard) list2.get(iIntValue);
                            composer.o(988091716);
                            composer.o(-1633490746);
                            final Function1 function112 = function110;
                            boolean zN = composer.n(function112) | composer.I(productCard);
                            Object objG = composer.G();
                            Object obj7 = Composer.Companion.f1624a;
                            if (zN || objG == obj7) {
                                objG = new Function0<Unit>() { // from class: au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferSuccessScreenKt$Body$1$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function112.invoke(productCard);
                                        return Unit.f24250a;
                                    }
                                };
                                composer.A(objG);
                            }
                            Function0 function0 = (Function0) objG;
                            final Function1 function113 = function111;
                            boolean zC = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.C(-1633490746, composer, function113) | composer.I(productCard);
                            Object objG2 = composer.G();
                            if (zC || objG2 == obj7) {
                                objG2 = new Function0<Unit>() { // from class: au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferSuccessScreenKt$Body$1$1$1$2$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function113.invoke(productCard);
                                        return Unit.f24250a;
                                    }
                                };
                                composer.A(objG2);
                            }
                            Function0 function02 = (Function0) objG2;
                            final Function1 function114 = function17;
                            boolean zC2 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.C(-1633490746, composer, function114) | composer.I(productCard);
                            Object objG3 = composer.G();
                            if (zC2 || objG3 == obj7) {
                                objG3 = new Function0<Unit>() { // from class: au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferSuccessScreenKt$Body$1$1$1$3$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function114.invoke(productCard);
                                        return Unit.f24250a;
                                    }
                                };
                                composer.A(objG3);
                            }
                            Function0 function03 = (Function0) objG3;
                            final Function1 function115 = function18;
                            boolean zC3 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.C(-1633490746, composer, function115) | composer.I(productCard);
                            Object objG4 = composer.G();
                            if (zC3 || objG4 == obj7) {
                                objG4 = new Function0<Unit>() { // from class: au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferSuccessScreenKt$Body$1$1$1$4$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function115.invoke(productCard);
                                        return Unit.f24250a;
                                    }
                                };
                                composer.A(objG4);
                            }
                            composer.l();
                            QuickAddOfferSuccessScreenKt.e(productCard, map, function0, function02, function03, (Function0) objG4, composer, ProductCard.$stable);
                            composer.l();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, -632812321));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ e(OfferProductList.Success success, Map map, Function1 function1, Function1 function12, Function1 function13, Function1 function14) {
        this.d = 2;
        this.j = success;
        this.e = map;
        this.f = function1;
        this.i = function12;
        this.g = function13;
        this.h = function14;
    }
}
