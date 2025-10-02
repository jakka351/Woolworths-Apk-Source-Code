package au.com.woolworths.design.core.ui.component.stable.broadcastbanner;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/broadcastbanner/BroadcastBannerSpec;", "", "Action", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BroadcastBannerSpec {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/broadcastbanner/BroadcastBannerSpec$Action;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action {

        /* renamed from: a, reason: collision with root package name */
        public final String f4747a;
        public final boolean b;
        public final Function0 c;

        public Action(boolean z, String label, Function0 onClick) {
            Intrinsics.h(label, "label");
            Intrinsics.h(onClick, "onClick");
            this.f4747a = label;
            this.b = z;
            this.c = onClick;
        }
    }
}
