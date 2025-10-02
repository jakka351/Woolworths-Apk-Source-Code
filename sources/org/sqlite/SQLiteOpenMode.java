package org.sqlite;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class SQLiteOpenMode {
    public static final /* synthetic */ SQLiteOpenMode[] d = {new SQLiteOpenMode("READONLY", 0), new SQLiteOpenMode("READWRITE", 1), new SQLiteOpenMode("CREATE", 2), new SQLiteOpenMode("DELETEONCLOSE", 3), new SQLiteOpenMode("EXCLUSIVE", 4), new SQLiteOpenMode("OPEN_URI", 5), new SQLiteOpenMode("OPEN_MEMORY", 6), new SQLiteOpenMode("MAIN_DB", 7), new SQLiteOpenMode("TEMP_DB", 8), new SQLiteOpenMode("TRANSIENT_DB", 9), new SQLiteOpenMode("MAIN_JOURNAL", 10), new SQLiteOpenMode("TEMP_JOURNAL", 11), new SQLiteOpenMode("SUBJOURNAL", 12), new SQLiteOpenMode("MASTER_JOURNAL", 13), new SQLiteOpenMode("NOMUTEX", 14), new SQLiteOpenMode("FULLMUTEX", 15), new SQLiteOpenMode("SHAREDCACHE", 16), new SQLiteOpenMode("PRIVATECACHE", 17)};

    /* JADX INFO: Fake field, exist only in values array */
    SQLiteOpenMode EF5;

    public static SQLiteOpenMode valueOf(String str) {
        return (SQLiteOpenMode) Enum.valueOf(SQLiteOpenMode.class, str);
    }

    public static SQLiteOpenMode[] values() {
        return (SQLiteOpenMode[]) d.clone();
    }
}
