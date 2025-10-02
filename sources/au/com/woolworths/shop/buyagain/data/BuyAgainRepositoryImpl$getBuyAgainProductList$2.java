package au.com.woolworths.shop.buyagain.data;

import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.shop.buyagain.domain.BuyAgainProductList;
import au.com.woolworths.shop.graphql.type.ChipsProductListInputArgs;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.shop.buyagain.BuyAgainProductListQuery;
import java.util.List;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/buyagain/domain/BuyAgainProductList;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.buyagain.data.BuyAgainRepositoryImpl$getBuyAgainProductList$2", f = "BuyAgainRepositoryImpl.kt", l = {94}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class BuyAgainRepositoryImpl$getBuyAgainProductList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BuyAgainProductList>, Object> {
    public int p;
    public final /* synthetic */ BuyAgainRepositoryImpl q;
    public final /* synthetic */ String r;
    public final /* synthetic */ List s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ CollectionMode v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyAgainRepositoryImpl$getBuyAgainProductList$2(BuyAgainRepositoryImpl buyAgainRepositoryImpl, String str, List list, String str2, String str3, CollectionMode collectionMode, Continuation continuation) {
        super(2, continuation);
        this.q = buyAgainRepositoryImpl;
        this.r = str;
        this.s = list;
        this.t = str2;
        this.u = str3;
        this.v = collectionMode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BuyAgainRepositoryImpl$getBuyAgainProductList$2(this.q, this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BuyAgainRepositoryImpl$getBuyAgainProductList$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objB;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                BuyAgainRepositoryImpl buyAgainRepositoryImpl = this.q;
                FeatureToggleManager featureToggleManager = buyAgainRepositoryImpl.c;
                String str = this.r;
                List list = this.s;
                String str2 = this.t;
                String str3 = this.u;
                CollectionMode collectionMode = this.v;
                boolean zC = featureToggleManager.c(BaseFeature.g);
                Optional.Present present = new Optional.Present(str);
                Optional.Present present2 = new Optional.Present(new ChipsProductListInputArgs(list, CollectionsKt.S(str2), CollectionsKt.S(str3)));
                ApolloClient apolloClient = buyAgainRepositoryImpl.f10250a;
                BuyAgainProductListQuery buyAgainProductListQuery = new BuyAgainProductListQuery(present, BuyAgainRepositoryImpl.a(buyAgainRepositoryImpl, collectionMode), present2, Optional.Companion.a(Boolean.valueOf(featureToggleManager.c(BaseShopAppFeature.y))), zC);
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, buyAgainProductListQuery);
                this.p = 1;
                objB = apolloCall.b(this);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objB = obj;
            }
            ApolloResponse apolloResponse = (ApolloResponse) objB;
            BuyAgainProductListQuery.BuyAgainProductList buyAgainProductList = ((BuyAgainProductListQuery.Data) ExceptionExtKt.k(apolloResponse)).f21499a;
            if (apolloResponse.b()) {
                throw ExceptionExtKt.f(apolloResponse.d);
            }
            return BuyAgainProductListQueryBuyAgainProductListExtKt.a(buyAgainProductList);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
