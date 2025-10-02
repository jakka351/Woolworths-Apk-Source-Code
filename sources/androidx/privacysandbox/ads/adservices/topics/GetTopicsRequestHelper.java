package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import androidx.privacysandbox.ads.adservices.measurement.a;
import com.google.android.gms.ads.MobileAds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequestHelper;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
@RestrictTo
/* loaded from: classes2.dex */
public final class GetTopicsRequestHelper {
    public static android.adservices.topics.GetTopicsRequest a(GetTopicsRequest request) {
        Intrinsics.h(request, "request");
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = a.d().setAdsSdkName(MobileAds.ERROR_DOMAIN).setShouldRecordObservation(request.f3633a).build();
        Intrinsics.g(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }
}
