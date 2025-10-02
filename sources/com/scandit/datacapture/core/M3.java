package com.scandit.datacapture.core;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class M3 {
    public static final boolean a(File libDir, String fullSoFilename, Function1 storeLog) {
        Intrinsics.h(libDir, "libDir");
        Intrinsics.h(fullSoFilename, "fullSoFilename");
        Intrinsics.h(storeLog, "storeLog");
        File file = new File(libDir, "arm64");
        File file2 = new File(file, fullSoFilename);
        String arm64SoPath = file2.getAbsolutePath();
        if (!file2.exists()) {
            ((H3) storeLog).invoke(YU.a.h("\t\t\"", arm64SoPath, "\" doesn't exist"));
            return false;
        }
        if (!file.canRead()) {
            ((H3) storeLog).invoke(androidx.compose.ui.platform.i.a('\"', "\t\tCannot read \"", arm64SoPath));
            return false;
        }
        try {
            Intrinsics.g(arm64SoPath, "arm64SoPath");
            System.load(arm64SoPath);
            ((H3) storeLog).invoke("\t\tLoaded successfully from lib/arm64 path: \"" + arm64SoPath + '\"');
            return true;
        } catch (Throwable th) {
            StringBuilder sbU = YU.a.u("\t\t", arm64SoPath, " exists and can be read, but System.load(path) failedwith message: ");
            sbU.append(th.getMessage());
            ((H3) storeLog).invoke(sbU.toString());
            return false;
        }
    }
}
