package com.adobe.mobile;

import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import java.io.File;

/* loaded from: classes4.dex */
final class AnalyticsTrackTimedAction extends AbstractDatabaseBacking {
    public static AnalyticsTrackTimedAction i;
    public static final Object j = new Object();
    public SQLiteStatement g;
    public SQLiteStatement h;

    /* renamed from: com.adobe.mobile.AnalyticsTrackTimedAction$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static AnalyticsTrackTimedAction h() {
        AnalyticsTrackTimedAction analyticsTrackTimedAction;
        synchronized (j) {
            try {
                if (i == null) {
                    AnalyticsTrackTimedAction analyticsTrackTimedAction2 = new AnalyticsTrackTimedAction();
                    analyticsTrackTimedAction2.e = "ADBMobileTimedActionsCache.sqlite";
                    analyticsTrackTimedAction2.f = "Analytics";
                    analyticsTrackTimedAction2.a(new File(StaticMethods.o(), analyticsTrackTimedAction2.e));
                    i = analyticsTrackTimedAction2;
                }
                analyticsTrackTimedAction = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return analyticsTrackTimedAction;
    }

    @Override // com.adobe.mobile.AbstractDatabaseBacking
    public final void b() throws SQLException {
        try {
            this.f13258a.execSQL("CREATE TABLE IF NOT EXISTS TIMEDACTIONS (ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, STARTTIME INTEGER, ADJSTARTTIME INTEGER)");
            this.f13258a.execSQL("CREATE TABLE IF NOT EXISTS CONTEXTDATA (ID INTEGER PRIMARY KEY AUTOINCREMENT, ACTIONID INTEGER, KEY TEXT, VALUE TEXT, FOREIGN KEY(ACTIONID) REFERENCES TIMEDACTIONS(ID))");
        } catch (SQLException e) {
            StaticMethods.J("%s - Unable to open or create timed actions database (%s)", this.f, e.getMessage());
        } catch (Exception e2) {
            StaticMethods.J("%s - Uknown error creating timed actions database (%s)", this.f, e2.getMessage());
        }
    }

    @Override // com.adobe.mobile.AbstractDatabaseBacking
    public final void d() {
    }

    @Override // com.adobe.mobile.AbstractDatabaseBacking
    public final void e() {
        File file = new File(StaticMethods.o() + "ADBMobileDataCache.sqlite" + this.e);
        File file2 = new File(StaticMethods.o(), this.e);
        if (!file.exists() || file2.exists()) {
            return;
        }
        try {
            if (file.renameTo(file2)) {
                return;
            }
            StaticMethods.K("%s - Unable to migrate old Timed Actions db, creating new Timed Actions db (move file returned false)", this.f);
        } catch (Exception e) {
            StaticMethods.K("%s - Unable to migrate old Timed Actions db, creating new Timed Actions db (%s)", this.f, e.getLocalizedMessage());
        }
    }

    @Override // com.adobe.mobile.AbstractDatabaseBacking
    public final void f() throws SQLException {
        try {
            this.f13258a.compileStatement("INSERT INTO TIMEDACTIONS (NAME, STARTTIME, ADJSTARTTIME) VALUES (@NAME, @START, @START)");
            this.g = this.f13258a.compileStatement("UPDATE TIMEDACTIONS SET ADJSTARTTIME=ADJSTARTTIME+@DELTA WHERE ADJSTARTTIME!=-1");
            this.h = this.f13258a.compileStatement("UPDATE TIMEDACTIONS SET ADJSTARTTIME=-1");
            this.f13258a.compileStatement("DELETE FROM TIMEDACTIONS WHERE ID=@ID");
            this.f13258a.compileStatement("INSERT INTO CONTEXTDATA(ACTIONID, KEY, VALUE) VALUES (@ACTIONID, @KEY, @VALUE)");
            this.f13258a.compileStatement("UPDATE CONTEXTDATA SET VALUE=@VALUE WHERE ACTIONID=@ACTIONID AND KEY=@KEY");
            this.f13258a.compileStatement("DELETE FROM CONTEXTDATA WHERE ACTIONID=@ACTIONID");
        } catch (SQLException e) {
            StaticMethods.J("Analytics - unable to prepare the needed SQL statements for interacting with the timed actions database (%s)", e.getMessage());
        } catch (Exception e2) {
            StaticMethods.J("Analytics - Unknown error preparing sql statements (%s)", e2.getMessage());
        }
    }

    public final void i() {
        synchronized (this.d) {
            try {
                this.h.execute();
                this.h.clearBindings();
            } catch (SQLException e) {
                StaticMethods.J("%s - Unable to update adjusted time for timed actions after crash (%s)", this.f, e.getMessage());
                g(e);
            } catch (Exception e2) {
                StaticMethods.J("%s - Unknown error clearing adjusted start times for timed actions (%s)", this.f, e2.getMessage());
                g(e2);
            }
        }
    }

    public final void j(long j2) {
        synchronized (this.d) {
            try {
                try {
                    this.g.bindLong(1, j2);
                    this.g.execute();
                    this.g.clearBindings();
                } catch (Exception e) {
                    StaticMethods.J("%s - Unable to adjust start times for timed actions (%s)", this.f, e.getMessage());
                }
            } catch (SQLException e2) {
                StaticMethods.J("%s - Unable to bind prepared statement values for updating the adjusted start time for timed action (%s)", this.f, e2.getLocalizedMessage());
                g(e2);
            }
        }
    }
}
