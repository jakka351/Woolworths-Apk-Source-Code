package org.sqlite.core;

import YU.a;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.util.regex.Pattern;
import org.sqlite.SQLiteConnection;

/* loaded from: classes8.dex */
public abstract class CoreDatabaseMetaData implements DatabaseMetaData {
    public SQLiteConnection d;
    public PreparedStatement e;
    public PreparedStatement f;
    public PreparedStatement g;
    public PreparedStatement h;
    public PreparedStatement i;
    public PreparedStatement j;
    public PreparedStatement k;
    public PreparedStatement l;
    public PreparedStatement m;
    public PreparedStatement n;
    public PreparedStatement o;
    public PreparedStatement p;
    public PreparedStatement q;
    public PreparedStatement r;
    public PreparedStatement s;

    static {
        Pattern.compile(".*\\sPRIMARY\\s+KEY\\s+\\((.*?,+.*?)\\).*", 34);
        Pattern.compile(".*\\sCONSTRAINT\\s+(.*?)\\s+PRIMARY\\s+KEY\\s+\\((.*?)\\).*", 34);
    }

    public static String a(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == '\'') {
                sb.append('\'');
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String b(String str) {
        return str == null ? "null" : a.h("'", str, "'");
    }

    public final synchronized void close() {
        if (this.d == null) {
            return;
        }
        try {
            PreparedStatement preparedStatement = this.e;
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            PreparedStatement preparedStatement2 = this.f;
            if (preparedStatement2 != null) {
                preparedStatement2.close();
            }
            PreparedStatement preparedStatement3 = this.g;
            if (preparedStatement3 != null) {
                preparedStatement3.close();
            }
            PreparedStatement preparedStatement4 = this.h;
            if (preparedStatement4 != null) {
                preparedStatement4.close();
            }
            PreparedStatement preparedStatement5 = this.i;
            if (preparedStatement5 != null) {
                preparedStatement5.close();
            }
            PreparedStatement preparedStatement6 = this.j;
            if (preparedStatement6 != null) {
                preparedStatement6.close();
            }
            PreparedStatement preparedStatement7 = this.k;
            if (preparedStatement7 != null) {
                preparedStatement7.close();
            }
            PreparedStatement preparedStatement8 = this.l;
            if (preparedStatement8 != null) {
                preparedStatement8.close();
            }
            PreparedStatement preparedStatement9 = this.m;
            if (preparedStatement9 != null) {
                preparedStatement9.close();
            }
            PreparedStatement preparedStatement10 = this.n;
            if (preparedStatement10 != null) {
                preparedStatement10.close();
            }
            PreparedStatement preparedStatement11 = this.o;
            if (preparedStatement11 != null) {
                preparedStatement11.close();
            }
            PreparedStatement preparedStatement12 = this.p;
            if (preparedStatement12 != null) {
                preparedStatement12.close();
            }
            PreparedStatement preparedStatement13 = this.q;
            if (preparedStatement13 != null) {
                preparedStatement13.close();
            }
            PreparedStatement preparedStatement14 = this.r;
            if (preparedStatement14 != null) {
                preparedStatement14.close();
            }
            PreparedStatement preparedStatement15 = this.s;
            if (preparedStatement15 != null) {
                preparedStatement15.close();
            }
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = null;
            this.r = null;
            this.s = null;
            this.d = null;
        } catch (Throwable th) {
            this.d = null;
            throw th;
        }
    }

    public void finalize() {
        close();
    }
}
