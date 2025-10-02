package me.oriient.ipssdk.realtime.ips;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.api.listeners.IPSRegionsListener;
import me.oriient.ipssdk.api.models.IPSCancelable;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.api.models.IPSRegion;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.common.services.rest.CancellableRestRequest;
import me.oriient.ipssdk.common.utils.runtimedata.CommonRuntimeDataProvider;
import me.oriient.ipssdk.realtime.ofs.AbstractC1685m0;
import me.oriient.ipssdk.realtime.ofs.J4;
import me.oriient.ipssdk.realtime.ofs.L4;
import me.oriient.ipssdk.realtime.services.rest.ContentRestService;
import me.oriient.ipssdk.realtime.services.rest.IRegionsListener;
import me.oriient.ipssdk.realtime.utils.models.Region;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/RegionsManager;", "", "", "buildingId", "<init>", "(Ljava/lang/String;)V", "toCopy", "(Lme/oriient/ipssdk/realtime/ips/RegionsManager;)V", "Lme/oriient/ipssdk/base/auth/User;", "user", "", "setUser", "(Lme/oriient/ipssdk/base/auth/User;)V", "teardown", "()V", "Lme/oriient/ipssdk/api/listeners/IPSRegionsListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addRegionsListener", "(Lme/oriient/ipssdk/api/listeners/IPSRegionsListener;)V", "removeRegionsListener", "getMapRegionsFromServer", "a", "Ljava/lang/String;", "getBuildingId", "()Ljava/lang/String;", "", "isEmpty", "()Z", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class RegionsManager {
    private static final String g = "RegionsManager";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String buildingId;
    private final Lazy b;
    private User c;
    private final ArrayList d;
    private List e;
    private IPSCancelable f;

    public RegionsManager(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        this.buildingId = buildingId;
        this.b = DependencyInjectionKt.getDi().inject(Reflection.f24268a.b(Logger.class));
        this.d = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IPSCancelable a(final RegionsManager this$0, User user, final J4 j4) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(user, "$user");
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new CancellableRestRequest(((ContentRestService) DependencyInjectionKt.getDi().get(reflectionFactory.b(ContentRestService.class))).getAllRegions(this$0.buildingId, user, ((CommonRuntimeDataProvider) di.get(reflectionFactory.b(CommonRuntimeDataProvider.class))).getUserSessionIdJava(), new IRegionsListener() { // from class: me.oriient.ipssdk.realtime.ips.RegionsManager$getMapRegionsFromServer$request$1$1
            @Override // me.oriient.ipssdk.api.listeners.IPSFailable
            public void onError(@NotNull IPSError error) {
                Intrinsics.h(error, "error");
                Logger loggerAccess$getLogger = RegionsManager.access$getLogger(this.f25856a);
                String str = RegionsManager.g;
                StringBuilder sbA = AbstractC1685m0.a(str, "access$getTAG$cp(...)", "getAllRegions failed to fetch regions: onError() called with: error = [");
                sbA.append(error.getMessage());
                sbA.append(']');
                loggerAccess$getLogger.e(str, sbA.toString());
                this.f25856a.f = null;
                j4.a(error);
            }

            @Override // me.oriient.ipssdk.realtime.services.rest.IRegionsListener
            public void onReceived(@NotNull List<Region> regions) {
                Intrinsics.h(regions, "regions");
                Logger loggerAccess$getLogger = RegionsManager.access$getLogger(this.f25856a);
                String str = RegionsManager.g;
                Intrinsics.g(str, "access$getTAG$cp(...)");
                loggerAccess$getLogger.d(str, "getAllRegions onReceived() called with: regions = [" + regions + ']');
                this.f25856a.f = null;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(regions);
                this.f25856a.e = arrayList;
                Iterator it = this.f25856a.d.iterator();
                while (it.hasNext()) {
                    ((IPSRegionsListener) it.next()).onRegionsAdded(arrayList);
                }
            }
        }));
    }

    public static final Logger access$getLogger(RegionsManager regionsManager) {
        return (Logger) regionsManager.b.getD();
    }

    public final void addRegionsListener(@NotNull IPSRegionsListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.d.contains(listener)) {
            Logger logger = (Logger) this.b.getD();
            String TAG = g;
            Intrinsics.g(TAG, "TAG");
            logger.w(TAG, "addBuildingRegionsListener: can't add same listener twice");
            return;
        }
        this.d.add(listener);
        List<IPSRegion> list = this.e;
        if (list != null) {
            listener.onRegionsAdded(list);
            return;
        }
        User user = this.c;
        if (user != null) {
            getMapRegionsFromServer(user);
        }
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    public final void getMapRegionsFromServer(@NotNull User user) {
        Intrinsics.h(user, "user");
        if (this.f != null) {
            return;
        }
        L4 l4 = new L4(((RemoteConfigManager) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(RemoteConfigManager.class))).getRealTimeConfig().getMisc().getMaxProximityDataRetryAttempts(), new au.com.woolworths.product.details.b(12, this, user));
        this.f = l4;
        synchronized (l4) {
            if (l4.b) {
                return;
            }
            l4.b = true;
            l4.b(1);
        }
    }

    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    public final void removeRegionsListener(@NotNull IPSRegionsListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.d.remove(listener)) {
            Logger logger = (Logger) this.b.getD();
            String str = g;
            StringBuilder sbA = AbstractC1685m0.a(str, "TAG", "removeBuildingRegionsListener: listener not removed! Listeners: [");
            sbA.append(this.d);
            sbA.append("] Listener: ");
            sbA.append(listener);
            logger.w(str, sbA.toString());
        }
    }

    public final void setUser(@Nullable User user) {
        this.c = user;
        if (user == null || this.e != null) {
            this.e = null;
        } else {
            getMapRegionsFromServer(user);
        }
    }

    public final void teardown() {
        IPSCancelable iPSCancelable = this.f;
        if (iPSCancelable != null) {
            iPSCancelable.cancel();
        }
        List<IPSRegion> list = this.e;
        if (list != null) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((IPSRegionsListener) it.next()).onRegionsRemoved(list);
            }
        }
        this.e = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RegionsManager(@NotNull RegionsManager toCopy) {
        this(toCopy.buildingId);
        Intrinsics.h(toCopy, "toCopy");
        this.d = toCopy.d;
    }
}
