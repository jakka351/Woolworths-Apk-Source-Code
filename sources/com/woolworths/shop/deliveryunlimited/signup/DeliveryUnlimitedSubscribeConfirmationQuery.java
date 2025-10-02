package com.woolworths.shop.deliveryunlimited.signup;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.deliveryunlimited.signup.adapter.DeliveryUnlimitedSubscribeConfirmationQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeConfirmationQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeConfirmationQuery$Data;", "Data", "DeliveryUnlimitedSubscribeConfirmation", "Feed", "OnDeliveryUnlimitedSubscribeConfirmationLineItem", "OnInsetBanner", "Action", "Analytics", "Companion", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeliveryUnlimitedSubscribeConfirmationQuery implements Query<Data> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeConfirmationQuery$Action;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f22609a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;

        public Action(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f22609a = insetBannerActionPlacement;
            this.b = insetBannerActionType;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.f22609a == action.f22609a && this.b == action.b && Intrinsics.c(this.c, action.c) && Intrinsics.c(this.d, action.d);
        }

        public final int hashCode() {
            int iC = b.c(d.c(this.b, this.f22609a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(d.t("Action(placement=", this.f22609a, ", type=", this.b, ", label="), this.c, ", url=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeConfirmationQuery$Analytics;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22610a;

        public Analytics(String str) {
            this.f22610a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics) && Intrinsics.c(this.f22610a, ((Analytics) obj).f22610a);
        }

        public final int hashCode() {
            return this.f22610a.hashCode();
        }

        public final String toString() {
            return YU.a.h("Analytics(subscriptionType=", this.f22610a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeConfirmationQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeConfirmationQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final DeliveryUnlimitedSubscribeConfirmation f22611a;

        public Data(DeliveryUnlimitedSubscribeConfirmation deliveryUnlimitedSubscribeConfirmation) {
            this.f22611a = deliveryUnlimitedSubscribeConfirmation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f22611a, ((Data) obj).f22611a);
        }

        public final int hashCode() {
            return this.f22611a.hashCode();
        }

        public final String toString() {
            return "Data(deliveryUnlimitedSubscribeConfirmation=" + this.f22611a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeConfirmationQuery$DeliveryUnlimitedSubscribeConfirmation;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryUnlimitedSubscribeConfirmation {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22612a;
        public final Analytics b;

        public DeliveryUnlimitedSubscribeConfirmation(ArrayList arrayList, Analytics analytics) {
            this.f22612a = arrayList;
            this.b = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryUnlimitedSubscribeConfirmation)) {
                return false;
            }
            DeliveryUnlimitedSubscribeConfirmation deliveryUnlimitedSubscribeConfirmation = (DeliveryUnlimitedSubscribeConfirmation) obj;
            return this.f22612a.equals(deliveryUnlimitedSubscribeConfirmation.f22612a) && this.b.equals(deliveryUnlimitedSubscribeConfirmation.b);
        }

        public final int hashCode() {
            return this.b.f22610a.hashCode() + (this.f22612a.hashCode() * 31);
        }

        public final String toString() {
            return "DeliveryUnlimitedSubscribeConfirmation(feed=" + this.f22612a + ", analytics=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeConfirmationQuery$Feed;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Feed {

        /* renamed from: a, reason: collision with root package name */
        public final String f22613a;
        public final OnDeliveryUnlimitedSubscribeConfirmationLineItem b;
        public final OnInsetBanner c;

        public Feed(String __typename, OnDeliveryUnlimitedSubscribeConfirmationLineItem onDeliveryUnlimitedSubscribeConfirmationLineItem, OnInsetBanner onInsetBanner) {
            Intrinsics.h(__typename, "__typename");
            this.f22613a = __typename;
            this.b = onDeliveryUnlimitedSubscribeConfirmationLineItem;
            this.c = onInsetBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Feed)) {
                return false;
            }
            Feed feed = (Feed) obj;
            return Intrinsics.c(this.f22613a, feed.f22613a) && Intrinsics.c(this.b, feed.b) && Intrinsics.c(this.c, feed.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22613a.hashCode() * 31;
            OnDeliveryUnlimitedSubscribeConfirmationLineItem onDeliveryUnlimitedSubscribeConfirmationLineItem = this.b;
            int iHashCode2 = (iHashCode + (onDeliveryUnlimitedSubscribeConfirmationLineItem == null ? 0 : onDeliveryUnlimitedSubscribeConfirmationLineItem.hashCode())) * 31;
            OnInsetBanner onInsetBanner = this.c;
            return iHashCode2 + (onInsetBanner != null ? onInsetBanner.hashCode() : 0);
        }

        public final String toString() {
            return "Feed(__typename=" + this.f22613a + ", onDeliveryUnlimitedSubscribeConfirmationLineItem=" + this.b + ", onInsetBanner=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeConfirmationQuery$OnDeliveryUnlimitedSubscribeConfirmationLineItem;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDeliveryUnlimitedSubscribeConfirmationLineItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22614a;
        public final String b;
        public final String c;

        public OnDeliveryUnlimitedSubscribeConfirmationLineItem(String str, String str2, String str3) {
            this.f22614a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDeliveryUnlimitedSubscribeConfirmationLineItem)) {
                return false;
            }
            OnDeliveryUnlimitedSubscribeConfirmationLineItem onDeliveryUnlimitedSubscribeConfirmationLineItem = (OnDeliveryUnlimitedSubscribeConfirmationLineItem) obj;
            return Intrinsics.c(this.f22614a, onDeliveryUnlimitedSubscribeConfirmationLineItem.f22614a) && Intrinsics.c(this.b, onDeliveryUnlimitedSubscribeConfirmationLineItem.b) && Intrinsics.c(this.c, onDeliveryUnlimitedSubscribeConfirmationLineItem.c);
        }

        public final int hashCode() {
            String str = this.f22614a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("OnDeliveryUnlimitedSubscribeConfirmationLineItem(title=", this.f22614a, ", label=", this.b, ", iconUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeConfirmationQuery$OnInsetBanner;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInsetBanner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f22615a;
        public final String b;
        public final String c;
        public final Action d;

        public OnInsetBanner(InsetBannerDisplayType insetBannerDisplayType, String str, String str2, Action action) {
            this.f22615a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
            this.d = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnInsetBanner)) {
                return false;
            }
            OnInsetBanner onInsetBanner = (OnInsetBanner) obj;
            return this.f22615a == onInsetBanner.f22615a && Intrinsics.c(this.b, onInsetBanner.b) && Intrinsics.c(this.c, onInsetBanner.c) && Intrinsics.c(this.d, onInsetBanner.d);
        }

        public final int hashCode() {
            int iC = b.c(this.f22615a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Action action = this.d;
            return iHashCode + (action != null ? action.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbU = d.u("OnInsetBanner(displayType=", this.f22615a, ", message=", this.b, ", bannerTitle=");
            sbU.append(this.c);
            sbU.append(", action=");
            sbU.append(this.d);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(DeliveryUnlimitedSubscribeConfirmationQuery_ResponseAdapter.Data.f22642a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query DeliveryUnlimitedSubscribeConfirmation { deliveryUnlimitedSubscribeConfirmation { feed { __typename ... on DeliveryUnlimitedSubscribeConfirmationLineItem { title label iconUrl } ... on InsetBanner { displayType message bannerTitle: title action { placement type label url } } } analytics { subscriptionType } } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == DeliveryUnlimitedSubscribeConfirmationQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(DeliveryUnlimitedSubscribeConfirmationQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "0daccabaaa53c80242e913bfdc6277651763b79cf46dbbe19ba9f5f62a2e160c";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "DeliveryUnlimitedSubscribeConfirmation";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
