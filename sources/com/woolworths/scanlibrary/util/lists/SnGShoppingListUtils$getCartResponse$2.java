package com.woolworths.scanlibrary.util.lists;

import com.google.android.gms.location.DeviceOrientationRequest;
import com.woolworths.scanlibrary.models.cart.CartResponse;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.rx2.RxAwaitKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/woolworths/scanlibrary/models/cart/CartResponse;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getCartResponse$2", f = "SnGShoppingListUtils.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class SnGShoppingListUtils$getCartResponse$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CartResponse>, Object> {
    public int p;
    public final /* synthetic */ SnGShoppingListUtils q;
    public final /* synthetic */ Integer r;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/woolworths/scanlibrary/models/cart/CartResponse;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getCartResponse$2$1", f = "SnGShoppingListUtils.kt", l = {81}, m = "invokeSuspend")
    /* renamed from: com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getCartResponse$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CartResponse>, Object> {
        public int p;
        public final /* synthetic */ SnGShoppingListUtils q;
        public final /* synthetic */ Integer r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SnGShoppingListUtils snGShoppingListUtils, Integer num, Continuation continuation) {
            super(2, continuation);
            this.q = snGShoppingListUtils;
            this.r = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            Single singleA = this.q.f21370a.a(this.r.intValue());
            this.p = 1;
            Object objB = RxAwaitKt.b(singleA, this);
            return objB == coroutineSingletons ? coroutineSingletons : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnGShoppingListUtils$getCartResponse$2(SnGShoppingListUtils snGShoppingListUtils, Integer num, Continuation continuation) {
        super(2, continuation);
        this.q = snGShoppingListUtils;
        this.r = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SnGShoppingListUtils$getCartResponse$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SnGShoppingListUtils$getCartResponse$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, this.r, null);
        this.p = 1;
        Object objB = TimeoutKt.b(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, anonymousClass1, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
