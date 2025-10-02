package com.woolworths.product.list.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lcom/woolworths/product/list/fragment/VideoAdBottomSheet;", "Lcom/apollographql/apollo/api/Fragment$Data;", "__typename", "", "contentMarkdown", "title", "buttonText", "accessibilityText", "impressionAnalytics", "Lcom/woolworths/product/list/fragment/VideoAdBottomSheet$ImpressionAnalytics;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/fragment/VideoAdBottomSheet$ImpressionAnalytics;)V", "get__typename", "()Ljava/lang/String;", "getContentMarkdown", "getTitle", "getButtonText", "getAccessibilityText", "getImpressionAnalytics", "()Lcom/woolworths/product/list/fragment/VideoAdBottomSheet$ImpressionAnalytics;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ImpressionAnalytics", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class VideoAdBottomSheet implements Fragment.Data {
    public static final int $stable = 8;

    @NotNull
    private final String __typename;

    @NotNull
    private final String accessibilityText;

    @Nullable
    private final String buttonText;

    @NotNull
    private final String contentMarkdown;

    @Nullable
    private final ImpressionAnalytics impressionAnalytics;

    @NotNull
    private final String title;

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/product/list/fragment/VideoAdBottomSheet$ImpressionAnalytics;", "", "__typename", "", "analyticsFields", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;)V", "get__typename", "()Ljava/lang/String;", "getAnalyticsFields", "()Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {
        public static final int $stable = 8;

        @NotNull
        private final String __typename;

        @NotNull
        private final AnalyticsFields analyticsFields;

        public ImpressionAnalytics(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            this.__typename = __typename;
            this.analyticsFields = analyticsFields;
        }

        public static /* synthetic */ ImpressionAnalytics copy$default(ImpressionAnalytics impressionAnalytics, String str, AnalyticsFields analyticsFields, int i, Object obj) {
            if ((i & 1) != 0) {
                str = impressionAnalytics.__typename;
            }
            if ((i & 2) != 0) {
                analyticsFields = impressionAnalytics.analyticsFields;
            }
            return impressionAnalytics.copy(str, analyticsFields);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final ImpressionAnalytics copy(@NotNull String __typename, @NotNull AnalyticsFields analyticsFields) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(analyticsFields, "analyticsFields");
            return new ImpressionAnalytics(__typename, analyticsFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImpressionAnalytics)) {
                return false;
            }
            ImpressionAnalytics impressionAnalytics = (ImpressionAnalytics) other;
            return Intrinsics.c(this.__typename, impressionAnalytics.__typename) && Intrinsics.c(this.analyticsFields, impressionAnalytics.analyticsFields);
        }

        @NotNull
        public final AnalyticsFields getAnalyticsFields() {
            return this.analyticsFields;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.analyticsFields.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.__typename, ", analyticsFields=", this.analyticsFields, ")");
        }
    }

    public VideoAdBottomSheet(@NotNull String __typename, @NotNull String contentMarkdown, @NotNull String title, @Nullable String str, @NotNull String accessibilityText, @Nullable ImpressionAnalytics impressionAnalytics) {
        Intrinsics.h(__typename, "__typename");
        Intrinsics.h(contentMarkdown, "contentMarkdown");
        Intrinsics.h(title, "title");
        Intrinsics.h(accessibilityText, "accessibilityText");
        this.__typename = __typename;
        this.contentMarkdown = contentMarkdown;
        this.title = title;
        this.buttonText = str;
        this.accessibilityText = accessibilityText;
        this.impressionAnalytics = impressionAnalytics;
    }

    public static /* synthetic */ VideoAdBottomSheet copy$default(VideoAdBottomSheet videoAdBottomSheet, String str, String str2, String str3, String str4, String str5, ImpressionAnalytics impressionAnalytics, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoAdBottomSheet.__typename;
        }
        if ((i & 2) != 0) {
            str2 = videoAdBottomSheet.contentMarkdown;
        }
        if ((i & 4) != 0) {
            str3 = videoAdBottomSheet.title;
        }
        if ((i & 8) != 0) {
            str4 = videoAdBottomSheet.buttonText;
        }
        if ((i & 16) != 0) {
            str5 = videoAdBottomSheet.accessibilityText;
        }
        if ((i & 32) != 0) {
            impressionAnalytics = videoAdBottomSheet.impressionAnalytics;
        }
        String str6 = str5;
        ImpressionAnalytics impressionAnalytics2 = impressionAnalytics;
        return videoAdBottomSheet.copy(str, str2, str3, str4, str6, impressionAnalytics2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String get__typename() {
        return this.__typename;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getContentMarkdown() {
        return this.contentMarkdown;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getAccessibilityText() {
        return this.accessibilityText;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final ImpressionAnalytics getImpressionAnalytics() {
        return this.impressionAnalytics;
    }

    @NotNull
    public final VideoAdBottomSheet copy(@NotNull String __typename, @NotNull String contentMarkdown, @NotNull String title, @Nullable String buttonText, @NotNull String accessibilityText, @Nullable ImpressionAnalytics impressionAnalytics) {
        Intrinsics.h(__typename, "__typename");
        Intrinsics.h(contentMarkdown, "contentMarkdown");
        Intrinsics.h(title, "title");
        Intrinsics.h(accessibilityText, "accessibilityText");
        return new VideoAdBottomSheet(__typename, contentMarkdown, title, buttonText, accessibilityText, impressionAnalytics);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoAdBottomSheet)) {
            return false;
        }
        VideoAdBottomSheet videoAdBottomSheet = (VideoAdBottomSheet) other;
        return Intrinsics.c(this.__typename, videoAdBottomSheet.__typename) && Intrinsics.c(this.contentMarkdown, videoAdBottomSheet.contentMarkdown) && Intrinsics.c(this.title, videoAdBottomSheet.title) && Intrinsics.c(this.buttonText, videoAdBottomSheet.buttonText) && Intrinsics.c(this.accessibilityText, videoAdBottomSheet.accessibilityText) && Intrinsics.c(this.impressionAnalytics, videoAdBottomSheet.impressionAnalytics);
    }

    @NotNull
    public final String getAccessibilityText() {
        return this.accessibilityText;
    }

    @Nullable
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    public final String getContentMarkdown() {
        return this.contentMarkdown;
    }

    @Nullable
    public final ImpressionAnalytics getImpressionAnalytics() {
        return this.impressionAnalytics;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String get__typename() {
        return this.__typename;
    }

    public int hashCode() {
        int iC = b.c(b.c(this.__typename.hashCode() * 31, 31, this.contentMarkdown), 31, this.title);
        String str = this.buttonText;
        int iC2 = b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.accessibilityText);
        ImpressionAnalytics impressionAnalytics = this.impressionAnalytics;
        return iC2 + (impressionAnalytics != null ? impressionAnalytics.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.__typename;
        String str2 = this.contentMarkdown;
        String str3 = this.title;
        String str4 = this.buttonText;
        String str5 = this.accessibilityText;
        ImpressionAnalytics impressionAnalytics = this.impressionAnalytics;
        StringBuilder sbV = a.v("VideoAdBottomSheet(__typename=", str, ", contentMarkdown=", str2, ", title=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", buttonText=", str4, ", accessibilityText=");
        sbV.append(str5);
        sbV.append(", impressionAnalytics=");
        sbV.append(impressionAnalytics);
        sbV.append(")");
        return sbV.toString();
    }
}
