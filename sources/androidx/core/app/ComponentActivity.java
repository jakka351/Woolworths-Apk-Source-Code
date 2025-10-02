package androidx.core.app;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001$B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00122\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0004¢\u0006\u0004\b\u001a\u0010\u001bR.\u0010\u001d\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\f\u0012\u0004\u0012\u00020\u00060\u001c8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\u0005R\u001a\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010\u0005¨\u0006%"}, d2 = {"Landroidx/core/app/ComponentActivity;", "Landroid/app/Activity;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/core/view/KeyEventDispatcher$Component;", "<init>", "()V", "Landroidx/core/app/ComponentActivity$ExtraData;", "extraData", "", "putExtraData", "(Landroidx/core/app/ComponentActivity$ExtraData;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Class;", "extraDataClass", "getExtraData", "(Ljava/lang/Class;)Landroidx/core/app/ComponentActivity$ExtraData;", "Landroid/view/KeyEvent;", "event", "", "superDispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "dispatchKeyEvent", "", "", "args", "shouldDumpInternalState", "([Ljava/lang/String;)Z", "Landroidx/collection/SimpleArrayMap;", "extraDataMap", "Landroidx/collection/SimpleArrayMap;", "getExtraDataMap$annotations", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycleRegistry$annotations", "ExtraData", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public class ComponentActivity extends Activity implements LifecycleOwner, KeyEventDispatcher.Component {

    @NotNull
    private final SimpleArrayMap<Class<? extends ExtraData>, ExtraData> extraDataMap = new SimpleArrayMap<>(0);

    @NotNull
    private final LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this, true);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/core/app/ComponentActivity$ExtraData;", "", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Deprecated
    @RestrictTo
    /* loaded from: classes2.dex */
    public static class ExtraData {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.h(event, "event");
        Intrinsics.g(getWindow().getDecorView(), "window.decorView");
        KeyEventDispatcher.a();
        return KeyEventDispatcher.b(this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(@NotNull KeyEvent event) {
        Intrinsics.h(event, "event");
        Intrinsics.g(getWindow().getDecorView(), "window.decorView");
        KeyEventDispatcher.a();
        return super.dispatchKeyShortcutEvent(event);
    }

    @Deprecated
    @RestrictTo
    @Nullable
    public <T extends ExtraData> T getExtraData(@NotNull Class<T> extraDataClass) {
        Intrinsics.h(extraDataClass, "extraDataClass");
        return (T) this.extraDataMap.get(extraDataClass);
    }

    /* renamed from: getLifecycle */
    public Lifecycle getD() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = ReportFragment.e;
        ReportFragment.Companion.b(this);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        finish();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.h(outState, "outState");
        this.lifecycleRegistry.h(Lifecycle.State.f);
        super.onSaveInstanceState(outState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    @RestrictTo
    public void putExtraData(@NotNull ExtraData extraData) {
        Intrinsics.h(extraData, "extraData");
        this.extraDataMap.put(extraData.getClass(), extraData);
    }

    public void s4() {
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldDumpInternalState(@org.jetbrains.annotations.Nullable java.lang.String[] r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L56
            int r2 = r4.length
            if (r2 != 0) goto L8
            goto L56
        L8:
            r4 = r4[r1]
            int r2 = r4.hashCode()
            switch(r2) {
                case -645125871: goto L46;
                case 100470631: goto L36;
                case 472614934: goto L2d;
                case 1159329357: goto L1d;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L56
        L12:
            java.lang.String r2 = "--autofill"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L1b
            goto L56
        L1b:
            r1 = r0
            goto L56
        L1d:
            java.lang.String r2 = "--contentcapture"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L26
            goto L56
        L26:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 < r2) goto L56
            goto L1b
        L2d:
            java.lang.String r2 = "--list-dumpables"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L3f
            goto L56
        L36:
            java.lang.String r2 = "--dump-dumpable"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L3f
            goto L56
        L3f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r4 < r2) goto L56
            goto L1b
        L46:
            java.lang.String r2 = "--translation"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L4f
            goto L56
        L4f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r4 < r2) goto L56
            goto L1b
        L56:
            r4 = r1 ^ 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.ComponentActivity.shouldDumpInternalState(java.lang.String[]):boolean");
    }

    @Override // androidx.core.view.KeyEventDispatcher.Component
    @RestrictTo
    public boolean superDispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.h(event, "event");
        return super.dispatchKeyEvent(event);
    }

    public void w0() {
        finish();
    }

    public void w3() {
        finish();
    }

    public Context zza() {
        return getApplicationContext();
    }

    public void onDismiss() {
        finish();
    }
}
