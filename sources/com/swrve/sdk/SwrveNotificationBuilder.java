package com.swrve.sdk;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.swrve.sdk.notifications.model.SwrveNotification;
import com.swrve.sdk.notifications.model.SwrveNotificationButton;
import com.swrve.sdk.notifications.model.SwrveNotificationChannel;
import com.swrve.sdk.notifications.model.SwrveNotificationExpanded;
import com.swrve.sdk.notifications.model.SwrveNotificationMedia;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* loaded from: classes6.dex */
public class SwrveNotificationBuilder {
    public static int m;
    public static int n;

    /* renamed from: a, reason: collision with root package name */
    public final Context f19061a;
    public final NotificationChannel b;
    public final String c;
    public String d;
    public boolean e = false;
    public SwrveNotification f;
    public Bundle g;
    public String h;
    public String i;
    public int j;
    public String k;
    public int l;

    /* renamed from: com.swrve.sdk.SwrveNotificationBuilder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19062a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[SwrveNotificationMedia.MediaType.values().length];
            b = iArr;
            try {
                iArr[SwrveNotificationMedia.MediaType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[SwrveNotification.VisibilityType.values().length];
            f19062a = iArr2;
            try {
                iArr2[SwrveNotification.VisibilityType.PUBLIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19062a[SwrveNotification.VisibilityType.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19062a[SwrveNotification.VisibilityType.SECRET.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public SwrveNotificationBuilder(Context context, SwrveNotificationConfig swrveNotificationConfig) {
        this.f19061a = context;
        swrveNotificationConfig.getClass();
        this.b = swrveNotificationConfig.b;
        this.c = swrveNotificationConfig.c;
        this.j = new Random().nextInt();
        this.l = new Random().nextInt();
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    public final NotificationCompat.Builder a(Bundle bundle, String str) {
        IconCompat iconCompat;
        SwrveNotification swrveNotificationFromJson;
        PendingIntent activity;
        NotificationCompat.Style styleC;
        Bitmap bitmapE;
        h(bundle);
        SwrveNotification swrveNotification = this.f;
        this.h = str;
        this.g = bundle;
        this.f = swrveNotification;
        this.i = "push";
        int i = m;
        Context context = this.f19061a;
        if (i == 0 && n == 0) {
            m = SwrveHelper.g(context);
            int iF = SwrveHelper.f(context);
            n = iF;
            int i2 = m;
            if (i2 > iF) {
                m = iF;
                n = i2;
            }
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, f());
        builder.x.icon = com.woolworths.R.drawable.ic_notification;
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.e = NotificationCompat.Builder.c(this.h);
        builder.q(bigTextStyle);
        builder.r(this.h);
        builder.f = NotificationCompat.Builder.c(this.h);
        boolean z = true;
        builder.k(16, true);
        boolean z2 = false;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), 0);
        ArrayList<NotificationCompat.Action> arrayList = null;
        if (bitmapDecodeResource == null) {
            iconCompat = null;
        } else {
            iconCompat = new IconCompat(1);
            iconCompat.b = bitmapDecodeResource;
        }
        builder.h = iconCompat;
        String str2 = this.c;
        if (!SwrveHelper.p(str2)) {
            try {
                builder.r = Color.parseColor(str2);
            } catch (Exception unused) {
                SwrveLogger.d("Exception getting accent color for notification.", new Object[0]);
            }
        }
        String string = bundle.getString("sound");
        if (!SwrveHelper.p(string)) {
            builder.p(string.equalsIgnoreCase("default") ? RingtoneManager.getDefaultUri(2) : Uri.parse("android.resource://" + context.getApplicationContext().getPackageName() + "/raw/" + string));
        }
        if (swrveNotification != null) {
            if (this.f.getVersion() > 1) {
                SwrveLogger.e("Notification version is greater than version that this sdk can show. Showing default", new Object[0]);
            } else {
                if (SwrveHelper.o(this.f.getTitle())) {
                    this.d = this.f.getTitle();
                    builder.h(this.f.getTitle());
                    this.f.getTitle();
                }
                if (SwrveHelper.o(this.f.getSubtitle())) {
                    builder.m = NotificationCompat.Builder.c(this.f.getSubtitle());
                }
                if (SwrveHelper.o(this.f.getAccent())) {
                    builder.r = Color.parseColor(this.f.getAccent());
                }
                if (SwrveHelper.o(this.f.getIconUrl()) && (bitmapE = e(this.f.getIconUrl())) != null) {
                    IconCompat iconCompat2 = new IconCompat(1);
                    iconCompat2.b = bitmapE;
                    builder.h = iconCompat2;
                }
                if (this.f.getVisibility() != null) {
                    int i3 = AnonymousClass1.f19062a[this.f.getVisibility().ordinal()];
                    if (i3 == 1) {
                        builder.s = 1;
                    } else if (i3 == 2) {
                        builder.s = 0;
                    } else if (i3 != 3) {
                        builder.s = 1;
                    } else {
                        builder.s = -1;
                    }
                }
                if (SwrveHelper.o(this.f.getTicker())) {
                    builder.r(this.f.getTicker());
                }
                NotificationCompat.BigTextStyle bigTextStyleB = b(this.f);
                if (bigTextStyleB != null) {
                    builder.q(bigTextStyleB);
                }
                SwrveNotificationMedia media = this.f.getMedia();
                if (media != null && media.getType() != null && (styleC = c(media.getType(), Boolean.FALSE, this.f)) != null) {
                    builder.q(styleC);
                    g(builder);
                    if (this.e) {
                        this.g.putString("_sd", media.getFallbackSd());
                    }
                }
                SwrveNotification swrveNotification2 = this.f;
                if (SwrveHelper.o(swrveNotification2.getLockScreenMsg())) {
                    builder.r(swrveNotification2.getLockScreenMsg());
                    builder.g(swrveNotification2.getLockScreenMsg());
                    Notification notificationB = builder.b();
                    notificationB.visibility = 1;
                    builder.t = notificationB;
                    builder.r(this.h);
                    if (SwrveHelper.o(swrveNotification2.getTicker())) {
                        builder.r(swrveNotification2.getTicker());
                    }
                    g(builder);
                } else if (swrveNotification2.getVisibility() == SwrveNotification.VisibilityType.PUBLIC) {
                    builder.t = builder.b();
                }
            }
        }
        String string2 = this.g.getString("_sw");
        if (!SwrveHelper.p(string2) && (swrveNotificationFromJson = SwrveNotification.fromJson(string2)) != null && swrveNotificationFromJson.getVersion() <= 1) {
            ArrayList arrayList2 = new ArrayList();
            List<SwrveNotificationButton> buttons = swrveNotificationFromJson.getButtons();
            if (buttons != null && !buttons.isEmpty()) {
                int i4 = 0;
                while (i4 < buttons.size()) {
                    SwrveNotificationButton swrveNotificationButton = buttons.get(i4);
                    String strValueOf = String.valueOf(i4);
                    String title = swrveNotificationButton.getTitle();
                    SwrveNotificationButton.ActionType actionType = swrveNotificationButton.getActionType();
                    String action = swrveNotificationButton.getAction();
                    boolean z3 = actionType == SwrveNotificationButton.ActionType.DISMISS ? z : z2;
                    SwrveCommon.f19047a.y();
                    Intent intent = new Intent(context, (Class<?>) (z3 ? SwrveNotificationEngageReceiver.class : SwrveNotificationEngageActivity.class));
                    intent.addFlags(335609856);
                    intent.putExtra("notification", this.g);
                    intent.putExtra("notification_id", this.j);
                    intent.putExtra("campaign_type", this.i);
                    intent.putExtra("event_payload", (Bundle) null);
                    intent.putExtra(NotificationMessage.NOTIF_KEY_SID, this.g.getString(NotificationMessage.NOTIF_KEY_SID));
                    intent.putExtra("context_id_key", strValueOf);
                    intent.putExtra("action_type", actionType);
                    intent.putExtra("action_url", action);
                    intent.putExtra("button_text", title);
                    if (z3) {
                        int i5 = this.l;
                        this.l = i5 + 1;
                        activity = PendingIntent.getBroadcast(context, i5, intent, 335544320);
                    } else {
                        int i6 = this.l;
                        this.l = i6 + 1;
                        activity = PendingIntent.getActivity(context, i6, intent, 335544320);
                    }
                    arrayList2.add(new NotificationCompat.Action.Builder(null, title, activity, new Bundle()).a());
                    i4++;
                    z = true;
                    z2 = false;
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null && arrayList.size() > 0) {
            for (NotificationCompat.Action action2 : arrayList) {
                if (action2 != null) {
                    builder.b.add(action2);
                }
            }
        }
        if (SwrveHelper.p(this.d)) {
            String string3 = "";
            try {
                PackageManager packageManager = context.getPackageManager();
                CharSequence charSequenceLoadLabel = packageManager.getApplicationInfo(context.getPackageName(), 128).loadLabel(packageManager);
                if (charSequenceLoadLabel != null) {
                    string3 = charSequenceLoadLabel.toString();
                }
            } catch (Exception e) {
                SwrveLogger.c("Exception getting fallback notification title.", e, new Object[0]);
            }
            SwrveLogger.b("No notification title in configured from server payload so using app name:%s", string3);
            builder.h(string3);
        }
        builder.g = d(bundle);
        return builder;
    }

    public final NotificationCompat.BigTextStyle b(SwrveNotification swrveNotification) {
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        SwrveNotificationExpanded expanded = swrveNotification.getExpanded();
        NotificationCompat.BigTextStyle bigTextStyle2 = null;
        if (expanded != null) {
            if (SwrveHelper.o(expanded.getTitle())) {
                bigTextStyle.b = NotificationCompat.Builder.c(expanded.getTitle());
                expanded.getTitle();
                bigTextStyle2 = bigTextStyle;
            }
            if (SwrveHelper.o(expanded.getBody())) {
                bigTextStyle.d(expanded.getBody());
                expanded.getBody();
                return bigTextStyle;
            }
        }
        return bigTextStyle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.core.app.NotificationCompat.Style c(com.swrve.sdk.notifications.model.SwrveNotificationMedia.MediaType r5, java.lang.Boolean r6, com.swrve.sdk.notifications.model.SwrveNotification r7) throws java.lang.Throwable {
        /*
            r4 = this;
            com.swrve.sdk.notifications.model.SwrveNotificationMedia r0 = r7.getMedia()
            r1 = 0
            if (r5 != 0) goto L9
            goto Lc2
        L9:
            int[] r2 = com.swrve.sdk.SwrveNotificationBuilder.AnonymousClass1.b
            int r5 = r5.ordinal()
            r5 = r2[r5]
            r2 = 1
            if (r5 == r2) goto L19
            androidx.core.app.NotificationCompat$BigTextStyle r5 = r4.b(r7)
            return r5
        L19:
            androidx.core.app.NotificationCompat$BigPictureStyle r5 = new androidx.core.app.NotificationCompat$BigPictureStyle
            r5.<init>()
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L50
            java.lang.String r6 = r0.getUrl()
            boolean r6 = com.swrve.sdk.SwrveHelper.o(r6)
            if (r6 == 0) goto Lc2
            java.lang.String r6 = r0.getUrl()
            android.graphics.Bitmap r6 = r4.e(r6)
            if (r6 == 0) goto L45
            androidx.core.graphics.drawable.IconCompat r3 = new androidx.core.graphics.drawable.IconCompat
            r3.<init>(r2)
            r3.b = r6
            r5.e = r3
            r0.getUrl()
            goto L6b
        L45:
            com.swrve.sdk.notifications.model.SwrveNotificationMedia$MediaType r5 = r0.getFallbackType()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            androidx.core.app.NotificationCompat$Style r5 = r4.c(r5, r6, r7)
            return r5
        L50:
            java.lang.String r6 = r0.getFallbackUrl()
            android.graphics.Bitmap r6 = r4.e(r6)
            if (r6 == 0) goto Lc2
            androidx.core.graphics.drawable.IconCompat r3 = new androidx.core.graphics.drawable.IconCompat
            r3.<init>(r2)
            r3.b = r6
            r5.e = r3
            java.lang.String r6 = r0.getFallbackSd()
            if (r6 == 0) goto L6b
            r4.e = r2
        L6b:
            com.swrve.sdk.notifications.model.SwrveNotificationExpanded r6 = r7.getExpanded()
            if (r6 == 0) goto Lc1
            java.lang.String r7 = r6.getIconUrl()
            boolean r7 = com.swrve.sdk.SwrveHelper.o(r7)
            if (r7 == 0) goto L91
            java.lang.String r7 = r6.getIconUrl()
            android.graphics.Bitmap r7 = r4.e(r7)
            if (r7 != 0) goto L86
            goto L8d
        L86:
            androidx.core.graphics.drawable.IconCompat r1 = new androidx.core.graphics.drawable.IconCompat
            r1.<init>(r2)
            r1.b = r7
        L8d:
            r5.f = r1
            r5.g = r2
        L91:
            java.lang.String r7 = r6.getTitle()
            boolean r7 = com.swrve.sdk.SwrveHelper.o(r7)
            if (r7 == 0) goto La8
            java.lang.String r7 = r6.getTitle()
            java.lang.CharSequence r7 = androidx.core.app.NotificationCompat.Builder.c(r7)
            r5.b = r7
            r6.getTitle()
        La8:
            java.lang.String r7 = r6.getBody()
            boolean r7 = com.swrve.sdk.SwrveHelper.o(r7)
            if (r7 == 0) goto Lc1
            java.lang.String r7 = r6.getBody()
            java.lang.CharSequence r7 = androidx.core.app.NotificationCompat.Builder.c(r7)
            r5.c = r7
            r5.d = r2
            r6.getBody()
        Lc1:
            return r5
        Lc2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.SwrveNotificationBuilder.c(com.swrve.sdk.notifications.model.SwrveNotificationMedia$MediaType, java.lang.Boolean, com.swrve.sdk.notifications.model.SwrveNotification):androidx.core.app.NotificationCompat$Style");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    public final PendingIntent d(Bundle bundle) {
        SwrveCommon.f19047a.y();
        Context context = this.f19061a;
        Intent intent = new Intent(context, (Class<?>) SwrveNotificationEngageActivity.class);
        intent.addFlags(335609856);
        intent.putExtra("notification", bundle);
        intent.putExtra("notification_id", this.j);
        intent.putExtra("campaign_type", "push");
        intent.putExtra("event_payload", (Bundle) null);
        intent.putExtra(NotificationMessage.NOTIF_KEY_SID, bundle.getString(NotificationMessage.NOTIF_KEY_SID));
        if (SwrveHelper.o(this.k)) {
            intent.putExtra(NotificationResult.Notification.CAMPAIGN, this.k);
        }
        int i = this.l;
        this.l = i + 1;
        return PendingIntent.getActivity(context, i, intent, 335544320);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ff A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap e(java.lang.String r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.SwrveNotificationBuilder.e(java.lang.String):android.graphics.Bitmap");
    }

    public final String f() {
        NotificationManager notificationManager = (NotificationManager) this.f19061a.getSystemService("notification");
        SwrveNotification swrveNotification = this.f;
        String id = null;
        if (swrveNotification != null) {
            if (SwrveHelper.o(swrveNotification.getChannelId())) {
                String channelId = this.f.getChannelId();
                if (notificationManager.getNotificationChannel(channelId) == null) {
                    SwrveLogger.h("Notification channel %s from push payload does not exist, using params from payload or the default from config.", channelId);
                } else {
                    SwrveLogger.e("Notification channel %s from push payload will be used instead of config.", channelId);
                    id = channelId;
                }
            }
            SwrveNotificationChannel channel = this.f.getChannel();
            if (id == null && channel != null) {
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel(channel.getId());
                String id2 = channel.getId();
                if (notificationChannel != null) {
                    SwrveLogger.e("Notification channel %s from push payload already exists.", id2);
                } else {
                    notificationManager.createNotificationChannel(new NotificationChannel(channel.getId(), channel.getName(), channel.getAndroidImportance()));
                }
                id = id2;
            }
        }
        Object obj = SwrveCommon.f19047a;
        if (obj == null) {
            SwrveLogger.d("Please call SwrveSDK.createInstance first in your Application class.", new Object[0]);
            throw new RuntimeException("Please call SwrveSDK.createInstance first in your Application class.");
        }
        if (id == null && obj != null) {
            NotificationChannel notificationChannel2 = this.b;
            if (notificationManager.getNotificationChannel(notificationChannel2.getId()) == null) {
                SwrveLogger.e("Notification channel from default config[%s] does not exist, creating it", notificationChannel2.getId());
                notificationManager.createNotificationChannel(notificationChannel2);
            }
            id = notificationChannel2.getId();
        }
        if (id == null) {
            SwrveLogger.d("Notification channel could not be found, the swrve notification cannot be shown.", new Object[0]);
        }
        return id;
    }

    public final void g(NotificationCompat.Builder builder) {
        SwrveNotificationMedia media = this.f.getMedia();
        if (media != null) {
            if (SwrveHelper.o(media.getTitle())) {
                this.d = media.getTitle();
                builder.h(media.getTitle());
                media.getTitle();
            }
            if (SwrveHelper.o(media.getSubtitle())) {
                builder.m = NotificationCompat.Builder.c(media.getSubtitle());
            }
            if (SwrveHelper.o(media.getBody())) {
                builder.g(media.getBody());
                media.getBody();
                if (SwrveHelper.p(this.f.getTicker())) {
                    builder.r(media.getBody());
                }
            }
        }
    }

    public final void h(Bundle bundle) {
        SwrveNotification swrveNotificationFromJson;
        this.g = bundle;
        String string = bundle.getString("_sw");
        if (SwrveHelper.o(string)) {
            swrveNotificationFromJson = SwrveNotification.fromJson(string);
            if (swrveNotificationFromJson != null && swrveNotificationFromJson.getNotificationId() > 0) {
                this.j = swrveNotificationFromJson.getNotificationId();
            }
            if (swrveNotificationFromJson != null && swrveNotificationFromJson.getCampaign() != null) {
                this.k = swrveNotificationFromJson.getCampaign().getId();
            }
        } else {
            swrveNotificationFromJson = null;
        }
        this.f = swrveNotificationFromJson;
    }
}
