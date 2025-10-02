package au.com.woolworths.feature.shop.catalogue.listing.promotion;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/PromotionListingInteractor;", "", "ListingPagingSource", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PromotionListingInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final PromotionListingRepository f6884a;
    public final CollectionModeInteractor b;
    public final ArrayList c;
    public final MutableStateFlow d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/PromotionListingInteractor$Companion;", "", "", "PAGE_FETCH_SIZE", "I", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/PromotionListingInteractor$ListingPagingSource;", "Landroidx/paging/PagingSource;", "", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class ListingPagingSource extends PagingSource<Integer, Object> {
        public final String b;
        public final /* synthetic */ PromotionListingInteractor c;

        public ListingPagingSource(PromotionListingInteractor promotionListingInteractor, String promotionId) {
            Intrinsics.h(promotionId, "promotionId");
            this.c = promotionListingInteractor;
            this.b = promotionId;
        }

        @Override // androidx.paging.PagingSource
        public final Object b(PagingState pagingState) {
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // androidx.paging.PagingSource
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object d(androidx.paging.PagingSource.LoadParams r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Exception {
            /*
                r10 = this;
                boolean r0 = r12 instanceof au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingInteractor$ListingPagingSource$load$1
                if (r0 == 0) goto L14
                r0 = r12
                au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingInteractor$ListingPagingSource$load$1 r0 = (au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingInteractor$ListingPagingSource$load$1) r0
                int r1 = r0.s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.s = r1
            L12:
                r7 = r0
                goto L1a
            L14:
                au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingInteractor$ListingPagingSource$load$1 r0 = new au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingInteractor$ListingPagingSource$load$1
                r0.<init>(r10, r12)
                goto L12
            L1a:
                java.lang.Object r12 = r7.q
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r7.s
                au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingInteractor r8 = r10.c
                r9 = 1
                if (r1 == 0) goto L3b
                if (r1 != r9) goto L33
                int r11 = r7.p
                kotlin.ResultKt.b(r12)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                goto L69
            L2d:
                r0 = move-exception
                r11 = r0
                goto L92
            L30:
                r0 = move-exception
                r11 = r0
                goto L98
            L33:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L3b:
                kotlin.ResultKt.b(r12)
                java.lang.Object r11 = r11.getC()
                java.lang.Integer r11 = (java.lang.Integer) r11
                if (r11 == 0) goto L4c
                int r11 = r11.intValue()
                r3 = r11
                goto L4d
            L4c:
                r3 = r9
            L4d:
                au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingRepository r1 = r8.f6884a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r11 = r8.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                java.lang.String r5 = r11.a()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r4 = r11.w()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                java.lang.String r6 = r10.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                r7.p = r3     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                r7.s = r9     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                r2 = 20
                java.lang.Object r12 = r1.a(r2, r3, r4, r5, r6, r7)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                if (r12 != r0) goto L68
                return r0
            L68:
                r11 = r3
            L69:
                au.com.woolworths.feature.shop.catalogue.listing.promotion.model.PromotionListing r12 = (au.com.woolworths.feature.shop.catalogue.listing.promotion.model.PromotionListing) r12     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                au.com.woolworths.feature.shop.catalogue.listing.promotion.model.ListingHeader r0 = r12.f6907a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                if (r0 == 0) goto L74
                kotlinx.coroutines.flow.MutableStateFlow r1 = r8.d     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                r1.f(r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
            L74:
                java.util.ArrayList r12 = r12.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                java.util.ArrayList r0 = r8.c     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                r0.addAll(r12)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                int r0 = r12.size()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                r1 = 20
                r2 = 0
                if (r0 >= r1) goto L86
                r0 = r2
                goto L8c
            L86:
                int r11 = r11 + r9
                java.lang.Integer r0 = new java.lang.Integer     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                r0.<init>(r11)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
            L8c:
                androidx.paging.PagingSource$LoadResult$Page r11 = new androidx.paging.PagingSource$LoadResult$Page     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                r11.<init>(r12, r2, r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2d au.com.woolworths.android.onesite.network.NoConnectivityException -> L30
                return r11
            L92:
                androidx.paging.PagingSource$LoadResult$Error r12 = new androidx.paging.PagingSource$LoadResult$Error
                r12.<init>(r11)
                return r12
            L98:
                androidx.paging.PagingSource$LoadResult$Error r12 = new androidx.paging.PagingSource$LoadResult$Error
                r12.<init>(r11)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingInteractor.ListingPagingSource.d(androidx.paging.PagingSource$LoadParams, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    public PromotionListingInteractor(PromotionListingRepository promotionListingRepository, CollectionModeInteractor collectionModeInteractor) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        this.f6884a = promotionListingRepository;
        this.b = collectionModeInteractor;
        this.c = new ArrayList();
        this.d = StateFlowKt.a(null);
    }
}
