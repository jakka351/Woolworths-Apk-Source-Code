package androidx.privacysandbox.ads.adservices.appsetid;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AppSetId {

    /* renamed from: a, reason: collision with root package name */
    public final String f3623a;
    public final int b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId$Companion;", "", "", "SCOPE_APP", "I", "SCOPE_DEVELOPER", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public AppSetId(String str, int i) {
        this.f3623a = str;
        this.b = i;
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("Scope undefined.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return this.f3623a.equals(appSetId.f3623a) && this.b == appSetId.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f3623a.hashCode() * 31);
    }

    public final String toString() {
        return a.p(new StringBuilder("AppSetId: id="), this.f3623a, ", scope=", this.b == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
