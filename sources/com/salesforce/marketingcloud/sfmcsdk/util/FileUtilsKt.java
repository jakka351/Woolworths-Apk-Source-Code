package com.salesforce.marketingcloud.sfmcsdk.util;

import android.content.Context;
import com.salesforce.marketingcloud.sfmcsdk.components.http.RequestKt;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u001a\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a \u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0012H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"SDK_PACKAGE_PREFIX", "", "getFilenameForModuleInstallation", "filename", "moduleApplicationId", "registrationId", "getFilenamePrefixForModule", "getFilenamePrefixForModuleInstallation", "getFilenamePrefixForSFMCSdk", "retrieveModuleKey", "context", "Landroid/content/Context;", "storeModuleKey", "", "moduleName", "keyValue", "wipeModuleFiles", "readAll", "Ljava/io/InputStream;", "sfmcsdk_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileUtilsKt {

    @NotNull
    public static final String SDK_PACKAGE_PREFIX = "com.salesforce.marketingcloud";

    @NotNull
    public static final String getFilenameForModuleInstallation(@NotNull String filename, @NotNull String moduleApplicationId, @NotNull String registrationId) {
        Intrinsics.h(filename, "filename");
        Intrinsics.h(moduleApplicationId, "moduleApplicationId");
        Intrinsics.h(registrationId, "registrationId");
        return getFilenamePrefixForModuleInstallation(moduleApplicationId, registrationId) + '_' + filename;
    }

    @NotNull
    public static final String getFilenamePrefixForModule(@NotNull String moduleApplicationId) {
        Intrinsics.h(moduleApplicationId, "moduleApplicationId");
        return "com.salesforce.marketingcloud_".concat(moduleApplicationId);
    }

    @NotNull
    public static final String getFilenamePrefixForModuleInstallation(@NotNull String moduleApplicationId, @NotNull String registrationId) {
        Intrinsics.h(moduleApplicationId, "moduleApplicationId");
        Intrinsics.h(registrationId, "registrationId");
        return getFilenamePrefixForModule(moduleApplicationId) + '_' + registrationId;
    }

    @NotNull
    public static final String getFilenamePrefixForSFMCSdk(@NotNull String filename) {
        Intrinsics.h(filename, "filename");
        return "com.salesforce.marketingcloud_sfmcsdk_".concat(filename);
    }

    @Nullable
    public static final String readAll(@Nullable InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, RequestKt.getUTF_8()));
        try {
            StringBuilder sb = new StringBuilder();
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                sb.append(line);
                sb.append('\n');
            }
            String string = sb.toString();
            bufferedReader.close();
            return string;
        } finally {
        }
    }

    @Nullable
    public static final String retrieveModuleKey(@NotNull Context context, @NotNull String moduleApplicationId) {
        Intrinsics.h(context, "context");
        Intrinsics.h(moduleApplicationId, "moduleApplicationId");
        try {
            File file = new File(context.getNoBackupFilesDir(), moduleApplicationId);
            if (file.exists()) {
                String strE = FilesKt.e(file, Charsets.f24671a);
                if (!StringsKt.D(strE)) {
                    return strE;
                }
            }
            return null;
        } catch (Exception unused) {
            SFMCSdkLogger.INSTANCE.e("~$SFMCSdkStorage", new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt.retrieveModuleKey.1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Caught exception trying to retrieve module key from file";
                }
            });
            return null;
        }
    }

    public static final void storeModuleKey(@NotNull Context context, @NotNull String moduleName, @NotNull String keyValue) {
        Intrinsics.h(context, "context");
        Intrinsics.h(moduleName, "moduleName");
        Intrinsics.h(keyValue, "keyValue");
        try {
            FilesKt.h(new File(context.getNoBackupFilesDir(), moduleName), keyValue, Charsets.f24671a);
        } catch (Exception unused) {
            SFMCSdkLogger.INSTANCE.e("~$SFMCSdkStorage", new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt.storeModuleKey.1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Failed to write module key to file";
                }
            });
        }
    }

    public static final void wipeModuleFiles(@NotNull Context context, @NotNull String moduleApplicationId) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        Intrinsics.h(context, "context");
        Intrinsics.h(moduleApplicationId, "moduleApplicationId");
        try {
            File parentFile = context.getDatabasePath(moduleApplicationId).getParentFile();
            if (parentFile != null && parentFile.isDirectory() && (fileArrListFiles2 = parentFile.listFiles(new a(moduleApplicationId, 0))) != null) {
                for (final File file : fileArrListFiles2) {
                    SFMCSdkLogger.INSTANCE.w("~$SFMCSdkStorage", new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt$wipeModuleFiles$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "Deleting Database File: " + file.getName();
                        }
                    });
                    file.delete();
                }
            }
        } catch (Exception unused) {
            SFMCSdkLogger.INSTANCE.w("~$SFMCSdkStorage", new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt.wipeModuleFiles.3
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Caught exception trying to delete database file";
                }
            });
        }
        try {
            File file2 = new File(context.getFilesDir().getParent() + "/shared_prefs");
            if (!file2.isDirectory() || (fileArrListFiles = file2.listFiles(new a(moduleApplicationId, 1))) == null) {
                return;
            }
            for (final File file3 : fileArrListFiles) {
                SFMCSdkLogger.INSTANCE.w("~$SFMCSdkStorage", new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt$wipeModuleFiles$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "Deleting SharedPreferences File: " + file3.getName();
                    }
                });
                file3.delete();
            }
        } catch (Exception unused2) {
            SFMCSdkLogger.INSTANCE.w("~$SFMCSdkStorage", new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt.wipeModuleFiles.6
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Caught exception trying to delete SharedPreferences file";
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wipeModuleFiles$lambda-0, reason: not valid java name */
    public static final boolean m269wipeModuleFiles$lambda0(String moduleApplicationId, File file, String name) {
        Intrinsics.h(moduleApplicationId, "$moduleApplicationId");
        Intrinsics.g(name, "name");
        return StringsKt.W(name, getFilenamePrefixForModule(moduleApplicationId), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wipeModuleFiles$lambda-2, reason: not valid java name */
    public static final boolean m270wipeModuleFiles$lambda2(String moduleApplicationId, File file, String name) {
        Intrinsics.h(moduleApplicationId, "$moduleApplicationId");
        Intrinsics.g(name, "name");
        return StringsKt.W(name, getFilenamePrefixForModule(moduleApplicationId), false);
    }
}
