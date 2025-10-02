package org.tensorflow.lite;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class RuntimeFlavor {
    public static final /* synthetic */ RuntimeFlavor[] d = {new RuntimeFlavor("APPLICATION", 0), new RuntimeFlavor("SYSTEM", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    RuntimeFlavor EF5;

    public static RuntimeFlavor valueOf(String str) {
        return (RuntimeFlavor) Enum.valueOf(RuntimeFlavor.class, str);
    }

    public static RuntimeFlavor[] values() {
        return (RuntimeFlavor[]) d.clone();
    }
}
