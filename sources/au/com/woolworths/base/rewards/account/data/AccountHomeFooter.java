package au.com.woolworths.base.rewards.account.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\nHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/AccountHomeFooter;", "", "iconUrl", "", lqlqqlq.mmm006Dm006Dm, UrlHandler.ACTION, "Lau/com/woolworths/base/rewards/account/data/IconListItemAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/base/rewards/account/data/IconListItemAction;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lau/com/woolworths/base/rewards/account/data/IconListItemAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIconUrl", "()Ljava/lang/String;", "getDescription", "getAction", "()Lau/com/woolworths/base/rewards/account/data/IconListItemAction;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$base_rewards_account_release", "$serializer", "Companion", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class AccountHomeFooter {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName(UrlHandler.ACTION)
    @Nullable
    private final IconListItemAction action;

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @NotNull
    private final String description;

    @SerializedName("iconUrl")
    @NotNull
    private final String iconUrl;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/AccountHomeFooter$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/rewards/account/data/AccountHomeFooter;", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<AccountHomeFooter> serializer() {
            return AccountHomeFooter$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AccountHomeFooter(int i, String str, String str2, IconListItemAction iconListItemAction, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.a(i, 7, AccountHomeFooter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.iconUrl = str;
        this.description = str2;
        this.action = iconListItemAction;
    }

    public static /* synthetic */ AccountHomeFooter copy$default(AccountHomeFooter accountHomeFooter, String str, String str2, IconListItemAction iconListItemAction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountHomeFooter.iconUrl;
        }
        if ((i & 2) != 0) {
            str2 = accountHomeFooter.description;
        }
        if ((i & 4) != 0) {
            iconListItemAction = accountHomeFooter.action;
        }
        return accountHomeFooter.copy(str, str2, iconListItemAction);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$base_rewards_account_release(AccountHomeFooter self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.iconUrl);
        output.p(serialDesc, 1, self.description);
        output.w(serialDesc, 2, IconListItemAction$$serializer.INSTANCE, self.action);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final IconListItemAction getAction() {
        return this.action;
    }

    @NotNull
    public final AccountHomeFooter copy(@NotNull String iconUrl, @NotNull String description, @Nullable IconListItemAction action) {
        Intrinsics.h(iconUrl, "iconUrl");
        Intrinsics.h(description, "description");
        return new AccountHomeFooter(iconUrl, description, action);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountHomeFooter)) {
            return false;
        }
        AccountHomeFooter accountHomeFooter = (AccountHomeFooter) other;
        return Intrinsics.c(this.iconUrl, accountHomeFooter.iconUrl) && Intrinsics.c(this.description, accountHomeFooter.description) && Intrinsics.c(this.action, accountHomeFooter.action);
    }

    @Nullable
    public final IconListItemAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public int hashCode() {
        int iC = b.c(this.iconUrl.hashCode() * 31, 31, this.description);
        IconListItemAction iconListItemAction = this.action;
        return iC + (iconListItemAction == null ? 0 : iconListItemAction.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.iconUrl;
        String str2 = this.description;
        IconListItemAction iconListItemAction = this.action;
        StringBuilder sbV = a.v("AccountHomeFooter(iconUrl=", str, ", description=", str2, ", action=");
        sbV.append(iconListItemAction);
        sbV.append(")");
        return sbV.toString();
    }

    public AccountHomeFooter(@NotNull String iconUrl, @NotNull String description, @Nullable IconListItemAction iconListItemAction) {
        Intrinsics.h(iconUrl, "iconUrl");
        Intrinsics.h(description, "description");
        this.iconUrl = iconUrl;
        this.description = description;
        this.action = iconListItemAction;
    }
}
