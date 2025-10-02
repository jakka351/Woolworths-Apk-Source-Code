package ovh.plrapps.mapcompose.ui.paths.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/paths/model/Cap;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Cap {
    public static final Cap d;
    public static final /* synthetic */ Cap[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        Cap cap = new Cap("Butt", 0);
        Cap cap2 = new Cap("Round", 1);
        d = cap2;
        Cap[] capArr = {cap, cap2, new Cap("Square", 2)};
        e = capArr;
        f = EnumEntriesKt.a(capArr);
    }

    public static Cap valueOf(String str) {
        return (Cap) Enum.valueOf(Cap.class, str);
    }

    public static Cap[] values() {
        return (Cap[]) e.clone();
    }
}
