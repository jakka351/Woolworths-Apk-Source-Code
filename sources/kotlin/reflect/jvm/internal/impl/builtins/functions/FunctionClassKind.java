package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class FunctionClassKind {
    public static final Companion d;
    public static final /* synthetic */ FunctionClassKind[] e;
    public static final /* synthetic */ EnumEntries f;

    public static final class Companion {
    }

    static {
        FunctionClassKind[] functionClassKindArr = {new FunctionClassKind("Function", 0), new FunctionClassKind("SuspendFunction", 1), new FunctionClassKind("KFunction", 2), new FunctionClassKind("KSuspendFunction", 3), new FunctionClassKind("UNKNOWN", 4)};
        e = functionClassKindArr;
        f = EnumEntriesKt.a(functionClassKindArr);
        d = new Companion();
    }

    public static FunctionClassKind valueOf(String str) {
        return (FunctionClassKind) Enum.valueOf(FunctionClassKind.class, str);
    }

    public static FunctionClassKind[] values() {
        return (FunctionClassKind[]) e.clone();
    }
}
