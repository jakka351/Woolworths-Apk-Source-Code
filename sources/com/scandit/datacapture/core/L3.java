package com.scandit.datacapture.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.io.ByteStreamsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class L3 {
    public static final boolean a(File apkBaseDir, File file, String str, List list, Function1 function1) throws IOException {
        File extractionDir = file;
        String fullSoFilename = str;
        List<String> archs = list;
        Function1 storeLog = function1;
        Intrinsics.h(apkBaseDir, "apkBaseDir");
        Intrinsics.h(extractionDir, "extractionDir");
        Intrinsics.h(fullSoFilename, "fullSoFilename");
        Intrinsics.h(archs, "archs");
        Intrinsics.h(storeLog, "storeLog");
        File[] fileArrListFiles = apkBaseDir.listFiles(new com.google.firebase.crashlytics.internal.persistence.b(1));
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            ((I3) function1).invoke("\t\tNo \"*.apk\" files in " + apkBaseDir.getAbsolutePath());
            return false;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (i < length) {
            ZipFile zipFile = new ZipFile(fileArrListFiles[i]);
            if (!(archs instanceof Collection) || !archs.isEmpty()) {
                for (String str2 : archs) {
                    StringBuilder sb = new StringBuilder("lib");
                    String str3 = File.separator;
                    String strL = androidx.constraintlayout.core.state.a.l(sb, str3, str2, str3, fullSoFilename);
                    ZipEntry entry = zipFile.getEntry(strL);
                    if (entry == null) {
                        StringBuilder sbU = YU.a.u("\t\tCannot find \"", strL, "\" inside ");
                        sbU.append(zipFile.getName());
                        ((I3) storeLog).invoke(sbU.toString());
                    } else {
                        StringBuilder sbU2 = YU.a.u("\t\tFound \"", strL, "\" inside ");
                        sbU2.append(zipFile.getName());
                        I3 i3 = (I3) storeLog;
                        i3.invoke(sbU2.toString());
                        if (extractionDir.exists() || extractionDir.mkdirs()) {
                            File file2 = new File(extractionDir, fullSoFilename);
                            if (file2.exists()) {
                                FilesKt.b(file2);
                            }
                            file2.createNewFile();
                            String pathToLoad = file2.getAbsolutePath();
                            try {
                                InputStream inputStream = zipFile.getInputStream(entry);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        Intrinsics.g(inputStream, "inputStream");
                                        long jA = ByteStreamsKt.a(inputStream, fileOutputStream, 8192);
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                        inputStream.close();
                                        I3 i32 = (I3) function1;
                                        i32.invoke("\t\t\tExtracted " + entry.getName() + " into \"" + pathToLoad + "\", " + jA + " bytes");
                                        try {
                                            Intrinsics.g(pathToLoad, "pathToLoad");
                                            System.load(pathToLoad);
                                            i32.invoke("\t\t\tSystem.load(" + pathToLoad + ") successful");
                                            try {
                                                file2.delete();
                                            } catch (IOException unused) {
                                                i32.invoke(androidx.compose.ui.platform.i.a('\"', "\t\t\tError deleting extracted cache file \"", pathToLoad));
                                            }
                                            return true;
                                        } catch (Throwable th) {
                                            StringBuilder sbU3 = YU.a.u("\t\t\tSystem.load(", pathToLoad, ") failed with message: ");
                                            sbU3.append(th.getMessage());
                                            i32.invoke(sbU3.toString());
                                        }
                                    } finally {
                                    }
                                } finally {
                                }
                            } catch (IOException e) {
                                StringBuilder sb2 = new StringBuilder("\t\t\tError extracting ");
                                sb2.append(entry.getName());
                                sb2.append(" into \"");
                                sb2.append(pathToLoad);
                                sb2.append("\" -> ");
                                i3.invoke(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.k(e, sb2));
                            }
                        } else {
                            i3.invoke("\t\t\tCannot create " + extractionDir);
                        }
                    }
                    extractionDir = file;
                    fullSoFilename = str;
                    storeLog = function1;
                }
            }
            i++;
            extractionDir = file;
            fullSoFilename = str;
            archs = list;
            storeLog = function1;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(File file, String name) {
        Intrinsics.g(name, "name");
        return StringsKt.v(name, ".apk", false);
    }
}
