package au.com.woolworths.foundation.appcomms.inbox.client.internal.sync;

import kotlin.Metadata;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/sync/SyncConfig;", "", "Companion", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SyncConfig {
    public static final SyncConfig b;

    /* renamed from: a, reason: collision with root package name */
    public final long f8435a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/sync/SyncConfig$Companion;", "", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        int i = Duration.g;
        b = new SyncConfig(DurationKt.g(10, DurationUnit.i));
    }

    public SyncConfig(long j) {
        this.f8435a = j;
    }
}
