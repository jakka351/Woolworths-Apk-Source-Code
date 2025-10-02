package me.oriient.internal.services.uploadingManager;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J6\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0016J>\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lme/oriient/internal/services/uploadingManager/DataUploaderEventsReporterImpl;", "Lme/oriient/internal/services/uploadingManager/DataUploaderEventsReporter;", "()V", "eLog", "Lme/oriient/internal/services/elog/ELog;", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "Lkotlin/Lazy;", "reportEvent", "", "tag", "", "message", "item", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;", "additionalData", "", "", "reportFailure", "error", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DataUploaderEventsReporterImpl implements DataUploaderEventsReporter {

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog = InternalDiKt.getDi().inject(Reflection.f24268a.b(ELog.class));

    private final ELog getELog() {
        return (ELog) this.eLog.getD();
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderEventsReporter
    public void reportEvent(@NotNull String tag, @NotNull String message, @NotNull DataUploaderItem item, @NotNull Map<String, ? extends Object> additionalData) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(item, "item");
        Intrinsics.h(additionalData, "additionalData");
        getELog().i(tag, "Uploading event", new C1537o(message, item, additionalData));
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderEventsReporter
    public void reportFailure(@NotNull String tag, @NotNull String message, @NotNull DataUploaderItem item, @NotNull String error, @NotNull Map<String, ? extends Object> additionalData) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(item, "item");
        Intrinsics.h(error, "error");
        Intrinsics.h(additionalData, "additionalData");
        getELog().e(tag, "Uploading failure", new C1538p(message, item, error, additionalData));
    }
}
