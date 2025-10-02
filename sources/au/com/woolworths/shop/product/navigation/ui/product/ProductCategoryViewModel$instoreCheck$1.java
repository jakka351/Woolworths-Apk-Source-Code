package au.com.woolworths.shop.product.navigation.ui.product;

import au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor;
import au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePrompt;
import au.com.woolworths.foundation.shop.instore.presence.util.DurationKt;
import au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryViewModel$instoreCheck$1", f = "ProductCategoryViewModel.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ProductCategoryViewModel$instoreCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductCategoryViewModel q;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryViewModel$instoreCheck$1$1", f = "ProductCategoryViewModel.kt", l = {51}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryViewModel$instoreCheck$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ ProductCategoryViewModel q;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/foundation/shop/instore/presence/presentation/InstorePresencePrompt;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryViewModel$instoreCheck$1$1$1", f = "ProductCategoryViewModel.kt", l = {52}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryViewModel$instoreCheck$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C02721 extends SuspendLambda implements Function1<Continuation<? super InstorePresencePrompt>, Object> {
            public int p;
            public final /* synthetic */ ProductCategoryViewModel q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02721(ProductCategoryViewModel productCategoryViewModel, Continuation continuation) {
                super(1, continuation);
                this.q = productCategoryViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C02721(this.q, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ((C02721) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
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
                InstorePresenceInteractor instorePresenceInteractor = this.q.f;
                this.p = 1;
                Object objF = instorePresenceInteractor.f(this);
                return objF == coroutineSingletons ? coroutineSingletons : objF;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProductCategoryViewModel productCategoryViewModel, Continuation continuation) {
            super(2, continuation);
            this.q = productCategoryViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            ProductCategoryViewModel productCategoryViewModel = this.q;
            if (i == 0) {
                ResultKt.b(obj);
                C02721 c02721 = new C02721(productCategoryViewModel, null);
                this.p = 1;
                obj = DurationKt.a(500L, c02721, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            InstorePresencePrompt instorePresencePrompt = (InstorePresencePrompt) obj;
            if (instorePresencePrompt == null) {
                return null;
            }
            productCategoryViewModel.h.onNext(new ProductCategoryContract.Actions.ShowInstorePrompt(instorePresencePrompt));
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductCategoryViewModel$instoreCheck$1(ProductCategoryViewModel productCategoryViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = productCategoryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductCategoryViewModel$instoreCheck$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductCategoryViewModel$instoreCheck$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, null);
                this.p = 1;
                obj = TimeoutKt.b(30000L, anonymousClass1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        } catch (Throwable unused) {
        }
        return Unit.f24250a;
    }
}
