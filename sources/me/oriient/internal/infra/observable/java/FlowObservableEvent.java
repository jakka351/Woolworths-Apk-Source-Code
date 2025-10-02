package me.oriient.internal.infra.observable.java;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lme/oriient/internal/infra/observable/java/FlowObservableEvent;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/internal/infra/observable/java/ObservableEvent;", "observableFlow", "(Lme/oriient/internal/infra/observable/java/ObservableEvent;)V", "emit", "", "value", "(Ljava/lang/Object;)V", "observe", "Lme/oriient/internal/infra/observable/java/ObservableOperation;", "observer", "Lme/oriient/internal/infra/observable/java/ObservableListener;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FlowObservableEvent<T> implements ObservableEvent<T> {

    @NotNull
    private final ObservableEvent<T> observableFlow;

    public FlowObservableEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void emit(T value) {
        ObservableEvent<T> observableEvent = this.observableFlow;
        if (observableEvent instanceof FlowObservableEvent) {
            ((FlowObservableEvent) observableEvent).emit(value);
        }
    }

    @Override // me.oriient.internal.infra.observable.java.ObservableEvent
    @NotNull
    public ObservableOperation observe(@NotNull ObservableListener<T> observer) {
        Intrinsics.h(observer, "observer");
        return new ObservableOperationJob(BuildersKt.c(c.f24973a, c.b, null, new a(this, observer, null), 2));
    }

    public FlowObservableEvent(@NotNull ObservableEvent<T> observableFlow) {
        Intrinsics.h(observableFlow, "observableFlow");
        this.observableFlow = observableFlow;
    }

    public /* synthetic */ FlowObservableEvent(ObservableEvent observableEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new FlowObservableEvent(null, 1, 0 == true ? 1 : 0) : observableEvent);
    }
}
