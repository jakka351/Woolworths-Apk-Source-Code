package me.oriient.positioningengine.support;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.services.uploadingManager.DataUploadManager;

/* loaded from: classes8.dex */
public final class B implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl f26496a;

    public B(OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl) {
        this.f26496a = onDeviceSessionsUploadManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        if (!((Boolean) obj).booleanValue()) {
            this.f26496a.sensorsDataUploader.moveCurrentSessionToUploading();
            DataUploadManager dataUploadManager = this.f26496a.positionsDataUploader;
            if (dataUploadManager != null) {
                dataUploadManager.moveCurrentSessionToUploading();
            }
            DataUploadManager dataUploadManager2 = this.f26496a.systemEventsDataUploader;
            if (dataUploadManager2 != null) {
                dataUploadManager2.moveCurrentSessionToUploading();
            }
        }
        return Unit.f24250a;
    }
}
