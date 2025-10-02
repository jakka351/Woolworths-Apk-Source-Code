package me.oriient.internal.services.uploadingManager;

import androidx.annotation.Keep;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.uploadingManager.DataUploaderFilesManager;
import me.oriient.internal.services.uploadingManager.models.DataUploaderDataType;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001DB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u000f\u001a\u00060\fj\u0002`\r2\f\b\u0002\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0011\u001a\u00060\fj\u0002`\r2\f\b\u0002\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00060\fj\u0002`\r2\f\b\u0002\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010(J\u0017\u0010*\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b,\u0010+J$\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\u0002042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManagerImpl;", "Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManager;", "", "dataDirPath", "<init>", "(Ljava/lang/String;)V", "id", "session", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;", "dataType", "pathForCompressedItem", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "pathForItem", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;)Ljava/lang/StringBuilder;", "pathForSession", "(Ljava/lang/StringBuilder;Ljava/lang/String;Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;)Ljava/lang/StringBuilder;", com.salesforce.marketingcloud.config.a.j, "(Ljava/lang/StringBuilder;Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;)Ljava/lang/StringBuilder;", "filePath", "", "forceCreate", "Ljava/io/File;", "getOrCreateFile", "(Ljava/lang/String;Z)Ljava/io/File;", "inputFileName", "outputFileName", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/internal/infra/utils/core/OriientError;", "gzipFile", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;", "item", "compressedFilePath", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;)Ljava/lang/String;", "originalFilePath", "doesOriginalFileExist", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;)Z", "doesCompressedFileExist", "removeOriginalFile", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;)V", "removeCompressedFile", "compress", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionId", "removeSessionData", "(Ljava/lang/String;Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;)V", "fileHandle", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;)Ljava/io/File;", "", "allSessionsDirectories", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;)Ljava/util/List;", "printStatus", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;)V", "Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManager$FileManagerStats;", "calculateStoredRecordsData", "()Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManager$FileManagerStats;", "Ljava/lang/String;", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Companion", "me/oriient/internal/services/uploadingManager/q", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DataUploaderFilesManagerImpl implements DataUploaderFilesManager {

    @NotNull
    private static final C1539q Companion = new C1539q();

    @NotNull
    private static final String TAG = "DataUploaderFilesManage";

    @NotNull
    private final String dataDirPath;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    public DataUploaderFilesManagerImpl(@NotNull String dataDirPath) {
        Intrinsics.h(dataDirPath, "dataDirPath");
        this.dataDirPath = dataDirPath;
        this.logger = InternalDiKt.getDi().inject(Reflection.f24268a.b(Logger.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getOrCreateFile(String filePath, boolean forceCreate) throws IOException {
        File file = new File(filePath);
        if (file.exists()) {
            if (!forceCreate) {
                return file;
            }
            file.delete();
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        file.createNewFile();
        return file;
    }

    public static /* synthetic */ File getOrCreateFile$default(DataUploaderFilesManagerImpl dataUploaderFilesManagerImpl, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return dataUploaderFilesManagerImpl.getOrCreateFile(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object gzipFile(String str, String str2, Continuation<? super Outcome<Unit, OriientError>> continuation) {
        return BuildersKt.f(((CoroutineContextProvider) InternalDiKt.getDi().get(Reflection.f24268a.b(CoroutineContextProvider.class))).getIo(), new r(this, str, str2, null), continuation);
    }

    private final StringBuilder path(StringBuilder builder, DataUploaderDataType dataType) {
        builder.append(this.dataDirPath);
        builder.append(File.separator);
        builder.append(dataType.getStrValue());
        return builder;
    }

    public static /* synthetic */ StringBuilder path$default(DataUploaderFilesManagerImpl dataUploaderFilesManagerImpl, StringBuilder sb, DataUploaderDataType dataUploaderDataType, int i, Object obj) {
        if ((i & 1) != 0) {
            sb = new StringBuilder();
        }
        return dataUploaderFilesManagerImpl.path(sb, dataUploaderDataType);
    }

    private final String pathForCompressedItem(String id, String session, DataUploaderDataType dataType) {
        StringBuilder sbPathForItem$default = pathForItem$default(this, null, id, session, dataType, 1, null);
        sbPathForItem$default.append(".");
        sbPathForItem$default.append("gzip");
        String string = sbPathForItem$default.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    private final StringBuilder pathForItem(StringBuilder builder, String id, String session, DataUploaderDataType dataType) {
        StringBuilder sbPathForSession = pathForSession(builder, session, dataType);
        sbPathForSession.append(File.separator);
        sbPathForSession.append(id);
        return sbPathForSession;
    }

    public static /* synthetic */ StringBuilder pathForItem$default(DataUploaderFilesManagerImpl dataUploaderFilesManagerImpl, StringBuilder sb, String str, String str2, DataUploaderDataType dataUploaderDataType, int i, Object obj) {
        if ((i & 1) != 0) {
            sb = new StringBuilder();
        }
        return dataUploaderFilesManagerImpl.pathForItem(sb, str, str2, dataUploaderDataType);
    }

    private final StringBuilder pathForSession(StringBuilder builder, String id, DataUploaderDataType dataType) {
        StringBuilder sbPath = path(builder, dataType);
        sbPath.append(File.separator);
        sbPath.append(id);
        return sbPath;
    }

    public static /* synthetic */ StringBuilder pathForSession$default(DataUploaderFilesManagerImpl dataUploaderFilesManagerImpl, StringBuilder sb, String str, DataUploaderDataType dataUploaderDataType, int i, Object obj) {
        if ((i & 1) != 0) {
            sb = new StringBuilder();
        }
        return dataUploaderFilesManagerImpl.pathForSession(sb, str, dataUploaderDataType);
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderFilesManager
    @NotNull
    public List<String> allSessionsDirectories(@NotNull DataUploaderDataType dataType) {
        Intrinsics.h(dataType, "dataType");
        String[] list = new File(path$default(this, null, dataType, 1, null).toString()).list();
        return list != null ? ArraysKt.l0(list) : EmptyList.d;
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderFilesManager
    @NotNull
    public DataUploaderFilesManager.FileManagerStats calculateStoredRecordsData() {
        String[] list;
        DataUploaderFilesManagerImpl dataUploaderFilesManagerImpl = this;
        DataUploaderDataType[] dataUploaderDataTypeArrValues = DataUploaderDataType.values();
        int length = dataUploaderDataTypeArrValues.length;
        long length2 = 0;
        int i = 0;
        int length3 = 0;
        while (i < length) {
            DataUploaderDataType dataUploaderDataType = dataUploaderDataTypeArrValues[i];
            File file = new File(path$default(dataUploaderFilesManagerImpl, null, dataUploaderDataType, 1, null).toString());
            if (file.exists() && file.isDirectory() && (list = file.list()) != null) {
                int length4 = list.length;
                int i2 = 0;
                while (i2 < length4) {
                    String str = list[i2];
                    Intrinsics.e(str);
                    String[] list2 = new File(pathForSession$default(dataUploaderFilesManagerImpl, null, str, dataUploaderDataType, 1, null).toString()).list();
                    if (list2 != null) {
                        length3 += list2.length;
                        int length5 = list2.length;
                        int i3 = 0;
                        while (i3 < length5) {
                            DataUploaderDataType dataUploaderDataType2 = dataUploaderDataType;
                            String str2 = str;
                            String str3 = list2[i3];
                            Intrinsics.e(str3);
                            int i4 = i3;
                            StringBuilder sbPathForItem$default = pathForItem$default(this, null, str3, str2, dataUploaderDataType2, 1, null);
                            str = str2;
                            dataUploaderDataType = dataUploaderDataType2;
                            length2 += new File(sbPathForItem$default.toString()).length();
                            i3 = i4 + 1;
                            length5 = length5;
                            i2 = i2;
                            dataUploaderDataTypeArrValues = dataUploaderDataTypeArrValues;
                        }
                    }
                    dataUploaderFilesManagerImpl = this;
                    i2++;
                    dataUploaderDataTypeArrValues = dataUploaderDataTypeArrValues;
                }
            }
            i++;
            dataUploaderDataTypeArrValues = dataUploaderDataTypeArrValues;
        }
        File file2 = new File(dataUploaderFilesManagerImpl.dataDirPath);
        if (!file2.exists()) {
            file2.mkdir();
        }
        return new DataUploaderFilesManager.FileManagerStats(length3, length2, file2.getFreeSpace());
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderFilesManager
    @Nullable
    public Object compress(@NotNull DataUploaderItem dataUploaderItem, @NotNull Continuation<? super Outcome<Unit, OriientError>> continuation) {
        return gzipFile(originalFilePath(dataUploaderItem), compressedFilePath(dataUploaderItem), continuation);
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderFilesManager
    @NotNull
    public String compressedFilePath(@NotNull DataUploaderItem item) {
        Intrinsics.h(item, "item");
        return pathForCompressedItem(item.getId(), item.getSessionId(), item.getDataType());
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderFilesManager
    public boolean doesCompressedFileExist(@NotNull DataUploaderItem item) {
        Intrinsics.h(item, "item");
        String strCompressedFilePath = compressedFilePath(item);
        boolean zExists = new File(strCompressedFilePath).exists();
        getLogger().d(TAG, "doesCompressedFileExist: path " + strCompressedFilePath + ", exists " + zExists);
        return zExists;
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderFilesManager
    public boolean doesOriginalFileExist(@NotNull DataUploaderItem item) {
        Intrinsics.h(item, "item");
        String strOriginalFilePath = originalFilePath(item);
        boolean zExists = new File(strOriginalFilePath).exists();
        getLogger().d(TAG, "doesOriginalFileExist: path " + strOriginalFilePath + ", exists " + zExists);
        return zExists;
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderFilesManager
    @NotNull
    public File fileHandle(@NotNull DataUploaderItem item) {
        Intrinsics.h(item, "item");
        return getOrCreateFile$default(this, originalFilePath(item), false, 2, null);
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderFilesManager
    @NotNull
    public String originalFilePath(@NotNull DataUploaderItem item) {
        Intrinsics.h(item, "item");
        String string = pathForItem$default(this, null, item.getId(), item.getSessionId(), item.getDataType(), 1, null).toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderFilesManager
    public void printStatus(@NotNull DataUploaderDataType dataType) {
        Intrinsics.h(dataType, "dataType");
        try {
            getLogger().d(TAG, "----- Saved sessions -----");
            for (String str : allSessionsDirectories(dataType)) {
                getLogger().d(TAG, str);
                getLogger().d(TAG, "----- Saved items -----");
                DataUploaderDataType dataUploaderDataType = dataType;
                String[] list = new File(pathForSession$default(this, null, str, dataUploaderDataType, 1, null).toString()).list();
                if (list != null) {
                    for (String str2 : list) {
                        Logger logger = getLogger();
                        Intrinsics.e(str2);
                        logger.d(TAG, str2);
                    }
                }
                dataType = dataUploaderDataType;
            }
        } catch (Exception e) {
            getLogger().e(TAG, "print status failed", e);
        }
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderFilesManager
    public void removeCompressedFile(@NotNull DataUploaderItem item) {
        Intrinsics.h(item, "item");
        getLogger().d(TAG, "removeCompressedFile() called with: item = " + item);
        File file = new File(compressedFilePath(item));
        if (file.exists()) {
            file.delete();
        }
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderFilesManager
    public void removeOriginalFile(@NotNull DataUploaderItem item) {
        Intrinsics.h(item, "item");
        getLogger().d(TAG, "removeOriginalFile() called with: item = " + item);
        File file = new File(originalFilePath(item));
        if (file.exists()) {
            file.delete();
        }
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderFilesManager
    public void removeSessionData(@NotNull String sessionId, @NotNull DataUploaderDataType dataType) {
        File[] fileArrListFiles;
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(dataType, "dataType");
        getLogger().d(TAG, "removeSessionData() called with: sessionId = " + sessionId + ", dataType = " + dataType);
        File file = new File(pathForSession$default(this, null, sessionId, dataType, 1, null).toString());
        if (file.exists()) {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    file2.delete();
                }
            }
            file.delete();
        }
    }
}
