package au.com.woolworths.feature.shared.instore.wifi.ui;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.work.WorkInfo;
import au.com.woolworths.analytics.supers.signup.SignupAnalytics;
import au.com.woolworths.feature.shop.signup.SignUpActivity;
import au.com.woolworths.feature.shop.signup.SignUpViewModel;
import au.com.woolworths.feature.shop.signup.data.SignUpError;
import au.com.woolworths.shop.lists.data.sync.SyncResult;
import au.com.woolworths.shop.lists.data.sync.scheduler.SyncScheduler;
import au.com.woolworths.shop.lists.data.sync.scheduler.WorkData;
import coil3.disk.DiskLruCache;
import com.cisco.or.sdk.OpenRoaming;
import com.cisco.or.sdk.enums.SigningState;
import com.google.firebase.datastorage.JavaDataStorage;
import com.google.firebase.sessions.SessionData;
import com.google.firebase.sessions.SessionDataSerializer;
import com.woolworths.R;
import java.io.IOException;
import java.io.SyncFailedException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.sync.MutexImpl;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        int i = 1;
        switch (this.d) {
            case 0:
                InStoreWifiInteractorImpl inStoreWifiInteractorImpl = (InStoreWifiInteractorImpl) this.e;
                Function1 handler = (Function1) it;
                Intrinsics.h(handler, "handler");
                OpenRoaming.f14038a.f(inStoreWifiInteractorImpl.f6527a, inStoreWifiInteractorImpl.i, new d(handler, i));
                return Unit.f24250a;
            case 1:
                Function1 function1 = (Function1) this.e;
                SigningState signingState = (SigningState) it;
                Intrinsics.h(signingState, "signingState");
                function1.invoke(signingState);
                return Unit.f24250a;
            case 2:
                SignUpActivity signUpActivity = (SignUpActivity) this.e;
                SignUpError signupError = (SignUpError) it;
                Intrinsics.h(signupError, "signupError");
                int i2 = SignUpActivity.C;
                SignUpViewModel signUpViewModelN4 = signUpActivity.N4();
                SignupAnalytics.SignupWebview.Action.Companion companion = SignupAnalytics.SignupWebview.Action.d;
                String string = signupError instanceof SignUpError.NoBrowserInstalled ? signUpActivity.getString(R.string.no_browser_installed_message) : signUpActivity.getString(R.string.signup_server_error);
                Intrinsics.e(string);
                companion.getClass();
                signUpViewModelN4.e.g(SignupAnalytics.SignupWebview.Action.Companion.a(string));
                return Unit.f24250a;
            case 3:
                SyncScheduler syncScheduler = (SyncScheduler) this.e;
                List<WorkInfo> list = (List) it;
                Intrinsics.e(list);
                synchronized (syncScheduler) {
                    try {
                        LinkedHashMap linkedHashMap = syncScheduler.e;
                        for (WorkInfo workInfo : list) {
                            WorkData workData = (WorkData) linkedHashMap.get(workInfo.f3908a);
                            if (workData != null) {
                                workData.b = workInfo.b;
                            }
                        }
                        LinkedHashMap linkedHashMap2 = syncScheduler.e;
                        if (!linkedHashMap2.isEmpty()) {
                            Iterator it2 = linkedHashMap2.entrySet().iterator();
                            while (it2.hasNext()) {
                                if (((WorkData) ((Map.Entry) it2.next()).getValue()).b != WorkInfo.State.f) {
                                    LinkedHashMap linkedHashMap3 = syncScheduler.e;
                                    if (!linkedHashMap3.isEmpty()) {
                                        Iterator it3 = linkedHashMap3.entrySet().iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                if (((WorkData) ((Map.Entry) it3.next()).getValue()).b == WorkInfo.State.g) {
                                                    syncScheduler.d(new SyncResult.Failure(new SyncFailedException("Sync work did not complete")));
                                                }
                                            }
                                        }
                                    }
                                    Intrinsics.h(linkedHashMap, "<this>");
                                }
                            }
                        }
                        syncScheduler.d(SyncResult.Success.f12290a);
                        Intrinsics.h(linkedHashMap, "<this>");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.f24250a;
            case 4:
                ((DiskLruCache) this.e).o = true;
                return Unit.f24250a;
            case 5:
                JavaDataStorage javaDataStorage = (JavaDataStorage) this.e;
                Context it4 = (Context) it;
                KProperty[] kPropertyArr = JavaDataStorage.d;
                Intrinsics.h(it4, "it");
                String sharedPreferencesName = javaDataStorage.f15407a;
                LinkedHashSet keysToMigrate = SharedPreferencesMigrationKt.f2585a;
                Intrinsics.h(sharedPreferencesName, "sharedPreferencesName");
                Intrinsics.h(keysToMigrate, "keysToMigrate");
                return CollectionsKt.Q(new SharedPreferencesMigration(it4, sharedPreferencesName, SharedPreferencesMigrationKt.b(keysToMigrate), SharedPreferencesMigrationKt.a()));
            case 6:
                SessionDataSerializer sessionDataSerializer = (SessionDataSerializer) this.e;
                CorruptionException ex = (CorruptionException) it;
                Intrinsics.h(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return new SessionData(sessionDataSerializer.f15813a.a(null), null, null);
            case 7:
                Function0 function0 = (Function0) this.e;
                Intrinsics.h(it, "it");
                return function0.invoke();
            case 8:
                ((MutexImpl) this.e).c(null);
                return Unit.f24250a;
            default:
                okhttp3.internal.cache.DiskLruCache diskLruCache = (okhttp3.internal.cache.DiskLruCache) this.e;
                String str = okhttp3.internal.cache.DiskLruCache.w;
                Intrinsics.h((IOException) it, "it");
                TimeZone timeZone = _UtilJvmKt.f26699a;
                diskLruCache.n = true;
                return Unit.f24250a;
        }
    }

    public /* synthetic */ d(MutexImpl mutexImpl, MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner) {
        this.d = 8;
        this.e = mutexImpl;
    }
}
