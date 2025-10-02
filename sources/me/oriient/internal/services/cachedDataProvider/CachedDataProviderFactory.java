package me.oriient.internal.services.cachedDataProvider;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.persistentStorage.PersistentStorage;
import me.oriient.internal.infra.rest.RestService;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ6\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\b\u0010\u0010\u001a\u0004\u0018\u0001H\u000bH\u0086\b¢\u0006\u0002\u0010\u0011J9\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\b\b\u0000\u0010\u000b*\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u0001H\u000b¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lme/oriient/internal/services/cachedDataProvider/CachedDataProviderFactory;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "restService", "Lme/oriient/internal/infra/rest/RestService;", "storage", "Lme/oriient/internal/infra/persistentStorage/PersistentStorage;", "networkManager", "Lme/oriient/internal/infra/networkManager/NetworkManager;", "(Lme/oriient/internal/infra/rest/RestService;Lme/oriient/internal/infra/persistentStorage/PersistentStorage;Lme/oriient/internal/infra/networkManager/NetworkManager;)V", "create", "Lme/oriient/internal/services/cachedDataProvider/CachedDataProvider;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "id", "", "Lme/oriient/internal/services/cachedDataProvider/CDPID;", "default", "(Ljava/lang/String;Ljava/lang/Object;)Lme/oriient/internal/services/cachedDataProvider/CachedDataProvider;", "type", "Lkotlin/reflect/KType;", "(Ljava/lang/String;Lkotlin/reflect/KType;Ljava/lang/Object;)Lme/oriient/internal/services/cachedDataProvider/CachedDataProvider;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CachedDataProviderFactory implements DiProvidable {

    @NotNull
    private final NetworkManager networkManager;

    @NotNull
    private final RestService restService;

    @NotNull
    private final PersistentStorage storage;

    public CachedDataProviderFactory(@NotNull RestService restService, @NotNull PersistentStorage storage, @NotNull NetworkManager networkManager) {
        Intrinsics.h(restService, "restService");
        Intrinsics.h(storage, "storage");
        Intrinsics.h(networkManager, "networkManager");
        this.restService = restService;
        this.storage = storage;
        this.networkManager = networkManager;
    }

    @NotNull
    public final <T> CachedDataProvider<T> create(@NotNull String id, @NotNull KType type, @Nullable T t) {
        Intrinsics.h(id, "id");
        Intrinsics.h(type, "type");
        return new CachedDataProviderImpl(id, this.restService, this.storage, this.networkManager, type, t);
    }

    public final <T> CachedDataProvider<T> create(String id, T t) {
        Intrinsics.h(id, "id");
        Intrinsics.o();
        throw null;
    }
}
