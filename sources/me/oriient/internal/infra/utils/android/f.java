package me.oriient.internal.infra.utils.android;

import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.android.appState.AppStateProvider;
import me.oriient.internal.infra.utils.core.AbstractActiveProcessManager;
import me.oriient.internal.infra.utils.core.Logger;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f extends AbstractActiveProcessManager implements AndroidPermissionManager {

    @NotNull
    private static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f24993a = LazyKt.b(new b(this));
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public Job e;
    public final Lazy f;

    public f() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.b = di.inject(reflectionFactory.b(Logger.class));
        this.c = InternalDiKt.getDi().inject(reflectionFactory.b(SystemPermissionChecker.class));
        this.d = InternalDiKt.getDi().inject(reflectionFactory.b(AppStateProvider.class));
        this.f = LazyKt.b(e.f24992a);
    }

    public final void a() {
        ((Logger) this.b.getD()).d("AndroidPermissionManage", "updatePermissions() called");
        ((MutableStateFlow) this.f24993a.getD()).setValue(Boolean.valueOf(((SystemPermissionChecker) this.c.getD()).isLocationPermissionGranted()));
        ((Logger) this.b.getD()).d("AndroidPermissionManage", "updatePermissions - location granted: " + ((Boolean) ((MutableStateFlow) this.f24993a.getD()).getValue()).booleanValue());
    }

    @Override // me.oriient.internal.infra.utils.core.AbstractActiveProcessManager
    public final CoroutineScope getSingleThreadedCoroutineScope() {
        return (CoroutineScope) this.f.getD();
    }

    @Override // me.oriient.internal.infra.utils.android.AndroidPermissionManager
    public final StateFlow isLocationPermissionGranted() {
        return (MutableStateFlow) this.f24993a.getD();
    }

    @Override // me.oriient.internal.infra.utils.core.AbstractActiveProcessManager
    public final void onDisabled(Object obj) {
        ((Logger) this.b.getD()).d("AndroidPermissionManage", "onDisabled() called");
        Job job = this.e;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.e = null;
    }

    @Override // me.oriient.internal.infra.utils.core.AbstractActiveProcessManager
    public final void onEnabled(Object obj) {
        ((Logger) this.b.getD()).d("AndroidPermissionManage", "onEnabled() called");
        Job jobC = BuildersKt.c((CoroutineScope) this.f.getD(), null, null, new d(this, null), 3);
        Job job = this.e;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.e = jobC;
        a();
    }
}
