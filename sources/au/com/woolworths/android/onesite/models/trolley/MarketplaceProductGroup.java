package au.com.woolworths.android.onesite.models.trolley;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/android/onesite/models/trolley/MarketplaceProductGroup;", "", "items", "", "Lau/com/woolworths/android/onesite/models/TrolleyResult$TrolleyItem;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarketplaceProductGroup {

    @SerializedName("items")
    @NotNull
    private final List<TrolleyResult.TrolleyItem> items;

    public MarketplaceProductGroup(@NotNull List<TrolleyResult.TrolleyItem> items) {
        Intrinsics.h(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketplaceProductGroup copy$default(MarketplaceProductGroup marketplaceProductGroup, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = marketplaceProductGroup.items;
        }
        return marketplaceProductGroup.copy(list);
    }

    @NotNull
    public final List<TrolleyResult.TrolleyItem> component1() {
        return this.items;
    }

    @NotNull
    public final MarketplaceProductGroup copy(@NotNull List<TrolleyResult.TrolleyItem> items) {
        Intrinsics.h(items, "items");
        return new MarketplaceProductGroup(items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarketplaceProductGroup) && Intrinsics.c(this.items, ((MarketplaceProductGroup) other).items);
    }

    @NotNull
    public final List<TrolleyResult.TrolleyItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return a.l("MarketplaceProductGroup(items=", ")", this.items);
    }
}
