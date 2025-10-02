package au.com.woolworths.android.onesite.modules.search.searchscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.adobe.data.SearchAnalyticsMetadata;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.sdui.model.action.ActionData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract;", "", "Actions", "ViewState", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SearchContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions;", "", "PerformQuerySearch", "OpenSearchResults", "OpenBarcodeScanner", "LaunchAction", "ShowSnackbarMessage", "LaunchMarketplace", "ShowSearchSuggestion", "AutocompleteSuggestionScrolling", "OpenBuyAgain", "LaunchVoiceProductFinder", "LaunchVoiceProductSearch", "LaunchOliveChat", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$AutocompleteSuggestionScrolling;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$LaunchAction;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$LaunchMarketplace;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$LaunchOliveChat;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$LaunchVoiceProductFinder;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$LaunchVoiceProductSearch;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$OpenBarcodeScanner;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$OpenBuyAgain;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$OpenSearchResults;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$PerformQuerySearch;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$ShowSearchSuggestion;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$ShowSnackbarMessage;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$AutocompleteSuggestionScrolling;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AutocompleteSuggestionScrolling extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final AutocompleteSuggestionScrolling f4410a = new AutocompleteSuggestionScrolling();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$LaunchAction;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAction extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ActionData f4411a;

            public LaunchAction(ActionData actionData) {
                this.f4411a = actionData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchAction) && Intrinsics.c(this.f4411a, ((LaunchAction) obj).f4411a);
            }

            public final int hashCode() {
                return this.f4411a.hashCode();
            }

            public final String toString() {
                return "LaunchAction(actionData=" + this.f4411a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$LaunchMarketplace;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchMarketplace extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchMarketplace f4412a = new LaunchMarketplace();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$LaunchOliveChat;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchOliveChat extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchOliveChat f4413a = new LaunchOliveChat();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$LaunchVoiceProductFinder;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchVoiceProductFinder extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchVoiceProductFinder f4414a = new LaunchVoiceProductFinder();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$LaunchVoiceProductSearch;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchVoiceProductSearch extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchVoiceProductSearch f4415a = new LaunchVoiceProductSearch();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$OpenBarcodeScanner;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenBarcodeScanner extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f4416a;

            public OpenBarcodeScanner(boolean z) {
                this.f4416a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenBarcodeScanner) && this.f4416a == ((OpenBarcodeScanner) obj).f4416a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f4416a);
            }

            public final String toString() {
                return androidx.compose.ui.input.pointer.a.n("OpenBarcodeScanner(isInStoreMode=", ")", this.f4416a);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$OpenBuyAgain;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class OpenBuyAgain extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenBuyAgain f4417a = new OpenBuyAgain();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$OpenSearchResults;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenSearchResults extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f4418a;

            public OpenSearchResults(String query) {
                Intrinsics.h(query, "query");
                this.f4418a = query;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenSearchResults) && Intrinsics.c(this.f4418a, ((OpenSearchResults) obj).f4418a);
            }

            public final int hashCode() {
                return this.f4418a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenSearchResults(query=", this.f4418a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$PerformQuerySearch;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PerformQuerySearch extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f4419a;
            public final SearchAnalyticsMetadata b;

            public PerformQuerySearch(String query, SearchAnalyticsMetadata searchAnalyticsMetadata) {
                Intrinsics.h(query, "query");
                this.f4419a = query;
                this.b = searchAnalyticsMetadata;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PerformQuerySearch)) {
                    return false;
                }
                PerformQuerySearch performQuerySearch = (PerformQuerySearch) obj;
                return Intrinsics.c(this.f4419a, performQuerySearch.f4419a) && Intrinsics.c(this.b, performQuerySearch.b);
            }

            public final int hashCode() {
                return this.b.f4070a.hashCode() + (this.f4419a.hashCode() * 31);
            }

            public final String toString() {
                return "PerformQuerySearch(query=" + this.f4419a + ", analyticsMetadata=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$ShowSearchSuggestion;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowSearchSuggestion extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowSearchSuggestion f4420a = new ShowSearchSuggestion();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions$ShowSnackbarMessage;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbarMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f4421a;

            public ShowSnackbarMessage(Text text) {
                this.f4421a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackbarMessage) && Intrinsics.c(this.f4421a, ((ShowSnackbarMessage) obj).f4421a);
            }

            public final int hashCode() {
                return this.f4421a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("ShowSnackbarMessage(message=", this.f4421a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$ViewState;", "", "Screen", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final List f = CollectionsKt.R("Milk", "Bread", "Cheese", "Butter", "Toilet paper", "Gluten free", "Yoghurt", "Chicken", "Vegan", "Chocolate");
        public static final List g = CollectionsKt.R("Milk", "Bread", "Eggs", "Biscuits", "Butter", "Crackers", "Bananas", "Chips", "Cheese");

        /* renamed from: a, reason: collision with root package name */
        public final String f4422a;
        public final List b;
        public final Screen c;
        public final boolean d;
        public final boolean e;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$ViewState$Companion;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Companion {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f4423a;

                static {
                    int[] iArr = new int[Region.values().length];
                    try {
                        Region.Companion companion = Region.h;
                        iArr[1] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f4423a = iArr;
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchContract$ViewState$Screen;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Screen {
            public static final Screen d;
            public static final Screen e;
            public static final Screen f;
            public static final Screen g;
            public static final /* synthetic */ Screen[] h;
            public static final /* synthetic */ EnumEntries i;

            static {
                Screen screen = new Screen("CONNECTION_ERROR", 0);
                d = screen;
                Screen screen2 = new Screen("UNABLE_TO_LOAD_ERROR", 1);
                e = screen2;
                Screen screen3 = new Screen("SEARCH_RESULT", 2);
                f = screen3;
                Screen screen4 = new Screen("SUGGESTED_SEARCH", 3);
                g = screen4;
                Screen[] screenArr = {screen, screen2, screen3, screen4};
                h = screenArr;
                i = EnumEntriesKt.a(screenArr);
            }

            public static Screen valueOf(String str) {
                return (Screen) Enum.valueOf(Screen.class, str);
            }

            public static Screen[] values() {
                return (Screen[]) h.clone();
            }
        }

        public ViewState(String str, List searchableItems, Screen screen, boolean z, boolean z2) {
            Intrinsics.h(searchableItems, "searchableItems");
            Intrinsics.h(screen, "screen");
            this.f4422a = str;
            this.b = searchableItems;
            this.c = screen;
            this.d = z;
            this.e = z2;
        }

        public static ViewState a(ViewState viewState, boolean z) {
            String str = viewState.f4422a;
            List searchableItems = viewState.b;
            Screen screen = viewState.c;
            boolean z2 = viewState.d;
            Intrinsics.h(searchableItems, "searchableItems");
            Intrinsics.h(screen, "screen");
            return new ViewState(str, searchableItems, screen, z2, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f4422a, viewState.f4422a) && Intrinsics.c(this.b, viewState.b) && this.c == viewState.c && this.d == viewState.d && this.e == viewState.e;
        }

        public final int hashCode() {
            String str = this.f4422a;
            return Boolean.hashCode(this.e) + androidx.camera.core.impl.b.e((this.c.hashCode() + androidx.camera.core.impl.b.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sbS = au.com.woolworths.android.onesite.a.s("ViewState(searchTerm=", this.f4422a, ", searchableItems=", ", screen=", this.b);
            sbS.append(this.c);
            sbS.append(", showRecentSearches=");
            sbS.append(this.d);
            sbS.append(", showLoading=");
            return YU.a.k(")", sbS, this.e);
        }

        public /* synthetic */ ViewState(String str, List list, Screen screen, boolean z, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? EmptyList.d : list, (i & 4) != 0 ? Screen.g : screen, (i & 8) != 0 ? false : z, false);
        }
    }
}
