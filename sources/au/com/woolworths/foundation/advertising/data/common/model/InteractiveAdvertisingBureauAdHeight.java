package au.com.woolworths.foundation.advertising.data.common.model;

import au.com.woolworths.graphql.DefaultValue;
import au.com.woolworths.graphql.MappedValue;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardHeight;
import com.google.gson.annotations.SerializedName;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/foundation/advertising/data/common/model/InteractiveAdvertisingBureauAdHeight;", "Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardHeight;", "", "<init>", "(Ljava/lang/String;I)V", "STANDARD", "LARGE", "advertising-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class InteractiveAdvertisingBureauAdHeight implements DynamicSizeCardHeight {

    @DefaultValue
    @MappedValue
    @SerializedName("320x100")
    public static final InteractiveAdvertisingBureauAdHeight LARGE;

    @MappedValue
    @SerializedName("320x50")
    public static final InteractiveAdvertisingBureauAdHeight STANDARD;
    public static final /* synthetic */ InteractiveAdvertisingBureauAdHeight[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        InteractiveAdvertisingBureauAdHeight interactiveAdvertisingBureauAdHeight = new InteractiveAdvertisingBureauAdHeight() { // from class: au.com.woolworths.foundation.advertising.data.common.model.InteractiveAdvertisingBureauAdHeight.STANDARD
            public final int f = R.string.iab_banner_height_standard_ratio;
            public final float g = 6.4f;

            @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardHeight
            /* renamed from: a, reason: from getter */
            public final int getF() {
                return this.f;
            }

            @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardHeight
            /* renamed from: getAspectRatio, reason: from getter */
            public final float getG() {
                return this.g;
            }
        };
        STANDARD = interactiveAdvertisingBureauAdHeight;
        InteractiveAdvertisingBureauAdHeight interactiveAdvertisingBureauAdHeight2 = new InteractiveAdvertisingBureauAdHeight() { // from class: au.com.woolworths.foundation.advertising.data.common.model.InteractiveAdvertisingBureauAdHeight.LARGE
            public final int f = R.string.iab_banner_height_large_ratio;
            public final float g = 3.2f;

            @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardHeight
            /* renamed from: a, reason: from getter */
            public final int getF() {
                return this.f;
            }

            @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardHeight
            /* renamed from: getAspectRatio, reason: from getter */
            public final float getG() {
                return this.g;
            }
        };
        LARGE = interactiveAdvertisingBureauAdHeight2;
        InteractiveAdvertisingBureauAdHeight[] interactiveAdvertisingBureauAdHeightArr = {interactiveAdvertisingBureauAdHeight, interactiveAdvertisingBureauAdHeight2};
        d = interactiveAdvertisingBureauAdHeightArr;
        e = EnumEntriesKt.a(interactiveAdvertisingBureauAdHeightArr);
    }

    public /* synthetic */ InteractiveAdvertisingBureauAdHeight(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static InteractiveAdvertisingBureauAdHeight valueOf(String str) {
        return (InteractiveAdvertisingBureauAdHeight) Enum.valueOf(InteractiveAdvertisingBureauAdHeight.class, str);
    }

    public static InteractiveAdvertisingBureauAdHeight[] values() {
        return (InteractiveAdvertisingBureauAdHeight[]) d.clone();
    }

    private InteractiveAdvertisingBureauAdHeight(String str, int i) {
    }
}
