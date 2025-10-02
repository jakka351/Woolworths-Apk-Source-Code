package au.com.woolworths.android.onesite.modules.main;

import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/HomepageModeSelectorBadge;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabel;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class HomepageModeSelectorBadge implements BrandLabel {
    public static final HomepageModeSelectorBadge f;
    public static final HomepageModeSelectorBadge g;
    public static final /* synthetic */ HomepageModeSelectorBadge[] h;
    public static final /* synthetic */ EnumEntries i;
    public final ResText d = new ResText(R.string.change_button_text);
    public final ChangeBrandLabelType e = ChangeBrandLabelType.d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/modules/main/HomepageModeSelectorBadge.CHANGE", "Lau/com/woolworths/android/onesite/modules/main/HomepageModeSelectorBadge;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CHANGE extends HomepageModeSelectorBadge {
        @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
        public final int getTextAppearance() {
            return R.style.TextAppearance_Overline;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/modules/main/HomepageModeSelectorBadge.CHANGE_BIG", "Lau/com/woolworths/android/onesite/modules/main/HomepageModeSelectorBadge;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CHANGE_BIG extends HomepageModeSelectorBadge {
        @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
        public final int getTextAppearance() {
            return R.style.TextAppearance_Caption_Medium;
        }
    }

    static {
        CHANGE change = new CHANGE("CHANGE", 0);
        f = change;
        CHANGE_BIG change_big = new CHANGE_BIG("CHANGE_BIG", 1);
        g = change_big;
        HomepageModeSelectorBadge[] homepageModeSelectorBadgeArr = {change, change_big};
        h = homepageModeSelectorBadgeArr;
        i = EnumEntriesKt.a(homepageModeSelectorBadgeArr);
    }

    public HomepageModeSelectorBadge(String str, int i2) {
    }

    public static HomepageModeSelectorBadge valueOf(String str) {
        return (HomepageModeSelectorBadge) Enum.valueOf(HomepageModeSelectorBadge.class, str);
    }

    public static HomepageModeSelectorBadge[] values() {
        return (HomepageModeSelectorBadge[]) h.clone();
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final Text getText() {
        return this.d;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final BrandLabelType getType() {
        return this.e;
    }
}
