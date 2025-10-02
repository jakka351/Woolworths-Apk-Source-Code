package au.com.woolworths.sdui.shop.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreTagUI;", "Lcom/apollographql/apollo/api/Fragment$Data;", "CoreColorTheme", "Icon", "Background", "Foreground", "Primary", "Secondary", "Highlight", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CoreTagUI implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f10058a;
    public final String b;
    public final CoreColorTheme c;
    public final boolean d;
    public final Icon e;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreTagUI$Background;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Background {

        /* renamed from: a, reason: collision with root package name */
        public final String f10059a;
        public final CompatibleColor b;

        public Background(String str, CompatibleColor compatibleColor) {
            this.f10059a = str;
            this.b = compatibleColor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Background)) {
                return false;
            }
            Background background = (Background) obj;
            return Intrinsics.c(this.f10059a, background.f10059a) && Intrinsics.c(this.b, background.b);
        }

        public final int hashCode() {
            return this.b.f10042a.hashCode() + (this.f10059a.hashCode() * 31);
        }

        public final String toString() {
            return "Background(__typename=" + this.f10059a + ", compatibleColor=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreTagUI$CoreColorTheme;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CoreColorTheme {

        /* renamed from: a, reason: collision with root package name */
        public final String f10060a;
        public final Background b;
        public final Foreground c;

        public CoreColorTheme(String str, Background background, Foreground foreground) {
            this.f10060a = str;
            this.b = background;
            this.c = foreground;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoreColorTheme)) {
                return false;
            }
            CoreColorTheme coreColorTheme = (CoreColorTheme) obj;
            return Intrinsics.c(this.f10060a, coreColorTheme.f10060a) && Intrinsics.c(this.b, coreColorTheme.b) && Intrinsics.c(this.c, coreColorTheme.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f10060a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "CoreColorTheme(__typename=" + this.f10060a + ", background=" + this.b + ", foreground=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreTagUI$Foreground;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Foreground {

        /* renamed from: a, reason: collision with root package name */
        public final String f10061a;
        public final Primary b;
        public final Secondary c;
        public final Highlight d;

        public Foreground(String str, Primary primary, Secondary secondary, Highlight highlight) {
            this.f10061a = str;
            this.b = primary;
            this.c = secondary;
            this.d = highlight;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Foreground)) {
                return false;
            }
            Foreground foreground = (Foreground) obj;
            return Intrinsics.c(this.f10061a, foreground.f10061a) && Intrinsics.c(this.b, foreground.b) && Intrinsics.c(this.c, foreground.c) && Intrinsics.c(this.d, foreground.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f10061a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Foreground(__typename=" + this.f10061a + ", primary=" + this.b + ", secondary=" + this.c + ", highlight=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreTagUI$Highlight;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Highlight {

        /* renamed from: a, reason: collision with root package name */
        public final String f10062a;
        public final CompatibleColor b;

        public Highlight(String str, CompatibleColor compatibleColor) {
            this.f10062a = str;
            this.b = compatibleColor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Highlight)) {
                return false;
            }
            Highlight highlight = (Highlight) obj;
            return Intrinsics.c(this.f10062a, highlight.f10062a) && Intrinsics.c(this.b, highlight.b);
        }

        public final int hashCode() {
            return this.b.f10042a.hashCode() + (this.f10062a.hashCode() * 31);
        }

        public final String toString() {
            return "Highlight(__typename=" + this.f10062a + ", compatibleColor=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreTagUI$Icon;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Icon {

        /* renamed from: a, reason: collision with root package name */
        public final String f10063a;
        public final IconFragment b;

        public Icon(String str, IconFragment iconFragment) {
            this.f10063a = str;
            this.b = iconFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            return Intrinsics.c(this.f10063a, icon.f10063a) && Intrinsics.c(this.b, icon.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10063a.hashCode() * 31);
        }

        public final String toString() {
            return "Icon(__typename=" + this.f10063a + ", iconFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreTagUI$Primary;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Primary {

        /* renamed from: a, reason: collision with root package name */
        public final String f10064a;
        public final CompatibleColor b;

        public Primary(String str, CompatibleColor compatibleColor) {
            this.f10064a = str;
            this.b = compatibleColor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Primary)) {
                return false;
            }
            Primary primary = (Primary) obj;
            return Intrinsics.c(this.f10064a, primary.f10064a) && Intrinsics.c(this.b, primary.b);
        }

        public final int hashCode() {
            return this.b.f10042a.hashCode() + (this.f10064a.hashCode() * 31);
        }

        public final String toString() {
            return "Primary(__typename=" + this.f10064a + ", compatibleColor=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreTagUI$Secondary;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Secondary {

        /* renamed from: a, reason: collision with root package name */
        public final String f10065a;
        public final CompatibleColor b;

        public Secondary(String str, CompatibleColor compatibleColor) {
            this.f10065a = str;
            this.b = compatibleColor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Secondary)) {
                return false;
            }
            Secondary secondary = (Secondary) obj;
            return Intrinsics.c(this.f10065a, secondary.f10065a) && Intrinsics.c(this.b, secondary.b);
        }

        public final int hashCode() {
            return this.b.f10042a.hashCode() + (this.f10065a.hashCode() * 31);
        }

        public final String toString() {
            return "Secondary(__typename=" + this.f10065a + ", compatibleColor=" + this.b + ")";
        }
    }

    public CoreTagUI(String str, String str2, CoreColorTheme coreColorTheme, boolean z, Icon icon) {
        this.f10058a = str;
        this.b = str2;
        this.c = coreColorTheme;
        this.d = z;
        this.e = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTagUI)) {
            return false;
        }
        CoreTagUI coreTagUI = (CoreTagUI) obj;
        return Intrinsics.c(this.f10058a, coreTagUI.f10058a) && Intrinsics.c(this.b, coreTagUI.b) && Intrinsics.c(this.c, coreTagUI.c) && this.d == coreTagUI.d && Intrinsics.c(this.e, coreTagUI.e);
    }

    public final int hashCode() {
        int iE = b.e((this.c.hashCode() + b.c(this.f10058a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        Icon icon = this.e;
        return iE + (icon == null ? 0 : icon.hashCode());
    }

    public final String toString() {
        StringBuilder sbV = a.v("CoreTagUI(__typename=", this.f10058a, ", label=", this.b, ", coreColorTheme=");
        sbV.append(this.c);
        sbV.append(", hasBorder=");
        sbV.append(this.d);
        sbV.append(", icon=");
        sbV.append(this.e);
        sbV.append(")");
        return sbV.toString();
    }
}
