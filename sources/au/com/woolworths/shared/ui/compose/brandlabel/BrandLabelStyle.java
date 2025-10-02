package au.com.woolworths.shared.ui.compose.brandlabel;

import au.com.woolworths.design.wx.foundation.AccentColors;
import au.com.woolworths.design.wx.foundation.ToneColors;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shared/ui/compose/brandlabel/BrandLabelStyle;", "Lau/com/woolworths/shared/ui/compose/brandlabel/BrandLabelSpec;", "", "shared-ui-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BrandLabelStyle implements BrandLabelSpec {
    public static final BrandLabelStyle d;
    public static final BrandLabelStyle e;
    public static final BrandLabelStyle f;
    public static final BrandLabelStyle g;
    public static final BrandLabelStyle h;
    public static final BrandLabelStyle i;
    public static final /* synthetic */ BrandLabelStyle[] j;
    public static final /* synthetic */ EnumEntries k;

    static {
        BrandLabelStyle brandLabelStyle = new BrandLabelStyle() { // from class: au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelStyle.ALWAYS
            public final long l = ToneColors.k;
            public final long m;
            public final long n;

            {
                long j2 = AccentColors.f5153a;
                this.m = j2;
                this.n = j2;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: a, reason: from getter */
            public final long getM() {
                return this.m;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: b, reason: from getter */
            public final long getL() {
                return this.l;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: c, reason: from getter */
            public final long getN() {
                return this.n;
            }
        };
        d = brandLabelStyle;
        BrandLabelStyle brandLabelStyle2 = new BrandLabelStyle() { // from class: au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelStyle.DEFAULT
            public final long l = ToneColors.f5162a;
            public final long m = ToneColors.k;
            public final long n = ToneColors.e;

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: a, reason: from getter */
            public final long getM() {
                return this.m;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: b, reason: from getter */
            public final long getL() {
                return this.l;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: c, reason: from getter */
            public final long getN() {
                return this.n;
            }
        };
        e = brandLabelStyle2;
        BrandLabelStyle brandLabelStyle3 = new BrandLabelStyle() { // from class: au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelStyle.DISABLED
            public final long l = ToneColors.k;
            public final long m;
            public final long n;

            {
                long j2 = ToneColors.g;
                this.m = j2;
                this.n = j2;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: a, reason: from getter */
            public final long getM() {
                return this.m;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: b, reason: from getter */
            public final long getL() {
                return this.l;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: c, reason: from getter */
            public final long getN() {
                return this.n;
            }
        };
        BrandLabelStyle brandLabelStyle4 = new BrandLabelStyle() { // from class: au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelStyle.INFO
            public final long l = ToneColors.k;
            public final long m;
            public final long n;

            {
                long j2 = AccentColors.b;
                this.m = j2;
                this.n = j2;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: a, reason: from getter */
            public final long getM() {
                return this.m;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: b, reason: from getter */
            public final long getL() {
                return this.l;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: c, reason: from getter */
            public final long getN() {
                return this.n;
            }
        };
        f = brandLabelStyle4;
        BrandLabelStyle brandLabelStyle5 = new BrandLabelStyle() { // from class: au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelStyle.NEW
            public final long l = ToneColors.k;
            public final long m;
            public final long n;

            {
                long j2 = AccentColors.c;
                this.m = j2;
                this.n = j2;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: a, reason: from getter */
            public final long getM() {
                return this.m;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: b, reason: from getter */
            public final long getL() {
                return this.l;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: c, reason: from getter */
            public final long getN() {
                return this.n;
            }
        };
        g = brandLabelStyle5;
        BrandLabelStyle brandLabelStyle6 = new BrandLabelStyle() { // from class: au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelStyle.REWARDS
            public final long l = ToneColors.k;
            public final long m;
            public final long n;

            {
                long j2 = AccentColors.d;
                this.m = j2;
                this.n = j2;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: a, reason: from getter */
            public final long getM() {
                return this.m;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: b, reason: from getter */
            public final long getL() {
                return this.l;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: c, reason: from getter */
            public final long getN() {
                return this.n;
            }
        };
        h = brandLabelStyle6;
        BrandLabelStyle brandLabelStyle7 = new BrandLabelStyle() { // from class: au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelStyle.SPECIAL
            public final long l = ToneColors.f5162a;
            public final long m;
            public final long n;

            {
                long j2 = AccentColors.e;
                this.m = j2;
                this.n = j2;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: a, reason: from getter */
            public final long getM() {
                return this.m;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: b, reason: from getter */
            public final long getL() {
                return this.l;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: c, reason: from getter */
            public final long getN() {
                return this.n;
            }
        };
        i = brandLabelStyle7;
        BrandLabelStyle[] brandLabelStyleArr = {brandLabelStyle, brandLabelStyle2, brandLabelStyle3, brandLabelStyle4, brandLabelStyle5, brandLabelStyle6, brandLabelStyle7, new BrandLabelStyle() { // from class: au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelStyle.TEMPORARY
            public final long l = ToneColors.f5162a;
            public final long m;
            public final long n;

            {
                long j2 = ToneColors.i;
                this.m = j2;
                this.n = j2;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: a, reason: from getter */
            public final long getM() {
                return this.m;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: b, reason: from getter */
            public final long getL() {
                return this.l;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: c, reason: from getter */
            public final long getN() {
                return this.n;
            }
        }, new BrandLabelStyle() { // from class: au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelStyle.UNAVAILABLE
            public final long l = ToneColors.k;
            public final long m;
            public final long n;

            {
                long j2 = ToneColors.f5162a;
                this.m = j2;
                this.n = j2;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: a, reason: from getter */
            public final long getM() {
                return this.m;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: b, reason: from getter */
            public final long getL() {
                return this.l;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: c, reason: from getter */
            public final long getN() {
                return this.n;
            }
        }};
        j = brandLabelStyleArr;
        k = EnumEntriesKt.a(brandLabelStyleArr);
    }

    public static BrandLabelStyle valueOf(String str) {
        return (BrandLabelStyle) Enum.valueOf(BrandLabelStyle.class, str);
    }

    public static BrandLabelStyle[] values() {
        return (BrandLabelStyle[]) j.clone();
    }
}
