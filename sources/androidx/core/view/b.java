package androidx.core.view;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult;
import au.com.woolworths.feature.shop.login.LoginFullPageErrorState;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements LifecycleEventObserver {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.d) {
            case 0:
                MenuHostHelper menuHostHelper = (MenuHostHelper) this.e;
                Runnable runnable = menuHostHelper.f2477a;
                CopyOnWriteArrayList copyOnWriteArrayList = menuHostHelper.b;
                Lifecycle.State state = (Lifecycle.State) this.f;
                MenuProvider menuProvider = (MenuProvider) this.g;
                Lifecycle.Event.INSTANCE.getClass();
                if (event != Lifecycle.Event.Companion.b(state)) {
                    if (event != Lifecycle.Event.ON_DESTROY) {
                        if (event == Lifecycle.Event.Companion.a(state)) {
                            copyOnWriteArrayList.remove(menuProvider);
                            runnable.run();
                            break;
                        }
                    } else {
                        menuHostHelper.c(menuProvider);
                        break;
                    }
                } else {
                    copyOnWriteArrayList.add(menuProvider);
                    runnable.run();
                    break;
                }
                break;
            case 1:
                LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope = (LifecycleResumePauseEffectScope) this.e;
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.f;
                Function1 function1 = (Function1) this.g;
                int i = LifecycleEffectKt.WhenMappings.f2807a[event.ordinal()];
                if (i == 3) {
                    objectRef.d = function1.invoke(lifecycleResumePauseEffectScope);
                    break;
                } else if (i == 4) {
                    LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) objectRef.d;
                    if (lifecyclePauseOrDisposeEffectResult != null) {
                        lifecyclePauseOrDisposeEffectResult.a();
                    }
                    objectRef.d = null;
                    break;
                }
                break;
            case 2:
                LifecycleStartStopEffectScope lifecycleStartStopEffectScope = (LifecycleStartStopEffectScope) this.e;
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.f;
                Function1 function12 = (Function1) this.g;
                int i2 = LifecycleEffectKt.WhenMappings.f2807a[event.ordinal()];
                if (i2 == 1) {
                    objectRef2.d = function12.invoke(lifecycleStartStopEffectScope);
                    break;
                } else if (i2 == 2) {
                    LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) objectRef2.d;
                    if (lifecycleStopOrDisposeEffectResult != null) {
                        lifecycleStopOrDisposeEffectResult.a();
                    }
                    objectRef2.d = null;
                    break;
                }
                break;
            default:
                Function2 function2 = (Function2) this.e;
                LoginFullPageErrorState loginFullPageErrorState = (LoginFullPageErrorState) this.f;
                Context context = (Context) this.g;
                if (event == Lifecycle.Event.ON_START) {
                    function2.invoke(loginFullPageErrorState, loginFullPageErrorState.getE().getText(context).toString());
                    break;
                }
                break;
        }
    }
}
