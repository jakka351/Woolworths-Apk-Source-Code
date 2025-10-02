package au.com.woolworths.base.rewards.account.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.rewards.account.DeleteLiteCardMutation;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/rewards/account/adapter/DeleteLiteCardMutation_ResponseAdapter;", "", "<init>", "()V", "Data", "DeleteLiteCard", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeleteLiteCardMutation_ResponseAdapter {

    @NotNull
    public static final DeleteLiteCardMutation_ResponseAdapter INSTANCE = new DeleteLiteCardMutation_ResponseAdapter();

    @StabilityInferred
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/base/rewards/account/adapter/DeleteLiteCardMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/base/rewards/account/DeleteLiteCardMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lau/com/woolworths/base/rewards/account/DeleteLiteCardMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "value", "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lau/com/woolworths/base/rewards/account/DeleteLiteCardMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<DeleteLiteCardMutation.Data> {

        @NotNull
        public static final Data INSTANCE = new Data();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("deleteLiteCard");
        public static final int $stable = 8;

        private Data() {
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public DeleteLiteCardMutation.Data fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DeleteLiteCardMutation.DeleteLiteCard deleteLiteCard = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                deleteLiteCard = (DeleteLiteCardMutation.DeleteLiteCard) Adapters.b(Adapters.c(DeleteLiteCard.INSTANCE, false)).fromJson(reader, customScalarAdapters);
            }
            return new DeleteLiteCardMutation.Data(deleteLiteCard);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull DeleteLiteCardMutation.Data value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("deleteLiteCard");
            Adapters.b(Adapters.c(DeleteLiteCard.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getDeleteLiteCard());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/base/rewards/account/adapter/DeleteLiteCardMutation_ResponseAdapter$DeleteLiteCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/base/rewards/account/DeleteLiteCardMutation$DeleteLiteCard;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lau/com/woolworths/base/rewards/account/DeleteLiteCardMutation$DeleteLiteCard;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "value", "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lau/com/woolworths/base/rewards/account/DeleteLiteCardMutation$DeleteLiteCard;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeleteLiteCard implements Adapter<DeleteLiteCardMutation.DeleteLiteCard> {

        @NotNull
        public static final DeleteLiteCard INSTANCE = new DeleteLiteCard();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("success");
        public static final int $stable = 8;

        private DeleteLiteCard() {
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public DeleteLiteCardMutation.DeleteLiteCard fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
            }
            if (bool != null) {
                return new DeleteLiteCardMutation.DeleteLiteCard(bool.booleanValue());
            }
            Assertions.a(reader, "success");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull DeleteLiteCardMutation.DeleteLiteCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("success");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getSuccess()));
        }
    }

    private DeleteLiteCardMutation_ResponseAdapter() {
    }
}
