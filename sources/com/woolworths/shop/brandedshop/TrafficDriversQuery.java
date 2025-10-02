package com.woolworths.shop.brandedshop;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.TagStyle;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.brandedshop.adapter.TrafficDriversQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/woolworths/shop/brandedshop/TrafficDriversQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$Data;", "Data", "TrafficDrivers", "Analytics", "Item", "Action", "Analytics1", "Tag", "ImpressionAnalytics", "Companion", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrafficDriversQuery implements Query<Data> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$Action;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final String f21433a;
        public final ActionType b;
        public final String c;
        public final String d;
        public final Analytics1 e;

        public Action(String str, ActionType actionType, String str2, String str3, Analytics1 analytics1) {
            this.f21433a = str;
            this.b = actionType;
            this.c = str2;
            this.d = str3;
            this.e = analytics1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return Intrinsics.c(this.f21433a, action.f21433a) && this.b == action.b && Intrinsics.c(this.c, action.c) && Intrinsics.c(this.d, action.d) && Intrinsics.c(this.e, action.e);
        }

        public final int hashCode() {
            int iC = b.c(d.a(this.b, this.f21433a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Analytics1 analytics1 = this.e;
            return iHashCode + (analytics1 != null ? analytics1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbW = d.w("Action(__typename=", this.f21433a, ", type=", this.b, ", action=");
            a.B(sbW, this.c, ", id=", this.d, ", analytics=");
            sbW.append(this.e);
            sbW.append(")");
            return sbW.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$Analytics;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f21434a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f21434a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) obj;
            return Intrinsics.c(this.f21434a, analytics.f21434a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21434a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f21434a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$Analytics1;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21435a;
        public final AnalyticsFields b;

        public Analytics1(String str, AnalyticsFields analyticsFields) {
            this.f21435a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics1)) {
                return false;
            }
            Analytics1 analytics1 = (Analytics1) obj;
            return Intrinsics.c(this.f21435a, analytics1.f21435a) && Intrinsics.c(this.b, analytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21435a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics1(__typename=", this.f21435a, ", analyticsFields=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final TrafficDrivers f21436a;

        public Data(TrafficDrivers trafficDrivers) {
            this.f21436a = trafficDrivers;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21436a, ((Data) obj).f21436a);
        }

        public final int hashCode() {
            return this.f21436a.hashCode();
        }

        public final String toString() {
            return "Data(trafficDrivers=" + this.f21436a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$ImpressionAnalytics;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f21437a;
        public final AnalyticsFields b;

        public ImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f21437a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImpressionAnalytics)) {
                return false;
            }
            ImpressionAnalytics impressionAnalytics = (ImpressionAnalytics) obj;
            return Intrinsics.c(this.f21437a, impressionAnalytics.f21437a) && Intrinsics.c(this.b, impressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21437a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.f21437a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$Item;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f21438a;
        public final String b;
        public final String c;
        public final String d;
        public final ArrayList e;
        public final Action f;
        public final Tag g;
        public final ImpressionAnalytics h;

        public Item(String str, String str2, String str3, String str4, ArrayList arrayList, Action action, Tag tag, ImpressionAnalytics impressionAnalytics) {
            this.f21438a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = arrayList;
            this.f = action;
            this.g = tag;
            this.h = impressionAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return this.f21438a.equals(item.f21438a) && this.b.equals(item.b) && Intrinsics.c(this.c, item.c) && this.d.equals(item.d) && this.e.equals(item.e) && this.f.equals(item.f) && Intrinsics.c(this.g, item.g) && Intrinsics.c(this.h, item.h);
        }

        public final int hashCode() {
            int iC = b.c(this.f21438a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (this.f.hashCode() + androidx.compose.ui.input.pointer.a.b(b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e)) * 31;
            Tag tag = this.g;
            int iHashCode2 = (iHashCode + (tag == null ? 0 : tag.hashCode())) * 31;
            ImpressionAnalytics impressionAnalytics = this.h;
            return iHashCode2 + (impressionAnalytics != null ? impressionAnalytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Item(__typename=", this.f21438a, ", title=", this.b, ", subtitle=");
            a.B(sbV, this.c, ", imageUrl=", this.d, ", keywords=");
            sbV.append(this.e);
            sbV.append(", action=");
            sbV.append(this.f);
            sbV.append(", tag=");
            sbV.append(this.g);
            sbV.append(", impressionAnalytics=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$Tag;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Tag {

        /* renamed from: a, reason: collision with root package name */
        public final String f21439a;
        public final TagStyle b;

        public Tag(String str, TagStyle tagStyle) {
            this.f21439a = str;
            this.b = tagStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tag)) {
                return false;
            }
            Tag tag = (Tag) obj;
            return Intrinsics.c(this.f21439a, tag.f21439a) && this.b == tag.b;
        }

        public final int hashCode() {
            int iHashCode = this.f21439a.hashCode() * 31;
            TagStyle tagStyle = this.b;
            return iHashCode + (tagStyle == null ? 0 : tagStyle.hashCode());
        }

        public final String toString() {
            return "Tag(text=" + this.f21439a + ", style=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/TrafficDriversQuery$TrafficDrivers;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrafficDrivers {

        /* renamed from: a, reason: collision with root package name */
        public final String f21440a;
        public final int b;
        public final int c;
        public final Analytics d;
        public final ArrayList e;

        public TrafficDrivers(String str, int i, int i2, Analytics analytics, ArrayList arrayList) {
            this.f21440a = str;
            this.b = i;
            this.c = i2;
            this.d = analytics;
            this.e = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrafficDrivers)) {
                return false;
            }
            TrafficDrivers trafficDrivers = (TrafficDrivers) obj;
            return this.f21440a.equals(trafficDrivers.f21440a) && this.b == trafficDrivers.b && this.c == trafficDrivers.c && Intrinsics.c(this.d, trafficDrivers.d) && this.e.equals(trafficDrivers.e);
        }

        public final int hashCode() {
            int iA = b.a(this.c, b.a(this.b, this.f21440a.hashCode() * 31, 31), 31);
            Analytics analytics = this.d;
            return this.e.hashCode() + ((iA + (analytics == null ? 0 : analytics.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbU = b.u("TrafficDrivers(__typename=", this.b, this.f21440a, ", numberOfItemsToDisplay=", ", startingIndex=");
            sbU.append(this.c);
            sbU.append(", analytics=");
            sbU.append(this.d);
            sbU.append(", items=");
            return android.support.v4.media.session.a.q(")", sbU, this.e);
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(TrafficDriversQuery_ResponseAdapter.Data.f21487a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query trafficDrivers { trafficDrivers { __typename numberOfItemsToDisplay startingIndex analytics { __typename ...analyticsFields } items { __typename title subtitle imageUrl keywords action { __typename type action id analytics { __typename ...analyticsFields } } tag { text style } impressionAnalytics { __typename ...analyticsFields } } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == TrafficDriversQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(TrafficDriversQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "c153b111ea490dfcfbb747a92dd804aea54918d051dd4b5979d31dc85021fa9a";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "trafficDrivers";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
