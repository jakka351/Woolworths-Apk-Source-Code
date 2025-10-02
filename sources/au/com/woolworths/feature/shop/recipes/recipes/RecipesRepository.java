package au.com.woolworths.feature.shop.recipes.recipes;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/RecipesRepository;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipesRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f8067a;
    public final FeatureToggleManager b;
    public final SupportedLinksHelper c;

    public RecipesRepository(ApolloClient apolloClient, FeatureToggleManager featureToggleManager, SupportedLinksHelper supportedLinksHelper) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f8067a = apolloClient;
        this.b = featureToggleManager;
        this.c = supportedLinksHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r20, java.lang.Integer r21, java.lang.String r22, java.lang.String r23, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) throws java.lang.Exception {
        /*
            r19 = this;
            r1 = r19
            r0 = r25
            boolean r2 = r0 instanceof au.com.woolworths.feature.shop.recipes.recipes.RecipesRepository$fetchRecipesList$1
            if (r2 == 0) goto L17
            r2 = r0
            au.com.woolworths.feature.shop.recipes.recipes.RecipesRepository$fetchRecipesList$1 r2 = (au.com.woolworths.feature.shop.recipes.recipes.RecipesRepository$fetchRecipesList$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.feature.shop.recipes.recipes.RecipesRepository$fetchRecipesList$1 r2 = new au.com.woolworths.feature.shop.recipes.recipes.RecipesRepository$fetchRecipesList$1
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L3a
            if (r4 != r6) goto L32
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            goto L89
        L2c:
            r0 = move-exception
            goto La5
        L2f:
            r0 = move-exception
            goto Laa
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3a:
            kotlin.ResultKt.b(r0)
            au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper r0 = r1.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.util.List r0 = r0.a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.ApolloClient r4 = r1.f8067a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.shop.recipes.RecipeListQuery r7 = new com.woolworths.shop.recipes.RecipeListQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            if (r24 == 0) goto L4e
            au.com.woolworths.shop.graphql.type.ShoppingModeType r8 = au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeTypeDataKt.a(r24)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            goto L4f
        L4e:
            r8 = r5
        L4f:
            com.apollographql.apollo.api.Optional r8 = com.apollographql.apollo.api.Optional.Companion.a(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional$Absent r10 = com.apollographql.apollo.api.Optional.Absent.f13523a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional r11 = com.apollographql.apollo.api.Optional.Companion.a(r22)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional r12 = com.apollographql.apollo.api.Optional.Companion.a(r21)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional r13 = com.apollographql.apollo.api.Optional.Companion.a(r23)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional r14 = com.apollographql.apollo.api.Optional.Companion.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r1.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r9 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.q     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            boolean r15 = r0.c(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r17 = 256(0x100, float:3.59E-43)
            r18 = 0
            r16 = 0
            r9 = r20
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r4.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.ApolloCall r0 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r0.<init>(r4, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r2.r = r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Object r0 = r0.b(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            if (r0 != r3) goto L89
            return r3
        L89:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Operation$Data r2 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.shop.recipes.RecipeListQuery$Data r2 = (com.woolworths.shop.recipes.RecipeListQuery.Data) r2     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.shop.recipes.RecipeListQuery$RecipeSearch r2 = r2.getRecipeSearch()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            if (r2 == 0) goto L9b
            au.com.woolworths.feature.shop.recipes.recipes.models.RecipeSearchData r5 = au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListQueryRecipeSearchExtKt.toUiModel(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
        L9b:
            if (r5 == 0) goto L9e
            return r5
        L9e:
            java.util.List r0 = r0.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
        La5:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        Laa:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.recipes.recipes.RecipesRepository.a(java.util.List, java.lang.Integer, java.lang.String, java.lang.String, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Integer r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof au.com.woolworths.feature.shop.recipes.recipes.RecipesRepository$fetchSavedRecipes$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.feature.shop.recipes.recipes.RecipesRepository$fetchSavedRecipes$1 r0 = (au.com.woolworths.feature.shop.recipes.recipes.RecipesRepository$fetchSavedRecipes$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.recipes.recipes.RecipesRepository$fetchSavedRecipes$1 r0 = new au.com.woolworths.feature.shop.recipes.recipes.RecipesRepository$fetchSavedRecipes$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            goto L54
        L28:
            r7 = move-exception
            goto L70
        L2a:
            r7 = move-exception
            goto L75
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.ResultKt.b(r8)
            com.apollographql.apollo.ApolloClient r8 = r6.f8067a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            com.woolworths.shop.recipes.SavedRecipesQuery r2 = new com.woolworths.shop.recipes.SavedRecipesQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            com.apollographql.apollo.api.Optional r7 = com.apollographql.apollo.api.Optional.Companion.a(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            r5 = 2
            r2.<init>(r7, r4, r5, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            r8.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            com.apollographql.apollo.ApolloCall r7 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            r7.<init>(r8, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            java.lang.Object r8 = r7.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            if (r8 != r1) goto L54
            return r1
        L54:
            com.apollographql.apollo.api.ApolloResponse r8 = (com.apollographql.apollo.api.ApolloResponse) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            com.apollographql.apollo.api.Operation$Data r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            com.woolworths.shop.recipes.SavedRecipesQuery$Data r7 = (com.woolworths.shop.recipes.SavedRecipesQuery.Data) r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            com.woolworths.shop.recipes.SavedRecipesQuery$SavedRecipes r7 = r7.getSavedRecipes()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            if (r7 == 0) goto L66
            au.com.woolworths.feature.shop.recipes.recipes.models.RecipeSearchData r4 = au.com.woolworths.feature.shop.recipes.recipes.models.SavedRecipesQuerySavedRecipesExtKt.toUiModel(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
        L66:
            if (r4 == 0) goto L69
            return r4
        L69:
            java.util.List r7 = r8.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            au.com.woolworths.android.onesite.network.ServerErrorException r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            throw r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
        L70:
            au.com.woolworths.android.onesite.network.ServerErrorException r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r7)
            throw r7
        L75:
            java.lang.Exception r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.recipes.recipes.RecipesRepository.b(java.lang.Integer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
