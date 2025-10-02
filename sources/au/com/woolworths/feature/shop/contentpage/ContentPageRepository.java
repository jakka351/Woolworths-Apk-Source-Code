package au.com.woolworths.feature.shop.contentpage;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo;
import au.com.woolworths.feature.shop.contentpage.data.ContentPageData;
import au.com.woolworths.product.ProductFeature;
import au.com.woolworths.shop.graphql.type.SpecialsHomeSaleFinderStore;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.Optional;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageRepository;", "", "Companion", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ContentPageRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f6988a;
    public final FeatureToggleManager b;
    public final SupportedLinksHelper c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageRepository$Companion;", "", "", "RequestSource", "Ljava/lang/String;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ContentPageRepository(ApolloClient apolloClient, FeatureToggleManager featureToggleManager, SupportedLinksHelper supportedLinksHelper) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f6988a = apolloClient;
        this.b = featureToggleManager;
        this.c = supportedLinksHelper;
        final int i = 0;
        this.d = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.shop.contentpage.b
            public final /* synthetic */ ContentPageRepository e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i) {
                    case 0:
                        zC = this.e.b.c(BaseShopAppFeature.g0);
                        break;
                    case 1:
                        zC = this.e.b.c(BaseShopAppFeature.l);
                        break;
                    case 2:
                        zC = this.e.b.c(BaseShopAppFeature.T);
                        break;
                    case 3:
                        zC = this.e.b.c(BaseFeature.g);
                        break;
                    case 4:
                        zC = this.e.b.c(BaseShopAppFeature.m);
                        break;
                    default:
                        zC = this.e.b.c(ProductFeature.f);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i2 = 1;
        this.e = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.shop.contentpage.b
            public final /* synthetic */ ContentPageRepository e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i2) {
                    case 0:
                        zC = this.e.b.c(BaseShopAppFeature.g0);
                        break;
                    case 1:
                        zC = this.e.b.c(BaseShopAppFeature.l);
                        break;
                    case 2:
                        zC = this.e.b.c(BaseShopAppFeature.T);
                        break;
                    case 3:
                        zC = this.e.b.c(BaseFeature.g);
                        break;
                    case 4:
                        zC = this.e.b.c(BaseShopAppFeature.m);
                        break;
                    default:
                        zC = this.e.b.c(ProductFeature.f);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i3 = 2;
        this.f = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.shop.contentpage.b
            public final /* synthetic */ ContentPageRepository e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i3) {
                    case 0:
                        zC = this.e.b.c(BaseShopAppFeature.g0);
                        break;
                    case 1:
                        zC = this.e.b.c(BaseShopAppFeature.l);
                        break;
                    case 2:
                        zC = this.e.b.c(BaseShopAppFeature.T);
                        break;
                    case 3:
                        zC = this.e.b.c(BaseFeature.g);
                        break;
                    case 4:
                        zC = this.e.b.c(BaseShopAppFeature.m);
                        break;
                    default:
                        zC = this.e.b.c(ProductFeature.f);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i4 = 3;
        this.g = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.shop.contentpage.b
            public final /* synthetic */ ContentPageRepository e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i4) {
                    case 0:
                        zC = this.e.b.c(BaseShopAppFeature.g0);
                        break;
                    case 1:
                        zC = this.e.b.c(BaseShopAppFeature.l);
                        break;
                    case 2:
                        zC = this.e.b.c(BaseShopAppFeature.T);
                        break;
                    case 3:
                        zC = this.e.b.c(BaseFeature.g);
                        break;
                    case 4:
                        zC = this.e.b.c(BaseShopAppFeature.m);
                        break;
                    default:
                        zC = this.e.b.c(ProductFeature.f);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i5 = 4;
        this.h = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.shop.contentpage.b
            public final /* synthetic */ ContentPageRepository e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i5) {
                    case 0:
                        zC = this.e.b.c(BaseShopAppFeature.g0);
                        break;
                    case 1:
                        zC = this.e.b.c(BaseShopAppFeature.l);
                        break;
                    case 2:
                        zC = this.e.b.c(BaseShopAppFeature.T);
                        break;
                    case 3:
                        zC = this.e.b.c(BaseFeature.g);
                        break;
                    case 4:
                        zC = this.e.b.c(BaseShopAppFeature.m);
                        break;
                    default:
                        zC = this.e.b.c(ProductFeature.f);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i6 = 5;
        this.i = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.shop.contentpage.b
            public final /* synthetic */ ContentPageRepository e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i6) {
                    case 0:
                        zC = this.e.b.c(BaseShopAppFeature.g0);
                        break;
                    case 1:
                        zC = this.e.b.c(BaseShopAppFeature.l);
                        break;
                    case 2:
                        zC = this.e.b.c(BaseShopAppFeature.T);
                        break;
                    case 3:
                        zC = this.e.b.c(BaseFeature.g);
                        break;
                    case 4:
                        zC = this.e.b.c(BaseShopAppFeature.m);
                        break;
                    default:
                        zC = this.e.b.c(ProductFeature.f);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
    }

    public static ContentPageData a(ContentPageData contentPageData, List list) {
        return (list == null || !(list.isEmpty() ^ true)) ? contentPageData : ContentPageData.a(contentPageData, null, null, 47);
    }

    public static Optional f(CatalogueStoreInfo catalogueStoreInfo) {
        return catalogueStoreInfo != null ? new Optional.Present(new SpecialsHomeSaleFinderStore(catalogueStoreInfo.getStoreId(), new Optional.Present(catalogueStoreInfo.getDisplayName()), new Optional.Present(catalogueStoreInfo.getPostCode()))) : Optional.Absent.f13523a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(au.com.woolworths.shop.graphql.type.ShoppingModeType r14, java.lang.String r15, java.lang.String r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Exception {
        /*
            r13 = this;
            r0 = r17
            boolean r1 = r0 instanceof au.com.woolworths.feature.shop.contentpage.ContentPageRepository$fetchCategoryAndEventsPage$1
            if (r1 == 0) goto L15
            r1 = r0
            au.com.woolworths.feature.shop.contentpage.ContentPageRepository$fetchCategoryAndEventsPage$1 r1 = (au.com.woolworths.feature.shop.contentpage.ContentPageRepository$fetchCategoryAndEventsPage$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.r = r2
            goto L1a
        L15:
            au.com.woolworths.feature.shop.contentpage.ContentPageRepository$fetchCategoryAndEventsPage$1 r1 = new au.com.woolworths.feature.shop.contentpage.ContentPageRepository$fetchCategoryAndEventsPage$1
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.r
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            goto Lb8
        L2a:
            r0 = move-exception
            r14 = r0
            goto Lcf
        L2e:
            r0 = move-exception
            r14 = r0
            goto Ld4
        L32:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3a:
            kotlin.ResultKt.b(r0)
            au.com.woolworths.shop.graphql.type.CategoryAndEventsInput r6 = new au.com.woolworths.shop.graphql.type.CategoryAndEventsInput     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional$Present r0 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r0.<init>(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional$Present r15 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r3 = r16
            r15.<init>(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper r3 = r13.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.List r3 = r3.a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r6.<init>(r0, r14, r15, r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloClient r14 = r13.f6988a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.feature.shop.contentpage.CategoryAndEventsQuery r5 = new com.woolworths.feature.shop.contentpage.CategoryAndEventsQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            kotlin.Lazy r15 = r13.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r15 = r15.getD()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r7 = r15.booleanValue()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r15 = r13.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r0 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.q     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r8 = r15.c(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            kotlin.Lazy r15 = r13.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r15 = r15.getD()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r9 = r15.booleanValue()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            kotlin.Lazy r15 = r13.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r15 = r15.getD()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r10 = r15.booleanValue()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            kotlin.Lazy r15 = r13.h     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r15 = r15.getD()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r15.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional$Present r11 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r11.<init>(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            kotlin.Lazy r15 = r13.i     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r15 = r15.getD()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r15.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional$Present r12 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r12.<init>(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r14.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloCall r15 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r15.<init>(r14, r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r1.r = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r0 = r15.b(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            if (r0 != r2) goto Lb8
            return r2
        Lb8:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Operation$Data r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.feature.shop.contentpage.CategoryAndEventsQuery$Data r14 = (com.woolworths.feature.shop.contentpage.CategoryAndEventsQuery.Data) r14     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.feature.shop.contentpage.CategoryAndEventsQuery$CategoryAndEvents r14 = r14.f19509a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.feature.shop.contentpage.fragment.ContentPage r14 = r14.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.feature.shop.contentpage.data.ContentPageData r14 = au.com.woolworths.feature.shop.contentpage.data.ContentPageExtKt.a(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.List r15 = r0.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.feature.shop.contentpage.data.ContentPageData r14 = a(r14, r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            return r14
        Lcf:
            au.com.woolworths.android.onesite.network.ServerErrorException r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r14)
            throw r14
        Ld4:
            java.lang.Exception r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r14)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.contentpage.ContentPageRepository.b(au.com.woolworths.shop.graphql.type.ShoppingModeType, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.apollographql.apollo.api.Optional] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r17, java.lang.String r18, au.com.woolworths.shop.graphql.type.ShoppingModeType r19, java.lang.String r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws java.lang.Exception {
        /*
            r16 = this;
            r1 = r16
            r0 = r21
            boolean r2 = r0 instanceof au.com.woolworths.feature.shop.contentpage.ContentPageRepository$fetchContentPage$2
            if (r2 == 0) goto L17
            r2 = r0
            au.com.woolworths.feature.shop.contentpage.ContentPageRepository$fetchContentPage$2 r2 = (au.com.woolworths.feature.shop.contentpage.ContentPageRepository$fetchContentPage$2) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.feature.shop.contentpage.ContentPageRepository$fetchContentPage$2 r2 = new au.com.woolworths.feature.shop.contentpage.ContentPageRepository$fetchContentPage$2
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L32
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            goto Lc7
        L2c:
            r0 = move-exception
            goto Lde
        L2f:
            r0 = move-exception
            goto Le3
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3a:
            kotlin.ResultKt.b(r0)
            com.apollographql.apollo.api.Optional$Absent r0 = com.apollographql.apollo.api.Optional.Absent.f13523a
            if (r18 == 0) goto L47
            com.apollographql.apollo.api.Optional r4 = com.apollographql.apollo.api.Optional.Companion.a(r18)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r8 = r4
            goto L48
        L47:
            r8 = r0
        L48:
            if (r20 == 0) goto L4f
            com.apollographql.apollo.api.Optional r4 = com.apollographql.apollo.api.Optional.Companion.a(r20)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            goto L50
        L4f:
            r4 = r0
        L50:
            au.com.woolworths.shop.graphql.type.ContentPageExtraInput r6 = new au.com.woolworths.shop.graphql.type.ContentPageExtraInput     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper r7 = r1.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.util.List r7 = r7.a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r9 = r19
            r6.<init>(r9, r4, r7, r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.ApolloClient r0 = r1.f6988a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r4 = r6
            com.woolworths.feature.shop.contentpage.AemContentPageQuery r6 = new com.woolworths.feature.shop.contentpage.AemContentPageQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional r9 = com.apollographql.apollo.api.Optional.Companion.a(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            kotlin.Lazy r4 = r1.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Object r4 = r4.getD()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            boolean r10 = r4.booleanValue()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r4 = r1.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r7 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.q     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            boolean r11 = r4.c(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            kotlin.Lazy r4 = r1.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Object r4 = r4.getD()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            boolean r12 = r4.booleanValue()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            kotlin.Lazy r4 = r1.f     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Object r4 = r4.getD()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r4.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional r13 = com.apollographql.apollo.api.Optional.Companion.a(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            kotlin.Lazy r4 = r1.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Object r4 = r4.getD()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            boolean r14 = r4.booleanValue()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            kotlin.Lazy r4 = r1.h     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Object r4 = r4.getD()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r4.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional$Present r15 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r15.<init>(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r7 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r4.<init>(r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r2.r = r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Object r0 = r4.b(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            if (r0 != r3) goto Lc7
            return r3
        Lc7:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Operation$Data r2 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.feature.shop.contentpage.AemContentPageQuery$Data r2 = (com.woolworths.feature.shop.contentpage.AemContentPageQuery.Data) r2     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.feature.shop.contentpage.AemContentPageQuery$AemContentPage r2 = r2.f19506a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.feature.shop.contentpage.fragment.ContentPage r2 = r2.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.feature.shop.contentpage.data.ContentPageData r2 = au.com.woolworths.feature.shop.contentpage.data.ContentPageExtKt.a(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.util.List r0 = r0.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.feature.shop.contentpage.data.ContentPageData r0 = a(r2, r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            return r0
        Lde:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        Le3:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.contentpage.ContentPageRepository.c(java.lang.String, java.lang.String, au.com.woolworths.shop.graphql.type.ShoppingModeType, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(au.com.woolworths.shop.graphql.type.ShoppingModeType r6, java.lang.String r7, java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r9 instanceof au.com.woolworths.feature.shop.contentpage.ContentPageRepository$fetchMenuPage$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.feature.shop.contentpage.ContentPageRepository$fetchMenuPage$1 r0 = (au.com.woolworths.feature.shop.contentpage.ContentPageRepository$fetchMenuPage$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.contentpage.ContentPageRepository$fetchMenuPage$1 r0 = new au.com.woolworths.feature.shop.contentpage.ContentPageRepository$fetchMenuPage$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L79
        L27:
            r6 = move-exception
            goto L90
        L29:
            r6 = move-exception
            goto L95
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r9)
            au.com.woolworths.shop.graphql.type.MenuPageInput r9 = new au.com.woolworths.shop.graphql.type.MenuPageInput     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional$Present r2 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional$Present r7 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r7.<init>(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r9.<init>(r2, r6, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloClient r6 = r5.f6988a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.contentpage.MoreMenuQuery r7 = new com.woolworths.feature.shop.contentpage.MoreMenuQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            kotlin.Lazy r8 = r5.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r8 = r8.getD()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            boolean r8 = r8.booleanValue()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            kotlin.Lazy r2 = r5.h     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r2 = r2.getD()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional$Present r4 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r4.<init>(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r7.<init>(r9, r8, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r8 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r8.<init>(r6, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r9 = r8.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r9 != r1) goto L79
            return r1
        L79:
            com.apollographql.apollo.api.ApolloResponse r9 = (com.apollographql.apollo.api.ApolloResponse) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.contentpage.MoreMenuQuery$Data r6 = (com.woolworths.feature.shop.contentpage.MoreMenuQuery.Data) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.contentpage.MoreMenuQuery$MenuPage r6 = r6.f19511a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.contentpage.fragment.ContentPage r6 = r6.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.shop.contentpage.data.ContentPageData r6 = au.com.woolworths.feature.shop.contentpage.data.ContentPageExtKt.a(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.util.List r7 = r9.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.shop.contentpage.data.ContentPageData r6 = a(r6, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            return r6
        L90:
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r6)
            throw r6
        L95:
            java.lang.Exception r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.contentpage.ContentPageRepository.d(au.com.woolworths.shop.graphql.type.ShoppingModeType, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r14, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r15, au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.contentpage.ContentPageRepository.e(java.lang.String, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode, au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
