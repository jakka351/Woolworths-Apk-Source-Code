package dagger.hilt.android.internal.managers;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.internal.Contexts;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes7.dex */
public final class ViewComponentManager implements GeneratedComponentManager<Object> {
    public volatile Object d;
    public final Object e = new Object();
    public final View f;

    @EntryPoint
    @InstallIn
    /* loaded from: classes.dex */
    public interface ViewComponentBuilderEntryPoint {
        ViewComponentBuilder o();
    }

    @EntryPoint
    @InstallIn
    public interface ViewWithFragmentComponentBuilderEntryPoint {
    }

    public ViewComponentManager(View view) {
        this.f = view;
    }

    public final Object a() {
        View view = this.f;
        Context context = view.getContext();
        while ((context instanceof ContextWrapper) && !GeneratedComponentManager.class.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Application applicationA = Contexts.a(context.getApplicationContext());
        Object obj = context;
        if (context == applicationA) {
            Preconditions.a(false, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", view.getClass());
            obj = null;
        }
        boolean z = obj instanceof GeneratedComponentManager;
        View view2 = this.f;
        if (z) {
            ViewComponentBuilder viewComponentBuilderO = ((ViewComponentBuilderEntryPoint) EntryPoints.a(ViewComponentBuilderEntryPoint.class, (GeneratedComponentManager) obj)).o();
            viewComponentBuilderO.a(view2);
            return viewComponentBuilderO.build();
        }
        throw new IllegalStateException(view2.getClass() + ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.");
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.d == null) {
            synchronized (this.e) {
                try {
                    if (this.d == null) {
                        this.d = a();
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public static final class FragmentContextWrapper extends ContextWrapper {

        /* renamed from: a, reason: collision with root package name */
        public LayoutInflater f23775a;
        public LayoutInflater b;
        public final LifecycleEventObserver c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentContextWrapper(Context context, Fragment fragment2) {
            super(context);
            context.getClass();
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        FragmentContextWrapper fragmentContextWrapper = FragmentContextWrapper.this;
                        fragmentContextWrapper.f23775a = null;
                        fragmentContextWrapper.b = null;
                    }
                }
            };
            this.c = lifecycleEventObserver;
            this.f23775a = null;
            fragment2.getClass();
            fragment2.getLifecycle().a(lifecycleEventObserver);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.b == null) {
                if (this.f23775a == null) {
                    this.f23775a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.b = this.f23775a.cloneInContext(this);
            }
            return this.b;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FragmentContextWrapper(LayoutInflater layoutInflater, Fragment fragment2) {
            layoutInflater.getClass();
            Context context = layoutInflater.getContext();
            context.getClass();
            super(context);
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        FragmentContextWrapper fragmentContextWrapper = FragmentContextWrapper.this;
                        fragmentContextWrapper.f23775a = null;
                        fragmentContextWrapper.b = null;
                    }
                }
            };
            this.c = lifecycleEventObserver;
            this.f23775a = layoutInflater;
            fragment2.getClass();
            fragment2.getLifecycle().a(lifecycleEventObserver);
        }
    }
}
