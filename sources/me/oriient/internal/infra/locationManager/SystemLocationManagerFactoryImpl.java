package me.oriient.internal.infra.locationManager;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lme/oriient/internal/infra/locationManager/SystemLocationManagerFactoryImpl;", "Lme/oriient/internal/infra/locationManager/SystemLocationManagerFactory;", "()V", "contextProvider", "Lme/oriient/internal/infra/utils/android/ContextProvider;", "getContextProvider", "()Lme/oriient/internal/infra/utils/android/ContextProvider;", "contextProvider$delegate", "Lkotlin/Lazy;", "timeProvider", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "getTimeProvider", "()Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider$delegate", "create", "Lme/oriient/internal/infra/locationManager/SystemLocationManager;", "createReadOnly", "Lme/oriient/internal/infra/locationManager/ReadOnlySystemLocationManager;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SystemLocationManagerFactoryImpl implements SystemLocationManagerFactory {

    /* renamed from: contextProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy contextProvider;

    /* renamed from: timeProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeProvider;

    public SystemLocationManagerFactoryImpl() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.contextProvider = di.inject(reflectionFactory.b(ContextProvider.class));
        this.timeProvider = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContextProvider getContextProvider() {
        return (ContextProvider) this.contextProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TimeProvider getTimeProvider() {
        return (TimeProvider) this.timeProvider.getD();
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManagerFactory
    @NotNull
    public SystemLocationManager create() {
        return new ProxyLocationManager(new P(this), new Q(this), null, 4, null);
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManagerFactory
    @NotNull
    public ReadOnlySystemLocationManager createReadOnly() {
        return new ProxyLocationManager(new T(this), new U(this), null, 4, null);
    }
}
