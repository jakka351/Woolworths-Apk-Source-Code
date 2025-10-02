package au.com.woolworths.foundation.rewards.cart.update.data;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.foundation.rewards.cart.update.data.UpdateCartQuantitiesMutation;
import au.com.woolworths.foundation.rewards.cart.update.data.model.UpdateCartQuantitiesInput;
import au.com.woolworths.foundation.rewards.cart.update.data.model.UpdateCartQuantitiesMutationUpdateCartQuantitiesPage1ExtKt;
import au.com.woolworths.foundation.rewards.cart.update.data.model.UpdatedCartQuantities;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.exception.ApolloException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/foundation/rewards/cart/update/data/model/UpdatedCartQuantities;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.rewards.cart.update.data.CartQuantitiesRepository$updateCart$2", f = "CartQuantitiesRepository.kt", l = {38}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CartQuantitiesRepository$updateCart$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UpdatedCartQuantities>, Object> {
    public int p;
    public final /* synthetic */ UpdateCartQuantitiesInput q;
    public final /* synthetic */ CartQuantitiesRepository r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartQuantitiesRepository$updateCart$2(UpdateCartQuantitiesInput updateCartQuantitiesInput, CartQuantitiesRepository cartQuantitiesRepository, Continuation continuation) {
        super(2, continuation);
        this.q = updateCartQuantitiesInput;
        this.r = cartQuantitiesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CartQuantitiesRepository$updateCart$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CartQuantitiesRepository$updateCart$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                new ArrayList(CollectionsKt.s(null, 10));
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            ApolloResponse apolloResponse = (ApolloResponse) obj;
            UpdateCartQuantitiesMutation.UpdateCartQuantitiesPage1 updateCartQuantitiesPage1 = ((UpdateCartQuantitiesMutation.Data) ExceptionExtKt.k(apolloResponse)).f8558a.f8559a;
            UpdatedCartQuantities updatedCartQuantitiesA = updateCartQuantitiesPage1 != null ? UpdateCartQuantitiesMutationUpdateCartQuantitiesPage1ExtKt.a(updateCartQuantitiesPage1) : null;
            if (updatedCartQuantitiesA != null) {
                return updatedCartQuantitiesA;
            }
            throw ExceptionExtKt.i(apolloResponse.d);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
