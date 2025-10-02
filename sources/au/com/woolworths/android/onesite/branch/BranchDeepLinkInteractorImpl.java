package au.com.woolworths.android.onesite.branch;

import YU.a;
import android.content.Context;
import android.net.Uri;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.DeepLinkAnalytics;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import io.branch.referral.Branch;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/branch/BranchDeepLinkInteractorImpl;", "Lau/com/woolworths/android/onesite/branch/BranchDeepLinkInteractor;", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BranchDeepLinkInteractorImpl implements BranchDeepLinkInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final BranchAnalyticsInteractor f4235a;
    public final AnalyticsManager b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ApplicationType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ApplicationType applicationType = ApplicationType.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public BranchDeepLinkInteractorImpl(BranchAnalyticsInteractor branchAnalyticsInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.f4235a = branchAnalyticsInteractor;
        this.b = analyticsManager;
    }

    public static Map a(List list) {
        if (list == null) {
            return EmptyMap.d;
        }
        List list2 = list;
        int iH = MapsKt.h(CollectionsKt.s(list2, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            List listT = StringsKt.T((String) it.next(), new String[]{"="}, 6);
            Object obj = listT.get(0);
            String str = (String) CollectionsKt.J(1, listT);
            if (str == null) {
                str = "";
            }
            linkedHashMap.put(obj, str);
        }
        return linkedHashMap;
    }

    public static final void d(ApplicationType applicationType, String str, BranchReferringParams branchReferringParams, String str2) {
        Bark.Companion companion = Bark.f8483a;
        Bark.Barker.i(ReportOwner.Squad.t.a(), StringsKt.m0("\n                    " + str2 + "\n                    handleBranchReferringParams applicationType " + applicationType + "\n                    handleBranchReferringParams url             " + str + "\n                    handleBranchReferringParams referringParams " + branchReferringParams + "\n                "), null, 12);
    }

    public static void f(Context context, String str) {
        String strConcat = str.concat("://home");
        if ((str.equals("com.woolworths.shop") ? ApplicationType.e : ApplicationType.d) == ApplicationType.e) {
            strConcat = DeepLinkAnalytics.h(strConcat);
        }
        g(context, strConcat);
    }

    public static void g(Context context, String url) {
        Intrinsics.h(context, "context");
        Intrinsics.h(url, "url");
        ContextExtKt.j(context, url, null, null, null, 62);
    }

    public static BranchReferringParams h(JSONObject jSONObject) {
        boolean zOptBoolean = jSONObject.optBoolean("+clicked_branch_link");
        boolean zOptBoolean2 = jSONObject.optBoolean("$web_only");
        String strOptString = jSONObject.optString("$android_url");
        Intrinsics.g(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString("$deeplink_path");
        Intrinsics.g(strOptString2, "optString(...)");
        String strOptString3 = jSONObject.optString("$canonical_url");
        Intrinsics.g(strOptString3, "optString(...)");
        String strOptString4 = jSONObject.optString("~campaign");
        Intrinsics.g(strOptString4, "optString(...)");
        String strOptString5 = jSONObject.optString("~channel");
        Intrinsics.g(strOptString5, "optString(...)");
        String strOptString6 = jSONObject.optString("utm_medium", jSONObject.optString("~feature"));
        Intrinsics.g(strOptString6, "optString(...)");
        UtmParams utmParams = new UtmParams(strOptString4, strOptString5, strOptString6);
        String strOptString7 = jSONObject.optString("~referring_link");
        Intrinsics.g(strOptString7, "optString(...)");
        return new BranchReferringParams(zOptBoolean, zOptBoolean2, strOptString, strOptString2, strOptString3, utmParams, strOptString7);
    }

    public final BranchReferringParams b() {
        Branch branchI = Branch.i();
        if (branchI == null) {
            Timber.f27013a.o("Branch instance is not properly initialised", new Object[0]);
        }
        if (branchI != null) {
            return h(branchI.j());
        }
        return null;
    }

    public final void c(ApplicationType applicationType, Context context, BranchReferringParams branchReferringParams, String str) {
        String str2;
        boolean z;
        String str3;
        BranchAnalyticsActionData branchAnalyticsActionData;
        Intrinsics.h(context, "context");
        int iOrdinal = applicationType.ordinal();
        if (iOrdinal == 0) {
            str2 = "com.woolworths.rewards";
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "com.woolworths.shop";
        }
        if (str.length() > 0) {
            TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.h0, DeepLinkAnalytics.d(DeepLinkAnalytics.b(str, branchReferringParams), null));
            TrackingMetadata trackingMetadataF = DeepLinkAnalytics.f(str, branchReferringParams);
            if (trackingMetadataF != null) {
                trackingMetadataA.a(trackingMetadataF);
            }
            trackingMetadataA.a(TrackingMetadata.Companion.a(TrackableValue.s2, "not_available"));
            this.b.i(DeepLinkAnalytics.Action.d, trackingMetadataA);
            z = true;
        } else {
            z = false;
        }
        if (branchReferringParams == null) {
            d(applicationType, str, branchReferringParams, "referringParams is null");
            f(context, str2);
            return;
        }
        if (branchReferringParams.getB()) {
            if (StringsKt.D(branchReferringParams.getC())) {
                Timber.f27013a.b("`$android_url` was not provided for web only link", new Object[0]);
                f(context, str2);
                return;
            } else {
                String strA = branchReferringParams.getC();
                if (applicationType == ApplicationType.e) {
                    strA = DeepLinkAnalytics.h(strA);
                }
                g(context, strA);
                return;
            }
        }
        if (StringsKt.D(branchReferringParams.getD())) {
            if (StringsKt.D(branchReferringParams.getE())) {
                d(applicationType, str, branchReferringParams, "A deeplink has failed to open properly, referringParams contents were not useful. doNothingIfUnknown=false");
                f(context, str2);
                return;
            } else {
                String strB = branchReferringParams.getE();
                if (applicationType == ApplicationType.e) {
                    strB = DeepLinkAnalytics.h(strB);
                }
                g(context, strB);
                return;
            }
        }
        if (!z) {
            int iOrdinal2 = applicationType.ordinal();
            if (iOrdinal2 == 0) {
                branchAnalyticsActionData = BranchAnalyticsActionData.e;
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                branchAnalyticsActionData = BranchAnalyticsActionData.d;
            }
            UtmParams utmParamsE = branchReferringParams.getF();
            TrackingMetadata trackingMetadataA2 = TrackingMetadata.Companion.a(TrackableValue.K3, branchReferringParams.getD());
            if (utmParamsE.getF4237a().length() > 0) {
                trackingMetadataA2.b(TrackableValue.H3, utmParamsE.getF4237a());
            }
            if (utmParamsE.getB().length() > 0) {
                trackingMetadataA2.b(TrackableValue.L3, utmParamsE.getB());
            }
            if (utmParamsE.getC().length() > 0) {
                trackingMetadataA2.b(TrackableValue.J3, utmParamsE.getC());
            }
            this.f4235a.f4234a.j(branchAnalyticsActionData, trackingMetadataA2);
        }
        String deeplink = branchReferringParams.getD();
        String referringLink = branchReferringParams.getG();
        Intrinsics.h(deeplink, "deeplink");
        Intrinsics.h(referringLink, "referringLink");
        String str4 = (String) CollectionsKt.D(StringsKt.T(deeplink, new String[]{"?"}, 6));
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(str2);
        builder.encodedAuthority(str4);
        List listT = StringsKt.T(deeplink, new String[]{"?"}, 6);
        if (listT.size() <= 1) {
            listT = null;
        }
        Map mapA = a((listT == null || (str3 = (String) CollectionsKt.O(listT)) == null) ? null : StringsKt.T(str3, new String[]{"&"}, 6));
        HttpUrl.j.getClass();
        HttpUrl httpUrlD = HttpUrl.Companion.d(referringLink);
        String strI = httpUrlD != null ? httpUrlD.i() : null;
        for (Map.Entry entry : MapsKt.m(a(strI != null ? StringsKt.T(strI, new String[]{"&"}, 6) : null), mapA).entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builder.build().toString();
        Intrinsics.g(string, "toString(...)");
        Bark.Companion companion = Bark.f8483a;
        ReportOwner reportOwnerA = ReportOwner.Squad.t.a();
        StringBuilder sbV = a.v("\n                        getDeeplinkUri sche ", str2, "\n                        getDeeplinkUri deep ", deeplink, "\n                        getDeeplinkUri refr ");
        sbV.append(referringLink);
        sbV.append("\n                        getDeeplinkUri outp ");
        sbV.append(string);
        sbV.append("\n                    ");
        Bark.Barker.i(reportOwnerA, StringsKt.m0(sbV.toString()), null, 12);
        if (applicationType == ApplicationType.e) {
            string = DeepLinkAnalytics.h(string);
        }
        g(context, string);
    }

    public final boolean e(BranchReferringParams branchReferringParams) {
        return branchReferringParams != null && branchReferringParams.getF4236a();
    }
}
