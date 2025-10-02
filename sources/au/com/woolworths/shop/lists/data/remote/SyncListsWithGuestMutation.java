package au.com.woolworths.shop.lists.data.remote;

import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.shop.graphql.type.SyncListsInput;
import au.com.woolworths.shop.lists.data.remote.adapter.SyncListsWithGuestMutation_ResponseAdapter;
import au.com.woolworths.shop.lists.data.remote.adapter.SyncListsWithGuestMutation_VariablesAdapter;
import au.com.woolworths.shop.lists.data.remote.fragment.SyncListsResponseFragment;
import au.com.woolworths.shop.lists.data.remote.selections.SyncListsWithGuestMutationSelections;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004)*+,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J'\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006-"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListsWithGuestMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lau/com/woolworths/shop/lists/data/remote/SyncListsWithGuestMutation$Data;", "syncListsInput", "Lau/com/woolworths/shop/graphql/type/SyncListsInput;", "guestId", "", "includeWatchlist", "", "<init>", "(Lau/com/woolworths/shop/graphql/type/SyncListsInput;Ljava/lang/String;Z)V", "getSyncListsInput", "()Lau/com/woolworths/shop/graphql/type/SyncListsInput;", "getGuestId", "()Ljava/lang/String;", "getIncludeWatchlist", "()Z", "id", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "Data", MapGuestListToOwnerMutation.OPERATION_NAME, SyncListsMutation.OPERATION_NAME, "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SyncListsWithGuestMutation implements Mutation<Data> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String OPERATION_ID = "aa95993d3254ccf9c03678aed14b304e2bddf950c941203d8e2f8a59da4d3510";

    @NotNull
    public static final String OPERATION_NAME = "SyncListsWithGuest";

    @NotNull
    private final String guestId;
    private final boolean includeWatchlist;

    @NotNull
    private final SyncListsInput syncListsInput;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListsWithGuestMutation$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "mutation SyncListsWithGuest($syncListsInput: SyncListsInput!, $guestId: ID!, $includeWatchlist: Boolean!) { mapGuestListToOwner(guestId: $guestId) { success } syncLists(syncListsInput: $syncListsInput) { __typename ...syncListsResponseFragment } }  fragment shoppingListFragment on ListResponse { timestamp id title color isWatching @include(if: $includeWatchlist) }  fragment syncListsResponseFragment on SyncListsResponse { createdLists { timestamp referenceId id title color isWatching @include(if: $includeWatchlist) } updatedLists { __typename ...shoppingListFragment } deletedLists }";
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListsWithGuestMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "mapGuestListToOwner", "Lau/com/woolworths/shop/lists/data/remote/SyncListsWithGuestMutation$MapGuestListToOwner;", "syncLists", "Lau/com/woolworths/shop/lists/data/remote/SyncListsWithGuestMutation$SyncLists;", "<init>", "(Lau/com/woolworths/shop/lists/data/remote/SyncListsWithGuestMutation$MapGuestListToOwner;Lau/com/woolworths/shop/lists/data/remote/SyncListsWithGuestMutation$SyncLists;)V", "getMapGuestListToOwner", "()Lau/com/woolworths/shop/lists/data/remote/SyncListsWithGuestMutation$MapGuestListToOwner;", "getSyncLists", "()Lau/com/woolworths/shop/lists/data/remote/SyncListsWithGuestMutation$SyncLists;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        @NotNull
        private final MapGuestListToOwner mapGuestListToOwner;

        @NotNull
        private final SyncLists syncLists;

        public Data(@NotNull MapGuestListToOwner mapGuestListToOwner, @NotNull SyncLists syncLists) {
            Intrinsics.h(mapGuestListToOwner, "mapGuestListToOwner");
            Intrinsics.h(syncLists, "syncLists");
            this.mapGuestListToOwner = mapGuestListToOwner;
            this.syncLists = syncLists;
        }

        public static /* synthetic */ Data copy$default(Data data, MapGuestListToOwner mapGuestListToOwner, SyncLists syncLists, int i, Object obj) {
            if ((i & 1) != 0) {
                mapGuestListToOwner = data.mapGuestListToOwner;
            }
            if ((i & 2) != 0) {
                syncLists = data.syncLists;
            }
            return data.copy(mapGuestListToOwner, syncLists);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final MapGuestListToOwner getMapGuestListToOwner() {
            return this.mapGuestListToOwner;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final SyncLists getSyncLists() {
            return this.syncLists;
        }

        @NotNull
        public final Data copy(@NotNull MapGuestListToOwner mapGuestListToOwner, @NotNull SyncLists syncLists) {
            Intrinsics.h(mapGuestListToOwner, "mapGuestListToOwner");
            Intrinsics.h(syncLists, "syncLists");
            return new Data(mapGuestListToOwner, syncLists);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.c(this.mapGuestListToOwner, data.mapGuestListToOwner) && Intrinsics.c(this.syncLists, data.syncLists);
        }

        @NotNull
        public final MapGuestListToOwner getMapGuestListToOwner() {
            return this.mapGuestListToOwner;
        }

        @NotNull
        public final SyncLists getSyncLists() {
            return this.syncLists;
        }

        public int hashCode() {
            return this.syncLists.hashCode() + (this.mapGuestListToOwner.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Data(mapGuestListToOwner=" + this.mapGuestListToOwner + ", syncLists=" + this.syncLists + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListsWithGuestMutation$MapGuestListToOwner;", "", "success", "", "<init>", "(Z)V", "getSuccess", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MapGuestListToOwner {
        private final boolean success;

        public MapGuestListToOwner(boolean z) {
            this.success = z;
        }

        public static /* synthetic */ MapGuestListToOwner copy$default(MapGuestListToOwner mapGuestListToOwner, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = mapGuestListToOwner.success;
            }
            return mapGuestListToOwner.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        @NotNull
        public final MapGuestListToOwner copy(boolean success) {
            return new MapGuestListToOwner(success);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MapGuestListToOwner) && this.success == ((MapGuestListToOwner) other).success;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return Boolean.hashCode(this.success);
        }

        @NotNull
        public String toString() {
            return a.n("MapGuestListToOwner(success=", ")", this.success);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListsWithGuestMutation$SyncLists;", "", "__typename", "", "syncListsResponseFragment", "Lau/com/woolworths/shop/lists/data/remote/fragment/SyncListsResponseFragment;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/lists/data/remote/fragment/SyncListsResponseFragment;)V", "get__typename", "()Ljava/lang/String;", "getSyncListsResponseFragment", "()Lau/com/woolworths/shop/lists/data/remote/fragment/SyncListsResponseFragment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SyncLists {

        @NotNull
        private final String __typename;

        @NotNull
        private final SyncListsResponseFragment syncListsResponseFragment;

        public SyncLists(@NotNull String __typename, @NotNull SyncListsResponseFragment syncListsResponseFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(syncListsResponseFragment, "syncListsResponseFragment");
            this.__typename = __typename;
            this.syncListsResponseFragment = syncListsResponseFragment;
        }

        public static /* synthetic */ SyncLists copy$default(SyncLists syncLists, String str, SyncListsResponseFragment syncListsResponseFragment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = syncLists.__typename;
            }
            if ((i & 2) != 0) {
                syncListsResponseFragment = syncLists.syncListsResponseFragment;
            }
            return syncLists.copy(str, syncListsResponseFragment);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final SyncListsResponseFragment getSyncListsResponseFragment() {
            return this.syncListsResponseFragment;
        }

        @NotNull
        public final SyncLists copy(@NotNull String __typename, @NotNull SyncListsResponseFragment syncListsResponseFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(syncListsResponseFragment, "syncListsResponseFragment");
            return new SyncLists(__typename, syncListsResponseFragment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SyncLists)) {
                return false;
            }
            SyncLists syncLists = (SyncLists) other;
            return Intrinsics.c(this.__typename, syncLists.__typename) && Intrinsics.c(this.syncListsResponseFragment, syncLists.syncListsResponseFragment);
        }

        @NotNull
        public final SyncListsResponseFragment getSyncListsResponseFragment() {
            return this.syncListsResponseFragment;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.syncListsResponseFragment.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SyncLists(__typename=" + this.__typename + ", syncListsResponseFragment=" + this.syncListsResponseFragment + ")";
        }
    }

    public SyncListsWithGuestMutation(@NotNull SyncListsInput syncListsInput, @NotNull String guestId, boolean z) {
        Intrinsics.h(syncListsInput, "syncListsInput");
        Intrinsics.h(guestId, "guestId");
        this.syncListsInput = syncListsInput;
        this.guestId = guestId;
        this.includeWatchlist = z;
    }

    public static /* synthetic */ SyncListsWithGuestMutation copy$default(SyncListsWithGuestMutation syncListsWithGuestMutation, SyncListsInput syncListsInput, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            syncListsInput = syncListsWithGuestMutation.syncListsInput;
        }
        if ((i & 2) != 0) {
            str = syncListsWithGuestMutation.guestId;
        }
        if ((i & 4) != 0) {
            z = syncListsWithGuestMutation.includeWatchlist;
        }
        return syncListsWithGuestMutation.copy(syncListsInput, str, z);
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(SyncListsWithGuestMutation_ResponseAdapter.Data.INSTANCE, false);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SyncListsInput getSyncListsInput() {
        return this.syncListsInput;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getGuestId() {
        return this.guestId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIncludeWatchlist() {
        return this.includeWatchlist;
    }

    @NotNull
    public final SyncListsWithGuestMutation copy(@NotNull SyncListsInput syncListsInput, @NotNull String guestId, boolean includeWatchlist) {
        Intrinsics.h(syncListsInput, "syncListsInput");
        Intrinsics.h(guestId, "guestId");
        return new SyncListsWithGuestMutation(syncListsInput, guestId, includeWatchlist);
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncListsWithGuestMutation)) {
            return false;
        }
        SyncListsWithGuestMutation syncListsWithGuestMutation = (SyncListsWithGuestMutation) other;
        return Intrinsics.c(this.syncListsInput, syncListsWithGuestMutation.syncListsInput) && Intrinsics.c(this.guestId, syncListsWithGuestMutation.guestId) && this.includeWatchlist == syncListsWithGuestMutation.includeWatchlist;
    }

    @NotNull
    public final String getGuestId() {
        return this.guestId;
    }

    public final boolean getIncludeWatchlist() {
        return this.includeWatchlist;
    }

    @NotNull
    public final SyncListsInput getSyncListsInput() {
        return this.syncListsInput;
    }

    public int hashCode() {
        return Boolean.hashCode(this.includeWatchlist) + b.c(this.syncListsInput.hashCode() * 31, 31, this.guestId);
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String name() {
        return OPERATION_NAME;
    }

    @NotNull
    public CompiledField rootField() {
        CompiledField.Builder builder = new CompiledField.Builder("data", au.com.woolworths.shop.graphql.type.Mutation.G0);
        builder.e(SyncListsWithGuestMutationSelections.INSTANCE.get__root());
        return builder.c();
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        SyncListsWithGuestMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        SyncListsInput syncListsInput = this.syncListsInput;
        String str = this.guestId;
        boolean z = this.includeWatchlist;
        StringBuilder sb = new StringBuilder("SyncListsWithGuestMutation(syncListsInput=");
        sb.append(syncListsInput);
        sb.append(", guestId=");
        sb.append(str);
        sb.append(", includeWatchlist=");
        return YU.a.k(")", sb, z);
    }
}
