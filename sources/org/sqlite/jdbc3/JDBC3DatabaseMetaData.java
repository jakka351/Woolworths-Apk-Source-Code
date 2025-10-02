package org.sqlite.jdbc3;

import android.support.v4.media.session.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.regex.Pattern;
import org.sqlite.SQLiteConnection;
import org.sqlite.core.CoreDatabaseMetaData;
import org.sqlite.core.CoreStatement;
import org.sqlite.util.StringUtils;

/* loaded from: classes8.dex */
public abstract class JDBC3DatabaseMetaData extends CoreDatabaseMetaData {
    public static final Pattern A;
    public static final String t;
    public static final String u;
    public static final Pattern v;
    public static final Pattern w;
    public static final Pattern x;
    public static final HashMap y;
    public static final Pattern z;

    public class ImportedKeyFinder {

        /* renamed from: a, reason: collision with root package name */
        public final String f26905a;
        public final ArrayList b;

        public class ForeignKey {

            /* renamed from: a, reason: collision with root package name */
            public String f26906a;
            public String b;
            public String c;
            public ArrayList d;
            public ArrayList e;
            public String f;
            public String g;

            public final String toString() {
                StringBuilder sb = new StringBuilder("ForeignKey [fkName=");
                sb.append(this.f26906a);
                sb.append(", pkTableName=");
                sb.append(this.b);
                sb.append(", fkTableName=");
                sb.append(this.c);
                sb.append(", pkColNames=");
                sb.append(this.e);
                sb.append(", fkColNames=");
                return a.q("]", sb, this.d);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:69:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:98:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public ImportedKeyFinder(java.lang.String r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 335
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.sqlite.jdbc3.JDBC3DatabaseMetaData.ImportedKeyFinder.<init>(org.sqlite.jdbc3.JDBC3DatabaseMetaData, java.lang.String):void");
        }
    }

    public class PrimaryKeyFinder {

        /* renamed from: a, reason: collision with root package name */
        public final String f26907a;
        public final String[] b;

        /* JADX WARN: Can't wrap try/catch for region: R(9:10|11|(1:13)(2:16|(1:18))|19|(3:21|(4:24|(3:68|26|71)(1:70)|69|22)|67)|27|(4:(6:29|(2:30|(2:32|33)(0))|34|56|35|36)(0)|56|35|36)|59|34) */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:73:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public PrimaryKeyFinder(java.lang.String r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 274
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.sqlite.jdbc3.JDBC3DatabaseMetaData.PrimaryKeyFinder.<init>(org.sqlite.jdbc3.JDBC3DatabaseMetaData, java.lang.String):void");
        }
    }

