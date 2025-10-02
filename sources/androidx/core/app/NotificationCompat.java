package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class NotificationCompat {

    @RequiresApi
    public static class Api20Impl {
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
    }

    @RequiresApi
    public static class Api31Impl {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface BadgeIconType {
    }

    public static class BigPictureStyle extends Style {
        public IconCompat e;
        public IconCompat f;
        public boolean g;

        @RequiresApi
        public static class Api23Impl {
            @RequiresApi
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        @RequiresApi
        public static class Api31Impl {
            @RequiresApi
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @RequiresApi
            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @RequiresApi
            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Bitmap bitmap;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).b).setBigContentTitle(this.b);
            IconCompat iconCompat = this.e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    Api31Impl.a(bigContentTitle, iconCompat.d(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f2404a));
                } else {
                    int type = iconCompat.f2436a;
                    if (type == -1) {
                        type = ((Icon) iconCompat.b).getType();
                    }
                    if (type == 1) {
                        IconCompat iconCompat2 = this.e;
                        int i = iconCompat2.f2436a;
                        if (i == -1) {
                            Object obj = iconCompat2.b;
                            bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                        } else if (i == 1) {
                            bitmap = (Bitmap) iconCompat2.b;
                        } else {
                            if (i != 5) {
                                throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                            }
                            Bitmap bitmap2 = (Bitmap) iconCompat2.b;
                            int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            Paint paint = new Paint(3);
                            float f = iMin;
                            float f2 = 0.5f * f;
                            float f3 = 0.9166667f * f2;
                            float f4 = 0.010416667f * f;
                            paint.setColor(0);
                            paint.setShadowLayer(f4, BitmapDescriptorFactory.HUE_RED, f * 0.020833334f, 1023410176);
                            canvas.drawCircle(f2, f2, f3, paint);
                            paint.setShadowLayer(f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 503316480);
                            canvas.drawCircle(f2, f2, f3, paint);
                            paint.clearShadowLayer();
                            paint.setColor(-16777216);
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = new Matrix();
                            matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                            bitmapShader.setLocalMatrix(matrix);
                            paint.setShader(bitmapShader);
                            canvas.drawCircle(f2, f2, f3, paint);
                            canvas.setBitmap(null);
                            bitmap = bitmapCreateBitmap;
                        }
                        bigContentTitle = bigContentTitle.bigPicture(bitmap);
                    }
                }
            }
            if (this.g) {
                IconCompat iconCompat3 = this.f;
                if (iconCompat3 == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    Api23Impl.a(bigContentTitle, iconCompat3.d(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f2404a));
                }
            }
            if (this.d) {
                bigContentTitle.setSummaryText(this.c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                Api31Impl.c(bigContentTitle, false);
                Api31Impl.b(bigContentTitle, null);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }
    }

    public static class BigTextStyle extends Style {
        public CharSequence e;

        @Override // androidx.core.app.NotificationCompat.Style
        public final void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).b).setBigContentTitle(this.b).bigText(this.e);
            if (this.d) {
                bigTextStyleBigText.setSummaryText(this.c);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public final void d(String str) {
            this.e = Builder.c(str);
        }
    }

    public static final class BubbleMetadata {

        @RequiresApi
        public static class Api29Impl {
        }

        @RequiresApi
        public static class Api30Impl {
        }

        public static final class Builder {
        }
    }

    public static class CallStyle extends Style {

        @RequiresApi
        public static class Api20Impl {
        }

        @RequiresApi
        public static class Api21Impl {
            public static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        @RequiresApi
        public static class Api23Impl {
        }

        @RequiresApi
        public static class Api24Impl {
        }

        @RequiresApi
        public static class Api28Impl {
        }

        @RequiresApi
        public static class Api31Impl {
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface CallType {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", 0);
            bundle.putBoolean("android.callIsVideo", false);
            bundle.putCharSequence("android.verificationText", null);
            bundle.putParcelable("android.answerIntent", null);
            bundle.putParcelable("android.declineIntent", null);
            bundle.putParcelable("android.hangUpIntent", null);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 31) {
                if (Log.isLoggable("NotifCompat", 3)) {
                    Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(0));
                    return;
                }
                return;
            }
            Notification.Builder builder = ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).b;
            builder.setContentTitle(null);
            Bundle bundle = this.f2402a.q;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.f2402a.q.getCharSequence("android.text");
            builder.setContentText(charSequence != null ? charSequence : null);
            Api21Impl.a(builder, "call");
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }
    }

    public static final class CarExtender implements Extender {

        @RequiresApi
        public static class Api20Impl {
        }

        @RequiresApi
        public static class Api29Impl {
        }

        @Deprecated
        public static class UnreadConversation {

            public static class Builder {
            }
        }
    }

    public static class DecoratedCustomViewStyle extends Style {

        @RequiresApi
        public static class Api24Impl {
            public static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).b.setStyle(Api24Impl.a());
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final String c() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }
    }

    public interface Extender {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface GroupAlertBehavior {
    }

    public static class InboxStyle extends Style {
        @Override // androidx.core.app.NotificationCompat.Style
        public final void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).b).setBigContentTitle(this.b);
            if (this.d) {
                bigContentTitle.setSummaryText(this.c);
            }
            throw null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public static class MessagingStyle extends Style {
        public Boolean e;

        @RequiresApi
        public static class Api24Impl {
        }

        @RequiresApi
        public static class Api26Impl {
        }

        @RequiresApi
        public static class Api28Impl {
        }

        public static final class Message {

            @RequiresApi
            public static class Api24Impl {
            }

            @RequiresApi
            public static class Api28Impl {
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void a(Bundle bundle) {
            super.a(bundle);
            throw null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Boolean bool;
            Builder builder = this.f2402a;
            boolean zBooleanValue = false;
            if ((builder == null || builder.f2401a.getApplicationInfo().targetSdkVersion >= 28 || this.e != null) && (bool = this.e) != null) {
                zBooleanValue = bool.booleanValue();
            }
            this.e = Boolean.valueOf(zBooleanValue);
            throw null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final String c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NotificationVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ServiceNotificationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface StreamType {
    }

    public static abstract class Style {

        /* renamed from: a, reason: collision with root package name */
        public Builder f2402a;
        public CharSequence b;
        public CharSequence c;
        public boolean d = false;

        @RequiresApi
        public static class Api24Impl {
        }

        public void a(Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        public String c() {
            return null;
        }
    }

    public static final class TvExtender implements Extender {
    }

    public static final class WearableExtender implements Extender {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f2403a;
        public ArrayList b;

        @RequiresApi
        public static class Api20Impl {
        }

        @RequiresApi
        public static class Api23Impl {
        }

        @RequiresApi
        public static class Api24Impl {
        }

        @RequiresApi
        public static class Api31Impl {
        }

        public final Object clone() {
            WearableExtender wearableExtender = new WearableExtender();
            wearableExtender.f2403a = new ArrayList();
            wearableExtender.b = new ArrayList();
            wearableExtender.f2403a = new ArrayList(this.f2403a);
            wearableExtender.b = new ArrayList(this.b);
            return wearableExtender;
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static class Action {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f2399a;
        public IconCompat b;
        public final RemoteInput[] c;
        public final boolean d;
        public final boolean e;
        public final int f;
        public final CharSequence g;
        public final PendingIntent h;

        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            public final IconCompat f2400a;
            public final CharSequence b;
            public final PendingIntent c;
            public final boolean d;
            public final Bundle e;
            public final ArrayList f = null;
            public final boolean g;

            @RequiresApi
            public static class Api20Impl {
            }

            @RequiresApi
            public static class Api23Impl {
            }

            @RequiresApi
            public static class Api24Impl {
            }

            @RequiresApi
            public static class Api28Impl {
            }

            @RequiresApi
            public static class Api29Impl {
            }

            @RequiresApi
            public static class Api31Impl {
            }

            public Builder(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
                this.d = true;
                this.g = true;
                this.f2400a = iconCompat;
                this.b = Builder.c(charSequence);
                this.c = pendingIntent;
                this.e = bundle;
                this.d = true;
                this.g = true;
            }

            public final Action a() {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = this.f;
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        RemoteInput remoteInput = (RemoteInput) it.next();
                        remoteInput.getClass();
                        arrayList2.add(remoteInput);
                    }
                }
                return new Action(this.f2400a, this.b, this.c, this.e, arrayList2.isEmpty() ? null : (RemoteInput[]) arrayList2.toArray(new RemoteInput[arrayList2.size()]), arrayList.isEmpty() ? null : (RemoteInput[]) arrayList.toArray(new RemoteInput[arrayList.size()]), this.d, this.g);
            }
        }

        public interface Extender {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        public static final class WearableExtender implements Extender {
            public final Object clone() {
                return new WearableExtender();
            }
        }

        public Action(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.a(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, null, true, true);
        }

        public final IconCompat a() {
            int i;
            if (this.b == null && (i = this.f) != 0) {
                this.b = IconCompat.a(null, "", i);
            }
            return this.b;
        }

        public Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, boolean z2) {
            this.e = true;
            this.b = iconCompat;
            if (iconCompat != null) {
                int i = iconCompat.f2436a;
                if ((i == -1 ? ((Icon) iconCompat.b).getType() : i) == 2) {
                    this.f = iconCompat.b();
                }
            }
            this.g = Builder.c(charSequence);
            this.h = pendingIntent;
            this.f2399a = bundle == null ? new Bundle() : bundle;
            this.c = remoteInputArr;
            this.d = z;
            this.e = z2;
        }
    }

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Context f2401a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public CharSequence e;
        public CharSequence f;
        public PendingIntent g;
        public IconCompat h;
        public int i;
        public int j;
        public boolean k;
        public Style l;
        public CharSequence m;
        public boolean n;
        public boolean o;
        public boolean p;
        public Bundle q;
        public int r;
        public int s;
        public Notification t;
        public String u;
        public long v;
        public final boolean w;
        public final Notification x;
        public final ArrayList y;

        @RequiresApi
        public static class Api21Impl {
            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
                return builder.setContentType(i);
            }

            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
                return builder.setUsage(i);
            }
        }

        @RequiresApi
        public static class Api23Impl {
        }

        @RequiresApi
        public static class Api24Impl {
        }

        public Builder(Context context, String str) {
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.k = true;
            this.n = false;
            this.r = 0;
            this.s = 0;
            Notification notification = new Notification();
            this.x = notification;
            this.f2401a = context;
            this.u = str;
            notification.when = System.currentTimeMillis();
            notification.audioStreamType = -1;
            this.j = 0;
            this.y = new ArrayList();
            this.w = true;
        }

        public static CharSequence c(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public final void a(int i, String str, PendingIntent pendingIntent) {
            this.b.add(new Action(i, str, pendingIntent));
        }

        public final Notification b() {
            Bundle bundle;
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
            Builder builder = notificationCompatBuilder.c;
            Style style = builder.l;
            if (style != null) {
                style.b(notificationCompatBuilder);
            }
            Notification notificationBuild = notificationCompatBuilder.b.build();
            if (style != null) {
                builder.l.getClass();
            }
            if (style != null && (bundle = notificationBuild.extras) != null) {
                style.a(bundle);
            }
            return notificationBuild;
        }

        public final void d(boolean z) {
            k(16, z);
        }

        public final void e(String str) {
            this.u = str;
        }

        public final void f(PendingIntent pendingIntent) {
            this.g = pendingIntent;
        }

        public final void g(String str) {
            this.f = c(str);
        }

        public final void h(String str) {
            this.e = c(str);
        }

        public final void i(int i) {
            Notification notification = this.x;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
        }

        public final void j(PendingIntent pendingIntent) {
            this.x.deleteIntent = pendingIntent;
        }

        public final void k(int i, boolean z) {
            Notification notification = this.x;
            if (z) {
                notification.flags = i | notification.flags;
            } else {
                notification.flags = (~i) & notification.flags;
            }
        }

        public final void l() {
            this.n = true;
        }

        public final void m(int i) {
            this.j = i;
        }

        public final void n() {
            this.k = true;
        }

        public final void o(int i) {
            this.x.icon = i;
        }

        public final void p(Uri uri) {
            Notification notification = this.x;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = Api21Impl.a(Api21Impl.d(Api21Impl.c(Api21Impl.b(), 4), 5));
        }

        public final void q(Style style) {
            if (this.l != style) {
                this.l = style;
                if (style == null || style.f2402a == this) {
                    return;
                }
                style.f2402a = this;
                q(style);
            }
        }

        public final void r(CharSequence charSequence) {
            this.x.tickerText = c(charSequence);
        }

        public final void s(long j) {
            this.v = j;
        }

        public final void t(long j) {
            this.x.when = j;
        }

        @Deprecated
        public Builder(Context context) {
            this(context, null);
        }
    }
}
