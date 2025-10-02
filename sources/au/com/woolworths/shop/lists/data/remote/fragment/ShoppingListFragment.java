package au.com.woolworths.shop.lists.data.remote.fragment;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\b\u0010\u0012¨\u0006!"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/fragment/ShoppingListFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "timestamp", "", "id", "", "title", "color", "isWatching", "", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getTimestamp", "()D", "getId", "()Ljava/lang/String;", "getTitle", "getColor", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lau/com/woolworths/shop/lists/data/remote/fragment/ShoppingListFragment;", "equals", "other", "", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShoppingListFragment implements Fragment.Data {

    @NotNull
    private final String color;

    @NotNull
    private final String id;

    @Nullable
    private final Boolean isWatching;
    private final double timestamp;

    @NotNull
    private final String title;

    public ShoppingListFragment(double d, @NotNull String id, @NotNull String title, @NotNull String color, @Nullable Boolean bool) {
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        Intrinsics.h(color, "color");
        this.timestamp = d;
        this.id = id;
        this.title = title;
        this.color = color;
        this.isWatching = bool;
    }

    public static /* synthetic */ ShoppingListFragment copy$default(ShoppingListFragment shoppingListFragment, double d, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            d = shoppingListFragment.timestamp;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            str = shoppingListFragment.id;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = shoppingListFragment.title;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = shoppingListFragment.color;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            bool = shoppingListFragment.isWatching;
        }
        return shoppingListFragment.copy(d2, str4, str5, str6, bool);
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
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Boolean getIsWatching() {
        return this.isWatching;
    }

    @NotNull
    public final ShoppingListFragment copy(double timestamp, @NotNull String id, @NotNull String title, @NotNull String color, @Nullable Boolean isWatching) {
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        Intrinsics.h(color, "color");
        return new ShoppingListFragment(timestamp, id, title, color, isWatching);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingListFragment)) {
            return false;
        }
        ShoppingListFragment shoppingListFragment = (ShoppingListFragment) other;
        return Double.compare(this.timestamp, shoppingListFragment.timestamp) == 0 && Intrinsics.c(this.id, shoppingListFragment.id) && Intrinsics.c(this.title, shoppingListFragment.title) && Intrinsics.c(this.color, shoppingListFragment.color) && Intrinsics.c(this.isWatching, shoppingListFragment.isWatching);
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final double getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iC = b.c(b.c(b.c(Double.hashCode(this.timestamp) * 31, 31, this.id), 31, this.title), 31, this.color);
        Boolean bool = this.isWatching;
        return iC + (bool == null ? 0 : bool.hashCode());
    }

    @Nullable
    public final Boolean isWatching() {
        return this.isWatching;
    }

    @NotNull
    public String toString() {
        double d = this.timestamp;
        String str = this.id;
        String str2 = this.title;
        String str3 = this.color;
        Boolean bool = this.isWatching;
        StringBuilder sb = new StringBuilder("ShoppingListFragment(timestamp=");
        sb.append(d);
        sb.append(", id=");
        sb.append(str);
        a.B(sb, ", title=", str2, ", color=", str3);
        sb.append(", isWatching=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }
}
