package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/BackdropValue;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BackdropValue {
    public static final BackdropValue d;
    public static final BackdropValue e;
    public static final /* synthetic */ BackdropValue[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        BackdropValue backdropValue = new BackdropValue("Concealed", 0);
        d = backdropValue;
        BackdropValue backdropValue2 = new BackdropValue("Revealed", 1);
        e = backdropValue2;
        BackdropValue[] backdropValueArr = {backdropValue, backdropValue2};
        f = backdropValueArr;
        g = EnumEntriesKt.a(backdropValueArr);
    }

    public static BackdropValue valueOf(String str) {
        return (BackdropValue) Enum.valueOf(BackdropValue.class, str);
    }

    public static BackdropValue[] values() {
        return (BackdropValue[]) f.clone();
    }
}
