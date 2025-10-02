package com.adobe.marketing.mobile;

import androidx.compose.ui.graphics.colorspace.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension;
import com.adobe.marketing.mobile.services.Log;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/MobileCoreInitializer;", "", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MobileCoreInitializer {
    public static final Function1 f = null;
    public static final MobileCoreInitializer g;

    /* renamed from: a, reason: collision with root package name */
    public final ContextScope f13162a;
    public final LifecycleOwner b;
    public final Function1 c;
    public final AtomicBoolean d;
    public final MutexImpl e;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/adobe/marketing/mobile/MobileCoreInitializer$Companion;", "", "Lcom/adobe/marketing/mobile/MobileCoreInitializer;", "INSTANCE", "Lcom/adobe/marketing/mobile/MobileCoreInitializer;", "", "LOG_TAG", "Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/Function1;", "Landroid/app/Application;", "", "isUserUnlocked", "Lkotlin/jvm/functions/Function1;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    static {
        MobileCoreInitializer$special$$inlined$CoroutineExceptionHandler$1 mobileCoreInitializer$special$$inlined$CoroutineExceptionHandler$1 = new MobileCoreInitializer$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.d);
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f;
        CompletableJob completableJobB = SupervisorKt.b();
        defaultIoScheduler.getClass();
        g = new MobileCoreInitializer(CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c(defaultIoScheduler, completableJobB).plus(mobileCoreInitializer$special$$inlined$CoroutineExceptionHandler$1)), MainDispatcherLoader.f24726a.T(), ProcessLifecycleOwner.l, new ExtensionDiscovery());
    }

    public MobileCoreInitializer(ContextScope contextScope, MainCoroutineDispatcher mainDispatcher, LifecycleOwner lifecycleOwner, ExtensionDiscovery extensionDiscovery) {
        Intrinsics.h(mainDispatcher, "mainDispatcher");
        Intrinsics.h(lifecycleOwner, "lifecycleOwner");
        this.f13162a = contextScope;
        this.b = lifecycleOwner;
        this.c = MobileCoreInitializer$Companion$isUserUnlocked$1.h;
        this.d = new AtomicBoolean(false);
        new AtomicBoolean(false);
        this.e = MutexKt.a();
    }

    public final void a(List list, a aVar) {
        if (!this.d.get()) {
            Log.b("MobileCore", "MobileCoreInitializer", "Failed to registerExtensions - setApplication not called", new Object[0]);
            return;
        }
        LinkedHashSet linkedHashSetF = SetsKt.f(ConfigurationExtension.class);
        linkedHashSetF.addAll(CollectionsKt.B(list));
        BuildersKt.c(this.f13162a, null, null, new MobileCoreInitializer$registerExtensions$2(this, linkedHashSetF, aVar, null), 3);
    }
}
