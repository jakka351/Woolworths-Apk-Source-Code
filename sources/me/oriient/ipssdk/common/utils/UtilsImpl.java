package me.oriient.ipssdk.common.utils;

import io.jsonwebtoken.JwtParser;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lme/oriient/ipssdk/common/utils/UtilsImpl;", "Lme/oriient/ipssdk/common/utils/Utils;", "<init>", "()V", "", "th", "", "generateExceptionMessage", "(Ljava/lang/Throwable;)Ljava/lang/String;", "", "timeMilli", "formatMilli", "(J)Ljava/lang/String;", "tag", "", "logCaller", "(Ljava/lang/String;)V", "Lme/oriient/internal/services/dataManager/building/Building;", "building", "Lme/oriient/internal/infra/locationManager/SystemLocation;", "location", "", "isInside", "(Lme/oriient/internal/services/dataManager/building/Building;Lme/oriient/internal/infra/locationManager/SystemLocation;)Z", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class UtilsImpl implements Utils {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f25786a = DependencyInjectionKt.getDi().inject(Reflection.f24268a.b(Logger.class));

    @Override // me.oriient.ipssdk.common.utils.Utils
    @NotNull
    public String formatMilli(long timeMilli) {
        long j = 1000;
        long j2 = timeMilli % j;
        long j3 = timeMilli / j;
        long j4 = 60;
        long j5 = j3 % j4;
        long j6 = j3 / j4;
        long j7 = j6 % j4;
        long j8 = j6 / j4;
        long j9 = 24;
        long j10 = j8 % j9;
        long j11 = j8 / j9;
        long j12 = 365;
        long j13 = j11 % j12;
        long j14 = j11 / j12;
        StringBuilder sb = new StringBuilder();
        if (j14 > 0) {
            sb.append(j14);
            sb.append(" years ");
        }
        if (j13 > 0) {
            sb.append(j13);
            sb.append(" days ");
        }
        if (j10 > 0) {
            sb.append(j10);
            sb.append(" hours ");
        }
        if (j7 > 0) {
            sb.append(j7);
            sb.append(" min ");
        }
        if (j5 > 0) {
            sb.append(j5);
            sb.append(" sec ");
        }
        if (j2 > 0) {
            sb.append(j2);
            sb.append(" milli");
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    @Override // me.oriient.ipssdk.common.utils.Utils
    @NotNull
    public String generateExceptionMessage(@Nullable Throwable th) {
        if (th == null) {
            return "null";
        }
        return th.getClass().getSimpleName() + ':' + th.getMessage() + ':' + th.getStackTrace()[0];
    }

    @Override // me.oriient.ipssdk.common.utils.Utils
    public boolean isInside(@NotNull Building building, @NotNull SystemLocation location) {
        Intrinsics.h(building, "building");
        Intrinsics.h(location, "location");
        return location.distanceTo(building.getGeofenceOrigin().getLatitude(), building.getGeofenceOrigin().getLongitude()) < location.getHorizontalAccuracy() + building.getGeofenceRadiusMeters();
    }

    @Override // me.oriient.ipssdk.common.utils.Utils
    public void logCaller(@NotNull String tag) {
        Intrinsics.h(tag, "tag");
        Exception exc = new Exception();
        StackTraceElement[] stackTrace = exc.getStackTrace();
        if (stackTrace.length < 4) {
            ((Logger) this.f25786a.getD()).e(tag, "logCaller: not enough stack trace elements: ");
            exc.printStackTrace();
            return;
        }
        String string = stackTrace[3].toString();
        Intrinsics.g(string, "toString(...)");
        String[] strArr = (String[]) StringsKt.T(string, new String[]{"\\."}, 6).toArray(new String[0]);
        if (strArr.length < 3) {
            ((Logger) this.f25786a.getD()).e(tag, "logCaller: not enough parts in trace " + Arrays.toString(strArr));
            return;
        }
        ((Logger) this.f25786a.getD()).d(tag, "Called by: " + strArr[strArr.length - 3] + JwtParser.SEPARATOR_CHAR + strArr[strArr.length - 2] + JwtParser.SEPARATOR_CHAR + strArr[strArr.length - 1]);
    }
}
