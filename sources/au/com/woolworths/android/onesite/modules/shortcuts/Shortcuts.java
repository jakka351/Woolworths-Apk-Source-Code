package au.com.woolworths.android.onesite.modules.shortcuts;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/shortcuts/Shortcuts;", "", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class Shortcuts {
    public static final Companion f;
    public static final LinkedHashMap g;
    public static final Shortcuts h;
    public static final Shortcuts i;
    public static final Shortcuts j;
    public static final Shortcuts k;
    public static final /* synthetic */ Shortcuts[] l;
    public static final /* synthetic */ EnumEntries m;
    public final String d;
    public final ShortcutActions e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/modules/shortcuts/Shortcuts$Companion;", "", "", "", "Lau/com/woolworths/android/onesite/modules/shortcuts/Shortcuts;", "map", "Ljava/util/Map;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Shortcuts shortcuts = new Shortcuts("LISTS", 0, "list", ShortcutActions.d);
        h = shortcuts;
        Shortcuts shortcuts2 = new Shortcuts("REWARDS_BARCODE", 1, "rewards", ShortcutActions.g);
        i = shortcuts2;
        Shortcuts shortcuts3 = new Shortcuts("SEARCH", 2, "search", ShortcutActions.e);
        j = shortcuts3;
        Shortcuts shortcuts4 = new Shortcuts("SPECIALS", 3, "specials", ShortcutActions.f);
        k = shortcuts4;
        Shortcuts[] shortcutsArr = {shortcuts, shortcuts2, shortcuts3, shortcuts4};
        l = shortcutsArr;
        EnumEntries enumEntriesA = EnumEntriesKt.a(shortcutsArr);
        m = enumEntriesA;
        f = new Companion();
        int iH = MapsKt.h(CollectionsKt.s(enumEntriesA, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        Iterator it = ((AbstractList) enumEntriesA).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((Shortcuts) next).d, next);
        }
        g = linkedHashMap;
    }

    public Shortcuts(String str, int i2, String str2, ShortcutActions shortcutActions) {
        this.d = str2;
        this.e = shortcutActions;
    }

    public static Shortcuts valueOf(String str) {
        return (Shortcuts) Enum.valueOf(Shortcuts.class, str);
    }

    public static Shortcuts[] values() {
        return (Shortcuts[]) l.clone();
    }
}
