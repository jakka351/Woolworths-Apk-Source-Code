package me.oriient.internal.services.cachedDataProvider;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KType;
import me.oriient.internal.infra.rest.HttpRequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H&J\u001e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H¦@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H&R\u0014\u0010\u0003\u001a\u0004\u0018\u00018\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u00060\u0007j\u0002`\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lme/oriient/internal/services/cachedDataProvider/CachedDataProvider;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "data", "getData", "()Ljava/lang/Object;", "id", "", "Lme/oriient/internal/services/cachedDataProvider/CDPID;", "getId", "()Ljava/lang/String;", "type", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lme/oriient/internal/services/cachedDataProvider/DataListener;", "refresh", "url", "requestBody", "Lme/oriient/internal/infra/rest/HttpRequestBody;", "(Ljava/lang/String;Lme/oriient/internal/infra/rest/HttpRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeListener", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CachedDataProvider<T> {
    void addListener(@NotNull DataListener<T> listener);

    @Nullable
    T getData();

    @NotNull
    String getId();

    @NotNull
    KType getType();

    @Nullable
    Object refresh(@NotNull String str, @NotNull HttpRequestBody httpRequestBody, @NotNull Continuation<? super Unit> continuation);

    void removeListener(@NotNull DataListener<T> listener);
}