    static {
        InputStream resourceAsStream = null;
        try {
            try {
                resourceAsStream = JDBC3DatabaseMetaData.class.getClassLoader().getResourceAsStream("sqlite-jdbc.properties");
            } catch (Exception unused) {
                t = "SQLite JDBC";
                u = "3.0.0-UNKNOWN";
                if (0 != 0) {
                }
            }
            if (resourceAsStream == null) {
                throw new IOException("Cannot load sqlite-jdbc.properties from jar");
            }
            Properties properties = new Properties();
            properties.load(resourceAsStream);
            t = properties.getProperty(AppMeasurementSdk.ConditionalUserProperty.NAME);
            u = properties.getProperty("version");
            try {
                resourceAsStream.close();
            } catch (Exception unused2) {
            }
            v = Pattern.compile(".*(INT|BOOL).*");
            w = Pattern.compile(".*(CHAR|CLOB|TEXT|BLOB).*");
            x = Pattern.compile(".*(REAL|FLOA|DOUB|DEC|NUM).*");
            HashMap map = new HashMap();
            y = map;
            androidx.constraintlayout.core.state.a.u(3, map, "NO ACTION", 0, "CASCADE");
            androidx.constraintlayout.core.state.a.u(1, map, "RESTRICT", 2, "SET NULL");
            map.put("SET DEFAULT", 4);
            z = Pattern.compile(".*PRIMARY\\s+KEY\\s*\\((.*?)\\).*", 34);
            A = Pattern.compile(".*CONSTRAINT\\s*(.*?)\\s*PRIMARY\\s+KEY\\s*\\((.*?)\\).*", 34);
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    resourceAsStream.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    public static void c(StringBuilder sb) {
        androidx.constraintlayout.core.state.a.t(3, 3, "select -1 as ks, '' as ptn, '' as fcn, '' as pcn, ", " as ur, ", sb);
        androidx.constraintlayout.core.state.a.B(sb, " as dr, ", " '' as fkn, ", " '' as pkn ", ") limit 0;");
    }

    public static String d(String str) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > 2 ? ((strTrim.startsWith("`") && strTrim.endsWith("`")) || (strTrim.startsWith("\"") && strTrim.endsWith("\"")) || (strTrim.startsWith("[") && strTrim.endsWith("]"))) ? androidx.compose.ui.input.pointer.a.h(1, 1, strTrim) : strTrim : strTrim;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean allProceduresAreCallable() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean allTablesAreSelectable() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean dataDefinitionCausesTransactionCommit() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean dataDefinitionIgnoredInTransactions() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean deletesAreDetected(int i) {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean doesMaxRowSizeIncludeBlobs() {
        return false;
    }

    @Override // org.sqlite.core.CoreDatabaseMetaData
    public final void finalize() {
        close();
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getAttributes(String str, String str2, String str3, String str4) {
        if (this.o == null) {
            this.o = this.d.prepareStatement("select null as TYPE_CAT, null as TYPE_SCHEM, null as TYPE_NAME, null as ATTR_NAME, null as DATA_TYPE, null as ATTR_TYPE_NAME, null as ATTR_SIZE, null as DECIMAL_DIGITS, null as NUM_PREC_RADIX, null as NULLABLE, null as REMARKS, null as ATTR_DEF, null as SQL_DATA_TYPE, null as SQL_DATETIME_SUB, null as CHAR_OCTET_LENGTH, null as ORDINAL_POSITION, null as IS_NULLABLE, null as SCOPE_CATALOG, null as SCOPE_SCHEMA, null as SCOPE_TABLE, null as SOURCE_DATA_TYPE limit 0;");
        }
        return this.o.executeQuery();
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getBestRowIdentifier(String str, String str2, String str3, int i, boolean z2) {
        if (this.p == null) {
            this.p = this.d.prepareStatement("select null as SCOPE, null as COLUMN_NAME, null as DATA_TYPE, null as TYPE_NAME, null as COLUMN_SIZE, null as BUFFER_LENGTH, null as DECIMAL_DIGITS, null as PSEUDO_COLUMN limit 0;");
        }
        return this.p.executeQuery();
    }

    @Override // java.sql.DatabaseMetaData
    public final String getCatalogSeparator() {
        return ".";
    }

    @Override // java.sql.DatabaseMetaData
    public final String getCatalogTerm() {
        return "catalog";
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getCatalogs() {
        if (this.g == null) {
            this.g = this.d.prepareStatement("select null as TABLE_CAT limit 0;");
        }
        return this.g.executeQuery();
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getColumnPrivileges(String str, String str2, String str3, String str4) {
        if (this.r == null) {
            this.r = this.d.prepareStatement("select null as TABLE_CAT, null as TABLE_SCHEM, null as TABLE_NAME, null as COLUMN_NAME, null as GRANTOR, null as GRANTEE, null as PRIVILEGE, null as IS_GRANTABLE limit 0;");
        }
        return this.r.executeQuery();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.sql.DatabaseMetaData
    public final ResultSet getColumns(String str, String str2, String str3, String str4) throws Throwable {
        Throwable th;
        ResultSet resultSet;
        Throwable th2;
        ResultSet resultSet2;
        ResultSet resultSetExecuteQuery;
        ResultSet resultSet3;
        if (this.d == null) {
            throw new SQLException("connection closed");
        }
        StringBuilder sbO = androidx.constraintlayout.core.state.a.o(700, "select null as TABLE_CAT, null as TABLE_SCHEM, tblname as TABLE_NAME, cn as COLUMN_NAME, ct as DATA_TYPE, tn as TYPE_NAME, 2000000000 as COLUMN_SIZE, 2000000000 as BUFFER_LENGTH, 10   as DECIMAL_DIGITS, 10   as NUM_PREC_RADIX, colnullable as NULLABLE, null as REMARKS, colDefault as COLUMN_DEF, 0    as SQL_DATA_TYPE, 0    as SQL_DATETIME_SUB, 2000000000 as CHAR_OCTET_LENGTH, ordpos as ORDINAL_POSITION, (case colnullable when 0 then 'NO' when 1 then 'YES' else '' end)    as IS_NULLABLE, null as SCOPE_CATLOG, null as SCOPE_SCHEMA, null as SCOPE_TABLE, null as SOURCE_DATA_TYPE, (case colautoincrement when 0 then 'NO' when 1 then 'YES' else '' end) as IS_AUTOINCREMENT, '' as IS_GENERATEDCOLUMN from (");
        try {
            ResultSet tables = getTables(str, str2, str3, new String[]{"TABLE", "VIEW"});
            int i = 0;
            while (tables.next()) {
                try {
                    int i2 = 3;
                    String string = tables.getString(3);
                    Statement statementCreateStatement = this.d.createStatement();
                    try {
                        statementCreateStatement = this.d.createStatement();
                        resultSetExecuteQuery = statementCreateStatement.executeQuery("SELECT LIKE('%autoincrement%', LOWER(sql)) FROM sqlite_master WHERE LOWER(name) = LOWER('" + CoreDatabaseMetaData.a(string) + "') AND TYPE IN ('table', 'view')");
                    } catch (Throwable th3) {
                        th2 = th3;
                        resultSet2 = null;
                    }
                    try {
                        resultSetExecuteQuery.next();
                        int i3 = 1;
                        boolean z2 = resultSetExecuteQuery.getInt(1) == 1;
                        try {
                            resultSetExecuteQuery.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        try {
                            statementCreateStatement.close();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        Statement statementCreateStatement2 = this.d.createStatement();
                        try {
                            ResultSet resultSetExecuteQuery2 = statementCreateStatement2.executeQuery("PRAGMA table_info('" + CoreDatabaseMetaData.a(string) + "')");
                            int i4 = 0;
                            while (resultSetExecuteQuery2.next()) {
                                try {
                                    String string2 = resultSetExecuteQuery2.getString(2);
                                    String string3 = resultSetExecuteQuery2.getString(i2);
                                    String string4 = resultSetExecuteQuery2.getString(4);
                                    String string5 = resultSetExecuteQuery2.getString(5);
                                    int i5 = i3;
                                    int i6 = 6;
                                    boolean zEquals = "1".equals(resultSetExecuteQuery2.getString(6));
                                    int iEquals = string4 != null ? string4.equals("0") : 2;
                                    if (i != 0) {
                                        sbO.append(" union all ");
                                    }
                                    String upperCase = string3 == null ? "TEXT" : string3.toUpperCase();
                                    int i7 = (zEquals && z2) ? i5 : 0;
                                    if (v.matcher(upperCase).find()) {
                                        i6 = 4;
                                    } else if (w.matcher(upperCase).find() || !x.matcher(upperCase).find()) {
                                        i6 = 12;
                                    }
                                    sbO.append("select ");
                                    i4++;
                                    sbO.append(i4);
                                    sbO.append(" as ordpos, ");
                                    sbO.append(iEquals);
                                    sbO.append(" as colnullable,");
                                    sbO.append("'");
                                    sbO.append(i6);
                                    sbO.append("' as ct, ");
                                    sbO.append("'");
                                    sbO.append(string);
                                    sbO.append("' as tblname, ");
                                    sbO.append("'");
                                    sbO.append(CoreDatabaseMetaData.a(string2));
                                    sbO.append("' as cn, ");
                                    sbO.append("'");
                                    sbO.append(CoreDatabaseMetaData.a(upperCase));
                                    sbO.append("' as tn, ");
                                    sbO.append(CoreDatabaseMetaData.b(string5 == null ? null : CoreDatabaseMetaData.a(string5)));
                                    sbO.append(" as colDefault,");
                                    sbO.append(i7);
                                    sbO.append(" as colautoincrement");
                                    if (str4 != null) {
                                        sbO.append(" where upper(cn) like upper('");
                                        sbO.append(CoreDatabaseMetaData.a(str4));
                                        sbO.append("')");
                                    }
                                    i = i5;
                                    i3 = i;
                                    i2 = 3;
                                } catch (Throwable th4) {
                                    th = th4;
                                    resultSet3 = resultSetExecuteQuery2;
                                    if (resultSet3 != null) {
                                        try {
                                            resultSet3.close();
                                        } catch (SQLException unused) {
                                        }
                                    }
                                    if (statementCreateStatement2 == null) {
                                        throw th;
                                    }
                                    try {
                                        statementCreateStatement2.close();
                                        throw th;
                                    } catch (SQLException unused2) {
                                        throw th;
                                    }
                                }
                            }
                            try {
                                resultSetExecuteQuery2.close();
                            } catch (SQLException unused3) {
                            }
                            try {
                                statementCreateStatement2.close();
                            } catch (SQLException unused4) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            resultSet3 = null;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        resultSet2 = resultSetExecuteQuery;
                        if (resultSet2 != null) {
                            try {
                                resultSet2.close();
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (statementCreateStatement == null) {
                            throw th2;
                        }
                        try {
                            statementCreateStatement.close();
                            throw th2;
                        } catch (Exception e4) {
                            e4.printStackTrace();
                            throw th2;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    resultSet = tables;
                    if (resultSet == null) {
                        throw th;
                    }
                    try {
                        resultSet.close();
                        throw th;
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        throw th;
                    }
                }
            }
            try {
                tables.close();
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            if (i != 0) {
                sbO.append(") order by TABLE_SCHEM, TABLE_NAME, ORDINAL_POSITION;");
            } else {
                sbO.append("select null as ordpos, null as colnullable, null as ct, null as tblname, null as cn, null as tn, null as colDefault, null as colautoincrement) limit 0;");
            }
            return ((CoreStatement) this.d.createStatement()).c(sbO.toString());
        } catch (Throwable th8) {
            th = th8;
            resultSet = null;
        }
    }

    @Override // java.sql.DatabaseMetaData
    public final Connection getConnection() {
        return this.d;
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getCrossReference(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str3 == null) {
            return getExportedKeys(str4, str5, str6);
        }
        if (str6 == null) {
            return getImportedKeys(str, str2, str3);
        }
        return ((CoreStatement) this.d.createStatement()).c("select " + CoreDatabaseMetaData.b(str) + " as PKTABLE_CAT, " + CoreDatabaseMetaData.b(str2) + " as PKTABLE_SCHEM, " + CoreDatabaseMetaData.b(str3) + " as PKTABLE_NAME, '' as PKCOLUMN_NAME, " + CoreDatabaseMetaData.b(str4) + " as FKTABLE_CAT, " + CoreDatabaseMetaData.b(str5) + " as FKTABLE_SCHEM, " + CoreDatabaseMetaData.b(str6) + " as FKTABLE_NAME, '' as FKCOLUMN_NAME, -1 as KEY_SEQ, 3 as UPDATE_RULE, 3 as DELETE_RULE, '' as FK_NAME, '' as PK_NAME, " + Integer.toString(5) + " as DEFERRABILITY limit 0 ");
    }

    @Override // java.sql.DatabaseMetaData
    public final int getDatabaseMajorVersion() {
        return Integer.valueOf(this.d.g().split("\\.")[0]).intValue();
    }

    @Override // java.sql.DatabaseMetaData
    public final int getDatabaseMinorVersion() {
        return Integer.valueOf(this.d.g().split("\\.")[1]).intValue();
    }

    @Override // java.sql.DatabaseMetaData
    public final String getDatabaseProductName() {
        return "SQLite";
    }

    @Override // java.sql.DatabaseMetaData
    public final String getDatabaseProductVersion() {
        return this.d.g();
    }

    @Override // java.sql.DatabaseMetaData
    public final int getDefaultTransactionIsolation() {
        return 8;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getDriverMajorVersion() {
        return Integer.valueOf(u.split("\\.")[0]).intValue();
    }

    @Override // java.sql.DatabaseMetaData
    public final int getDriverMinorVersion() {
        return Integer.valueOf(u.split("\\.")[1]).intValue();
    }

    @Override // java.sql.DatabaseMetaData
    public final String getDriverName() {
        return t;
    }

    @Override // java.sql.DatabaseMetaData
    public final String getDriverVersion() {
        return u;
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getExportedKeys(String str, String str2, String str3) throws SQLException {
        boolean z2;
        int i;
        JDBC3DatabaseMetaData jDBC3DatabaseMetaData = this;
        PrimaryKeyFinder primaryKeyFinder = new PrimaryKeyFinder(jDBC3DatabaseMetaData, str3);
        Statement statementCreateStatement = jDBC3DatabaseMetaData.d.createStatement();
        String str4 = null;
        String strB = str != null ? CoreDatabaseMetaData.b(str) : null;
        String strB2 = str2 != null ? CoreDatabaseMetaData.b(str2) : null;
        StringBuilder sb = new StringBuilder(512);
        boolean z3 = true;
        String[] strArr = primaryKeyFinder.b;
        if (strArr != null) {
            ResultSet resultSetExecuteQuery = statementCreateStatement.executeQuery("select name from sqlite_master where type = 'table'");
            ArrayList arrayList = new ArrayList();
            while (resultSetExecuteQuery.next()) {
                String string = resultSetExecuteQuery.getString(1);
                arrayList.add(string);
                if (string.equalsIgnoreCase(str3)) {
                    str4 = string;
                }
            }
            resultSetExecuteQuery.close();
            Iterator it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                String str5 = (String) it.next();
                try {
                    Iterator it2 = new ImportedKeyFinder(jDBC3DatabaseMetaData, str5).b.iterator();
                    while (it2.hasNext()) {
                        boolean z4 = z3;
                        ImportedKeyFinder.ForeignKey foreignKey = (ImportedKeyFinder.ForeignKey) it2.next();
                        String str6 = foreignKey.b;
                        Iterator it3 = it;
                        ArrayList arrayList2 = foreignKey.d;
                        if (str6 == null || !str6.equalsIgnoreCase(str4)) {
                            Statement statement = statementCreateStatement;
                            z3 = z4 ? 1 : 0;
                            it = it3;
                            statementCreateStatement = statement;
                        } else {
                            int i2 = 0;
                            while (i2 < arrayList2.size()) {
                                int i3 = i2 + 1;
                                ArrayList arrayList3 = arrayList2;
                                String[] strArr2 = {(String) arrayList2.get(i2), (String) foreignKey.e.get(i2)};
                                String str7 = strArr2[z4 ? 1 : 0];
                                String str8 = "";
                                if (str7 == null) {
                                    str7 = "";
                                }
                                String str9 = strArr2[0];
                                if (str9 == null) {
                                    str9 = "";
                                }
                                String str10 = str9;
                                Statement statement2 = statementCreateStatement;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= strArr.length) {
                                        break;
                                    }
                                    String str11 = strArr[i4];
                                    if (str11 == null || !str11.equalsIgnoreCase(str7)) {
                                        i4++;
                                    } else {
                                        String str12 = primaryKeyFinder.f26907a;
                                        if (str12 != null) {
                                            str8 = str12;
                                        }
                                    }
                                }
                                sb.append(i > 0 ? " union all select " : "select ");
                                sb.append(Integer.toString(i3));
                                sb.append(" as ks, '");
                                sb.append(CoreDatabaseMetaData.a(str5));
                                sb.append("' as fkt, '");
                                sb.append(CoreDatabaseMetaData.a(str10));
                                sb.append("' as fcn, '");
                                sb.append(CoreDatabaseMetaData.a(str7));
                                sb.append("' as pcn, '");
                                sb.append(CoreDatabaseMetaData.a(str8));
                                sb.append("' as pkn, ");
                                HashMap map = y;
                                sb.append(map.get(foreignKey.f));
                                sb.append(" as ur, ");
                                sb.append(map.get(foreignKey.g));
                                sb.append(" as dr, ");
                                String str13 = foreignKey.f26906a;
                                if (str13 != null) {
                                    sb.append("'");
                                    sb.append(CoreDatabaseMetaData.a(str13));
                                    sb.append("' as fkn");
                                } else {
                                    sb.append("'' as fkn");
                                }
                                i++;
                                i2 = i3;
                                arrayList2 = arrayList3;
                                statementCreateStatement = statement2;
                            }
                            z3 = z4 ? 1 : 0;
                            it = it3;
                        }
                    }
                    Iterator it4 = it;
                    Statement statement3 = statementCreateStatement;
                    boolean z5 = z3;
                    try {
                        resultSetExecuteQuery.close();
                    } catch (SQLException unused) {
                    }
                    jDBC3DatabaseMetaData = this;
                    z3 = z5;
                    it = it4;
                    statementCreateStatement = statement3;
                } catch (Throwable th) {
                    try {
                        resultSetExecuteQuery.close();
                    } catch (SQLException unused2) {
                    }
                    throw th;
                }
            }
            z2 = false;
        } else {
            z2 = false;
            i = 0;
        }
        Object obj = statementCreateStatement;
        boolean z6 = i > 0 ? z3 : z2;
        StringBuilder sb2 = new StringBuilder(512);
        sb2.append("select ");
        sb2.append(strB);
        sb2.append(" as PKTABLE_CAT, ");
        sb2.append(strB2);
        sb2.append(" as PKTABLE_SCHEM, ");
        sb2.append(CoreDatabaseMetaData.b(str4));
        sb2.append(" as PKTABLE_NAME, ");
        androidx.constraintlayout.core.state.a.B(sb2, z6 ? "pcn" : "''", " as PKCOLUMN_NAME, ", strB, " as FKTABLE_CAT, ");
        sb2.append(strB2);
        sb2.append(" as FKTABLE_SCHEM, ");
        sb2.append(z6 ? "fkt" : "''");
        sb2.append(" as FKTABLE_NAME, ");
        sb2.append(z6 ? "fcn" : "''");
        sb2.append(" as FKCOLUMN_NAME, ");
        sb2.append(z6 ? "ks" : "-1");
        sb2.append(" as KEY_SEQ, ");
        sb2.append(z6 ? "ur" : "3");
        sb2.append(" as UPDATE_RULE, ");
        sb2.append(z6 ? "dr" : "3");
        sb2.append(" as DELETE_RULE, ");
        sb2.append(z6 ? "fkn" : "''");
        sb2.append(" as FK_NAME, ");
        sb2.append(z6 ? "pkn" : "''");
        sb2.append(" as PK_NAME, ");
        sb2.append(Integer.toString(5));
        sb2.append(" as DEFERRABILITY ");
        if (z6) {
            sb2.append("from (");
            sb2.append((CharSequence) sb);
            sb2.append(") ORDER BY FKTABLE_CAT, FKTABLE_SCHEM, FKTABLE_NAME, KEY_SEQ");
        } else {
            sb2.append("limit 0");
        }
        return ((CoreStatement) obj).c(sb2.toString());
    }

    @Override // java.sql.DatabaseMetaData
    public final String getExtraNameCharacters() {
        return "";
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getFunctionColumns(String str, String str2, String str3, String str4) throws SQLException {
        throw new SQLException("Not yet implemented by SQLite JDBC driver");
    }

    @Override // java.sql.DatabaseMetaData
    public final String getIdentifierQuoteString() {
        return "\"";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.sql.DatabaseMetaData
    public final ResultSet getImportedKeys(String str, String str2, String str3) throws SQLException {
        JDBC3DatabaseMetaData jDBC3DatabaseMetaData = this;
        Statement statementCreateStatement = jDBC3DatabaseMetaData.d.createStatement();
        StringBuilder sbO = androidx.constraintlayout.core.state.a.o(700, "select ");
        sbO.append(CoreDatabaseMetaData.b(str));
        sbO.append(" as PKTABLE_CAT, ");
        sbO.append(CoreDatabaseMetaData.b(str2));
        sbO.append(" as PKTABLE_SCHEM, ptn as PKTABLE_NAME, pcn as PKCOLUMN_NAME, ");
        sbO.append(CoreDatabaseMetaData.b(str));
        sbO.append(" as FKTABLE_CAT, ");
        sbO.append(CoreDatabaseMetaData.b(str2));
        sbO.append(" as FKTABLE_SCHEM, ");
        sbO.append(CoreDatabaseMetaData.b(str3));
        sbO.append(" as FKTABLE_NAME, fcn as FKCOLUMN_NAME, ks as KEY_SEQ, ur as UPDATE_RULE, dr as DELETE_RULE, fkn as FK_NAME, pkn as PK_NAME, ");
        int i = 5;
        sbO.append(Integer.toString(5));
        sbO.append(" as DEFERRABILITY from (");
        try {
            ResultSet resultSetExecuteQuery = statementCreateStatement.executeQuery("pragma foreign_key_list('" + CoreDatabaseMetaData.a(str3) + "');");
            ImportedKeyFinder importedKeyFinder = new ImportedKeyFinder(jDBC3DatabaseMetaData, str3);
            char c = 0;
            int i2 = 0;
            while (resultSetExecuteQuery.next()) {
                int i3 = resultSetExecuteQuery.getInt(2) + 1;
                int i4 = resultSetExecuteQuery.getInt(1);
                String string = resultSetExecuteQuery.getString(3);
                String string2 = resultSetExecuteQuery.getString(4);
                String string3 = resultSetExecuteQuery.getString(i);
                PrimaryKeyFinder primaryKeyFinder = new PrimaryKeyFinder(jDBC3DatabaseMetaData, string);
                if (string3 == null) {
                    string3 = primaryKeyFinder.b[c];
                }
                String string4 = resultSetExecuteQuery.getString(6);
                String string5 = resultSetExecuteQuery.getString(7);
                if (i2 > 0) {
                    sbO.append(" union all ");
                }
                ArrayList arrayList = importedKeyFinder.b;
                String str4 = arrayList.size() > i4 ? ((ImportedKeyFinder.ForeignKey) arrayList.get(i4)).f26906a : null;
                sbO.append("select ");
                sbO.append(i3);
                sbO.append(" as ks,'");
                sbO.append(CoreDatabaseMetaData.a(string));
                sbO.append("' as ptn, '");
                sbO.append(CoreDatabaseMetaData.a(string2));
                sbO.append("' as fcn, '");
                sbO.append(CoreDatabaseMetaData.a(string3));
                sbO.append("' as pcn,case '");
                sbO.append(CoreDatabaseMetaData.a(string4));
                sbO.append("' when 'NO ACTION' then 3 when 'CASCADE' then 0 when 'RESTRICT' then 1 when 'SET NULL' then 2 when 'SET DEFAULT' then 4 end as ur, case '");
                sbO.append(CoreDatabaseMetaData.a(string5));
                sbO.append("' when 'NO ACTION' then 3 when 'CASCADE' then 0 when 'RESTRICT' then 1 when 'SET NULL' then 2 when 'SET DEFAULT' then 4 end as dr, ");
                String strB = "''";
                sbO.append(str4 == null ? "''" : CoreDatabaseMetaData.b(str4));
                sbO.append(" as fkn, ");
                String str5 = primaryKeyFinder.f26907a;
                if (str5 != null) {
                    strB = CoreDatabaseMetaData.b(str5);
                }
                sbO.append(strB);
                sbO.append(" as pkn");
                i2++;
                i = 5;
                jDBC3DatabaseMetaData = this;
                c = 0;
            }
            resultSetExecuteQuery.close();
            if (i2 == 0) {
                c(sbO);
            }
            sbO.append(") ORDER BY PKTABLE_CAT, PKTABLE_SCHEM, PKTABLE_NAME, KEY_SEQ;");
            return ((CoreStatement) statementCreateStatement).c(sbO.toString());
        } catch (SQLException unused) {
            c(sbO);
            return ((CoreStatement) statementCreateStatement).c(sbO.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.sql.DatabaseMetaData
    public final ResultSet getIndexInfo(String str, String str2, String str3, boolean z2, boolean z3) throws SQLException {
        Statement statementCreateStatement = this.d.createStatement();
        StringBuilder sbO = androidx.constraintlayout.core.state.a.o(500, "select null as TABLE_CAT, null as TABLE_SCHEM, '");
        sbO.append(CoreDatabaseMetaData.a(str3));
        sbO.append("' as TABLE_NAME, un as NON_UNIQUE, null as INDEX_QUALIFIER, n as INDEX_NAME, ");
        sbO.append(Integer.toString(3));
        sbO.append(" as TYPE, op as ORDINAL_POSITION, cn as COLUMN_NAME, null as ASC_OR_DESC, 0 as CARDINALITY, 0 as PAGES, null as FILTER_CONDITION from (");
        ResultSet resultSetExecuteQuery = statementCreateStatement.executeQuery("pragma index_list('" + CoreDatabaseMetaData.a(str3) + "');");
        ArrayList arrayList = new ArrayList();
        while (resultSetExecuteQuery.next()) {
            arrayList.add(new ArrayList());
            ((ArrayList) arrayList.get(arrayList.size() - 1)).add(resultSetExecuteQuery.getString(2));
            ((ArrayList) arrayList.get(arrayList.size() - 1)).add(Integer.valueOf(resultSetExecuteQuery.getInt(3)));
        }
        resultSetExecuteQuery.close();
        if (arrayList.size() == 0) {
            sbO.append("select null as un, null as n, null as op, null as cn) limit 0;");
            return ((CoreStatement) statementCreateStatement).c(sbO.toString());
        }
        Iterator it = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList();
        while (it.hasNext()) {
            ArrayList arrayList3 = (ArrayList) it.next();
            String string = arrayList3.get(0).toString();
            ResultSet resultSetExecuteQuery2 = statementCreateStatement.executeQuery("pragma index_info('" + CoreDatabaseMetaData.a(string) + "');");
            while (resultSetExecuteQuery2.next()) {
                StringBuilder sb = new StringBuilder("select ");
                String string2 = resultSetExecuteQuery2.getString(3);
                sb.append(Integer.toString(1 - ((Integer) arrayList3.get(1)).intValue()));
                sb.append(" as un,'");
                sb.append(CoreDatabaseMetaData.a(string));
                sb.append("' as n,");
                sb.append(Integer.toString(resultSetExecuteQuery2.getInt(1) + 1));
                sb.append(" as op,");
                if (string2 == null) {
                    sb.append("null");
                } else {
                    sb.append("'");
                    sb.append(CoreDatabaseMetaData.a(string2));
                    sb.append("'");
                }
                sb.append(" as cn");
                arrayList2.add(sb.toString());
            }
            resultSetExecuteQuery2.close();
        }
        sbO.append(StringUtils.a(arrayList2, " union all "));
        sbO.append(");");
        return ((CoreStatement) statementCreateStatement).c(sbO.toString());
    }

    @Override // java.sql.DatabaseMetaData
    public final int getJDBCMajorVersion() {
        return 2;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getJDBCMinorVersion() {
        return 1;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxBinaryLiteralLength() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxCatalogNameLength() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxCharLiteralLength() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxColumnNameLength() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxColumnsInGroupBy() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxColumnsInIndex() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxColumnsInOrderBy() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxColumnsInSelect() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxColumnsInTable() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxConnections() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxCursorNameLength() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxIndexLength() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxProcedureNameLength() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxRowSize() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxSchemaNameLength() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxStatementLength() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxStatements() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxTableNameLength() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxTablesInSelect() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final int getMaxUserNameLength() {
        return 0;
    }

    @Override // java.sql.DatabaseMetaData
    public final String getNumericFunctions() {
        return "";
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getPrimaryKeys(String str, String str2, String str3) throws SQLException {
        PrimaryKeyFinder primaryKeyFinder = new PrimaryKeyFinder(this, str3);
        Object objCreateStatement = this.d.createStatement();
        StringBuilder sbO = androidx.constraintlayout.core.state.a.o(512, "select null as TABLE_CAT, null as TABLE_SCHEM, '");
        sbO.append(CoreDatabaseMetaData.a(str3));
        sbO.append("' as TABLE_NAME, cn as COLUMN_NAME, ks as KEY_SEQ, pk as PK_NAME from (");
        String[] strArr = primaryKeyFinder.b;
        if (strArr == null) {
            sbO.append("select null as cn, null as pk, 0 as ks) limit 0;");
            return ((CoreStatement) objCreateStatement).c(sbO.toString());
        }
        String strH = primaryKeyFinder.f26907a;
        if (strH != null) {
            strH = YU.a.h("'", strH, "'");
        }
        int i = 0;
        while (i < strArr.length) {
            if (i > 0) {
                sbO.append(" union ");
            }
            androidx.compose.ui.input.pointer.a.w(sbO, "select ", strH, " as pk, '");
            sbO.append(CoreDatabaseMetaData.a(d(strArr[i])));
            sbO.append("' as cn, ");
            i++;
            sbO.append(i);
            sbO.append(" as ks");
        }
        sbO.append(") order by cn;");
        return ((CoreStatement) objCreateStatement).c(sbO.toString());
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getProcedureColumns(String str, String str2, String str3, String str4) {
        if (this.n == null) {
            this.n = this.d.prepareStatement("select null as PROCEDURE_CAT, null as PROCEDURE_SCHEM, null as PROCEDURE_NAME, null as COLUMN_NAME, null as COLUMN_TYPE, null as DATA_TYPE, null as TYPE_NAME, null as PRECISION, null as LENGTH, null as SCALE, null as RADIX, null as NULLABLE, null as REMARKS limit 0;");
        }
        return this.n.executeQuery();
    }

    @Override // java.sql.DatabaseMetaData
    public final String getProcedureTerm() {
        return "not_implemented";
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getProcedures(String str, String str2, String str3) {
        if (this.m == null) {
            this.m = this.d.prepareStatement("select null as PROCEDURE_CAT, null as PROCEDURE_SCHEM, null as PROCEDURE_NAME, null as UNDEF1, null as UNDEF2, null as UNDEF3, null as REMARKS, null as PROCEDURE_TYPE limit 0;");
        }
        return this.m.executeQuery();
    }

    @Override // java.sql.DatabaseMetaData
    public final int getResultSetHoldability() {
        return 2;
    }

    @Override // java.sql.DatabaseMetaData
    public final String getSQLKeywords() {
        return "ABORT,ACTION,AFTER,ANALYZE,ATTACH,AUTOINCREMENT,BEFORE,CASCADE,CONFLICT,DATABASE,DEFERRABLE,DEFERRED,DESC,DETACH,EXCLUSIVE,EXPLAIN,FAIL,GLOB,IGNORE,INDEX,INDEXED,INITIALLY,INSTEAD,ISNULL,KEY,LIMIT,NOTNULL,OFFSET,PLAN,PRAGMA,QUERY,RAISE,REGEXP,REINDEX,RENAME,REPLACE,RESTRICT,TEMP,TEMPORARY,TRANSACTION,VACUUM,VIEW,VIRTUAL";
    }

    @Override // java.sql.DatabaseMetaData
    public final int getSQLStateType() {
        return 2;
    }

    @Override // java.sql.DatabaseMetaData
    public final String getSchemaTerm() {
        return "schema";
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getSchemas() {
        if (this.h == null) {
            this.h = this.d.prepareStatement("select null as TABLE_SCHEM, null as TABLE_CATALOG limit 0;");
        }
        return this.h.executeQuery();
    }

    @Override // java.sql.DatabaseMetaData
    public final String getSearchStringEscape() {
        return null;
    }

    @Override // java.sql.DatabaseMetaData
    public final String getStringFunctions() {
        return "";
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getSuperTables(String str, String str2, String str3) {
        if (this.k == null) {
            this.k = this.d.prepareStatement("select null as TABLE_CAT, null as TABLE_SCHEM, null as TABLE_NAME, null as SUPERTABLE_NAME limit 0;");
        }
        return this.k.executeQuery();
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getSuperTypes(String str, String str2, String str3) {
        if (this.j == null) {
            this.j = this.d.prepareStatement("select null as TYPE_CAT, null as TYPE_SCHEM, null as TYPE_NAME, null as SUPERTYPE_CAT, null as SUPERTYPE_SCHEM, null as SUPERTYPE_NAME limit 0;");
        }
        return this.j.executeQuery();
    }

    @Override // java.sql.DatabaseMetaData
    public final String getSystemFunctions() {
        return "";
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getTablePrivileges(String str, String str2, String str3) {
        if (this.l == null) {
            this.l = this.d.prepareStatement("select  null as TABLE_CAT, null as TABLE_SCHEM, null as TABLE_NAME, null as GRANTOR, null GRANTEE,  null as PRIVILEGE, null as IS_GRANTABLE limit 0;");
        }
        return this.l.executeQuery();
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getTableTypes() throws SQLException {
        SQLiteConnection sQLiteConnection = this.d;
        if (sQLiteConnection == null) {
            throw new SQLException("connection closed");
        }
        if (this.e == null) {
            this.e = sQLiteConnection.prepareStatement("SELECT 'TABLE' AS TABLE_TYPE UNION SELECT 'VIEW' AS TABLE_TYPE UNION SELECT 'SYSTEM TABLE' AS TABLE_TYPE UNION SELECT 'GLOBAL TEMPORARY' AS TABLE_TYPE;");
        }
        this.e.clearParameters();
        return this.e.executeQuery();
    }

    @Override // java.sql.DatabaseMetaData
    public final synchronized ResultSet getTables(String str, String str2, String str3, String[] strArr) {
        StringBuilder sb;
        try {
            if (this.d == null) {
                throw new SQLException("connection closed");
            }
            String strA = (str3 == null || "".equals(str3)) ? "%" : CoreDatabaseMetaData.a(str3);
            sb = new StringBuilder();
            sb.append("SELECT");
            sb.append("\n");
            sb.append("  NULL AS TABLE_CAT,");
            sb.append("\n");
            sb.append("  NULL AS TABLE_SCHEM,");
            sb.append("\n");
            sb.append("  NAME AS TABLE_NAME,");
            sb.append("\n");
            sb.append("  TYPE AS TABLE_TYPE,");
            sb.append("\n");
            sb.append("  NULL AS REMARKS,");
            sb.append("\n");
            sb.append("  NULL AS TYPE_CAT,");
            sb.append("\n");
            sb.append("  NULL AS TYPE_SCHEM,");
            sb.append("\n");
            sb.append("  NULL AS TYPE_NAME,");
            sb.append("\n");
            sb.append("  NULL AS SELF_REFERENCING_COL_NAME,");
            sb.append("\n");
            sb.append("  NULL AS REF_GENERATION");
            sb.append("\n");
            sb.append("FROM");
            sb.append("\n");
            sb.append("  (");
            sb.append("\n");
            sb.append("    SELECT");
            sb.append("\n");
            sb.append("      NAME,");
            sb.append("\n");
            sb.append("      UPPER(TYPE) AS TYPE");
            sb.append("\n");
            sb.append("    FROM");
            sb.append("\n");
            sb.append("      sqlite_master");
            sb.append("\n");
            sb.append("    WHERE");
            sb.append("\n");
            sb.append("      NAME NOT LIKE 'sqlite\\_%' ESCAPE '\\'");
            sb.append("\n");
            sb.append("      AND UPPER(TYPE) IN ('TABLE', 'VIEW')");
            sb.append("\n");
            sb.append("    UNION ALL");
            sb.append("\n");
            sb.append("    SELECT");
            sb.append("\n");
            sb.append("      NAME,");
            sb.append("\n");
            sb.append("      'GLOBAL TEMPORARY' AS TYPE");
            sb.append("\n");
            sb.append("    FROM");
            sb.append("\n");
            sb.append("      sqlite_temp_master");
            sb.append("\n");
            sb.append("    UNION ALL");
            sb.append("\n");
            sb.append("    SELECT");
            sb.append("\n");
            sb.append("      NAME,");
            sb.append("\n");
            sb.append("      'SYSTEM TABLE' AS TYPE");
            sb.append("\n");
            sb.append("    FROM");
            sb.append("\n");
            sb.append("      sqlite_master");
            sb.append("\n");
            sb.append("    WHERE");
            sb.append("\n");
            sb.append("      NAME LIKE 'sqlite\\_%' ESCAPE '\\'");
            sb.append("\n");
            sb.append("  )");
            sb.append("\n");
            sb.append(" WHERE TABLE_NAME LIKE '");
            sb.append(strA);
            sb.append("' AND TABLE_TYPE IN (");
            if (strArr == null || strArr.length == 0) {
                sb.append("'TABLE','VIEW'");
            } else {
                sb.append("'");
                sb.append(strArr[0].toUpperCase());
                sb.append("'");
                for (int i = 1; i < strArr.length; i++) {
                    sb.append(",'");
                    sb.append(strArr[i].toUpperCase());
                    sb.append("'");
                }
            }
            sb.append(") ORDER BY TABLE_TYPE, TABLE_NAME;");
        } catch (Throwable th) {
            throw th;
        }
        return ((CoreStatement) this.d.createStatement()).c(sb.toString());
    }

    @Override // java.sql.DatabaseMetaData
    public final String getTimeDateFunctions() {
        return "DATE,TIME,DATETIME,JULIANDAY,STRFTIME";
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getTypeInfo() throws SQLException {
        if (this.f == null) {
            this.f = this.d.prepareStatement("select tn as TYPE_NAME, dt as DATA_TYPE, 0 as PRECISION, null as LITERAL_PREFIX, null as LITERAL_SUFFIX, null as CREATE_PARAMS, 1 as NULLABLE, 1 as CASE_SENSITIVE, 3 as SEARCHABLE, 0 as UNSIGNED_ATTRIBUTE, 0 as FIXED_PREC_SCALE, 0 as AUTO_INCREMENT, null as LOCAL_TYPE_NAME, 0 as MINIMUM_SCALE, 0 as MAXIMUM_SCALE, 0 as SQL_DATA_TYPE, 0 as SQL_DATETIME_SUB, 10 as NUM_PREC_RADIX from (    select 'BLOB' as tn, 2004 as dt union    select 'NULL' as tn, 0 as dt union    select 'REAL' as tn, 7 as dt union    select 'TEXT' as tn, 12 as dt union    select 'INTEGER' as tn, 4 as dt) order by TYPE_NAME;");
        }
        this.f.clearParameters();
        return this.f.executeQuery();
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getUDTs(String str, String str2, String str3, int[] iArr) throws SQLException {
        if (this.i == null) {
            this.i = this.d.prepareStatement("select  null as TYPE_CAT, null as TYPE_SCHEM, null as TYPE_NAME,  null as CLASS_NAME,  null as DATA_TYPE, null as REMARKS, null as BASE_TYPE limit 0;");
        }
        this.i.clearParameters();
        return this.i.executeQuery();
    }

    @Override // java.sql.DatabaseMetaData
    public final String getURL() {
        return this.d.d.d;
    }

    @Override // java.sql.DatabaseMetaData
    public final String getUserName() {
        return null;
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getVersionColumns(String str, String str2, String str3) {
        if (this.q == null) {
            this.q = this.d.prepareStatement("select null as SCOPE, null as COLUMN_NAME, null as DATA_TYPE, null as TYPE_NAME, null as COLUMN_SIZE, null as BUFFER_LENGTH, null as DECIMAL_DIGITS, null as PSEUDO_COLUMN limit 0;");
        }
        return this.q.executeQuery();
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean insertsAreDetected(int i) {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean isCatalogAtStart() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean isReadOnly() {
        return this.d.isReadOnly();
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean locatorsUpdateCopy() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean nullPlusNonNullIsNull() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean nullsAreSortedAtEnd() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean nullsAreSortedAtStart() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean nullsAreSortedHigh() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean nullsAreSortedLow() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean othersDeletesAreVisible(int i) {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean othersInsertsAreVisible(int i) {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean othersUpdatesAreVisible(int i) {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean ownDeletesAreVisible(int i) {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean ownInsertsAreVisible(int i) {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean ownUpdatesAreVisible(int i) {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean storesLowerCaseIdentifiers() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean storesLowerCaseQuotedIdentifiers() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean storesMixedCaseIdentifiers() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean storesMixedCaseQuotedIdentifiers() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean storesUpperCaseIdentifiers() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean storesUpperCaseQuotedIdentifiers() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsANSI92EntryLevelSQL() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsANSI92FullSQL() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsANSI92IntermediateSQL() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsAlterTableWithAddColumn() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsAlterTableWithDropColumn() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsBatchUpdates() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsCatalogsInDataManipulation() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsCatalogsInIndexDefinitions() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsCatalogsInPrivilegeDefinitions() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsCatalogsInProcedureCalls() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsCatalogsInTableDefinitions() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsColumnAliasing() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsConvert() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsCoreSQLGrammar() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsCorrelatedSubqueries() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsDataDefinitionAndDataManipulationTransactions() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsDataManipulationTransactionsOnly() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsDifferentTableCorrelationNames() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsExpressionsInOrderBy() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsExtendedSQLGrammar() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsFullOuterJoins() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsGetGeneratedKeys() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsGroupBy() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsGroupByBeyondSelect() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsGroupByUnrelated() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsIntegrityEnhancementFacility() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsLikeEscapeClause() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsLimitedOuterJoins() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsMinimumSQLGrammar() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsMixedCaseIdentifiers() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsMixedCaseQuotedIdentifiers() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsMultipleOpenResults() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsMultipleResultSets() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsMultipleTransactions() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsNamedParameters() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsNonNullableColumns() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsOpenCursorsAcrossCommit() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsOpenCursorsAcrossRollback() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsOpenStatementsAcrossCommit() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsOpenStatementsAcrossRollback() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsOrderByUnrelated() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsOuterJoins() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsPositionedDelete() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsPositionedUpdate() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsResultSetConcurrency(int i, int i2) {
        return i == 1003 && i2 == 1007;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsResultSetHoldability(int i) {
        return i == 2;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsResultSetType(int i) {
        return i == 1003;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsSavepoints() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsSchemasInDataManipulation() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsSchemasInIndexDefinitions() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsSchemasInPrivilegeDefinitions() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsSchemasInProcedureCalls() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsSchemasInTableDefinitions() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsSelectForUpdate() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsStatementPooling() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsStoredProcedures() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsSubqueriesInComparisons() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsSubqueriesInExists() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsSubqueriesInIns() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsSubqueriesInQuantifieds() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsTableCorrelationNames() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsTransactionIsolationLevel(int i) {
        return i == 8;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsTransactions() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsUnion() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsUnionAll() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean updatesAreDetected(int i) {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean usesLocalFilePerTable() {
        return false;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean usesLocalFiles() {
        return true;
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsConvert(int i, int i2) {
        return false;
    }
}
