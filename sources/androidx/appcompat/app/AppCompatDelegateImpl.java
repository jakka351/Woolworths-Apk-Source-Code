package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.i;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.TwilightManager;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.FitWindowsViewGroup;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewUtils;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.AppLocalesStorageHelper;
import androidx.core.app.NavUtils;
import androidx.core.content.PermissionChecker;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.Insets;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.medallia.digital.mobilesdk.l8;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.BERTags;

@RestrictTo
/* loaded from: classes.dex */
class AppCompatDelegateImpl extends AppCompatDelegate implements MenuBuilder.Callback, LayoutInflater.Factory2 {
    public static final SimpleArrayMap l0 = new SimpleArrayMap(0);
    public static final int[] m0 = {R.attr.windowBackground};
    public static final boolean n0 = !"robolectric".equals(Build.FINGERPRINT);
    public Runnable A;
    public boolean D;
    public ViewGroup E;
    public TextView F;
    public View G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public PanelFeatureState[] P;
    public PanelFeatureState Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Configuration V;
    public int W;
    public int X;
    public int Y;
    public boolean Z;
    public AutoTimeNightModeManager a0;
    public AutoBatteryNightModeManager b0;
    public boolean c0;
    public int d0;
    public boolean f0;
    public Rect g0;
    public Rect h0;
    public AppCompatViewInflater i0;
    public OnBackInvokedDispatcher j0;
    public OnBackInvokedCallback k0;
    public final Object m;
    public final Context n;
    public Window o;
    public AppCompatWindowCallback p;
    public final Object q;
    public ActionBar r;
    public SupportMenuInflater s;
    public CharSequence t;
    public DecorContentParent u;
    public ActionMenuPresenterCallback v;
    public PanelMenuPresenterCallback w;
    public ActionMode x;
    public ActionBarContextView y;
    public PopupWindow z;
    public ViewPropertyAnimatorCompat B = null;
    public final boolean C = true;
    public final Runnable e0 = new AnonymousClass2();

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.d0 & 1) != 0) {
                appCompatDelegateImpl.O(0);
            }
            if ((appCompatDelegateImpl.d0 & 4096) != 0) {
                appCompatDelegateImpl.O(108);
            }
            appCompatDelegateImpl.c0 = false;
            appCompatDelegateImpl.d0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$4, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass4 implements FitWindowsViewGroup.OnFitSystemWindowsListener {
        @Override // androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
        public final void a(Rect rect) {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public class ActionBarDrawableToggleImpl implements ActionBarDrawerToggle.Delegate {
        public ActionBarDrawableToggleImpl() {
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final Context a() {
            return AppCompatDelegateImpl.this.R();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final boolean b() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.T();
            ActionBar actionBar = appCompatDelegateImpl.r;
            return (actionBar == null || (actionBar.h() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final Drawable c() {
            TintTypedArray tintTypedArrayE = TintTypedArray.e(AppCompatDelegateImpl.this.R(), null, new int[]{com.woolworths.R.attr.homeAsUpIndicator});
            Drawable drawableB = tintTypedArrayE.b(0);
            tintTypedArrayE.g();
            return drawableB;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final void d(Drawable drawable, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.T();
            ActionBar actionBar = appCompatDelegateImpl.r;
            if (actionBar != null) {
                actionBar.x(drawable);
                actionBar.v(i);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final void e(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.T();
            ActionBar actionBar = appCompatDelegateImpl.r;
            if (actionBar != null) {
                actionBar.v(i);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface ActionBarMenuCallback {
        void a(int i);

        View onCreatePanelView(int i);
    }

    /* loaded from: classes2.dex */
    public final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        public ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void c(MenuBuilder menuBuilder, boolean z) {
            AppCompatDelegateImpl.this.K(menuBuilder);
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean d(MenuBuilder menuBuilder) {
            Window.Callback callback = AppCompatDelegateImpl.this.o.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class ActionModeCallbackWrapperV9 implements ActionMode.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f101a;

        public ActionModeCallbackWrapperV9(ActionMode.Callback callback) {
            this.f101a = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean a(ActionMode actionMode, Menu menu) {
            return this.f101a.a(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean b(ActionMode actionMode, MenuItem menuItem) {
            return this.f101a.b(actionMode, menuItem);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean c(ActionMode actionMode, Menu menu) {
            ViewCompat.y(AppCompatDelegateImpl.this.E);
            return this.f101a.c(actionMode, menu);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.appcompat.app.AppCompatCallback, java.lang.Object] */
        @Override // androidx.appcompat.view.ActionMode.Callback
        public final void d(ActionMode actionMode) {
            this.f101a.d(actionMode);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.z != null) {
                appCompatDelegateImpl.o.getDecorView().removeCallbacks(appCompatDelegateImpl.A);
            }
            if (appCompatDelegateImpl.y != null) {
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = appCompatDelegateImpl.B;
                if (viewPropertyAnimatorCompat != null) {
                    viewPropertyAnimatorCompat.b();
                }
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatB = ViewCompat.b(appCompatDelegateImpl.y);
                viewPropertyAnimatorCompatB.a(BitmapDescriptorFactory.HUE_RED);
                appCompatDelegateImpl.B = viewPropertyAnimatorCompatB;
                viewPropertyAnimatorCompatB.d(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9.1
                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                    public final void d() {
                        AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                        appCompatDelegateImpl2.y.setVisibility(8);
                        PopupWindow popupWindow = appCompatDelegateImpl2.z;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                        } else if (appCompatDelegateImpl2.y.getParent() instanceof View) {
                            ViewCompat.y((View) appCompatDelegateImpl2.y.getParent());
                        }
                        appCompatDelegateImpl2.y.g();
                        appCompatDelegateImpl2.B.d(null);
                        appCompatDelegateImpl2.B = null;
                        ViewCompat.y(appCompatDelegateImpl2.E);
                    }
                });
            }
            appCompatDelegateImpl.q.onSupportActionModeFinished(appCompatDelegateImpl.x);
            appCompatDelegateImpl.x = null;
            ViewCompat.y(appCompatDelegateImpl.E);
            appCompatDelegateImpl.b0();
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api21Impl {
        @DoNotInline
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        @DoNotInline
        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        @DoNotInline
        public static LocaleListCompat b(Configuration configuration) {
            return LocaleListCompat.a(configuration.getLocales().toLanguageTags());
        }

        @DoNotInline
        public static void c(LocaleListCompat localeListCompat) {
            LocaleList.setDefault(LocaleList.forLanguageTags(localeListCompat.e()));
        }

        @DoNotInline
        public static void d(Configuration configuration, LocaleListCompat localeListCompat) {
            configuration.setLocales(LocaleList.forLanguageTags(localeListCompat.e()));
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api26Impl {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode & 3;
            if (i != i2) {
                configuration3.colorMode |= i2;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode & 12;
            if (i3 != i4) {
                configuration3.colorMode |= i4;
            }
        }
    }

    @RequiresApi
    public static class Api33Impl {
        @DoNotInline
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.window.OnBackInvokedCallback, androidx.appcompat.app.d] */
        @DoNotInline
        public static OnBackInvokedCallback b(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            ?? r0 = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.d
                public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    appCompatDelegateImpl.W();
                }
            };
            i.l(obj).registerOnBackInvokedCallback(1000000, r0);
            return r0;
        }

        @DoNotInline
        public static void c(Object obj, Object obj2) {
            i.l(obj).unregisterOnBackInvokedCallback(i.j(obj2));
        }
    }

    public class AppCompatWindowCallback extends WindowCallbackWrapper {
        public ActionBarMenuCallback d;
        public boolean e;
        public boolean f;
        public boolean g;

        public AppCompatWindowCallback(Window.Callback callback) {
            super(callback);
        }

        public final void b(Window.Callback callback) {
            try {
                this.e = true;
                callback.onContentChanged();
            } finally {
                this.e = false;
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f ? a().dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.N(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!super.dispatchKeyShortcutEvent(keyEvent)) {
                int keyCode = keyEvent.getKeyCode();
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                appCompatDelegateImpl.T();
                ActionBar actionBar = appCompatDelegateImpl.r;
                if (actionBar == null || !actionBar.o(keyCode, keyEvent)) {
                    PanelFeatureState panelFeatureState = appCompatDelegateImpl.Q;
                    if (panelFeatureState == null || !appCompatDelegateImpl.Y(panelFeatureState, keyEvent.getKeyCode(), keyEvent)) {
                        if (appCompatDelegateImpl.Q == null) {
                            PanelFeatureState panelFeatureStateS = appCompatDelegateImpl.S(0);
                            appCompatDelegateImpl.Z(panelFeatureStateS, keyEvent);
                            boolean zY = appCompatDelegateImpl.Y(panelFeatureStateS, keyEvent.getKeyCode(), keyEvent);
                            panelFeatureStateS.k = false;
                            if (zY) {
                            }
                        }
                        return false;
                    }
                    PanelFeatureState panelFeatureState2 = appCompatDelegateImpl.Q;
                    if (panelFeatureState2 != null) {
                        panelFeatureState2.l = true;
                        return true;
                    }
                }
            }
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final void onContentChanged() {
            if (this.e) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final View onCreatePanelView(int i) {
            View viewOnCreatePanelView;
            ActionBarMenuCallback actionBarMenuCallback = this.d;
            return (actionBarMenuCallback == null || (viewOnCreatePanelView = actionBarMenuCallback.onCreatePanelView(i)) == null) ? super.onCreatePanelView(i) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onMenuOpened(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            super.onMenuOpened(i, menu);
            if (i == 108) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                appCompatDelegateImpl.T();
                ActionBar actionBar = appCompatDelegateImpl.r;
                if (actionBar != null) {
                    actionBar.g(true);
                }
            }
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final void onPanelClosed(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (this.g) {
                a().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i == 108) {
                appCompatDelegateImpl.T();
                ActionBar actionBar = appCompatDelegateImpl.r;
                if (actionBar != null) {
                    actionBar.g(false);
                    return;
                }
                return;
            }
            if (i == 0) {
                PanelFeatureState panelFeatureStateS = appCompatDelegateImpl.S(i);
                if (panelFeatureStateS.m) {
                    appCompatDelegateImpl.L(panelFeatureStateS, false);
                }
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (i == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.z(true);
            }
            ActionBarMenuCallback actionBarMenuCallback = this.d;
            if (actionBarMenuCallback != null) {
                actionBarMenuCallback.a(i);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
            if (menuBuilder != null) {
                menuBuilder.z(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
            MenuBuilder menuBuilder = AppCompatDelegateImpl.this.S(0).h;
            if (menuBuilder != null) {
                super.onProvideKeyboardShortcuts(list, menuBuilder, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.C || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(appCompatDelegateImpl.n, callback);
            androidx.appcompat.view.ActionMode actionModeF = appCompatDelegateImpl.F(callbackWrapper);
            if (actionModeF != null) {
                return callbackWrapper.e(actionModeF);
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public class AutoBatteryNightModeManager extends AutoNightModeManager {
        public final PowerManager c;

        public AutoBatteryNightModeManager(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public final void c() throws PackageManager.NameNotFoundException {
            AppCompatDelegateImpl.this.G(true, true);
        }

        public final int e() {
            return Api21Impl.a(this.c) ? 2 : 1;
        }
    }

    @RestrictTo
    @VisibleForTesting
    /* loaded from: classes2.dex */
    public abstract class AutoNightModeManager {

        /* renamed from: a, reason: collision with root package name */
        public BroadcastReceiver f103a;

        public AutoNightModeManager() {
        }

        public final void a() {
            BroadcastReceiver broadcastReceiver = this.f103a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.n.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f103a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract void c();

        public final void d() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f103a == null) {
                this.f103a = new BroadcastReceiver() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager.1
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context, Intent intent) {
                        AutoNightModeManager.this.c();
                    }
                };
            }
            AppCompatDelegateImpl.this.n.registerReceiver(this.f103a, intentFilterB);
        }
    }

    /* loaded from: classes2.dex */
    public class AutoTimeNightModeManager extends AutoNightModeManager {
        public final TwilightManager c;

        public AutoTimeNightModeManager(TwilightManager twilightManager) {
            super();
            this.c = twilightManager;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public final void c() throws PackageManager.NameNotFoundException {
            AppCompatDelegateImpl.this.G(true, true);
        }

        public final int e() {
            Location location;
            boolean z;
            long j;
            TwilightManager twilightManager = this.c;
            TwilightManager.TwilightState twilightState = twilightManager.c;
            LocationManager locationManager = twilightManager.b;
            if (twilightState.b > System.currentTimeMillis()) {
                z = twilightState.f111a;
            } else {
                Context context = twilightManager.f110a;
                Location lastKnownLocation = null;
                if (PermissionChecker.b(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    try {
                    } catch (Exception e) {
                        Log.d("TwilightManager", "Failed to get last known location", e);
                    }
                    Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                    location = lastKnownLocation2;
                } else {
                    location = null;
                }
                if (PermissionChecker.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            lastKnownLocation = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e2) {
                        Log.d("TwilightManager", "Failed to get last known location", e2);
                    }
                }
                if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                    location = lastKnownLocation;
                }
                if (location != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (TwilightCalculator.d == null) {
                        TwilightCalculator.d = new TwilightCalculator();
                    }
                    TwilightCalculator twilightCalculator = TwilightCalculator.d;
                    twilightCalculator.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                    twilightCalculator.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                    z = twilightCalculator.c == 1;
                    long j2 = twilightCalculator.b;
                    long j3 = twilightCalculator.f109a;
                    twilightCalculator.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                    long j4 = twilightCalculator.b;
                    if (j2 == -1 || j3 == -1) {
                        j = jCurrentTimeMillis + 43200000;
                    } else {
                        if (jCurrentTimeMillis > j3) {
                            j2 = j4;
                        } else if (jCurrentTimeMillis > j2) {
                            j2 = j3;
                        }
                        j = j2 + l8.b.b;
                    }
                    twilightState.f111a = z;
                    twilightState.b = j;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    if (i < 6 || i >= 22) {
                        z = true;
                    }
                }
            }
            return z ? 2 : 1;
        }
    }

    /* loaded from: classes2.dex */
    public class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(ContextThemeWrapper contextThemeWrapper) {
            super(contextThemeWrapper);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.N(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.L(appCompatDelegateImpl.S(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(AppCompatResources.b(i, getContext()));
        }
    }

    public static final class PanelFeatureState {

        /* renamed from: a, reason: collision with root package name */
        public int f105a;
        public int b;
        public int c;
        public int d;
        public ViewGroup e;
        public View f;
        public View g;
        public MenuBuilder h;
        public ListMenuPresenter i;
        public ContextThemeWrapper j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public Bundle p;

        @SuppressLint
        /* loaded from: classes2.dex */
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
            public int d;
            public boolean e;
            public Bundle f;

            /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$1, reason: invalid class name */
            public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SavedState[i];
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return SavedState.a(parcel, null);
                }
            }

            public static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.d = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                savedState.e = z;
                if (z) {
                    savedState.f = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.d);
                parcel.writeInt(this.e ? 1 : 0);
                if (this.e) {
                    parcel.writeBundle(this.f);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class PanelMenuPresenterCallback implements MenuPresenter.Callback {
        public PanelMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void c(MenuBuilder menuBuilder, boolean z) {
            PanelFeatureState panelFeatureState;
            MenuBuilder menuBuilderL = menuBuilder.l();
            int i = 0;
            boolean z2 = menuBuilderL != menuBuilder;
            if (z2) {
                menuBuilder = menuBuilderL;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            PanelFeatureState[] panelFeatureStateArr = appCompatDelegateImpl.P;
            int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
            while (true) {
                if (i < length) {
                    panelFeatureState = panelFeatureStateArr[i];
                    if (panelFeatureState != null && panelFeatureState.h == menuBuilder) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState != null) {
                if (!z2) {
                    appCompatDelegateImpl.L(panelFeatureState, z);
                } else {
                    appCompatDelegateImpl.J(panelFeatureState.f105a, panelFeatureState, menuBuilderL);
                    appCompatDelegateImpl.L(panelFeatureState, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean d(MenuBuilder menuBuilder) {
            Window.Callback callback;
            if (menuBuilder != menuBuilder.l()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.J || (callback = appCompatDelegateImpl.o.getCallback()) == null || appCompatDelegateImpl.U) {
                return true;
            }
            callback.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.W = -100;
        this.n = context;
        this.q = appCompatCallback;
        this.m = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AppCompatActivity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        appCompatActivity = (AppCompatActivity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.W = appCompatActivity.getDelegate().i();
            }
        }
        if (this.W == -100) {
            String name = this.m.getClass().getName();
            SimpleArrayMap simpleArrayMap = l0;
            Integer num = (Integer) simpleArrayMap.get(name);
            if (num != null) {
                this.W = num.intValue();
                simpleArrayMap.remove(this.m.getClass().getName());
            }
        }
        if (window != null) {
            H(window);
        }
        AppCompatDrawableManager.d();
    }

    public static LocaleListCompat I(Context context) {
        LocaleListCompat localeListCompat;
        if (Build.VERSION.SDK_INT >= 33 || (localeListCompat = AppCompatDelegate.f) == null) {
            return null;
        }
        LocaleListCompat localeListCompatB = Api24Impl.b(context.getApplicationContext().getResources().getConfiguration());
        LocaleListCompat localeListCompatA = LocaleOverlayHelper.a(localeListCompat, localeListCompatB);
        return localeListCompatA.c() ? localeListCompatB : localeListCompatA;
    }

    public static Configuration M(Context context, int i, LocaleListCompat localeListCompat, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = BitmapDescriptorFactory.HUE_RED;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (localeListCompat != null) {
            Api24Impl.d(configuration2, localeListCompat);
        }
        return configuration2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void B(int i) throws PackageManager.NameNotFoundException {
        if (this.W != i) {
            this.W = i;
            if (this.S) {
                G(true, true);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void C(Toolbar toolbar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object obj = this.m;
        if (obj instanceof Activity) {
            T();
            ActionBar actionBar = this.r;
            if (actionBar instanceof WindowDecorActionBar) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.s = null;
            if (actionBar != null) {
                actionBar.n();
            }
            this.r = null;
            if (toolbar != null) {
                ToolbarActionBar toolbarActionBar = new ToolbarActionBar(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.t, this.p);
                this.r = toolbarActionBar;
                this.p.d = toolbarActionBar.c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.p.d = null;
            }
            m();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void D(int i) {
        this.X = i;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void E(CharSequence charSequence) {
        this.t = charSequence;
        DecorContentParent decorContentParent = this.u;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.r;
        if (actionBar != null) {
            actionBar.B(charSequence);
            return;
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017d  */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.appcompat.app.AppCompatCallback, java.lang.Object] */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.appcompat.view.ActionMode F(androidx.appcompat.view.ActionMode.Callback r9) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.F(androidx.appcompat.view.ActionMode$Callback):androidx.appcompat.view.ActionMode");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G(boolean r17, boolean r18) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.G(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(android.view.Window r4) {
        /*
            r3 = this;
            android.view.Window r0 = r3.o
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L66
            android.view.Window$Callback r0 = r4.getCallback()
            boolean r2 = r0 instanceof androidx.appcompat.app.AppCompatDelegateImpl.AppCompatWindowCallback
            if (r2 != 0) goto L60
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r1 = new androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback
            r1.<init>(r0)
            r3.p = r1
            r4.setCallback(r1)
            android.content.Context r0 = r3.n
            int[] r1 = androidx.appcompat.app.AppCompatDelegateImpl.m0
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.e(r0, r2, r1)
            r1 = 0
            android.graphics.drawable.Drawable r1 = r0.c(r1)
            if (r1 == 0) goto L2b
            r4.setBackgroundDrawable(r1)
        L2b:
            r0.g()
            r3.o = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r4 < r0) goto L5f
            android.window.OnBackInvokedDispatcher r4 = r3.j0
            if (r4 != 0) goto L5f
            if (r4 == 0) goto L45
            android.window.OnBackInvokedCallback r0 = r3.k0
            if (r0 == 0) goto L45
            androidx.appcompat.app.AppCompatDelegateImpl.Api33Impl.c(r4, r0)
            r3.k0 = r2
        L45:
            java.lang.Object r4 = r3.m
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L5a
            android.app.Activity r4 = (android.app.Activity) r4
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L5a
            android.window.OnBackInvokedDispatcher r4 = androidx.appcompat.app.AppCompatDelegateImpl.Api33Impl.a(r4)
            r3.j0 = r4
            goto L5c
        L5a:
            r3.j0 = r2
        L5c:
            r3.b0()
        L5f:
            return
        L60:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
        L66:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.H(android.view.Window):void");
    }

    public final void J(int i, PanelFeatureState panelFeatureState, MenuBuilder menuBuilder) {
        if (menuBuilder == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.P;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menuBuilder = panelFeatureState.h;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.m) && !this.U) {
            AppCompatWindowCallback appCompatWindowCallback = this.p;
            Window.Callback callback = this.o.getCallback();
            appCompatWindowCallback.getClass();
            try {
                appCompatWindowCallback.g = true;
                callback.onPanelClosed(i, menuBuilder);
            } finally {
                appCompatWindowCallback.g = false;
            }
        }
    }

    public final void K(MenuBuilder menuBuilder) {
        if (this.O) {
            return;
        }
        this.O = true;
        this.u.m();
        Window.Callback callback = this.o.getCallback();
        if (callback != null && !this.U) {
            callback.onPanelClosed(108, menuBuilder);
        }
        this.O = false;
    }

    public final void L(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        if (z && panelFeatureState.f105a == 0 && (decorContentParent = this.u) != null && decorContentParent.c()) {
            K(panelFeatureState.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.n.getSystemService("window");
        if (windowManager != null && panelFeatureState.m && (viewGroup = panelFeatureState.e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                J(panelFeatureState.f105a, panelFeatureState, null);
            }
        }
        panelFeatureState.k = false;
        panelFeatureState.l = false;
        panelFeatureState.m = false;
        panelFeatureState.f = null;
        panelFeatureState.n = true;
        if (this.Q == panelFeatureState) {
            this.Q = null;
        }
        if (panelFeatureState.f105a == 0) {
            b0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean N(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.N(android.view.KeyEvent):boolean");
    }

    public final void O(int i) {
        PanelFeatureState panelFeatureStateS = S(i);
        if (panelFeatureStateS.h != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateS.h.v(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateS.p = bundle;
            }
            panelFeatureStateS.h.B();
            panelFeatureStateS.h.clear();
        }
        panelFeatureStateS.o = true;
        panelFeatureStateS.n = true;
        if ((i == 108 || i == 0) && this.u != null) {
            PanelFeatureState panelFeatureStateS2 = S(0);
            panelFeatureStateS2.k = false;
            Z(panelFeatureStateS2, null);
        }
    }

    public final void P() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.D) {
            return;
        }
        Context context = this.n;
        int[] iArr = androidx.appcompat.R.styleable.k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            w(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            w(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            w(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            w(10);
        }
        this.M = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        Q();
        this.o.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.N) {
            viewGroup = this.L ? (ViewGroup) layoutInflaterFrom.inflate(com.woolworths.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.woolworths.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.M) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.woolworths.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.K = false;
            this.J = false;
        } else if (this.J) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.woolworths.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ContextThemeWrapper(context, typedValue.resourceId) : context).inflate(com.woolworths.R.layout.abc_screen_toolbar, (ViewGroup) null);
            DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(com.woolworths.R.id.decor_content_parent);
            this.u = decorContentParent;
            decorContentParent.setWindowCallback(this.o.getCallback());
            if (this.K) {
                this.u.k(109);
            }
            if (this.H) {
                this.u.k(2);
            }
            if (this.I) {
                this.u.k(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.J);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.K);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.M);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.L);
            sb.append(", windowNoTitle: ");
            throw new IllegalArgumentException(YU.a.k(" }", sb, this.N));
        }
        ViewCompat.I(viewGroup, new OnApplyWindowInsetsListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                boolean z;
                WindowInsetsCompat windowInsetsCompatA;
                boolean z2;
                int iK = windowInsetsCompat.k();
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                Context context2 = appCompatDelegateImpl.n;
                int iK2 = windowInsetsCompat.k();
                ActionBarContextView actionBarContextView = appCompatDelegateImpl.y;
                if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    z = false;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatDelegateImpl.y.getLayoutParams();
                    if (appCompatDelegateImpl.y.isShown()) {
                        if (appCompatDelegateImpl.g0 == null) {
                            appCompatDelegateImpl.g0 = new Rect();
                            appCompatDelegateImpl.h0 = new Rect();
                        }
                        Rect rect = appCompatDelegateImpl.g0;
                        Rect rect2 = appCompatDelegateImpl.h0;
                        rect.set(windowInsetsCompat.i(), windowInsetsCompat.k(), windowInsetsCompat.j(), windowInsetsCompat.h());
                        ViewUtils.a(appCompatDelegateImpl.E, rect, rect2);
                        int i = rect.top;
                        int i2 = rect.left;
                        int i3 = rect.right;
                        WindowInsetsCompat windowInsetsCompatN = ViewCompat.n(appCompatDelegateImpl.E);
                        int i4 = windowInsetsCompatN == null ? 0 : windowInsetsCompatN.i();
                        int iJ = windowInsetsCompatN == null ? 0 : windowInsetsCompatN.j();
                        if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                            z2 = false;
                        } else {
                            marginLayoutParams.topMargin = i;
                            marginLayoutParams.leftMargin = i2;
                            marginLayoutParams.rightMargin = i3;
                            z2 = true;
                        }
                        if (i <= 0 || appCompatDelegateImpl.G != null) {
                            View view2 = appCompatDelegateImpl.G;
                            if (view2 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                int i5 = marginLayoutParams2.height;
                                int i6 = marginLayoutParams.topMargin;
                                if (i5 != i6 || marginLayoutParams2.leftMargin != i4 || marginLayoutParams2.rightMargin != iJ) {
                                    marginLayoutParams2.height = i6;
                                    marginLayoutParams2.leftMargin = i4;
                                    marginLayoutParams2.rightMargin = iJ;
                                    appCompatDelegateImpl.G.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        } else {
                            View view3 = new View(context2);
                            appCompatDelegateImpl.G = view3;
                            view3.setVisibility(8);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                            layoutParams.leftMargin = i4;
                            layoutParams.rightMargin = iJ;
                            appCompatDelegateImpl.E.addView(appCompatDelegateImpl.G, -1, layoutParams);
                        }
                        View view4 = appCompatDelegateImpl.G;
                        z = view4 != null;
                        if (z && view4.getVisibility() != 0) {
                            View view5 = appCompatDelegateImpl.G;
                            view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context2.getColor(com.woolworths.R.color.abc_decor_view_status_guard_light) : context2.getColor(com.woolworths.R.color.abc_decor_view_status_guard));
                        }
                        if (!appCompatDelegateImpl.L && z) {
                            iK2 = 0;
                        }
                        z = z;
                        z = z2;
                    } else if (marginLayoutParams.topMargin != 0) {
                        marginLayoutParams.topMargin = 0;
                        z = false;
                    } else {
                        z = false;
                        z = false;
                    }
                    if (z) {
                        appCompatDelegateImpl.y.setLayoutParams(marginLayoutParams);
                    }
                }
                View view6 = appCompatDelegateImpl.G;
                if (view6 != null) {
                    view6.setVisibility(z ? 0 : 8);
                }
                if (iK != iK2) {
                    int i7 = windowInsetsCompat.i();
                    int iJ2 = windowInsetsCompat.j();
                    int iH = windowInsetsCompat.h();
                    WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompat);
                    builder.b(Insets.c(i7, iK2, iJ2, iH));
                    windowInsetsCompatA = builder.a();
                } else {
                    windowInsetsCompatA = windowInsetsCompat;
                }
                return ViewCompat.u(view, windowInsetsCompatA);
            }
        });
        if (this.u == null) {
            this.F = (TextView) viewGroup.findViewById(com.woolworths.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.woolworths.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.o.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.o.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ContentFrameLayout.OnAttachListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.5
            @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
            public final void onDetachedFromWindow() {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                DecorContentParent decorContentParent2 = appCompatDelegateImpl.u;
                if (decorContentParent2 != null) {
                    decorContentParent2.m();
                }
                if (appCompatDelegateImpl.z != null) {
                    appCompatDelegateImpl.o.getDecorView().removeCallbacks(appCompatDelegateImpl.A);
                    if (appCompatDelegateImpl.z.isShowing()) {
                        try {
                            appCompatDelegateImpl.z.dismiss();
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    appCompatDelegateImpl.z = null;
                }
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = appCompatDelegateImpl.B;
                if (viewPropertyAnimatorCompat != null) {
                    viewPropertyAnimatorCompat.b();
                }
                MenuBuilder menuBuilder = appCompatDelegateImpl.S(0).h;
                if (menuBuilder != null) {
                    menuBuilder.close();
                }
            }
        });
        this.E = viewGroup;
        Object obj = this.m;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.t;
        if (!TextUtils.isEmpty(title)) {
            DecorContentParent decorContentParent2 = this.u;
            if (decorContentParent2 != null) {
                decorContentParent2.setWindowTitle(title);
            } else {
                ActionBar actionBar = this.r;
                if (actionBar != null) {
                    actionBar.B(title);
                } else {
                    TextView textView = this.F;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.E.findViewById(R.id.content);
        View decorView = this.o.getDecorView();
        contentFrameLayout2.j.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.D = true;
        PanelFeatureState panelFeatureStateS = S(0);
        if (this.U || panelFeatureStateS.h != null) {
            return;
        }
        U(108);
    }

    public final void Q() {
        if (this.o == null) {
            Object obj = this.m;
            if (obj instanceof Activity) {
                H(((Activity) obj).getWindow());
            }
        }
        if (this.o == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Context R() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        T();
        ActionBar actionBar = this.r;
        Context contextI = actionBar != null ? actionBar.i() : null;
        return contextI == null ? this.n : contextI;
    }

    public final PanelFeatureState S(int i) {
        PanelFeatureState[] panelFeatureStateArr = this.P;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.P = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState();
        panelFeatureState2.f105a = i;
        panelFeatureState2.n = false;
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    public final void T() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        P();
        if (this.J && this.r == null) {
            Object obj = this.m;
            if (obj instanceof Activity) {
                this.r = new WindowDecorActionBar((Activity) obj, this.K);
            } else if (obj instanceof Dialog) {
                this.r = new WindowDecorActionBar((Dialog) obj);
            }
            ActionBar actionBar = this.r;
            if (actionBar != null) {
                actionBar.r(this.f0);
            }
        }
    }

    public final void U(int i) {
        this.d0 = (1 << i) | this.d0;
        if (this.c0) {
            return;
        }
        View decorView = this.o.getDecorView();
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        decorView.postOnAnimation(this.e0);
        this.c0 = true;
    }

    public final int V(int i, Context context) {
        if (i != -100) {
            if (i == -1) {
                return i;
            }
            if (i != 0) {
                if (i == 1 || i == 2) {
                    return i;
                }
                if (i != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.b0 == null) {
                    this.b0 = new AutoBatteryNightModeManager(context);
                }
                return this.b0.e();
            }
            if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                if (this.a0 == null) {
                    this.a0 = new AutoTimeNightModeManager(TwilightManager.a(context));
                }
                return this.a0.e();
            }
        }
        return -1;
    }

    public final boolean W() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z = this.R;
        this.R = false;
        PanelFeatureState panelFeatureStateS = S(0);
        if (!panelFeatureStateS.m) {
            androidx.appcompat.view.ActionMode actionMode = this.x;
            if (actionMode != null) {
                actionMode.c();
                return true;
            }
            T();
            ActionBar actionBar = this.r;
            if (actionBar == null || !actionBar.f()) {
                return false;
            }
        } else if (!z) {
            L(panelFeatureStateS, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r14, android.view.KeyEvent r15) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.X(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    public final boolean Y(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.k || Z(panelFeatureState, keyEvent)) && (menuBuilder = panelFeatureState.h) != null) {
            return menuBuilder.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Z(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.Z(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):boolean");
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
        PanelFeatureState panelFeatureState;
        Window.Callback callback = this.o.getCallback();
        if (callback != null && !this.U) {
            MenuBuilder menuBuilderL = menuBuilder.l();
            PanelFeatureState[] panelFeatureStateArr = this.P;
            int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    panelFeatureState = panelFeatureStateArr[i];
                    if (panelFeatureState != null && panelFeatureState.h == menuBuilderL) {
                        break;
                    }
                    i++;
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState != null) {
                return callback.onMenuItemSelected(panelFeatureState.f105a, menuItem);
            }
        }
        return false;
    }

    public final void a0() {
        if (this.D) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final void b(MenuBuilder menuBuilder) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DecorContentParent decorContentParent = this.u;
        if (decorContentParent == null || !decorContentParent.a() || (ViewConfiguration.get(this.n).hasPermanentMenuKey() && !this.u.g())) {
            PanelFeatureState panelFeatureStateS = S(0);
            panelFeatureStateS.n = true;
            L(panelFeatureStateS, false);
            X(panelFeatureStateS, null);
            return;
        }
        Window.Callback callback = this.o.getCallback();
        if (this.u.c()) {
            this.u.d();
            if (this.U) {
                return;
            }
            callback.onPanelClosed(108, S(0).h);
            return;
        }
        if (callback == null || this.U) {
            return;
        }
        if (this.c0 && (1 & this.d0) != 0) {
            View decorView = this.o.getDecorView();
            Runnable runnable = this.e0;
            decorView.removeCallbacks(runnable);
            ((AnonymousClass2) runnable).run();
        }
        PanelFeatureState panelFeatureStateS2 = S(0);
        MenuBuilder menuBuilder2 = panelFeatureStateS2.h;
        if (menuBuilder2 == null || panelFeatureStateS2.o || !callback.onPreparePanel(0, panelFeatureStateS2.g, menuBuilder2)) {
            return;
        }
        callback.onMenuOpened(108, panelFeatureStateS2.h);
        this.u.b();
    }

    public final void b0() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.j0 != null && (S(0).m || this.x != null)) {
                z = true;
            }
            if (z && this.k0 == null) {
                this.k0 = Api33Impl.b(this.j0, this);
            } else {
                if (z || (onBackInvokedCallback = this.k0) == null) {
                    return;
                }
                Api33Impl.c(this.j0, onBackInvokedCallback);
                this.k0 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void c(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        P();
        ((ViewGroup) this.E.findViewById(R.id.content)).addView(view, layoutParams);
        this.p.b(this.o.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final boolean d() {
        return G(true, true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final Context e(final Context context) {
        this.S = true;
        int i = this.W;
        if (i == -100) {
            i = AppCompatDelegate.e;
        }
        int iV = V(i, context);
        if (AppCompatDelegate.n(context) && AppCompatDelegate.n(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AppCompatDelegate.l) {
                    try {
                        LocaleListCompat localeListCompat = AppCompatDelegate.f;
                        if (localeListCompat == null) {
                            if (AppCompatDelegate.g == null) {
                                AppCompatDelegate.g = LocaleListCompat.a(AppLocalesStorageHelper.b(context));
                            }
                            if (!AppCompatDelegate.g.c()) {
                                AppCompatDelegate.f = AppCompatDelegate.g;
                            }
                        } else if (!localeListCompat.equals(AppCompatDelegate.g)) {
                            LocaleListCompat localeListCompat2 = AppCompatDelegate.f;
                            AppCompatDelegate.g = localeListCompat2;
                            AppLocalesStorageHelper.a(context, localeListCompat2.e());
                        }
                    } finally {
                    }
                }
            } else if (!AppCompatDelegate.i) {
                AppCompatDelegate.d.execute(new Runnable() { // from class: androidx.appcompat.app.a
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            r7 = this;
                            int r0 = android.os.Build.VERSION.SDK_INT
                            r1 = 1
                            r2 = 33
                            if (r0 < r2) goto L79
                            androidx.appcompat.app.AppCompatDelegate$SerialExecutor r3 = androidx.appcompat.app.AppCompatDelegate.d
                            android.content.ComponentName r3 = new android.content.ComponentName
                            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
                            android.content.Context r5 = r1
                            r3.<init>(r5, r4)
                            android.content.pm.PackageManager r4 = r5.getPackageManager()
                            int r4 = r4.getComponentEnabledSetting(r3)
                            if (r4 == r1) goto L79
                            java.lang.String r4 = "locale"
                            if (r0 < r2) goto L54
                            androidx.collection.ArraySet r0 = androidx.appcompat.app.AppCompatDelegate.j
                            java.util.Iterator r0 = r0.iterator()
                        L26:
                            r2 = r0
                            androidx.collection.IndexBasedArrayIterator r2 = (androidx.collection.IndexBasedArrayIterator) r2
                            boolean r6 = r2.hasNext()
                            if (r6 == 0) goto L48
                            java.lang.Object r2 = r2.next()
                            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
                            java.lang.Object r2 = r2.get()
                            androidx.appcompat.app.AppCompatDelegate r2 = (androidx.appcompat.app.AppCompatDelegate) r2
                            if (r2 == 0) goto L26
                            android.content.Context r2 = r2.g()
                            if (r2 == 0) goto L26
                            java.lang.Object r0 = r2.getSystemService(r4)
                            goto L49
                        L48:
                            r0 = 0
                        L49:
                            if (r0 == 0) goto L59
                            android.os.LocaleList r0 = androidx.appcompat.app.AppCompatDelegate.Api33Impl.a(r0)
                            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.f(r0)
                            goto L5b
                        L54:
                            androidx.core.os.LocaleListCompat r0 = androidx.appcompat.app.AppCompatDelegate.f
                            if (r0 == 0) goto L59
                            goto L5b
                        L59:
                            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.b
                        L5b:
                            boolean r0 = r0.c()
                            if (r0 == 0) goto L72
                            java.lang.String r0 = androidx.core.app.AppLocalesStorageHelper.b(r5)
                            java.lang.Object r2 = r5.getSystemService(r4)
                            if (r2 == 0) goto L72
                            android.os.LocaleList r0 = androidx.appcompat.app.AppCompatDelegate.Api24Impl.a(r0)
                            androidx.appcompat.app.AppCompatDelegate.Api33Impl.b(r2, r0)
                        L72:
                            android.content.pm.PackageManager r0 = r5.getPackageManager()
                            r0.setComponentEnabledSetting(r3, r1, r1)
                        L79:
                            androidx.appcompat.app.AppCompatDelegate.i = r1
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.a.run():void");
                    }
                });
            }
        }
        LocaleListCompat localeListCompatI = I(context);
        Configuration configuration = null;
        if (context instanceof android.view.ContextThemeWrapper) {
            try {
                ((android.view.ContextThemeWrapper) context).applyOverrideConfiguration(M(context, iV, localeListCompatI, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).a(M(context, iV, localeListCompatI, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!n0) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = BitmapDescriptorFactory.HUE_RED;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = BitmapDescriptorFactory.HUE_RED;
            if (configuration3.diff(configuration4) != 0) {
                float f = configuration3.fontScale;
                float f2 = configuration4.fontScale;
                if (f != f2) {
                    configuration.fontScale = f2;
                }
                int i2 = configuration3.mcc;
                int i3 = configuration4.mcc;
                if (i2 != i3) {
                    configuration.mcc = i3;
                }
                int i4 = configuration3.mnc;
                int i5 = configuration4.mnc;
                if (i4 != i5) {
                    configuration.mnc = i5;
                }
                Api24Impl.a(configuration3, configuration4, configuration);
                int i6 = configuration3.touchscreen;
                int i7 = configuration4.touchscreen;
                if (i6 != i7) {
                    configuration.touchscreen = i7;
                }
                int i8 = configuration3.keyboard;
                int i9 = configuration4.keyboard;
                if (i8 != i9) {
                    configuration.keyboard = i9;
                }
                int i10 = configuration3.keyboardHidden;
                int i11 = configuration4.keyboardHidden;
                if (i10 != i11) {
                    configuration.keyboardHidden = i11;
                }
                int i12 = configuration3.navigation;
                int i13 = configuration4.navigation;
                if (i12 != i13) {
                    configuration.navigation = i13;
                }
                int i14 = configuration3.navigationHidden;
                int i15 = configuration4.navigationHidden;
                if (i14 != i15) {
                    configuration.navigationHidden = i15;
                }
                int i16 = configuration3.orientation;
                int i17 = configuration4.orientation;
                if (i16 != i17) {
                    configuration.orientation = i17;
                }
                int i18 = configuration3.screenLayout & 15;
                int i19 = configuration4.screenLayout & 15;
                if (i18 != i19) {
                    configuration.screenLayout |= i19;
                }
                int i20 = configuration3.screenLayout & BERTags.PRIVATE;
                int i21 = configuration4.screenLayout & BERTags.PRIVATE;
                if (i20 != i21) {
                    configuration.screenLayout |= i21;
                }
                int i22 = configuration3.screenLayout & 48;
                int i23 = configuration4.screenLayout & 48;
                if (i22 != i23) {
                    configuration.screenLayout |= i23;
                }
                int i24 = configuration3.screenLayout & 768;
                int i25 = configuration4.screenLayout & 768;
                if (i24 != i25) {
                    configuration.screenLayout |= i25;
                }
                Api26Impl.a(configuration3, configuration4, configuration);
                int i26 = configuration3.uiMode & 15;
                int i27 = configuration4.uiMode & 15;
                if (i26 != i27) {
                    configuration.uiMode |= i27;
                }
                int i28 = configuration3.uiMode & 48;
                int i29 = configuration4.uiMode & 48;
                if (i28 != i29) {
                    configuration.uiMode |= i29;
                }
                int i30 = configuration3.screenWidthDp;
                int i31 = configuration4.screenWidthDp;
                if (i30 != i31) {
                    configuration.screenWidthDp = i31;
                }
                int i32 = configuration3.screenHeightDp;
                int i33 = configuration4.screenHeightDp;
                if (i32 != i33) {
                    configuration.screenHeightDp = i33;
                }
                int i34 = configuration3.smallestScreenWidthDp;
                int i35 = configuration4.smallestScreenWidthDp;
                if (i34 != i35) {
                    configuration.smallestScreenWidthDp = i35;
                }
                int i36 = configuration3.densityDpi;
                int i37 = configuration4.densityDpi;
                if (i36 != i37) {
                    configuration.densityDpi = i37;
                }
            }
        }
        Configuration configurationM = M(context, iV, localeListCompatI, configuration, true);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 2132083545);
        contextThemeWrapper.a(configurationM);
        try {
            if (context.getTheme() != null) {
                ResourcesCompat.ThemeCompat.a(contextThemeWrapper.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return contextThemeWrapper;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final View f(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        P();
        return this.o.findViewById(i);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final Context g() {
        return this.n;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBarDrawerToggle.Delegate h() {
        return new ActionBarDrawableToggleImpl();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final int i() {
        return this.W;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final MenuInflater j() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.s == null) {
            T();
            ActionBar actionBar = this.r;
            this.s = new SupportMenuInflater(actionBar != null ? actionBar.i() : this.n);
        }
        return this.s;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBar k() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        T();
        return this.r;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void l() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.n);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void m() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.r != null) {
            T();
            if (this.r.l()) {
                return;
            }
            U(0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void o(Configuration configuration) throws IllegalAccessException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.J && this.D) {
            T();
            ActionBar actionBar = this.r;
            if (actionBar != null) {
                actionBar.m();
            }
        }
        AppCompatDrawableManager appCompatDrawableManagerA = AppCompatDrawableManager.a();
        Context context = this.n;
        synchronized (appCompatDrawableManagerA) {
            ResourceManagerInternal resourceManagerInternal = appCompatDrawableManagerA.f154a;
            synchronized (resourceManagerInternal) {
                LongSparseArray longSparseArray = (LongSparseArray) resourceManagerInternal.b.get(context);
                if (longSparseArray != null) {
                    longSparseArray.a();
                }
            }
        }
        this.V = new Configuration(this.n.getResources().getConfiguration());
        G(false, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void p() throws PackageManager.NameNotFoundException {
        String strC;
        this.S = true;
        G(false, true);
        Q();
        Object obj = this.m;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = NavUtils.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                ActionBar actionBar = this.r;
                if (actionBar == null) {
                    this.f0 = true;
                } else {
                    actionBar.r(true);
                }
            }
            synchronized (AppCompatDelegate.k) {
                AppCompatDelegate.v(this);
                AppCompatDelegate.j.add(new WeakReference(this));
            }
        }
        this.V = new Configuration(this.n.getResources().getConfiguration());
        this.T = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.m
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.k
            monitor-enter(r0)
            androidx.appcompat.app.AppCompatDelegate.v(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.c0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.o
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.e0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.U = r0
            int r0 = r3.W
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.m
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            androidx.collection.SimpleArrayMap r0 = androidx.appcompat.app.AppCompatDelegateImpl.l0
            java.lang.Object r1 = r3.m
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.W
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            androidx.collection.SimpleArrayMap r0 = androidx.appcompat.app.AppCompatDelegateImpl.l0
            java.lang.Object r1 = r3.m
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            androidx.appcompat.app.ActionBar r0 = r3.r
            if (r0 == 0) goto L63
            r0.n()
        L63:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoTimeNightModeManager r0 = r3.a0
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoBatteryNightModeManager r0 = r3.b0
            if (r0 == 0) goto L71
            r0.a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.q():void");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void r() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        P();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void s() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        T();
        ActionBar actionBar = this.r;
        if (actionBar != null) {
            actionBar.z(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void t() throws PackageManager.NameNotFoundException {
        G(true, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void u() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        T();
        ActionBar actionBar = this.r;
        if (actionBar != null) {
            actionBar.z(false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final boolean w(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.N && i == 108) {
            return false;
        }
        if (this.J && i == 1) {
            this.J = false;
        }
        if (i == 1) {
            a0();
            this.N = true;
            return true;
        }
        if (i == 2) {
            a0();
            this.H = true;
            return true;
        }
        if (i == 5) {
            a0();
            this.I = true;
            return true;
        }
        if (i == 10) {
            a0();
            this.L = true;
            return true;
        }
        if (i == 108) {
            a0();
            this.J = true;
            return true;
        }
        if (i != 109) {
            return this.o.requestFeature(i);
        }
        a0();
        this.K = true;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void x(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        P();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.n).inflate(i, viewGroup);
        this.p.b(this.o.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void y(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        P();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.p.b(this.o.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void z(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        P();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.p.b(this.o.getCallback());
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
