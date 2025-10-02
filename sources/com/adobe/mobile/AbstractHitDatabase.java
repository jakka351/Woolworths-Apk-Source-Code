package com.adobe.mobile;

import android.database.DatabaseUtils;
import android.database.SQLException;
import com.adobe.mobile.AbstractDatabaseBacking;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
abstract class AbstractHitDatabase extends AbstractDatabaseBacking {
    public long g;
    public long h;
    public String i;
    public boolean j = false;
    public final Object k = new Object();
    public final Object l = new Object();
    public Timer m;
    public ReferrerTimeoutTask n;

    public static class Hit {

        /* renamed from: a, reason: collision with root package name */
        public String f13259a;
        public String b;
        public long c;
        public String d;
        public String e;
        public int f;
    }

    public class ReferrerTimeoutTask extends TimerTask {
        public final boolean d;

        public ReferrerTimeoutTask(boolean z) {
            this.d = z;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ReferrerHandler.f13278a = true;
            AbstractHitDatabase abstractHitDatabase = AbstractHitDatabase.this;
            StaticMethods.I("%s - Referrer timeout has expired without referrer data", abstractHitDatabase.f);
            abstractHitDatabase.k(this.d);
        }
    }

    @Override // com.adobe.mobile.AbstractDatabaseBacking
    public final void b() throws SQLException {
        try {
            this.f13258a.execSQL(this.i);
        } catch (SQLException e) {
            StaticMethods.J("%s - Unable to create database due to a sql error (%s)", this.f, e.getLocalizedMessage());
        } catch (NullPointerException e2) {
            StaticMethods.J("%s - Unable to create database due to an invalid path (%s)", this.f, e2.getLocalizedMessage());
        } catch (Exception e3) {
            StaticMethods.J("%s - Unable to create database due to an unexpected error (%s)", this.f, e3.getLocalizedMessage());
        }
    }

    @Override // com.adobe.mobile.AbstractDatabaseBacking
    public final void d() {
        this.g = 0L;
    }

    public final void h() {
        synchronized (this.d) {
            try {
                try {
                    try {
                        this.f13258a.delete("HITS", null, null);
                        this.g = 0L;
                    } catch (Exception e) {
                        StaticMethods.J("%s - Unable to clear tracking queue due to an unexpected error (%s)", this.f, e.getLocalizedMessage());
                    }
                } catch (NullPointerException e2) {
                    StaticMethods.J("%s - Unable to clear tracking queue due to an unopened database (%s)", this.f, e2.getLocalizedMessage());
                }
            } catch (SQLException e3) {
                StaticMethods.J("%s - Unable to clear tracking queue due to a sql error (%s)", this.f, e3.getLocalizedMessage());
            }
        }
    }

    public final void i(String str) {
        if (str == null || str.trim().length() == 0) {
            StaticMethods.I("%s - Unable to delete hit due to an invalid parameter", this.f);
            return;
        }
        synchronized (this.d) {
            try {
                try {
                    this.f13258a.delete("HITS", "ID = ?", new String[]{str});
                    this.g--;
                } catch (NullPointerException e) {
                    StaticMethods.J("%s - Unable to delete hit due to an unopened database (%s)", this.f, e.getLocalizedMessage());
                } catch (Exception e2) {
                    StaticMethods.J("%s - Unable to delete hit due to an unexpected error (%s)", this.f, e2.getLocalizedMessage());
                    throw new AbstractDatabaseBacking.CorruptedDatabaseException("Unexpected exception, database probably corrupted (" + e2.getLocalizedMessage() + ")");
                }
            } catch (SQLException e3) {
                StaticMethods.J("%s - Unable to delete hit due to a sql error (%s)", this.f, e3.getLocalizedMessage());
                throw new AbstractDatabaseBacking.CorruptedDatabaseException("Unable to delete, database probably corrupted (" + e3.getLocalizedMessage() + ")");
            }
        }
    }

    public final long j() {
        long jQueryNumEntries;
        synchronized (this.d) {
            try {
                try {
                    jQueryNumEntries = DatabaseUtils.queryNumEntries(this.f13258a, "HITS");
                } catch (NullPointerException e) {
                    StaticMethods.J("%s - Unable to get tracking queue size due to an unopened database (%s)", this.f, e.getLocalizedMessage());
                    jQueryNumEntries = 0;
                    return jQueryNumEntries;
                } catch (Exception e2) {
                    StaticMethods.J("%s - Unable to get tracking queue size due to an unexpected error (%s)", this.f, e2.getLocalizedMessage());
                    jQueryNumEntries = 0;
                    return jQueryNumEntries;
                }
            } catch (SQLException e3) {
                StaticMethods.J("%s - Unable to get tracking queue size due to a sql error (%s)", this.f, e3.getLocalizedMessage());
                jQueryNumEntries = 0;
                return jQueryNumEntries;
            }
        }
        return jQueryNumEntries;
    }

    public final void k(boolean z) {
        MobileConfig mobileConfigB = MobileConfig.b();
        if (!ReferrerHandler.f13278a && mobileConfigB.j * 1000 > 0) {
            synchronized (this.l) {
                if (this.n == null) {
                    try {
                        this.n = new ReferrerTimeoutTask(z);
                        Timer timer = new Timer();
                        this.m = timer;
                        timer.schedule(this.n, MobileConfig.b().j * 1000);
                    } catch (Exception e) {
                        StaticMethods.J("%s - Error creating referrer timer (%s)", this.f, e.getMessage());
                    }
                }
            }
            return;
        }
        if (this.m != null) {
            synchronized (this.l) {
                try {
                    this.m.cancel();
                } catch (Exception e2) {
                    StaticMethods.J("%s - Error cancelling referrer timer (%s)", this.f, e2.getMessage());
                }
                this.n = null;
            }
        }
        if (mobileConfigB.l != MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_IN) {
            return;
        }
        if ((!mobileConfigB.g || this.g > mobileConfigB.k || z) && !this.j) {
            this.j = true;
            synchronized (this.k) {
                new Thread(l(), "ADBMobileBackgroundThread").start();
            }
        }
    }

    public Runnable l() {
        throw new UnsupportedOperationException("workerThread must be overwritten");
    }
}
