package me.oriient.internal.services.dataManager.rest;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import me.oriient.internal.infra.rest.HttpRequestBody;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JN\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00050\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\u00040\fH¦@¢\u0006\u0002\u0010\u000eJN\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00050\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00040\fH¦@¢\u0006\u0002\u0010\u000eJX\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00050\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00040\fH¦@¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lme/oriient/internal/services/dataManager/rest/RestHelper;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "getBytesData", "Lme/oriient/internal/infra/utils/core/Outcome;", "Data", "Lme/oriient/internal/infra/utils/core/OriientError;", "tag", "", "url", "removeContentTypeHeader", "", "parseResponse", "Lkotlin/Function1;", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStringData", "postStringData", "body", "Lme/oriient/internal/infra/rest/HttpRequestBody;", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/infra/rest/HttpRequestBody;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RestHelper extends DiProvidable {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getBytesData$default(RestHelper restHelper, String str, String str2, boolean z, Function1 function1, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBytesData");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return restHelper.getBytesData(str, str2, z, function1, continuation);
        }

        public static /* synthetic */ Object getStringData$default(RestHelper restHelper, String str, String str2, boolean z, Function1 function1, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStringData");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return restHelper.getStringData(str, str2, z, function1, continuation);
        }

        public static /* synthetic */ Object postStringData$default(RestHelper restHelper, String str, String str2, HttpRequestBody httpRequestBody, boolean z, Function1 function1, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postStringData");
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return restHelper.postStringData(str, str2, httpRequestBody, z, function1, continuation);
        }
    }

    @Nullable
    <Data> Object getBytesData(@NotNull String str, @NotNull String str2, boolean z, @NotNull Function1<? super byte[], ? extends Data> function1, @NotNull Continuation<? super Outcome<Data, OriientError>> continuation);

    @Nullable
    <Data> Object getStringData(@NotNull String str, @NotNull String str2, boolean z, @NotNull Function1<? super String, ? extends Data> function1, @NotNull Continuation<? super Outcome<Data, OriientError>> continuation);

    @Nullable
    <Data> Object postStringData(@NotNull String str, @NotNull String str2, @Nullable HttpRequestBody httpRequestBody, boolean z, @NotNull Function1<? super String, ? extends Data> function1, @NotNull Continuation<? super Outcome<Data, OriientError>> continuation);
}
