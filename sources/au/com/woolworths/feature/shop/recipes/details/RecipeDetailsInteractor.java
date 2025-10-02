package au.com.woolworths.feature.shop.recipes.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsInteractor;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecipeDetailsInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final RecipeDetailsRepository f8012a;
    public final CollectionModeInteractor b;
    public final GoogleAdManagerInteractor c;
    public final ArrayList d;
    public final ArrayList e;

    public RecipeDetailsInteractor(RecipeDetailsRepository recipeDetailsRepository, CollectionModeInteractor collectionModeInteractor, GoogleAdManagerInteractor googleAdManagerInteractor) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(googleAdManagerInteractor, "googleAdManagerInteractor");
        this.f8012a = recipeDetailsRepository;
        this.b = collectionModeInteractor;
        this.c = googleAdManagerInteractor;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r10 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if (r10 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r10 instanceof au.com.woolworths.feature.shop.recipes.details.RecipeDetailsInteractor$getRecipeDetails$1
            if (r0 == 0) goto L13
            r0 = r10
            au.com.woolworths.feature.shop.recipes.details.RecipeDetailsInteractor$getRecipeDetails$1 r0 = (au.com.woolworths.feature.shop.recipes.details.RecipeDetailsInteractor$getRecipeDetails$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.recipes.details.RecipeDetailsInteractor$getRecipeDetails$1 r0 = new au.com.woolworths.feature.shop.recipes.details.RecipeDetailsInteractor$getRecipeDetails$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L40
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData r9 = r0.p
            kotlin.ResultKt.b(r10)
        L2e:
            r2 = r9
            r6 = r10
            goto L93
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData r9 = r0.p
            kotlin.ResultKt.b(r10)
        L3e:
            r2 = r9
            goto L72
        L40:
            kotlin.ResultKt.b(r10)
            goto L58
        L44:
            kotlin.ResultKt.b(r10)
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r10 = r8.b
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r10 = r10.w()
            r0.s = r5
            au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository r2 = r8.f8012a
            java.lang.Object r10 = r2.b(r9, r10, r0)
            if (r10 != r1) goto L58
            goto L92
        L58:
            r9 = r10
            au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData r9 = (au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData) r9
            java.lang.Object r10 = r9.p
            boolean r2 = r10 instanceof au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor r5 = r8.c
            if (r2 == 0) goto L80
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r10 = (au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard) r10
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer r2 = au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer.f
            r0.p = r9
            r0.s = r4
            java.lang.Object r10 = r5.e(r10, r2, r0)
            if (r10 != r1) goto L3e
            goto L92
        L72:
            r6 = r10
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r6 = (au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard) r6
            r5 = 0
            r7 = 2064383(0x1f7fff, float:2.892817E-39)
            r3 = 0
            r4 = 0
            au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData r9 = au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData.a(r2, r3, r4, r5, r6, r7)
            return r9
        L80:
            boolean r2 = r10 instanceof au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData
            if (r2 == 0) goto L9d
            au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData r10 = (au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData) r10
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer r2 = au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer.f
            r0.p = r9
            r0.s = r3
            java.lang.Object r10 = r5.d(r10, r2, r0)
            if (r10 != r1) goto L2e
        L92:
            return r1
        L93:
            r5 = 0
            r7 = 2064383(0x1f7fff, float:2.892817E-39)
            r3 = 0
            r4 = 0
            au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData r9 = au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData.a(r2, r3, r4, r5, r6, r7)
        L9d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsInteractor.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(boolean r5, java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r7 instanceof au.com.woolworths.feature.shop.recipes.details.RecipeDetailsInteractor$toggleRecipeSave$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.shop.recipes.details.RecipeDetailsInteractor$toggleRecipeSave$1 r0 = (au.com.woolworths.feature.shop.recipes.details.RecipeDetailsInteractor$toggleRecipeSave$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.recipes.details.RecipeDetailsInteractor$toggleRecipeSave$1 r0 = new au.com.woolworths.feature.shop.recipes.details.RecipeDetailsInteractor$toggleRecipeSave$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.p
            kotlin.ResultKt.b(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r7)
            r0.p = r6
            r0.s = r3
            au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository r7 = r4.f8012a
            java.lang.Object r7 = r7.c(r5, r6, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            r5 = r7
            au.com.woolworths.feature.shop.recipes.details.data.RecipeSaveInfoData r5 = (au.com.woolworths.feature.shop.recipes.details.data.RecipeSaveInfoData) r5
            boolean r5 = r5.f8021a
            java.util.ArrayList r0 = r4.d
            java.util.ArrayList r1 = r4.e
            if (r5 == 0) goto L56
            boolean r5 = r1.remove(r6)
            if (r5 != 0) goto L5f
            r0.add(r6)
            return r7
        L56:
            boolean r5 = r0.remove(r6)
            if (r5 != 0) goto L5f
            r1.add(r6)
        L5f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsInteractor.b(boolean, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
