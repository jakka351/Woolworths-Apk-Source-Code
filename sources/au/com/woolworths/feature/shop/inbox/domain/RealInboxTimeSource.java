package au.com.woolworths.feature.shop.inbox.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import java.time.Clock;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/domain/RealInboxTimeSource;", "Lau/com/woolworths/feature/shop/inbox/domain/InboxTimeSource;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealInboxTimeSource implements InboxTimeSource {

    /* renamed from: a, reason: collision with root package name */
    public final ZoneId f7293a;
    public final Clock b;

    public RealInboxTimeSource() {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.g(zoneIdSystemDefault, "systemDefault(...)");
        this.f7293a = zoneIdSystemDefault;
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Intrinsics.g(clockSystemDefaultZone, "systemDefaultZone(...)");
        this.b = clockSystemDefaultZone;
    }
}
