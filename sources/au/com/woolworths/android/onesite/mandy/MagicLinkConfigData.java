package au.com.woolworths.android.onesite.mandy;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/mandy/MagicLinkConfigData;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MagicLinkConfigData {

    /* renamed from: a, reason: collision with root package name */
    public final Map f4272a;

    public MagicLinkConfigData(Map map) {
        this.f4272a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MagicLinkConfigData) && this.f4272a.equals(((MagicLinkConfigData) obj).f4272a);
    }

    public final int hashCode() {
        return this.f4272a.hashCode() - 1014146683;
    }

    public final String toString() {
        return "MagicLinkConfigData(pageName=olive, headerMap=" + this.f4272a + ")";
    }
}
