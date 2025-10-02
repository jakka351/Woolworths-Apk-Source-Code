package au.com.woolworths.foundation.shop.olive.voice;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/SearchResult;", "", "Success", "ProductListConnectionError", "ProductListEmptyState", "ProductListNoResultsState", "ProductListServerError", "Lau/com/woolworths/foundation/shop/olive/voice/SearchResult$ProductListConnectionError;", "Lau/com/woolworths/foundation/shop/olive/voice/SearchResult$ProductListEmptyState;", "Lau/com/woolworths/foundation/shop/olive/voice/SearchResult$ProductListNoResultsState;", "Lau/com/woolworths/foundation/shop/olive/voice/SearchResult$ProductListServerError;", "Lau/com/woolworths/foundation/shop/olive/voice/SearchResult$Success;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SearchResult {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/SearchResult$ProductListConnectionError;", "Lau/com/woolworths/foundation/shop/olive/voice/SearchResult;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListConnectionError extends SearchResult {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductListConnectionError f8810a = new ProductListConnectionError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProductListConnectionError);
        }

        public final int hashCode() {
            return -1612612979;
        }

        public final String toString() {
            return "ProductListConnectionError";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/SearchResult$ProductListEmptyState;", "Lau/com/woolworths/foundation/shop/olive/voice/SearchResult;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListEmptyState extends SearchResult {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductListEmptyState f8811a = new ProductListEmptyState();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProductListEmptyState);
        }

        public final int hashCode() {
            return -773591903;
        }

        public final String toString() {
            return "ProductListEmptyState";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/SearchResult$ProductListNoResultsState;", "Lau/com/woolworths/foundation/shop/olive/voice/SearchResult;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListNoResultsState extends SearchResult {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductListNoResultsState f8812a = new ProductListNoResultsState();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProductListNoResultsState);
        }

        public final int hashCode() {
            return -9188999;
        }

        public final String toString() {
            return "ProductListNoResultsState";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/SearchResult$ProductListServerError;", "Lau/com/woolworths/foundation/shop/olive/voice/SearchResult;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListServerError extends SearchResult {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductListServerError f8813a = new ProductListServerError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProductListServerError);
        }

        public final int hashCode() {
            return -176809272;
        }

        public final String toString() {
            return "ProductListServerError";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/SearchResult$Success;", "Lau/com/woolworths/foundation/shop/olive/voice/SearchResult;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success extends SearchResult {

        /* renamed from: a, reason: collision with root package name */
        public static final Success f8814a = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return 1278736211;
        }

        public final String toString() {
            return "Success";
        }
    }
}
