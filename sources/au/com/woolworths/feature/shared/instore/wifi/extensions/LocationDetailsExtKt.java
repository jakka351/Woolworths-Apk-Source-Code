package au.com.woolworths.feature.shared.instore.wifi.extensions;

import au.com.woolworths.feature.rewards.offers.home.ui.a;
import com.cisco.or.sdk.models.LocationDetails;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-wifi_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class LocationDetailsExtKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f6518a = LazyKt.b(new a(26));

    public static final String a(LocationDetails locationDetails) {
        MatchResult matchResultB;
        Intrinsics.h(locationDetails, "<this>");
        String strOptString = locationDetails.g.optString("buildingName");
        Intrinsics.e(strOptString);
        if (strOptString.length() == 0) {
            strOptString = null;
        }
        if (strOptString == null || (matchResultB = ((Regex) f6518a.getD()).b(0, strOptString)) == null) {
            return null;
        }
        return matchResultB.getValue();
    }
}
