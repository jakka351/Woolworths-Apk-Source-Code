package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class LifeCycle implements Application.ActivityLifecycleCallbacks, m8, DefaultLifecycleObserver {
    private static LifeCycle l;

    /* renamed from: a, reason: collision with root package name */
    private long f16352a;
    private long b;
    private boolean c;
    private Integer g;
    private String h;
    private boolean j;
    private boolean k;
    private final ArrayList<g> d = new ArrayList<>();
    private final ArrayList<h> e = new ArrayList<>();
    private final ArrayList<f> f = new ArrayList<>();
    private final List<Activity> i = new ArrayList();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProcessLifecycleOwner.l.i.a(LifeCycle.this);
        }
    }

    public class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f16354a;

        public b(long j) {
            this.f16354a = j;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (LifeCycle.this.d != null) {
                Iterator it = new ArrayList(LifeCycle.this.d).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar != null) {
                        gVar.a(this.f16354a);
                    }
                }
            }
        }
    }

    public class c extends v4 {
        public c() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (LifeCycle.this.e != null) {
                Iterator it = new ArrayList(LifeCycle.this.e).iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar != null) {
                        hVar.onBackground();
                    }
                }
            }
        }
    }

    public class d extends v4 {
        public d() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (LifeCycle.this.e != null) {
                Iterator it = LifeCycle.this.e.iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar != null) {
                        hVar.onForeground();
                    }
                }
            }
        }
    }

    public class e extends v4 {
        public e() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (LifeCycle.this.f != null) {
                Iterator it = LifeCycle.this.f.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (fVar != null) {
                        fVar.b();
                    }
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public interface f {
        void a();

        void b();
    }

    public interface g {
        void a(long j);
    }

    public interface h {
        void onBackground();

        void onForeground();
    }

    private LifeCycle() {
        j();
    }

    public static synchronized LifeCycle b() {
        try {
            if (l == null) {
                l = new LifeCycle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return l;
    }

    private void g() {
        w7.b().a().execute(new e());
    }

    private void h() {
        w7.b().a().execute(new c());
    }

    private void i() {
        w7.b().a().execute(new d());
    }

    private void j() {
        try {
            i4.c().a().registerActivityLifecycleCallbacks(this);
            w7.b().c().execute(new a());
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    public String a() {
        return this.h;
    }

    public Long c() {
        if (this.f16352a == 0) {
            return 0L;
        }
        return Long.valueOf(System.currentTimeMillis() - this.f16352a);
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        ArrayList<h> arrayList = this.e;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<g> arrayList2 = this.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        k();
        l = null;
    }

    public Long d() {
        if (this.b == 0) {
            return 0L;
        }
        return Long.valueOf(System.currentTimeMillis() - this.b);
    }

    public boolean e() {
        return a("com.medallia.digital.mobilesdk.MedalliaFullFormActivity") || a("com.medallia.digital.mobilesdk.MedalliaModalFormActivity");
    }

    public boolean f() {
        return this.c;
    }

    public void k() {
        try {
            i4.c().a().unregisterActivityLifecycleCallbacks(this);
            ProcessLifecycleOwner.l.i.c(this);
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.h = activity.getClass().getName();
        this.g = Integer.valueOf(activity.hashCode());
        if (this.c) {
            b(activity);
        }
        i4.c().a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.i.remove(activity);
        if (this.i.isEmpty()) {
            return;
        }
        i4.c().a(this.i.get(0));
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        try {
            if (this.j && this.k) {
                this.k = false;
            } else {
                this.i.add(activity);
            }
            g();
            this.h = activity.getClass().getName();
            this.g = Integer.valueOf(activity.hashCode());
            Context baseContext = i4.c().d().getBaseContext();
            if (baseContext == null || baseContext.getClass().getName().equals(this.h)) {
                return;
            }
            i4.c().a(activity);
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Integer num = this.g;
        if (num == null || num.intValue() != activity.hashCode()) {
            this.h = activity.getClass().getName();
            this.g = Integer.valueOf(activity.hashCode());
            if (this.c) {
                b(activity);
            }
            i4.c().a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        super.onCreate(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        super.onDestroy(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        super.onPause(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        super.onResume(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onStart(@NotNull LifecycleOwner lifecycleOwner) {
        super.onStart(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        try {
            a4.b("LifecycleOwner onStop");
            this.c = true;
            i4.c().a((Context) null);
            h();
            this.f16352a = System.currentTimeMillis();
            this.b = 0L;
            this.g = null;
            Iterator<f> it = this.f.iterator();
            while (it.hasNext()) {
                f next = it.next();
                if (next != null) {
                    next.a();
                }
            }
            a4.b("Application is in background");
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    private void a(long j) {
        w7.b().a().execute(new b(j));
    }

    private void b(Activity activity) {
        if (this.c) {
            this.c = false;
            i4.a(activity.getApplication());
            a(c().longValue());
            i();
            this.b = System.currentTimeMillis();
            this.f16352a = 0L;
            a4.b("Application is in foreground");
        }
    }

    public void a(Activity activity) {
        a4.b("setCurrentActivityRunning was called");
        if (this.j || activity == null || this.g != null) {
            return;
        }
        this.h = activity.getClass().getName();
        this.g = Integer.valueOf(activity.hashCode());
        this.i.add(activity);
        b(activity);
        this.c = false;
        this.j = true;
        this.k = true;
        a4.b("setCurrentActivityRunning done");
    }

    public void b(f fVar) {
        ArrayList<f> arrayList = this.f;
        if (arrayList == null || fVar == null) {
            return;
        }
        arrayList.remove(fVar);
    }

    public void a(f fVar) {
        ArrayList<f> arrayList = this.f;
        if (arrayList == null || fVar == null) {
            return;
        }
        arrayList.add(fVar);
    }

    public void b(g gVar) {
        ArrayList<g> arrayList = this.d;
        if (arrayList == null || gVar == null) {
            return;
        }
        arrayList.remove(gVar);
    }

    public void a(g gVar) {
        ArrayList<g> arrayList = this.d;
        if (arrayList == null || gVar == null) {
            return;
        }
        arrayList.add(gVar);
    }

    public void b(h hVar) {
        if (hVar != null) {
            try {
                ArrayList<h> arrayList = this.e;
                if (arrayList == null) {
                    return;
                }
                arrayList.remove(hVar);
            } catch (Exception e2) {
                a4.c(e2.getMessage());
            }
        }
    }

    public void a(h hVar) {
        if (hVar != null) {
            try {
                ArrayList<h> arrayList = this.e;
                if (arrayList == null || arrayList.contains(hVar)) {
                    return;
                }
                this.e.add(hVar);
            } catch (Exception e2) {
                a4.c(e2.getMessage());
            }
        }
    }

    public boolean a(String str) {
        String strA = a();
        if (this.j && strA != null && strA.equals(str)) {
            a4.b("isActivityRunning current activity: ".concat(strA));
            return true;
        }
        List<Activity> list = this.i;
        if (list != null && !list.isEmpty()) {
            strA = this.i.get(0).getClass().getName();
        }
        a4.b(YU.a.A("isActivityRunning current activity: ", strA));
        return strA != null && strA.equals(str);
    }
}
