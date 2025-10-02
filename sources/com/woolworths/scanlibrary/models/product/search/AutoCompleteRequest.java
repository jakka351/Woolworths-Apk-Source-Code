package com.woolworths.scanlibrary.models.product.search;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/models/product/search/AutoCompleteRequest;", "", RecentSearch.COLUMN_NAME_SEARCH_TERM, "", "<init>", "(Ljava/lang/String;)V", "getSearchTerm", "()Ljava/lang/String;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AutoCompleteRequest {
    public static final int $stable = 0;

    @SerializedName(RecentSearch.COLUMN_NAME_SEARCH_TERM)
    @NotNull
    private final String searchTerm;

    public AutoCompleteRequest(@NotNull String searchTerm) {
        Intrinsics.h(searchTerm, "searchTerm");
        this.searchTerm = searchTerm;
    }

    @NotNull
    public final String getSearchTerm() {
        return this.searchTerm;
    }
}
