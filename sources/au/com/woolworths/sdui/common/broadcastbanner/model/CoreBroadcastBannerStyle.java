package au.com.woolworths.sdui.common.broadcastbanner.model;

import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/common/broadcastbanner/model/CoreBroadcastBannerStyle;", "", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoreBroadcastBannerStyle {
    public static final CoreBroadcastBannerStyle d;
    public static final CoreBroadcastBannerStyle e;
    public static final CoreBroadcastBannerStyle f;
    public static final CoreBroadcastBannerStyle g;
    public static final CoreBroadcastBannerStyle h;
    public static final /* synthetic */ CoreBroadcastBannerStyle[] i;
    public static final /* synthetic */ EnumEntries j;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CoreBroadcastBannerStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CoreBroadcastBannerStyle coreBroadcastBannerStyle = CoreBroadcastBannerStyle.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CoreBroadcastBannerStyle coreBroadcastBannerStyle2 = CoreBroadcastBannerStyle.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CoreBroadcastBannerStyle coreBroadcastBannerStyle3 = CoreBroadcastBannerStyle.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                CoreBroadcastBannerStyle coreBroadcastBannerStyle4 = CoreBroadcastBannerStyle.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        CoreBroadcastBannerStyle coreBroadcastBannerStyle = new CoreBroadcastBannerStyle("Standard", 0);
        d = coreBroadcastBannerStyle;
        CoreBroadcastBannerStyle coreBroadcastBannerStyle2 = new CoreBroadcastBannerStyle("OnContrast", 1);
        e = coreBroadcastBannerStyle2;
        CoreBroadcastBannerStyle coreBroadcastBannerStyle3 = new CoreBroadcastBannerStyle("Woolworths", 2);
        f = coreBroadcastBannerStyle3;
        CoreBroadcastBannerStyle coreBroadcastBannerStyle4 = new CoreBroadcastBannerStyle("Everyday", 3);
        g = coreBroadcastBannerStyle4;
        CoreBroadcastBannerStyle coreBroadcastBannerStyle5 = new CoreBroadcastBannerStyle("BigW", 4);
        h = coreBroadcastBannerStyle5;
        CoreBroadcastBannerStyle[] coreBroadcastBannerStyleArr = {coreBroadcastBannerStyle, coreBroadcastBannerStyle2, coreBroadcastBannerStyle3, coreBroadcastBannerStyle4, coreBroadcastBannerStyle5};
        i = coreBroadcastBannerStyleArr;
        j = EnumEntriesKt.a(coreBroadcastBannerStyleArr);
    }

    public static CoreBroadcastBannerStyle valueOf(String str) {
        return (CoreBroadcastBannerStyle) Enum.valueOf(CoreBroadcastBannerStyle.class, str);
    }

    public static CoreBroadcastBannerStyle[] values() {
        return (CoreBroadcastBannerStyle[]) i.clone();
    }

    public final BroadcastBannerType a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return BroadcastBannerType.d;
        }
        if (iOrdinal == 1) {
            return BroadcastBannerType.e;
        }
        if (iOrdinal == 2) {
            return BroadcastBannerType.f;
        }
        if (iOrdinal == 3) {
            return BroadcastBannerType.g;
        }
        if (iOrdinal == 4) {
            return BroadcastBannerType.h;
        }
        throw new NoWhenBranchMatchedException();
    }
}
