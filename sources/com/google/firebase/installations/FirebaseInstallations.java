package com.google.firebase.installations;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.installations.time.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class FirebaseInstallations implements FirebaseInstallationsApi {
    public static final Object m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseApp f15612a;
    public final FirebaseInstallationServiceClient b;
    public final PersistedInstallation c;
    public final Utils d;
    public final Lazy e;
    public final RandomFidGenerator f;
    public final Object g;
    public final ExecutorService h;
    public final Executor i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$2, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass2 implements FidListenerHandle {
    }

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15613a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            f15613a = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15613a[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        new ThreadFactory() { // from class: com.google.firebase.installations.FirebaseInstallations.1
            public final AtomicInteger d = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.d.getAndIncrement())));
            }
        };
    }

    public FirebaseInstallations(final FirebaseApp firebaseApp, Provider provider, ExecutorService executorService, Executor executor) {
        firebaseApp.a();
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = new FirebaseInstallationServiceClient(firebaseApp.f15169a, provider);
        PersistedInstallation persistedInstallation = new PersistedInstallation(firebaseApp);
        if (SystemClock.f15629a == null) {
            SystemClock.f15629a = new SystemClock();
        }
        SystemClock systemClock = SystemClock.f15629a;
        if (Utils.d == null) {
            Utils.d = new Utils(systemClock);
        }
        Utils utils = Utils.d;
        Lazy lazy = new Lazy(new Provider() { // from class: com.google.firebase.installations.a
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                Object obj = FirebaseInstallations.m;
                return new IidStore(firebaseApp);
            }
        });
        RandomFidGenerator randomFidGenerator = new RandomFidGenerator();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.f15612a = firebaseApp;
        this.b = firebaseInstallationServiceClient;
        this.c = persistedInstallation;
        this.d = utils;
        this.e = lazy;
        this.f = randomFidGenerator;
        this.h = executorService;
        this.i = executor;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public final Task a() {
        d();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        GetAuthTokenListener getAuthTokenListener = new GetAuthTokenListener(this.d, taskCompletionSource);
        synchronized (this.g) {
            this.l.add(getAuthTokenListener);
        }
        Task task = taskCompletionSource.getTask();
        this.h.execute(new b(this, 2));
        return task;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[Catch: all -> 0x0087, TryCatch #0 {all -> 0x0087, blocks: (B:5:0x000e, B:7:0x001c, B:13:0x002a, B:15:0x003b, B:22:0x006a, B:23:0x0071, B:17:0x0048, B:19:0x0050, B:21:0x0062), top: B:39:0x000e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[Catch: all -> 0x0087, TryCatch #0 {all -> 0x0087, blocks: (B:5:0x000e, B:7:0x001c, B:13:0x002a, B:15:0x003b, B:22:0x006a, B:23:0x0071, B:17:0x0048, B:19:0x0050, B:21:0x0062), top: B:39:0x000e, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r7 = this;
            java.lang.Object r0 = com.google.firebase.installations.FirebaseInstallations.m
            monitor-enter(r0)
            com.google.firebase.FirebaseApp r1 = r7.f15612a     // Catch: java.lang.Throwable -> L8f
            r1.a()     // Catch: java.lang.Throwable -> L8f
            android.content.Context r1 = r1.f15169a     // Catch: java.lang.Throwable -> L8f
            com.google.firebase.installations.CrossProcessLock r1 = com.google.firebase.installations.CrossProcessLock.a(r1)     // Catch: java.lang.Throwable -> L8f
            com.google.firebase.installations.local.PersistedInstallation r2 = r7.c     // Catch: java.lang.Throwable -> L87
            com.google.firebase.installations.local.PersistedInstallationEntry r2 = r2.c()     // Catch: java.lang.Throwable -> L87
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = r2.f()     // Catch: java.lang.Throwable -> L87
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r4 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.e     // Catch: java.lang.Throwable -> L87
            if (r3 == r4) goto L27
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = r2.f()     // Catch: java.lang.Throwable -> L87
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r4 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.d     // Catch: java.lang.Throwable -> L87
            if (r3 != r4) goto L25
            goto L27
        L25:
            r3 = 0
            goto L28
        L27:
            r3 = 1
        L28:
            if (r3 == 0) goto L89
            com.google.firebase.installations.RandomFidGenerator r3 = r7.f     // Catch: java.lang.Throwable -> L87
            com.google.firebase.FirebaseApp r4 = r7.f15612a     // Catch: java.lang.Throwable -> L87
            r4.a()     // Catch: java.lang.Throwable -> L87
            java.lang.String r5 = r4.b     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = "CHIME_ANDROID_SDK"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L87
            if (r5 != 0) goto L48
            java.lang.String r5 = "[DEFAULT]"
            r4.a()     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = r4.b     // Catch: java.lang.Throwable -> L87
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L87
            if (r4 == 0) goto L6a
        L48:
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r4 = r2.f()     // Catch: java.lang.Throwable -> L87
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r5 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.d     // Catch: java.lang.Throwable -> L87
            if (r4 != r5) goto L6a
            com.google.firebase.components.Lazy r4 = r7.e     // Catch: java.lang.Throwable -> L87
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L87
            com.google.firebase.installations.local.IidStore r4 = (com.google.firebase.installations.local.IidStore) r4     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = r4.a()     // Catch: java.lang.Throwable -> L87
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L87
            if (r5 == 0) goto L71
            r3.getClass()     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = com.google.firebase.installations.RandomFidGenerator.a()     // Catch: java.lang.Throwable -> L87
            goto L71
        L6a:
            r3.getClass()     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = com.google.firebase.installations.RandomFidGenerator.a()     // Catch: java.lang.Throwable -> L87
        L71:
            com.google.firebase.installations.local.PersistedInstallation r3 = r7.c     // Catch: java.lang.Throwable -> L87
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r2 = r2.h()     // Catch: java.lang.Throwable -> L87
            r2.d(r4)     // Catch: java.lang.Throwable -> L87
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r4 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.f     // Catch: java.lang.Throwable -> L87
            r2.f(r4)     // Catch: java.lang.Throwable -> L87
            com.google.firebase.installations.local.PersistedInstallationEntry r2 = r2.a()     // Catch: java.lang.Throwable -> L87
            r3.b(r2)     // Catch: java.lang.Throwable -> L87
            goto L89
        L87:
            r2 = move-exception
            goto La1
        L89:
            if (r1 == 0) goto L91
            r1.b()     // Catch: java.lang.Throwable -> L8f
            goto L91
        L8f:
            r1 = move-exception
            goto La7
        L91:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            r7.g(r2)
            java.util.concurrent.Executor r0 = r7.i
            com.google.firebase.installations.b r1 = new com.google.firebase.installations.b
            r2 = 0
            r1.<init>(r7, r2)
            r0.execute(r1)
            return
        La1:
            if (r1 == 0) goto La6
            r1.b()     // Catch: java.lang.Throwable -> L8f
        La6:
            throw r2     // Catch: java.lang.Throwable -> L8f
        La7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.FirebaseInstallations.b():void");
    }

    public final PersistedInstallationEntry c(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = this.b;
        FirebaseApp firebaseApp = this.f15612a;
        firebaseApp.a();
        String str = firebaseApp.c.f15172a;
        String strC = persistedInstallationEntry.c();
        FirebaseApp firebaseApp2 = this.f15612a;
        firebaseApp2.a();
        TokenResult tokenResultB = firebaseInstallationServiceClient.b(str, strC, firebaseApp2.c.g, persistedInstallationEntry.e());
        int iOrdinal = tokenResultB.a().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return persistedInstallationEntry.i();
            }
            if (iOrdinal != 2) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.j = null;
            }
            PersistedInstallationEntry.Builder builderH = persistedInstallationEntry.h();
            builderH.f(PersistedInstallation.RegistrationStatus.e);
            return builderH.a();
        }
        String strB = tokenResultB.b();
        long jC = tokenResultB.c();
        Utils utils = this.d;
        utils.getClass();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(utils.f15617a.currentTimeMillis());
        PersistedInstallationEntry.Builder builderH2 = persistedInstallationEntry.h();
        builderH2.b(strB);
        builderH2.c(jC);
        builderH2.g(seconds);
        return builderH2.a();
    }

    public final void d() {
        FirebaseApp firebaseApp = this.f15612a;
        firebaseApp.a();
        Preconditions.checkNotEmpty(firebaseApp.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.a();
        Preconditions.checkNotEmpty(firebaseApp.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.a();
        Preconditions.checkNotEmpty(firebaseApp.c.f15172a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.a();
        String str = firebaseApp.c.b;
        Pattern pattern = Utils.c;
        Preconditions.checkArgument(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.a();
        Preconditions.checkArgument(Utils.c.matcher(firebaseApp.c.f15172a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final PersistedInstallationEntry e(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        String strC = (persistedInstallationEntry.c() == null || persistedInstallationEntry.c().length() != 11) ? null : ((IidStore) this.e.get()).c();
        FirebaseApp firebaseApp = this.f15612a;
        firebaseApp.a();
        String str = firebaseApp.c.f15172a;
        String strC2 = persistedInstallationEntry.c();
        firebaseApp.a();
        String str2 = firebaseApp.c.g;
        firebaseApp.a();
        InstallationResponse installationResponseA = this.b.a(str, strC2, str2, firebaseApp.c.b, strC);
        int iOrdinal = installationResponseA.d().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return persistedInstallationEntry.i();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        String strB = installationResponseA.b();
        String strC3 = installationResponseA.c();
        Utils utils = this.d;
        utils.getClass();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(utils.f15617a.currentTimeMillis());
        String strB2 = installationResponseA.a().b();
        long jC = installationResponseA.a().c();
        PersistedInstallationEntry.Builder builderH = persistedInstallationEntry.h();
        builderH.d(strB);
        builderH.f(PersistedInstallation.RegistrationStatus.g);
        builderH.b(strB2);
        builderH.e(strC3);
        builderH.c(jC);
        builderH.g(seconds);
        return builderH.a();
    }

    public final void f(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((StateListener) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((StateListener) it.next()).b(persistedInstallationEntry)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public final Task getId() {
        String str;
        d();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        GetIdListener getIdListener = new GetIdListener(taskCompletionSource);
        synchronized (this.g) {
            this.l.add(getIdListener);
        }
        Task task = taskCompletionSource.getTask();
        this.h.execute(new b(this, 1));
        return task;
    }
}
