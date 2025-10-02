package androidx.work;

import android.os.Trace;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.adobe.marketing.mobile.AdobeCallback;
import com.adobe.marketing.mobile.ExtensionApi;
import com.adobe.marketing.mobile.internal.configuration.ConfigurationRulesManager;
import com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult;
import com.adobe.marketing.mobile.services.Log;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements CallbackToFutureAdapter.Resolver, AdobeCallback, SynchronizationGuard.CriticalSection, SuccessContinuation, Continuation, ComponentFactory {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // com.adobe.marketing.mobile.AdobeCallback, com.adobe.marketing.mobile.EventHistoryResultHandler
    public void a(Object obj) {
        ConfigurationRulesManager this$0 = (ConfigurationRulesManager) this.e;
        ExtensionApi extensionApi = (ExtensionApi) this.f;
        RulesLoadResult rulesLoadResult = (RulesLoadResult) obj;
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(extensionApi, "$extensionApi");
        RulesLoadResult.Reason reason = rulesLoadResult.b;
        reason.toString();
        Log.c();
        if (reason == RulesLoadResult.Reason.h) {
            Log.a();
        } else {
            Log.c();
            this$0.b(rulesLoadResult.f13202a, extensionApi);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(final CallbackToFutureAdapter.Completer completer) {
        Executor executor = (Executor) this.e;
        final ?? r1 = (Lambda) this.f;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.a(new androidx.compose.material.ripple.a(atomicBoolean, 5), DirectExecutor.d);
        executor.execute(new Runnable(atomicBoolean, completer, r1) { // from class: androidx.work.e
            public final /* synthetic */ AtomicBoolean d;
            public final /* synthetic */ CallbackToFutureAdapter.Completer e;
            public final /* synthetic */ Lambda f;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f = (Lambda) r1;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
            @Override // java.lang.Runnable
            public final void run() {
                CallbackToFutureAdapter.Completer completer2 = this.e;
                ?? r12 = this.f;
                if (this.d.get()) {
                    return;
                }
                try {
                    completer2.b(r12.invoke());
                } catch (Throwable th) {
                    completer2.d(th);
                }
            }
        });
        return Unit.f24250a;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object b(ComponentContainer componentContainer) {
        String str = (String) this.e;
        Component component = (Component) this.f;
        try {
            Trace.beginSection(str);
            return component.f.b(componentContainer);
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        switch (this.d) {
            case 2:
                ((Uploader) this.e).c.Z0((Iterable) this.f);
                break;
            default:
                Uploader uploader = (Uploader) this.e;
                Iterator it = ((HashMap) this.f).entrySet().iterator();
                while (it.hasNext()) {
                    uploader.i.c(((Integer) r2.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ConfigCacheClient configCacheClient = (ConfigCacheClient) this.e;
        ConfigContainer configContainer = (ConfigContainer) this.f;
        HashMap map = ConfigCacheClient.d;
        synchronized (configCacheClient) {
            configCacheClient.c = Tasks.forResult(configContainer);
        }
        return Tasks.forResult(configContainer);
    }

    public /* synthetic */ d(String str, ConfigurationRulesManager configurationRulesManager, ExtensionApi extensionApi) {
        this.d = 1;
        this.e = configurationRulesManager;
        this.f = extensionApi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d(Executor executor, Function0 function0) {
        this.d = 0;
        this.e = executor;
        this.f = (Lambda) function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d1 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #10 {all -> 0x0056, blocks: (B:11:0x003f, B:13:0x0042, B:14:0x0043, B:22:0x005f, B:62:0x00cd, B:64:0x00d1, B:66:0x00d4, B:70:0x00d8, B:71:0x00d9, B:65:0x00d2), top: B:165:0x001b, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d9 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #10 {all -> 0x0056, blocks: (B:11:0x003f, B:13:0x0042, B:14:0x0043, B:22:0x005f, B:62:0x00cd, B:64:0x00d1, B:66:0x00d4, B:70:0x00d8, B:71:0x00d9, B:65:0x00d2), top: B:165:0x001b, inners: #9 }] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v40, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v6, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // com.google.android.gms.tasks.Continuation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object then(com.google.android.gms.tasks.Task r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.d.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}
