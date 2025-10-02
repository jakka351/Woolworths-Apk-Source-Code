package au.com.woolworths.shop.lists.ui.substitutions;

import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.shop.lists.data.ShoppingListItemInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListItemInteractor$productsInShoppingList$$inlined$map$1;
import au.com.woolworths.shop.lists.data.model.AlternativeProductCard;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$onSaveReplacingOriginalClick$1", f = "ViewSimilarProductsViewModel.kt", l = {239}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ViewSimilarProductsViewModel$onSaveReplacingOriginalClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ViewSimilarProductsViewModel q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ AlternativeProductCard t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSimilarProductsViewModel$onSaveReplacingOriginalClick$1(ViewSimilarProductsViewModel viewSimilarProductsViewModel, String str, String str2, AlternativeProductCard alternativeProductCard, Continuation continuation) {
        super(2, continuation);
        this.q = viewSimilarProductsViewModel;
        this.r = str;
        this.s = str2;
        this.t = alternativeProductCard;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ViewSimilarProductsViewModel$onSaveReplacingOriginalClick$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ViewSimilarProductsViewModel$onSaveReplacingOriginalClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ViewSimilarProductsViewModel viewSimilarProductsViewModel = this.q;
        ShoppingListItemInteractor shoppingListItemInteractor = viewSimilarProductsViewModel.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            ProductId productIdCreate = ProductId.INSTANCE.create(this.s);
            String str = this.r;
            shoppingListItemInteractor.d(str, productIdCreate);
            ProductCard product = this.t.getProduct();
            this.p = 1;
            shoppingListItemInteractor.getClass();
            Object objCollect = new ShoppingListItemInteractor$productsInShoppingList$$inlined$map$1((FlowKt__ZipKt$combine$$inlined$unsafeFlow$1) shoppingListItemInteractor.b.o(str)).collect(new ViewSimilarProductsViewModel$saveProductToList$2(product, viewSimilarProductsViewModel, str), this);
            if (objCollect != coroutineSingletons) {
                objCollect = unit;
            }
            if (objCollect == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return unit;
    }
}
