package au.com.woolworths.android.onesite.analytics;

import android.net.Uri;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.branch.BranchReferringParams;
import au.com.woolworths.android.onesite.branch.UtmParams;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/DeepLinkAnalytics;", "", "Action", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DeepLinkAnalytics {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f4055a = {"google.com", "bing.com", "yahoo.com"};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/DeepLinkAnalytics$Action;", "Lau/com/woolworths/analytics/Event;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Event {
        public static final Action d;
        public static final Action e;
        public static final Action f;
        public static final /* synthetic */ Action[] g;
        public static final /* synthetic */ EnumEntries h;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/analytics/DeepLinkAnalytics.Action.BRANCH_LINK_CLICK", "Lau/com/woolworths/android/onesite/analytics/DeepLinkAnalytics$Action;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class BRANCH_LINK_CLICK extends Action {
            public final Object i;

            public BRANCH_LINK_CLICK() {
                super("BRANCH_LINK_CLICK", 0);
                this.i = MapsKt.j(new Pair("event.Action", "click"), new Pair("event.Category", "branch_link"));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "branch_link_click";
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.i;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/analytics/DeepLinkAnalytics.Action.DEEP_LINK_CLICK", "Lau/com/woolworths/android/onesite/analytics/DeepLinkAnalytics$Action;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DEEP_LINK_CLICK extends Action {
            public final Object i;

            public DEEP_LINK_CLICK() {
                super("DEEP_LINK_CLICK", 1);
                this.i = MapsKt.j(new Pair("event.Action", "click"), new Pair("event.Category", "deeplink"));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "deeplink_click";
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.i;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/analytics/DeepLinkAnalytics.Action.UNIVERSAL_APP_LINK_CLICK", "Lau/com/woolworths/android/onesite/analytics/DeepLinkAnalytics$Action;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class UNIVERSAL_APP_LINK_CLICK extends Action {
            public final Object i;

            public UNIVERSAL_APP_LINK_CLICK() {
                super("UNIVERSAL_APP_LINK_CLICK", 2);
                this.i = MapsKt.j(new Pair("event.Action", "click"), new Pair("event.Category", "universal_app_link"));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "universal_app_link_click";
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.i;
            }
        }

        static {
            BRANCH_LINK_CLICK branch_link_click = new BRANCH_LINK_CLICK();
            d = branch_link_click;
            DEEP_LINK_CLICK deep_link_click = new DEEP_LINK_CLICK();
            e = deep_link_click;
            UNIVERSAL_APP_LINK_CLICK universal_app_link_click = new UNIVERSAL_APP_LINK_CLICK();
            f = universal_app_link_click;
            Action[] actionArr = {branch_link_click, deep_link_click, universal_app_link_click};
            g = actionArr;
            h = EnumEntriesKt.a(actionArr);
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) g.clone();
        }
    }

    public static String a(String str, Map map) {
        try {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            for (Map.Entry entry : map.entrySet()) {
                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            String string = builderBuildUpon.build().toString();
            Intrinsics.g(string, "toString(...)");
            return string;
        } catch (Exception unused) {
            return str;
        }
    }

    public static String b(String str, BranchReferringParams branchReferringParams) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (branchReferringParams != null) {
            String str2 = branchReferringParams.d;
            UtmParams utmParams = branchReferringParams.f;
            String str3 = utmParams.b;
            String str4 = utmParams.c;
            String str5 = utmParams.f4237a;
            if (!StringsKt.D(str5)) {
                linkedHashMap.put("utm_campaign", str5);
            }
            if (!StringsKt.D(str4)) {
                linkedHashMap.put("utm_medium", str4);
            }
            if (!StringsKt.D(str3)) {
                linkedHashMap.put("utm_source", str3);
            }
            if (!StringsKt.D(str2)) {
                linkedHashMap.put("utm_path", str2);
            }
        }
        return a(str, linkedHashMap);
    }

    public static TrackingMetadata c(String str) {
        if (str == null) {
            return TrackingMetadata.Companion.a(TrackableValue.s2, "not_available");
        }
        TrackingMetadata trackingMetadataA = null;
        try {
            String host = Uri.parse(str).getHost();
            String[] strArr = f4055a;
            int i = 0;
            while (true) {
                if (i >= 3) {
                    break;
                }
                String str2 = strArr[i];
                if (host != null && StringsKt.o(host, str2, false)) {
                    trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.s2, str2);
                    break;
                }
                i++;
            }
            if (trackingMetadataA == null) {
                TrackableValue trackableValue = TrackableValue.s2;
                if (host == null) {
                    host = "";
                }
                return TrackingMetadata.Companion.a(trackableValue, host);
            }
        } catch (Exception unused) {
        }
        return trackingMetadataA;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.h(r3, r0)
            au.com.woolworths.analytics.model.TrackingMetadata r4 = c(r4)
            if (r4 == 0) goto L17
            au.com.woolworths.analytics.model.TrackableValue r0 = au.com.woolworths.analytics.model.TrackableValue.e
            java.util.HashMap r4 = r4.d
            java.lang.String r0 = "referrer_domain"
            java.lang.Object r4 = r4.get(r0)
            if (r4 != 0) goto L19
        L17:
            java.lang.String r4 = "not_available"
        L19:
            r0 = 0
            r1 = 6
            r2 = 63
            int r0 = kotlin.text.StringsKt.B(r3, r2, r0, r1)
            java.lang.String r1 = "?referrer_domain="
            if (r0 <= 0) goto L48
            java.lang.String r0 = kotlin.text.StringsKt.c0(r3, r2)
            java.lang.String r3 = kotlin.text.StringsKt.Y(r2, r3, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r4 = "&"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            return r3
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.analytics.DeepLinkAnalytics.d(java.lang.String, java.lang.String):java.lang.String");
    }

    public static TrackingMetadata f(String str, BranchReferringParams branchReferringParams) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (branchReferringParams != null) {
            String str2 = branchReferringParams.d;
            UtmParams utmParams = branchReferringParams.f;
            String str3 = utmParams.f4237a;
            String str4 = utmParams.b;
            String str5 = utmParams.c;
            if (!StringsKt.D(str3)) {
                linkedHashMap.put(TrackableValue.H3, str3);
            }
            if (!StringsKt.D(str5)) {
                linkedHashMap.put(TrackableValue.J3, str5);
            }
            if (!StringsKt.D(str4)) {
                linkedHashMap.put(TrackableValue.L3, str4);
            }
            if (!StringsKt.D(str2)) {
                linkedHashMap.put(TrackableValue.K3, str2);
            }
        }
        try {
            Uri uri = Uri.parse(str);
            String queryParameter = uri.getQueryParameter("utm_campaign");
            if (queryParameter != null) {
                linkedHashMap.put(TrackableValue.H3, queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (queryParameter2 != null) {
                linkedHashMap.put(TrackableValue.I3, queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("utm_medium");
            if (queryParameter3 != null) {
                linkedHashMap.put(TrackableValue.J3, queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("utm_source");
            if (queryParameter4 != null) {
                linkedHashMap.put(TrackableValue.L3, queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("utm_term");
            if (queryParameter5 != null) {
                linkedHashMap.put(TrackableValue.M3, queryParameter5);
            }
        } catch (Exception unused) {
        }
        Map mapQ = MapsKt.q(linkedHashMap);
        if (mapQ.isEmpty()) {
            return null;
        }
        List listG0 = CollectionsKt.G0(mapQ.keySet());
        TrackableValue trackableValue = (TrackableValue) listG0.get(0);
        String str6 = (String) mapQ.get(listG0.get(0));
        if (str6 == null) {
            str6 = "";
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(trackableValue, str6);
        if (listG0.size() > 1) {
            int size = listG0.size();
            for (int i = 1; i < size; i++) {
                TrackableValue trackableValue2 = (TrackableValue) listG0.get(i);
                String str7 = (String) mapQ.get(listG0.get(i));
                if (str7 == null) {
                    str7 = "";
                }
                trackingMetadataA.b(trackableValue2, str7);
            }
        }
        return trackingMetadataA;
    }

    public static List g(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery != null) {
                int i = 0;
                do {
                    int iB = StringsKt.B(encodedQuery, '&', i, 4);
                    if (iB == -1) {
                        iB = encodedQuery.length();
                    }
                    int iB2 = StringsKt.B(encodedQuery, '=', i, 4);
                    if (iB2 > iB || iB2 == -1) {
                        iB2 = iB;
                    }
                    String strSubstring = encodedQuery.substring(i, iB2);
                    Intrinsics.g(strSubstring, "substring(...)");
                    String strDecode = Uri.decode(strSubstring);
                    Intrinsics.g(strDecode, "decode(...)");
                    String queryParameter = uri.getQueryParameter(strDecode);
                    if (queryParameter != null) {
                        arrayList.add(new Pair(strDecode, queryParameter));
                    }
                    i = iB + 1;
                } while (i < encodedQuery.length());
            }
        } catch (Exception unused) {
        }
        return CollectionsKt.G0(arrayList);
    }

    public static String h(String url) {
        Intrinsics.h(url, "url");
        return a(url, MapsKt.i(new Pair("from_branch", "true")));
    }

    public static String i(String str) {
        Set setI = SetsKt.i("from_branch");
        try {
            List<Pair> listG = g(str);
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.clearQuery();
            for (Pair pair : listG) {
                if (!setI.contains(pair.d)) {
                    builderBuildUpon.appendQueryParameter((String) pair.d, (String) pair.e);
                }
            }
            String string = builderBuildUpon.build().toString();
            Intrinsics.g(string, "toString(...)");
            return string;
        } catch (Exception unused) {
            return str;
        }
    }
}
