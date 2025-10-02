package au.com.woolworths.base.wallet.coachmark;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/coachmark/OverlayShape;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OverlayShape {
    public static final /* synthetic */ OverlayShape[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        OverlayShape[] overlayShapeArr = {new OverlayShape("Circle", 0), new OverlayShape("RoundedRectangle", 1)};
        d = overlayShapeArr;
        e = EnumEntriesKt.a(overlayShapeArr);
    }

    public static OverlayShape valueOf(String str) {
        return (OverlayShape) Enum.valueOf(OverlayShape.class, str);
    }

    public static OverlayShape[] values() {
        return (OverlayShape[]) d.clone();
    }
}
