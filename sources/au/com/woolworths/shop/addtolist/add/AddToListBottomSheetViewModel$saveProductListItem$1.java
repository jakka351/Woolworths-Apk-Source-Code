package au.com.woolworths.shop.addtolist.add;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$saveProductListItem$1", f = "AddToListBottomSheetViewModel.kt", l = {632}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AddToListBottomSheetViewModel$saveProductListItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public AddToListBottomSheetViewModel p;
    public int q;
    public final /* synthetic */ AddToListBottomSheetViewModel r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToListBottomSheetViewModel$saveProductListItem$1(AddToListBottomSheetViewModel addToListBottomSheetViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.r = addToListBottomSheetViewModel;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddToListBottomSheetViewModel$saveProductListItem$1(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddToListBottomSheetViewModel$saveProductListItem$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r12.q
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel r0 = r12.p
            kotlin.ResultKt.b(r13)
            goto L2f
        Lf:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L17:
            kotlin.ResultKt.b(r13)
            au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel r13 = r12.r
            java.lang.String r1 = r12.s
            if (r1 == 0) goto L33
            au.com.woolworths.shop.lists.data.ShoppingListItemInteractor r3 = r13.f
            r12.p = r13
            r12.q = r2
            java.lang.Object r1 = r3.f(r1, r12)
            if (r1 != r0) goto L2d
            return r0
        L2d:
            r0 = r13
            r13 = r1
        L2f:
            au.com.woolworths.shop.lists.data.model.ProductListItem r13 = (au.com.woolworths.shop.lists.data.model.ProductListItem) r13
            r1 = r0
            goto L36
        L33:
            r0 = 0
            r1 = r13
            r13 = r0
        L36:
            r1.s = r13
            androidx.lifecycle.MutableLiveData r2 = r1.i
            au.com.woolworths.product.models.ProductQuantityHelper r0 = au.com.woolworths.product.models.ProductQuantityHelper.INSTANCE
            if (r13 == 0) goto L44
            float r13 = r13.getQuantity()
            double r3 = (double) r13
            goto L50
        L44:
            au.com.woolworths.product.models.ProductCard r13 = r1.w6()
            au.com.woolworths.product.models.ProductShoppingList r13 = r13.getProductShoppingList()
            double r3 = r13.getDefaultValue()
        L50:
            au.com.woolworths.product.models.ProductCard r13 = r1.w6()
            au.com.woolworths.product.models.ProductShoppingList r13 = r13.getProductShoppingList()
            double r5 = r13.getIncrement()
            int r5 = r0.getIndexFromQuantity(r3, r5)
            r10 = 0
            r11 = 247(0xf7, float:3.46E-43)
            r3 = 0
            r4 = 0
            r6 = r5
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel.E6(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r6 == 0) goto L7e
            r1.t = r6
            r10 = 0
            r11 = 251(0xfb, float:3.52E-43)
            r3 = 0
            r4 = 0
            r5 = r6
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel.E6(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L7e:
            kotlin.Unit r13 = kotlin.Unit.f24250a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$saveProductListItem$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
