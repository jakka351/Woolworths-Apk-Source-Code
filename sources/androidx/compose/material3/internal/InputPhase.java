package androidx.compose.material3.internal;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/internal/InputPhase;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class InputPhase {
    public static final InputPhase d;
    public static final InputPhase e;
    public static final InputPhase f;
    public static final /* synthetic */ InputPhase[] g;

    static {
        InputPhase inputPhase = new InputPhase("Focused", 0);
        d = inputPhase;
        InputPhase inputPhase2 = new InputPhase("UnfocusedEmpty", 1);
        e = inputPhase2;
        InputPhase inputPhase3 = new InputPhase("UnfocusedNotEmpty", 2);
        f = inputPhase3;
        g = new InputPhase[]{inputPhase, inputPhase2, inputPhase3};
    }

    public static InputPhase valueOf(String str) {
        return (InputPhase) Enum.valueOf(InputPhase.class, str);
    }

    public static InputPhase[] values() {
        return (InputPhase[]) g.clone();
    }
}
