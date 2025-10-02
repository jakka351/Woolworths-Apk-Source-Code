package androidx.sqlite.db;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat;", "", "Api16Impl", "Api19Impl", "Api21Impl", "Api23Impl", "Api29Impl", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes2.dex */
public final class SupportSQLiteCompat {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api16Impl;", "", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi
    @RestrictTo
    /* loaded from: classes.dex */
    public static final class Api16Impl {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api19Impl;", "", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi
    @RestrictTo
    /* loaded from: classes.dex */
    public static final class Api19Impl {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api21Impl;", "", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi
    @RestrictTo
    /* loaded from: classes.dex */
    public static final class Api21Impl {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api23Impl;", "", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi
    @RestrictTo
    public static final class Api23Impl {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api29Impl;", "", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi
    @RestrictTo
    public static final class Api29Impl {
        public static final List a(Cursor cursor) {
            Intrinsics.h(cursor, "cursor");
            List<Uri> notificationUris = cursor.getNotificationUris();
            Intrinsics.e(notificationUris);
            return notificationUris;
        }

        public static final void b(Cursor cursor, ContentResolver contentResolver, List list) {
            Intrinsics.h(cursor, "cursor");
            cursor.setNotificationUris(contentResolver, list);
        }
    }
}
