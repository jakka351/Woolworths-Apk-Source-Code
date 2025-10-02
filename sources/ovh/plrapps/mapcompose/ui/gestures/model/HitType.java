package ovh.plrapps.mapcompose.ui.gestures.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/gestures/model/HitType;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HitType {
    public static final HitType d;
    public static final HitType e;
    public static final /* synthetic */ HitType[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        HitType hitType = new HitType("Click", 0);
        d = hitType;
        HitType hitType2 = new HitType("LongPress", 1);
        e = hitType2;
        HitType[] hitTypeArr = {hitType, hitType2};
        f = hitTypeArr;
        g = EnumEntriesKt.a(hitTypeArr);
    }

    public static HitType valueOf(String str) {
        return (HitType) Enum.valueOf(HitType.class, str);
    }

    public static HitType[] values() {
        return (HitType[]) f.clone();
    }
}
