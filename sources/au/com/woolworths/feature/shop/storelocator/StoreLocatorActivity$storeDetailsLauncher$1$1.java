package au.com.woolworths.feature.shop.storelocator;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.PausingDispatcherKt;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity$storeDetailsLauncher$1$1", f = "StoreLocatorActivity.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class StoreLocatorActivity$storeDetailsLauncher$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ StoreLocatorActivity q;
    public final /* synthetic */ Store r;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity$storeDetailsLauncher$1$1$1", f = "StoreLocatorActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity$storeDetailsLauncher$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ StoreLocatorActivity p;
        public final /* synthetic */ Store q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StoreLocatorActivity storeLocatorActivity, Store store, Continuation continuation) {
            super(2, continuation);
            this.p = storeLocatorActivity;
            this.q = store;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.p, this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            int i = StoreLocatorActivity.J;
            StoreLocatorViewModel storeLocatorViewModelO4 = this.p.O4();
            StoreLocatorViewModel.t6(storeLocatorViewModelO4, storeLocatorViewModelO4.i, true, null, null, null, 14);
            BuildersKt.c(ViewModelKt.a(storeLocatorViewModelO4), null, null, new StoreLocatorViewModel$saveInStoreLocation$1(storeLocatorViewModelO4, this.q, null), 3);
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreLocatorActivity$storeDetailsLauncher$1$1(StoreLocatorActivity storeLocatorActivity, Store store, Continuation continuation) {
        super(2, continuation);
        this.q = storeLocatorActivity;
        this.r = store;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoreLocatorActivity$storeDetailsLauncher$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StoreLocatorActivity$storeDetailsLauncher$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Store store = this.r;
            StoreLocatorActivity storeLocatorActivity = this.q;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(storeLocatorActivity, store, null);
            this.p = 1;
            if (PausingDispatcherKt.a(storeLocatorActivity.getD(), Lifecycle.State.h, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
