package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.RecyclerView;
import com.woolworths.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

@SuppressLint
/* loaded from: classes.dex */
public class ViewCompat {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f2488a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final f e = new f();
    public static final AccessibilityPaneVisibilityManager f = new AccessibilityPaneVisibilityManager();

    /* renamed from: androidx.core.view.ViewCompat$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass1 extends AccessibilityViewProperty<Boolean> {
        public AnonymousClass1() {
            super(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final Object a(View view) {
            return Boolean.valueOf(Api28Impl.c(view));
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final void b(View view, Object obj) {
            Api28Impl.f(view, ((Boolean) obj).booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean e(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            Boolean bool2 = (Boolean) obj2;
            return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass2 extends AccessibilityViewProperty<CharSequence> {
        public AnonymousClass2() {
            super(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final Object a(View view) {
            return Api28Impl.a(view);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final void b(View view, Object obj) {
            Api28Impl.e(view, (CharSequence) obj);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean e(Object obj, Object obj2) {
            return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass3 extends AccessibilityViewProperty<CharSequence> {
        public AnonymousClass3() {
            super(R.id.tag_state_description, CharSequence.class, 64, 30);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final Object a(View view) {
            return Api30Impl.b(view);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final void b(View view, Object obj) {
            Api30Impl.d(view, (CharSequence) obj);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean e(Object obj, Object obj2) {
            return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$4, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass4 extends AccessibilityViewProperty<Boolean> {
        public AnonymousClass4() {
            super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final Object a(View view) {
            return Boolean.valueOf(Api28Impl.b(view));
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final void b(View view, Object obj) {
            Api28Impl.d(view, ((Boolean) obj).booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean e(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            Boolean bool2 = (Boolean) obj2;
            return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }
    }

    public static class AccessibilityPaneVisibilityManager implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap d = new WeakHashMap();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class AccessibilityViewProperty<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f2489a;
        public final Class b;
        public final int c;
        public final int d;

        public AccessibilityViewProperty(int i, Class cls, int i2, int i3) {
            this.f2489a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }

        public abstract Object a(View view);

        public abstract void b(View view, Object obj);

        public final Object c(View view) {
            if (Build.VERSION.SDK_INT >= this.c) {
                return a(view);
            }
            Object tag = view.getTag(this.f2489a);
            if (this.b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public final void d(View view, Object obj) {
            if (Build.VERSION.SDK_INT >= this.c) {
                b(view, obj);
                return;
            }
            if (e(c(view), obj)) {
                AccessibilityDelegateCompat accessibilityDelegateCompatE = ViewCompat.e(view);
                if (accessibilityDelegateCompatE == null) {
                    accessibilityDelegateCompatE = new AccessibilityDelegateCompat();
                }
                ViewCompat.A(view, accessibilityDelegateCompatE);
                view.setTag(this.f2489a, obj);
                ViewCompat.t(this.d, view);
            }
        }

        public boolean e(Object obj, Object obj2) {
            return !obj2.equals(obj);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api20Impl {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            int i = ViewGroupCompat.f2491a;
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    @RequiresApi
    public static class Api21Impl {
        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets windowInsetsR = windowInsetsCompat.r();
            if (windowInsetsR != null) {
                return WindowInsetsCompat.s(view, view.computeSystemWindowInsets(windowInsetsR, rect));
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        public static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        public static float e(View view) {
            return view.getElevation();
        }

        public static String f(View view) {
            return view.getTransitionName();
        }

        public static float g(View view) {
            return view.getTranslationZ();
        }

        public static float h(View view) {
            return view.getZ();
        }

        public static boolean i(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void j(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void k(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void l(View view, float f) {
            view.setElevation(f);
        }

        public static void m(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        public static void n(final View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener != null ? new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewCompat.Api21Impl.1

                /* renamed from: a, reason: collision with root package name */
                public WindowInsetsCompat f2490a = null;

                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    WindowInsetsCompat windowInsetsCompatS = WindowInsetsCompat.s(view2, windowInsets);
                    int i = Build.VERSION.SDK_INT;
                    OnApplyWindowInsetsListener onApplyWindowInsetsListener3 = onApplyWindowInsetsListener;
                    if (i < 30) {
                        Api21Impl.a(windowInsets, view);
                        if (windowInsetsCompatS.equals(this.f2490a)) {
                            return onApplyWindowInsetsListener3.onApplyWindowInsets(view2, windowInsetsCompatS).r();
                        }
                    }
                    this.f2490a = windowInsetsCompatS;
                    WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = onApplyWindowInsetsListener3.onApplyWindowInsets(view2, windowInsetsCompatS);
                    if (i >= 30) {
                        return windowInsetsCompatOnApplyWindowInsets.r();
                    }
                    WeakHashMap weakHashMap = ViewCompat.f2488a;
                    Api20Impl.c(view2);
                    return windowInsetsCompatOnApplyWindowInsets.r();
                }
            } : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, onApplyWindowInsetsListener2);
            }
            if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
                return;
            }
            if (onApplyWindowInsetsListener2 != null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener2);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            }
        }

        public static void o(View view, String str) {
            view.setTransitionName(str);
        }

        public static void p(View view, float f) {
            view.setTranslationZ(f);
        }

        public static void q(View view, float f) {
            view.setZ(f);
        }

        public static void r(View view) {
            view.stopNestedScroll();
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api23Impl {
        public static WindowInsetsCompat a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompatS = WindowInsetsCompat.s(null, rootWindowInsets);
            WindowInsetsCompat.Impl impl = windowInsetsCompatS.f2500a;
            impl.t(windowInsetsCompatS);
            impl.d(view.getRootView());
            return windowInsetsCompatS;
        }

        public static void b(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api24Impl {
        public static void a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api26Impl {
        public static int a(View view) {
            return view.getImportantForAutofill();
        }

        public static void b(View view, int i) {
            view.setImportantForAutofill(i);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api28Impl {
        public static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void d(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void f(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api29Impl {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api30Impl {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static WindowInsetsControllerCompat c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return new WindowInsetsControllerCompat(windowInsetsController);
            }
            return null;
        }

        public static void d(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static final class Api31Impl {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static ContentInfoCompat b(View view, ContentInfoCompat contentInfoCompat) {
            ContentInfo contentInfoH = contentInfoCompat.f2469a.h();
            Objects.requireNonNull(contentInfoH);
            ContentInfo contentInfoJ = androidx.core.splashscreen.a.j(contentInfoH);
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoJ);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoJ ? contentInfoCompat : new ContentInfoCompat(new ContentInfoCompat.Compat31Impl(contentInfoPerformReceiveContent));
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface FocusDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface FocusRealDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface FocusRelativeDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface NestedScrollType {
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static final class OnReceiveContentListenerAdapter implements android.view.OnReceiveContentListener {
        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            new ContentInfoCompat.Compat31Impl(contentInfo);
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public interface OnUnhandledKeyEventListenerCompat {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface ScrollAxis {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface ScrollIndicators {
    }

    /* loaded from: classes2.dex */
    public static class UnhandledKeyEventManager {
        static {
            new ArrayList();
        }
    }

    public static void A(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (f(view) instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
            accessibilityDelegateCompat = new AccessibilityDelegateCompat();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.b);
    }

    public static void B(View view, boolean z) {
        new AnonymousClass4().d(view, Boolean.valueOf(z));
    }

    public static void C(View view, CharSequence charSequence) {
        new AnonymousClass2().d(view, charSequence);
        AccessibilityPaneVisibilityManager accessibilityPaneVisibilityManager = f;
        if (charSequence == null) {
            accessibilityPaneVisibilityManager.d.remove(view);
            view.removeOnAttachStateChangeListener(accessibilityPaneVisibilityManager);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(accessibilityPaneVisibilityManager);
        } else {
            accessibilityPaneVisibilityManager.d.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(accessibilityPaneVisibilityManager);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(accessibilityPaneVisibilityManager);
            }
        }
    }

    public static void D(View view, ColorStateList colorStateList) {
        Api21Impl.j(view, colorStateList);
    }

    public static void E(View view, PorterDuff.Mode mode) {
        Api21Impl.k(view, mode);
    }

    public static void F(View view, float f2) {
        Api21Impl.l(view, f2);
    }

    public static void G(ViewGroup viewGroup, int i) {
        Api26Impl.b(viewGroup, i);
    }

    public static void H(View view) {
        Api21Impl.m(view, false);
    }

    public static void I(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        Api21Impl.n(view, onApplyWindowInsetsListener);
    }

    public static void J(ViewGroup viewGroup, PointerIconCompat pointerIconCompat) {
        Api24Impl.a(viewGroup, pointerIconCompat != null ? pointerIconCompat.a() : null);
    }

    public static void K(View view, boolean z) {
        new AnonymousClass1().d(view, Boolean.valueOf(z));
    }

    public static void L(ViewGroup viewGroup, int i) {
        Api23Impl.b(viewGroup, i, 3);
    }

    public static void M(SwitchCompat switchCompat, CharSequence charSequence) {
        new AnonymousClass3().d(switchCompat, charSequence);
    }

    public static void N(View view, String str) {
        Api21Impl.o(view, str);
    }

    public static void O(View view, float f2) {
        Api21Impl.p(view, f2);
    }

    public static void P(View view, WindowInsetsAnimationCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(callback != null ? new WindowInsetsAnimationCompat.Impl30.ProxyCallback(callback) : null);
        } else {
            WindowInsetsAnimationCompat.Impl21.l(view, callback);
        }
    }

    public static void Q(View view, float f2) {
        Api21Impl.q(view, f2);
    }

    public static void a(View view, ViewGroup viewGroup) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        Intrinsics.h(view2, "<this>");
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static ViewPropertyAnimatorCompat b(View view) {
        if (f2488a == null) {
            f2488a = new WeakHashMap();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) f2488a.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
        f2488a.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    public static void c(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        Api21Impl.b(view, windowInsetsCompat, rect);
    }

    public static WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsR = windowInsetsCompat.r();
        if (windowInsetsR != null) {
            WindowInsets windowInsetsA = i >= 30 ? Api30Impl.a(view, windowInsetsR) : Api20Impl.a(view, windowInsetsR);
            if (!windowInsetsA.equals(windowInsetsR)) {
                return WindowInsetsCompat.s(view, windowInsetsA);
            }
        }
        return windowInsetsCompat;
    }

    public static AccessibilityDelegateCompat e(View view) {
        View.AccessibilityDelegate accessibilityDelegateF = f(view);
        if (accessibilityDelegateF == null) {
            return null;
        }
        return accessibilityDelegateF instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter ? ((AccessibilityDelegateCompat.AccessibilityDelegateAdapter) accessibilityDelegateF).f2467a : new AccessibilityDelegateCompat(accessibilityDelegateF);
    }

    public static View.AccessibilityDelegate f(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence g(View view) {
        return (CharSequence) new AnonymousClass2().c(view);
    }

    public static ArrayList h(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static ColorStateList i(View view) {
        return Api21Impl.c(view);
    }

    public static PorterDuff.Mode j(View view) {
        return Api21Impl.d(view);
    }

    public static float k(View view) {
        return Api21Impl.e(view);
    }

    public static int l(RecyclerView recyclerView) {
        return Api26Impl.a(recyclerView);
    }

    public static String[] m(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.a(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static WindowInsetsCompat n(View view) {
        return Api23Impl.a(view);
    }

    public static String o(View view) {
        return Api21Impl.f(view);
    }

    public static float p(View view) {
        return Api21Impl.g(view);
    }

    public static WindowInsetsControllerCompat q(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return WindowCompat.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static float r(View view) {
        return Api21Impl.h(view);
    }

    public static boolean s(View view) {
        return Api21Impl.i(view);
    }

    public static void t(int i, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = g(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(g(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(g(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static WindowInsetsCompat u(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsR = windowInsetsCompat.r();
        if (windowInsetsR != null) {
            WindowInsets windowInsetsB = Api20Impl.b(view, windowInsetsR);
            if (!windowInsetsB.equals(windowInsetsR)) {
                return WindowInsetsCompat.s(view, windowInsetsB);
            }
        }
        return windowInsetsCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ContentInfoCompat v(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.b(view, contentInfoCompat);
        }
        OnReceiveContentListener onReceiveContentListener = (OnReceiveContentListener) view.getTag(R.id.tag_on_receive_content_listener);
        OnReceiveContentViewBehavior onReceiveContentViewBehavior = e;
        if (onReceiveContentListener == null) {
            if (view instanceof OnReceiveContentViewBehavior) {
                onReceiveContentViewBehavior = (OnReceiveContentViewBehavior) view;
            }
            return onReceiveContentViewBehavior.a(contentInfoCompat);
        }
        ContentInfoCompat contentInfoCompatA = onReceiveContentListener.a(view, contentInfoCompat);
        if (contentInfoCompatA == null) {
            return null;
        }
        if (view instanceof OnReceiveContentViewBehavior) {
            onReceiveContentViewBehavior = (OnReceiveContentViewBehavior) view;
        }
        return onReceiveContentViewBehavior.a(contentInfoCompatA);
    }

    public static void w(int i, View view) {
        ArrayList arrayListH = h(view);
        for (int i2 = 0; i2 < arrayListH.size(); i2++) {
            if (((AccessibilityNodeInfoCompat.AccessibilityActionCompat) arrayListH.get(i2)).a() == i) {
                arrayListH.remove(i2);
                return;
            }
        }
    }

    public static void x(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, String str, AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null && str == null) {
            w(accessibilityActionCompat.a(), view);
            t(0, view);
            return;
        }
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2 = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, accessibilityActionCompat.b, str, accessibilityViewCommand, accessibilityActionCompat.c);
        AccessibilityDelegateCompat accessibilityDelegateCompatE = e(view);
        if (accessibilityDelegateCompatE == null) {
            accessibilityDelegateCompatE = new AccessibilityDelegateCompat();
        }
        A(view, accessibilityDelegateCompatE);
        w(accessibilityActionCompat2.a(), view);
        h(view).add(accessibilityActionCompat2);
        t(0, view);
    }

    public static void y(View view) {
        Api20Impl.c(view);
    }

    public static void z(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }
}
