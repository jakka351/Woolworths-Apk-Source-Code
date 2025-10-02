package au.com.woolworths.android.onesite.models;

import au.com.woolworths.android.onesite.modules.customviews.producttile.ProductTileModel;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\u0004\u0010\bJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R(\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/android/onesite/models/TrolleyUpdateData;", "", "item", "Lau/com/woolworths/android/onesite/models/TrolleyUpdateData$TrolleyItem;", "<init>", "(Lau/com/woolworths/android/onesite/models/TrolleyUpdateData$TrolleyItem;)V", "items", "", "(Ljava/util/List;)V", "", "evaluateRewardsPoints", "", "kotlin.jvm.PlatformType", "getEvaluateRewardsPoints", "()Ljava/lang/Boolean;", "setEvaluateRewardsPoints", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getItems", "TrolleyItem", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TrolleyUpdateData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("evaluaterewardspoints")
    private Boolean evaluateRewardsPoints;

    @SerializedName("items")
    @NotNull
    private List<TrolleyItem> items;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007J\u0018\u0010\n\u001a\u00020\u00052\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH\u0007¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/android/onesite/models/TrolleyUpdateData$Companion;", "", "<init>", "()V", "from", "Lau/com/woolworths/android/onesite/models/TrolleyUpdateData;", "item", "Lau/com/woolworths/android/onesite/models/TrolleyUpdateData$TrolleyItem;", "items", "", "fromProductTiles", "productTileModels", "", "Lau/com/woolworths/android/onesite/modules/customviews/producttile/ProductTileModel;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final TrolleyUpdateData from(@NotNull TrolleyItem item) {
            Intrinsics.h(item, "item");
            return new TrolleyUpdateData(item);
        }

        @JvmStatic
        @NotNull
        public final TrolleyUpdateData fromProductTiles(@NotNull List<? extends ProductTileModel> productTileModels) {
            Intrinsics.h(productTileModels, "productTileModels");
            ArrayList arrayList = new ArrayList();
            Iterator<? extends ProductTileModel> it = productTileModels.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw null;
                }
            }
            return new TrolleyUpdateData(arrayList);
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final TrolleyUpdateData from(@NotNull List<TrolleyItem> items) {
            Intrinsics.h(items, "items");
            return new TrolleyUpdateData(items);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\u0018\u00002\u00020\u0001B;\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\rR*\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Lau/com/woolworths/android/onesite/models/TrolleyUpdateData$TrolleyItem;", "", "article", "", "quantity", "", "allowSubstitution", "", "comment", "adid", "<init>", "(Ljava/lang/String;FZLjava/lang/String;Ljava/lang/String;)V", "adId", "(Ljava/lang/String;FLjava/lang/String;)V", "value", "getArticle", "()Ljava/lang/String;", "setArticle", "(Ljava/lang/String;)V", "getQuantity", "()F", "setQuantity", "(F)V", "isAllowsubstitution", "()Z", "setAllowsubstitution", "(Z)V", "getComment", "setComment", "getAdid", "setAdid", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes3.dex */
    public static final class TrolleyItem {

        @SerializedName("adid")
        @Nullable
        private String adid;

        @SerializedName("article")
        @Nullable
        private String article;

        @SerializedName("comment")
        @NotNull
        private String comment;

        @SerializedName("allowsubstitution")
        private boolean isAllowsubstitution;

        @SerializedName("itemquantityintrolley")
        private float quantity;

        @JvmOverloads
        public TrolleyItem(@Nullable String str, float f) {
            this(str, f, false, null, null, 28, null);
        }

        @Nullable
        public final String getAdid() {
            return this.adid;
        }

        @Nullable
        public final String getArticle() {
            return this.article;
        }

        @NotNull
        public final String getComment() {
            return this.comment;
        }

        public final float getQuantity() {
            return this.quantity;
        }

        /* renamed from: isAllowsubstitution, reason: from getter */
        public final boolean getIsAllowsubstitution() {
            return this.isAllowsubstitution;
        }

        public final void setAdid(@Nullable String str) {
            this.adid = str;
        }

        public final void setAllowsubstitution(boolean z) {
            this.isAllowsubstitution = z;
        }

        public final void setArticle(@Nullable String str) {
            this.article = str != null ? Integer.toString(Integer.parseInt(str)) : null;
        }

        public final void setComment(@NotNull String str) {
            Intrinsics.h(str, "<set-?>");
            this.comment = str;
        }

        public final void setQuantity(float f) {
            this.quantity = f;
        }

        @JvmOverloads
        public TrolleyItem(@Nullable String str, float f, boolean z) {
            this(str, f, z, null, null, 24, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public TrolleyItem(@Nullable String str, float f, boolean z, @NotNull String comment) {
            this(str, f, z, comment, null, 16, null);
            Intrinsics.h(comment, "comment");
        }

        @JvmOverloads
        public TrolleyItem(@Nullable String str, float f, boolean z, @NotNull String comment, @Nullable String str2) {
            Intrinsics.h(comment, "comment");
            setArticle(str);
            this.quantity = f;
            this.isAllowsubstitution = z;
            this.comment = comment;
            this.adid = str2;
        }

        public /* synthetic */ TrolleyItem(String str, float f, boolean z, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f, (i & 4) != 0 ? true : z, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : str3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TrolleyItem(@NotNull String article, float f, @Nullable String str) {
            this(article, f, true, "", str);
            Intrinsics.h(article, "article");
        }
    }

    public TrolleyUpdateData(@NotNull TrolleyItem item) {
        Intrinsics.h(item, "item");
        ArrayList arrayList = new ArrayList();
        this.items = arrayList;
        this.evaluateRewardsPoints = Boolean.FALSE;
        arrayList.add(item);
    }

    @JvmStatic
    @NotNull
    public static final TrolleyUpdateData from(@NotNull TrolleyItem trolleyItem) {
        return INSTANCE.from(trolleyItem);
    }

    @JvmStatic
    @NotNull
    public static final TrolleyUpdateData fromProductTiles(@NotNull List<? extends ProductTileModel> list) {
        return INSTANCE.fromProductTiles(list);
    }

    public final Boolean getEvaluateRewardsPoints() {
        return this.evaluateRewardsPoints;
    }

    @NotNull
    public final List<TrolleyItem> getItems() {
        List<TrolleyItem> listUnmodifiableList = Collections.unmodifiableList(this.items);
        Intrinsics.g(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public final void setEvaluateRewardsPoints(Boolean bool) {
        this.evaluateRewardsPoints = bool;
    }

    @JvmStatic
    @NotNull
    public static final TrolleyUpdateData from(@NotNull List<TrolleyItem> list) {
        return INSTANCE.from(list);
    }

    public TrolleyUpdateData(@NotNull List<TrolleyItem> items) {
        Intrinsics.h(items, "items");
        this.items = new ArrayList();
        this.evaluateRewardsPoints = Boolean.FALSE;
        this.items = CollectionsKt.J0(items);
    }
}
