package com.woolworths.feature.shop.contentpage.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.ActionType;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ActionFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Analytics", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ActionFields implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f19524a;
    public final String b;
    public final ActionType c;
    public final Analytics d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ActionFields$Analytics;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19525a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f19525a = str;
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
            return Intrinsics.c(this.f19525a, analytics.f19525a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19525a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f19525a, ", analyticsFields=", this.b, ")");
        }
    }

    public ActionFields(String str, String str2, ActionType actionType, Analytics analytics) {
        this.f19524a = str;
        this.b = str2;
        this.c = actionType;
        this.d = analytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionFields)) {
            return false;
        }
        ActionFields actionFields = (ActionFields) obj;
        return Intrinsics.c(this.f19524a, actionFields.f19524a) && Intrinsics.c(this.b, actionFields.b) && this.c == actionFields.c && Intrinsics.c(this.d, actionFields.d);
    }

    public final int hashCode() {
        String str = this.f19524a;
        int iA = d.a(this.c, b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31);
        Analytics analytics = this.d;
        return iA + (analytics != null ? analytics.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ActionFields(id=", this.f19524a, ", action=", this.b, ", type=");
        sbV.append(this.c);
        sbV.append(", analytics=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
