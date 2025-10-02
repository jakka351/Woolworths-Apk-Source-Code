package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements CallbackToFutureAdapter.Resolver, Continuation {
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.h = obj5;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(final CallbackToFutureAdapter.Completer completer) {
        Executor executor = (Executor) this.d;
        final Tracer tracer = (Tracer) this.e;
        final String str = (String) this.f;
        final Function0 function0 = (Function0) this.g;
        final MutableLiveData mutableLiveData = (MutableLiveData) this.h;
        executor.execute(new Runnable() { // from class: androidx.work.c
            @Override // java.lang.Runnable
            public final void run() {
                String str2 = str;
                Function0 function02 = function0;
                MutableLiveData mutableLiveData2 = mutableLiveData;
                CallbackToFutureAdapter.Completer completer2 = completer;
                Tracer tracer2 = tracer;
                boolean zIsEnabled = tracer2.isEnabled();
                if (zIsEnabled) {
                    try {
                        tracer2.a(str2);
                    } finally {
                        if (zIsEnabled) {
                            tracer2.b();
                        }
                    }
                }
                try {
                    function02.invoke();
                    Operation.State.SUCCESS success = Operation.f3906a;
                    mutableLiveData2.j(success);
                    completer2.b(success);
                } catch (Throwable th) {
                    mutableLiveData2.j(new Operation.State.FAILURE(th));
                    completer2.d(th);
                }
            }
        });
        return Unit.f24250a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ConfigFetchHandler configFetchHandler = (ConfigFetchHandler) this.d;
        Task task2 = (Task) this.e;
        Task task3 = (Task) this.f;
        Date date = (Date) this.g;
        HashMap map = (HashMap) this.h;
        int[] iArr = ConfigFetchHandler.k;
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task2.getException()));
        }
        if (!task3.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task3.getException()));
        }
        try {
            ConfigFetchHandler.FetchResponse fetchResponseA = configFetchHandler.a((String) task2.getResult(), ((InstallationTokenResult) task3.getResult()).b(), date, map);
            return fetchResponseA.f() != 0 ? Tasks.forResult(fetchResponseA) : configFetchHandler.f.d(fetchResponseA.d()).onSuccessTask(configFetchHandler.c, new au.com.woolworths.product.details.epoxy.a(fetchResponseA, 22));
        } catch (FirebaseRemoteConfigException e) {
            return Tasks.forException(e);
        }
    }
}
