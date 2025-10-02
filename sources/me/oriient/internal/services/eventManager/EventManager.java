package me.oriient.internal.services.eventManager;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.infra.serializerJson.Jsonable;
import me.oriient.internal.services.eventManager.model.EventError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J¯\u0001\u0010\n\u001a\u00020\b\"\b\b\u0000\u0010\u000b*\u00020\f\"\b\b\u0001\u0010\r*\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u000b2\u0006\u0010\u0011\u001a\u0002H\r26\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\b0\u00132<\u0010\u0017\u001a8\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0018H&¢\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000fH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001c"}, d2 = {"Lme/oriient/internal/services/eventManager/EventManager;", "", "state", "Lkotlinx/coroutines/flow/StateFlow;", "Lme/oriient/internal/services/eventManager/EventManagerState;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "connect", "", "disconnect", "sendEvent", "Data", "Lme/oriient/internal/infra/serializerJson/Jsonable;", "Parameters", "topic", "", "data", "parameters", "onSuccess", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "requestId", "onFailure", "Lkotlin/Function3;", "Lme/oriient/internal/services/eventManager/model/EventError;", "(Ljava/lang/String;Lme/oriient/internal/infra/serializerJson/Jsonable;Lme/oriient/internal/infra/serializerJson/Jsonable;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "setSenderName", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface EventManager {
    void connect();

    void disconnect();

    @NotNull
    StateFlow<EventManagerState> getState();

    <Data extends Jsonable, Parameters extends Jsonable> void sendEvent(@NotNull String topic, @NotNull Data data, @NotNull Parameters parameters, @NotNull Function2<? super String, ? super String, Unit> onSuccess, @NotNull Function3<? super String, ? super String, ? super EventError, Unit> onFailure);

    void setSenderName(@Nullable String name);
}
