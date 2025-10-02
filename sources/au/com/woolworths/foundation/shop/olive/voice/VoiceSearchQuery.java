package au.com.woolworths.foundation.shop.olive.voice;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.olive.voice.adapter.VoiceSearchQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/VoiceSearchQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/foundation/shop/olive/voice/VoiceSearchQuery$Data;", "Data", "VoiceSearch", "Companion", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VoiceSearchQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f8815a;
    public final boolean b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/VoiceSearchQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/VoiceSearchQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final VoiceSearch f8816a;

        public Data(VoiceSearch voiceSearch) {
            this.f8816a = voiceSearch;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f8816a, ((Data) obj).f8816a);
        }

        public final int hashCode() {
            VoiceSearch voiceSearch = this.f8816a;
            if (voiceSearch == null) {
                return 0;
            }
            return voiceSearch.hashCode();
        }

        public final String toString() {
            return "Data(voiceSearch=" + this.f8816a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/VoiceSearchQuery$VoiceSearch;", "", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VoiceSearch {

        /* renamed from: a, reason: collision with root package name */
        public final String f8817a;
        public final List b;

        public VoiceSearch(String str, List list) {
            this.f8817a = str;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VoiceSearch)) {
                return false;
            }
            VoiceSearch voiceSearch = (VoiceSearch) obj;
            return Intrinsics.c(this.f8817a, voiceSearch.f8817a) && Intrinsics.c(this.b, voiceSearch.b);
        }

        public final int hashCode() {
            int iHashCode = this.f8817a.hashCode() * 31;
            List list = this.b;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.i("VoiceSearch(result=", this.f8817a, ", selectedChips=", ")", this.b);
        }
    }

    public VoiceSearchQuery(String input, boolean z) {
        Intrinsics.h(input, "input");
        this.f8815a = input;
        this.b = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(VoiceSearchQuery_ResponseAdapter.Data.f8819a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query VoiceSearch($input: String!, $includeSelectedChipsSearchFilter: Boolean!) { voiceSearch(input: $input) { result selectedChips @include(if: $includeSelectedChipsSearchFilter) } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceSearchQuery)) {
            return false;
        }
        VoiceSearchQuery voiceSearchQuery = (VoiceSearchQuery) obj;
        return Intrinsics.c(this.f8815a, voiceSearchQuery.f8815a) && this.b == voiceSearchQuery.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f8815a.hashCode() * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "264e231cb92a4906d58794a929a06ab2aeadbc97fd499f196f2e8dd6a1197811";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "VoiceSearch";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("input");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f8815a);
        jsonWriter.F1("includeSelectedChipsSearchFilter");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.b));
    }

    public final String toString() {
        return au.com.woolworths.android.onesite.a.j("VoiceSearchQuery(input=", this.f8815a, ", includeSelectedChipsSearchFilter=", this.b, ")");
    }
}
