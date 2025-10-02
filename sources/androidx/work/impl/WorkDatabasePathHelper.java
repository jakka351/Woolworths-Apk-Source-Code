package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/WorkDatabasePathHelper;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension
/* loaded from: classes.dex */
public final class WorkDatabasePathHelper {
    public static final void a(Context context) {
        Intrinsics.h(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.g(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            Logger.e().a(WorkDatabasePathHelperKt.f3937a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            Intrinsics.g(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(Api21Impl.a(context), "androidx.work.workdb");
            String[] strArr = WorkDatabasePathHelperKt.b;
            int iH = MapsKt.h(strArr.length);
            if (iH < 16) {
                iH = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            for (Map.Entry entry : MapsKt.n(linkedHashMap, new Pair(databasePath2, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        Logger.e().h(WorkDatabasePathHelperKt.f3937a, "Over-writing contents of " + file3);
                    }
                    Logger.e().a(WorkDatabasePathHelperKt.f3937a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }
}
