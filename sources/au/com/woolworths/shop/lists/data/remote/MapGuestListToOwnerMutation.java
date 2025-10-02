package au.com.woolworths.shop.lists.data.remote;

import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.shop.lists.data.remote.adapter.MapGuestListToOwnerMutation_ResponseAdapter;
import au.com.woolworths.shop.lists.data.remote.adapter.MapGuestListToOwnerMutation_VariablesAdapter;
import au.com.woolworths.shop.lists.data.remote.selections.MapGuestListToOwnerMutationSelections;
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

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003 !\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006#"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/MapGuestListToOwnerMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lau/com/woolworths/shop/lists/data/remote/MapGuestListToOwnerMutation$Data;", "guestId", "", "<init>", "(Ljava/lang/String;)V", "getGuestId", "()Ljava/lang/String;", "id", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "Data", MapGuestListToOwnerMutation.OPERATION_NAME, "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MapGuestListToOwnerMutation implements Mutation<Data> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String OPERATION_ID = "24a3722c837f2efbc56916c68a8d018d3da2f1b7cadd3f815bcc45e6b62e4301";

    @NotNull
    public static final String OPERATION_NAME = "MapGuestListToOwner";

    @NotNull
    private final String guestId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/MapGuestListToOwnerMutation$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "mutation MapGuestListToOwner($guestId: ID!) { mapGuestListToOwner(guestId: $guestId) { success } }";
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/MapGuestListToOwnerMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "mapGuestListToOwner", "Lau/com/woolworths/shop/lists/data/remote/MapGuestListToOwnerMutation$MapGuestListToOwner;", "<init>", "(Lau/com/woolworths/shop/lists/data/remote/MapGuestListToOwnerMutation$MapGuestListToOwner;)V", "getMapGuestListToOwner", "()Lau/com/woolworths/shop/lists/data/remote/MapGuestListToOwnerMutation$MapGuestListToOwner;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        @NotNull
        private final MapGuestListToOwner mapGuestListToOwner;

        public Data(@NotNull MapGuestListToOwner mapGuestListToOwner) {
            Intrinsics.h(mapGuestListToOwner, "mapGuestListToOwner");
            this.mapGuestListToOwner = mapGuestListToOwner;
        }

        public static /* synthetic */ Data copy$default(Data data, MapGuestListToOwner mapGuestListToOwner, int i, Object obj) {
            if ((i & 1) != 0) {
                mapGuestListToOwner = data.mapGuestListToOwner;
            }
            return data.copy(mapGuestListToOwner);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final MapGuestListToOwner getMapGuestListToOwner() {
            return this.mapGuestListToOwner;
        }

        @NotNull
        public final Data copy(@NotNull MapGuestListToOwner mapGuestListToOwner) {
            Intrinsics.h(mapGuestListToOwner, "mapGuestListToOwner");
            return new Data(mapGuestListToOwner);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.mapGuestListToOwner, ((Data) other).mapGuestListToOwner);
        }

        @NotNull
        public final MapGuestListToOwner getMapGuestListToOwner() {
            return this.mapGuestListToOwner;
        }

        public int hashCode() {
            return this.mapGuestListToOwner.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(mapGuestListToOwner=" + this.mapGuestListToOwner + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/MapGuestListToOwnerMutation$MapGuestListToOwner;", "", "success", "", "<init>", "(Z)V", "getSuccess", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public MapGuestListToOwnerMutation(@NotNull String guestId) {
        Intrinsics.h(guestId, "guestId");
        this.guestId = guestId;
    }

    public static /* synthetic */ MapGuestListToOwnerMutation copy$default(MapGuestListToOwnerMutation mapGuestListToOwnerMutation, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mapGuestListToOwnerMutation.guestId;
        }
        return mapGuestListToOwnerMutation.copy(str);
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(MapGuestListToOwnerMutation_ResponseAdapter.Data.INSTANCE, false);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getGuestId() {
        return this.guestId;
    }

    @NotNull
    public final MapGuestListToOwnerMutation copy(@NotNull String guestId) {
        Intrinsics.h(guestId, "guestId");
        return new MapGuestListToOwnerMutation(guestId);
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
        return (other instanceof MapGuestListToOwnerMutation) && Intrinsics.c(this.guestId, ((MapGuestListToOwnerMutation) other).guestId);
    }

    @NotNull
    public final String getGuestId() {
        return this.guestId;
    }

    public int hashCode() {
        return this.guestId.hashCode();
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
        builder.e(MapGuestListToOwnerMutationSelections.INSTANCE.get__root());
        return builder.c();
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        MapGuestListToOwnerMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        return YU.a.h("MapGuestListToOwnerMutation(guestId=", this.guestId, ")");
    }
}
