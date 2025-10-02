package au.com.woolworths.foundation.force.upgrade.shop;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.foundation.force.upgrade.shop.adapter.AppConfigQuery_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ConfigInput;
import au.com.woolworths.shop.graphql.type.UpgradeType;
import au.com.woolworths.shop.graphql.type.adapter.ConfigInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/shop/AppConfigQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/foundation/force/upgrade/shop/AppConfigQuery$Data;", "Data", "Config", "Alert", "OnAppConfigSoftAlert", "OnAppConfigForcedAlert", "Companion", "force-upgrade-data-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AppConfigQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final ConfigInput f8515a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/shop/AppConfigQuery$Alert;", "", "force-upgrade-data-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Alert {

        /* renamed from: a, reason: collision with root package name */
        public final String f8516a;
        public final OnAppConfigSoftAlert b;
        public final OnAppConfigForcedAlert c;

        public Alert(String __typename, OnAppConfigSoftAlert onAppConfigSoftAlert, OnAppConfigForcedAlert onAppConfigForcedAlert) {
            Intrinsics.h(__typename, "__typename");
            this.f8516a = __typename;
            this.b = onAppConfigSoftAlert;
            this.c = onAppConfigForcedAlert;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Alert)) {
                return false;
            }
            Alert alert = (Alert) obj;
            return Intrinsics.c(this.f8516a, alert.f8516a) && Intrinsics.c(this.b, alert.b) && Intrinsics.c(this.c, alert.c);
        }

        public final int hashCode() {
            int iHashCode = this.f8516a.hashCode() * 31;
            OnAppConfigSoftAlert onAppConfigSoftAlert = this.b;
            int iHashCode2 = (iHashCode + (onAppConfigSoftAlert == null ? 0 : onAppConfigSoftAlert.hashCode())) * 31;
            OnAppConfigForcedAlert onAppConfigForcedAlert = this.c;
            return iHashCode2 + (onAppConfigForcedAlert != null ? onAppConfigForcedAlert.hashCode() : 0);
        }

        public final String toString() {
            return "Alert(__typename=" + this.f8516a + ", onAppConfigSoftAlert=" + this.b + ", onAppConfigForcedAlert=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/shop/AppConfigQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "force-upgrade-data-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/shop/AppConfigQuery$Config;", "", "force-upgrade-data-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Config {

        /* renamed from: a, reason: collision with root package name */
        public final UpgradeType f8517a;
        public final Boolean b;
        public final Alert c;
        public final String d;

        public Config(UpgradeType upgradeType, Boolean bool, Alert alert, String str) {
            this.f8517a = upgradeType;
            this.b = bool;
            this.c = alert;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.f8517a == config.f8517a && Intrinsics.c(this.b, config.b) && Intrinsics.c(this.c, config.c) && Intrinsics.c(this.d, config.d);
        }

        public final int hashCode() {
            int iHashCode = this.f8517a.hashCode() * 31;
            Boolean bool = this.b;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Alert alert = this.c;
            return this.d.hashCode() + ((iHashCode2 + (alert != null ? alert.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Config(upgradeType=" + this.f8517a + ", isForcedUpgrade=" + this.b + ", alert=" + this.c + ", bff=" + this.d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/shop/AppConfigQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "force-upgrade-data-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final Config f8518a;

        public Data(Config config) {
            this.f8518a = config;
        }

        /* renamed from: a, reason: from getter */
        public final Config getF8518a() {
            return this.f8518a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f8518a, ((Data) obj).f8518a);
        }

        public final int hashCode() {
            return this.f8518a.hashCode();
        }

        public final String toString() {
            return "Data(config=" + this.f8518a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/shop/AppConfigQuery$OnAppConfigForcedAlert;", "", "force-upgrade-data-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAppConfigForcedAlert {

        /* renamed from: a, reason: collision with root package name */
        public final String f8519a;
        public final String b;
        public final String c;
        public final String d;

        public OnAppConfigForcedAlert(String str, String str2, String str3, String str4) {
            this.f8519a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAppConfigForcedAlert)) {
                return false;
            }
            OnAppConfigForcedAlert onAppConfigForcedAlert = (OnAppConfigForcedAlert) obj;
            return Intrinsics.c(this.f8519a, onAppConfigForcedAlert.f8519a) && Intrinsics.c(this.b, onAppConfigForcedAlert.b) && Intrinsics.c(this.c, onAppConfigForcedAlert.c) && Intrinsics.c(this.d, onAppConfigForcedAlert.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f8519a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(YU.a.v("OnAppConfigForcedAlert(title=", this.f8519a, ", message=", this.b, ", primaryActionLabel="), this.c, ", rewardsCardActionLabel=", this.d, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/shop/AppConfigQuery$OnAppConfigSoftAlert;", "", "force-upgrade-data-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAppConfigSoftAlert {

        /* renamed from: a, reason: collision with root package name */
        public final String f8520a;
        public final String b;
        public final String c;
        public final String d;

        public OnAppConfigSoftAlert(String str, String str2, String str3, String str4) {
            this.f8520a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAppConfigSoftAlert)) {
                return false;
            }
            OnAppConfigSoftAlert onAppConfigSoftAlert = (OnAppConfigSoftAlert) obj;
            return Intrinsics.c(this.f8520a, onAppConfigSoftAlert.f8520a) && Intrinsics.c(this.b, onAppConfigSoftAlert.b) && Intrinsics.c(this.c, onAppConfigSoftAlert.c) && Intrinsics.c(this.d, onAppConfigSoftAlert.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(this.f8520a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return a.l(YU.a.v("OnAppConfigSoftAlert(title=", this.f8520a, ", message=", this.b, ", primaryActionLabel="), this.c, ", secondaryActionLabel=", this.d, ")");
        }
    }

    public AppConfigQuery(ConfigInput configInput) {
        this.f8515a = configInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(AppConfigQuery_ResponseAdapter.Data.f8524a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query AppConfig($configInput: ConfigInput!) { config(configInput: $configInput) { upgradeType isForcedUpgrade alert { __typename ... on AppConfigSoftAlert { title message primaryActionLabel secondaryActionLabel } ... on AppConfigForcedAlert { title message primaryActionLabel rewardsCardActionLabel } } bff } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppConfigQuery) && Intrinsics.c(this.f8515a, ((AppConfigQuery) obj).f8515a);
    }

    public final int hashCode() {
        return this.f8515a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "94bb04205087a023b5c01a06b48aaffd21031a1e1a78f82c8c5ab2aab94330e2";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "AppConfig";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("configInput");
        Adapters.c(ConfigInput_InputAdapter.f12056a, false).toJson(jsonWriter, customScalarAdapters, this.f8515a);
    }

    public final String toString() {
        return "AppConfigQuery(configInput=" + this.f8515a + ")";
    }
}
