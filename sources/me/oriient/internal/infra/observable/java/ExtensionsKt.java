package me.oriient.internal.infra.observable.java;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"asJava", "Lme/oriient/internal/infra/observable/java/ObservableEvent;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/internal/infra/observable/java/ObservableProperty;", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtensionsKt {
    @Keep
    @NotNull
    public static final <T> ObservableProperty<T> asJava(@NotNull ObservableProperty<T> observableProperty) {
        Intrinsics.h(observableProperty, "<this>");
        return new FlowObservableProperty(observableProperty.getValue(), observableProperty);
    }

    @Keep
    @NotNull
    public static final <T> ObservableEvent<T> asJava(@NotNull ObservableEvent<T> observableEvent) {
        Intrinsics.h(observableEvent, "<this>");
        return new FlowObservableEvent(observableEvent);
    }
}
