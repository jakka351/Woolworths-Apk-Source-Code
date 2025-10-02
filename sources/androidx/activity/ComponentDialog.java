package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateRegistryController;
import androidx.os.SavedStateRegistryOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/activity/ComponentDialog;", "Landroid/app/Dialog;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroidx/savedstate/SavedStateRegistryOwner;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class ComponentDialog extends Dialog implements LifecycleOwner, OnBackPressedDispatcherOwner, SavedStateRegistryOwner {
    public LifecycleRegistry d;
    public final SavedStateRegistryController e;
    public final OnBackPressedDispatcher f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ComponentDialog(@NotNull Context context) {
        this(context, 0);
        Intrinsics.h(context, "context");
    }

    public static void a(ComponentDialog componentDialog) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.h(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        Intrinsics.e(window);
        View decorView = window.getDecorView();
        Intrinsics.g(decorView, "window!!.decorView");
        ViewTreeLifecycleOwner.b(decorView, this);
        Window window2 = getWindow();
        Intrinsics.e(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.g(decorView2, "window!!.decorView");
        decorView2.setTag(com.woolworths.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        Intrinsics.e(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.g(decorView3, "window!!.decorView");
        ViewTreeSavedStateRegistryOwner.b(decorView3, this);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* renamed from: getLifecycle */
    public final Lifecycle getD() {
        LifecycleRegistry lifecycleRegistry = this.d;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(this, true);
        this.d = lifecycleRegistry2;
        return lifecycleRegistry2;
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    /* renamed from: getOnBackPressedDispatcher, reason: from getter */
    public final OnBackPressedDispatcher getD() {
        return this.f;
    }

    @Override // androidx.os.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.e.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f.d();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.g(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            OnBackPressedDispatcher onBackPressedDispatcher = this.f;
            onBackPressedDispatcher.e = onBackInvokedDispatcher;
            onBackPressedDispatcher.e(onBackPressedDispatcher.g);
        }
        this.e.a(bundle);
        LifecycleRegistry lifecycleRegistry = this.d;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this, true);
            this.d = lifecycleRegistry;
        }
        lifecycleRegistry.f(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.g(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.e.b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        LifecycleRegistry lifecycleRegistry = this.d;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this, true);
            this.d = lifecycleRegistry;
        }
        lifecycleRegistry.f(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        LifecycleRegistry lifecycleRegistry = this.d;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this, true);
            this.d = lifecycleRegistry;
        }
        lifecycleRegistry.f(Lifecycle.Event.ON_DESTROY);
        this.d = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentDialog(Context context, int i) {
        super(context, i);
        Intrinsics.h(context, "context");
        this.e = SavedStateRegistryController.Companion.a(this);
        this.f = new OnBackPressedDispatcher(new f(this, 2));
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.h(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.h(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
