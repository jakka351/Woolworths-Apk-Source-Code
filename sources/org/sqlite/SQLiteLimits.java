package org.sqlite;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class SQLiteLimits {
    public static final /* synthetic */ SQLiteLimits[] d = {new SQLiteLimits("SQLITE_LIMIT_LENGTH", 0), new SQLiteLimits("SQLITE_LIMIT_SQL_LENGTH", 1), new SQLiteLimits("SQLITE_LIMIT_COLUMN", 2), new SQLiteLimits("SQLITE_LIMIT_EXPR_DEPTH", 3), new SQLiteLimits("SQLITE_LIMIT_COMPOUND_SELECT", 4), new SQLiteLimits("SQLITE_LIMIT_VDBE_OP", 5), new SQLiteLimits("SQLITE_LIMIT_FUNCTION_ARG", 6), new SQLiteLimits("SQLITE_LIMIT_ATTACHED", 7), new SQLiteLimits("SQLITE_LIMIT_LIKE_PATTERN_LENGTH", 8), new SQLiteLimits("SQLITE_LIMIT_VARIABLE_NUMBER", 9), new SQLiteLimits("SQLITE_LIMIT_TRIGGER_DEPTH", 10), new SQLiteLimits("SQLITE_LIMIT_WORKER_THREADS", 11)};

    /* JADX INFO: Fake field, exist only in values array */
    SQLiteLimits EF5;

    public static SQLiteLimits valueOf(String str) {
        return (SQLiteLimits) Enum.valueOf(SQLiteLimits.class, str);
    }

    public static SQLiteLimits[] values() {
        return (SQLiteLimits[]) d.clone();
    }
}
