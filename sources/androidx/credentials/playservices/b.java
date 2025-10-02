package androidx.credentials.playservices;

import android.os.CancellationSignal;
import androidx.credentials.CredentialManagerCallback;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Listener;
import com.salesforce.marketingcloud.sfmcsdk.modules.Config;
import com.salesforce.marketingcloud.sfmcsdk.modules.Module;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.internal.services.dataManager.building.Floor;
import me.oriient.ipssdk.api.models.IPSCancelable;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.realtime.ips.Proximity;
import me.oriient.ipssdk.realtime.ofs.J4;
import me.oriient.ipssdk.realtime.ofs.K4;
import me.oriient.ipssdk.realtime.services.rest.IRegionsListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements OnFailureListener, Listener, ModuleReadyListener, K4 {
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4) {
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
    }

    @Override // me.oriient.ipssdk.realtime.ofs.K4
    public IPSCancelable a(J4 j4) {
        return Proximity.a((User) this.d, (Floor) this.e, (Building) this.f, (IRegionsListener) this.g, j4);
    }

    @Override // com.google.firebase.firestore.util.Listener
    public void c(com.google.firebase.firestore.auth.User user) {
        FirestoreClient firestoreClient = (FirestoreClient) this.d;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.e;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f;
        AsyncQueue asyncQueue = (AsyncQueue) this.g;
        if (!atomicBoolean.compareAndSet(false, true)) {
            asyncQueue.b(new com.google.firebase.firestore.core.b(firestoreClient, user, 2));
        } else {
            Assert.b(!taskCompletionSource.getTask().isComplete(), "Already fulfilled first user task", new Object[0]);
            taskCompletionSource.setResult(user);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        CredentialProviderPlayServicesImpl.onClearCredential$lambda$2((CredentialProviderPlayServicesImpl) this.d, (CancellationSignal) this.e, (Executor) this.f, (CredentialManagerCallback) this.g, exc);
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener
    public void ready(ModuleInterface moduleInterface) {
        Module.AnonymousClass1.m267execute$lambda2((Module.AnonymousClass1) this.d, (Module) this.e, (Config) this.f, (ModuleReadyListener) this.g, moduleInterface);
    }
}
