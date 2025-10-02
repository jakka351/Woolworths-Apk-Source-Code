package com.squareup.sqldelight.android;

import android.util.LruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/squareup/sqldelight/android/AndroidSqliteDriver$statements$1", "Landroid/util/LruCache;", "", "Lcom/squareup/sqldelight/android/AndroidStatement;", "sqldelight-android-driver_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidSqliteDriver$statements$1 extends LruCache<Integer, AndroidStatement> {
    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Integer num, AndroidStatement androidStatement, AndroidStatement androidStatement2) {
        num.intValue();
        AndroidStatement oldValue = androidStatement;
        Intrinsics.h(oldValue, "oldValue");
        if (z) {
            oldValue.close();
        }
    }
}
