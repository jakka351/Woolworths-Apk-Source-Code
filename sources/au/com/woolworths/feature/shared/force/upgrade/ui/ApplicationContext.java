package au.com.woolworths.feature.shared.force.upgrade.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/ui/ApplicationContext;", "", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ApplicationContext {

    /* renamed from: a, reason: collision with root package name */
    public final ApplicationType f6512a;

    public ApplicationContext(ApplicationType applicationType) {
        this.f6512a = applicationType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApplicationContext) && this.f6512a == ((ApplicationContext) obj).f6512a;
    }

    public final int hashCode() {
        return this.f6512a.hashCode();
    }

    public final String toString() {
        return "ApplicationContext(applicationType=" + this.f6512a + ")";
    }
}
