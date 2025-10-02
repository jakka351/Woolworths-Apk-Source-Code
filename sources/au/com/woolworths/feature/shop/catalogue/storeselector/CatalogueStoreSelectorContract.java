package au.com.woolworths.feature.shop.catalogue.storeselector;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreSearchListInfo;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/storeselector/CatalogueStoreSelectorContract;", "", "Actions", "ViewState", "PageState", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CatalogueStoreSelectorContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/storeselector/CatalogueStoreSelectorContract$Actions;", "", "PickStoreForCatalogue", "Lau/com/woolworths/feature/shop/catalogue/storeselector/CatalogueStoreSelectorContract$Actions$PickStoreForCatalogue;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/storeselector/CatalogueStoreSelectorContract$Actions$PickStoreForCatalogue;", "Lau/com/woolworths/feature/shop/catalogue/storeselector/CatalogueStoreSelectorContract$Actions;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PickStoreForCatalogue extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final CatalogueStoreInfo f6950a;

            public PickStoreForCatalogue(CatalogueStoreInfo storeInfo) {
                Intrinsics.h(storeInfo, "storeInfo");
                this.f6950a = storeInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PickStoreForCatalogue) && Intrinsics.c(this.f6950a, ((PickStoreForCatalogue) obj).f6950a);
            }

            public final int hashCode() {
                return this.f6950a.hashCode();
            }

            public final String toString() {
                return "PickStoreForCatalogue(storeInfo=" + this.f6950a + ")";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/storeselector/CatalogueStoreSelectorContract$PageState;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PageState {
        public static final PageState d;
        public static final PageState e;
        public static final PageState f;
        public static final PageState g;
        public static final /* synthetic */ PageState[] h;
        public static final /* synthetic */ EnumEntries i;

        static {
            PageState pageState = new PageState("LOADING", 0);
            d = pageState;
            PageState pageState2 = new PageState("CLEAR_STORES", 1);
            e = pageState2;
            PageState pageState3 = new PageState("STORE_LIST", 2);
            f = pageState3;
            PageState pageState4 = new PageState("ERROR", 3);
            g = pageState4;
            PageState[] pageStateArr = {pageState, pageState2, pageState3, pageState4};
            h = pageStateArr;
            i = EnumEntriesKt.a(pageStateArr);
        }

        public static PageState valueOf(String str) {
            return (PageState) Enum.valueOf(PageState.class, str);
        }

        public static PageState[] values() {
            return (PageState[]) h.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/storeselector/CatalogueStoreSelectorContract$ViewState;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final PageState f6951a;
        public final CatalogueStoreSelectorErrorState b;
        public final CatalogueStoreSearchListInfo c;

        public ViewState(PageState pageState, CatalogueStoreSelectorErrorState catalogueStoreSelectorErrorState, CatalogueStoreSearchListInfo catalogueStoreSearchListInfo) {
            this.f6951a = pageState;
            this.b = catalogueStoreSelectorErrorState;
            this.c = catalogueStoreSearchListInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f6951a == viewState.f6951a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c);
        }

        public final int hashCode() {
            int iHashCode = this.f6951a.hashCode() * 31;
            CatalogueStoreSelectorErrorState catalogueStoreSelectorErrorState = this.b;
            return this.c.hashCode() + ((iHashCode + (catalogueStoreSelectorErrorState == null ? 0 : catalogueStoreSelectorErrorState.hashCode())) * 31);
        }

        public final String toString() {
            return "ViewState(pageState=" + this.f6951a + ", errorState=" + this.b + ", storeList=" + this.c + ")";
        }
    }
}
