package au.com.woolworths.shop.lists.data.model;

import android.support.v4.media.session.a;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.pagingutils.NumericPageData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\rJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/SuggestedLists;", "Lau/com/woolworths/pagingutils/NumericPageData;", "Lau/com/woolworths/shop/lists/data/model/SuggestedListItem;", "totalCount", "", "nextPageKey", "items", "", "<init>", "(ILjava/lang/Integer;Ljava/util/List;)V", "getTotalCount", "()I", "getNextPageKey", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/util/List;)Lau/com/woolworths/shop/lists/data/model/SuggestedLists;", "equals", "", "other", "", "hashCode", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SuggestedLists implements NumericPageData<SuggestedListItem> {

    @NotNull
    private final List<SuggestedListItem> items;

    @MappedName
    @Nullable
    private final Integer nextPageKey;

    @MappedName
    private final int totalCount;

    public SuggestedLists(int i, @Nullable Integer num, @NotNull List<SuggestedListItem> items) {
        Intrinsics.h(items, "items");
        this.totalCount = i;
        this.nextPageKey = num;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuggestedLists copy$default(SuggestedLists suggestedLists, int i, Integer num, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = suggestedLists.totalCount;
        }
        if ((i2 & 2) != 0) {
            num = suggestedLists.nextPageKey;
        }
        if ((i2 & 4) != 0) {
            list = suggestedLists.items;
        }
        return suggestedLists.copy(i, num, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getNextPageKey() {
        return this.nextPageKey;
    }

    @NotNull
    public final List<SuggestedListItem> component3() {
        return this.items;
    }

    @NotNull
    public final SuggestedLists copy(int totalCount, @Nullable Integer nextPageKey, @NotNull List<SuggestedListItem> items) {
        Intrinsics.h(items, "items");
        return new SuggestedLists(totalCount, nextPageKey, items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestedLists)) {
            return false;
        }
        SuggestedLists suggestedLists = (SuggestedLists) other;
        return this.totalCount == suggestedLists.totalCount && Intrinsics.c(this.nextPageKey, suggestedLists.nextPageKey) && Intrinsics.c(this.items, suggestedLists.items);
    }

    @Override // au.com.woolworths.pagingutils.PageData
    @NotNull
    public List<SuggestedListItem> getItems() {
        return this.items;
    }

    @Override // au.com.woolworths.pagingutils.PageData
    public int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.totalCount) * 31;
        Integer num = this.nextPageKey;
        return this.items.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.totalCount;
        Integer num = this.nextPageKey;
        List<SuggestedListItem> list = this.items;
        StringBuilder sb = new StringBuilder("SuggestedLists(totalCount=");
        sb.append(i);
        sb.append(", nextPageKey=");
        sb.append(num);
        sb.append(", items=");
        return a.t(sb, list, ")");
    }

    @Override // au.com.woolworths.pagingutils.PageData
    @Nullable
    public Integer getNextPageKey() {
        return this.nextPageKey;
    }
}
