package au.com.woolworths.design.core.ui.component.stable.broadcastbanner;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/broadcastbanner/BroadcastBannerType;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BroadcastBannerType {
    public static final BroadcastBannerType d;
    public static final BroadcastBannerType e;
    public static final BroadcastBannerType f;
    public static final BroadcastBannerType g;
    public static final BroadcastBannerType h;
    public static final /* synthetic */ BroadcastBannerType[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        BroadcastBannerType broadcastBannerType = new BroadcastBannerType() { // from class: au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType.Standard
            @Override // au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType
            public final long a(Composer composer) {
                composer.o(-1990488395);
                long j2 = CoreTheme.b(composer).f4782a.d.b.f4798a;
                composer.l();
                return j2;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType
            public final long b(Composer composer) {
                composer.o(-1245895611);
                long j2 = CoreTheme.b(composer).e.f4848a.d;
                composer.l();
                return j2;
            }
        };
        d = broadcastBannerType;
        BroadcastBannerType broadcastBannerType2 = new BroadcastBannerType() { // from class: au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType.OnContrast
            @Override // au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType
            public final long a(Composer composer) {
                composer.o(906552949);
                long j2 = CoreTheme.b(composer).f4782a.d.b.f4798a;
                composer.l();
                return j2;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType
            public final long b(Composer composer) {
                composer.o(-2054867963);
                long j2 = CoreTheme.b(composer).e.f4848a.c;
                composer.l();
                return j2;
            }
        };
        e = broadcastBannerType2;
        BroadcastBannerType broadcastBannerType3 = new BroadcastBannerType() { // from class: au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType.WoolworthsBranded
            @Override // au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType
            public final long a(Composer composer) {
                composer.o(1817242521);
                long j2 = PartnerColorTokens.f4748a;
                composer.l();
                return j2;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType
            public final long b(Composer composer) {
                composer.o(2100182313);
                long j2 = CoreTheme.b(composer).f.c.f4866a.f4867a.f4868a;
                composer.l();
                return j2;
            }
        };
        f = broadcastBannerType3;
        BroadcastBannerType broadcastBannerType4 = new BroadcastBannerType() { // from class: au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType.EverydayBranded
            @Override // au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType
            public final long a(Composer composer) {
                composer.o(-1377034485);
                long j2 = CoreTheme.b(composer).f.b.f4862a.f4863a.f4864a;
                composer.l();
                return j2;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType
            public final long b(Composer composer) {
                composer.o(1557182619);
                long j2 = CoreTheme.b(composer).f.b.f4862a.f4863a.b;
                composer.l();
                return j2;
            }
        };
        g = broadcastBannerType4;
        BroadcastBannerType broadcastBannerType5 = new BroadcastBannerType() { // from class: au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType.BigWBranded
            @Override // au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType
            public final long a(Composer composer) {
                composer.o(-1662512609);
                long j2 = CoreTheme.b(composer).f.f4858a.f4859a.f4860a.f4861a;
                composer.l();
                return j2;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType
            public final long b(Composer composer) {
                composer.o(-24691793);
                long j2 = CoreTheme.b(composer).f.f4858a.f4859a.f4860a.b;
                composer.l();
                return j2;
            }
        };
        h = broadcastBannerType5;
        BroadcastBannerType[] broadcastBannerTypeArr = {broadcastBannerType, broadcastBannerType2, broadcastBannerType3, broadcastBannerType4, broadcastBannerType5};
        i = broadcastBannerTypeArr;
        j = EnumEntriesKt.a(broadcastBannerTypeArr);
    }

    public static BroadcastBannerType valueOf(String str) {
        return (BroadcastBannerType) Enum.valueOf(BroadcastBannerType.class, str);
    }

    public static BroadcastBannerType[] values() {
        return (BroadcastBannerType[]) i.clone();
    }

    public abstract long a(Composer composer);

    public abstract long b(Composer composer);
}
