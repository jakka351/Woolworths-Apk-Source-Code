package coil.size;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcoil/size/Scale;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Scale {
    public static final Scale d;
    public static final Scale e;
    public static final /* synthetic */ Scale[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        Scale scale = new Scale("FILL", 0);
        d = scale;
        Scale scale2 = new Scale("FIT", 1);
        e = scale2;
        Scale[] scaleArr = {scale, scale2};
        f = scaleArr;
        g = EnumEntriesKt.a(scaleArr);
    }

    public static Scale valueOf(String str) {
        return (Scale) Enum.valueOf(Scale.class, str);
    }

    public static Scale[] values() {
        return (Scale[]) f.clone();
    }
}
