package me.oriient.ipssdk.realtime.services.tag.model;

import kotlin.Metadata;
import me.oriient.ipssdk.realtime.services.tag.model.EventTagType;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toEventTagType", "Lme/oriient/ipssdk/realtime/services/tag/model/EventTagType;", "", "me.oriient.sdk-realtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EventTagTypeKt {
    @Nullable
    public static final EventTagType toEventTagType(int i) {
        if (i == 0) {
            return EventTagType.ProductScan.INSTANCE;
        }
        if (i != 1) {
            return null;
        }
        return EventTagType.ItemNotFound.INSTANCE;
    }
}
