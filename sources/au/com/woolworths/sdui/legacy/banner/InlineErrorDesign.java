package au.com.woolworths.sdui.legacy.banner;

import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.design.wx.foundation.AccentColors;
import au.com.woolworths.design.wx.foundation.RewardsColors;
import au.com.woolworths.design.wx.foundation.ThemeContext;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.TintColors;
import au.com.woolworths.design.wx.foundation.WoolworthsColors;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/legacy/banner/InlineErrorDesign;", "", "legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class InlineErrorDesign {
    public static final InlineErrorDesign j;
    public static final InlineErrorDesign k;
    public static final InlineErrorDesign l;
    public static final InlineErrorDesign m;
    public static final InlineErrorDesign n;
    public static final /* synthetic */ InlineErrorDesign[] o;
    public static final /* synthetic */ EnumEntries p;
    public final InlineErrorType d;
    public final long e;
    public final long f;
    public final int g;
    public final int h;
    public final int i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ThemeContext.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ThemeContext themeContext = ThemeContext.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        InlineErrorType inlineErrorType = InlineErrorType.f;
        int i = TintColors.f;
        long j2 = TintColors.b;
        int i2 = AccentColors.f;
        InlineErrorDesign inlineErrorDesign = new InlineErrorDesign("INFO", 0, inlineErrorType, j2, AccentColors.b, R.drawable.ic_info_filled, R.drawable.ic_woolworths_placeholder, R.string.banner_info_content_description);
        j = inlineErrorDesign;
        InlineErrorDesign inlineErrorDesign2 = new InlineErrorDesign("WARNING", 1, InlineErrorType.g, TintColors.d, AccentColors.e, R.drawable.ic_warning, R.drawable.ic_woolworths_placeholder, R.string.banner_warning_content_description);
        k = inlineErrorDesign2;
        InlineErrorDesign inlineErrorDesign3 = new InlineErrorDesign("ERROR", 2, InlineErrorType.h, TintColors.f5161a, AccentColors.f5153a, R.drawable.ic_error_filled, R.drawable.ic_woolworths_placeholder, R.string.banner_alert_content_description);
        l = inlineErrorDesign3;
        InlineErrorDesign inlineErrorDesign4 = new InlineErrorDesign("REWARDS", 3, InlineErrorType.i, TintColors.c, AccentColors.d, R.drawable.ic_rewards, R.drawable.ic_rewards_placeholder, R.string.banner_rewards_content_description);
        m = inlineErrorDesign4;
        InlineErrorType inlineErrorType2 = InlineErrorType.j;
        long j3 = TintColors.e;
        int i3 = WoolworthsColors.e;
        InlineErrorDesign inlineErrorDesign5 = new InlineErrorDesign("PRIMARY_DARK", 4, inlineErrorType2, j3, WoolworthsColors.d, R.drawable.ic_tick_filled, R.drawable.ic_woolworths_placeholder, R.string.banner_primary_dark_content_description);
        n = inlineErrorDesign5;
        InlineErrorDesign[] inlineErrorDesignArr = {inlineErrorDesign, inlineErrorDesign2, inlineErrorDesign3, inlineErrorDesign4, inlineErrorDesign5};
        o = inlineErrorDesignArr;
        p = EnumEntriesKt.a(inlineErrorDesignArr);
    }

    public InlineErrorDesign(String str, int i, InlineErrorType inlineErrorType, long j2, long j3, int i2, int i3, int i4) {
        this.d = inlineErrorType;
        this.e = j2;
        this.f = j3;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    public static InlineErrorDesign valueOf(String str) {
        return (InlineErrorDesign) Enum.valueOf(InlineErrorDesign.class, str);
    }

    public static InlineErrorDesign[] values() {
        return (InlineErrorDesign[]) o.clone();
    }

    public final long a(Composer composer) {
        if (this == j) {
            return AccentColors.b;
        }
        if (this == k) {
            int iOrdinal = ((ThemeContext) composer.x(ThemeKt.f5160a)).ordinal();
            if (iOrdinal == 0) {
                return WoolworthsColors.f5164a;
            }
            if (iOrdinal == 1) {
                return RewardsColors.b;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (this == l) {
            return AccentColors.f5153a;
        }
        if (this == m) {
            return AccentColors.d;
        }
        if (this == n) {
            return WoolworthsColors.d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
