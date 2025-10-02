package com.fasterxml.jackson.annotation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PropertyAccessor {
    public static final /* synthetic */ PropertyAccessor[] d = {new PropertyAccessor("GETTER", 0), new PropertyAccessor("SETTER", 1), new PropertyAccessor("CREATOR", 2), new PropertyAccessor("FIELD", 3), new PropertyAccessor("IS_GETTER", 4), new PropertyAccessor("NONE", 5), new PropertyAccessor("ALL", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    PropertyAccessor EF5;

    public static PropertyAccessor valueOf(String str) {
        return (PropertyAccessor) Enum.valueOf(PropertyAccessor.class, str);
    }

    public static PropertyAccessor[] values() {
        return (PropertyAccessor[]) d.clone();
    }
}
