package au.com.woolworths.android.onesite.models.trolley;

import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/android/onesite/models/trolley/MarketplaceProducts;", "", "groups", "", "Lau/com/woolworths/android/onesite/models/trolley/MarketplaceProductGroup;", "<init>", "(Ljava/util/List;)V", "getGroups", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarketplaceProducts {

    @SerializedName("groups")
    @NotNull
    private final List<MarketplaceProductGroup> groups;

    public MarketplaceProducts(@NotNull List<MarketplaceProductGroup> groups) {
        Intrinsics.h(groups, "groups");
        this.groups = groups;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketplaceProducts copy$default(MarketplaceProducts marketplaceProducts, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = marketplaceProducts.groups;
        }
        return marketplaceProducts.copy(list);
    }

    @NotNull
    public final List<MarketplaceProductGroup> component1() {
        return this.groups;
    }

    @NotNull
    public final MarketplaceProducts copy(@NotNull List<MarketplaceProductGroup> groups) {
        Intrinsics.h(groups, "groups");
        return new MarketplaceProducts(groups);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarketplaceProducts) && Intrinsics.c(this.groups, ((MarketplaceProducts) other).groups);
    }

    @NotNull
    public final List<MarketplaceProductGroup> getGroups() {
        return this.groups;
    }

    public int hashCode() {
        return this.groups.hashCode();
    }

    @NotNull
    public String toString() {
        return a.l("MarketplaceProducts(groups=", ")", this.groups);
    }
}
