package au.com.woolworths.shop.lists.data.remote.fragment;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import com.apollographql.apollo.api.Fragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/fragment/SyncListsResponseFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "createdLists", "", "Lau/com/woolworths/shop/lists/data/remote/fragment/SyncListsResponseFragment$CreatedList;", "updatedLists", "Lau/com/woolworths/shop/lists/data/remote/fragment/SyncListsResponseFragment$UpdatedList;", "deletedLists", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCreatedLists", "()Ljava/util/List;", "getUpdatedLists", "getDeletedLists", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CreatedList", "UpdatedList", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SyncListsResponseFragment implements Fragment.Data {

    @NotNull
    private final List<CreatedList> createdLists;

    @NotNull
    private final List<String> deletedLists;

    @NotNull
    private final List<UpdatedList> updatedLists;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014JL\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\t\u0010\u0014¨\u0006#"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/fragment/SyncListsResponseFragment$CreatedList;", "", "timestamp", "", "referenceId", "", "id", "title", "color", "isWatching", "", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getTimestamp", "()D", "getReferenceId", "()Ljava/lang/String;", "getId", "getTitle", "getColor", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lau/com/woolworths/shop/lists/data/remote/fragment/SyncListsResponseFragment$CreatedList;", "equals", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CreatedList {

        @NotNull
        private final String color;

        @NotNull
        private final String id;

        @Nullable
        private final Boolean isWatching;

        @NotNull
        private final String referenceId;
        private final double timestamp;

        @NotNull
        private final String title;

        public CreatedList(double d, @NotNull String referenceId, @NotNull String id, @NotNull String title, @NotNull String color, @Nullable Boolean bool) {
            Intrinsics.h(referenceId, "referenceId");
            Intrinsics.h(id, "id");
            Intrinsics.h(title, "title");
            Intrinsics.h(color, "color");
            this.timestamp = d;
            this.referenceId = referenceId;
            this.id = id;
            this.title = title;
            this.color = color;
            this.isWatching = bool;
        }

        public static /* synthetic */ CreatedList copy$default(CreatedList createdList, double d, String str, String str2, String str3, String str4, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                d = createdList.timestamp;
            }
            double d2 = d;
            if ((i & 2) != 0) {
                str = createdList.referenceId;
            }
            String str5 = str;
            if ((i & 4) != 0) {
                str2 = createdList.id;
            }
            String str6 = str2;
            if ((i & 8) != 0) {
                str3 = createdList.title;
            }
            String str7 = str3;
            if ((i & 16) != 0) {
                str4 = createdList.color;
            }
            String str8 = str4;
            if ((i & 32) != 0) {
                bool = createdList.isWatching;
            }
            return createdList.copy(d2, str5, str6, str7, str8, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final double getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getReferenceId() {
            return this.referenceId;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final Boolean getIsWatching() {
            return this.isWatching;
        }

        @NotNull
        public final CreatedList copy(double timestamp, @NotNull String referenceId, @NotNull String id, @NotNull String title, @NotNull String color, @Nullable Boolean isWatching) {
            Intrinsics.h(referenceId, "referenceId");
            Intrinsics.h(id, "id");
            Intrinsics.h(title, "title");
            Intrinsics.h(color, "color");
            return new CreatedList(timestamp, referenceId, id, title, color, isWatching);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreatedList)) {
                return false;
            }
            CreatedList createdList = (CreatedList) other;
            return Double.compare(this.timestamp, createdList.timestamp) == 0 && Intrinsics.c(this.referenceId, createdList.referenceId) && Intrinsics.c(this.id, createdList.id) && Intrinsics.c(this.title, createdList.title) && Intrinsics.c(this.color, createdList.color) && Intrinsics.c(this.isWatching, createdList.isWatching);
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getReferenceId() {
            return this.referenceId;
        }

        public final double getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iC = b.c(b.c(b.c(b.c(Double.hashCode(this.timestamp) * 31, 31, this.referenceId), 31, this.id), 31, this.title), 31, this.color);
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
            String str = this.referenceId;
            String str2 = this.id;
            String str3 = this.title;
            String str4 = this.color;
            Boolean bool = this.isWatching;
            StringBuilder sb = new StringBuilder("CreatedList(timestamp=");
            sb.append(d);
            sb.append(", referenceId=");
            sb.append(str);
            a.B(sb, ", id=", str2, ", title=", str3);
            sb.append(", color=");
            sb.append(str4);
            sb.append(", isWatching=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/fragment/SyncListsResponseFragment$UpdatedList;", "", "__typename", "", "shoppingListFragment", "Lau/com/woolworths/shop/lists/data/remote/fragment/ShoppingListFragment;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/lists/data/remote/fragment/ShoppingListFragment;)V", "get__typename", "()Ljava/lang/String;", "getShoppingListFragment", "()Lau/com/woolworths/shop/lists/data/remote/fragment/ShoppingListFragment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdatedList {

        @NotNull
        private final String __typename;

        @NotNull
        private final ShoppingListFragment shoppingListFragment;

        public UpdatedList(@NotNull String __typename, @NotNull ShoppingListFragment shoppingListFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(shoppingListFragment, "shoppingListFragment");
            this.__typename = __typename;
            this.shoppingListFragment = shoppingListFragment;
        }

        public static /* synthetic */ UpdatedList copy$default(UpdatedList updatedList, String str, ShoppingListFragment shoppingListFragment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updatedList.__typename;
            }
            if ((i & 2) != 0) {
                shoppingListFragment = updatedList.shoppingListFragment;
            }
            return updatedList.copy(str, shoppingListFragment);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ShoppingListFragment getShoppingListFragment() {
            return this.shoppingListFragment;
        }

        @NotNull
        public final UpdatedList copy(@NotNull String __typename, @NotNull ShoppingListFragment shoppingListFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(shoppingListFragment, "shoppingListFragment");
            return new UpdatedList(__typename, shoppingListFragment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdatedList)) {
                return false;
            }
            UpdatedList updatedList = (UpdatedList) other;
            return Intrinsics.c(this.__typename, updatedList.__typename) && Intrinsics.c(this.shoppingListFragment, updatedList.shoppingListFragment);
        }

        @NotNull
        public final ShoppingListFragment getShoppingListFragment() {
            return this.shoppingListFragment;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.shoppingListFragment.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "UpdatedList(__typename=" + this.__typename + ", shoppingListFragment=" + this.shoppingListFragment + ")";
        }
    }

    public SyncListsResponseFragment(@NotNull List<CreatedList> createdLists, @NotNull List<UpdatedList> updatedLists, @NotNull List<String> deletedLists) {
        Intrinsics.h(createdLists, "createdLists");
        Intrinsics.h(updatedLists, "updatedLists");
        Intrinsics.h(deletedLists, "deletedLists");
        this.createdLists = createdLists;
        this.updatedLists = updatedLists;
        this.deletedLists = deletedLists;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncListsResponseFragment copy$default(SyncListsResponseFragment syncListsResponseFragment, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = syncListsResponseFragment.createdLists;
        }
        if ((i & 2) != 0) {
            list2 = syncListsResponseFragment.updatedLists;
        }
        if ((i & 4) != 0) {
            list3 = syncListsResponseFragment.deletedLists;
        }
        return syncListsResponseFragment.copy(list, list2, list3);
    }

    @NotNull
    public final List<CreatedList> component1() {
        return this.createdLists;
    }

    @NotNull
    public final List<UpdatedList> component2() {
        return this.updatedLists;
    }

    @NotNull
    public final List<String> component3() {
        return this.deletedLists;
    }

    @NotNull
    public final SyncListsResponseFragment copy(@NotNull List<CreatedList> createdLists, @NotNull List<UpdatedList> updatedLists, @NotNull List<String> deletedLists) {
        Intrinsics.h(createdLists, "createdLists");
        Intrinsics.h(updatedLists, "updatedLists");
        Intrinsics.h(deletedLists, "deletedLists");
        return new SyncListsResponseFragment(createdLists, updatedLists, deletedLists);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncListsResponseFragment)) {
            return false;
        }
        SyncListsResponseFragment syncListsResponseFragment = (SyncListsResponseFragment) other;
        return Intrinsics.c(this.createdLists, syncListsResponseFragment.createdLists) && Intrinsics.c(this.updatedLists, syncListsResponseFragment.updatedLists) && Intrinsics.c(this.deletedLists, syncListsResponseFragment.deletedLists);
    }

    @NotNull
    public final List<CreatedList> getCreatedLists() {
        return this.createdLists;
    }

    @NotNull
    public final List<String> getDeletedLists() {
        return this.deletedLists;
    }

    @NotNull
    public final List<UpdatedList> getUpdatedLists() {
        return this.updatedLists;
    }

    public int hashCode() {
        return this.deletedLists.hashCode() + b.d(this.createdLists.hashCode() * 31, 31, this.updatedLists);
    }

    @NotNull
    public String toString() {
        List<CreatedList> list = this.createdLists;
        List<UpdatedList> list2 = this.updatedLists;
        List<String> list3 = this.deletedLists;
        StringBuilder sb = new StringBuilder("SyncListsResponseFragment(createdLists=");
        sb.append(list);
        sb.append(", updatedLists=");
        sb.append(list2);
        sb.append(", deletedLists=");
        return android.support.v4.media.session.a.t(sb, list3, ")");
    }
}
