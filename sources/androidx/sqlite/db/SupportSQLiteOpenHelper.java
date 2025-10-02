package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.camera.core.impl.b;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Ljava/io/Closeable;", "Callback", "Configuration", "Factory", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "", "Companion", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static abstract class Callback {

        /* renamed from: a, reason: collision with root package name */
        public final int f3764a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback$Companion;", "", "", "TAG", "Ljava/lang/String;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
        }

        public Callback(int i) {
            this.f3764a = i;
        }

        public static void a(String str) {
            if (str.equalsIgnoreCase(":memory:")) {
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.j(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }

        public void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }

        public abstract void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i, int i2) {
            throw new SQLiteException(b.i(i, i2, "Can't downgrade database from version ", " to "));
        }

        public void e(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }

        public abstract void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i, int i2);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "", "Builder", "Companion", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Configuration {

        /* renamed from: a, reason: collision with root package name */
        public final Context f3765a;
        public final String b;
        public final Callback c;
        public final boolean d;
        public final boolean e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            public final Context f3766a;
            public String b;
            public Callback c;
            public boolean d;
            public boolean e;

            public Builder(@NotNull Context context) {
                Intrinsics.h(context, "context");
                this.f3766a = context;
            }

            public final Configuration a() {
                String str;
                Callback callback = this.c;
                if (callback == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.d && ((str = this.b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new Configuration(this.f3766a, this.b, callback, this.d, this.e);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Companion;", "", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public static Builder a(Context context) {
                Intrinsics.h(context, "context");
                return new Builder(context);
            }
        }

        public Configuration(Context context, String str, Callback callback, boolean z, boolean z2) {
            Intrinsics.h(callback, "callback");
            this.f3765a = context;
            this.b = str;
            this.c = callback;
            this.d = z;
            this.e = z2;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {
        SupportSQLiteOpenHelper d(Configuration configuration);
    }

    SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
