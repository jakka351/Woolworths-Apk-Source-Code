package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/compose/LocalOnBackPressedDispatcherOwner;", "", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LocalOnBackPressedDispatcherOwner {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f68a = new DynamicProvidableCompositionLocal(LocalOnBackPressedDispatcherOwner$LocalOnBackPressedDispatcherOwner$1.h);

    public static OnBackPressedDispatcherOwner a(Composer composer) {
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwnerA = (OnBackPressedDispatcherOwner) composer.x(f68a);
        if (onBackPressedDispatcherOwnerA == null) {
            composer.o(544166745);
            onBackPressedDispatcherOwnerA = ViewTreeOnBackPressedDispatcherOwner.a((View) composer.x(AndroidCompositionLocals_androidKt.f));
            composer.l();
        } else {
            composer.o(544164296);
            composer.l();
        }
        if (onBackPressedDispatcherOwnerA != null) {
            composer.o(544164377);
            composer.l();
            return onBackPressedDispatcherOwnerA;
        }
        composer.o(544168748);
        Object baseContext = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = null;
                break;
            }
            if (baseContext instanceof OnBackPressedDispatcherOwner) {
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) baseContext;
        composer.l();
        return onBackPressedDispatcherOwner;
    }
}
