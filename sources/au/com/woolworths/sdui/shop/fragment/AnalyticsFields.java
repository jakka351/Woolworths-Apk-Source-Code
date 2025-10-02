package au.com.woolworths.sdui.shop.fragment;

import android.support.v4.media.session.a;
import com.apollographql.apollo.api.Fragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "ExtraContent", "graphql-fragments-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AnalyticsFields implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f10032a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields$ExtraContent;", "", "graphql-fragments-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExtraContent {

        /* renamed from: a, reason: collision with root package name */
        public final String f10033a;
        public final String b;
        public final List c;

        public ExtraContent(String str, String str2, List list) {
            this.f10033a = str;
            this.b = str2;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExtraContent)) {
                return false;
            }
            ExtraContent extraContent = (ExtraContent) obj;
            return Intrinsics.c(this.f10033a, extraContent.f10033a) && Intrinsics.c(this.b, extraContent.b) && Intrinsics.c(this.c, extraContent.c);
        }

        public final int hashCode() {
            int iHashCode = this.f10033a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list = this.c;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return a.t(YU.a.v("ExtraContent(key=", this.f10033a, ", value=", this.b, ", values="), this.c, ")");
        }
    }

    public AnalyticsFields(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list) {
        this.f10032a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsFields)) {
            return false;
        }
        AnalyticsFields analyticsFields = (AnalyticsFields) obj;
        return Intrinsics.c(this.f10032a, analyticsFields.f10032a) && Intrinsics.c(this.b, analyticsFields.b) && Intrinsics.c(this.c, analyticsFields.c) && Intrinsics.c(this.d, analyticsFields.d) && Intrinsics.c(this.e, analyticsFields.e) && Intrinsics.c(this.f, analyticsFields.f) && Intrinsics.c(this.g, analyticsFields.g) && Intrinsics.c(this.h, analyticsFields.h) && Intrinsics.c(this.i, analyticsFields.i) && Intrinsics.c(this.j, analyticsFields.j);
    }

    public final int hashCode() {
        String str = this.f10032a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list = this.j;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("AnalyticsFields(appSection=", this.f10032a, ", screenName=", this.b, ", screenType=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", eventAction=", this.d, ", eventCategory=");
        androidx.constraintlayout.core.state.a.B(sbV, this.e, ", eventLabel=", this.f, ", eventValue=");
        androidx.constraintlayout.core.state.a.B(sbV, this.g, ", eventDescription=", this.h, ", tealiumEvent=");
        sbV.append(this.i);
        sbV.append(", extraContent=");
        sbV.append(this.j);
        sbV.append(")");
        return sbV.toString();
    }
}
