package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 32\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ#\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010\u0005JD\u0010\u0010\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\b0\nH\u0016¢\u0006\u0004\b\u0010\u0010(J\u0017\u0010)\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010)\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lme/oriient/internal/infra/utils/core/FileManagerImpl;", "Lme/oriient/internal/infra/utils/core/FileManager;", "", "baseDirPath", "<init>", "(Ljava/lang/String;)V", "Ljava/io/File;", "directory", "", "recursive", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "fileName", "predicate", "", "deleteFiles", "(Ljava/io/File;ZLkotlin/jvm/functions/Function1;)V", "deleteDirectoryIfEmpty", "(Ljava/io/File;)V", "file", "", "fileData", "writeToFile", "(Ljava/io/File;[B)V", "getFileOrNull", "(Ljava/lang/String;)Ljava/io/File;", "getOrCreateFile", "directoryName", SearchIntents.EXTRA_QUERY, "findFile", "(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/internal/infra/utils/core/OriientError;", "writeFile", "(Ljava/io/File;[B)Lme/oriient/internal/infra/utils/core/Outcome;", "readFile", "(Ljava/io/File;)Lme/oriient/internal/infra/utils/core/Outcome;", "directoryPath", "deleteDirectory", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "deleteFile", "(Ljava/io/File;)Z", "(Ljava/lang/String;)Z", "Ljava/lang/String;", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Companion", "me/oriient/internal/infra/utils/core/e", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FileManagerImpl implements FileManager {

    @NotNull
    private static final e Companion = new e();

    @NotNull
    private static final String TAG = "FileManager";

    @NotNull
    private final String baseDirPath;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    public FileManagerImpl(@NotNull String baseDirPath) {
        Intrinsics.h(baseDirPath, "baseDirPath");
        this.baseDirPath = baseDirPath;
        this.logger = InternalDiKt.getDi().inject(Reflection.f24268a.b(Logger.class));
    }

    private final void deleteDirectoryIfEmpty(File directory) {
        String[] list;
        if (directory == null || (list = directory.list()) == null || list.length != 0 || Intrinsics.c(directory.getPath(), this.baseDirPath)) {
            return;
        }
        directory.delete();
        deleteDirectoryIfEmpty(directory.getParentFile());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deleteFiles$lambda$5(Function1 predicate, File file, String str) {
        Intrinsics.h(predicate, "$predicate");
        Intrinsics.e(str);
        return ((Boolean) predicate.invoke(str)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findFile$lambda$0(String query, File file, String str) {
        Intrinsics.h(query, "$query");
        Intrinsics.e(str);
        return StringsKt.o(str, query, false);
    }

    private final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    private final void writeToFile(File file, byte[] fileData) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            try {
                bufferedOutputStream.write(fileData);
                bufferedOutputStream.close();
                fileOutputStream.close();
            } finally {
            }
        } finally {
        }
    }

    @Override // me.oriient.internal.infra.utils.core.FileManager
    public void deleteDirectory(@NotNull String directoryPath) {
        Intrinsics.h(directoryPath, "directoryPath");
        File file = new File(YU.a.o(new StringBuilder(), this.baseDirPath, directoryPath));
        if (file.isDirectory()) {
            FilesKt.b(file);
        }
    }

    @Override // me.oriient.internal.infra.utils.core.FileManager
    public boolean deleteFile(@NotNull File file) {
        Intrinsics.h(file, "file");
        return file.delete();
    }

    @Override // me.oriient.internal.infra.utils.core.FileManager
    public void deleteFiles(@Nullable String directoryPath, boolean recursive, @NotNull Function1<? super String, Boolean> predicate) {
        String strO;
        Intrinsics.h(predicate, "predicate");
        boolean z = directoryPath != null;
        if (z) {
            strO = YU.a.o(new StringBuilder(), this.baseDirPath, directoryPath);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            strO = this.baseDirPath;
        }
        deleteFiles(new File(strO), recursive, predicate);
    }

    @Override // me.oriient.internal.infra.utils.core.FileManager
    @Nullable
    public File findFile(@Nullable String directoryName, @NotNull String query) {
        String strO;
        File[] fileArrListFiles;
        Intrinsics.h(query, "query");
        boolean z = directoryName != null;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.baseDirPath);
            strO = YU.a.o(sb, File.separator, directoryName);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            strO = this.baseDirPath;
        }
        File file = new File(strO);
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new com.salesforce.marketingcloud.sfmcsdk.util.a(query, 2))) != null) {
            return (File) ArraysKt.H(fileArrListFiles);
        }
        return null;
    }

    @Override // me.oriient.internal.infra.utils.core.FileManager
    @Nullable
    public File getFileOrNull(@NotNull String fileName) {
        Intrinsics.h(fileName, "fileName");
        File file = new File(this.baseDirPath, fileName);
        boolean zExists = file.exists();
        if (zExists) {
            return file;
        }
        if (zExists) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    @Override // me.oriient.internal.infra.utils.core.FileManager
    @NotNull
    public File getOrCreateFile(@NotNull String fileName) throws IOException {
        File parentFile;
        Intrinsics.h(fileName, "fileName");
        File file = new File(this.baseDirPath, fileName);
        File parentFile2 = file.getParentFile();
        if (parentFile2 != null && !parentFile2.exists() && (parentFile = file.getParentFile()) != null) {
            parentFile.mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }

    @Override // me.oriient.internal.infra.utils.core.FileManager
    @NotNull
    public Outcome<byte[], OriientError> readFile(@NotNull File file) throws IOException {
        Intrinsics.h(file, "file");
        byte[] bArr = new byte[(int) file.length()];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                try {
                    bufferedInputStream.read(bArr);
                    bufferedInputStream.close();
                    fileInputStream.close();
                    return new Outcome.Success(bArr);
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            getLogger().e(TAG, "Failed to read from file", e);
            return new Outcome.Failure(new IOError());
        }
    }

    @Override // me.oriient.internal.infra.utils.core.FileManager
    @NotNull
    public Outcome<Unit, OriientError> writeFile(@NotNull File file, @NotNull byte[] fileData) {
        Intrinsics.h(file, "file");
        Intrinsics.h(fileData, "fileData");
        try {
            writeToFile(file, fileData);
            return new Outcome.Success(Unit.f24250a);
        } catch (Exception e) {
            getLogger().e(TAG, "Failed to save file", e);
            return new Outcome.Failure(new IOError());
        }
    }

    @Override // me.oriient.internal.infra.utils.core.FileManager
    public boolean deleteFile(@NotNull String fileName) {
        Intrinsics.h(fileName, "fileName");
        File file = new File(this.baseDirPath, fileName);
        boolean zExists = file.exists();
        if (zExists) {
            return file.delete();
        }
        if (zExists) {
            throw new NoWhenBranchMatchedException();
        }
        return true;
    }

    private final void deleteFiles(File directory, boolean recursive, Function1<? super String, Boolean> predicate) {
        File[] fileArrListFiles;
        if (recursive && (fileArrListFiles = directory.listFiles()) != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file2 = (File) it.next();
                Intrinsics.e(file2);
                deleteFiles(file2, true, predicate);
            }
        }
        File[] fileArrListFiles2 = directory.listFiles(new com.salesforce.marketingcloud.sfmcsdk.util.a(predicate, 3));
        if (fileArrListFiles2 != null) {
            for (File file3 : fileArrListFiles2) {
                file3.delete();
            }
        }
        deleteDirectoryIfEmpty(directory);
    }
}
