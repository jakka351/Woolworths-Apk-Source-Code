package com.woolworths.scanlibrary.ui.home;

import android.content.Intent;
import com.woolworths.scanlibrary.ui.home.HomeActivityContract;
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
@DebugMetadata(c = "com.woolworths.scanlibrary.ui.home.HomeActivity$openLists$1", f = "HomeActivity.kt", l = {176}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class HomeActivity$openLists$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public HomeActivity p;
    public int q;
    public final /* synthetic */ HomeActivity r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivity$openLists$1(HomeActivity homeActivity, Continuation continuation) {
        super(2, continuation);
        this.r = homeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeActivity$openLists$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeActivity$openLists$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        HomeActivity homeActivity;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            HomeActivity homeActivity2 = this.r;
            ((HomeActivityContract.Presenter) homeActivity2.S4()).i(true);
            ((HomeActivityContract.Presenter) homeActivity2.S4()).v();
            SnGShoppingListUtils snGShoppingListUtils = homeActivity2.U;
            if (snGShoppingListUtils == null) {
                Intrinsics.p("snGShoppingListUtils");
                throw null;
            }
            int iN = ((HomeActivityContract.Presenter) homeActivity2.S4()).n();
            this.p = homeActivity2;
            this.q = 1;
            Object objB = snGShoppingListUtils.b(iN, this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            homeActivity = homeActivity2;
            obj = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            homeActivity = this.p;
            ResultKt.b(obj);
        }
        homeActivity.startActivity((Intent) obj);
        return Unit.f24250a;
    }
}
