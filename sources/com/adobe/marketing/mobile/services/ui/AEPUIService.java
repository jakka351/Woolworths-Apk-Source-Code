package com.adobe.marketing.mobile.services.ui;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/AEPUIService;", "Lcom/adobe/marketing/mobile/services/ui/UIService;", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AEPUIService implements UIService {

    /* renamed from: a, reason: collision with root package name */
    public final AEPUIService$special$$inlined$CoroutineExceptionHandler$1 f13249a = new AEPUIService$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.d);
    public final Lazy b = LazyKt.b(new Function0<CoroutineScope>() { // from class: com.adobe.marketing.mobile.services.ui.AEPUIService$mainScope$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f24726a;
            CompletableJob completableJobB = SupervisorKt.b();
            mainCoroutineDispatcher.getClass();
            return CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c(mainCoroutineDispatcher, completableJobB).plus(this.h.f13249a));
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/AEPUIService$Companion;", "", "", "LOG_TAG", "Ljava/lang/String;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }
}
