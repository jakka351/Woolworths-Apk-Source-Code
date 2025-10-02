package au.com.woolworths.feature.shop.modeselector;

import android.location.Location;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/ShoppingModeSelectorRepository;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ShoppingModeSelectorRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f7523a;
    public final FeatureToggleManager b;

    public ShoppingModeSelectorRepository(ApolloClient apolloClient, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f7523a = apolloClient;
        this.b = featureToggleManager;
    }

    public static /* synthetic */ Object c(ShoppingModeSelectorRepository shoppingModeSelectorRepository, String str, String str2, String str3, Location location, boolean z, ContinuationImpl continuationImpl, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            location = null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return shoppingModeSelectorRepository.b(str, str2, str3, location, z, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r9, android.location.Location r10, boolean r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r12 instanceof au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository$getShoppingModes$1
            if (r0 == 0) goto L13
            r0 = r12
            au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository$getShoppingModes$1 r0 = (au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository$getShoppingModes$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository$getShoppingModes$1 r0 = new au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository$getShoppingModes$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L71
        L27:
            r9 = move-exception
            goto L82
        L29:
            r9 = move-exception
            goto L87
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            kotlin.ResultKt.b(r12)
            if (r10 == 0) goto L46
            au.com.woolworths.shop.graphql.type.GeoLocation r12 = new au.com.woolworths.shop.graphql.type.GeoLocation
            double r4 = r10.getLatitude()
            double r6 = r10.getLongitude()
            r12.<init>(r4, r6)
            goto L47
        L46:
            r12 = 0
        L47:
            com.apollographql.apollo.ApolloClient r10 = r8.f7523a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.modeselector.ShoppingModeSelectorQuery r2 = new com.woolworths.shop.modeselector.ShoppingModeSelectorQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional$Present r4 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r4.<init>(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional$Present r9 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r9.<init>(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r12 = r8.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.base.shopapp.BaseShopAppFeature r5 = au.com.woolworths.base.shopapp.BaseShopAppFeature.X     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            boolean r12 = r12.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r4, r11, r9, r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r10.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r9 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r9.<init>(r10, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r12 = r9.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r12 != r1) goto L71
            return r1
        L71:
            com.apollographql.apollo.api.ApolloResponse r12 = (com.apollographql.apollo.api.ApolloResponse) r12     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r9 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.modeselector.ShoppingModeSelectorQuery$Data r9 = (com.woolworths.shop.modeselector.ShoppingModeSelectorQuery.Data) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.modeselector.ShoppingModeSelectorQuery$ShoppingModeSelector r9 = r9.getF23262a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorQueryContent r9 = au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorQueryShoppingModeSelectorExtKt.a(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            return r9
        L82:
            au.com.woolworths.android.onesite.network.ServerErrorException r9 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r9)
            throw r9
        L87:
            java.lang.Exception r9 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository.a(java.lang.String, android.location.Location, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r13, java.lang.String r14, java.lang.String r15, android.location.Location r16, boolean r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Exception {
        /*
            r12 = this;
            r0 = r18
            boolean r1 = r0 instanceof au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository$setShoppingMode$1
            if (r1 == 0) goto L15
            r1 = r0
            au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository$setShoppingMode$1 r1 = (au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository$setShoppingMode$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.r = r2
            goto L1a
        L15:
            au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository$setShoppingMode$1 r1 = new au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository$setShoppingMode$1
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.r
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            goto L7d
        L29:
            r0 = move-exception
            r13 = r0
            goto L8e
        L2c:
            r0 = move-exception
            r13 = r0
            goto L93
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            kotlin.ResultKt.b(r0)
            if (r16 == 0) goto L4a
            au.com.woolworths.shop.graphql.type.GeoLocation r0 = new au.com.woolworths.shop.graphql.type.GeoLocation
            double r5 = r16.getLatitude()
            double r7 = r16.getLongitude()
            r0.<init>(r5, r7)
            goto L4b
        L4a:
            r0 = 0
        L4b:
            com.apollographql.apollo.ApolloClient r3 = r12.f7523a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.woolworths.shop.modeselector.SetShoppingModeMutation r5 = new com.woolworths.shop.modeselector.SetShoppingModeMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Optional$Present r7 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r7.<init>(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Optional$Present r8 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r8.<init>(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Optional$Present r10 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r10.<init>(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r13 = r12.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.base.shopapp.BaseShopAppFeature r14 = au.com.woolworths.base.shopapp.BaseShopAppFeature.X     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r11 = r13.c(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r6 = r15
            r9 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r3.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.ApolloCall r13 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r13.<init>(r3, r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r1.r = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            java.lang.Object r0 = r13.b(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            if (r0 != r2) goto L7d
            return r2
        L7d:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Operation$Data r13 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.woolworths.shop.modeselector.SetShoppingModeMutation$Data r13 = (com.woolworths.shop.modeselector.SetShoppingModeMutation.Data) r13     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.woolworths.shop.modeselector.SetShoppingModeMutation$SetShoppingMode r13 = r13.getF23230a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorMutationContent r13 = au.com.woolworths.feature.shop.modeselector.model.SetShoppingModeMutationSetShoppingModeExtKt.a(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            return r13
        L8e:
            au.com.woolworths.android.onesite.network.ServerErrorException r13 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r13)
            throw r13
        L93:
            java.lang.Exception r13 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r13)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository.b(java.lang.String, java.lang.String, java.lang.String, android.location.Location, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
