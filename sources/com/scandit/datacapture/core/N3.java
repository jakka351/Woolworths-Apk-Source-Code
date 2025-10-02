package com.scandit.datacapture.core;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class N3 {
    public static final boolean a(File libDirectory, String fullSoFilename, List archs, Function1 storeLog) {
        Intrinsics.h(libDirectory, "libDirectory");
        Intrinsics.h(fullSoFilename, "fullSoFilename");
        Intrinsics.h(archs, "archs");
        Intrinsics.h(storeLog, "storeLog");
        String absolutePath = libDirectory.getAbsolutePath();
        Intrinsics.g(absolutePath, "libDirectory.absolutePath");
        if (!libDirectory.exists()) {
            ((G3) storeLog).invoke(YU.a.h("\t\tBase lib path \"", absolutePath, "\" doesn't exist"));
            return false;
        }
        if (!libDirectory.canRead()) {
            ((G3) storeLog).invoke(androidx.compose.ui.platform.i.a('\"', "\t\tCannot read \"", absolutePath));
            return false;
        }
        if (!(archs instanceof Collection) || !archs.isEmpty()) {
            Iterator it = archs.iterator();
            while (it.hasNext()) {
                if (a(libDirectory, (String) it.next(), fullSoFilename, storeLog)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean a(File file, String str, String str2, Function1 function1) {
        File file2 = new File(file, str);
        String absolutePath = file2.getAbsolutePath();
        Intrinsics.g(absolutePath, "archDir.absolutePath");
        File file3 = new File(file2, str2);
        String absolutePath2 = file3.getAbsolutePath();
        Intrinsics.g(absolutePath2, "soFile.absolutePath");
        if (!file3.exists()) {
            ((G3) function1).invoke("\t\tNo \"" + file3.getName() + "\" file found in: \"" + absolutePath + '\"');
            return false;
        }
        if (!file3.canRead()) {
            ((G3) function1).invoke("\t\tCannot read local so file: ".concat(absolutePath2));
            return false;
        }
        try {
            System.load(absolutePath2);
            ((G3) function1).invoke("\t\tSystem.load(" + absolutePath2 + ") successful");
            return true;
        } catch (Throwable th) {
            StringBuilder sbU = YU.a.u("\t\t", absolutePath2, " exists and can read, but System.load(path) failedwith message: ");
            sbU.append(th.getMessage());
            ((G3) function1).invoke(sbU.toString());
            return false;
        }
    }
}
