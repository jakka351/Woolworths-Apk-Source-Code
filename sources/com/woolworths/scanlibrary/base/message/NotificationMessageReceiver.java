package com.woolworths.scanlibrary.base.message;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.base.d;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/base/message/NotificationMessageReceiver;", "Landroid/content/BroadcastReceiver;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NotificationMessageReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f21143a;
    public final MessageReceiverListener b;

    public NotificationMessageReceiver(Context context, MessageReceiverListener listener) {
        Intrinsics.h(listener, "listener");
        this.f21143a = context;
        this.b = listener;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String string;
        Intrinsics.h(context, "context");
        Intrinsics.h(intent, "intent");
        int intExtra = intent.getIntExtra("event", 0);
        String stringExtra = intent.getStringExtra("message");
        if (stringExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bundle bundle = (Bundle) intent.getParcelableExtra("data");
        MessageReceiverListener messageReceiverListener = this.b;
        int iF0 = intExtra & messageReceiverListener.F0();
        if (iF0 == 1) {
            String string2 = context.getString(R.string.sng_label_ok);
            Intrinsics.g(string2, "getString(...)");
            final int i = 0;
            messageReceiverListener.Y3(stringExtra, string2, new Function0(this) { // from class: com.woolworths.scanlibrary.base.message.a
                public final /* synthetic */ NotificationMessageReceiver e;

                {
                    this.e = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            this.e.b.q2();
                            break;
                        default:
                            this.e.b.E1();
                            break;
                    }
                    return Unit.f24250a;
                }
            });
        } else if (iF0 == 4) {
            String string3 = context.getString(R.string.sng_label_ok);
            Intrinsics.g(string3, "getString(...)");
            final int i2 = 1;
            messageReceiverListener.Y3(stringExtra, string3, new Function0(this) { // from class: com.woolworths.scanlibrary.base.message.a
                public final /* synthetic */ NotificationMessageReceiver e;

                {
                    this.e = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            this.e.b.q2();
                            break;
                        default:
                            this.e.b.E1();
                            break;
                    }
                    return Unit.f24250a;
                }
            });
        } else if (iF0 == 8) {
            messageReceiverListener.J();
        } else if (iF0 == 16) {
            messageReceiverListener.D0();
        } else if (iF0 == 32 && bundle != null && (string = bundle.getString("deeplink")) != null) {
            coil3.gif.a aVar = new coil3.gif.a(1, this, string);
            Context context2 = this.f21143a;
            String string4 = context2.getString(R.string.sng_label_open_parking_voucher);
            Intrinsics.g(string4, "getString(...)");
            c cVar = new c(aVar, 10);
            String string5 = context2.getString(R.string.not_now);
            Intrinsics.g(string5, "getString(...)");
            this.b.f(stringExtra, string4, cVar, string5, new d(28));
        }
        abortBroadcast();
    }
}
