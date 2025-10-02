package au.com.woolworths.feature.shop.ask.olive;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.feature.shop.ask.olive.adapter.ChatbotFeedQuery_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ChatbotFeedQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/feature/shop/ask/olive/ChatbotFeedQuery$Data;", "Data", "More", "Feed", "OnMoreChat", "Companion", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChatbotFeedQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f6602a;
    public final ShoppingModeType b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ChatbotFeedQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ChatbotFeedQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final More f6603a;

        public Data(More more) {
            this.f6603a = more;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f6603a, ((Data) obj).f6603a);
        }

        public final int hashCode() {
            return this.f6603a.f6605a.hashCode();
        }

        public final String toString() {
            return "Data(more=" + this.f6603a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ChatbotFeedQuery$Feed;", "", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Feed {

        /* renamed from: a, reason: collision with root package name */
        public final String f6604a;
        public final OnMoreChat b;

        public Feed(String __typename, OnMoreChat onMoreChat) {
            Intrinsics.h(__typename, "__typename");
            this.f6604a = __typename;
            this.b = onMoreChat;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Feed)) {
                return false;
            }
            Feed feed = (Feed) obj;
            return Intrinsics.c(this.f6604a, feed.f6604a) && Intrinsics.c(this.b, feed.b);
        }

        public final int hashCode() {
            int iHashCode = this.f6604a.hashCode() * 31;
            OnMoreChat onMoreChat = this.b;
            return iHashCode + (onMoreChat == null ? 0 : onMoreChat.hashCode());
        }

        public final String toString() {
            return "Feed(__typename=" + this.f6604a + ", onMoreChat=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ChatbotFeedQuery$More;", "", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class More {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f6605a;

        public More(ArrayList arrayList) {
            this.f6605a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof More) && this.f6605a.equals(((More) obj).f6605a);
        }

        public final int hashCode() {
            return this.f6605a.hashCode();
        }

        public final String toString() {
            return a.k("More(feed=", ")", this.f6605a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ChatbotFeedQuery$OnMoreChat;", "", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMoreChat {

        /* renamed from: a, reason: collision with root package name */
        public final String f6606a;
        public final String b;
        public final String c;

        public OnMoreChat(String str, String str2, String str3) {
            this.f6606a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMoreChat)) {
                return false;
            }
            OnMoreChat onMoreChat = (OnMoreChat) obj;
            return Intrinsics.c(this.f6606a, onMoreChat.f6606a) && Intrinsics.c(this.b, onMoreChat.b) && Intrinsics.c(this.c, onMoreChat.c);
        }

        public final int hashCode() {
            int iHashCode = this.f6606a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("OnMoreChat(title=", this.f6606a, ", subtitle=", this.b, ", url="), this.c, ")");
        }
    }

    public ChatbotFeedQuery(Optional optional, ShoppingModeType mode) {
        Intrinsics.h(mode, "mode");
        this.f6602a = optional;
        this.b = mode;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ChatbotFeedQuery_ResponseAdapter.Data.f6609a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query ChatbotFeed($storeId: String, $mode: ShoppingModeType!) { more(storeId: $storeId, mode: $mode) { feed { __typename ... on MoreChat { title subtitle url } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatbotFeedQuery)) {
            return false;
        }
        ChatbotFeedQuery chatbotFeedQuery = (ChatbotFeedQuery) obj;
        return Intrinsics.c(this.f6602a, chatbotFeedQuery.f6602a) && this.b == chatbotFeedQuery.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6602a.hashCode() * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "b2c547798751e9e037367b7857d1a20a03d71d88013de72ccf6de4b4b28d6e90";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ChatbotFeed";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f6602a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("storeId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        jsonWriter.F1("mode");
        ShoppingModeType_ResponseAdapter.b(jsonWriter, customScalarAdapters, this.b);
    }

    public final String toString() {
        return "ChatbotFeedQuery(storeId=" + this.f6602a + ", mode=" + this.b + ")";
    }
}
