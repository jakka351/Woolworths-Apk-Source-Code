package com.google.android.material.motion;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.BackEventCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.window.a;
import java.util.Objects;

@RestrictTo
/* loaded from: classes6.dex */
public final class MaterialBackOrchestrator {

    /* renamed from: a, reason: collision with root package name */
    public final Api33BackCallbackDelegate f14612a;
    public final MaterialBackHandler b;
    public final View c;

    @RequiresApi
    public static class Api33BackCallbackDelegate implements BackCallbackDelegate {

        /* renamed from: a, reason: collision with root package name */
        public OnBackInvokedCallback f14613a;

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        @DoNotInline
        public void a(@NonNull View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f14613a);
            this.f14613a = null;
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        @DoNotInline
        public void b(@NonNull MaterialBackHandler materialBackHandler, @NonNull View view, boolean z) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f14613a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackC = c(materialBackHandler);
                this.f14613a = onBackInvokedCallbackC;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? 1000000 : 0, onBackInvokedCallbackC);
            }
        }

        public OnBackInvokedCallback c(MaterialBackHandler materialBackHandler) {
            Objects.requireNonNull(materialBackHandler);
            return new a(materialBackHandler, 1);
        }
    }

    @RequiresApi
    public static class Api34BackCallbackDelegate extends Api33BackCallbackDelegate {
        @Override // com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate
        public final OnBackInvokedCallback c(final MaterialBackHandler materialBackHandler) {
            return new OnBackAnimationCallback() { // from class: com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.1
                public final void onBackCancelled() {
                    if (Api34BackCallbackDelegate.this.f14613a != null) {
                        materialBackHandler.e();
                    }
                }

                public final void onBackInvoked() {
                    materialBackHandler.d();
                }

                public final void onBackProgressed(BackEvent backEvent) {
                    if (Api34BackCallbackDelegate.this.f14613a != null) {
                        materialBackHandler.c(new BackEventCompat(backEvent));
                    }
                }

                public final void onBackStarted(BackEvent backEvent) {
                    if (Api34BackCallbackDelegate.this.f14613a != null) {
                        materialBackHandler.b(new BackEventCompat(backEvent));
                    }
                }
            };
        }
    }

    public interface BackCallbackDelegate {
        void a(View view);

        void b(MaterialBackHandler materialBackHandler, View view, boolean z);
    }

    public MaterialBackOrchestrator(MaterialBackHandler materialBackHandler, View view) {
        int i = Build.VERSION.SDK_INT;
        this.f14612a = i >= 34 ? new Api34BackCallbackDelegate() : i >= 33 ? new Api33BackCallbackDelegate() : null;
        this.b = materialBackHandler;
        this.c = view;
    }

    public final void a(boolean z) {
        Api33BackCallbackDelegate api33BackCallbackDelegate = this.f14612a;
        if (api33BackCallbackDelegate != null) {
            api33BackCallbackDelegate.b(this.b, this.c, z);
        }
    }

    public final void b() {
        Api33BackCallbackDelegate api33BackCallbackDelegate = this.f14612a;
        if (api33BackCallbackDelegate != null) {
            api33BackCallbackDelegate.a(this.c);
        }
    }
}
