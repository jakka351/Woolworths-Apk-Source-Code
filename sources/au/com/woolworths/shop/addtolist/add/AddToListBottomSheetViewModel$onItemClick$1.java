package au.com.woolworths.shop.addtolist.add;

import au.com.woolworths.shop.lists.data.model.ShoppingList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$onItemClick$1", f = "AddToListBottomSheetViewModel.kt", l = {305, 306}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AddToListBottomSheetViewModel$onItemClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AddToListBottomSheetViewModel q;
    public final /* synthetic */ ShoppingList r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToListBottomSheetViewModel$onItemClick$1(AddToListBottomSheetViewModel addToListBottomSheetViewModel, ShoppingList shoppingList, int i, Continuation continuation) {
        super(2, continuation);
        this.q = addToListBottomSheetViewModel;
        this.r = shoppingList;
        this.s = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddToListBottomSheetViewModel$onItemClick$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddToListBottomSheetViewModel$onItemClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.p
            kotlin.Unit r2 = kotlin.Unit.f24250a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.b(r7)
            return r2
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.ResultKt.b(r7)
            return r2
        L1e:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel r7 = r6.q
            au.com.woolworths.shop.addtolist.models.CopyFromListParameters r1 = r7.p
            au.com.woolworths.shop.lists.data.model.ShoppingList r5 = r6.r
            if (r1 == 0) goto L34
            float r1 = r1.e
            r6.p = r4
            java.lang.Object r7 = au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel.p6(r7, r1, r5, r6)
            if (r7 != r0) goto L58
            goto L57
        L34:
            java.util.List r1 = r7.r
            r6.p = r3
            int r3 = r1.size()
            if (r3 != r4) goto L4d
            java.lang.Object r1 = kotlin.collections.CollectionsKt.D(r1)
            au.com.woolworths.shop.addtolist.models.AddToListProductParameters r1 = (au.com.woolworths.shop.addtolist.models.AddToListProductParameters) r1
            int r3 = r6.s
            java.lang.Object r7 = r7.s6(r5, r3, r1, r6)
            if (r7 != r0) goto L54
            goto L55
        L4d:
            java.lang.Object r7 = r7.q6(r5, r1, r6)
            if (r7 != r0) goto L54
            goto L55
        L54:
            r7 = r2
        L55:
            if (r7 != r0) goto L58
        L57:
            return r0
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$onItemClick$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
