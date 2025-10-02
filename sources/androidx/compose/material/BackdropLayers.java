package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/BackdropLayers;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BackdropLayers {
    public static final BackdropLayers d;
    public static final BackdropLayers e;
    public static final /* synthetic */ BackdropLayers[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        BackdropLayers backdropLayers = new BackdropLayers("Back", 0);
        d = backdropLayers;
        BackdropLayers backdropLayers2 = new BackdropLayers("Front", 1);
        e = backdropLayers2;
        BackdropLayers[] backdropLayersArr = {backdropLayers, backdropLayers2};
        f = backdropLayersArr;
        g = EnumEntriesKt.a(backdropLayersArr);
    }

    public static BackdropLayers valueOf(String str) {
        return (BackdropLayers) Enum.valueOf(BackdropLayers.class, str);
    }

    public static BackdropLayers[] values() {
        return (BackdropLayers[]) f.clone();
    }
}
