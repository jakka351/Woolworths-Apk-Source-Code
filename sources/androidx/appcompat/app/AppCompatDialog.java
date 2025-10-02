package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentDialog;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.KeyEventDispatcher;
import com.woolworths.R;

/* loaded from: classes2.dex */
public class AppCompatDialog extends ComponentDialog implements AppCompatCallback {
    public AppCompatDelegate g;
    public final e h;

    public AppCompatDialog(@NonNull Context context) {
        this(context, 0);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().c(view, layoutParams);
    }

    public final AppCompatDelegate c() {
        if (this.g == null) {
            AppCompatDelegate.SerialExecutor serialExecutor = AppCompatDelegate.d;
            this.g = new AppCompatDelegateImpl(getContext(), getWindow(), this, this);
        }
        return this.g;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().q();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        return KeyEventDispatcher.b(this.h, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return c().f(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().m();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().l();
        super.onCreate(bundle);
        c().p();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStop() {
        super.onStop();
        c().u();
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public final void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public final void onSupportActionModeStarted(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public final ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(int i) {
        b();
        c().x(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().E(charSequence);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.appcompat.app.e] */
    public AppCompatDialog(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.h = new KeyEventDispatcher.Component() { // from class: androidx.appcompat.app.e
            @Override // androidx.core.view.KeyEventDispatcher.Component
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.d.d(keyEvent);
            }
        };
        AppCompatDelegate appCompatDelegateC = c();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        appCompatDelegateC.D(i);
        appCompatDelegateC.p();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        b();
        c().y(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        c().E(getContext().getString(i));
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().z(view, layoutParams);
    }
}
