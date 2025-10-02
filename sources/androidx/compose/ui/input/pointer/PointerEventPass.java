package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventPass;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerEventPass {
    public static final PointerEventPass d;
    public static final PointerEventPass e;
    public static final PointerEventPass f;
    public static final /* synthetic */ PointerEventPass[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        PointerEventPass pointerEventPass = new PointerEventPass("Initial", 0);
        d = pointerEventPass;
        PointerEventPass pointerEventPass2 = new PointerEventPass("Main", 1);
        e = pointerEventPass2;
        PointerEventPass pointerEventPass3 = new PointerEventPass("Final", 2);
        f = pointerEventPass3;
        PointerEventPass[] pointerEventPassArr = {pointerEventPass, pointerEventPass2, pointerEventPass3};
        g = pointerEventPassArr;
        h = EnumEntriesKt.a(pointerEventPassArr);
    }

    public static PointerEventPass valueOf(String str) {
        return (PointerEventPass) Enum.valueOf(PointerEventPass.class, str);
    }

    public static PointerEventPass[] values() {
        return (PointerEventPass[]) g.clone();
    }
}
