package au.com.woolworths.foundation.force.upgrade.data;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/data/UpgradePrompt;", "", "Companion", "$serializer", "force-upgrade-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class UpgradePrompt {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f8503a;
    public final String b;
    public final String c;
    public final String d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/data/UpgradePrompt$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/force/upgrade/data/UpgradePrompt;", "serializer", "()Lkotlinx/serialization/KSerializer;", "force-upgrade-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<UpgradePrompt> serializer() {
            return UpgradePrompt$$serializer.f8504a;
        }
    }

    public /* synthetic */ UpgradePrompt(String str, int i, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, UpgradePrompt$$serializer.f8504a.getB());
            throw null;
        }
        this.f8503a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final String getF8503a() {
        return this.f8503a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpgradePrompt)) {
            return false;
        }
        UpgradePrompt upgradePrompt = (UpgradePrompt) obj;
        return Intrinsics.c(this.f8503a, upgradePrompt.f8503a) && Intrinsics.c(this.b, upgradePrompt.b) && Intrinsics.c(this.c, upgradePrompt.c) && Intrinsics.c(this.d, upgradePrompt.d);
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.f8503a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.l(YU.a.v("UpgradePrompt(title=", this.f8503a, ", message=", this.b, ", primaryCta="), this.c, ", secondaryCta=", this.d, ")");
    }

    public UpgradePrompt(String title, String message, String primaryCta, String str) {
        Intrinsics.h(title, "title");
        Intrinsics.h(message, "message");
        Intrinsics.h(primaryCta, "primaryCta");
        this.f8503a = title;
        this.b = message;
        this.c = primaryCta;
        this.d = str;
    }
}
