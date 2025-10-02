package org.sqlite;

import androidx.compose.ui.input.pointer.a;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.sqlite.core.DB;

/* loaded from: classes8.dex */
public class ExtendedCommand {

    public static class BackupCommand implements SQLExtension {
        public static final Pattern c = Pattern.compile("backup(\\s+(\"[^\"]*\"|'[^']*'|\\S+))?\\s+to\\s+(\"[^\"]*\"|'[^']*'|\\S+)", 2);

        /* renamed from: a, reason: collision with root package name */
        public final String f26875a;
        public final String b;

        public BackupCommand(String str, String str2) {
            this.f26875a = str;
            this.b = str2;
        }

        @Override // org.sqlite.ExtendedCommand.SQLExtension
        public final void a(DB db) {
            db.a(this.f26875a, this.b);
        }
    }

    public static class RestoreCommand implements SQLExtension {
        public static final Pattern c = Pattern.compile("restore(\\s+(\"[^\"]*\"|'[^']*'|\\S+))?\\s+from\\s+(\"[^\"]*\"|'[^']*'|\\S+)", 2);

        /* renamed from: a, reason: collision with root package name */
        public final String f26876a;
        public final String b;

        public RestoreCommand(String str, String str2) {
            this.f26876a = str;
            this.b = str2;
        }

        @Override // org.sqlite.ExtendedCommand.SQLExtension
        public final void a(DB db) {
            db.r(this.f26876a, this.b);
        }
    }

    public interface SQLExtension {
        void a(DB db);
    }

    public static SQLExtension a(String str) {
        if (str == null) {
            return null;
        }
        String str2 = "main";
        if (str.length() > 5 && str.substring(0, 6).toLowerCase().equals("backup")) {
            Matcher matcher = BackupCommand.c.matcher(str);
            if (!matcher.matches()) {
                throw new SQLException("syntax error: ".concat(str));
            }
            String strB = b(matcher.group(2));
            String strB2 = b(matcher.group(3));
            if (strB != null && strB.length() != 0) {
                str2 = strB;
            }
            return new BackupCommand(str2, strB2);
        }
        if (str.length() <= 6 || !str.substring(0, 7).toLowerCase().equals("restore")) {
            return null;
        }
        Matcher matcher2 = RestoreCommand.c.matcher(str);
        if (!matcher2.matches()) {
            throw new SQLException("syntax error: ".concat(str));
        }
        String strB3 = b(matcher2.group(2));
        String strB4 = b(matcher2.group(3));
        if (strB3 != null && strB3.length() != 0) {
            str2 = strB3;
        }
        return new RestoreCommand(str2, strB4);
    }

    public static String b(String str) {
        return str == null ? str : ((str.startsWith("\"") && str.endsWith("\"")) || (str.startsWith("'") && str.endsWith("'"))) ? a.h(1, 1, str) : str;
    }
}
