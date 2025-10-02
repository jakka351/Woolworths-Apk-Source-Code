package com.woolworths.scanlibrary.ui.cart.shoppingcart;

import android.content.Intent;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract;
import com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.woolworths.scanlibrary.ui.cart.shoppingcart.ShoppingCartFragment$openLists$1", f = "ShoppingCartFragment.kt", l = {243}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ShoppingCartFragment$openLists$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public ShoppingCartFragment p;
    public int q;
    public final /* synthetic */ ShoppingCartFragment r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingCartFragment$openLists$1(ShoppingCartFragment shoppingCartFragment, Continuation continuation) {
        super(2, continuation);
        this.r = shoppingCartFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingCartFragment$openLists$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingCartFragment$openLists$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ShoppingCartFragment shoppingCartFragment;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            ShoppingCartFragment shoppingCartFragment2 = this.r;
            ((CartContract.Presenter) shoppingCartFragment2.Q1()).i(true);
            ((CartContract.Presenter) shoppingCartFragment2.Q1()).v();
            SnGShoppingListUtils snGShoppingListUtils = shoppingCartFragment2.l;
            if (snGShoppingListUtils == null) {
                Intrinsics.p("snGShoppingListUtils");
                throw null;
            }
            int iN = ((CartContract.Presenter) shoppingCartFragment2.Q1()).n();
            this.p = shoppingCartFragment2;
            this.q = 1;
            Object objB = snGShoppingListUtils.b(iN, this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            shoppingCartFragment = shoppingCartFragment2;
            obj = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            shoppingCartFragment = this.p;
            ResultKt.b(obj);
        }
        shoppingCartFragment.startActivity((Intent) obj);
        return Unit.f24250a;
    }
}
