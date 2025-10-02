package me.oriient.positioningengine.ondevice.ml;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.positioningengine.common.DiKt;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lme/oriient/positioningengine/ondevice/ml/MlModelFactory;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "<init>", "()V", "Lme/oriient/positioningengine/ondevice/ml/MlModel;", "createModel", "()Lme/oriient/positioningengine/ondevice/ml/MlModel;", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Companion", "me/oriient/positioningengine/ondevice/ml/g", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MlModelFactory implements DiProvidable {

    @NotNull
    private static final g Companion = new g();

    @NotNull
    private static final String TAG = "MlModelFactory";

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger = DiKt.getDi().inject(Reflection.f24268a.b(Logger.class));

    private final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    @NotNull
    public final MlModel createModel() {
        getLogger().d(TAG, "createModel() called");
        return new z();
    }
}
