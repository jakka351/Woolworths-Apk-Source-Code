package au.com.woolworths.android.onesite.modules.common;

import com.woolworths.R;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/common/Region;", "", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Region {
    public static final Companion h;
    public static final Region i;
    public static final Region j;
    public static final /* synthetic */ Region[] k;
    public static final /* synthetic */ EnumEntries l;
    public final String d;
    public final String e;
    public final String f;
    public final int g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/common/Region$Companion;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static Region a(String str) {
            Object obj = null;
            if (str == null) {
                return null;
            }
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "toUpperCase(...)");
            Iterator it = ((AbstractList) Region.l).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((Region) next).d.equals(upperCase)) {
                    obj = next;
                    break;
                }
            }
            return (Region) obj;
        }
    }

    static {
        Region region = new Region("Australia", 0, R.drawable.ic_region_au, "AU", "Australia", "🇦🇺");
        i = region;
        Region region2 = new Region("NewZealand", 1, R.drawable.ic_region_nz, "NZ", "New Zealand", "🇳🇿");
        j = region2;
        Region[] regionArr = {region, region2};
        k = regionArr;
        l = EnumEntriesKt.a(regionArr);
        h = new Companion();
    }

    public Region(String str, int i2, int i3, String str2, String str3, String str4) {
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i3;
    }

    public static Region valueOf(String str) {
        return (Region) Enum.valueOf(Region.class, str);
    }

    public static Region[] values() {
        return (Region[]) k.clone();
    }
}
