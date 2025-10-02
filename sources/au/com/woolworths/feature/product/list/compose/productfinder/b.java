package au.com.woolworths.feature.product.list.compose.productfinder;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;
    public final /* synthetic */ MutableState f;

    public /* synthetic */ b(View view, MutableState mutableState, int i) {
        this.d = i;
        this.e = view;
        this.f = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, au.com.woolworths.feature.product.list.compose.productfinder.c] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, au.com.woolworths.feature.product.list.compose.productfinder.c] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                final int i = 0;
                final View view = this.e;
                final MutableState mutableState = this.f;
                final ?? r4 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: au.com.woolworths.feature.product.list.compose.productfinder.c
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        switch (i) {
                            case 0:
                                WindowInsetsCompat windowInsetsCompatN = ViewCompat.n(view);
                                boolean zQ = windowInsetsCompatN != null ? windowInsetsCompatN.q(8) : true;
                                Timber.f27013a.b("isKeyboardOpen: " + zQ, new Object[0]);
                                mutableState.setValue(zQ ? KeyboardState.d : KeyboardState.e);
                                break;
                            default:
                                WindowInsetsCompat windowInsetsCompatN2 = ViewCompat.n(view);
                                boolean zQ2 = windowInsetsCompatN2 != null ? windowInsetsCompatN2.q(8) : true;
                                Timber.f27013a.b("isKeyboardOpen: " + zQ2, new Object[0]);
                                mutableState.setValue(zQ2 ? au.com.woolworths.feature.product.list.legacy.compose.productfinder.KeyboardState.d : au.com.woolworths.feature.product.list.legacy.compose.productfinder.KeyboardState.e);
                                break;
                        }
                    }
                };
                view.getViewTreeObserver().addOnGlobalLayoutListener(r4);
                return new DisposableEffectResult() { // from class: au.com.woolworths.feature.product.list.compose.productfinder.KeyboardStateKt$keyboardAsState$lambda$4$lambda$3$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        view.getViewTreeObserver().removeOnGlobalLayoutListener(r4);
                    }
                };
            default:
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                final int i2 = 1;
                final View view2 = this.e;
                final MutableState mutableState2 = this.f;
                final ?? r42 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: au.com.woolworths.feature.product.list.compose.productfinder.c
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        switch (i2) {
                            case 0:
                                WindowInsetsCompat windowInsetsCompatN = ViewCompat.n(view2);
                                boolean zQ = windowInsetsCompatN != null ? windowInsetsCompatN.q(8) : true;
                                Timber.f27013a.b("isKeyboardOpen: " + zQ, new Object[0]);
                                mutableState2.setValue(zQ ? KeyboardState.d : KeyboardState.e);
                                break;
                            default:
                                WindowInsetsCompat windowInsetsCompatN2 = ViewCompat.n(view2);
                                boolean zQ2 = windowInsetsCompatN2 != null ? windowInsetsCompatN2.q(8) : true;
                                Timber.f27013a.b("isKeyboardOpen: " + zQ2, new Object[0]);
                                mutableState2.setValue(zQ2 ? au.com.woolworths.feature.product.list.legacy.compose.productfinder.KeyboardState.d : au.com.woolworths.feature.product.list.legacy.compose.productfinder.KeyboardState.e);
                                break;
                        }
                    }
                };
                view2.getViewTreeObserver().addOnGlobalLayoutListener(r42);
                return new DisposableEffectResult() { // from class: au.com.woolworths.feature.product.list.legacy.compose.productfinder.KeyboardStateKt$keyboardAsState$lambda$4$lambda$3$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        view2.getViewTreeObserver().removeOnGlobalLayoutListener(r42);
                    }
                };
        }
    }
}
