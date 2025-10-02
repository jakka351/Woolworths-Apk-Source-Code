package org.sqlite;

import java.util.Properties;
import java.util.TreeSet;

/* loaded from: classes8.dex */
public class SQLiteConfig {
    public static final String[] e = {"true", "false"};
    public static final TreeSet f = new TreeSet();

    /* renamed from: a, reason: collision with root package name */
    public final Properties f26877a;
    public final int b;
    public final int c;
    public final SQLiteConnectionConfig d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DateClass implements PragmaValue {
        public static final DateClass d;
        public static final /* synthetic */ DateClass[] e;

        static {
            DateClass dateClass = new DateClass("INTEGER", 0);
            d = dateClass;
            e = new DateClass[]{dateClass, new DateClass("TEXT", 1), new DateClass("REAL", 2)};
        }

        public static DateClass valueOf(String str) {
            return (DateClass) Enum.valueOf(DateClass.class, str);
        }

        public static DateClass[] values() {
            return (DateClass[]) e.clone();
        }

        @Override // org.sqlite.SQLiteConfig.PragmaValue
        public final String getValue() {
            return name();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DatePrecision implements PragmaValue {
        public static final DatePrecision d;
        public static final /* synthetic */ DatePrecision[] e;

        /* JADX INFO: Fake field, exist only in values array */
        DatePrecision EF0;

        static {
            DatePrecision datePrecision = new DatePrecision("SECONDS", 0);
            DatePrecision datePrecision2 = new DatePrecision("MILLISECONDS", 1);
            d = datePrecision2;
            e = new DatePrecision[]{datePrecision, datePrecision2};
        }

        public static DatePrecision valueOf(String str) {
            return (DatePrecision) Enum.valueOf(DatePrecision.class, str);
        }

        public static DatePrecision[] values() {
            return (DatePrecision[]) e.clone();
        }

        @Override // org.sqlite.SQLiteConfig.PragmaValue
        public final String getValue() {
            return name();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class HexKeyMode implements PragmaValue {
        public static final /* synthetic */ HexKeyMode[] d = {new HexKeyMode("NONE", 0), new HexKeyMode("SSE", 1), new HexKeyMode("SQLCIPHER", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        HexKeyMode EF5;

        public static HexKeyMode valueOf(String str) {
            return (HexKeyMode) Enum.valueOf(HexKeyMode.class, str);
        }

        public static HexKeyMode[] values() {
            return (HexKeyMode[]) d.clone();
        }

        @Override // org.sqlite.SQLiteConfig.PragmaValue
        public final String getValue() {
            return name();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class JournalMode implements PragmaValue {
        public static final /* synthetic */ JournalMode[] d = {new JournalMode("DELETE", 0), new JournalMode("TRUNCATE", 1), new JournalMode("PERSIST", 2), new JournalMode("MEMORY", 3), new JournalMode("WAL", 4), new JournalMode("OFF", 5)};

        /* JADX INFO: Fake field, exist only in values array */
        JournalMode EF5;

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) d.clone();
        }

        @Override // org.sqlite.SQLiteConfig.PragmaValue
        public final String getValue() {
            return name();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LockingMode implements PragmaValue {
        public static final /* synthetic */ LockingMode[] d = {new LockingMode("NORMAL", 0), new LockingMode("EXCLUSIVE", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        LockingMode EF5;

        public static LockingMode valueOf(String str) {
            return (LockingMode) Enum.valueOf(LockingMode.class, str);
        }

        public static LockingMode[] values() {
            return (LockingMode[]) d.clone();
        }

        @Override // org.sqlite.SQLiteConfig.PragmaValue
        public final String getValue() {
            return name();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Pragma {
        public static final Pragma A;
        public static final /* synthetic */ Pragma[] B;
        public static final Pragma g;
        public static final Pragma h;
        public static final Pragma i;
        public static final Pragma j;
        public static final Pragma k;
        public static final Pragma l;
        public static final Pragma m;
        public static final Pragma n;
        public static final Pragma o;
        public static final Pragma p;
        public static final Pragma q;
        public static final Pragma r;
        public static final Pragma s;
        public static final Pragma t;
        public static final Pragma u;
        public static final Pragma v;
        public static final Pragma w;
        public static final Pragma x;
        public static final Pragma y;
        public static final Pragma z;
        public final String d;
        public final String[] e;
        public final String f;

        /* JADX INFO: Fake field, exist only in values array */
        Pragma EF0;

        static {
            Pragma pragma = new Pragma("OPEN_MODE", 0, "open_mode", "Database open-mode flag", null);
            String[] strArr = SQLiteConfig.e;
            Pragma pragma2 = new Pragma("SHARED_CACHE", 1, "shared_cache", "Enable SQLite Shared-Cache mode, native driver only", strArr);
            g = pragma2;
            Pragma pragma3 = new Pragma("LOAD_EXTENSION", 2, "enable_load_extension", "Enable SQLite load_extention() function, native driver only", strArr);
            h = pragma3;
            Pragma pragma4 = new Pragma("CACHE_SIZE", 3, "cache_size");
            Pragma pragma5 = new Pragma("MMAP_SIZE", 4, "mmap_size");
            Pragma pragma6 = new Pragma("CASE_SENSITIVE_LIKE", 5, "case_sensitive_like", null, strArr);
            Pragma pragma7 = new Pragma("COUNT_CHANGES", 6, "count_changes", null, strArr);
            Pragma pragma8 = new Pragma("DEFAULT_CACHE_SIZE", 7, "default_cache_size");
            Pragma pragma9 = new Pragma("DEFER_FOREIGN_KEYS", 8, "defer_foreign_keys", null, strArr);
            Pragma pragma10 = new Pragma("EMPTY_RESULT_CALLBACKS", 9, "empty_result_callback", null, strArr);
            Pragma pragma11 = new Pragma("ENCODING", 10, "encoding", null, SQLiteConfig.a(Encoding.values()));
            Pragma pragma12 = new Pragma("FOREIGN_KEYS", 11, "foreign_keys", null, strArr);
            Pragma pragma13 = new Pragma("FULL_COLUMN_NAMES", 12, "full_column_names", null, strArr);
            Pragma pragma14 = new Pragma("FULL_SYNC", 13, "fullsync", null, strArr);
            Pragma pragma15 = new Pragma("INCREMENTAL_VACUUM", 14, "incremental_vacuum");
            Pragma pragma16 = new Pragma("JOURNAL_MODE", 15, "journal_mode", null, SQLiteConfig.a(JournalMode.values()));
            Pragma pragma17 = new Pragma("JOURNAL_SIZE_LIMIT", 16, "journal_size_limit");
            Pragma pragma18 = new Pragma("LEGACY_FILE_FORMAT", 17, "legacy_file_format", null, strArr);
            Pragma pragma19 = new Pragma("LOCKING_MODE", 18, "locking_mode", null, SQLiteConfig.a(LockingMode.values()));
            Pragma pragma20 = new Pragma("PAGE_SIZE", 19, "page_size");
            Pragma pragma21 = new Pragma("MAX_PAGE_COUNT", 20, "max_page_count");
            Pragma pragma22 = new Pragma("READ_UNCOMMITTED", 21, "read_uncommitted", null, strArr);
            Pragma pragma23 = new Pragma("RECURSIVE_TRIGGERS", 22, "recursive_triggers", null, strArr);
            Pragma pragma24 = new Pragma("REVERSE_UNORDERED_SELECTS", 23, "reverse_unordered_selects", null, strArr);
            Pragma pragma25 = new Pragma("SECURE_DELETE", 24, "secure_delete", null, new String[]{"true", "false", "fast"});
            Pragma pragma26 = new Pragma("SHORT_COLUMN_NAMES", 25, "short_column_names", null, strArr);
            Pragma pragma27 = new Pragma("SYNCHRONOUS", 26, "synchronous", null, SQLiteConfig.a(SynchronousMode.values()));
            Pragma pragma28 = new Pragma("TEMP_STORE", 27, "temp_store", null, SQLiteConfig.a(TempStore.values()));
            Pragma pragma29 = new Pragma("TEMP_STORE_DIRECTORY", 28, "temp_store_directory");
            Pragma pragma30 = new Pragma("USER_VERSION", 29, "user_version");
            Pragma pragma31 = new Pragma("APPLICATION_ID", 30, "application_id");
            Pragma pragma32 = new Pragma("LIMIT_LENGTH", 31, "limit_length", "The maximum size of any string or BLOB or table row, in bytes.", null);
            i = pragma32;
            Pragma pragma33 = new Pragma("LIMIT_SQL_LENGTH", 32, "limit_sql_length", "The maximum length of an SQL statement, in bytes.", null);
            j = pragma33;
            Pragma pragma34 = new Pragma("LIMIT_COLUMN", 33, "limit_column", "The maximum number of columns in a table definition or in the result set of a SELECT or the maximum number of columns in an index or in an ORDER BY or GROUP BY clause.", null);
            k = pragma34;
            Pragma pragma35 = new Pragma("LIMIT_EXPR_DEPTH", 34, "limit_expr_depth", "The maximum depth of the parse tree on any expression.", null);
            l = pragma35;
            Pragma pragma36 = new Pragma("LIMIT_COMPOUND_SELECT", 35, "limit_compound_select", "The maximum number of terms in a compound SELECT statement.", null);
            m = pragma36;
            Pragma pragma37 = new Pragma("LIMIT_VDBE_OP", 36, "limit_vdbe_op", "The maximum number of instructions in a virtual machine program used to implement an SQL statement. If sqlite3_prepare_v2() or the equivalent tries to allocate space for more than this many opcodes in a single prepared statement, an SQLITE_NOMEM error is returned.", null);
            n = pragma37;
            Pragma pragma38 = new Pragma("LIMIT_FUNCTION_ARG", 37, "limit_function_arg", "The maximum number of arguments on a function.", null);
            o = pragma38;
            Pragma pragma39 = new Pragma("LIMIT_ATTACHED", 38, "limit_attached", "The maximum number of attached databases.", null);
            p = pragma39;
            Pragma pragma40 = new Pragma("LIMIT_LIKE_PATTERN_LENGTH", 39, "limit_like_pattern_length", "The maximum length of the pattern argument to the LIKE or GLOB operators.", null);
            q = pragma40;
            Pragma pragma41 = new Pragma("LIMIT_VARIABLE_NUMBER", 40, "limit_variable_number", "The maximum index number of any parameter in an SQL statement.", null);
            r = pragma41;
            Pragma pragma42 = new Pragma("LIMIT_TRIGGER_DEPTH", 41, "limit_trigger_depth", "The maximum depth of recursion for triggers.", null);
            s = pragma42;
            Pragma pragma43 = new Pragma("LIMIT_WORKER_THREADS", 42, "limit_worker_threads", "The maximum number of auxiliary worker threads that a single prepared statement may start.", null);
            t = pragma43;
            Pragma pragma44 = new Pragma("TRANSACTION_MODE", 43, "transaction_mode", null, SQLiteConfig.a(TransactionMode.values()));
            u = pragma44;
            Pragma pragma45 = new Pragma("DATE_PRECISION", 44, "date_precision", "\"seconds\": Read and store integer dates as seconds from the Unix Epoch (SQLite standard).\n\"milliseconds\": (DEFAULT) Read and store integer dates as milliseconds from the Unix Epoch (Java standard).", SQLiteConfig.a(DatePrecision.values()));
            v = pragma45;
            Pragma pragma46 = new Pragma("DATE_CLASS", 45, "date_class", "\"integer\": (Default) store dates as number of seconds or milliseconds from the Unix Epoch\n\"text\": store dates as a string of text\n\"real\": store dates as Julian Dates", SQLiteConfig.a(DateClass.values()));
            w = pragma46;
            Pragma pragma47 = new Pragma("DATE_STRING_FORMAT", 46, "date_string_format", "Format to store and retrieve dates stored as text. Defaults to \"yyyy-MM-dd HH:mm:ss.SSS\"", null);
            x = pragma47;
            Pragma pragma48 = new Pragma("BUSY_TIMEOUT", 47, "busy_timeout", null, null);
            y = pragma48;
            Pragma pragma49 = new Pragma("HEXKEY_MODE", 48, "hexkey_mode", null, SQLiteConfig.a(HexKeyMode.values()));
            z = pragma49;
            Pragma pragma50 = new Pragma("PASSWORD", 49, "password", null, null);
            A = pragma50;
            B = new Pragma[]{pragma, pragma2, pragma3, pragma4, pragma5, pragma6, pragma7, pragma8, pragma9, pragma10, pragma11, pragma12, pragma13, pragma14, pragma15, pragma16, pragma17, pragma18, pragma19, pragma20, pragma21, pragma22, pragma23, pragma24, pragma25, pragma26, pragma27, pragma28, pragma29, pragma30, pragma31, pragma32, pragma33, pragma34, pragma35, pragma36, pragma37, pragma38, pragma39, pragma40, pragma41, pragma42, pragma43, pragma44, pragma45, pragma46, pragma47, pragma48, pragma49, pragma50};
        }

        public Pragma(String str, int i2, String str2) {
            this(str, i2, str2, null, null);
        }

        public static Pragma valueOf(String str) {
            return (Pragma) Enum.valueOf(Pragma.class, str);
        }

        public static Pragma[] values() {
            return (Pragma[]) B.clone();
        }

        public Pragma(String str, int i2, String str2, String str3, String[] strArr) {
            this.d = str2;
            this.f = str3;
            this.e = strArr;
        }
    }

    public interface PragmaValue {
        String getValue();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SynchronousMode implements PragmaValue {
        public static final /* synthetic */ SynchronousMode[] d = {new SynchronousMode("OFF", 0), new SynchronousMode("NORMAL", 1), new SynchronousMode("FULL", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        SynchronousMode EF5;

        public static SynchronousMode valueOf(String str) {
            return (SynchronousMode) Enum.valueOf(SynchronousMode.class, str);
        }

        public static SynchronousMode[] values() {
            return (SynchronousMode[]) d.clone();
        }

        @Override // org.sqlite.SQLiteConfig.PragmaValue
        public final String getValue() {
            return name();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TempStore implements PragmaValue {
        public static final /* synthetic */ TempStore[] d = {new TempStore("DEFAULT", 0), new TempStore("FILE", 1), new TempStore("MEMORY", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        TempStore EF5;

        public static TempStore valueOf(String str) {
            return (TempStore) Enum.valueOf(TempStore.class, str);
        }

        public static TempStore[] values() {
            return (TempStore[]) d.clone();
        }

        @Override // org.sqlite.SQLiteConfig.PragmaValue
        public final String getValue() {
            return name();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransactionMode implements PragmaValue {
        public static final TransactionMode d;
        public static final TransactionMode e;
        public static final TransactionMode f;
        public static final TransactionMode g;
        public static final /* synthetic */ TransactionMode[] h;

        static {
            TransactionMode transactionMode = new TransactionMode("DEFFERED", 0);
            d = transactionMode;
            TransactionMode transactionMode2 = new TransactionMode("DEFERRED", 1);
            e = transactionMode2;
            TransactionMode transactionMode3 = new TransactionMode("IMMEDIATE", 2);
            f = transactionMode3;
            TransactionMode transactionMode4 = new TransactionMode("EXCLUSIVE", 3);
            g = transactionMode4;
            h = new TransactionMode[]{transactionMode, transactionMode2, transactionMode3, transactionMode4};
        }

        public static TransactionMode valueOf(String str) {
            return (TransactionMode) Enum.valueOf(TransactionMode.class, str);
        }

        public static TransactionMode[] values() {
            return (TransactionMode[]) h.clone();
        }

        @Override // org.sqlite.SQLiteConfig.PragmaValue
        public final String getValue() {
            return name();
        }
    }

    static {
        for (Pragma pragma : Pragma.values()) {
            f.add(pragma.d);
        }
    }

    public SQLiteConfig(Properties properties) {
        this.b = 0;
        this.f26877a = properties;
        Pragma pragma = Pragma.g;
        String property = properties.getProperty("open_mode");
        if (property != null) {
            this.b = Integer.parseInt(property);
        } else {
            this.b |= 6;
        }
        Pragma pragma2 = Pragma.g;
        properties.put(pragma2.d, Boolean.toString(Boolean.parseBoolean(properties.getProperty(pragma2.d, "false"))));
        this.b |= 64;
        this.c = Integer.parseInt(properties.getProperty(Pragma.y.d, "3000"));
        DateClass dateClassValueOf = DateClass.valueOf(properties.getProperty(Pragma.w.d, "INTEGER").toUpperCase());
        DatePrecision datePrecisionValueOf = DatePrecision.valueOf(properties.getProperty(Pragma.v.d, "MILLISECONDS").toUpperCase());
        String property2 = properties.getProperty(Pragma.x.d, "yyyy-MM-dd HH:mm:ss.SSS");
        String property3 = properties.getProperty(Pragma.u.d, "DEFERRED");
        this.d = new SQLiteConnectionConfig(dateClassValueOf, datePrecisionValueOf, property2, 8, "DEFFERED".equalsIgnoreCase(property3) ? TransactionMode.e : TransactionMode.valueOf(property3.toUpperCase()), true);
    }

    public static String[] a(PragmaValue[] pragmaValueArr) {
        String[] strArr = new String[pragmaValueArr.length];
        for (int i = 0; i < pragmaValueArr.length; i++) {
            strArr[i] = pragmaValueArr[i].getValue();
        }
        return strArr;
    }

    public final int b(Pragma pragma) {
        return Integer.parseInt(this.f26877a.getProperty(pragma.d, "-1"));
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF45' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Encoding implements PragmaValue {
        public static final /* synthetic */ Encoding[] e;
        public final String d;

        /* JADX INFO: Fake field, exist only in values array */
        Encoding EF0;

        /* JADX INFO: Fake field, exist only in values array */
        Encoding EF1;

        /* JADX INFO: Fake field, exist only in values array */
        Encoding EF2;

        /* JADX INFO: Fake field, exist only in values array */
        Encoding EF3;

        /* JADX INFO: Fake field, exist only in values array */
        Encoding EF45;

        static {
            Encoding encoding = new Encoding("UTF8", 0, "'UTF-8'");
            Encoding encoding2 = new Encoding("UTF16", 1, "'UTF-16'");
            Encoding encoding3 = new Encoding("UTF16_LITTLE_ENDIAN", 2, "'UTF-16le'");
            Encoding encoding4 = new Encoding("UTF16_BIG_ENDIAN", 3, "'UTF-16be'");
            e = new Encoding[]{encoding, encoding2, encoding3, encoding4, new Encoding("UTF_8", 4, encoding), new Encoding("UTF_16", 5, encoding2), new Encoding("UTF_16LE", 6, encoding3), new Encoding("UTF_16BE", 7, encoding4)};
        }

        public Encoding(String str, int i, String str2) {
            this.d = str2;
        }

        public static Encoding valueOf(String str) {
            return (Encoding) Enum.valueOf(Encoding.class, str);
        }

        public static Encoding[] values() {
            return (Encoding[]) e.clone();
        }

        @Override // org.sqlite.SQLiteConfig.PragmaValue
        public final String getValue() {
            return this.d;
        }

        public Encoding(String str, int i, Encoding encoding) {
            this.d = encoding.d;
        }
    }
}
