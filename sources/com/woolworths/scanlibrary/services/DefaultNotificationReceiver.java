package com.woolworths.scanlibrary.services;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.woolworths.R;
import com.woolworths.scanlibrary.ui.entry.SngEntryActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/services/DefaultNotificationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DefaultNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intent intent2;
        String stringExtra = intent != null ? intent.getStringExtra("message") : null;
        String string = context != null ? context.getString(R.string.sng_app_name) : null;
        Bundle bundleExtra = intent != null ? intent.getBundleExtra("data") : null;
        String string2 = bundleExtra != null ? bundleExtra.getString("event") : null;
        String string3 = bundleExtra != null ? bundleExtra.getString("deeplink") : null;
        if (!Intrinsics.c(string2, "parking_voucher_ready") || string3 == null || StringsKt.D(string3)) {
            Intent intent3 = new Intent(context != null ? context.getApplicationContext() : null, (Class<?>) SngEntryActivity.class);
            intent3.addFlags(872448000);
            intent2 = intent3;
        } else {
            intent2 = new Intent("android.intent.action.VIEW", Uri.parse(string3));
        }
        PendingIntent activity = PendingIntent.getActivity(context, 9999, intent2, 201326592);
        Intrinsics.e(context);
        Intrinsics.e(activity);
        Object systemService = context.getSystemService("notification");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        String string4 = context.getString(R.string.sng_label_channel_updates);
        Intrinsics.g(string4, "getString(...)");
        String string5 = context.getString(R.string.sng_label_channel_updates);
        Intrinsics.g(string5, "getString(...)");
        notificationManager.createNotificationChannel(new NotificationChannel(string4, string5, 3));
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, string4);
        builder.x.icon = 2131232163;
        builder.k(16, true);
        builder.e = NotificationCompat.Builder.c(string);
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.e = NotificationCompat.Builder.c(stringExtra);
        builder.q(bigTextStyle);
        builder.g = activity;
        notificationManager.notify(100, builder.b());
    }
}
