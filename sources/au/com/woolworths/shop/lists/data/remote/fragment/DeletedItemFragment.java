package au.com.woolworths.shop.lists.data.remote.fragment;

import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/fragment/DeletedItemFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "timestamp", "", "id", "", "<init>", "(DLjava/lang/String;)V", "getTimestamp", "()D", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeletedItemFragment implements Fragment.Data {

    @NotNull
    private final String id;
    private final double timestamp;

    public DeletedItemFragment(double d, @NotNull String id) {
        Intrinsics.h(id, "id");
        this.timestamp = d;
        this.id = id;
    }

    public static /* synthetic */ DeletedItemFragment copy$default(DeletedItemFragment deletedItemFragment, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = deletedItemFragment.timestamp;
        }
        if ((i & 2) != 0) {
            str = deletedItemFragment.id;
        }
        return deletedItemFragment.copy(d, str);
    }

    /* renamed from: component1, reason: from getter */
    public final double getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final DeletedItemFragment copy(double timestamp, @NotNull String id) {
        Intrinsics.h(id, "id");
        return new DeletedItemFragment(timestamp, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeletedItemFragment)) {
            return false;
        }
        DeletedItemFragment deletedItemFragment = (DeletedItemFragment) other;
        return Double.compare(this.timestamp, deletedItemFragment.timestamp) == 0 && Intrinsics.c(this.id, deletedItemFragment.id);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final double getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.id.hashCode() + (Double.hashCode(this.timestamp) * 31);
    }

    @NotNull
    public String toString() {
        return "DeletedItemFragment(timestamp=" + this.timestamp + ", id=" + this.id + ")";
    }
}
