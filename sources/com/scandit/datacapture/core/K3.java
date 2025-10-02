package com.scandit.datacapture.core;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class K3 {
    public static final String a(Context context) {
        String str = context.getApplicationInfo().sourceDir;
        Intrinsics.g(str, "context.applicationInfo.sourceDir");
        ArrayList arrayListJ0 = CollectionsKt.J0(StringsKt.T(str, new String[]{com.medallia.digital.mobilesdk.q2.c}, 6));
        CollectionsKt.j0(arrayListJ0);
        return CollectionsKt.M(arrayListJ0, com.medallia.digital.mobilesdk.q2.c, null, null, null, 62);
    }

    public static final File b(Context context) {
        File codeCacheDir = context.getCodeCacheDir();
        Intrinsics.g(codeCacheDir, "context.codeCacheDir");
        return codeCacheDir;
    }
}
