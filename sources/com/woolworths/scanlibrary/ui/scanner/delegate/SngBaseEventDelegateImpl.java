package com.woolworths.scanlibrary.ui.scanner.delegate;

import android.content.IntentFilter;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.rewards.base.d;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import com.woolworths.scanlibrary.base.message.MessageReceiverListener;
import com.woolworths.scanlibrary.base.message.NotificationMessageReceiver;
import com.woolworths.scanlibrary.ui.splash.SngInitializerActivity;
import com.woolworths.scanlibrary.ui.tap.TapActivity;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/delegate/SngBaseEventDelegateImpl;", "Lcom/woolworths/scanlibrary/ui/scanner/delegate/SngBaseEventDelegate;", "Lcom/woolworths/scanlibrary/base/message/MessageReceiverListener;", "Landroidx/lifecycle/LifecycleEventObserver;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SngBaseEventDelegateImpl implements SngBaseEventDelegate, MessageReceiverListener, LifecycleEventObserver {
    public WeakReference d;
    public NotificationMessageReceiver e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21333a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21333a = iArr;
        }
    }

    public static void b(SngBaseEventDelegateImpl sngBaseEventDelegateImpl, String str, String str2, Function0 function0, String str3, d dVar, int i) {
        if ((i & 16) != 0) {
            str3 = "";
        }
        Function0 hVar = dVar;
        if ((i & 32) != 0) {
            hVar = new h(20);
        }
        new h(20);
        ComponentActivity componentActivityA = sngBaseEventDelegateImpl.a();
        if (componentActivityA != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(componentActivityA);
            if (!StringsKt.D("")) {
                builder.setTitle("");
            }
            if (!StringsKt.D(str)) {
                builder.setMessage(str);
            }
            builder.setCancelable(true);
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            if (str2.length() > 0) {
                builder.setPositiveButton(str2, new com.woolworths.scanlibrary.ui.home.itemview.views.a(booleanRef, function0, 2));
            }
            if (str3.length() > 0) {
                builder.setNegativeButton(str3, new com.woolworths.scanlibrary.ui.home.itemview.views.a(booleanRef, hVar, 3));
            }
            builder.setOnDismissListener(new a());
            if (componentActivityA.isFinishing()) {
                return;
            }
            builder.show();
        }
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void D0() {
        Timber.f27013a.h("[sng] onEventTriggered: 16", new Object[0]);
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void E1() {
        ComponentActivity componentActivityA = a();
        if (componentActivityA != null) {
            int i = TapActivity.W;
            TapActivity.Companion.a(componentActivityA, null, null, 12);
        }
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final int F0() {
        if (!(a() instanceof SngBaseEvenHost)) {
            return 39;
        }
        KeyEventDispatcher.Component componentA = a();
        Intrinsics.f(componentA, "null cannot be cast to non-null type com.woolworths.scanlibrary.ui.scanner.delegate.SngBaseEvenHost");
        return 39;
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void J() {
        ComponentActivity componentActivityA = a();
        if (componentActivityA != null) {
            int i = TapActivity.W;
            TapActivity.Companion.a(componentActivityA, null, null, 12);
        }
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void O0(String str) {
        ComponentActivity componentActivityA = a();
        if (componentActivityA != null) {
            ContextExtKt.e(componentActivityA, str);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        ComponentActivity componentActivityA;
        int i = WhenMappings.f21333a[event.ordinal()];
        if (i == 1) {
            lifecycleOwner.getD().c(this);
            WeakReference weakReference = this.d;
            if (weakReference != null) {
                weakReference.clear();
                return;
            } else {
                Intrinsics.p("activityRef");
                throw null;
            }
        }
        if (i == 2) {
            ComponentActivity componentActivityA2 = a();
            if (componentActivityA2 != null) {
                NotificationMessageReceiver notificationMessageReceiver = this.e;
                if (notificationMessageReceiver != null) {
                    componentActivityA2.unregisterReceiver(notificationMessageReceiver);
                    return;
                } else {
                    Intrinsics.p("notificationMessageReceiver");
                    throw null;
                }
            }
            return;
        }
        if (i == 3 && (componentActivityA = a()) != null) {
            NotificationMessageReceiver notificationMessageReceiver2 = this.e;
            if (notificationMessageReceiver2 == null) {
                Intrinsics.p("notificationMessageReceiver");
                throw null;
            }
            IntentFilter intentFilter = new IntentFilter("com.woolworths.scanlibrary.messaging.notification");
            intentFilter.setPriority(1);
            ContextCompat.f(componentActivityA, notificationMessageReceiver2, intentFilter, 4);
        }
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void Y3(String str, String str2, Function0 function0) {
        b(this, str, str2, function0, null, null, 113);
    }

    public final ComponentActivity a() {
        WeakReference weakReference = this.d;
        if (weakReference != null) {
            return (ComponentActivity) weakReference.get();
        }
        Intrinsics.p("activityRef");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void f(String str, String str2, c cVar, String str3, d dVar) {
        b(this, str, str2, cVar, str3, dVar, 64);
    }

    @Override // com.woolworths.scanlibrary.base.message.MessageReceiverListener
    public final void q2() {
        ComponentActivity componentActivityA = a();
        if (componentActivityA != null) {
            int i = SngInitializerActivity.G;
            SngInitializerActivity.Companion.a(componentActivityA, false);
        }
    }
}
