package au.com.woolworths.android.onesite.featuretoggles;

import android.content.pm.PackageManager;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.RemoteConfigKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import timber.log.Timber;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnCompleteListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ FeatureToggleManagerBaseImpl e;

    public /* synthetic */ a(FeatureToggleManagerBaseImpl featureToggleManagerBaseImpl, int i) {
        this.d = i;
        this.e = featureToggleManagerBaseImpl;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.d) {
            case 0:
                Intrinsics.h(task, "task");
                boolean zIsSuccessful = task.isSuccessful();
                FeatureToggleManagerBaseImpl featureToggleManagerBaseImpl = this.e;
                if (zIsSuccessful) {
                    FirebaseRepository firebaseRepository = featureToggleManagerBaseImpl.f4254a;
                    try {
                        long jB = firebaseRepository.b();
                        long j = featureToggleManagerBaseImpl.d;
                        if (j != jB) {
                            firebaseRepository.a(j);
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Timber.f27013a.f(e);
                    }
                    featureToggleManagerBaseImpl.e.a().addOnCompleteListener(new a(featureToggleManagerBaseImpl, 1));
                    break;
                } else {
                    if (featureToggleManagerBaseImpl.b.isConnected()) {
                        Timber.f27013a.f(task.getException());
                    }
                    featureToggleManagerBaseImpl.n.setValue(RemoteConfigSyncState.d);
                    break;
                }
            case 1:
                Intrinsics.h(task, "it");
                FeatureToggleManagerBaseImpl featureToggleManagerBaseImpl2 = this.e;
                MutableStateFlow mutableStateFlow = featureToggleManagerBaseImpl2.n;
                FirebaseRemoteConfig firebaseRemoteConfig = featureToggleManagerBaseImpl2.e;
                mutableStateFlow.setValue(RemoteConfigSyncState.e);
                for (Map.Entry entry : featureToggleManagerBaseImpl2.l.entrySet()) {
                    MutableStateFlow mutableStateFlow2 = (MutableStateFlow) entry.getValue();
                    Object key = entry.getKey();
                    Intrinsics.g(key, "<get-key>(...)");
                    mutableStateFlow2.setValue(RemoteConfigKt.a(firebaseRemoteConfig, (String) key).asString());
                }
                MutableStateFlow mutableStateFlow3 = featureToggleManagerBaseImpl2.f;
                HashMap mapC = firebaseRemoteConfig.c();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry2 : mapC.entrySet()) {
                    if (((FirebaseRemoteConfigValue) entry2.getValue()).g() == 2) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getKey());
                }
                mutableStateFlow3.setValue(arrayList);
                break;
            default:
                Intrinsics.h(task, "it");
                this.e.activate();
                break;
        }
    }
}
