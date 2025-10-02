package me.oriient.internal.services.cachedDataProvider;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.persistentStorage.PersistentStorage;
import me.oriient.internal.infra.rest.HttpRequestBody;
import me.oriient.internal.infra.rest.RestService;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.retryOperation.RetryOperationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B=\b\u0000\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0011J\u0016\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016J\u0014\u0010'\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0002J\u001e\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020+H\u0096@¢\u0006\u0002\u0010,J\u0016\u0010-\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016J\u0010\u0010.\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0006H\u0002R$\u0010\u0013\u001a\u0004\u0018\u00018\u00002\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000@RX\u0096\u000e¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006/"}, d2 = {"Lme/oriient/internal/services/cachedDataProvider/CachedDataProviderImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lme/oriient/internal/services/cachedDataProvider/CachedDataProvider;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "id", "", "Lme/oriient/internal/services/cachedDataProvider/CDPID;", "restService", "Lme/oriient/internal/infra/rest/RestService;", "storage", "Lme/oriient/internal/infra/persistentStorage/PersistentStorage;", "networkManager", "Lme/oriient/internal/infra/networkManager/NetworkManager;", "type", "Lkotlin/reflect/KType;", "default", "(Ljava/lang/String;Lme/oriient/internal/infra/rest/RestService;Lme/oriient/internal/infra/persistentStorage/PersistentStorage;Lme/oriient/internal/infra/networkManager/NetworkManager;Lkotlin/reflect/KType;Ljava/lang/Object;)V", "<set-?>", "data", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getId", "()Ljava/lang/String;", "listeners", "", "Lme/oriient/internal/services/cachedDataProvider/DataListener;", "logger", "Lme/oriient/internal/infra/utils/core/Logger;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getType", "()Lkotlin/reflect/KType;", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "prefsKey", "refresh", "url", "requestBody", "Lme/oriient/internal/infra/rest/HttpRequestBody;", "(Ljava/lang/String;Lme/oriient/internal/infra/rest/HttpRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeListener", "save", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CachedDataProviderImpl<T> implements CachedDataProvider<T>, DiProvidable {

    @Nullable
    private T data;

    @NotNull
    private final String id;

    @NotNull
    private final List<DataListener<T>> listeners;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    @NotNull
    private final NetworkManager networkManager;

    @NotNull
    private final RestService restService;

    @NotNull
    private final PersistentStorage storage;

    @NotNull
    private final KType type;

    public CachedDataProviderImpl(@NotNull String id, @NotNull RestService restService, @NotNull PersistentStorage storage, @NotNull NetworkManager networkManager, @NotNull KType type, @Nullable T t) {
        Intrinsics.h(id, "id");
        Intrinsics.h(restService, "restService");
        Intrinsics.h(storage, "storage");
        Intrinsics.h(networkManager, "networkManager");
        Intrinsics.h(type, "type");
        this.id = id;
        this.restService = restService;
        this.storage = storage;
        this.networkManager = networkManager;
        this.type = type;
        this.listeners = new ArrayList();
        this.data = t;
        this.logger = InternalDiKt.getDi().inject(Reflection.f24268a.b(Logger.class));
        getLogger().d("CachedDataProvider", "created CachedDataProvider(" + getId() + ") for type " + getType() + " with default=" + t);
        String string = storage.getString(prefsKey(getId()), null);
        if (string != null) {
            this.data = (T) JsonSerializationKt.parseAsJsonOrNull(string, getType());
            getLogger().d("CachedDataProvider", "found stored value " + string + ", default value " + t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    private final String prefsKey(String id) {
        return YU.a.A("cdp_prefs_", id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void save(String data) {
        try {
            this.storage.putString(prefsKey(getId()), data);
        } catch (Throwable th) {
            Logger logger = getLogger();
            StringBuilder sbU = YU.a.u("Failed to serialize data [", data, "] for saving: ");
            sbU.append(th.getMessage());
            logger.e("CachedDataProvider", sbU.toString());
        }
    }

    @Override // me.oriient.internal.services.cachedDataProvider.CachedDataProvider
    public void addListener(@NotNull DataListener<T> listener) {
        Intrinsics.h(listener, "listener");
        this.listeners.add(listener);
    }

    @Override // me.oriient.internal.services.cachedDataProvider.CachedDataProvider
    @Nullable
    public T getData() {
        return this.data;
    }

    @Override // me.oriient.internal.services.cachedDataProvider.CachedDataProvider
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // me.oriient.internal.services.cachedDataProvider.CachedDataProvider
    @NotNull
    public KType getType() {
        return this.type;
    }

    @Override // me.oriient.internal.services.cachedDataProvider.CachedDataProvider
    @Nullable
    public Object refresh(@NotNull String str, @NotNull HttpRequestBody httpRequestBody, @NotNull Continuation<? super Unit> continuation) {
        Object objRetryOperationWithNetwork$default = RetryOperationKt.retryOperationWithNetwork$default(this.networkManager, 5, 0L, TimeUnit.SECONDS.toMillis(30L), 0L, null, null, new b(this, str, httpRequestBody, null), continuation, 116, null);
        return objRetryOperationWithNetwork$default == CoroutineSingletons.d ? objRetryOperationWithNetwork$default : Unit.f24250a;
    }

    @Override // me.oriient.internal.services.cachedDataProvider.CachedDataProvider
    public void removeListener(@NotNull DataListener<T> listener) {
        Intrinsics.h(listener, "listener");
        this.listeners.remove(listener);
    }
}
