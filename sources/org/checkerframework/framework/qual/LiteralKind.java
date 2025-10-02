package org.checkerframework.framework.qual;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class LiteralKind {
    public static final /* synthetic */ LiteralKind[] d = {new LiteralKind("NULL", 0), new LiteralKind("INT", 1), new LiteralKind("LONG", 2), new LiteralKind("FLOAT", 3), new LiteralKind("DOUBLE", 4), new LiteralKind("BOOLEAN", 5), new LiteralKind("CHAR", 6), new LiteralKind("STRING", 7), new LiteralKind("ALL", 8), new LiteralKind("PRIMITIVE", 9)};

    /* JADX INFO: Fake field, exist only in values array */
    LiteralKind EF5;

    public static LiteralKind valueOf(String str) {
        return (LiteralKind) Enum.valueOf(LiteralKind.class, str);
    }

    public static LiteralKind[] values() {
        return (LiteralKind[]) d.clone();
    }
}
