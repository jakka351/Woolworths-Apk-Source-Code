package au.com.woolworths.feature.shop.recipes.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsRepository;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipeDetailsRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f8013a;
    public final FeatureToggleManager b;
    public final SupportedLinksHelper c;

    public RecipeDetailsRepository(ApolloClient apolloClient, FeatureToggleManager featureToggleManager, SupportedLinksHelper supportedLinksHelper) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f8013a = apolloClient;
        this.b = featureToggleManager;
        this.c = supportedLinksHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r6, java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r8 instanceof au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository$fetchIngredients$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository$fetchIngredients$1 r0 = (au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository$fetchIngredients$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository$fetchIngredients$1 r0 = new au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository$fetchIngredients$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L5d
        L27:
            r6 = move-exception
            goto L79
        L29:
            r6 = move-exception
            goto L7e
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r8)
            com.apollographql.apollo.ApolloClient r8 = r5.f8013a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.recipes.details.GetIngredientsQuery r2 = new com.woolworths.feature.shop.recipes.details.GetIngredientsQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional$Present r4 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r4.<init>(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Integer r7 = new java.lang.Integer     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r7.<init>(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional$Present r6 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.<init>(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r4, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r8.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r6 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.<init>(r8, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r8 = r6.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r8 != r1) goto L5d
            return r1
        L5d:
            com.apollographql.apollo.api.ApolloResponse r8 = (com.apollographql.apollo.api.ApolloResponse) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.recipes.details.GetIngredientsQuery$Data r6 = (com.woolworths.feature.shop.recipes.details.GetIngredientsQuery.Data) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.recipes.details.GetIngredientsQuery$GetIngredients r6 = r6.f20228a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r6 == 0) goto L6e
            au.com.woolworths.feature.shop.recipes.details.data.IngredientsSectionData r6 = au.com.woolworths.feature.shop.recipes.details.data.GetIngredientsQueryGetIngredientsExtKt.a(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L6f
        L6e:
            r6 = 0
        L6f:
            if (r6 == 0) goto L72
            return r6
        L72:
            java.util.List r6 = r8.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L79:
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r6)
            throw r6
        L7e:
            java.lang.Exception r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository.a(int, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r9, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r11 instanceof au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository$getRecipeDetails$1
            if (r0 == 0) goto L13
            r0 = r11
            au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository$getRecipeDetails$1 r0 = (au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository$getRecipeDetails$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository$getRecipeDetails$1 r0 = new au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository$getRecipeDetails$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            goto L6d
        L28:
            r9 = move-exception
            goto L87
        L2a:
            r9 = move-exception
            goto L8c
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            kotlin.ResultKt.b(r11)
            au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper r11 = r8.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            java.util.List r11 = r11.a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            com.apollographql.apollo.ApolloClient r2 = r8.f8013a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            com.woolworths.feature.shop.recipes.details.RecipeDetailsQuery r5 = new com.woolworths.feature.shop.recipes.details.RecipeDetailsQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            if (r10 == 0) goto L48
            au.com.woolworths.shop.graphql.type.ShoppingModeType r10 = au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeTypeDataKt.a(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            goto L49
        L48:
            r10 = r3
        L49:
            com.apollographql.apollo.api.Optional r10 = com.apollographql.apollo.api.Optional.Companion.a(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            com.apollographql.apollo.api.Optional r11 = com.apollographql.apollo.api.Optional.Companion.a(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r6 = r8.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r7 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.q     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            boolean r6 = r6.c(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            r5.<init>(r10, r9, r11, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            r2.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            com.apollographql.apollo.ApolloCall r9 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            r9.<init>(r2, r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            r0.r = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            java.lang.Object r11 = r9.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            if (r11 != r1) goto L6d
            return r1
        L6d:
            com.apollographql.apollo.api.ApolloResponse r11 = (com.apollographql.apollo.api.ApolloResponse) r11     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            com.apollographql.apollo.api.Operation$Data r9 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            com.woolworths.feature.shop.recipes.details.RecipeDetailsQuery$Data r9 = (com.woolworths.feature.shop.recipes.details.RecipeDetailsQuery.Data) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            com.woolworths.feature.shop.recipes.details.RecipeDetailsQuery$RecipeDetails r9 = r9.f20238a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            if (r9 == 0) goto L7d
            au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData r3 = au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailsQueryRecipeDetailsExtKt.a(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
        L7d:
            if (r3 == 0) goto L80
            return r3
        L80:
            java.util.List r9 = r11.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            au.com.woolworths.android.onesite.network.ServerErrorException r9 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
            throw r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2a
        L87:
            au.com.woolworths.android.onesite.network.ServerErrorException r9 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r9)
            throw r9
        L8c:
            java.lang.Exception r9 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository.b(java.lang.String, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(boolean r6, java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r8 instanceof au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository$toggleRecipeSave$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository$toggleRecipeSave$1 r0 = (au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository$toggleRecipeSave$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository$toggleRecipeSave$1 r0 = new au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository$toggleRecipeSave$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L58
        L27:
            r6 = move-exception
            goto L79
        L29:
            r6 = move-exception
            goto L7e
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r8)
            com.apollographql.apollo.ApolloClient r8 = r5.f8013a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.recipes.details.RecipeSaveInfoMutation r2 = new com.woolworths.feature.shop.recipes.details.RecipeSaveInfoMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.graphql.type.ToggleRecipeSaveInput r4 = new au.com.woolworths.shop.graphql.type.ToggleRecipeSaveInput     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r4.<init>(r7, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional$Present r6 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.<init>(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r8.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r6 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.<init>(r8, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r8 = r6.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r8 != r1) goto L58
            return r1
        L58:
            com.apollographql.apollo.api.ApolloResponse r8 = (com.apollographql.apollo.api.ApolloResponse) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.recipes.details.RecipeSaveInfoMutation$Data r6 = (com.woolworths.feature.shop.recipes.details.RecipeSaveInfoMutation.Data) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.recipes.details.RecipeSaveInfoMutation$ToggleRecipeSave r6 = r6.f20270a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r6 == 0) goto L6e
            au.com.woolworths.feature.shop.recipes.details.data.RecipeSaveInfoData r7 = new au.com.woolworths.feature.shop.recipes.details.data.RecipeSaveInfoData     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            boolean r0 = r6.f20271a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.String r6 = r6.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r7.<init>(r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L6f
        L6e:
            r7 = 0
        L6f:
            if (r7 == 0) goto L72
            return r7
        L72:
            java.util.List r6 = r8.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L79:
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r6)
            throw r6
        L7e:
            java.lang.Exception r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository.c(boolean, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
