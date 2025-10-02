package au.com.woolworths.base.rewards.account;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.rewards.account.adapter.DeleteLiteCardMutation_ResponseAdapter;
import au.com.woolworths.base.rewards.account.adapter.DeleteLiteCardMutation_VariablesAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\"#!B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\bJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\b¨\u0006$"}, d2 = {"Lau/com/woolworths/base/rewards/account/DeleteLiteCardMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lau/com/woolworths/base/rewards/account/DeleteLiteCardMutation$Data;", "", "registerId", "<init>", "(Ljava/lang/String;)V", "id", "()Ljava/lang/String;", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRegisterId", "Companion", "Data", "DeleteLiteCard", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeleteLiteCardMutation implements Mutation<Data> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String registerId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lau/com/woolworths/base/rewards/account/DeleteLiteCardMutation$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "mutation DeleteLiteCard($registerId: String!) { deleteLiteCard(registerId: $registerId) { success } }";
        }

        private Companion() {
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/base/rewards/account/DeleteLiteCardMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lau/com/woolworths/base/rewards/account/DeleteLiteCardMutation$DeleteLiteCard;", "deleteLiteCard", "<init>", "(Lau/com/woolworths/base/rewards/account/DeleteLiteCardMutation$DeleteLiteCard;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lau/com/woolworths/base/rewards/account/DeleteLiteCardMutation$DeleteLiteCard;", "getDeleteLiteCard", "()Lau/com/woolworths/base/rewards/account/DeleteLiteCardMutation$DeleteLiteCard;", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        @Nullable
        private final DeleteLiteCard deleteLiteCard;

        public Data(@Nullable DeleteLiteCard deleteLiteCard) {
            this.deleteLiteCard = deleteLiteCard;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.deleteLiteCard, ((Data) other).deleteLiteCard);
        }

        @Nullable
        public final DeleteLiteCard getDeleteLiteCard() {
            return this.deleteLiteCard;
        }

        public int hashCode() {
            DeleteLiteCard deleteLiteCard = this.deleteLiteCard;
            if (deleteLiteCard == null) {
                return 0;
            }
            return deleteLiteCard.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(deleteLiteCard=" + this.deleteLiteCard + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/base/rewards/account/DeleteLiteCardMutation$DeleteLiteCard;", "", "", "success", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "()Z", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeleteLiteCard {
        private final boolean success;

        public DeleteLiteCard(boolean z) {
            this.success = z;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeleteLiteCard) && this.success == ((DeleteLiteCard) other).success;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return Boolean.hashCode(this.success);
        }

        @NotNull
        public String toString() {
            return androidx.compose.ui.input.pointer.a.n("DeleteLiteCard(success=", ")", this.success);
        }
    }

    public DeleteLiteCardMutation(@NotNull String registerId) {
        Intrinsics.h(registerId, "registerId");
        this.registerId = registerId;
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(DeleteLiteCardMutation_ResponseAdapter.Data.INSTANCE, false);
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
        return (other instanceof DeleteLiteCardMutation) && Intrinsics.c(this.registerId, ((DeleteLiteCardMutation) other).registerId);
    }

    @NotNull
    public final String getRegisterId() {
        return this.registerId;
    }

    public int hashCode() {
        return this.registerId.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String id() {
        return "e3f63d7fb15aa20963be9487d9d11dc2f5dbc409315c03ae15c520cbc496b6e8";
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String name() {
        return "DeleteLiteCard";
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        DeleteLiteCardMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        return YU.a.h("DeleteLiteCardMutation(registerId=", this.registerId, ")");
    }
}
