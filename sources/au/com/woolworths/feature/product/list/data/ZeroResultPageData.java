package au.com.woolworths.feature.product.list.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lau/com/woolworths/feature/product/list/data/ZeroResultPageData;", "", "title", "", RecentSearch.COLUMN_NAME_SEARCH_TERM, "message", "items", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSearchTerm", "getMessage", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ZeroResultPageData {
    public static final int $stable = 8;

    @NotNull
    private final List<Object> items;

    @Nullable
    private final String message;

    @Nullable
    private final String searchTerm;

    @Nullable
    private final String title;

    public ZeroResultPageData(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull List<? extends Object> items) {
        Intrinsics.h(items, "items");
        this.title = str;
        this.searchTerm = str2;
        this.message = str3;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZeroResultPageData copy$default(ZeroResultPageData zeroResultPageData, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zeroResultPageData.title;
        }
        if ((i & 2) != 0) {
            str2 = zeroResultPageData.searchTerm;
        }
        if ((i & 4) != 0) {
            str3 = zeroResultPageData.message;
        }
        if ((i & 8) != 0) {
            list = zeroResultPageData.items;
        }
        return zeroResultPageData.copy(str, str2, str3, list);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSearchTerm() {
        return this.searchTerm;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final List<Object> component4() {
        return this.items;
    }

    @NotNull
    public final ZeroResultPageData copy(@Nullable String title, @Nullable String searchTerm, @Nullable String message, @NotNull List<? extends Object> items) {
        Intrinsics.h(items, "items");
        return new ZeroResultPageData(title, searchTerm, message, items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZeroResultPageData)) {
            return false;
        }
        ZeroResultPageData zeroResultPageData = (ZeroResultPageData) other;
        return Intrinsics.c(this.title, zeroResultPageData.title) && Intrinsics.c(this.searchTerm, zeroResultPageData.searchTerm) && Intrinsics.c(this.message, zeroResultPageData.message) && Intrinsics.c(this.items, zeroResultPageData.items);
    }

    @NotNull
    public final List<Object> getItems() {
        return this.items;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getSearchTerm() {
        return this.searchTerm;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.searchTerm;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        return this.items.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.searchTerm;
        String str3 = this.message;
        List<Object> list = this.items;
        StringBuilder sbV = a.v("ZeroResultPageData(title=", str, ", searchTerm=", str2, ", message=");
        sbV.append(str3);
        sbV.append(", items=");
        sbV.append(list);
        sbV.append(")");
        return sbV.toString();
    }
}
