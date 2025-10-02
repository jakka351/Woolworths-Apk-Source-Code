package au.com.woolworths.android.onesite.featuretoggles;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/featuretoggles/RemoteConfigSyncState;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RemoteConfigSyncState {
    public static final RemoteConfigSyncState d;
    public static final RemoteConfigSyncState e;
    public static final RemoteConfigSyncState f;
    public static final /* synthetic */ RemoteConfigSyncState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        RemoteConfigSyncState remoteConfigSyncState = new RemoteConfigSyncState("NOT_SYNCED", 0);
        d = remoteConfigSyncState;
        RemoteConfigSyncState remoteConfigSyncState2 = new RemoteConfigSyncState("SYNCED", 1);
        e = remoteConfigSyncState2;
        RemoteConfigSyncState remoteConfigSyncState3 = new RemoteConfigSyncState("SYNCING", 2);
        f = remoteConfigSyncState3;
        RemoteConfigSyncState[] remoteConfigSyncStateArr = {remoteConfigSyncState, remoteConfigSyncState2, remoteConfigSyncState3};
        g = remoteConfigSyncStateArr;
        h = EnumEntriesKt.a(remoteConfigSyncStateArr);
    }

    public static RemoteConfigSyncState valueOf(String str) {
        return (RemoteConfigSyncState) Enum.valueOf(RemoteConfigSyncState.class, str);
    }

    public static RemoteConfigSyncState[] values() {
        return (RemoteConfigSyncState[]) g.clone();
    }
}
