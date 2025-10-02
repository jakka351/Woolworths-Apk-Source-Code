package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry;", "", "CallbackAndContract", "Companion", "LifecycleContainer", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f76a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;", "O", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CallbackAndContract<O> {

        /* renamed from: a, reason: collision with root package name */
        public final ActivityResultCallback f77a;
        public final ActivityResultContract b;

        public CallbackAndContract(ActivityResultContract contract, ActivityResultCallback callback) {
            Intrinsics.h(callback, "callback");
            Intrinsics.h(contract, "contract");
            this.f77a = callback;
            this.b = contract;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$Companion;", "", "", "INITIAL_REQUEST_CODE_VALUE", "I", "", "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", "Ljava/lang/String;", "KEY_COMPONENT_ACTIVITY_PENDING_RESULTS", "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", "LOG_TAG", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$LifecycleContainer;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class LifecycleContainer {

        /* renamed from: a, reason: collision with root package name */
        public final Lifecycle f78a;
        public final ArrayList b = new ArrayList();

        public LifecycleContainer(Lifecycle lifecycle) {
            this.f78a = lifecycle;
        }
    }

    public final void a(int i, Object obj) {
        String str = (String) this.f76a.get(Integer.valueOf(i));
        if (str == null) {
            return;
        }
        CallbackAndContract callbackAndContract = (CallbackAndContract) this.e.get(str);
        if ((callbackAndContract != null ? callbackAndContract.f77a : null) == null) {
            this.g.remove(str);
            this.f.put(str, obj);
            return;
        }
        ActivityResultCallback activityResultCallback = callbackAndContract.f77a;
        Intrinsics.f(activityResultCallback, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (this.d.remove(str)) {
            activityResultCallback.a(obj);
        }
    }

    public final boolean b(int i, int i2, Intent intent) {
        String str = (String) this.f76a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        CallbackAndContract callbackAndContract = (CallbackAndContract) this.e.get(str);
        if ((callbackAndContract != null ? callbackAndContract.f77a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                callbackAndContract.f77a.a(callbackAndContract.b.parseResult(i2, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new ActivityResult(i2, intent));
        return true;
    }

    public abstract void c(int i, ActivityResultContract activityResultContract, Object obj, ActivityOptionsCompat activityOptionsCompat);

    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.activity.result.ActivityResultRegistry$register$2] */
    public final ActivityResultRegistry$register$2 d(final String key, LifecycleOwner lifecycleOwner, final ActivityResultContract contract, final ActivityResultCallback callback) {
        Intrinsics.h(key, "key");
        Intrinsics.h(contract, "contract");
        Intrinsics.h(callback, "callback");
        Lifecycle lifecycle = lifecycleOwner.getD();
        if (lifecycle.getD().compareTo(Lifecycle.State.g) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getD() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        f(key);
        LinkedHashMap linkedHashMap = this.c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) linkedHashMap.get(key);
        if (lifecycleContainer == null) {
            lifecycleContainer = new LifecycleContainer(lifecycle);
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.activity.result.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void T(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                ActivityResultRegistry activityResultRegistry = this.d;
                LinkedHashMap linkedHashMap2 = activityResultRegistry.e;
                Lifecycle.Event event2 = Lifecycle.Event.ON_START;
                String str = key;
                if (event2 != event) {
                    if (Lifecycle.Event.ON_STOP == event) {
                        linkedHashMap2.remove(str);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY == event) {
                            activityResultRegistry.g(str);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = activityResultRegistry.g;
                LinkedHashMap linkedHashMap3 = activityResultRegistry.f;
                ActivityResultContract activityResultContract = contract;
                ActivityResultCallback activityResultCallback = callback;
                linkedHashMap2.put(str, new ActivityResultRegistry.CallbackAndContract(activityResultContract, activityResultCallback));
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    activityResultCallback.a(obj);
                }
                ActivityResult activityResult = (ActivityResult) BundleCompat.a(bundle, str, ActivityResult.class);
                if (activityResult != null) {
                    bundle.remove(str);
                    activityResultCallback.a(activityResultContract.parseResult(activityResult.d, activityResult.e));
                }
            }
        };
        lifecycleContainer.f78a.a(lifecycleEventObserver);
        lifecycleContainer.b.add(lifecycleEventObserver);
        linkedHashMap.put(key, lifecycleContainer);
        return new ActivityResultLauncher<Object>() { // from class: androidx.activity.result.ActivityResultRegistry$register$2
            @Override // androidx.activity.result.ActivityResultLauncher
            public final void a(Object obj, ActivityOptionsCompat activityOptionsCompat) throws Exception {
                ActivityResultRegistry activityResultRegistry = this.f79a;
                ArrayList arrayList = activityResultRegistry.d;
                LinkedHashMap linkedHashMap2 = activityResultRegistry.b;
                String str = key;
                Object obj2 = linkedHashMap2.get(str);
                ActivityResultContract activityResultContract = contract;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    activityResultRegistry.c(iIntValue, activityResultContract, obj, activityOptionsCompat);
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public final void b() {
                this.f79a.g(key);
            }
        };
    }

    public final ActivityResultRegistry$register$3 e(String key, ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        Intrinsics.h(key, "key");
        f(key);
        this.e.put(key, new CallbackAndContract(activityResultContract, activityResultCallback));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            activityResultCallback.a(obj);
        }
        Bundle bundle = this.g;
        ActivityResult activityResult = (ActivityResult) BundleCompat.a(bundle, key, ActivityResult.class);
        if (activityResult != null) {
            bundle.remove(key);
            activityResultCallback.a(activityResultContract.parseResult(activityResult.d, activityResult.e));
        }
        return new ActivityResultRegistry$register$3(this, key, activityResultContract);
    }

    public final void f(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = ((ConstrainedOnceSequence) SequencesKt.n(ActivityResultRegistry$generateRandomNumber$1.h)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f76a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void g(String key) {
        Integer num;
        Intrinsics.h(key, "key");
        if (!this.d.contains(key) && (num = (Integer) this.b.remove(key)) != null) {
            this.f76a.remove(num);
        }
        this.e.remove(key);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder sbU = YU.a.u("Dropping pending result for request ", key, ": ");
            sbU.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", sbU.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((ActivityResult) BundleCompat.a(bundle, key, ActivityResult.class)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) linkedHashMap2.get(key);
        if (lifecycleContainer != null) {
            ArrayList arrayList = lifecycleContainer.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                lifecycleContainer.f78a.c((LifecycleEventObserver) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
