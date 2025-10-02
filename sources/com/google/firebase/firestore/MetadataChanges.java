package com.google.firebase.firestore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class MetadataChanges {
    public static final /* synthetic */ MetadataChanges[] d = {new MetadataChanges("EXCLUDE", 0), new MetadataChanges("INCLUDE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    MetadataChanges EF5;

    public static MetadataChanges valueOf(String str) {
        return (MetadataChanges) Enum.valueOf(MetadataChanges.class, str);
    }

    public static MetadataChanges[] values() {
        return (MetadataChanges[]) d.clone();
    }
}
