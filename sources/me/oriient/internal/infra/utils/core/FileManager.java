package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.android.ContextProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u001cJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H&JA\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00072!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00070\u000eH&J\u001e\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0005H&J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H&J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\b\u001a\u00020\tH&J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0018H&¨\u0006\u001d"}, d2 = {"Lme/oriient/internal/infra/utils/core/FileManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "deleteDirectory", "", "directoryPath", "", "deleteFile", "", "file", "Ljava/io/File;", "fileName", "deleteFiles", "recursive", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "findFile", "directoryName", SearchIntents.EXTRA_QUERY, "getFileOrNull", "getOrCreateFile", "readFile", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/internal/infra/utils/core/OriientError;", "writeFile", "fileData", "FileManagerFolders", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface FileManager extends DiProvidable {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void deleteFiles$default(FileManager fileManager, String str, boolean z, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteFiles");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            fileManager.deleteFiles(str, z, function1);
        }

        public static /* synthetic */ File findFile$default(FileManager fileManager, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findFile");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return fileManager.findFile(str, str2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006j\u0002\b\t¨\u0006\n"}, d2 = {"Lme/oriient/internal/infra/utils/core/FileManager$FileManagerFolders;", "", "diKey", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDiKey", "()Ljava/lang/String;", com.salesforce.marketingcloud.config.a.j, "getPath", "FILES", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class FileManagerFolders {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FileManagerFolders[] $VALUES;
        public static final FileManagerFolders FILES = new FileManagerFolders("FILES", 0, "files");

        @NotNull
        private final String diKey;

        private static final /* synthetic */ FileManagerFolders[] $values() {
            return new FileManagerFolders[]{FILES};
        }

        static {
            FileManagerFolders[] fileManagerFoldersArr$values = $values();
            $VALUES = fileManagerFoldersArr$values;
            $ENTRIES = EnumEntriesKt.a(fileManagerFoldersArr$values);
        }

        private FileManagerFolders(String str, int i, String str2) {
            this.diKey = str2;
        }

        @NotNull
        public static EnumEntries<FileManagerFolders> getEntries() {
            return $ENTRIES;
        }

        public static FileManagerFolders valueOf(String str) {
            return (FileManagerFolders) Enum.valueOf(FileManagerFolders.class, str);
        }

        public static FileManagerFolders[] values() {
            return (FileManagerFolders[]) $VALUES.clone();
        }

        @NotNull
        public final String getDiKey() {
            return this.diKey;
        }

        @NotNull
        public final String getPath() {
            if (d.$EnumSwitchMapping$0[ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            String absolutePath = ((ContextProvider) InternalDiKt.getDi().get(Reflection.f24268a.b(ContextProvider.class))).getContext().getFilesDir().getAbsolutePath();
            Intrinsics.g(absolutePath, "getAbsolutePath(...)");
            return absolutePath;
        }
    }

    void deleteDirectory(@NotNull String directoryPath);

    boolean deleteFile(@NotNull File file);

    boolean deleteFile(@NotNull String fileName);

    void deleteFiles(@Nullable String directoryPath, boolean recursive, @NotNull Function1<? super String, Boolean> predicate);

    @Nullable
    File findFile(@Nullable String directoryName, @NotNull String query);

    @Nullable
    File getFileOrNull(@NotNull String fileName);

    @NotNull
    File getOrCreateFile(@NotNull String fileName);

    @NotNull
    Outcome<byte[], OriientError> readFile(@NotNull File file);

    @NotNull
    Outcome<Unit, OriientError> writeFile(@NotNull File file, @NotNull byte[] fileData);
}
