package me.oriient.internal.infra.observable.java;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0002\u0010\tJ\r\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lme/oriient/internal/infra/observable/java/FlowObservableProperty;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/internal/infra/observable/java/ObservableProperty;", "defaultValue", "observableFlow", "(Ljava/lang/Object;Lme/oriient/internal/infra/observable/java/ObservableProperty;)V", "emit", "", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "observe", "Lme/oriient/internal/infra/observable/java/ObservableOperation;", "observer", "Lme/oriient/internal/infra/observable/java/ObservableListener;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FlowObservableProperty<T> implements ObservableProperty<T> {

    @NotNull
    private final ObservableProperty<T> observableFlow;

    public FlowObservableProperty(T t, @NotNull ObservableProperty<T> observableFlow) {
        Intrinsics.h(observableFlow, "observableFlow");
        this.observableFlow = observableFlow;
    }

    public final void emit(T value) {
        ObservableProperty<T> observableProperty = this.observableFlow;
        if (observableProperty instanceof FlowObservableProperty) {
            ((FlowObservableProperty) observableProperty).emit(value);
        }
    }

    @Override // me.oriient.internal.infra.observable.java.ObservableProperty
    public T getValue() {
        return this.observableFlow.getValue();
    }

    @Override // me.oriient.internal.infra.observable.java.ObservableProperty
    @NotNull
    public ObservableOperation observe(@NotNull ObservableListener<T> observer) {
        Intrinsics.h(observer, "observer");
        return new ObservableOperationJob(BuildersKt.c(c.f24973a, c.b, null, new b(this, observer, null), 2));
    }

    public /* synthetic */ FlowObservableProperty(Object obj, ObservableProperty observableProperty, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? new FlowObservableProperty(obj, null, 2, 0 == true ? 1 : 0) : observableProperty);
    }
}
