package au.com.woolworths.sdui.common.broadcastbanner.model;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.base.d;
import au.com.woolworths.sdui.common.IconAsset;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/sdui/common/broadcastbanner/model/CoreBroadcastBannerModel;", "", "Companion", "$serializer", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class CoreBroadcastBannerModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* renamed from: a, reason: collision with root package name */
    public final String f9988a;
    public final String b;
    public final CoreBroadcastBannerStyle c;
    public final IconAsset d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/sdui/common/broadcastbanner/model/CoreBroadcastBannerModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/sdui/common/broadcastbanner/model/CoreBroadcastBannerModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<CoreBroadcastBannerModel> serializer() {
            return CoreBroadcastBannerModel$$serializer.f9989a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.d;
        e = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new d(4)), LazyKt.a(lazyThreadSafetyMode, new d(5))};
    }

    public /* synthetic */ CoreBroadcastBannerModel(int i, String str, String str2, CoreBroadcastBannerStyle coreBroadcastBannerStyle, IconAsset iconAsset) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, CoreBroadcastBannerModel$$serializer.f9989a.getDescriptor());
            throw null;
        }
        this.f9988a = str;
        this.b = str2;
        this.c = coreBroadcastBannerStyle;
        this.d = iconAsset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreBroadcastBannerModel)) {
            return false;
        }
        CoreBroadcastBannerModel coreBroadcastBannerModel = (CoreBroadcastBannerModel) obj;
        return Intrinsics.c(this.f9988a, coreBroadcastBannerModel.f9988a) && Intrinsics.c(this.b, coreBroadcastBannerModel.b) && this.c == coreBroadcastBannerModel.c && Intrinsics.c(this.d, coreBroadcastBannerModel.d);
    }

    public final int hashCode() {
        int iHashCode = this.f9988a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("CoreBroadcastBannerModel(title=", this.f9988a, ", subtitle=", this.b, ", style=");
        sbV.append(this.c);
        sbV.append(", icon=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }

    public CoreBroadcastBannerModel(String title, String str, CoreBroadcastBannerStyle coreBroadcastBannerStyle, IconAsset iconAsset) {
        Intrinsics.h(title, "title");
        this.f9988a = title;
        this.b = str;
        this.c = coreBroadcastBannerStyle;
        this.d = iconAsset;
    }
}
