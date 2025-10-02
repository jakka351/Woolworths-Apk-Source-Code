package com.woolworths.scanlibrary.models.authentication;

import android.annotation.SuppressLint;
import androidx.browser.customtabs.CustomTabsCallback;
import au.com.woolworths.android.onesite.models.authentication.Member;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/woolworths/scanlibrary/models/authentication/Banner;", "", "bannerName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getBannerName", "()Ljava/lang/String;", "REWARDS", "ONLINE", "GUEST", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint
/* loaded from: classes7.dex */
public final class Banner {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Banner[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String bannerName;

    @SerializedName("REWARDS")
    public static final Banner REWARDS = new Banner("REWARDS", 0, "rewards");

    @SerializedName("ONLINE")
    public static final Banner ONLINE = new Banner("ONLINE", 1, CustomTabsCallback.ONLINE_EXTRAS_KEY);

    @SerializedName("GUEST")
    public static final Banner GUEST = new Banner("GUEST", 2, Member.GUEST_USER);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/models/authentication/Banner$Companion;", "", "<init>", "()V", "fromBannerValue", "Lcom/woolworths/scanlibrary/models/authentication/Banner;", "bannerName", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Banner fromBannerValue(@Nullable String bannerName) {
            for (Banner banner : Banner.values()) {
                if (Intrinsics.c(banner.getBannerName(), bannerName)) {
                    return banner;
                }
            }
            return Banner.REWARDS;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Banner[] $values() {
        return new Banner[]{REWARDS, ONLINE, GUEST};
    }

    static {
        Banner[] bannerArr$values = $values();
        $VALUES = bannerArr$values;
        $ENTRIES = EnumEntriesKt.a(bannerArr$values);
        INSTANCE = new Companion(null);
    }

    private Banner(String str, int i, String str2) {
        this.bannerName = str2;
    }

    @NotNull
    public static EnumEntries<Banner> getEntries() {
        return $ENTRIES;
    }

    public static Banner valueOf(String str) {
        return (Banner) Enum.valueOf(Banner.class, str);
    }

    public static Banner[] values() {
        return (Banner[]) $VALUES.clone();
    }

    @NotNull
    public final String getBannerName() {
        return this.bannerName;
    }
}
