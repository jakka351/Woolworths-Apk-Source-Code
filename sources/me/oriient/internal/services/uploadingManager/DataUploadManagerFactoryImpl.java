package me.oriient.internal.services.uploadingManager;

import androidx.annotation.Keep;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.services.uploadingManager.models.DataUploadManagerConfig;
import me.oriient.internal.services.uploadingManager.models.DataUploadMode;
import me.oriient.internal.services.uploadingManager.models.DataUploaderDataType;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.internal.services.uploadingManager.rest.DataUploaderRestImpl;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lme/oriient/internal/services/uploadingManager/DataUploadManagerFactoryImpl;", "Lme/oriient/internal/services/uploadingManager/DataUploadManagerFactory;", "sdkType", "", MlModel.MODEL_FILE_SUFFIX, "Lme/oriient/internal/services/uploadingManager/models/DataUploadManagerConfig;", "uploadingMode", "Lme/oriient/internal/services/uploadingManager/models/DataUploadMode;", "scheduledWork", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;", "(Ljava/lang/String;Lme/oriient/internal/services/uploadingManager/models/DataUploadManagerConfig;Lme/oriient/internal/services/uploadingManager/models/DataUploadMode;Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;)V", "itemsUploaded", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;", "getItemsUploaded", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "createUploadManager", "Lme/oriient/internal/services/uploadingManager/DataUploadManager;", "chunkFileHeader", "", "dataType", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DataUploadManagerFactoryImpl implements DataUploadManagerFactory {

    @NotNull
    private final DataUploadManagerConfig config;

    @NotNull
    private final MutableSharedFlow<DataUploaderItem> itemsUploaded;

    @NotNull
    private final DataUploadScheduledWork scheduledWork;

    @NotNull
    private final String sdkType;

    @NotNull
    private final DataUploadMode uploadingMode;

    public DataUploadManagerFactoryImpl(@NotNull String sdkType, @NotNull DataUploadManagerConfig config, @NotNull DataUploadMode uploadingMode, @NotNull DataUploadScheduledWork scheduledWork) {
        Intrinsics.h(sdkType, "sdkType");
        Intrinsics.h(config, "config");
        Intrinsics.h(uploadingMode, "uploadingMode");
        Intrinsics.h(scheduledWork, "scheduledWork");
        this.sdkType = sdkType;
        this.config = config;
        this.uploadingMode = uploadingMode;
        this.scheduledWork = scheduledWork;
        this.itemsUploaded = SharedFlowKt.b(0, 0, null, 7);
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploadManagerFactory
    @NotNull
    public DataUploadManager createUploadManager(@Nullable byte[] chunkFileHeader, @NotNull DataUploaderDataType dataType) {
        Intrinsics.h(dataType, "dataType");
        StringBuilder sb = new StringBuilder();
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        sb.append(((ContextProvider) di.get(reflectionFactory.b(ContextProvider.class))).getContext().getFilesDir().getAbsolutePath());
        DataUploaderFilesManagerImpl dataUploaderFilesManagerImpl = new DataUploaderFilesManagerImpl(YU.a.o(sb, File.separator, "sessions"));
        return new C1536n(dataUploaderFilesManagerImpl, (DataUploaderItemsStorage) InternalDiKt.getDi().get(reflectionFactory.b(DataUploaderItemsStorage.class)), new DataUploaderImpl(new DataUploaderRestImpl(this.sdkType), dataUploaderFilesManagerImpl, new DataUploaderEventsReporterImpl(), dataType, this.uploadingMode, getItemsUploaded()), new DataUploaderStatisticsReporterImpl(dataUploaderFilesManagerImpl), dataType, this.config, chunkFileHeader, this.uploadingMode, this.scheduledWork);
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploadManagerFactory
    @NotNull
    public MutableSharedFlow<DataUploaderItem> getItemsUploaded() {
        return this.itemsUploaded;
    }
}
