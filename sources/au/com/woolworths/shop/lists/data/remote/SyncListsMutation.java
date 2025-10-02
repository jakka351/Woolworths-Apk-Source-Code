package au.com.woolworths.shop.lists.data.remote;

import au.com.woolworths.shop.graphql.type.SyncListsInput;
import au.com.woolworths.shop.lists.data.remote.adapter.SyncListsMutation_ResponseAdapter;
import au.com.woolworths.shop.lists.data.remote.adapter.SyncListsMutation_VariablesAdapter;
import au.com.woolworths.shop.lists.data.remote.fragment.SyncListsResponseFragment;
import au.com.woolworths.shop.lists.data.remote.selections.SyncListsMutationSelections;
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

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003%&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006("}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListsMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lau/com/woolworths/shop/lists/data/remote/SyncListsMutation$Data;", "syncListsInput", "Lau/com/woolworths/shop/graphql/type/SyncListsInput;", "includeWatchlist", "", "<init>", "(Lau/com/woolworths/shop/graphql/type/SyncListsInput;Z)V", "getSyncListsInput", "()Lau/com/woolworths/shop/graphql/type/SyncListsInput;", "getIncludeWatchlist", "()Z", "id", "", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "Data", SyncListsMutation.OPERATION_NAME, "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SyncListsMutation implements Mutation<Data> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String OPERATION_ID = "1df78085e21592873c86cc310b0d84e03c9cca90a78b3f54a2795604970f40f3";

    @NotNull
    public static final String OPERATION_NAME = "SyncLists";
    private final boolean includeWatchlist;

    @NotNull
    private final SyncListsInput syncListsInput;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListsMutation$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "mutation SyncLists($syncListsInput: SyncListsInput!, $includeWatchlist: Boolean!) { syncLists(syncListsInput: $syncListsInput) { __typename ...syncListsResponseFragment } }  fragment shoppingListFragment on ListResponse { timestamp id title color isWatching @include(if: $includeWatchlist) }  fragment syncListsResponseFragment on SyncListsResponse { createdLists { timestamp referenceId id title color isWatching @include(if: $includeWatchlist) } updatedLists { __typename ...shoppingListFragment } deletedLists }";
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListsMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "syncLists", "Lau/com/woolworths/shop/lists/data/remote/SyncListsMutation$SyncLists;", "<init>", "(Lau/com/woolworths/shop/lists/data/remote/SyncListsMutation$SyncLists;)V", "getSyncLists", "()Lau/com/woolworths/shop/lists/data/remote/SyncListsMutation$SyncLists;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        @NotNull
        private final SyncLists syncLists;

        public Data(@NotNull SyncLists syncLists) {
            Intrinsics.h(syncLists, "syncLists");
            this.syncLists = syncLists;
        }

        public static /* synthetic */ Data copy$default(Data data, SyncLists syncLists, int i, Object obj) {
            if ((i & 1) != 0) {
                syncLists = data.syncLists;
            }
            return data.copy(syncLists);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SyncLists getSyncLists() {
            return this.syncLists;
        }

        @NotNull
        public final Data copy(@NotNull SyncLists syncLists) {
            Intrinsics.h(syncLists, "syncLists");
            return new Data(syncLists);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.syncLists, ((Data) other).syncLists);
        }

        @NotNull
        public final SyncLists getSyncLists() {
            return this.syncLists;
        }

        public int hashCode() {
            return this.syncLists.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(syncLists=" + this.syncLists + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListsMutation$SyncLists;", "", "__typename", "", "syncListsResponseFragment", "Lau/com/woolworths/shop/lists/data/remote/fragment/SyncListsResponseFragment;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/lists/data/remote/fragment/SyncListsResponseFragment;)V", "get__typename", "()Ljava/lang/String;", "getSyncListsResponseFragment", "()Lau/com/woolworths/shop/lists/data/remote/fragment/SyncListsResponseFragment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public SyncListsMutation(@NotNull SyncListsInput syncListsInput, boolean z) {
        Intrinsics.h(syncListsInput, "syncListsInput");
        this.syncListsInput = syncListsInput;
        this.includeWatchlist = z;
    }

    public static /* synthetic */ SyncListsMutation copy$default(SyncListsMutation syncListsMutation, SyncListsInput syncListsInput, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            syncListsInput = syncListsMutation.syncListsInput;
        }
        if ((i & 2) != 0) {
            z = syncListsMutation.includeWatchlist;
        }
        return syncListsMutation.copy(syncListsInput, z);
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(SyncListsMutation_ResponseAdapter.Data.INSTANCE, false);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SyncListsInput getSyncListsInput() {
        return this.syncListsInput;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIncludeWatchlist() {
        return this.includeWatchlist;
    }

    @NotNull
    public final SyncListsMutation copy(@NotNull SyncListsInput syncListsInput, boolean includeWatchlist) {
        Intrinsics.h(syncListsInput, "syncListsInput");
        return new SyncListsMutation(syncListsInput, includeWatchlist);
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
        if (!(other instanceof SyncListsMutation)) {
            return false;
        }
        SyncListsMutation syncListsMutation = (SyncListsMutation) other;
        return Intrinsics.c(this.syncListsInput, syncListsMutation.syncListsInput) && this.includeWatchlist == syncListsMutation.includeWatchlist;
    }

    public final boolean getIncludeWatchlist() {
        return this.includeWatchlist;
    }

    @NotNull
    public final SyncListsInput getSyncListsInput() {
        return this.syncListsInput;
    }

    public int hashCode() {
        return Boolean.hashCode(this.includeWatchlist) + (this.syncListsInput.hashCode() * 31);
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
        builder.e(SyncListsMutationSelections.INSTANCE.get__root());
        return builder.c();
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        SyncListsMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        return "SyncListsMutation(syncListsInput=" + this.syncListsInput + ", includeWatchlist=" + this.includeWatchlist + ")";
    }
}
