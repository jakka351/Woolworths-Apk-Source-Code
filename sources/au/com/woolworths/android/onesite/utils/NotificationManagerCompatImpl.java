package au.com.woolworths.android.onesite.utils;

import android.app.NotificationChannel;
import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/utils/NotificationManagerCompatImpl;", "Lau/com/woolworths/android/onesite/utils/NotificationManager;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "ChannelPermission", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class NotificationManagerCompatImpl implements NotificationManager {

    /* renamed from: a, reason: collision with root package name */
    public final NotificationManagerCompat f4596a;
    public final Lazy b;
    public final Lazy c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/utils/NotificationManagerCompatImpl$ChannelPermission;", "", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChannelPermission {

        /* renamed from: a, reason: collision with root package name */
        public final String f4597a;
        public final boolean b;

        public ChannelPermission(String str, boolean z) {
            this.f4597a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChannelPermission)) {
                return false;
            }
            ChannelPermission channelPermission = (ChannelPermission) obj;
            return Intrinsics.c(this.f4597a, channelPermission.f4597a) && this.b == channelPermission.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.f4597a.hashCode() * 31);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.j("ChannelPermission(channelId=", this.f4597a, ", isEnabled=", this.b, ")");
        }
    }

    public NotificationManagerCompatImpl(@NotNull Context applicationContext) {
        Intrinsics.h(applicationContext, "applicationContext");
        this.f4596a = new NotificationManagerCompat(applicationContext);
        final int i = 0;
        this.b = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.android.onesite.utils.b
            public final /* synthetic */ NotificationManagerCompatImpl e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return StateFlowKt.a(Boolean.valueOf(this.e.a()));
                    default:
                        List listC = this.e.f4596a.c();
                        Intrinsics.g(listC, "getNotificationChannels(...)");
                        return SharedFlowKt.a(listC.size(), 1, BufferOverflow.e);
                }
            }
        });
        final int i2 = 1;
        this.c = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.android.onesite.utils.b
            public final /* synthetic */ NotificationManagerCompatImpl e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return StateFlowKt.a(Boolean.valueOf(this.e.a()));
                    default:
                        List listC = this.e.f4596a.c();
                        Intrinsics.g(listC, "getNotificationChannels(...)");
                        return SharedFlowKt.a(listC.size(), 1, BufferOverflow.e);
                }
            }
        });
        ProcessLifecycleOwner.l.i.a(new DefaultLifecycleObserver() { // from class: au.com.woolworths.android.onesite.utils.NotificationManagerCompatImpl.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onStart(LifecycleOwner owner) {
                Intrinsics.h(owner, "owner");
                NotificationManagerCompatImpl notificationManagerCompatImpl = NotificationManagerCompatImpl.this;
                List<NotificationChannel> listC = notificationManagerCompatImpl.f4596a.c();
                Intrinsics.g(listC, "getNotificationChannels(...)");
                for (NotificationChannel notificationChannel : listC) {
                    MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) notificationManagerCompatImpl.c.getD();
                    String id = notificationChannel.getId();
                    Intrinsics.g(id, "getId(...)");
                    mutableSharedFlow.f(new ChannelPermission(id, notificationManagerCompatImpl.b(CollectionsKt.Q(notificationChannel.getId()))));
                }
            }
        });
    }

    @Override // au.com.woolworths.android.onesite.utils.NotificationManager
    public final boolean a() {
        return this.f4596a.b.areNotificationsEnabled();
    }

    @Override // au.com.woolworths.android.onesite.utils.NotificationManager
    public final boolean b(List list) {
        NotificationManagerCompat notificationManagerCompat = this.f4596a;
        if (!notificationManagerCompat.b.areNotificationsEnabled()) {
            return false;
        }
        List listC = notificationManagerCompat.c();
        Intrinsics.g(listC, "getNotificationChannels(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (list.contains(((NotificationChannel) obj).getId())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((NotificationChannel) it.next()).getImportance() == 0) {
                return false;
            }
        }
        return true;
    }
}
