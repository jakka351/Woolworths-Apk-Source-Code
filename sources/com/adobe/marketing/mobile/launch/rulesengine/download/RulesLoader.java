package com.adobe.marketing.mobile.launch.rulesengine.download;

import com.adobe.marketing.mobile.internal.util.FileUtils;
import com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.services.caching.CacheEntry;
import com.adobe.marketing.mobile.services.caching.CacheExpiry;
import com.adobe.marketing.mobile.util.StreamUtils;
import com.adobe.marketing.mobile.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public class RulesLoader {

    /* renamed from: a, reason: collision with root package name */
    public final String f13203a;
    public final RulesZipProcessingHelper b;

    public RulesLoader() {
        RulesZipProcessingHelper rulesZipProcessingHelper = new RulesZipProcessingHelper();
        if (StringUtils.a("config.rules")) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.f13203a = "config.rules";
        this.b = rulesZipProcessingHelper;
    }

    public final RulesLoadResult a(String str, InputStream inputStream, HashMap map) {
        String strA;
        if (inputStream == null) {
            Log.a();
            return new RulesLoadResult(null, RulesLoadResult.Reason.i);
        }
        this.b.getClass();
        if (!StringUtils.a(str)) {
            File fileA = RulesZipProcessingHelper.a(str);
            if (fileA.exists() || fileA.mkdirs()) {
                if (!StringUtils.a(str)) {
                    if (FileUtils.c(inputStream, RulesZipProcessingHelper.b(str))) {
                        if (StringUtils.a(str)) {
                            strA = null;
                        } else {
                            File fileA2 = RulesZipProcessingHelper.a(str);
                            File fileB = RulesZipProcessingHelper.b(str);
                            String outputDirectoryPath = fileA2.getPath();
                            Intrinsics.h(outputDirectoryPath, "outputDirectoryPath");
                            File file = new File(outputDirectoryPath);
                            boolean z = false;
                            if (file.exists() || file.mkdir()) {
                                try {
                                    ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(fileB));
                                    try {
                                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                                        String outputFolderCanonicalPath = file.getCanonicalPath();
                                        if (nextEntry == null) {
                                            Log.a();
                                            zipInputStream.close();
                                        } else {
                                            boolean zC = true;
                                            boolean z2 = true;
                                            while (nextEntry != null && zC) {
                                                File file2 = new File(outputDirectoryPath + File.separator + nextEntry.getName());
                                                String canonicalPath = file2.getCanonicalPath();
                                                Intrinsics.g(canonicalPath, "newZipEntryFile.canonicalPath");
                                                Intrinsics.g(outputFolderCanonicalPath, "outputFolderCanonicalPath");
                                                if (!StringsKt.W(canonicalPath, outputFolderCanonicalPath, false)) {
                                                    Log.a();
                                                    zipInputStream.close();
                                                    break;
                                                }
                                                if (nextEntry.isDirectory()) {
                                                    zC = file2.exists() || file2.mkdirs();
                                                } else {
                                                    File parentFile = file2.getParentFile();
                                                    if (parentFile == null || !(parentFile.exists() || parentFile.mkdirs())) {
                                                        file2.getAbsolutePath();
                                                        Log.a();
                                                        zipInputStream.close();
                                                        break;
                                                    }
                                                    zC = FileUtils.c(zipInputStream, file2);
                                                }
                                                z2 = z2 && zC;
                                                zipInputStream.closeEntry();
                                                nextEntry = zipInputStream.getNextEntry();
                                            }
                                            zipInputStream.closeEntry();
                                            zipInputStream.close();
                                            z = z2;
                                        }
                                    } finally {
                                    }
                                } catch (Exception e) {
                                    e.toString();
                                    Log.a();
                                }
                            } else {
                                "Could not create the output directory ".concat(outputDirectoryPath);
                                Log.a();
                            }
                            if (z) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(fileA2.getPath());
                                File file3 = new File(YU.a.o(sb, File.separator, "rules.json"));
                                if (file3.exists()) {
                                    try {
                                        FileInputStream fileInputStream = new FileInputStream(file3);
                                        try {
                                            strA = StreamUtils.a(fileInputStream);
                                            if (strA == null) {
                                                Log.a();
                                                fileInputStream.close();
                                            } else {
                                                fileInputStream.close();
                                            }
                                        } finally {
                                        }
                                    } catch (IOException unused) {
                                        Log.a();
                                    }
                                } else {
                                    Log.a();
                                }
                            } else {
                                Log.a();
                            }
                            strA = null;
                        }
                        if (strA == null) {
                            Log.a();
                            return new RulesLoadResult(null, RulesLoadResult.Reason.e);
                        }
                        if (!ServiceProvider.a().f.c(this.f13203a, str, new CacheEntry(new ByteArrayInputStream(strA.getBytes(StandardCharsets.UTF_8)), new CacheExpiry(null), map))) {
                            Log.a();
                        }
                        if (!StringUtils.a(str)) {
                            FilesKt.b(RulesZipProcessingHelper.a(str));
                        }
                        return new RulesLoadResult(strA, RulesLoadResult.Reason.j);
                    }
                    Log.a();
                }
                Log.a();
                return new RulesLoadResult(null, RulesLoadResult.Reason.g);
            }
            Log.a();
        }
        Log.a();
        return new RulesLoadResult(null, RulesLoadResult.Reason.f);
    }
}
