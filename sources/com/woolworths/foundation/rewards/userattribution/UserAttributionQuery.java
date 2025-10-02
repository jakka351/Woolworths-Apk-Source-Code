package com.woolworths.foundation.rewards.userattribution;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.rewards.graphql.type.AnalyticsService;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.foundation.rewards.userattribution.adapter.UserAttributionQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/woolworths/foundation/rewards/userattribution/UserAttributionQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/foundation/rewards/userattribution/UserAttributionQuery$Data;", "Data", "UserAttribution", "ServiceDatum", "Property", "OnBoolAttributionProperty", "OnStringAttributionProperty", "Companion", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserAttributionQuery implements Query<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/foundation/rewards/userattribution/UserAttributionQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/foundation/rewards/userattribution/UserAttributionQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final UserAttribution f20478a;

        public Data(UserAttribution userAttribution) {
            this.f20478a = userAttribution;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20478a, ((Data) obj).f20478a);
        }

        public final int hashCode() {
            return this.f20478a.f20483a.hashCode();
        }

        public final String toString() {
            return "Data(userAttribution=" + this.f20478a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/foundation/rewards/userattribution/UserAttributionQuery$OnBoolAttributionProperty;", "", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBoolAttributionProperty {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20479a;
        public final String b;

        public OnBoolAttributionProperty(boolean z, String str) {
            this.f20479a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBoolAttributionProperty)) {
                return false;
            }
            OnBoolAttributionProperty onBoolAttributionProperty = (OnBoolAttributionProperty) obj;
            return this.f20479a == onBoolAttributionProperty.f20479a && Intrinsics.c(this.b, onBoolAttributionProperty.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.f20479a) * 31);
        }

        public final String toString() {
            return a.m("OnBoolAttributionProperty(boolValue=", this.f20479a, ", key=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/foundation/rewards/userattribution/UserAttributionQuery$OnStringAttributionProperty;", "", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnStringAttributionProperty {

        /* renamed from: a, reason: collision with root package name */
        public final String f20480a;
        public final String b;

        public OnStringAttributionProperty(String str, String str2) {
            this.f20480a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnStringAttributionProperty)) {
                return false;
            }
            OnStringAttributionProperty onStringAttributionProperty = (OnStringAttributionProperty) obj;
            return Intrinsics.c(this.f20480a, onStringAttributionProperty.f20480a) && Intrinsics.c(this.b, onStringAttributionProperty.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20480a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnStringAttributionProperty(stringValue=", this.f20480a, ", key=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/foundation/rewards/userattribution/UserAttributionQuery$Property;", "", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Property {

        /* renamed from: a, reason: collision with root package name */
        public final String f20481a;
        public final OnBoolAttributionProperty b;
        public final OnStringAttributionProperty c;

        public Property(String __typename, OnBoolAttributionProperty onBoolAttributionProperty, OnStringAttributionProperty onStringAttributionProperty) {
            Intrinsics.h(__typename, "__typename");
            this.f20481a = __typename;
            this.b = onBoolAttributionProperty;
            this.c = onStringAttributionProperty;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Property)) {
                return false;
            }
            Property property = (Property) obj;
            return Intrinsics.c(this.f20481a, property.f20481a) && Intrinsics.c(this.b, property.b) && Intrinsics.c(this.c, property.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20481a.hashCode() * 31;
            OnBoolAttributionProperty onBoolAttributionProperty = this.b;
            int iHashCode2 = (iHashCode + (onBoolAttributionProperty == null ? 0 : onBoolAttributionProperty.hashCode())) * 31;
            OnStringAttributionProperty onStringAttributionProperty = this.c;
            return iHashCode2 + (onStringAttributionProperty != null ? onStringAttributionProperty.hashCode() : 0);
        }

        public final String toString() {
            return "Property(__typename=" + this.f20481a + ", onBoolAttributionProperty=" + this.b + ", onStringAttributionProperty=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/foundation/rewards/userattribution/UserAttributionQuery$ServiceDatum;", "", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ServiceDatum {

        /* renamed from: a, reason: collision with root package name */
        public final AnalyticsService f20482a;
        public final ArrayList b;

        public ServiceDatum(AnalyticsService analyticsService, ArrayList arrayList) {
            this.f20482a = analyticsService;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceDatum)) {
                return false;
            }
            ServiceDatum serviceDatum = (ServiceDatum) obj;
            return this.f20482a == serviceDatum.f20482a && this.b.equals(serviceDatum.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20482a.hashCode() * 31);
        }

        public final String toString() {
            return "ServiceDatum(service=" + this.f20482a + ", properties=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/foundation/rewards/userattribution/UserAttributionQuery$UserAttribution;", "", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UserAttribution {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f20483a;

        public UserAttribution(ArrayList arrayList) {
            this.f20483a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserAttribution) && this.f20483a.equals(((UserAttribution) obj).f20483a);
        }

        public final int hashCode() {
            return this.f20483a.hashCode();
        }

        public final String toString() {
            return a.k("UserAttribution(serviceData=", ")", this.f20483a);
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(UserAttributionQuery_ResponseAdapter.Data.f20484a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query UserAttribution { userAttribution { serviceData { service properties { __typename ... on BoolAttributionProperty { boolValue key } ... on StringAttributionProperty { stringValue key } } } } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == UserAttributionQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(UserAttributionQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "ab64be8f89d4b6e4acbdd828526a334891bdb5641376026d9696a529046de296";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "UserAttribution";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
