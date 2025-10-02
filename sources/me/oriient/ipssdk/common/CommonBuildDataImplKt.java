package me.oriient.ipssdk.common;

import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.oriient.internal.infra.utils.core.BuildData;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/infra/utils/core/BuildData;", "", "getVersionNameSemantic", "(Lme/oriient/internal/infra/utils/core/BuildData;)Ljava/lang/String;", "versionNameSemantic", "me.oriient.sdk-common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonBuildDataImplKt {
    @NotNull
    public static final String getVersionNameSemantic(@NotNull BuildData buildData) {
        Intrinsics.h(buildData, "<this>");
        return CollectionsKt.M(CollectionsKt.w0(StringsKt.U(BuildConfig.LIB_VERSION_NAME, new char[]{JwtParser.SEPARATOR_CHAR, '-'}), 3), ".", null, null, null, 62);
    }
}
