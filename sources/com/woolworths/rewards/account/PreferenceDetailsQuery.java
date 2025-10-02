package com.woolworths.rewards.account;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.account.adapter.PreferenceDetailsQuery_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/woolworths/rewards/account/PreferenceDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/rewards/account/PreferenceDetailsQuery$Data;", "Data", "PreferenceDetails", "Detail", "OnPreferenceDetailsHeader", "OnPreferenceDetailsToggleGroup", "Toggle", "Analytics", "OnPreferenceDetailsText", "OnPreferenceDetailsFooter", "Button", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PreferenceDetailsQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20541a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/PreferenceDetailsQuery$Analytics;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f20542a;

        public Analytics(String str) {
            this.f20542a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics) && Intrinsics.c(this.f20542a, ((Analytics) obj).f20542a);
        }

        public final int hashCode() {
            return this.f20542a.hashCode();
        }

        public final String toString() {
            return a.h("Analytics(label=", this.f20542a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/PreferenceDetailsQuery$Button;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f20543a;
        public final String b;

        public Button(String str, String str2) {
            this.f20543a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f20543a, button.f20543a) && Intrinsics.c(this.b, button.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20543a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Button(label=", this.f20543a, ", url=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/account/PreferenceDetailsQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/PreferenceDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final PreferenceDetails f20544a;

        public Data(PreferenceDetails preferenceDetails) {
            this.f20544a = preferenceDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20544a, ((Data) obj).f20544a);
        }

        public final int hashCode() {
            PreferenceDetails preferenceDetails = this.f20544a;
            if (preferenceDetails == null) {
                return 0;
            }
            return preferenceDetails.hashCode();
        }

        public final String toString() {
            return "Data(preferenceDetails=" + this.f20544a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/PreferenceDetailsQuery$Detail;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Detail {

        /* renamed from: a, reason: collision with root package name */
        public final String f20545a;
        public final OnPreferenceDetailsHeader b;
        public final OnPreferenceDetailsToggleGroup c;
        public final OnPreferenceDetailsText d;
        public final OnPreferenceDetailsFooter e;

        public Detail(String __typename, OnPreferenceDetailsHeader onPreferenceDetailsHeader, OnPreferenceDetailsToggleGroup onPreferenceDetailsToggleGroup, OnPreferenceDetailsText onPreferenceDetailsText, OnPreferenceDetailsFooter onPreferenceDetailsFooter) {
            Intrinsics.h(__typename, "__typename");
            this.f20545a = __typename;
            this.b = onPreferenceDetailsHeader;
            this.c = onPreferenceDetailsToggleGroup;
            this.d = onPreferenceDetailsText;
            this.e = onPreferenceDetailsFooter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Detail)) {
                return false;
            }
            Detail detail = (Detail) obj;
            return Intrinsics.c(this.f20545a, detail.f20545a) && Intrinsics.c(this.b, detail.b) && Intrinsics.c(this.c, detail.c) && Intrinsics.c(this.d, detail.d) && Intrinsics.c(this.e, detail.e);
        }

        public final int hashCode() {
            int iHashCode = this.f20545a.hashCode() * 31;
            OnPreferenceDetailsHeader onPreferenceDetailsHeader = this.b;
            int iHashCode2 = (iHashCode + (onPreferenceDetailsHeader == null ? 0 : onPreferenceDetailsHeader.hashCode())) * 31;
            OnPreferenceDetailsToggleGroup onPreferenceDetailsToggleGroup = this.c;
            int iHashCode3 = (iHashCode2 + (onPreferenceDetailsToggleGroup == null ? 0 : onPreferenceDetailsToggleGroup.hashCode())) * 31;
            OnPreferenceDetailsText onPreferenceDetailsText = this.d;
            int iHashCode4 = (iHashCode3 + (onPreferenceDetailsText == null ? 0 : onPreferenceDetailsText.hashCode())) * 31;
            OnPreferenceDetailsFooter onPreferenceDetailsFooter = this.e;
            return iHashCode4 + (onPreferenceDetailsFooter != null ? onPreferenceDetailsFooter.hashCode() : 0);
        }

        public final String toString() {
            return "Detail(__typename=" + this.f20545a + ", onPreferenceDetailsHeader=" + this.b + ", onPreferenceDetailsToggleGroup=" + this.c + ", onPreferenceDetailsText=" + this.d + ", onPreferenceDetailsFooter=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/PreferenceDetailsQuery$OnPreferenceDetailsFooter;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPreferenceDetailsFooter {

        /* renamed from: a, reason: collision with root package name */
        public final String f20546a;
        public final Button b;

        public OnPreferenceDetailsFooter(String str, Button button) {
            this.f20546a = str;
            this.b = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPreferenceDetailsFooter)) {
                return false;
            }
            OnPreferenceDetailsFooter onPreferenceDetailsFooter = (OnPreferenceDetailsFooter) obj;
            return Intrinsics.c(this.f20546a, onPreferenceDetailsFooter.f20546a) && Intrinsics.c(this.b, onPreferenceDetailsFooter.b);
        }

        public final int hashCode() {
            String str = this.f20546a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Button button = this.b;
            return iHashCode + (button != null ? button.hashCode() : 0);
        }

        public final String toString() {
            return "OnPreferenceDetailsFooter(body=" + this.f20546a + ", button=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/PreferenceDetailsQuery$OnPreferenceDetailsHeader;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPreferenceDetailsHeader {

        /* renamed from: a, reason: collision with root package name */
        public final String f20547a;
        public final String b;
        public final String c;
        public final String d;

        public OnPreferenceDetailsHeader(String str, String str2, String str3, String str4) {
            this.f20547a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPreferenceDetailsHeader)) {
                return false;
            }
            OnPreferenceDetailsHeader onPreferenceDetailsHeader = (OnPreferenceDetailsHeader) obj;
            return Intrinsics.c(this.f20547a, onPreferenceDetailsHeader.f20547a) && Intrinsics.c(this.b, onPreferenceDetailsHeader.b) && Intrinsics.c(this.c, onPreferenceDetailsHeader.c) && Intrinsics.c(this.d, onPreferenceDetailsHeader.d);
        }

        public final int hashCode() {
            int iHashCode = this.f20547a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(a.v("OnPreferenceDetailsHeader(title=", this.f20547a, ", subtitle=", this.b, ", imageUrl="), this.c, ", body=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/PreferenceDetailsQuery$OnPreferenceDetailsText;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPreferenceDetailsText {

        /* renamed from: a, reason: collision with root package name */
        public final String f20548a;
        public final String b;

        public OnPreferenceDetailsText(String str, String str2) {
            this.f20548a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPreferenceDetailsText)) {
                return false;
            }
            OnPreferenceDetailsText onPreferenceDetailsText = (OnPreferenceDetailsText) obj;
            return Intrinsics.c(this.f20548a, onPreferenceDetailsText.f20548a) && Intrinsics.c(this.b, onPreferenceDetailsText.b);
        }

        public final int hashCode() {
            String str = this.f20548a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.j("OnPreferenceDetailsText(body=", this.f20548a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/PreferenceDetailsQuery$OnPreferenceDetailsToggleGroup;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPreferenceDetailsToggleGroup {

        /* renamed from: a, reason: collision with root package name */
        public final String f20549a;
        public final String b;
        public final List c;

        public OnPreferenceDetailsToggleGroup(String str, String str2, List list) {
            this.f20549a = str;
            this.b = str2;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPreferenceDetailsToggleGroup)) {
                return false;
            }
            OnPreferenceDetailsToggleGroup onPreferenceDetailsToggleGroup = (OnPreferenceDetailsToggleGroup) obj;
            return Intrinsics.c(this.f20549a, onPreferenceDetailsToggleGroup.f20549a) && Intrinsics.c(this.b, onPreferenceDetailsToggleGroup.b) && Intrinsics.c(this.c, onPreferenceDetailsToggleGroup.c);
        }

        public final int hashCode() {
            String str = this.f20549a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List list = this.c;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return android.support.v4.media.session.a.t(a.v("OnPreferenceDetailsToggleGroup(groupTitle=", this.f20549a, ", description=", this.b, ", toggles="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/PreferenceDetailsQuery$PreferenceDetails;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PreferenceDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f20550a;
        public final List b;
        public final String c;

        public PreferenceDetails(String str, List list, String str2) {
            this.f20550a = str;
            this.b = list;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreferenceDetails)) {
                return false;
            }
            PreferenceDetails preferenceDetails = (PreferenceDetails) obj;
            return Intrinsics.c(this.f20550a, preferenceDetails.f20550a) && Intrinsics.c(this.b, preferenceDetails.b) && Intrinsics.c(this.c, preferenceDetails.c);
        }

        public final int hashCode() {
            String str = this.f20550a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List list = this.b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.o(au.com.woolworths.android.onesite.a.s("PreferenceDetails(title=", this.f20550a, ", details=", ", message=", this.b), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/PreferenceDetailsQuery$Toggle;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Toggle {

        /* renamed from: a, reason: collision with root package name */
        public final String f20551a;
        public final String b;
        public final boolean c;
        public final String d;
        public final String e;
        public final Analytics f;
        public final String g;

        public Toggle(String str, String str2, boolean z, String str3, String str4, Analytics analytics, String str5) {
            this.f20551a = str;
            this.b = str2;
            this.c = z;
            this.d = str3;
            this.e = str4;
            this.f = analytics;
            this.g = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Toggle)) {
                return false;
            }
            Toggle toggle = (Toggle) obj;
            return Intrinsics.c(this.f20551a, toggle.f20551a) && Intrinsics.c(this.b, toggle.b) && this.c == toggle.c && Intrinsics.c(this.d, toggle.d) && Intrinsics.c(this.e, toggle.e) && Intrinsics.c(this.f, toggle.f) && Intrinsics.c(this.g, toggle.g);
        }

        public final int hashCode() {
            int iHashCode = this.f20551a.hashCode() * 31;
            String str = this.b;
            int iC = b.c(b.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
            String str2 = this.e;
            int iC2 = b.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f.f20542a);
            String str3 = this.g;
            return iC2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Toggle(title=", this.f20551a, ", subtitle=", this.b, ", value=");
            au.com.woolworths.android.onesite.a.y(", id=", this.d, ", altText=", sbV, this.c);
            sbV.append(this.e);
            sbV.append(", analytics=");
            sbV.append(this.f);
            sbV.append(", iconUrl=");
            return a.o(sbV, this.g, ")");
        }
    }

    public PreferenceDetailsQuery(String str) {
        this.f20541a = str;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(PreferenceDetailsQuery_ResponseAdapter.Data.f20618a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query PreferenceDetails($key: String!) { preferenceDetails(key: $key) { title details { __typename ... on PreferenceDetailsHeader { title subtitle imageUrl body } ... on PreferenceDetailsToggleGroup { groupTitle description toggles { title subtitle value id altText analytics { label } iconUrl } } ... on PreferenceDetailsText { body altText } ... on PreferenceDetailsFooter { body button { label url } } } message } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreferenceDetailsQuery) && Intrinsics.c(this.f20541a, ((PreferenceDetailsQuery) obj).f20541a);
    }

    public final int hashCode() {
        return this.f20541a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "abcd773e3985203af8b577c620942a7dffe184ce31b009bda00d413e83dc2267";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "PreferenceDetails";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("key");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20541a);
    }

    public final String toString() {
        return a.h("PreferenceDetailsQuery(key=", this.f20541a, ")");
    }
}
