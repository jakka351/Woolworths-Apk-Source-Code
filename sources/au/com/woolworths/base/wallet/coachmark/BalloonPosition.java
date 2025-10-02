package au.com.woolworths.base.wallet.coachmark;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/coachmark/BalloonPosition;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BalloonPosition {
    public static final /* synthetic */ BalloonPosition[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        BalloonPosition[] balloonPositionArr = {new BalloonPosition("BELOW", 0), new BalloonPosition("CENTER", 1), new BalloonPosition("ABOVE", 2), new BalloonPosition("DROPDOWN", 3)};
        d = balloonPositionArr;
        e = EnumEntriesKt.a(balloonPositionArr);
    }

    public static BalloonPosition valueOf(String str) {
        return (BalloonPosition) Enum.valueOf(BalloonPosition.class, str);
    }

    public static BalloonPosition[] values() {
        return (BalloonPosition[]) d.clone();
    }
}
