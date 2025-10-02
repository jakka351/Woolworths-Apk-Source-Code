package au.com.woolworths.base.shopapp.modules.collectionmode;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.analytics.FirebaseAnalyticsLogger;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeIdData;
import au.com.woolworths.shop.graphql.type.ShoppingModeId;
import com.apollographql.apollo.ApolloClient;
import com.google.gson.Gson;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/CollectionModeRepository;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CollectionModeRepository {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4624a;
    public final ApolloClient b;
    public final Gson c;
    public final FirebaseAnalyticsLogger d;
    public final FeatureToggleManager e;
    public final PublishSubject f;
    public final MutableStateFlow g;

    public CollectionModeRepository(SharedPreferences sharedPreferences, ApolloClient apolloClient, Gson gson, FirebaseAnalyticsLogger firebaseAnalyticsLogger, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(firebaseAnalyticsLogger, "firebaseAnalyticsLogger");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f4624a = sharedPreferences;
        this.b = apolloClient;
        this.c = gson;
        this.d = firebaseAnalyticsLogger;
        this.e = featureToggleManager;
        this.f = new PublishSubject();
        this.g = StateFlowKt.a(c());
    }

    public static ShoppingModeId d(ShoppingModeIdData shoppingModeIdData) {
        String d = shoppingModeIdData.getD();
        ShoppingModeId shoppingModeId = ShoppingModeId.i;
        if (Intrinsics.c(d, shoppingModeId.getD())) {
            return shoppingModeId;
        }
        ShoppingModeId shoppingModeId2 = ShoppingModeId.g;
        if (Intrinsics.c(d, shoppingModeId2.getD())) {
            return shoppingModeId2;
        }
        ShoppingModeId shoppingModeId3 = ShoppingModeId.h;
        if (Intrinsics.c(d, shoppingModeId3.getD())) {
            return shoppingModeId3;
        }
        ShoppingModeId shoppingModeId4 = ShoppingModeId.j;
        return Intrinsics.c(d, shoppingModeId4.getD()) ? shoppingModeId4 : ShoppingModeId.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository$clearFulfilmentWindow$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository$clearFulfilmentWindow$1 r0 = (au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository$clearFulfilmentWindow$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository$clearFulfilmentWindow$1 r0 = new au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository$clearFulfilmentWindow$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L4e
        L27:
            r6 = move-exception
            goto L59
        L29:
            r6 = move-exception
            goto L5e
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.ResultKt.b(r6)
            com.apollographql.apollo.ApolloClient r6 = r5.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.modules.collectionmode.ClearFulfilmentWindowMutation r2 = new au.com.woolworths.modules.collectionmode.ClearFulfilmentWindowMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r4.<init>(r6, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r6 = r4.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r6 != r1) goto L4e
            return r1
        L4e:
            com.apollographql.apollo.api.ApolloResponse r6 = (com.apollographql.apollo.api.ApolloResponse) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.modules.collectionmode.ClearFulfilmentWindowMutation$Data r6 = (au.com.woolworths.modules.collectionmode.ClearFulfilmentWindowMutation.Data) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        L59:
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r6)
            throw r6
        L5e:
            java.lang.Exception r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Enum b(au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeIdData r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository$fetchShoppingModeVariantData$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository$fetchShoppingModeVariantData$1 r0 = (au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository$fetchShoppingModeVariantData$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository$fetchShoppingModeVariantData$1 r0 = new au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository$fetchShoppingModeVariantData$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L52
        L27:
            r5 = move-exception
            goto L74
        L29:
            r5 = move-exception
            goto L79
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r6)
            com.apollographql.apollo.ApolloClient r6 = r4.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.modules.collectionmode.ShoppingModeVariantQuery r2 = new au.com.woolworths.modules.collectionmode.ShoppingModeVariantQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.graphql.type.ShoppingModeId r5 = d(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r5 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r5.<init>(r6, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r6 = r5.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r6 != r1) goto L52
            return r1
        L52:
            com.apollographql.apollo.api.ApolloResponse r6 = (com.apollographql.apollo.api.ApolloResponse) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            boolean r5 = r6.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r5 != 0) goto L6d
            com.apollographql.apollo.api.Operation$Data r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.modules.collectionmode.ShoppingModeVariantQuery$Data r5 = (au.com.woolworths.modules.collectionmode.ShoppingModeVariantQuery.Data) r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.modules.collectionmode.ShoppingModeVariantQuery$ShoppingMode r5 = r5.getF9119a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.graphql.type.ShoppingModeVariantState r5 = r5.getF9120a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeVariantStateData r5 = au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeVariantStateExtKt.a(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            return r5
        L6d:
            java.util.List r5 = r6.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L74:
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r5)
            throw r5
        L79:
            java.lang.Exception r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository.b(au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeIdData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Enum");
    }

    public final CollectionMode c() {
        String string = this.f4624a.getString("CollectionMode", null);
        if (string == null) {
            return new CollectionMode.Delivery(DeliveryModeVariant.DeliveryStandard);
        }
        Object objD = this.c.d(CollectionMode.class, string);
        Intrinsics.e(objD);
        return (CollectionMode) objD;
    }
}
