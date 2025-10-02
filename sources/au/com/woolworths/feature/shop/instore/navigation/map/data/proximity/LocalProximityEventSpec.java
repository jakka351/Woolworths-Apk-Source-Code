package au.com.woolworths.feature.shop.instore.navigation.map.data.proximity;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.instore.navigation.map.data.proximity.LocalProximityEventRepetitionStrategy;
import au.com.woolworths.feature.shop.instore.navigation.map.data.proximity.LocalProximityLocationDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventSpec;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LocalProximityEventSpec {

    /* renamed from: a, reason: collision with root package name */
    public final String f7350a;
    public final int b;
    public final LocalProximityEventTriggerSpec c;
    public final LocalProximityLocationDefinition.CloseWalkingDistance d;
    public final String e;

    public LocalProximityEventSpec(String str, int i, LocalProximityEventTriggerSpec localProximityEventTriggerSpec, LocalProximityLocationDefinition.CloseWalkingDistance closeWalkingDistance, String str2) {
        this.f7350a = str;
        this.b = i;
        this.c = localProximityEventTriggerSpec;
        this.d = closeWalkingDistance;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalProximityEventSpec)) {
            return false;
        }
        LocalProximityEventSpec localProximityEventSpec = (LocalProximityEventSpec) obj;
        if (!this.f7350a.equals(localProximityEventSpec.f7350a) || this.b != localProximityEventSpec.b || !this.c.equals(localProximityEventSpec.c) || !this.d.equals(localProximityEventSpec.d) || !Intrinsics.c(this.e, localProximityEventSpec.e)) {
            return false;
        }
        LocalProximityEventRepetitionStrategy.Once once = LocalProximityEventRepetitionStrategy.Once.f7349a;
        return once.equals(once);
    }

    public final int hashCode() {
        int iHashCode = (this.d.f7353a.hashCode() + ((this.c.hashCode() + b.a(this.b, this.f7350a.hashCode() * 31, 31)) * 31)) * 31;
        String str = this.e;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + 869517265;
    }

    public final String toString() {
        StringBuilder sbU = b.u("LocalProximityEventSpec(buildingId=", this.b, this.f7350a, ", oriientFloorOrder=", ", trigger=");
        sbU.append(this.c);
        sbU.append(", locationDefinition=");
        sbU.append(this.d);
        sbU.append(", groupId=");
        sbU.append(this.e);
        sbU.append(", repetitionStrategy=");
        sbU.append(LocalProximityEventRepetitionStrategy.Once.f7349a);
        sbU.append(")");
        return sbU.toString();
    }
}
