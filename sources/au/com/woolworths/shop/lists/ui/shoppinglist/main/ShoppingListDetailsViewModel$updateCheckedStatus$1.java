package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$updateCheckedStatus$1", f = "ShoppingListDetailsViewModel.kt", l = {911, 916}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListDetailsViewModel$updateCheckedStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListItemUiModel q;
    public final /* synthetic */ ShoppingListDetailsViewModel r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListDetailsViewModel$updateCheckedStatus$1(ShoppingListItemUiModel shoppingListItemUiModel, ShoppingListDetailsViewModel shoppingListDetailsViewModel, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListItemUiModel;
        this.r = shoppingListDetailsViewModel;
        this.s = z;
        this.t = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListDetailsViewModel$updateCheckedStatus$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListDetailsViewModel$updateCheckedStatus$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r10 == r2) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel r0 = r9.r
            au.com.woolworths.shop.lists.data.ShoppingListItemInteractor r1 = r0.g
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r9.p
            au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel r4 = r9.q
            r5 = 2
            kotlin.Unit r6 = kotlin.Unit.f24250a
            boolean r7 = r9.s
            r8 = 1
            if (r3 == 0) goto L22
            if (r3 == r8) goto L16
            if (r3 != r5) goto L1a
        L16:
            kotlin.ResultKt.b(r10)     // Catch: java.lang.IllegalArgumentException -> L86
            goto L59
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            kotlin.ResultKt.b(r10)
            boolean r10 = r4 instanceof au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel     // Catch: java.lang.IllegalArgumentException -> L86
            if (r10 == 0) goto L3f
            r10 = r4
            au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel r10 = (au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel) r10     // Catch: java.lang.IllegalArgumentException -> L86
            java.lang.String r10 = r10.f12435a     // Catch: java.lang.IllegalArgumentException -> L86
            r9.p = r8     // Catch: java.lang.IllegalArgumentException -> L86
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion r1 = r1.b     // Catch: java.lang.IllegalArgumentException -> L86
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository r1 = r1.f12280a     // Catch: java.lang.IllegalArgumentException -> L86
            java.lang.Object r10 = r1.n(r10, r7, r9)     // Catch: java.lang.IllegalArgumentException -> L86
            if (r10 != r2) goto L3b
            goto L3c
        L3b:
            r10 = r6
        L3c:
            if (r10 != r2) goto L59
            goto L58
        L3f:
            boolean r10 = r4 instanceof au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel     // Catch: java.lang.IllegalArgumentException -> L86
            if (r10 == 0) goto L80
            r10 = r4
            au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel r10 = (au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel) r10     // Catch: java.lang.IllegalArgumentException -> L86
            java.lang.String r10 = r10.f12432a     // Catch: java.lang.IllegalArgumentException -> L86
            r9.p = r5     // Catch: java.lang.IllegalArgumentException -> L86
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion r1 = r1.b     // Catch: java.lang.IllegalArgumentException -> L86
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository r1 = r1.f12280a     // Catch: java.lang.IllegalArgumentException -> L86
            java.lang.Object r10 = r1.r(r7, r10, r9)     // Catch: java.lang.IllegalArgumentException -> L86
            if (r10 != r2) goto L55
            goto L56
        L55:
            r10 = r6
        L56:
            if (r10 != r2) goto L59
        L58:
            return r2
        L59:
            if (r7 == 0) goto L7f
            boolean r10 = r9.t     // Catch: java.lang.IllegalArgumentException -> L86
            if (r10 == 0) goto L7f
            kotlinx.coroutines.flow.SharedFlowImpl r10 = r0.x     // Catch: java.lang.IllegalArgumentException -> L86
            au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract$Actions$ShowCheckProductItemsSnackbar r1 = new au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract$Actions$ShowCheckProductItemsSnackbar     // Catch: java.lang.IllegalArgumentException -> L86
            au.com.woolworths.android.onesite.models.text.PluralResText r2 = new au.com.woolworths.android.onesite.models.text.PluralResText     // Catch: java.lang.IllegalArgumentException -> L86
            r3 = 2131886107(0x7f12001b, float:1.9406784E38)
            r2.<init>(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L86
            au.com.woolworths.android.onesite.models.text.ResText r3 = new au.com.woolworths.android.onesite.models.text.ResText     // Catch: java.lang.IllegalArgumentException -> L86
            r5 = 2132019870(0x7f140a9e, float:1.9678087E38)
            r3.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L86
            au.com.woolworths.shop.lists.ui.shoppinglist.main.j r5 = new au.com.woolworths.shop.lists.ui.shoppinglist.main.j     // Catch: java.lang.IllegalArgumentException -> L86
            r7 = 1
            r5.<init>(r0, r4, r7)     // Catch: java.lang.IllegalArgumentException -> L86
            r1.<init>(r2, r3, r5, r8)     // Catch: java.lang.IllegalArgumentException -> L86
            r10.f(r1)     // Catch: java.lang.IllegalArgumentException -> L86
        L7f:
            return r6
        L80:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.IllegalArgumentException -> L86
            r10.<init>()     // Catch: java.lang.IllegalArgumentException -> L86
            throw r10     // Catch: java.lang.IllegalArgumentException -> L86
        L86:
            au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel.s6(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$updateCheckedStatus$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
