package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class MemoryCategory {
    public static final /* synthetic */ MemoryCategory[] d = {new MemoryCategory("LOW", 0), new MemoryCategory("NORMAL", 1), new MemoryCategory("HIGH", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    MemoryCategory EF5;

    public static MemoryCategory valueOf(String str) {
        return (MemoryCategory) Enum.valueOf(MemoryCategory.class, str);
    }

    public static MemoryCategory[] values() {
        return (MemoryCategory[]) d.clone();
    }
}
