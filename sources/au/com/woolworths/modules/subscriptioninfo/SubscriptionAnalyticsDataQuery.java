package au.com.woolworths.modules.subscriptioninfo;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.modules.subscriptioninfo.adapter.SubscriptionAnalyticsDataQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/modules/subscriptioninfo/SubscriptionAnalyticsDataQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/modules/subscriptioninfo/SubscriptionAnalyticsDataQuery$Data;", "Data", "Subscriptions", "AnalyticsData", "OnSubscriptionAnalyticsData", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SubscriptionAnalyticsDataQuery implements Query<Data> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/subscriptioninfo/SubscriptionAnalyticsDataQuery$AnalyticsData;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AnalyticsData {

        /* renamed from: a, reason: collision with root package name */
        public final String f9164a;
        public final OnSubscriptionAnalyticsData b;

        public AnalyticsData(String str, OnSubscriptionAnalyticsData onSubscriptionAnalyticsData) {
            this.f9164a = str;
            this.b = onSubscriptionAnalyticsData;
        }

        /* renamed from: a, reason: from getter */
        public final OnSubscriptionAnalyticsData getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnalyticsData)) {
                return false;
            }
            AnalyticsData analyticsData = (AnalyticsData) obj;
            return Intrinsics.c(this.f9164a, analyticsData.f9164a) && Intrinsics.c(this.b, analyticsData.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9164a.hashCode() * 31);
        }

        public final String toString() {
            return "AnalyticsData(__typename=" + this.f9164a + ", onSubscriptionAnalyticsData=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/modules/subscriptioninfo/SubscriptionAnalyticsDataQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/subscriptioninfo/SubscriptionAnalyticsDataQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final Subscriptions f9165a;

        public Data(Subscriptions subscriptions) {
            this.f9165a = subscriptions;
        }

        /* renamed from: a, reason: from getter */
        public final Subscriptions getF9165a() {
            return this.f9165a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f9165a, ((Data) obj).f9165a);
        }

        public final int hashCode() {
            Subscriptions subscriptions = this.f9165a;
            if (subscriptions == null) {
                return 0;
            }
            return subscriptions.hashCode();
        }

        public final String toString() {
            return "Data(subscriptions=" + this.f9165a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/subscriptioninfo/SubscriptionAnalyticsDataQuery$OnSubscriptionAnalyticsData;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSubscriptionAnalyticsData {

        /* renamed from: a, reason: collision with root package name */
        public final List f9166a;
        public final List b;
        public final List c;
        public final List d;
        public final List e;
        public final List f;

        public OnSubscriptionAnalyticsData(List list, List list2, List list3, List list4, List list5, List list6) {
            this.f9166a = list;
            this.b = list2;
            this.c = list3;
            this.d = list4;
            this.e = list5;
            this.f = list6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSubscriptionAnalyticsData)) {
                return false;
            }
            OnSubscriptionAnalyticsData onSubscriptionAnalyticsData = (OnSubscriptionAnalyticsData) obj;
            return Intrinsics.c(this.f9166a, onSubscriptionAnalyticsData.f9166a) && Intrinsics.c(this.b, onSubscriptionAnalyticsData.b) && Intrinsics.c(this.c, onSubscriptionAnalyticsData.c) && Intrinsics.c(this.d, onSubscriptionAnalyticsData.d) && Intrinsics.c(this.e, onSubscriptionAnalyticsData.e) && Intrinsics.c(this.f, onSubscriptionAnalyticsData.f);
        }

        public final int hashCode() {
            List list = this.f9166a;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List list2 = this.b;
            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.c;
            int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List list4 = this.d;
            int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List list5 = this.e;
            int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
            List list6 = this.f;
            return iHashCode5 + (list6 != null ? list6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnSubscriptionAnalyticsData(subscriptionTypes=");
            sb.append(this.f9166a);
            sb.append(", subscriptionBillingPeriods=");
            sb.append(this.b);
            sb.append(", subscriptionAllowedUsageTypes=");
            a.C(sb, this.c, ", subscriptionIds=", this.d, ", userStatus=");
            sb.append(this.e);
            sb.append(", userSubscriberTypes=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/subscriptioninfo/SubscriptionAnalyticsDataQuery$Subscriptions;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Subscriptions {

        /* renamed from: a, reason: collision with root package name */
        public final AnalyticsData f9167a;

        public Subscriptions(AnalyticsData analyticsData) {
            this.f9167a = analyticsData;
        }

        /* renamed from: a, reason: from getter */
        public final AnalyticsData getF9167a() {
            return this.f9167a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Subscriptions) && Intrinsics.c(this.f9167a, ((Subscriptions) obj).f9167a);
        }

        public final int hashCode() {
            AnalyticsData analyticsData = this.f9167a;
            if (analyticsData == null) {
                return 0;
            }
            return analyticsData.hashCode();
        }

        public final String toString() {
            return "Subscriptions(analyticsData=" + this.f9167a + ")";
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SubscriptionAnalyticsDataQuery_ResponseAdapter.Data.f9169a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query subscriptionAnalyticsData { subscriptions { analyticsData { __typename ... on SubscriptionAnalyticsData { subscriptionTypes subscriptionBillingPeriods subscriptionAllowedUsageTypes subscriptionIds userStatus userSubscriberTypes } } } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == SubscriptionAnalyticsDataQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(SubscriptionAnalyticsDataQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "05aa08adc16b3cc4bb3adce734cf46c82a322a00c62d0296bb47f711ac37f7f7";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "subscriptionAnalyticsData";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
