package com.woolworths.scanlibrary.models.product.search;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/woolworths/scanlibrary/models/product/search/ProductSearchRequest;", "", RecentSearch.COLUMN_NAME_SEARCH_TERM, "", "nextpageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSearchTerm", "()Ljava/lang/String;", "getNextpageUrl", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductSearchRequest {
    public static final int $stable = 0;

    @SerializedName("nextpageUrl")
    @NotNull
    private final String nextpageUrl;

    @SerializedName(RecentSearch.COLUMN_NAME_SEARCH_TERM)
    @NotNull
    private final String searchTerm;

    public ProductSearchRequest(@NotNull String searchTerm, @NotNull String nextpageUrl) {
        Intrinsics.h(searchTerm, "searchTerm");
        Intrinsics.h(nextpageUrl, "nextpageUrl");
        this.searchTerm = searchTerm;
        this.nextpageUrl = nextpageUrl;
    }

    @NotNull
    public final String getNextpageUrl() {
        return this.nextpageUrl;
    }

    @NotNull
    public final String getSearchTerm() {
        return this.searchTerm;
    }

    public /* synthetic */ ProductSearchRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }
}
