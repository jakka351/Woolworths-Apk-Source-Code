package me.oriient.internal.infra.observable;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0011\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007J\"\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000eH\u0096@¢\u0006\u0002\u0010\u000fR\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lme/oriient/internal/infra/observable/ErrorObservable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/internal/infra/observable/ObservableEvent;", "Lme/oriient/internal/infra/observable/ObservableProperty;", "error", "Ljava/lang/Error;", "Lkotlin/Error;", "(Ljava/lang/Error;)V", "value", "getValue", "()Ljava/lang/Object;", "observe", "", "observer", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ErrorObservable<T> implements ObservableEvent<T>, ObservableProperty<T> {

    @NotNull
    private final Error error;

    public ErrorObservable(@NotNull Error error) {
        Intrinsics.h(error, "error");
        this.error = error;
    }

    @Override // me.oriient.internal.infra.observable.ObservableProperty
    public T getValue() {
        throw this.error;
    }

    @Override // me.oriient.internal.infra.observable.ObservableEvent, me.oriient.internal.infra.observable.ObservableProperty
    @Nullable
    public Object observe(@NotNull Function1<? super T, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        throw this.error;
    }
}
