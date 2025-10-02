package androidx.core.app;

import android.app.Notification;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.core.app.RemoteInput;
import androidx.core.graphics.drawable.IconCompat;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@RestrictTo
/* loaded from: classes2.dex */
class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2404a;
    public final Notification.Builder b;
    public final NotificationCompat.Builder c;
    public final Bundle d;

    @RequiresApi
    public static class Api20Impl {
    }

    @RequiresApi
    public static class Api21Impl {
    }

    @RequiresApi
    public static class Api23Impl {
    }

    @RequiresApi
    public static class Api24Impl {
    }

    @RequiresApi
    public static class Api26Impl {
    }

    @RequiresApi
    public static class Api28Impl {
    }

    @RequiresApi
    public static class Api29Impl {
        public static void a(Notification.Builder builder, boolean z) {
            builder.setAllowSystemGeneratedContextualActions(z);
        }

        public static void b(Notification.Builder builder) {
            builder.setBubbleMetadata(null);
        }

        public static void c(Notification.Action.Builder builder) {
            builder.setContextual(false);
        }
    }

    @RequiresApi
    public static class Api31Impl {
        public static void a(Notification.Action.Builder builder) {
            builder.setAuthenticationRequired(false);
        }
    }

    public NotificationCompatBuilder(NotificationCompat.Builder builder) {
        Bundle[] bundleArr;
        new ArrayList();
        this.d = new Bundle();
        this.c = builder;
        Context context = builder.f2401a;
        ArrayList arrayList = builder.d;
        this.f2404a = context;
        Notification.Builder builder2 = new Notification.Builder(context, builder.u);
        this.b = builder2;
        Notification notification = builder.x;
        Bundle[] bundleArr2 = null;
        int i = 2;
        int i2 = 0;
        builder2.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.e).setContentText(builder.f).setContentInfo(null).setContentIntent(builder.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(builder.i).setProgress(0, 0, false);
        IconCompat iconCompat = builder.h;
        builder2.setLargeIcon(iconCompat == null ? null : iconCompat.d(context));
        builder2.setSubText(builder.m).setUsesChronometer(false).setPriority(builder.j);
        NotificationCompat.Style style = builder.l;
        if (style instanceof NotificationCompat.CallStyle) {
            NotificationCompat.CallStyle callStyle = (NotificationCompat.CallStyle) style;
            int color = callStyle.f2402a.f2401a.getColor(R.color.call_notification_decline_color);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) callStyle.f2402a.f2401a.getResources().getString(R.string.call_notification_hang_up_action));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, spannableStringBuilder.length(), 18);
            Context context2 = callStyle.f2402a.f2401a;
            PorterDuff.Mode mode = IconCompat.k;
            context2.getClass();
            NotificationCompat.Action actionA = new NotificationCompat.Action.Builder(IconCompat.a(context2.getResources(), context2.getPackageName(), R.drawable.ic_call_decline), spannableStringBuilder, null, new Bundle()).a();
            actionA.f2399a.putBoolean("key_action_priority", true);
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(actionA);
            ArrayList arrayList3 = callStyle.f2402a.b;
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    NotificationCompat.Action action = (NotificationCompat.Action) it.next();
                    action.getClass();
                    if (!action.f2399a.getBoolean("key_action_priority") && i > 1) {
                        arrayList2.add(action);
                        i--;
                    }
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                b((NotificationCompat.Action) it2.next());
            }
        } else {
            Iterator it3 = builder.b.iterator();
            while (it3.hasNext()) {
                b((NotificationCompat.Action) it3.next());
            }
        }
        Bundle bundle = builder.q;
        if (bundle != null) {
            this.d.putAll(bundle);
        }
        this.b.setShowWhen(builder.k);
        this.b.setLocalOnly(builder.n);
        this.b.setGroup(null);
        this.b.setSortKey(null);
        this.b.setGroupSummary(false);
        this.b.setCategory(null);
        this.b.setColor(builder.r);
        this.b.setVisibility(builder.s);
        this.b.setPublicVersion(builder.t);
        this.b.setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList4 = builder.y;
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                this.b.addPerson((String) it4.next());
            }
        }
        if (arrayList.size() > 0) {
            if (builder.q == null) {
                builder.q = new Bundle();
            }
            Bundle bundle2 = builder.q.getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            int i3 = 0;
            while (i3 < arrayList.size()) {
                String string = Integer.toString(i3);
                NotificationCompat.Action action2 = (NotificationCompat.Action) arrayList.get(i3);
                Bundle bundle5 = new Bundle();
                IconCompat iconCompatA = action2.a();
                Bundle bundle6 = action2.f2399a;
                bundle5.putInt(BarcodePickDeserializer.FIELD_ICON, iconCompatA != null ? iconCompatA.b() : i2);
                bundle5.putCharSequence("title", action2.g);
                bundle5.putParcelable("actionIntent", action2.h);
                Bundle bundle7 = bundle6 != null ? new Bundle(bundle6) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", action2.d);
                bundle5.putBundle("extras", bundle7);
                RemoteInput[] remoteInputArr = action2.c;
                if (remoteInputArr == null) {
                    bundleArr = bundleArr2;
                } else {
                    bundleArr = new Bundle[remoteInputArr.length];
                    while (i2 < remoteInputArr.length) {
                        RemoteInput remoteInput = remoteInputArr[i2];
                        ArrayList arrayList5 = arrayList;
                        Bundle bundle8 = new Bundle();
                        remoteInput.getClass();
                        bundle8.putString("resultKey", null);
                        bundle8.putCharSequence(AnnotatedPrivateKey.LABEL, null);
                        bundle8.putCharSequenceArray("choices", null);
                        int i4 = i2;
                        bundle8.putBoolean("allowFreeFormInput", false);
                        bundle8.putBundle("extras", null);
                        bundleArr[i4] = bundle8;
                        i2 = i4 + 1;
                        arrayList = arrayList5;
                        i3 = i3;
                    }
                }
                ArrayList arrayList6 = arrayList;
                int i5 = i3;
                bundle5.putParcelableArray("remoteInputs", bundleArr);
                bundle5.putBoolean("showsUserInterface", action2.e);
                bundle5.putInt("semanticAction", 0);
                bundle4.putBundle(string, bundle5);
                i3 = i5 + 1;
                arrayList = arrayList6;
                bundleArr2 = null;
                i2 = 0;
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            if (builder.q == null) {
                builder.q = new Bundle();
            }
            builder.q.putBundle("android.car.EXTENSIONS", bundle2);
            this.d.putBundle("android.car.EXTENSIONS", bundle3);
        }
        this.b.setExtras(builder.q);
        this.b.setRemoteInputHistory(null);
        this.b.setBadgeIconType(0);
        this.b.setSettingsText(null);
        this.b.setShortcutId(null);
        this.b.setTimeoutAfter(builder.v);
        this.b.setGroupAlertBehavior(0);
        if (builder.p) {
            this.b.setColorized(builder.o);
        }
        if (!TextUtils.isEmpty(builder.u)) {
            this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it5 = builder.c.iterator();
        while (it5.hasNext()) {
            Person person = (Person) it5.next();
            Notification.Builder builder3 = this.b;
            person.getClass();
            builder3.addPerson(new Person.Builder().setName(null).setIcon(null).setUri(null).setKey(null).setBot(false).setImportant(false).build());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.a(this.b, builder.w);
            Api29Impl.b(this.b);
        }
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public final Notification.Builder a() {
        return this.b;
    }

    public final void b(NotificationCompat.Action action) {
        IconCompat iconCompatA = action.a();
        boolean z = action.d;
        Bundle bundle = action.f2399a;
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatA != null ? iconCompatA.d(null) : null, action.g, action.h);
        RemoteInput[] remoteInputArr = action.c;
        if (remoteInputArr != null) {
            android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
            for (int i = 0; i < remoteInputArr.length; i++) {
                remoteInputArr[i].getClass();
                RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
                if (Build.VERSION.SDK_INT >= 29) {
                    RemoteInput.Api29Impl.a(builderAddExtras);
                }
                remoteInputArr2[i] = builderAddExtras.build();
            }
            for (android.app.RemoteInput remoteInput : remoteInputArr2) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        int i2 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(z);
        bundle2.putInt("android.support.action.semanticAction", 0);
        builder.setSemanticAction(0);
        if (i2 >= 29) {
            Api29Impl.c(builder);
        }
        if (i2 >= 31) {
            Api31Impl.a(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", action.e);
        builder.addExtras(bundle2);
        this.b.addAction(builder.build());
    }
}
