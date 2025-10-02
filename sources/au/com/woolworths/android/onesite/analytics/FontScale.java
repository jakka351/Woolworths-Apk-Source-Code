package au.com.woolworths.android.onesite.analytics;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/FontScale;", "", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FontScale {
    public static final Companion f;
    public static final LinkedHashMap g;
    public static final FontScale h;
    public static final FontScale i;
    public static final FontScale j;
    public static final FontScale k;
    public static final /* synthetic */ FontScale[] l;
    public static final /* synthetic */ EnumEntries m;
    public final float d;
    public final String e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/FontScale$Companion;", "", "", "", "Lau/com/woolworths/android/onesite/analytics/FontScale;", "map", "Ljava/util/Map;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        FontScale fontScale = new FontScale("SMALL", "Smaller", 0.85f, 0);
        h = fontScale;
        FontScale fontScale2 = new FontScale("DEFAULT", "Default", 1.0f, 1);
        i = fontScale2;
        FontScale fontScale3 = new FontScale("LARGE", "Large", 1.15f, 2);
        j = fontScale3;
        FontScale fontScale4 = new FontScale("VERY_LARGE", "Very Large", 1.3f, 3);
        k = fontScale4;
        FontScale[] fontScaleArr = {fontScale, fontScale2, fontScale3, fontScale4};
        l = fontScaleArr;
        EnumEntries enumEntriesA = EnumEntriesKt.a(fontScaleArr);
        m = enumEntriesA;
        f = new Companion();
        int iH = MapsKt.h(CollectionsKt.s(enumEntriesA, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        Iterator it = ((AbstractList) enumEntriesA).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(Float.valueOf(((FontScale) next).d), next);
        }
        g = linkedHashMap;
    }

    public FontScale(String str, String str2, float f2, int i2) {
        this.d = f2;
        this.e = str2;
    }

    public static FontScale valueOf(String str) {
        return (FontScale) Enum.valueOf(FontScale.class, str);
    }

    public static FontScale[] values() {
        return (FontScale[]) l.clone();
    }
}
