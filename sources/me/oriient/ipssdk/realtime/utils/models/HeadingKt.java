package me.oriient.ipssdk.realtime.utils.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toSdkHeading", "Lme/oriient/ipssdk/realtime/utils/models/Heading;", "Lme/oriient/internal/services/dataManager/common/Heading;", "me.oriient.sdk-realtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HeadingKt {
    @NotNull
    public static final Heading toSdkHeading(@NotNull me.oriient.internal.services.dataManager.common.Heading heading) {
        Intrinsics.h(heading, "<this>");
        return new Heading(heading.getX(), heading.getY(), heading.getZ(), heading.getAngle());
    }
}
