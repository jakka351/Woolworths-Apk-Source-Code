package au.com.woolworths.feature.shop.homepage.data;

import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.graphql.ApolloHeaderExtKt;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeTypeDataKt;
import au.com.woolworths.feature.shop.homepage.HomeFeature;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.shop.homepage.HomeQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/shop/homepage/data/HomeListData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.data.HomeRepository$fetchHome$2", f = "HomeRepository.kt", l = {72}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class HomeRepository$fetchHome$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HomeListData>, Object> {
    public int p;
    public final /* synthetic */ HomeRepository q;
    public final /* synthetic */ CollectionMode r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepository$fetchHome$2(HomeRepository homeRepository, CollectionMode collectionMode, String str, String str2, boolean z, String str3, Continuation continuation) {
        super(2, continuation);
        this.q = homeRepository;
        this.r = collectionMode;
        this.s = str;
        this.t = str2;
        this.u = z;
        this.v = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeRepository$fetchHome$2(this.q, this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeRepository$fetchHome$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objB;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                HomeRepository homeRepository = this.q;
                CollectionMode collectionMode = this.r;
                String str = this.s;
                String str2 = this.t;
                boolean z = this.u;
                String str3 = this.v;
                SupportedLinksHelper supportedLinksHelper = homeRepository.d;
                FeatureToggleManager featureToggleManager = homeRepository.c;
                List listA = supportedLinksHelper.a();
                boolean zC = featureToggleManager.c(BaseShopAppFeature.k);
                ApolloClient apolloClient = homeRepository.f7197a;
                ShoppingModeType shoppingModeTypeA = ShoppingModeTypeDataKt.a(collectionMode);
                Optional optionalA = Optional.Companion.a(str);
                Optional optionalA2 = Optional.Companion.a(listA);
                Optional optionalA3 = Optional.Companion.a(str2);
                boolean z2 = !Intrinsics.c(collectionMode, CollectionMode.InStore.d);
                HomeFeature homeFeature = HomeFeature.d;
                HomeQuery homeQuery = new HomeQuery(shoppingModeTypeA, optionalA, optionalA2, optionalA3, z2, featureToggleManager.c(homeFeature), z, Optional.Companion.a(str3), zC ? new Optional.Present(Boolean.TRUE) : Optional.Absent.f13523a, featureToggleManager.c(BaseShopAppFeature.g), Optional.Companion.a(Boolean.valueOf(featureToggleManager.c(BaseShopAppFeature.y))), featureToggleManager.c(BaseFeature.g));
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, homeQuery);
                ApolloHeaderExtKt.a(apolloCall, featureToggleManager, homeFeature);
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
            HomeQuery.Home home = ((HomeQuery.Data) ExceptionExtKt.k(apolloResponse)).f22923a;
            HomeListData homeListDataA = home != null ? HomeQueryHomeExtKt.a(home) : null;
            if (homeListDataA != null) {
                return homeListDataA;
            }
            throw ExceptionExtKt.i(apolloResponse.d);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
