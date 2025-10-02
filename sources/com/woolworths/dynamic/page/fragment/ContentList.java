package com.woolworths.dynamic.page.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/dynamic/page/fragment/ContentList;", "Lcom/apollographql/apollo/api/Fragment$Data;", "ContentListItem", "Cta", "Analytics", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ContentList implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f19290a;
    public final ArrayList b;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/fragment/ContentList$Analytics;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19291a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f19291a = str;
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
            return Intrinsics.c(this.f19291a, analytics.f19291a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19291a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f19291a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/fragment/ContentList$ContentListItem;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentListItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f19292a;
        public final String b;
        public final String c;
        public final String d;
        public final Cta e;

        public ContentListItem(String str, String str2, String str3, String str4, Cta cta) {
            this.f19292a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = cta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentListItem)) {
                return false;
            }
            ContentListItem contentListItem = (ContentListItem) obj;
            return Intrinsics.c(this.f19292a, contentListItem.f19292a) && Intrinsics.c(this.b, contentListItem.b) && Intrinsics.c(this.c, contentListItem.c) && Intrinsics.c(this.d, contentListItem.d) && Intrinsics.c(this.e, contentListItem.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f19292a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Cta cta = this.e;
            return iHashCode2 + (cta != null ? cta.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("ContentListItem(title=", this.f19292a, ", imageUrl=", this.b, ", imageAltText=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", subtitle=", this.d, ", cta=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/fragment/ContentList$Cta;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta {

        /* renamed from: a, reason: collision with root package name */
        public final String f19293a;
        public final String b;
        public final Analytics c;

        public Cta(String str, String str2, Analytics analytics) {
            this.f19293a = str;
            this.b = str2;
            this.c = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.c(this.f19293a, cta.f19293a) && Intrinsics.c(this.b, cta.b) && Intrinsics.c(this.c, cta.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f19293a.hashCode() * 31, 31, this.b);
            Analytics analytics = this.c;
            return iC + (analytics == null ? 0 : analytics.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("Cta(label=", this.f19293a, ", action=", this.b, ", analytics=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    public ContentList(String str, ArrayList arrayList) {
        this.f19290a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentList)) {
            return false;
        }
        ContentList contentList = (ContentList) obj;
        return Intrinsics.c(this.f19290a, contentList.f19290a) && this.b.equals(contentList.b);
    }

    public final int hashCode() {
        String str = this.f19290a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return d.q("ContentList(contentListTitle=", this.f19290a, ", contentListItems=", ")", this.b);
    }
}
