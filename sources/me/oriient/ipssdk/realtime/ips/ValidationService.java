package me.oriient.ipssdk.realtime.ips;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.listeners.IPSFailable;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.api.models.IPSStartingPosition;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.common.ips.ListenerException;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.realtime.ofs.AbstractC1691n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0016J5\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/ValidationService;", "", "", "results", "", "filterInvalidResults", "(Ljava/util/List;)V", "Lme/oriient/ipssdk/api/listeners/IPSFailable;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "validateConnected", "(Lme/oriient/ipssdk/api/listeners/IPSFailable;)Z", "Lme/oriient/ipssdk/api/models/IPSStartingPosition;", "position", "validateStartingPosition", "(Lme/oriient/ipssdk/api/models/IPSStartingPosition;Lme/oriient/ipssdk/api/listeners/IPSFailable;)Z", "Lme/oriient/ipssdk/api/models/IPSError;", "error", "safeFailListener", "(Lme/oriient/ipssdk/api/listeners/IPSFailable;Lme/oriient/ipssdk/api/models/IPSError;)V", "", "tag", "(Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSFailable;Lme/oriient/ipssdk/api/models/IPSError;)V", "Lkotlin/Function1;", "closure", "safeCallListener", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;", "safeCompleteListener", "(Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ValidationService {

    @NotNull
    public static final ValidationService INSTANCE = new ValidationService();

    /* renamed from: a, reason: collision with root package name */
    private static final Lazy f25864a;
    private static final Lazy b;

    static {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        f25864a = di.inject(reflectionFactory.b(Logger.class));
        b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ELog.class));
    }

    private ValidationService() {
    }

    @JvmStatic
    public static final void filterInvalidResults(@NotNull List<?> results) {
        Intrinsics.h(results, "results");
        filterInvalidResults(results);
    }

    @JvmStatic
    public static final void safeCallListener(@NotNull String tag, @Nullable Object listener, @NotNull Function1<? super Unit, Unit> closure) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(closure, "closure");
        try {
            closure.invoke(Unit.f24250a);
        } catch (Exception e) {
            String simpleName = listener != null ? listener.getClass().getSimpleName() : null;
            if (simpleName == null) {
                simpleName = com.salesforce.marketingcloud.messages.iam.j.h;
            }
            ListenerException listenerException = new ListenerException(simpleName, e);
            INSTANCE.getClass();
            AbstractC1691n0.a(listenerException, "errorMessage", (ELog) b.getD(), tag, "Exception in application");
            ((Logger) f25864a.getD()).e(tag, "Exception in application: " + listenerException.getMessage());
        }
    }

    @JvmStatic
    public static final void safeCompleteListener(@Nullable IPSCompletionListener listener) {
        if (listener != null) {
            try {
                listener.onCompleted();
            } catch (Exception e) {
                ListenerException listenerException = new ListenerException(listener.getClass().getSimpleName(), e);
                INSTANCE.getClass();
                AbstractC1691n0.a(listenerException, "errorMessage", (ELog) b.getD(), listener.getClass().getSimpleName(), "Exception in application");
                INSTANCE.getClass();
                ((Logger) f25864a.getD()).e(listener.getClass().getSimpleName(), "Exception in application: " + listenerException.getMessage());
            }
        }
    }

    @JvmStatic
    public static final void safeFailListener(@Nullable IPSFailable listener, @NotNull IPSError error) {
        Intrinsics.h(error, "error");
        if (listener != null) {
            safeFailListener(listener.getClass().getSimpleName(), listener, error);
        }
    }

    @JvmStatic
    public static final boolean validateConnected(@Nullable IPSFailable listener) {
        if (Core.INSTANCE.getConnectionState() != 0) {
            return true;
        }
        safeFailListener(listener, new Error("Not connected to service", 1, 0));
        return false;
    }

    @JvmStatic
    public static final boolean validateStartingPosition(@Nullable IPSStartingPosition position, @Nullable IPSFailable listener) {
        if (position != null) {
            Error error = TextUtils.isEmpty(position.getBuildingId()) ? new Error("IPSStartingPosition must contain a building ID", 4, 2) : null;
            if (error != null) {
                safeFailListener(listener, error);
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    public static final void safeFailListener(@NotNull String tag, @Nullable IPSFailable listener, @NotNull IPSError error) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(error, "error");
        if (listener != null) {
            try {
                listener.onError(error);
            } catch (Exception e) {
                ListenerException listenerException = new ListenerException(listener.getClass().getSimpleName(), e);
                INSTANCE.getClass();
                AbstractC1691n0.a(listenerException, "errorMessage", (ELog) b.getD(), tag, "Exception in application");
                INSTANCE.getClass();
                ((Logger) f25864a.getD()).e(tag, "Exception in application: " + listenerException.getMessage());
            }
        }
    }
}
