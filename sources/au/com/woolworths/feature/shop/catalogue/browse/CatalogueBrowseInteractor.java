package au.com.woolworths.feature.shop.catalogue.browse;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseInteractor;", "", "BrowsePagingSource", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatalogueBrowseInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final CatalogueBrowseRepository f6795a;
    public final CollectionModeInteractor b;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseInteractor$BrowsePagingSource;", "Landroidx/paging/PagingSource;", "", "Lau/com/woolworths/feature/shop/catalogue/browse/model/BrowsePage;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class BrowsePagingSource extends PagingSource<Integer, BrowsePage> {
        public final String b;

        public BrowsePagingSource(String str) {
            this.b = str;
        }

        @Override // androidx.paging.PagingSource
        public final Object b(PagingState pagingState) {
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        @Override // androidx.paging.PagingSource
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object d(androidx.paging.PagingSource.LoadParams r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 255
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseInteractor.BrowsePagingSource.d(androidx.paging.PagingSource$LoadParams, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseInteractor$Companion;", "", "", "PAGE_FETCH_SIZE", "I", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public CatalogueBrowseInteractor(CatalogueBrowseRepository catalogueBrowseRepository, CollectionModeInteractor collectionModeInteractor) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        this.f6795a = catalogueBrowseRepository;
        this.b = collectionModeInteractor;
    }
}
