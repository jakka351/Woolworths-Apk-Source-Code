package me.oriient.internal.services.dataManager.database.internal;

import com.squareup.sqldelight.db.SqlCursor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class a {
    public static String a(String str, SqlCursor sqlCursor, int i) {
        Intrinsics.e(str);
        String string = sqlCursor.getString(i);
        Intrinsics.e(string);
        return string;
    }
}
