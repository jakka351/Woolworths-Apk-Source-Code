package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RequiresApi;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/Api21Impl;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Api21Impl {
    public static File a(Context context) {
        Intrinsics.h(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        Intrinsics.g(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
