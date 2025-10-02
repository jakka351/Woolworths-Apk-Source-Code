package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientErrorRecoveryStrategy;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OriientErrorRecoveryStrategy {
    public static final /* synthetic */ OriientErrorRecoveryStrategy[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        OriientErrorRecoveryStrategy[] oriientErrorRecoveryStrategyArr = {new OriientErrorRecoveryStrategy("Login", 0), new OriientErrorRecoveryStrategy("Retry", 1), new OriientErrorRecoveryStrategy("Unrecoverable", 2)};
        d = oriientErrorRecoveryStrategyArr;
        e = EnumEntriesKt.a(oriientErrorRecoveryStrategyArr);
    }

    public static OriientErrorRecoveryStrategy valueOf(String str) {
        return (OriientErrorRecoveryStrategy) Enum.valueOf(OriientErrorRecoveryStrategy.class, str);
    }

    public static OriientErrorRecoveryStrategy[] values() {
        return (OriientErrorRecoveryStrategy[]) d.clone();
    }
}
