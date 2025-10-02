package au.com.woolworths.feature.shop.notification.preferences;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.shop.notification.preferences.adapter.PreferencesDetailsQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$Data;", "Data", "Preferences", "Detail", "OnPreferenceText", "OnPreferenceToggleGroup", "Toggle", "Analytics", "Preview", "Entry", "Companion", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PreferencesDetailsQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f7891a;
    public final Optional b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$Analytics;", "", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f7892a;

        public Analytics(String str) {
            this.f7892a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics) && Intrinsics.c(this.f7892a, ((Analytics) obj).f7892a);
        }

        public final int hashCode() {
            return this.f7892a.hashCode();
        }

        public final String toString() {
            return a.h("Analytics(label=", this.f7892a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final Preferences f7893a;

        public Data(Preferences preferences) {
            this.f7893a = preferences;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f7893a, ((Data) obj).f7893a);
        }

        public final int hashCode() {
            Preferences preferences = this.f7893a;
            if (preferences == null) {
                return 0;
            }
            return preferences.hashCode();
        }

        public final String toString() {
            return "Data(preferences=" + this.f7893a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$Detail;", "", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Detail {

        /* renamed from: a, reason: collision with root package name */
        public final String f7894a;
        public final OnPreferenceText b;
        public final OnPreferenceToggleGroup c;

        public Detail(String __typename, OnPreferenceText onPreferenceText, OnPreferenceToggleGroup onPreferenceToggleGroup) {
            Intrinsics.h(__typename, "__typename");
            this.f7894a = __typename;
            this.b = onPreferenceText;
            this.c = onPreferenceToggleGroup;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Detail)) {
                return false;
            }
            Detail detail = (Detail) obj;
            return Intrinsics.c(this.f7894a, detail.f7894a) && Intrinsics.c(this.b, detail.b) && Intrinsics.c(this.c, detail.c);
        }

        public final int hashCode() {
            int iHashCode = this.f7894a.hashCode() * 31;
            OnPreferenceText onPreferenceText = this.b;
            int iHashCode2 = (iHashCode + (onPreferenceText == null ? 0 : onPreferenceText.hashCode())) * 31;
            OnPreferenceToggleGroup onPreferenceToggleGroup = this.c;
            return iHashCode2 + (onPreferenceToggleGroup != null ? onPreferenceToggleGroup.hashCode() : 0);
        }

        public final String toString() {
            return "Detail(__typename=" + this.f7894a + ", onPreferenceText=" + this.b + ", onPreferenceToggleGroup=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$Entry;", "", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Entry {

        /* renamed from: a, reason: collision with root package name */
        public final String f7895a;
        public final String b;
        public final String c;

        public Entry(String str, String str2, String str3) {
            this.f7895a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return Intrinsics.c(this.f7895a, entry.f7895a) && Intrinsics.c(this.b, entry.b) && Intrinsics.c(this.c, entry.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f7895a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(a.v("Entry(__typename=", this.f7895a, ", imageUrl=", this.b, ", altText="), this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$OnPreferenceText;", "", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPreferenceText {

        /* renamed from: a, reason: collision with root package name */
        public final String f7896a;
        public final String b;
        public final String c;

        public OnPreferenceText(String str, String str2, String str3) {
            this.f7896a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPreferenceText)) {
                return false;
            }
            OnPreferenceText onPreferenceText = (OnPreferenceText) obj;
            return Intrinsics.c(this.f7896a, onPreferenceText.f7896a) && Intrinsics.c(this.b, onPreferenceText.b) && Intrinsics.c(this.c, onPreferenceText.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f7896a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(a.v("OnPreferenceText(__typename=", this.f7896a, ", body=", this.b, ", altText="), this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$OnPreferenceToggleGroup;", "", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPreferenceToggleGroup {

        /* renamed from: a, reason: collision with root package name */
        public final String f7897a;
        public final String b;
        public final String c;
        public final ArrayList d;

        public OnPreferenceToggleGroup(String str, String str2, String str3, ArrayList arrayList) {
            this.f7897a = str;
            this.b = str2;
            this.c = str3;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPreferenceToggleGroup)) {
                return false;
            }
            OnPreferenceToggleGroup onPreferenceToggleGroup = (OnPreferenceToggleGroup) obj;
            return this.f7897a.equals(onPreferenceToggleGroup.f7897a) && Intrinsics.c(this.b, onPreferenceToggleGroup.b) && Intrinsics.c(this.c, onPreferenceToggleGroup.c) && this.d.equals(onPreferenceToggleGroup.d);
        }

        public final int hashCode() {
            int iHashCode = this.f7897a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnPreferenceToggleGroup(__typename=", this.f7897a, ", groupTitle=", this.b, ", description=");
            sbV.append(this.c);
            sbV.append(", toggles=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$Preferences;", "", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Preferences {

        /* renamed from: a, reason: collision with root package name */
        public final String f7898a;
        public final String b;
        public final ArrayList c;

        public Preferences(String str, String str2, ArrayList arrayList) {
            this.f7898a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Preferences)) {
                return false;
            }
            Preferences preferences = (Preferences) obj;
            return this.f7898a.equals(preferences.f7898a) && Intrinsics.c(this.b, preferences.b) && this.c.equals(preferences.c);
        }

        public final int hashCode() {
            int iHashCode = this.f7898a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", a.v("Preferences(__typename=", this.f7898a, ", title=", this.b, ", details="), this.c);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$Preview;", "", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Preview {

        /* renamed from: a, reason: collision with root package name */
        public final String f7899a;
        public final String b;
        public final ArrayList c;
        public final String d;

        public Preview(String str, String str2, String str3, ArrayList arrayList) {
            this.f7899a = str;
            this.b = str2;
            this.c = arrayList;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Preview)) {
                return false;
            }
            Preview preview = (Preview) obj;
            return this.f7899a.equals(preview.f7899a) && Intrinsics.c(this.b, preview.b) && this.c.equals(preview.c) && Intrinsics.c(this.d, preview.d);
        }

        public final int hashCode() {
            int iHashCode = this.f7899a.hashCode() * 31;
            String str = this.b;
            int iB = androidx.compose.ui.input.pointer.a.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
            String str2 = this.d;
            return iB + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Preview(__typename=", this.f7899a, ", badge=", this.b, ", entries=");
            sbV.append(this.c);
            sbV.append(", footer=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/PreferencesDetailsQuery$Toggle;", "", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Toggle {

        /* renamed from: a, reason: collision with root package name */
        public final String f7900a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final Analytics f;
        public final String g;
        public final String h;
        public final Preview i;
        public final String j;

        public Toggle(String str, String str2, String str3, boolean z, String str4, Analytics analytics, String str5, String str6, Preview preview, String str7) {
            this.f7900a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = str4;
            this.f = analytics;
            this.g = str5;
            this.h = str6;
            this.i = preview;
            this.j = str7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Toggle)) {
                return false;
            }
            Toggle toggle = (Toggle) obj;
            return Intrinsics.c(this.f7900a, toggle.f7900a) && Intrinsics.c(this.b, toggle.b) && Intrinsics.c(this.c, toggle.c) && this.d == toggle.d && Intrinsics.c(this.e, toggle.e) && Intrinsics.c(this.f, toggle.f) && Intrinsics.c(this.g, toggle.g) && Intrinsics.c(this.h, toggle.h) && Intrinsics.c(this.i, toggle.i) && Intrinsics.c(this.j, toggle.j);
        }

        public final int hashCode() {
            int iC = b.c(this.f7900a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iC2 = b.c(b.c(b.e((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f.f7892a);
            String str2 = this.g;
            int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.h;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            Preview preview = this.i;
            int iHashCode3 = (iHashCode2 + (preview == null ? 0 : preview.hashCode())) * 31;
            String str4 = this.j;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Toggle(__typename=", this.f7900a, ", title=", this.b, ", subtitle=");
            d.A(this.c, ", value=", ", id=", sbV, this.d);
            sbV.append(this.e);
            sbV.append(", analytics=");
            sbV.append(this.f);
            sbV.append(", iconUrl=");
            androidx.constraintlayout.core.state.a.B(sbV, this.g, ", altText=", this.h, ", preview=");
            sbV.append(this.i);
            sbV.append(", footer=");
            sbV.append(this.j);
            sbV.append(")");
            return sbV.toString();
        }
    }

    public PreferencesDetailsQuery(Optional optional, Optional optional2) {
        this.f7891a = optional;
        this.b = optional2;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(PreferencesDetailsQuery_ResponseAdapter.Data.f7916a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query PreferencesDetails($key: String, $supportedToggles: [String!]) { preferences(key: $key, supportedToggles: $supportedToggles) { __typename title details { __typename ... on PreferenceText { __typename body altText } ... on PreferenceToggleGroup { __typename groupTitle description toggles { __typename title subtitle value id analytics { label } iconUrl altText preview { __typename badge entries { __typename imageUrl altText } footer } footer } } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferencesDetailsQuery)) {
            return false;
        }
        PreferencesDetailsQuery preferencesDetailsQuery = (PreferencesDetailsQuery) obj;
        return Intrinsics.c(this.f7891a, preferencesDetailsQuery.f7891a) && Intrinsics.c(this.b, preferencesDetailsQuery.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7891a.hashCode() * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "9560e79b4867638ee7ac4715b293b29432e70d39254122ca1c50ef3d3895e9f3";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "PreferencesDetails";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f7891a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("key");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        Optional optional2 = this.b;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("supportedToggles");
            Adapters.d(Adapters.b(Adapters.a(Adapters.f13493a))).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        }
    }

    public final String toString() {
        return "PreferencesDetailsQuery(key=" + this.f7891a + ", supportedToggles=" + this.b + ")";
    }
}
