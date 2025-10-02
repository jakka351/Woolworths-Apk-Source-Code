package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.SharedElementCallback;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    public static final /* synthetic */ int s = 0;
    boolean mCreated;
    boolean mResumed;
    final FragmentController mFragments = new FragmentController(new HostCallbacks());
    final LifecycleRegistry mFragmentLifecycleRegistry = new LifecycleRegistry(this, true);
    boolean mStopped = true;

    public class HostCallbacks extends FragmentHostCallback<FragmentActivity> implements OnConfigurationChangedProvider, OnTrimMemoryProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, ViewModelStoreOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, SavedStateRegistryOwner, FragmentOnAttachListener, MenuHost {
        public HostCallbacks() {
            super(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.FragmentOnAttachListener
        public final void a(FragmentManager fragmentManager, Fragment fragment2) {
            FragmentActivity.this.onAttachFragment(fragment2);
        }

        @Override // androidx.core.view.MenuHost
        public final void addMenuProvider(MenuProvider menuProvider) {
            FragmentActivity.this.addMenuProvider(menuProvider);
        }

        @Override // androidx.core.content.OnConfigurationChangedProvider
        public final void addOnConfigurationChangedListener(Consumer consumer) {
            FragmentActivity.this.addOnConfigurationChangedListener(consumer);
        }

        @Override // androidx.core.app.OnMultiWindowModeChangedProvider
        public final void addOnMultiWindowModeChangedListener(Consumer consumer) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(consumer);
        }

        @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
        public final void addOnPictureInPictureModeChangedListener(Consumer consumer) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(consumer);
        }

        @Override // androidx.core.content.OnTrimMemoryProvider
        public final void addOnTrimMemoryListener(Consumer consumer) {
            FragmentActivity.this.addOnTrimMemoryListener(consumer);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        public final View b(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        public final boolean c() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public final void d(PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public final FragmentActivity e() {
            return FragmentActivity.this;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public final LayoutInflater f() {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            return fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public final boolean g(String str) {
            return ActivityCompat.m(FragmentActivity.this, str);
        }

        @Override // androidx.activity.result.ActivityResultRegistryOwner
        public final ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.LifecycleOwner
        /* renamed from: getLifecycle */
        public final Lifecycle getD() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.OnBackPressedDispatcherOwner
        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.os.SavedStateRegistryOwner
        public final SavedStateRegistry getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.ViewModelStoreOwner
        public final ViewModelStore getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public final void h() {
            FragmentActivity.this.invalidateMenu();
        }

        @Override // androidx.core.view.MenuHost
        public final void removeMenuProvider(MenuProvider menuProvider) {
            FragmentActivity.this.removeMenuProvider(menuProvider);
        }

        @Override // androidx.core.content.OnConfigurationChangedProvider
        public final void removeOnConfigurationChangedListener(Consumer consumer) {
            FragmentActivity.this.removeOnConfigurationChangedListener(consumer);
        }

        @Override // androidx.core.app.OnMultiWindowModeChangedProvider
        public final void removeOnMultiWindowModeChangedListener(Consumer consumer) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(consumer);
        }

        @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
        public final void removeOnPictureInPictureModeChangedListener(Consumer consumer) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(consumer);
        }

        @Override // androidx.core.content.OnTrimMemoryProvider
        public final void removeOnTrimMemoryListener(Consumer consumer) {
            FragmentActivity.this.removeOnTrimMemoryListener(consumer);
        }
    }

    public FragmentActivity() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new e(this, 0));
        final int i = 0;
        addOnConfigurationChangedListener(new Consumer(this) { // from class: androidx.fragment.app.f
            public final /* synthetic */ FragmentActivity e;

            {
                this.e = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.e.mFragments.a();
                        break;
                    default:
                        this.e.mFragments.a();
                        break;
                }
            }
        });
        final int i2 = 1;
        addOnNewIntentListener(new Consumer(this) { // from class: androidx.fragment.app.f
            public final /* synthetic */ FragmentActivity e;

            {
                this.e = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        this.e.mFragments.a();
                        break;
                    default:
                        this.e.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.fragment.app.g
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void a(ComponentActivity componentActivity) {
                FragmentHostCallback fragmentHostCallback = this.f2772a.mFragments.f2744a;
                fragmentHostCallback.g.c(fragmentHostCallback, fragmentHostCallback, null);
            }
        });
    }

    public static boolean M4(FragmentManager fragmentManager) {
        Lifecycle.State state = Lifecycle.State.f;
        boolean zM4 = false;
        for (Fragment fragment2 : fragmentManager.c.f()) {
            if (fragment2 != null) {
                if (fragment2.getHost() != null) {
                    zM4 |= M4(fragment2.getChildFragmentManager());
                }
                FragmentViewLifecycleOwner fragmentViewLifecycleOwner = fragment2.mViewLifecycleOwner;
                if (fragmentViewLifecycleOwner != null && ((LifecycleRegistry) fragmentViewLifecycleOwner.getD()).d.compareTo(Lifecycle.State.g) >= 0) {
                    fragment2.mViewLifecycleOwner.d();
                    zM4 = true;
                }
                if (fragment2.mLifecycleRegistry.d.compareTo(Lifecycle.State.g) >= 0) {
                    fragment2.mLifecycleRegistry.h(state);
                    zM4 = true;
                }
            }
        }
        return zM4;
    }

    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.f2744a.g.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                LoaderManager.c(this).b(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.f2744a.g.x(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.f2744a.g;
    }

    @NonNull
    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        return LoaderManager.c(this);
    }

    public void markFragmentsCreated() {
        FragmentManager supportFragmentManager;
        do {
            supportFragmentManager = getSupportFragmentManager();
            Lifecycle.State state = Lifecycle.State.d;
        } while (M4(supportFragmentManager));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment2) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_CREATE);
        FragmentManager fragmentManager = this.mFragments.f2744a.g;
        fragmentManager.I = false;
        fragmentManager.J = false;
        fragmentManager.P.j = false;
        fragmentManager.w(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f2744a.g.n();
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f2744a.g.l(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f2744a.g.w(5);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f2744a.g.B(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_RESUME);
        FragmentManager fragmentManager = this.mFragments.f2744a.g;
        fragmentManager.I = false;
        fragmentManager.J = false;
        fragmentManager.P.j = false;
        fragmentManager.w(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            FragmentManager fragmentManager = this.mFragments.f2744a.g;
            fragmentManager.I = false;
            fragmentManager.J = false;
            fragmentManager.P.j = false;
            fragmentManager.w(4);
        }
        this.mFragments.f2744a.g.B(true);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_START);
        FragmentManager fragmentManager2 = this.mFragments.f2744a.g;
        fragmentManager2.I = false;
        fragmentManager2.J = false;
        fragmentManager2.P.j = false;
        fragmentManager2.w(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        FragmentManager fragmentManager = this.mFragments.f2744a.g;
        fragmentManager.J = true;
        fragmentManager.P.j = true;
        fragmentManager.w(4);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback) {
        ActivityCompat.k(this, sharedElementCallback);
    }

    public void setExitSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback) {
        ActivityCompat.l(this, sharedElementCallback);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment2, @NonNull Intent intent, int i, @Nullable Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment2.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment2, @NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment2.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        ActivityCompat.h(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        ActivityCompat.i(this);
    }

    public void supportStartPostponedEnterTransition() {
        ActivityCompat.n(this);
    }

    @Override // androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(@NonNull Fragment fragment2, @NonNull Intent intent, int i) {
        startActivityFromFragment(fragment2, intent, i, (Bundle) null);
    }
}
