package com.tealium.core.persistence;

import android.provider.BaseColumns;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tealium/core/persistence/i0;", "", "a", "b", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class i0 {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/persistence/i0$a;", "Landroid/provider/BaseColumns;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public static final class a implements BaseColumns {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/persistence/i0$b;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {
        public static String a(String str) {
            return YU.a.h("CREATE TABLE IF NOT EXISTS ", str, " (key TEXT PRIMARY KEY,value TEXT,expiry LONG, timestamp LONG, type SMALLINT)");
        }
    }
}
