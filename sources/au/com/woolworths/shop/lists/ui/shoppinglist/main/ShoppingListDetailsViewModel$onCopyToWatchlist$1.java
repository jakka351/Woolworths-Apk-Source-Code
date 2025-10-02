package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$onCopyToWatchlist$1", f = "ShoppingListDetailsViewModel.kt", l = {471, 473, 478}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ShoppingListDetailsViewModel$onCopyToWatchlist$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public ProductCard p;
    public ShoppingList q;
    public boolean r;
    public int s;
    public final /* synthetic */ ProductItemUiModel t;
    public final /* synthetic */ ShoppingListDetailsViewModel u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListDetailsViewModel$onCopyToWatchlist$1(ShoppingListDetailsViewModel shoppingListDetailsViewModel, ProductItemUiModel productItemUiModel, Continuation continuation) {
        super(2, continuation);
        this.t = productItemUiModel;
        this.u = shoppingListDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListDetailsViewModel$onCopyToWatchlist$1(this.u, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListDetailsViewModel$onCopyToWatchlist$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$onCopyToWatchlist$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
